// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cms20240330.models.*;
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
     * @param request the request parameters of CreateEntityStore  CreateEntityStoreRequest
     * @return CreateEntityStoreResponse
     */
    CompletableFuture<CreateEntityStoreResponse> createEntityStore(CreateEntityStoreRequest request);

    /**
     * @param request the request parameters of CreatePrometheusInstance  CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    CompletableFuture<CreatePrometheusInstanceResponse> createPrometheusInstance(CreatePrometheusInstanceRequest request);

    /**
     * @param request the request parameters of CreateUmodel  CreateUmodelRequest
     * @return CreateUmodelResponse
     */
    CompletableFuture<CreateUmodelResponse> createUmodel(CreateUmodelRequest request);

    /**
     * @param request the request parameters of DeleteEntityStore  DeleteEntityStoreRequest
     * @return DeleteEntityStoreResponse
     */
    CompletableFuture<DeleteEntityStoreResponse> deleteEntityStore(DeleteEntityStoreRequest request);

    /**
     * @param request the request parameters of DeleteUmodel  DeleteUmodelRequest
     * @return DeleteUmodelResponse
     */
    CompletableFuture<DeleteUmodelResponse> deleteUmodel(DeleteUmodelRequest request);

    /**
     * @param request the request parameters of DeleteUmodelData  DeleteUmodelDataRequest
     * @return DeleteUmodelDataResponse
     */
    CompletableFuture<DeleteUmodelDataResponse> deleteUmodelData(DeleteUmodelDataRequest request);

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * @param request the request parameters of GetEntityStore  GetEntityStoreRequest
     * @return GetEntityStoreResponse
     */
    CompletableFuture<GetEntityStoreResponse> getEntityStore(GetEntityStoreRequest request);

    /**
     * @param request the request parameters of GetEntityStoreData  GetEntityStoreDataRequest
     * @return GetEntityStoreDataResponse
     */
    CompletableFuture<GetEntityStoreDataResponse> getEntityStoreData(GetEntityStoreDataRequest request);

    /**
     * @param request the request parameters of GetUmodel  GetUmodelRequest
     * @return GetUmodelResponse
     */
    CompletableFuture<GetUmodelResponse> getUmodel(GetUmodelRequest request);

    /**
     * @param request the request parameters of GetUmodelData  GetUmodelDataRequest
     * @return GetUmodelDataResponse
     */
    CompletableFuture<GetUmodelDataResponse> getUmodelData(GetUmodelDataRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * @param request the request parameters of ListAlertActions  ListAlertActionsRequest
     * @return ListAlertActionsResponse
     */
    CompletableFuture<ListAlertActionsResponse> listAlertActions(ListAlertActionsRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of PutWorkspace  PutWorkspaceRequest
     * @return PutWorkspaceResponse
     */
    CompletableFuture<PutWorkspaceResponse> putWorkspace(PutWorkspaceRequest request);

    /**
     * @param request the request parameters of UpdateUmodel  UpdateUmodelRequest
     * @return UpdateUmodelResponse
     */
    CompletableFuture<UpdateUmodelResponse> updateUmodel(UpdateUmodelRequest request);

    /**
     * @param request the request parameters of UpsertUmodelData  UpsertUmodelDataRequest
     * @return UpsertUmodelDataResponse
     */
    CompletableFuture<UpsertUmodelDataResponse> upsertUmodelData(UpsertUmodelDataRequest request);

}
