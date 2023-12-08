// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alicloudproc20240104.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<CreateSourcingProjectResponse> createSourcingProject(CreateSourcingProjectRequest request);

    CompletableFuture<UpdateSourcingProjectResponse> updateSourcingProject(UpdateSourcingProjectRequest request);

}
