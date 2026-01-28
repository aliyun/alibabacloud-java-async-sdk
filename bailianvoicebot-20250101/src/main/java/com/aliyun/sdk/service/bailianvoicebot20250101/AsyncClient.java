// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailianvoicebot20250101.models.*;
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
     * @param request the request parameters of BridgeWebCall  BridgeWebCallRequest
     * @return BridgeWebCallResponse
     */
    CompletableFuture<BridgeWebCallResponse> bridgeWebCall(BridgeWebCallRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateApplicationVersion  CreateApplicationVersionRequest
     * @return CreateApplicationVersionResponse
     */
    CompletableFuture<CreateApplicationVersionResponse> createApplicationVersion(CreateApplicationVersionRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of PublishApplicationVersion  PublishApplicationVersionRequest
     * @return PublishApplicationVersionResponse
     */
    CompletableFuture<PublishApplicationVersionResponse> publishApplicationVersion(PublishApplicationVersionRequest request);

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    /**
     * @param request the request parameters of UpdateApplicationVersion  UpdateApplicationVersionRequest
     * @return UpdateApplicationVersionResponse
     */
    CompletableFuture<UpdateApplicationVersionResponse> updateApplicationVersion(UpdateApplicationVersionRequest request);

}
