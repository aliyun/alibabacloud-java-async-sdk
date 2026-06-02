// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dms20250414.models.*;
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
     * @param request the request parameters of AddUserToDataAgentWorkspace  AddUserToDataAgentWorkspaceRequest
     * @return AddUserToDataAgentWorkspaceResponse
     */
    CompletableFuture<AddUserToDataAgentWorkspaceResponse> addUserToDataAgentWorkspace(AddUserToDataAgentWorkspaceRequest request);

    /**
     * @param request the request parameters of BatchCreateDataLakePartitions  BatchCreateDataLakePartitionsRequest
     * @return BatchCreateDataLakePartitionsResponse
     */
    CompletableFuture<BatchCreateDataLakePartitionsResponse> batchCreateDataLakePartitions(BatchCreateDataLakePartitionsRequest request);

    /**
     * @param request the request parameters of BatchDeleteDataLakePartitions  BatchDeleteDataLakePartitionsRequest
     * @return BatchDeleteDataLakePartitionsResponse
     */
    CompletableFuture<BatchDeleteDataLakePartitionsResponse> batchDeleteDataLakePartitions(BatchDeleteDataLakePartitionsRequest request);

    /**
     * @param request the request parameters of BatchUpdateDataLakePartitions  BatchUpdateDataLakePartitionsRequest
     * @return BatchUpdateDataLakePartitionsResponse
     */
    CompletableFuture<BatchUpdateDataLakePartitionsResponse> batchUpdateDataLakePartitions(BatchUpdateDataLakePartitionsRequest request);

    /**
     * @param request the request parameters of ConfigAirflow  ConfigAirflowRequest
     * @return ConfigAirflowResponse
     */
    CompletableFuture<ConfigAirflowResponse> configAirflow(ConfigAirflowRequest request);

    /**
     * @param request the request parameters of CreateAirflow  CreateAirflowRequest
     * @return CreateAirflowResponse
     */
    CompletableFuture<CreateAirflowResponse> createAirflow(CreateAirflowRequest request);

    /**
     * @param request the request parameters of CreateAirflowLoginToken  CreateAirflowLoginTokenRequest
     * @return CreateAirflowLoginTokenResponse
     */
    CompletableFuture<CreateAirflowLoginTokenResponse> createAirflowLoginToken(CreateAirflowLoginTokenRequest request);

    /**
     * @param request the request parameters of CreateCustomAgent  CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    CompletableFuture<CreateCustomAgentResponse> createCustomAgent(CreateCustomAgentRequest request);

    /**
     * @param request the request parameters of CreateDataAgentKnowledgeBase  CreateDataAgentKnowledgeBaseRequest
     * @return CreateDataAgentKnowledgeBaseResponse
     */
    CompletableFuture<CreateDataAgentKnowledgeBaseResponse> createDataAgentKnowledgeBase(CreateDataAgentKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of CreateDataAgentSession  CreateDataAgentSessionRequest
     * @return CreateDataAgentSessionResponse
     */
    CompletableFuture<CreateDataAgentSessionResponse> createDataAgentSession(CreateDataAgentSessionRequest request);

    /**
     * @param request the request parameters of CreateDataAgentWorkspace  CreateDataAgentWorkspaceRequest
     * @return CreateDataAgentWorkspaceResponse
     */
    CompletableFuture<CreateDataAgentWorkspaceResponse> createDataAgentWorkspace(CreateDataAgentWorkspaceRequest request);

    /**
     * @param request the request parameters of CreateDataLakeDatabase  CreateDataLakeDatabaseRequest
     * @return CreateDataLakeDatabaseResponse
     */
    CompletableFuture<CreateDataLakeDatabaseResponse> createDataLakeDatabase(CreateDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of CreateDataLakeFunction  CreateDataLakeFunctionRequest
     * @return CreateDataLakeFunctionResponse
     */
    CompletableFuture<CreateDataLakeFunctionResponse> createDataLakeFunction(CreateDataLakeFunctionRequest request);

    /**
     * @param request the request parameters of CreateDataLakePartition  CreateDataLakePartitionRequest
     * @return CreateDataLakePartitionResponse
     */
    CompletableFuture<CreateDataLakePartitionResponse> createDataLakePartition(CreateDataLakePartitionRequest request);

    /**
     * @param request the request parameters of CreateDataLakeTable  CreateDataLakeTableRequest
     * @return CreateDataLakeTableResponse
     */
    CompletableFuture<CreateDataLakeTableResponse> createDataLakeTable(CreateDataLakeTableRequest request);

    /**
     * @param request the request parameters of DeleteAirflow  DeleteAirflowRequest
     * @return DeleteAirflowResponse
     */
    CompletableFuture<DeleteAirflowResponse> deleteAirflow(DeleteAirflowRequest request);

    /**
     * @param request the request parameters of DeleteCustomAgent  DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    CompletableFuture<DeleteCustomAgentResponse> deleteCustomAgent(DeleteCustomAgentRequest request);

    /**
     * @param request the request parameters of DeleteDataAgentKnowledgeBase  DeleteDataAgentKnowledgeBaseRequest
     * @return DeleteDataAgentKnowledgeBaseResponse
     */
    CompletableFuture<DeleteDataAgentKnowledgeBaseResponse> deleteDataAgentKnowledgeBase(DeleteDataAgentKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of DeleteDataAgentWorkspace  DeleteDataAgentWorkspaceRequest
     * @return DeleteDataAgentWorkspaceResponse
     */
    CompletableFuture<DeleteDataAgentWorkspaceResponse> deleteDataAgentWorkspace(DeleteDataAgentWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteDataLakeDatabase  DeleteDataLakeDatabaseRequest
     * @return DeleteDataLakeDatabaseResponse
     */
    CompletableFuture<DeleteDataLakeDatabaseResponse> deleteDataLakeDatabase(DeleteDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of DeleteDataLakeFunction  DeleteDataLakeFunctionRequest
     * @return DeleteDataLakeFunctionResponse
     */
    CompletableFuture<DeleteDataLakeFunctionResponse> deleteDataLakeFunction(DeleteDataLakeFunctionRequest request);

    /**
     * @param request the request parameters of DeleteDataLakePartition  DeleteDataLakePartitionRequest
     * @return DeleteDataLakePartitionResponse
     */
    CompletableFuture<DeleteDataLakePartitionResponse> deleteDataLakePartition(DeleteDataLakePartitionRequest request);

    /**
     * @param request the request parameters of DeleteDataLakeTable  DeleteDataLakeTableRequest
     * @return DeleteDataLakeTableResponse
     */
    CompletableFuture<DeleteDataLakeTableResponse> deleteDataLakeTable(DeleteDataLakeTableRequest request);

    /**
     * @param request the request parameters of DeleteDocument  DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    /**
     * @param request the request parameters of DeleteDocumentChunks  DeleteDocumentChunksRequest
     * @return DeleteDocumentChunksResponse
     */
    CompletableFuture<DeleteDocumentChunksResponse> deleteDocumentChunks(DeleteDocumentChunksRequest request);

    /**
     * @param request the request parameters of DeleteFileUpload  DeleteFileUploadRequest
     * @return DeleteFileUploadResponse
     */
    CompletableFuture<DeleteFileUploadResponse> deleteFileUpload(DeleteFileUploadRequest request);

    /**
     * @param request the request parameters of DeleteWorkspaceCode  DeleteWorkspaceCodeRequest
     * @return DeleteWorkspaceCodeResponse
     */
    CompletableFuture<DeleteWorkspaceCodeResponse> deleteWorkspaceCode(DeleteWorkspaceCodeRequest request);

    /**
     * @param request the request parameters of DescribeCustomAgent  DescribeCustomAgentRequest
     * @return DescribeCustomAgentResponse
     */
    CompletableFuture<DescribeCustomAgentResponse> describeCustomAgent(DescribeCustomAgentRequest request);

    /**
     * @param request the request parameters of DescribeDataAgentSession  DescribeDataAgentSessionRequest
     * @return DescribeDataAgentSessionResponse
     */
    CompletableFuture<DescribeDataAgentSessionResponse> describeDataAgentSession(DescribeDataAgentSessionRequest request);

    /**
     * @param request the request parameters of DescribeDocument  DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    CompletableFuture<DescribeDocumentResponse> describeDocument(DescribeDocumentRequest request);

    /**
     * @param request the request parameters of DescribeFileUploadSignature  DescribeFileUploadSignatureRequest
     * @return DescribeFileUploadSignatureResponse
     */
    CompletableFuture<DescribeFileUploadSignatureResponse> describeFileUploadSignature(DescribeFileUploadSignatureRequest request);

    /**
     * @param request the request parameters of DescribeKnowledgeBaseStats  DescribeKnowledgeBaseStatsRequest
     * @return DescribeKnowledgeBaseStatsResponse
     */
    CompletableFuture<DescribeKnowledgeBaseStatsResponse> describeKnowledgeBaseStats(DescribeKnowledgeBaseStatsRequest request);

    /**
     * @param request the request parameters of DescribeKnowledgeBaseUploadSignature  DescribeKnowledgeBaseUploadSignatureRequest
     * @return DescribeKnowledgeBaseUploadSignatureResponse
     */
    CompletableFuture<DescribeKnowledgeBaseUploadSignatureResponse> describeKnowledgeBaseUploadSignature(DescribeKnowledgeBaseUploadSignatureRequest request);

    /**
     * @param request the request parameters of FileUploadCallback  FileUploadCallbackRequest
     * @return FileUploadCallbackResponse
     */
    CompletableFuture<FileUploadCallbackResponse> fileUploadCallback(FileUploadCallbackRequest request);

    /**
     * @param request the request parameters of GetAirflow  GetAirflowRequest
     * @return GetAirflowResponse
     */
    CompletableFuture<GetAirflowResponse> getAirflow(GetAirflowRequest request);

    /**
     * @param request the request parameters of GetChatContent  GetChatContentRequest
     * @return GetChatContentResponse
     */
    CompletableFuture<GetChatContentResponse> getChatContent(GetChatContentRequest request);

    ResponseIterable<GetChatContentResponseBody> getChatContentWithResponseIterable(GetChatContentRequest request);

    /**
     * @param request the request parameters of GetDataAgentSubAccountInfo  GetDataAgentSubAccountInfoRequest
     * @return GetDataAgentSubAccountInfoResponse
     */
    CompletableFuture<GetDataAgentSubAccountInfoResponse> getDataAgentSubAccountInfo(GetDataAgentSubAccountInfoRequest request);

    /**
     * @param request the request parameters of GetDataAgentWorkspaceInfo  GetDataAgentWorkspaceInfoRequest
     * @return GetDataAgentWorkspaceInfoResponse
     */
    CompletableFuture<GetDataAgentWorkspaceInfoResponse> getDataAgentWorkspaceInfo(GetDataAgentWorkspaceInfoRequest request);

    /**
     * @param request the request parameters of GetDataLakeCatalog  GetDataLakeCatalogRequest
     * @return GetDataLakeCatalogResponse
     */
    CompletableFuture<GetDataLakeCatalogResponse> getDataLakeCatalog(GetDataLakeCatalogRequest request);

    /**
     * @param request the request parameters of GetDataLakeDatabase  GetDataLakeDatabaseRequest
     * @return GetDataLakeDatabaseResponse
     */
    CompletableFuture<GetDataLakeDatabaseResponse> getDataLakeDatabase(GetDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of GetDataLakeFunction  GetDataLakeFunctionRequest
     * @return GetDataLakeFunctionResponse
     */
    CompletableFuture<GetDataLakeFunctionResponse> getDataLakeFunction(GetDataLakeFunctionRequest request);

    /**
     * @param request the request parameters of GetDataLakePartition  GetDataLakePartitionRequest
     * @return GetDataLakePartitionResponse
     */
    CompletableFuture<GetDataLakePartitionResponse> getDataLakePartition(GetDataLakePartitionRequest request);

    /**
     * @param request the request parameters of GetDataLakeTable  GetDataLakeTableRequest
     * @return GetDataLakeTableResponse
     */
    CompletableFuture<GetDataLakeTableResponse> getDataLakeTable(GetDataLakeTableRequest request);

    /**
     * @param request the request parameters of GetNotebookAndSubmitTask  GetNotebookAndSubmitTaskRequest
     * @return GetNotebookAndSubmitTaskResponse
     */
    CompletableFuture<GetNotebookAndSubmitTaskResponse> getNotebookAndSubmitTask(GetNotebookAndSubmitTaskRequest request);

    /**
     * @param request the request parameters of GetNotebookTaskStatus  GetNotebookTaskStatusRequest
     * @return GetNotebookTaskStatusResponse
     */
    CompletableFuture<GetNotebookTaskStatusResponse> getNotebookTaskStatus(GetNotebookTaskStatusRequest request);

    /**
     * @param request the request parameters of GetWorkspaceCode  GetWorkspaceCodeRequest
     * @return GetWorkspaceCodeResponse
     */
    CompletableFuture<GetWorkspaceCodeResponse> getWorkspaceCode(GetWorkspaceCodeRequest request);

    /**
     * @param request the request parameters of GetWorkspaceCodePublishSetting  GetWorkspaceCodePublishSettingRequest
     * @return GetWorkspaceCodePublishSettingResponse
     */
    CompletableFuture<GetWorkspaceCodePublishSettingResponse> getWorkspaceCodePublishSetting(GetWorkspaceCodePublishSettingRequest request);

    /**
     * @param request the request parameters of GetWorkspaceQuota  GetWorkspaceQuotaRequest
     * @return GetWorkspaceQuotaResponse
     */
    CompletableFuture<GetWorkspaceQuotaResponse> getWorkspaceQuota(GetWorkspaceQuotaRequest request);

    /**
     * @param request the request parameters of ListAirflowVersions  ListAirflowVersionsRequest
     * @return ListAirflowVersionsResponse
     */
    CompletableFuture<ListAirflowVersionsResponse> listAirflowVersions(ListAirflowVersionsRequest request);

    /**
     * @param request the request parameters of ListAirflows  ListAirflowsRequest
     * @return ListAirflowsResponse
     */
    CompletableFuture<ListAirflowsResponse> listAirflows(ListAirflowsRequest request);

    /**
     * @param request the request parameters of ListCustomAgent  ListCustomAgentRequest
     * @return ListCustomAgentResponse
     */
    CompletableFuture<ListCustomAgentResponse> listCustomAgent(ListCustomAgentRequest request);

    /**
     * @param request the request parameters of ListDataAgentSession  ListDataAgentSessionRequest
     * @return ListDataAgentSessionResponse
     */
    CompletableFuture<ListDataAgentSessionResponse> listDataAgentSession(ListDataAgentSessionRequest request);

    /**
     * @param request the request parameters of ListDataAgentWorkspace  ListDataAgentWorkspaceRequest
     * @return ListDataAgentWorkspaceResponse
     */
    CompletableFuture<ListDataAgentWorkspaceResponse> listDataAgentWorkspace(ListDataAgentWorkspaceRequest request);

    /**
     * @param request the request parameters of ListDataAgentWorkspaceMember  ListDataAgentWorkspaceMemberRequest
     * @return ListDataAgentWorkspaceMemberResponse
     */
    CompletableFuture<ListDataAgentWorkspaceMemberResponse> listDataAgentWorkspaceMember(ListDataAgentWorkspaceMemberRequest request);

    /**
     * @param request the request parameters of ListDataCenterDatabase  ListDataCenterDatabaseRequest
     * @return ListDataCenterDatabaseResponse
     */
    CompletableFuture<ListDataCenterDatabaseResponse> listDataCenterDatabase(ListDataCenterDatabaseRequest request);

    /**
     * @param request the request parameters of ListDataCenterTable  ListDataCenterTableRequest
     * @return ListDataCenterTableResponse
     */
    CompletableFuture<ListDataCenterTableResponse> listDataCenterTable(ListDataCenterTableRequest request);

    /**
     * @param request the request parameters of ListDataLakeCatalog  ListDataLakeCatalogRequest
     * @return ListDataLakeCatalogResponse
     */
    CompletableFuture<ListDataLakeCatalogResponse> listDataLakeCatalog(ListDataLakeCatalogRequest request);

    /**
     * @param request the request parameters of ListDataLakeDatabase  ListDataLakeDatabaseRequest
     * @return ListDataLakeDatabaseResponse
     */
    CompletableFuture<ListDataLakeDatabaseResponse> listDataLakeDatabase(ListDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of ListDataLakeFunction  ListDataLakeFunctionRequest
     * @return ListDataLakeFunctionResponse
     */
    CompletableFuture<ListDataLakeFunctionResponse> listDataLakeFunction(ListDataLakeFunctionRequest request);

    /**
     * @param request the request parameters of ListDataLakeFunctionName  ListDataLakeFunctionNameRequest
     * @return ListDataLakeFunctionNameResponse
     */
    CompletableFuture<ListDataLakeFunctionNameResponse> listDataLakeFunctionName(ListDataLakeFunctionNameRequest request);

    /**
     * @param request the request parameters of ListDataLakePartition  ListDataLakePartitionRequest
     * @return ListDataLakePartitionResponse
     */
    CompletableFuture<ListDataLakePartitionResponse> listDataLakePartition(ListDataLakePartitionRequest request);

    /**
     * @param request the request parameters of ListDataLakePartitionByFilter  ListDataLakePartitionByFilterRequest
     * @return ListDataLakePartitionByFilterResponse
     */
    CompletableFuture<ListDataLakePartitionByFilterResponse> listDataLakePartitionByFilter(ListDataLakePartitionByFilterRequest request);

    /**
     * @param request the request parameters of ListDataLakePartitionName  ListDataLakePartitionNameRequest
     * @return ListDataLakePartitionNameResponse
     */
    CompletableFuture<ListDataLakePartitionNameResponse> listDataLakePartitionName(ListDataLakePartitionNameRequest request);

    /**
     * @param request the request parameters of ListDataLakeTable  ListDataLakeTableRequest
     * @return ListDataLakeTableResponse
     */
    CompletableFuture<ListDataLakeTableResponse> listDataLakeTable(ListDataLakeTableRequest request);

    /**
     * @param request the request parameters of ListDataLakeTableName  ListDataLakeTableNameRequest
     * @return ListDataLakeTableNameResponse
     */
    CompletableFuture<ListDataLakeTableNameResponse> listDataLakeTableName(ListDataLakeTableNameRequest request);

    /**
     * @param request the request parameters of ListDataLakeTablebaseInfo  ListDataLakeTablebaseInfoRequest
     * @return ListDataLakeTablebaseInfoResponse
     */
    CompletableFuture<ListDataLakeTablebaseInfoResponse> listDataLakeTablebaseInfo(ListDataLakeTablebaseInfoRequest request);

    /**
     * @param request the request parameters of ListDocumentChunks  ListDocumentChunksRequest
     * @return ListDocumentChunksResponse
     */
    CompletableFuture<ListDocumentChunksResponse> listDocumentChunks(ListDocumentChunksRequest request);

    /**
     * @param request the request parameters of ListDocuments  ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request);

    /**
     * @param request the request parameters of ListFileUpload  ListFileUploadRequest
     * @return ListFileUploadResponse
     */
    CompletableFuture<ListFileUploadResponse> listFileUpload(ListFileUploadRequest request);

    /**
     * @param request the request parameters of ListKnowledgeBases  ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    CompletableFuture<ListKnowledgeBasesResponse> listKnowledgeBases(ListKnowledgeBasesRequest request);

    /**
     * @param request the request parameters of ListWorkspaceCode  ListWorkspaceCodeRequest
     * @return ListWorkspaceCodeResponse
     */
    CompletableFuture<ListWorkspaceCodeResponse> listWorkspaceCode(ListWorkspaceCodeRequest request);

    /**
     * @param request the request parameters of ModifyCustomAgent  ModifyCustomAgentRequest
     * @return ModifyCustomAgentResponse
     */
    CompletableFuture<ModifyCustomAgentResponse> modifyCustomAgent(ModifyCustomAgentRequest request);

    /**
     * @param request the request parameters of OperateCustomAgent  OperateCustomAgentRequest
     * @return OperateCustomAgentResponse
     */
    CompletableFuture<OperateCustomAgentResponse> operateCustomAgent(OperateCustomAgentRequest request);

    /**
     * @param request the request parameters of RedeployAirflow  RedeployAirflowRequest
     * @return RedeployAirflowResponse
     */
    CompletableFuture<RedeployAirflowResponse> redeployAirflow(RedeployAirflowRequest request);

    /**
     * @param request the request parameters of RemoveUserToDataAgentWorkspace  RemoveUserToDataAgentWorkspaceRequest
     * @return RemoveUserToDataAgentWorkspaceResponse
     */
    CompletableFuture<RemoveUserToDataAgentWorkspaceResponse> removeUserToDataAgentWorkspace(RemoveUserToDataAgentWorkspaceRequest request);

    /**
     * @param request the request parameters of SaveWorkspaceCode  SaveWorkspaceCodeRequest
     * @return SaveWorkspaceCodeResponse
     */
    CompletableFuture<SaveWorkspaceCodeResponse> saveWorkspaceCode(SaveWorkspaceCodeRequest request);

    /**
     * @param request the request parameters of SendChatMessage  SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    CompletableFuture<SendChatMessageResponse> sendChatMessage(SendChatMessageRequest request);

    /**
     * @param request the request parameters of SetWorkspaceCodePublishSetting  SetWorkspaceCodePublishSettingRequest
     * @return SetWorkspaceCodePublishSettingResponse
     */
    CompletableFuture<SetWorkspaceCodePublishSettingResponse> setWorkspaceCodePublishSetting(SetWorkspaceCodePublishSettingRequest request);

    /**
     * @param request the request parameters of SetWorkspaceQuota  SetWorkspaceQuotaRequest
     * @return SetWorkspaceQuotaResponse
     */
    CompletableFuture<SetWorkspaceQuotaResponse> setWorkspaceQuota(SetWorkspaceQuotaRequest request);

    /**
     * @param request the request parameters of UpdateAirflow  UpdateAirflowRequest
     * @return UpdateAirflowResponse
     */
    CompletableFuture<UpdateAirflowResponse> updateAirflow(UpdateAirflowRequest request);

    /**
     * @param request the request parameters of UpdateDataAgentSpaceInfo  UpdateDataAgentSpaceInfoRequest
     * @return UpdateDataAgentSpaceInfoResponse
     */
    CompletableFuture<UpdateDataAgentSpaceInfoResponse> updateDataAgentSpaceInfo(UpdateDataAgentSpaceInfoRequest request);

    /**
     * @param request the request parameters of UpdateDataAgentWorkspaceMemberRole  UpdateDataAgentWorkspaceMemberRoleRequest
     * @return UpdateDataAgentWorkspaceMemberRoleResponse
     */
    CompletableFuture<UpdateDataAgentWorkspaceMemberRoleResponse> updateDataAgentWorkspaceMemberRole(UpdateDataAgentWorkspaceMemberRoleRequest request);

    /**
     * @param request the request parameters of UpdateDataLakeDatabase  UpdateDataLakeDatabaseRequest
     * @return UpdateDataLakeDatabaseResponse
     */
    CompletableFuture<UpdateDataLakeDatabaseResponse> updateDataLakeDatabase(UpdateDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of UpdateDataLakeFunction  UpdateDataLakeFunctionRequest
     * @return UpdateDataLakeFunctionResponse
     */
    CompletableFuture<UpdateDataLakeFunctionResponse> updateDataLakeFunction(UpdateDataLakeFunctionRequest request);

    /**
     * @param request the request parameters of UpdateDataLakePartition  UpdateDataLakePartitionRequest
     * @return UpdateDataLakePartitionResponse
     */
    CompletableFuture<UpdateDataLakePartitionResponse> updateDataLakePartition(UpdateDataLakePartitionRequest request);

    /**
     * @param request the request parameters of UpdateDataLakeTable  UpdateDataLakeTableRequest
     * @return UpdateDataLakeTableResponse
     */
    CompletableFuture<UpdateDataLakeTableResponse> updateDataLakeTable(UpdateDataLakeTableRequest request);

    /**
     * @param request the request parameters of UpdateDocument  UpdateDocumentRequest
     * @return UpdateDocumentResponse
     */
    CompletableFuture<UpdateDocumentResponse> updateDocument(UpdateDocumentRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBase  UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    CompletableFuture<UpdateKnowledgeBaseResponse> updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of UploadDocument  UploadDocumentRequest
     * @return UploadDocumentResponse
     */
    CompletableFuture<UploadDocumentResponse> uploadDocument(UploadDocumentRequest request);

    /**
     * @param request the request parameters of UpsertDocumentChunks  UpsertDocumentChunksRequest
     * @return UpsertDocumentChunksResponse
     */
    CompletableFuture<UpsertDocumentChunksResponse> upsertDocumentChunks(UpsertDocumentChunksRequest request);

    /**
     * @param request the request parameters of WorkspaceActionLog  WorkspaceActionLogRequest
     * @return WorkspaceActionLogResponse
     */
    CompletableFuture<WorkspaceActionLogResponse> workspaceActionLog(WorkspaceActionLogRequest request);

    /**
     * @param request the request parameters of WorkspaceActionStatus  WorkspaceActionStatusRequest
     * @return WorkspaceActionStatusResponse
     */
    CompletableFuture<WorkspaceActionStatusResponse> workspaceActionStatus(WorkspaceActionStatusRequest request);

    /**
     * @param request the request parameters of WorkspaceCodePublish  WorkspaceCodePublishRequest
     * @return WorkspaceCodePublishResponse
     */
    CompletableFuture<WorkspaceCodePublishResponse> workspaceCodePublish(WorkspaceCodePublishRequest request);

}
