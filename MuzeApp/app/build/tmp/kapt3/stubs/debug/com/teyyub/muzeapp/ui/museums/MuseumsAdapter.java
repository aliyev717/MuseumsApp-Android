package com.teyyub.muzeapp.ui.museums;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/teyyub/muzeapp/ui/museums/MuseumsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/teyyub/muzeapp/data/model/Museum;", "Lcom/teyyub/muzeapp/ui/museums/MuseumsAdapter$MuseumViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MuseumViewHolder", "app_debug"})
public final class MuseumsAdapter extends androidx.recyclerview.widget.ListAdapter<com.teyyub.muzeapp.data.model.Museum, com.teyyub.muzeapp.ui.museums.MuseumsAdapter.MuseumViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.teyyub.muzeapp.data.model.Museum> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.teyyub.muzeapp.ui.museums.MuseumsAdapter.Companion Companion = null;
    
    public MuseumsAdapter() {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.teyyub.muzeapp.ui.museums.MuseumsAdapter.MuseumViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.teyyub.muzeapp.ui.museums.MuseumsAdapter.MuseumViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/teyyub/muzeapp/ui/museums/MuseumsAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/teyyub/muzeapp/data/model/Museum;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/teyyub/muzeapp/ui/museums/MuseumsAdapter$MuseumViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/teyyub/muzeapp/databinding/ItemMuseumBinding;", "(Lcom/teyyub/muzeapp/ui/museums/MuseumsAdapter;Lcom/teyyub/muzeapp/databinding/ItemMuseumBinding;)V", "bind", "", "museum", "Lcom/teyyub/muzeapp/data/model/Museum;", "app_debug"})
    public final class MuseumViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.teyyub.muzeapp.databinding.ItemMuseumBinding binding = null;
        
        public MuseumViewHolder(@org.jetbrains.annotations.NotNull()
        com.teyyub.muzeapp.databinding.ItemMuseumBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.teyyub.muzeapp.data.model.Museum museum) {
        }
    }
}