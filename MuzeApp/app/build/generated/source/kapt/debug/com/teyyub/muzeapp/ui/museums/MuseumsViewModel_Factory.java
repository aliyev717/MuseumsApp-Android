package com.teyyub.muzeapp.ui.museums;

import com.teyyub.muzeapp.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class MuseumsViewModel_Factory implements Factory<MuseumsViewModel> {
  private final Provider<ApiService> apiServiceProvider;

  public MuseumsViewModel_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public MuseumsViewModel get() {
    return newInstance(apiServiceProvider.get());
  }

  public static MuseumsViewModel_Factory create(Provider<ApiService> apiServiceProvider) {
    return new MuseumsViewModel_Factory(apiServiceProvider);
  }

  public static MuseumsViewModel newInstance(ApiService apiService) {
    return new MuseumsViewModel(apiService);
  }
}
