package com.teyyub.muzeapp.ui.cities;

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
public final class CitiesViewModel_Factory implements Factory<CitiesViewModel> {
  private final Provider<ApiService> apiServiceProvider;

  public CitiesViewModel_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public CitiesViewModel get() {
    return newInstance(apiServiceProvider.get());
  }

  public static CitiesViewModel_Factory create(Provider<ApiService> apiServiceProvider) {
    return new CitiesViewModel_Factory(apiServiceProvider);
  }

  public static CitiesViewModel newInstance(ApiService apiService) {
    return new CitiesViewModel(apiService);
  }
}
