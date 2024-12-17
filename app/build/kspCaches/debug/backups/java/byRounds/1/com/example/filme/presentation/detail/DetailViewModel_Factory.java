package com.example.filme.presentation.detail;

import androidx.lifecycle.SavedStateHandle;
import com.example.filme.domain.repository.MovieRepository;
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
    "KotlinInternalInJava"
})
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandlerProvider;

  public DetailViewModel_Factory(Provider<MovieRepository> movieRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandlerProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
    this.savedStateHandlerProvider = savedStateHandlerProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(movieRepositoryProvider.get(), savedStateHandlerProvider.get());
  }

  public static DetailViewModel_Factory create(Provider<MovieRepository> movieRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandlerProvider) {
    return new DetailViewModel_Factory(movieRepositoryProvider, savedStateHandlerProvider);
  }

  public static DetailViewModel newInstance(MovieRepository movieRepository,
      SavedStateHandle savedStateHandler) {
    return new DetailViewModel(movieRepository, savedStateHandler);
  }
}
