package com.example.filme.di;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MovieApplication_MembersInjector implements MembersInjector<MovieApplication> {
  private final Provider<FetchRemoteMoviesWorkerFactory> workerFactoryProvider;

  public MovieApplication_MembersInjector(
      Provider<FetchRemoteMoviesWorkerFactory> workerFactoryProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
  }

  public static MembersInjector<MovieApplication> create(
      Provider<FetchRemoteMoviesWorkerFactory> workerFactoryProvider) {
    return new MovieApplication_MembersInjector(workerFactoryProvider);
  }

  @Override
  public void injectMembers(MovieApplication instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.filme.di.MovieApplication.workerFactory")
  public static void injectWorkerFactory(MovieApplication instance,
      FetchRemoteMoviesWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }
}
