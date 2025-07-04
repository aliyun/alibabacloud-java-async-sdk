// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eflo_controller20221215.models.*;
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
     * @param request the request parameters of ApproveOperation  ApproveOperationRequest
     * @return ApproveOperationResponse
     */
    CompletableFuture<ApproveOperationResponse> approveOperation(ApproveOperationRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CloseSession  CloseSessionRequest
     * @return CloseSessionResponse
     */
    CompletableFuture<CloseSessionResponse> closeSession(CloseSessionRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateDiagnosticTask  CreateDiagnosticTaskRequest
     * @return CreateDiagnosticTaskResponse
     */
    CompletableFuture<CreateDiagnosticTaskResponse> createDiagnosticTask(CreateDiagnosticTaskRequest request);

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of CreateNetTestTask  CreateNetTestTaskRequest
     * @return CreateNetTestTaskResponse
     */
    CompletableFuture<CreateNetTestTaskResponse> createNetTestTask(CreateNetTestTaskRequest request);

    /**
     * @param request the request parameters of CreateNodeGroup  CreateNodeGroupRequest
     * @return CreateNodeGroupResponse
     */
    CompletableFuture<CreateNodeGroupResponse> createNodeGroup(CreateNodeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of CreateSession  CreateSessionRequest
     * @return CreateSessionResponse
     */
    CompletableFuture<CreateSessionResponse> createSession(CreateSessionRequest request);

    /**
     * @param request the request parameters of CreateVsc  CreateVscRequest
     * @return CreateVscResponse
     */
    CompletableFuture<CreateVscResponse> createVsc(CreateVscRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteNodeGroup  DeleteNodeGroupRequest
     * @return DeleteNodeGroupResponse
     */
    CompletableFuture<DeleteNodeGroupResponse> deleteNodeGroup(DeleteNodeGroupRequest request);

    /**
     * @param request the request parameters of DeleteVsc  DeleteVscRequest
     * @return DeleteVscResponse
     */
    CompletableFuture<DeleteVscResponse> deleteVsc(DeleteVscRequest request);

    /**
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of DescribeDiagnosticResult  DescribeDiagnosticResultRequest
     * @return DescribeDiagnosticResultResponse
     */
    CompletableFuture<DescribeDiagnosticResultResponse> describeDiagnosticResult(DescribeDiagnosticResultRequest request);

    /**
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeNetTestResult  DescribeNetTestResultRequest
     * @return DescribeNetTestResultResponse
     */
    CompletableFuture<DescribeNetTestResultResponse> describeNetTestResult(DescribeNetTestResultRequest request);

    /**
     * @param request the request parameters of DescribeNode  DescribeNodeRequest
     * @return DescribeNodeResponse
     */
    CompletableFuture<DescribeNodeResponse> describeNode(DescribeNodeRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSendFileResults  DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
     */
    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    /**
     * @param request the request parameters of DescribeTask  DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    /**
     * @param request the request parameters of DescribeVsc  DescribeVscRequest
     * @return DescribeVscResponse
     */
    CompletableFuture<DescribeVscResponse> describeVsc(DescribeVscRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of ExtendCluster  ExtendClusterRequest
     * @return ExtendClusterResponse
     */
    CompletableFuture<ExtendClusterResponse> extendCluster(ExtendClusterRequest request);

    /**
     * @param request the request parameters of ListClusterNodes  ListClusterNodesRequest
     * @return ListClusterNodesResponse
     */
    CompletableFuture<ListClusterNodesResponse> listClusterNodes(ListClusterNodesRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListDiagnosticResults  ListDiagnosticResultsRequest
     * @return ListDiagnosticResultsResponse
     */
    CompletableFuture<ListDiagnosticResultsResponse> listDiagnosticResults(ListDiagnosticResultsRequest request);

    /**
     * @param request the request parameters of ListFreeNodes  ListFreeNodesRequest
     * @return ListFreeNodesResponse
     */
    CompletableFuture<ListFreeNodesResponse> listFreeNodes(ListFreeNodesRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListMachineNetworkInfo  ListMachineNetworkInfoRequest
     * @return ListMachineNetworkInfoResponse
     */
    CompletableFuture<ListMachineNetworkInfoResponse> listMachineNetworkInfo(ListMachineNetworkInfoRequest request);

    /**
     * @param request the request parameters of ListMachineTypes  ListMachineTypesRequest
     * @return ListMachineTypesResponse
     */
    CompletableFuture<ListMachineTypesResponse> listMachineTypes(ListMachineTypesRequest request);

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of ListNetTestResults  ListNetTestResultsRequest
     * @return ListNetTestResultsResponse
     */
    CompletableFuture<ListNetTestResultsResponse> listNetTestResults(ListNetTestResultsRequest request);

    /**
     * @param request the request parameters of ListNodeGroups  ListNodeGroupsRequest
     * @return ListNodeGroupsResponse
     */
    CompletableFuture<ListNodeGroupsResponse> listNodeGroups(ListNodeGroupsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListUserClusterTypes  ListUserClusterTypesRequest
     * @return ListUserClusterTypesResponse
     */
    CompletableFuture<ListUserClusterTypesResponse> listUserClusterTypes(ListUserClusterTypesRequest request);

    /**
     * @param request the request parameters of ListVscs  ListVscsRequest
     * @return ListVscsResponse
     */
    CompletableFuture<ListVscsResponse> listVscs(ListVscsRequest request);

    /**
     * @param request the request parameters of RebootNodes  RebootNodesRequest
     * @return RebootNodesResponse
     */
    CompletableFuture<RebootNodesResponse> rebootNodes(RebootNodesRequest request);

    /**
     * @param request the request parameters of ReimageNodes  ReimageNodesRequest
     * @return ReimageNodesResponse
     */
    CompletableFuture<ReimageNodesResponse> reimageNodes(ReimageNodesRequest request);

    /**
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * @param request the request parameters of SendFile  SendFileRequest
     * @return SendFileResponse
     */
    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    /**
     * @param request the request parameters of ShrinkCluster  ShrinkClusterRequest
     * @return ShrinkClusterResponse
     */
    CompletableFuture<ShrinkClusterResponse> shrinkCluster(ShrinkClusterRequest request);

    /**
     * @param request the request parameters of StopInvocation  StopInvocationRequest
     * @return StopInvocationResponse
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
     * @param request the request parameters of StopNodes  StopNodesRequest
     * @return StopNodesResponse
     */
    CompletableFuture<StopNodesResponse> stopNodes(StopNodesRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of UpdateNodeGroup  UpdateNodeGroupRequest
     * @return UpdateNodeGroupResponse
     */
    CompletableFuture<UpdateNodeGroupResponse> updateNodeGroup(UpdateNodeGroupRequest request);

}
