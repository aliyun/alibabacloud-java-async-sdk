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
     * <b>description</b> :
     * <p>Creates a session, returns the frontend endpoint, and starts an epoch task to track the session status.</p>
     * 
     * @param request the request parameters of ChangeNodeGroup  ChangeNodeGroupRequest
     * @return ChangeNodeGroupResponse
     */
    CompletableFuture<ChangeNodeGroupResponse> changeNodeGroup(ChangeNodeGroupRequest request);

    /**
     * @param request the request parameters of ChangeNodeTypes  ChangeNodeTypesRequest
     * @return ChangeNodeTypesResponse
     */
    CompletableFuture<ChangeNodeTypesResponse> changeNodeTypes(ChangeNodeTypesRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>An interface for creating a session, returning the front-end EndPoint, and initiating a periodic task to track the session status</p>
     * 
     * @param request the request parameters of CloseSession  CloseSessionRequest
     * @return CloseSessionResponse
     */
    CompletableFuture<CloseSessionResponse> closeSession(CloseSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Closes a remote session.</p>
     * 
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
     * @param request the request parameters of CreateNetTestTask  CreateNetTestTaskRequest
     * @return CreateNetTestTaskResponse
     */
    CompletableFuture<CreateNetTestTaskResponse> createNetTestTask(CreateNetTestTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
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
     * @param request the request parameters of DeleteHyperNode  DeleteHyperNodeRequest
     * @return DeleteHyperNodeResponse
     */
    CompletableFuture<DeleteHyperNodeResponse> deleteHyperNode(DeleteHyperNodeRequest request);

    /**
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

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
     * <b>description</b> :
     * <p>Closes a remote session.</p>
     * 
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosticResult  DescribeDiagnosticResultRequest
     * @return DescribeDiagnosticResultResponse
     */
    CompletableFuture<DescribeDiagnosticResultResponse> describeDiagnosticResult(DescribeDiagnosticResultRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a fault report. After you call ReportNodeStatus to submit a fault report, you can obtain the report ID from the ReportId response parameter. You can also call ListFaultReports to query existing fault reports and obtain the ReportId.</p>
     * 
     * @param request the request parameters of DescribeFaultReport  DescribeFaultReportRequest
     * @return DescribeFaultReportResponse
     */
    CompletableFuture<DescribeFaultReportResponse> describeFaultReport(DescribeFaultReportRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a hypernode.</p>
     * 
     * @param request the request parameters of DescribeHyperNode  DescribeHyperNodeRequest
     * @return DescribeHyperNodeResponse
     */
    CompletableFuture<DescribeHyperNodeResponse> describeHyperNode(DescribeHyperNodeRequest request);

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
     * <b>description</b> :
     * <p>Queries the details of a supernode.</p>
     * 
     * @param request the request parameters of DescribeNode  DescribeNodeRequest
     * @return DescribeNodeResponse
     */
    CompletableFuture<DescribeNodeResponse> describeNode(DescribeNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a supernode.</p>
     * 
     * @param request the request parameters of DescribeNodeGroup  DescribeNodeGroupRequest
     * @return DescribeNodeGroupResponse
     */
    CompletableFuture<DescribeNodeGroupResponse> describeNodeGroup(DescribeNodeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The returned results include the following:</p>
     * <ul>
     * <li>The processing status of each node with configuration drift.</li>
     * <li>The processing result, status, and reason for each node.</li>
     * <li>The refreshed and skipped properties for each node.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeNodeGroupRefreshTask  DescribeNodeGroupRefreshTaskRequest
     * @return DescribeNodeGroupRefreshTaskResponse
     */
    CompletableFuture<DescribeNodeGroupRefreshTaskResponse> describeNodeGroupRefreshTask(DescribeNodeGroupRefreshTaskRequest request);

    /**
     * @param request the request parameters of DescribeNodeType  DescribeNodeTypeRequest
     * @return DescribeNodeTypeResponse
     */
    CompletableFuture<DescribeNodeTypeResponse> describeNodeType(DescribeNodeTypeRequest request);

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
     * <b>description</b> :
     * <p>Closes a remote session.</p>
     * 
     * @param request the request parameters of ExtendCluster  ExtendClusterRequest
     * @return ExtendClusterResponse
     */
    CompletableFuture<ExtendClusterResponse> extendCluster(ExtendClusterRequest request);

    /**
     * @param request the request parameters of ListClusterHyperNodes  ListClusterHyperNodesRequest
     * @return ListClusterHyperNodesResponse
     */
    CompletableFuture<ListClusterHyperNodesResponse> listClusterHyperNodes(ListClusterHyperNodesRequest request);

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
     * <b>description</b> :
     * <p>Creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of ListFaultReports  ListFaultReportsRequest
     * @return ListFaultReportsResponse
     */
    CompletableFuture<ListFaultReportsResponse> listFaultReports(ListFaultReportsRequest request);

    /**
     * @param request the request parameters of ListFreeHyperNodes  ListFreeHyperNodesRequest
     * @return ListFreeHyperNodesResponse
     */
    CompletableFuture<ListFreeHyperNodesResponse> listFreeHyperNodes(ListFreeHyperNodesRequest request);

    /**
     * @param request the request parameters of ListFreeNodes  ListFreeNodesRequest
     * @return ListFreeNodesResponse
     */
    CompletableFuture<ListFreeNodesResponse> listFreeNodes(ListFreeNodesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of hyper nodes.</p>
     * 
     * @param request the request parameters of ListHyperNodes  ListHyperNodesRequest
     * @return ListHyperNodesResponse
     */
    CompletableFuture<ListHyperNodesResponse> listHyperNodes(ListHyperNodesRequest request);

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
     * @param request the request parameters of ListNetTestResults  ListNetTestResultsRequest
     * @return ListNetTestResultsResponse
     */
    CompletableFuture<ListNetTestResultsResponse> listNetTestResults(ListNetTestResultsRequest request);

    /**
     * <b>description</b> :
     * <p>Compares the node group configuration template with the actual configuration of each node, and returns all nodes with configuration inconsistencies, along with the drift type, before-and-after values, and the required action level for refreshing each inconsistent property. This is a read-only operation.</p>
     * 
     * @param request the request parameters of ListNodeGroupDriftedNodes  ListNodeGroupDriftedNodesRequest
     * @return ListNodeGroupDriftedNodesResponse
     */
    CompletableFuture<ListNodeGroupDriftedNodesResponse> listNodeGroupDriftedNodes(ListNodeGroupDriftedNodesRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not know which node group has refresh tasks, you can use conditional query. The task list contains only summary information. To query task details, use the DescribeNodeGroupRefreshTask operation.</p>
     * 
     * @param request the request parameters of ListNodeGroupRefreshTasks  ListNodeGroupRefreshTasksRequest
     * @return ListNodeGroupRefreshTasksResponse
     */
    CompletableFuture<ListNodeGroupRefreshTasksResponse> listNodeGroupRefreshTasks(ListNodeGroupRefreshTasksRequest request);

    /**
     * @param request the request parameters of ListNodeGroups  ListNodeGroupsRequest
     * @return ListNodeGroupsResponse
     */
    CompletableFuture<ListNodeGroupsResponse> listNodeGroups(ListNodeGroupsRequest request);

    /**
     * @param request the request parameters of ListSyslogs  ListSyslogsRequest
     * @return ListSyslogsResponse
     */
    CompletableFuture<ListSyslogsResponse> listSyslogs(ListSyslogsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>An interface for creating a session, which returns the front-end EndPoint and initiates a periodic task to track the session status</p>
     * 
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
     * <b>description</b> :
     * <p>Manually triggers the node group configuration to take effect on existing nodes. After node group properties are changed, existing nodes do not perform automatic synchronization by default, which causes configuration drift. You can call this operation to refresh node properties. The operation returns an asynchronous refresh task ID, and the result can be queried through DescribeNodeGroupRefreshTask.
     * Limits:</p>
     * <ul>
     * <li>A node group can have only one running node group configuration refresh task at a time.</li>
     * <li>When the asynchronous task executes the refresh, if a node is not in the &quot;In Use&quot; state, the refresh of that node is failed.
     * <warning>Currently, only the RamRoleName property is supported for refresh.</warning></li>
     * </ul>
     * 
     * @param request the request parameters of RefreshNodeGroupNodes  RefreshNodeGroupNodesRequest
     * @return RefreshNodeGroupNodesResponse
     */
    CompletableFuture<RefreshNodeGroupNodesResponse> refreshNodeGroupNodes(RefreshNodeGroupNodesRequest request);

    /**
     * @param request the request parameters of ReimageNodes  ReimageNodesRequest
     * @return ReimageNodesResponse
     */
    CompletableFuture<ReimageNodesResponse> reimageNodes(ReimageNodesRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of ReportNodeStatus  ReportNodeStatusRequest
     * @return ReportNodeStatusResponse
     */
    CompletableFuture<ReportNodeStatusResponse> reportNodeStatus(ReportNodeStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a session, returns a frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of ReportNodesStatus  ReportNodesStatusRequest
     * @return ReportNodesStatusResponse
     */
    CompletableFuture<ReportNodesStatusResponse> reportNodesStatus(ReportNodesStatusRequest request);

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
     * <b>description</b> :
     * <p>Stops an ongoing fault reporting diagnostics process. Before calling this operation, initiate a fault report for the abnormal node by calling ReportNodeStatus, and use the returned ReportId as the ReportId for this operation.</p>
     * 
     * @param request the request parameters of StopNodeDiagnostic  StopNodeDiagnosticRequest
     * @return StopNodeDiagnosticResponse
     */
    CompletableFuture<StopNodeDiagnosticResponse> stopNodeDiagnostic(StopNodeDiagnosticRequest request);

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
     * <p>Creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * @param request the request parameters of UpdateNodeGroup  UpdateNodeGroupRequest
     * @return UpdateNodeGroupResponse
     */
    CompletableFuture<UpdateNodeGroupResponse> updateNodeGroup(UpdateNodeGroupRequest request);

}
