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
     * @param request the request parameters of BatchDeleteSynonyms  BatchDeleteSynonymsRequest
     * @return BatchDeleteSynonymsResponse
     */
    CompletableFuture<BatchDeleteSynonymsResponse> batchDeleteSynonyms(BatchDeleteSynonymsRequest request);

    /**
     * @param request the request parameters of CancelDatasourceAuthorization  CancelDatasourceAuthorizationRequest
     * @return CancelDatasourceAuthorizationResponse
     */
    CompletableFuture<CancelDatasourceAuthorizationResponse> cancelDatasourceAuthorization(CancelDatasourceAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateBusinessLogic  CreateBusinessLogicRequest
     * @return CreateBusinessLogicResponse
     */
    CompletableFuture<CreateBusinessLogicResponse> createBusinessLogic(CreateBusinessLogicRequest request);

    /**
     * @param request the request parameters of CreateDatasourceAuthorization  CreateDatasourceAuthorizationRequest
     * @return CreateDatasourceAuthorizationResponse
     */
    CompletableFuture<CreateDatasourceAuthorizationResponse> createDatasourceAuthorization(CreateDatasourceAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateSynonyms  CreateSynonymsRequest
     * @return CreateSynonymsResponse
     */
    CompletableFuture<CreateSynonymsResponse> createSynonyms(CreateSynonymsRequest request);

    /**
     * @param request the request parameters of CreateVirtualDatasourceInstance  CreateVirtualDatasourceInstanceRequest
     * @return CreateVirtualDatasourceInstanceResponse
     */
    CompletableFuture<CreateVirtualDatasourceInstanceResponse> createVirtualDatasourceInstance(CreateVirtualDatasourceInstanceRequest request);

    /**
     * @param request the request parameters of DeleteBusinessLogic  DeleteBusinessLogicRequest
     * @return DeleteBusinessLogicResponse
     */
    CompletableFuture<DeleteBusinessLogicResponse> deleteBusinessLogic(DeleteBusinessLogicRequest request);

    /**
     * @param request the request parameters of DeleteColumn  DeleteColumnRequest
     * @return DeleteColumnResponse
     */
    CompletableFuture<DeleteColumnResponse> deleteColumn(DeleteColumnRequest request);

    /**
     * @param request the request parameters of DeleteSelectedTable  DeleteSelectedTableRequest
     * @return DeleteSelectedTableResponse
     */
    CompletableFuture<DeleteSelectedTableResponse> deleteSelectedTable(DeleteSelectedTableRequest request);

    /**
     * @param request the request parameters of DeleteVirtualDatasourceInstance  DeleteVirtualDatasourceInstanceRequest
     * @return DeleteVirtualDatasourceInstanceResponse
     */
    CompletableFuture<DeleteVirtualDatasourceInstanceResponse> deleteVirtualDatasourceInstance(DeleteVirtualDatasourceInstanceRequest request);

    /**
     * @param request the request parameters of ListBusinessLogic  ListBusinessLogicRequest
     * @return ListBusinessLogicResponse
     */
    CompletableFuture<ListBusinessLogicResponse> listBusinessLogic(ListBusinessLogicRequest request);

    /**
     * @param request the request parameters of ListColumn  ListColumnRequest
     * @return ListColumnResponse
     */
    CompletableFuture<ListColumnResponse> listColumn(ListColumnRequest request);

    /**
     * @param request the request parameters of ListEnumMapping  ListEnumMappingRequest
     * @return ListEnumMappingResponse
     */
    CompletableFuture<ListEnumMappingResponse> listEnumMapping(ListEnumMappingRequest request);

    /**
     * @param request the request parameters of ListSelectedTables  ListSelectedTablesRequest
     * @return ListSelectedTablesResponse
     */
    CompletableFuture<ListSelectedTablesResponse> listSelectedTables(ListSelectedTablesRequest request);

    /**
     * @param request the request parameters of ListSynonyms  ListSynonymsRequest
     * @return ListSynonymsResponse
     */
    CompletableFuture<ListSynonymsResponse> listSynonyms(ListSynonymsRequest request);

    /**
     * @param request the request parameters of ListVirtualDatasourceInstance  ListVirtualDatasourceInstanceRequest
     * @return ListVirtualDatasourceInstanceResponse
     */
    CompletableFuture<ListVirtualDatasourceInstanceResponse> listVirtualDatasourceInstance(ListVirtualDatasourceInstanceRequest request);

    /**
     * @param request the request parameters of RecoverColumn  RecoverColumnRequest
     * @return RecoverColumnResponse
     */
    CompletableFuture<RecoverColumnResponse> recoverColumn(RecoverColumnRequest request);

    /**
     * @param request the request parameters of ResyncTable  ResyncTableRequest
     * @return ResyncTableResponse
     */
    CompletableFuture<ResyncTableResponse> resyncTable(ResyncTableRequest request);

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
     * @param request the request parameters of UpdateBusinessLogic  UpdateBusinessLogicRequest
     * @return UpdateBusinessLogicResponse
     */
    CompletableFuture<UpdateBusinessLogicResponse> updateBusinessLogic(UpdateBusinessLogicRequest request);

    /**
     * @param request the request parameters of UpdateColumn  UpdateColumnRequest
     * @return UpdateColumnResponse
     */
    CompletableFuture<UpdateColumnResponse> updateColumn(UpdateColumnRequest request);

    /**
     * @param request the request parameters of UpdateEnumMapping  UpdateEnumMappingRequest
     * @return UpdateEnumMappingResponse
     */
    CompletableFuture<UpdateEnumMappingResponse> updateEnumMapping(UpdateEnumMappingRequest request);

    /**
     * @param request the request parameters of UpdateSynonyms  UpdateSynonymsRequest
     * @return UpdateSynonymsResponse
     */
    CompletableFuture<UpdateSynonymsResponse> updateSynonyms(UpdateSynonymsRequest request);

    /**
     * @param request the request parameters of UpdateTableInfo  UpdateTableInfoRequest
     * @return UpdateTableInfoResponse
     */
    CompletableFuture<UpdateTableInfoResponse> updateTableInfo(UpdateTableInfoRequest request);

    /**
     * @param request the request parameters of UpdateVirtualDatasourceInstance  UpdateVirtualDatasourceInstanceRequest
     * @return UpdateVirtualDatasourceInstanceResponse
     */
    CompletableFuture<UpdateVirtualDatasourceInstanceResponse> updateVirtualDatasourceInstance(UpdateVirtualDatasourceInstanceRequest request);

}
