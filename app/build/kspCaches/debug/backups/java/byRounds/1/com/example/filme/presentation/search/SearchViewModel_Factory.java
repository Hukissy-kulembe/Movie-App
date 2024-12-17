package com.example.filme.presentation.search;

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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public SearchViewModel_Factory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<MovieRepository> movieRepositoryProvider) {
    return new SearchViewModel_Factory(movieRepositoryProvider);
  }

  public static SearchViewModel newInstance(MovieRepository movieRepository) {
    return new SearchViewModel(movieRepository);
  }
}
