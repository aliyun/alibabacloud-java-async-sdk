// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataanalysisgbi20240823.models.*;
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
     * @param request the request parameters of CancelDatasourceAuthorization  CancelDatasourceAuthorizationRequest
     * @return CancelDatasourceAuthorizationResponse
     */
    CompletableFuture<CancelDatasourceAuthorizationResponse> cancelDatasourceAuthorization(CancelDatasourceAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateDatasourceAuthorization  CreateDatasourceAuthorizationRequest
     * @return CreateDatasourceAuthorizationResponse
     */
    CompletableFuture<CreateDatasourceAuthorizationResponse> createDatasourceAuthorization(CreateDatasourceAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateVirtualDatasourceInstance  CreateVirtualDatasourceInstanceRequest
     * @return CreateVirtualDatasourceInstanceResponse
     */
    CompletableFuture<CreateVirtualDatasourceInstanceResponse> createVirtualDatasourceInstance(CreateVirtualDatasourceInstanceRequest request);

    /**
     * @param request the request parameters of DeleteVirtualDatasourceInstance  DeleteVirtualDatasourceInstanceRequest
     * @return DeleteVirtualDatasourceInstanceResponse
     */
    CompletableFuture<DeleteVirtualDatasourceInstanceResponse> deleteVirtualDatasourceInstance(DeleteVirtualDatasourceInstanceRequest request);

    /**
     * @param request the request parameters of ListVirtualDatasourceInstance  ListVirtualDatasourceInstanceRequest
     * @return ListVirtualDatasourceInstanceResponse
     */
    CompletableFuture<ListVirtualDatasourceInstanceResponse> listVirtualDatasourceInstance(ListVirtualDatasourceInstanceRequest request);

    /**
     * @param request the request parameters of RunDataAnalysis  RunDataAnalysisRequest
     * @return RunDataAnalysisResponse
     */
    CompletableFuture<RunDataAnalysisResponse> runDataAnalysis(RunDataAnalysisRequest request);

    ResponseIterable<RunDataAnalysisResponseBody> runDataAnalysisWithResponseIterable(RunDataAnalysisRequest request);

    /**
     * @param request the request parameters of SaveVirtualDatasourceDdl  SaveVirtualDatasourceDdlRequest
     * @return SaveVirtualDatasourceDdlResponse
     */
    CompletableFuture<SaveVirtualDatasourceDdlResponse> saveVirtualDatasourceDdl(SaveVirtualDatasourceDdlRequest request);

    /**
     * @param request the request parameters of SyncRemoteTables  SyncRemoteTablesRequest
     * @return SyncRemoteTablesResponse
     */
    CompletableFuture<SyncRemoteTablesResponse> syncRemoteTables(SyncRemoteTablesRequest request);

    /**
     * @param request the request parameters of UpdateVirtualDatasourceInstance  UpdateVirtualDatasourceInstanceRequest
     * @return UpdateVirtualDatasourceInstanceResponse
     */
    CompletableFuture<UpdateVirtualDatasourceInstanceResponse> updateVirtualDatasourceInstance(UpdateVirtualDatasourceInstanceRequest request);

}
