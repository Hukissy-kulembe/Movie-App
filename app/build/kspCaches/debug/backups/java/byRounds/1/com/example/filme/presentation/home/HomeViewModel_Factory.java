package com.example.filme.presentation.home;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public HomeViewModel_Factory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<MovieRepository> movieRepositoryProvider) {
    return new HomeViewModel_Factory(movieRepositoryProvider);
  }

  public static HomeViewModel newInstance(MovieRepository movieRepository) {
    return new HomeViewModel(movieRepository);
  }
}
