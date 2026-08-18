package com.teyyub.muzeapp.ui.museums

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import com.teyyub.muzeapp.databinding.FragmentMuseumsBinding

@AndroidEntryPoint
class MuseumsFragment : Fragment() {

    private var _binding: FragmentMuseumsBinding? = null
    private val binding get() = _binding!!

    private val args: MuseumsFragmentArgs by navArgs()
    private val viewModel: MuseumsViewModel by viewModels()
    private lateinit var adapter: MuseumsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMuseumsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = args.cityName

        adapter = MuseumsAdapter()
        binding.rvMuseums.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMuseums.adapter = adapter

        viewModel.museums.observe(viewLifecycleOwner) { museums ->
            adapter.submitList(museums)
            binding.tvEmpty.visibility = if (museums.isEmpty()) View.VISIBLE else View.GONE
        }

        viewModel.isLoading.observe(viewLifecycleOwner) { loading ->
            binding.progressBar.visibility = if (loading) View.VISIBLE else View.GONE
        }

        viewModel.error.observe(viewLifecycleOwner) { message ->
            message?.let { Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show() }
        }

        viewModel.loadMuseums(args.citySlug)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
