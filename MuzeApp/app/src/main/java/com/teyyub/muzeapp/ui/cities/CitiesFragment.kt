package com.teyyub.muzeapp.ui.cities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import com.teyyub.muzeapp.databinding.FragmentCitiesBinding

@AndroidEntryPoint
class CitiesFragment : Fragment() {

    private var _binding: FragmentCitiesBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CitiesViewModel by viewModels()
    private lateinit var adapter: CitiesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCitiesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = CitiesAdapter { city ->
            val action = CitiesFragmentDirections
                .actionCitiesFragmentToMuseumsFragment(city.slug, city.name)
            findNavController().navigate(action)
        }

        binding.rvCities.layoutManager = LinearLayoutManager(requireContext())
        binding.rvCities.adapter = adapter

        viewModel.cities.observe(viewLifecycleOwner) { cities ->
            adapter.submitList(cities)
        }

        viewModel.isLoading.observe(viewLifecycleOwner) { loading ->
            binding.progressBar.visibility = if (loading) View.VISIBLE else View.GONE
        }

        viewModel.error.observe(viewLifecycleOwner) { message ->
            message?.let { Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show() }
        }

        viewModel.loadCities()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
