package com.example.filme.di;

import com.example.filme.data.remote.MovieApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideApiServiceFactory implements Factory<MovieApiService> {
  @Override
  public MovieApiService get() {
    return provideApiService();
  }

  public static AppModule_ProvideApiServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MovieApiService provideApiService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApiServiceFactory INSTANCE = new AppModule_ProvideApiServiceFactory();
  }
}
