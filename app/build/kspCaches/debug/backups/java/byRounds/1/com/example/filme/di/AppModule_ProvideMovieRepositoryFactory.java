package com.example.filme.di;

import com.example.filme.domain.datasource.MovieLocalDataSource;
import com.example.filme.domain.datasource.MovieRemoteDataSource;
import com.example.filme.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideMovieRepositoryFactory implements Factory<MovieRepository> {
  private final Provider<MovieRemoteDataSource> movieRemoteDataSourceProvider;

  private final Provider<MovieLocalDataSource> movieLocalDataSourceProvider;

  public AppModule_ProvideMovieRepositoryFactory(
      Provider<MovieRemoteDataSource> movieRemoteDataSourceProvider,
      Provider<MovieLocalDataSource> movieLocalDataSourceProvider) {
    this.movieRemoteDataSourceProvider = movieRemoteDataSourceProvider;
    this.movieLocalDataSourceProvider = movieLocalDataSourceProvider;
  }

  @Override
  public MovieRepository get() {
    return provideMovieRepository(movieRemoteDataSourceProvider.get(), movieLocalDataSourceProvider.get());
  }

  public static AppModule_ProvideMovieRepositoryFactory create(
      Provider<MovieRemoteDataSource> movieRemoteDataSourceProvider,
      Provider<MovieLocalDataSource> movieLocalDataSourceProvider) {
    return new AppModule_ProvideMovieRepositoryFactory(movieRemoteDataSourceProvider, movieLocalDataSourceProvider);
  }

  public static MovieRepository provideMovieRepository(MovieRemoteDataSource movieRemoteDataSource,
      MovieLocalDataSource movieLocalDataSource) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMovieRepository(movieRemoteDataSource, movieLocalDataSource));
  }
}
