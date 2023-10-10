// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.grace20220606.models.*;
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

    CompletableFuture<AnalyzeFileResponse> analyzeFile(AnalyzeFileRequest request);

    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    CompletableFuture<UploadFileByOSSResponse> uploadFileByOSS(UploadFileByOSSRequest request);

    CompletableFuture<UploadFileByURLResponse> uploadFileByURL(UploadFileByURLRequest request);

}
