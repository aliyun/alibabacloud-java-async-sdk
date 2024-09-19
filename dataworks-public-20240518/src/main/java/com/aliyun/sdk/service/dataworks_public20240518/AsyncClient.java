// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataworks_public20240518.models.*;
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

    CompletableFuture<AbolishDeploymentResponse> abolishDeployment(AbolishDeploymentRequest request);

    CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request);

    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    CompletableFuture<CreateWorkflowDefinitionResponse> createWorkflowDefinition(CreateWorkflowDefinitionRequest request);

    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    CompletableFuture<DeleteWorkflowDefinitionResponse> deleteWorkflowDefinition(DeleteWorkflowDefinitionRequest request);

    CompletableFuture<ExecDeploymentStageResponse> execDeploymentStage(ExecDeploymentStageRequest request);

    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    CompletableFuture<GetWorkflowDefinitionResponse> getWorkflowDefinition(GetWorkflowDefinitionRequest request);

    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListNodeDependenciesResponse> listNodeDependencies(ListNodeDependenciesRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListWorkflowDefinitionsResponse> listWorkflowDefinitions(ListWorkflowDefinitionsRequest request);

    CompletableFuture<MoveFunctionResponse> moveFunction(MoveFunctionRequest request);

    CompletableFuture<MoveNodeResponse> moveNode(MoveNodeRequest request);

    CompletableFuture<MoveResourceResponse> moveResource(MoveResourceRequest request);

    CompletableFuture<MoveWorkflowDefinitionResponse> moveWorkflowDefinition(MoveWorkflowDefinitionRequest request);

    CompletableFuture<RenameFunctionResponse> renameFunction(RenameFunctionRequest request);

    CompletableFuture<RenameNodeResponse> renameNode(RenameNodeRequest request);

    CompletableFuture<RenameResourceResponse> renameResource(RenameResourceRequest request);

    CompletableFuture<RenameWorkflowDefinitionResponse> renameWorkflowDefinition(RenameWorkflowDefinitionRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateNodeResponse> updateNode(UpdateNodeRequest request);

    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    CompletableFuture<UpdateWorkflowDefinitionResponse> updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request);

}
