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
     * @param request the request parameters of CreateDataAgentSession  CreateDataAgentSessionRequest
     * @return CreateDataAgentSessionResponse
     */
    CompletableFuture<CreateDataAgentSessionResponse> createDataAgentSession(CreateDataAgentSessionRequest request);

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
     * @param request the request parameters of DescribeDataAgentSession  DescribeDataAgentSessionRequest
     * @return DescribeDataAgentSessionResponse
     */
    CompletableFuture<DescribeDataAgentSessionResponse> describeDataAgentSession(DescribeDataAgentSessionRequest request);

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
     * @param request the request parameters of ListAirflows  ListAirflowsRequest
     * @return ListAirflowsResponse
     */
    CompletableFuture<ListAirflowsResponse> listAirflows(ListAirflowsRequest request);

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
     * @param request the request parameters of SendChatMessage  SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    CompletableFuture<SendChatMessageResponse> sendChatMessage(SendChatMessageRequest request);

    /**
     * @param request the request parameters of UpdateAirflow  UpdateAirflowRequest
     * @return UpdateAirflowResponse
     */
    CompletableFuture<UpdateAirflowResponse> updateAirflow(UpdateAirflowRequest request);

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

}
