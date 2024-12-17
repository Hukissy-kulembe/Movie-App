package com.example.filme.data.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.example.filme.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
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
public final class SyncDatabaseWorker_Factory {
  public SyncDatabaseWorker_Factory() {
  }

  public SyncDatabaseWorker get(MovieRepository movieRepository, Context ctx,
      WorkerParameters params) {
    return newInstance(movieRepository, ctx, params);
  }

  public static SyncDatabaseWorker_Factory create() {
    return new SyncDatabaseWorker_Factory();
  }

  public static SyncDatabaseWorker newInstance(MovieRepository movieRepository, Context ctx,
      WorkerParameters params) {
    return new SyncDatabaseWorker(movieRepository, ctx, params);
  }
}
