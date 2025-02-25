// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.igraph20210621.models.*;
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

    CompletableFuture<CreateGraphResponse> createGraph(CreateGraphRequest request);

    CompletableFuture<CreateGraphSchemaResponse> createGraphSchema(CreateGraphSchemaRequest request);

    CompletableFuture<DeleteGraphResponse> deleteGraph(DeleteGraphRequest request);

    CompletableFuture<GetGraphResponse> getGraph(GetGraphRequest request);

    CompletableFuture<GetGraphSchemaResponse> getGraphSchema(GetGraphSchemaRequest request);

    CompletableFuture<GetIgraphLabelBackFlowResponse> getIgraphLabelBackFlow(GetIgraphLabelBackFlowRequest request);

    CompletableFuture<GetIgraphLabelLastBackflowResponse> getIgraphLabelLastBackflow(GetIgraphLabelLastBackflowRequest request);

    CompletableFuture<GetIgraphTableDetailResponse> getIgraphTableDetail(GetIgraphTableDetailRequest request);

    CompletableFuture<GetIgraphTablesBackFlowResponse> getIgraphTablesBackFlow(GetIgraphTablesBackFlowRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceDigestResponse> getInstanceDigest(GetInstanceDigestRequest request);

    CompletableFuture<GetTableDetailResponse> getTableDetail(GetTableDetailRequest request);

    CompletableFuture<GetTableLastBackflowResponse> getTableLastBackflow(GetTableLastBackflowRequest request);

    CompletableFuture<ListDemoGraphSchemasResponse> listDemoGraphSchemas(ListDemoGraphSchemasRequest request);

    CompletableFuture<ListGraphSchemasResponse> listGraphSchemas(ListGraphSchemasRequest request);

    CompletableFuture<ListIgraphInstancesResponse> listIgraphInstances(ListIgraphInstancesRequest request);

    CompletableFuture<ListInstanceGraphResponse> listInstanceGraph(ListInstanceGraphRequest request);

    CompletableFuture<PublishGraphSchemaResponse> publishGraphSchema(PublishGraphSchemaRequest request);

    CompletableFuture<SearchIgraphDemoResponse> searchIgraphDemo(SearchIgraphDemoRequest request);

    CompletableFuture<TriggerLabelBackflowResponse> triggerLabelBackflow(TriggerLabelBackflowRequest request);

    CompletableFuture<UpdateGraphDescriptionResponse> updateGraphDescription(UpdateGraphDescriptionRequest request);

}
