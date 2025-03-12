// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20250301;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.intelligentcreation20250301.models.*;
import darabonba.core.*;
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

    /**
     * @param request the request parameters of CreateLabelTask  CreateLabelTaskRequest
     * @return CreateLabelTaskResponse
     */
    CompletableFuture<CreateLabelTaskResponse> createLabelTask(CreateLabelTaskRequest request);

    /**
     * @param request the request parameters of CreateOssUploadToken  CreateOssUploadTokenRequest
     * @return CreateOssUploadTokenResponse
     */
    CompletableFuture<CreateOssUploadTokenResponse> createOssUploadToken(CreateOssUploadTokenRequest request);

    /**
     * @param request the request parameters of CreateTextLabel  CreateTextLabelRequest
     * @return CreateTextLabelResponse
     */
    CompletableFuture<CreateTextLabelResponse> createTextLabel(CreateTextLabelRequest request);

    /**
     * @param request the request parameters of GetLabelTaskResult  GetLabelTaskResultRequest
     * @return GetLabelTaskResultResponse
     */
    CompletableFuture<GetLabelTaskResultResponse> getLabelTaskResult(GetLabelTaskResultRequest request);

}
