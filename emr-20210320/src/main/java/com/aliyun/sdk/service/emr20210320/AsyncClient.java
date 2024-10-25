// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emr20210320.models.*;
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
     * @param request the request parameters of CreateApiTemplate  CreateApiTemplateRequest
     * @return CreateApiTemplateResponse
     */
    CompletableFuture<CreateApiTemplateResponse> createApiTemplate(CreateApiTemplateRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * <b>description</b> :
     * <p>创建节点组。</p>
     * 
     * @param request the request parameters of CreateNodeGroup  CreateNodeGroupRequest
     * @return CreateNodeGroupResponse
     */
    CompletableFuture<CreateNodeGroupResponse> createNodeGroup(CreateNodeGroupRequest request);

    /**
     * @param request the request parameters of CreateScript  CreateScriptRequest
     * @return CreateScriptResponse
     */
    CompletableFuture<CreateScriptResponse> createScript(CreateScriptRequest request);

    /**
     * @param request the request parameters of DecreaseNodes  DecreaseNodesRequest
     * @return DecreaseNodesResponse
     */
    CompletableFuture<DecreaseNodesResponse> decreaseNodes(DecreaseNodesRequest request);

    /**
     * <b>description</b> :
     * <p>创建集群模板</p>
     * 
     * @param request the request parameters of DeleteApiTemplate  DeleteApiTemplateRequest
     * @return DeleteApiTemplateResponse
     */
    CompletableFuture<DeleteApiTemplateResponse> deleteApiTemplate(DeleteApiTemplateRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteScript  DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request);

    /**
     * @param request the request parameters of GetApiTemplate  GetApiTemplateRequest
     * @return GetApiTemplateResponse
     */
    CompletableFuture<GetApiTemplateResponse> getApiTemplate(GetApiTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>查询应用详情。</p>
     * 
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetAutoScalingActivity  GetAutoScalingActivityRequest
     * @return GetAutoScalingActivityResponse
     */
    CompletableFuture<GetAutoScalingActivityResponse> getAutoScalingActivity(GetAutoScalingActivityRequest request);

    /**
     * @param request the request parameters of GetAutoScalingPolicy  GetAutoScalingPolicyRequest
     * @return GetAutoScalingPolicyResponse
     */
    CompletableFuture<GetAutoScalingPolicyResponse> getAutoScalingPolicy(GetAutoScalingPolicyRequest request);

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * @param request the request parameters of GetClusterCloneMeta  GetClusterCloneMetaRequest
     * @return GetClusterCloneMetaResponse
     */
    CompletableFuture<GetClusterCloneMetaResponse> getClusterCloneMeta(GetClusterCloneMetaRequest request);

    /**
     * <b>description</b> :
     * <p>get one doctor analysis app</p>
     * 
     * @param request the request parameters of GetDoctorApplication  GetDoctorApplicationRequest
     * @return GetDoctorApplicationResponse
     */
    CompletableFuture<GetDoctorApplicationResponse> getDoctorApplication(GetDoctorApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>get one specific luster engine queue by &lt;type, name&gt;</p>
     * 
     * @param request the request parameters of GetDoctorComputeSummary  GetDoctorComputeSummaryRequest
     * @return GetDoctorComputeSummaryResponse
     */
    CompletableFuture<GetDoctorComputeSummaryResponse> getDoctorComputeSummary(GetDoctorComputeSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseCluster</p>
     * 
     * @param request the request parameters of GetDoctorHBaseCluster  GetDoctorHBaseClusterRequest
     * @return GetDoctorHBaseClusterResponse
     */
    CompletableFuture<GetDoctorHBaseClusterResponse> getDoctorHBaseCluster(GetDoctorHBaseClusterRequest request);

    /**
     * <b>description</b> :
     * <p>List Doctor HBase Regions</p>
     * 
     * @param request the request parameters of GetDoctorHBaseRegion  GetDoctorHBaseRegionRequest
     * @return GetDoctorHBaseRegionResponse
     */
    CompletableFuture<GetDoctorHBaseRegionResponse> getDoctorHBaseRegion(GetDoctorHBaseRegionRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseRegionServer</p>
     * 
     * @param request the request parameters of GetDoctorHBaseRegionServer  GetDoctorHBaseRegionServerRequest
     * @return GetDoctorHBaseRegionServerResponse
     */
    CompletableFuture<GetDoctorHBaseRegionServerResponse> getDoctorHBaseRegionServer(GetDoctorHBaseRegionServerRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseTable</p>
     * 
     * @param request the request parameters of GetDoctorHBaseTable  GetDoctorHBaseTableRequest
     * @return GetDoctorHBaseTableResponse
     */
    CompletableFuture<GetDoctorHBaseTableResponse> getDoctorHBaseTable(GetDoctorHBaseTableRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTableRegions</p>
     * 
     * @param request the request parameters of GetDoctorHDFSCluster  GetDoctorHDFSClusterRequest
     * @return GetDoctorHDFSClusterResponse
     */
    CompletableFuture<GetDoctorHDFSClusterResponse> getDoctorHDFSCluster(GetDoctorHDFSClusterRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor HDFSNode</p>
     * 
     * @param request the request parameters of GetDoctorHDFSDirectory  GetDoctorHDFSDirectoryRequest
     * @return GetDoctorHDFSDirectoryResponse
     */
    CompletableFuture<GetDoctorHDFSDirectoryResponse> getDoctorHDFSDirectory(GetDoctorHDFSDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor HDFS UGI</p>
     * 
     * @param request the request parameters of GetDoctorHDFSUGI  GetDoctorHDFSUGIRequest
     * @return GetDoctorHDFSUGIResponse
     */
    CompletableFuture<GetDoctorHDFSUGIResponse> getDoctorHDFSUGI(GetDoctorHDFSUGIRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Cluster</p>
     * 
     * @param request the request parameters of GetDoctorHiveCluster  GetDoctorHiveClusterRequest
     * @return GetDoctorHiveClusterResponse
     */
    CompletableFuture<GetDoctorHiveClusterResponse> getDoctorHiveCluster(GetDoctorHiveClusterRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Database</p>
     * 
     * @param request the request parameters of GetDoctorHiveDatabase  GetDoctorHiveDatabaseRequest
     * @return GetDoctorHiveDatabaseResponse
     */
    CompletableFuture<GetDoctorHiveDatabaseResponse> getDoctorHiveDatabase(GetDoctorHiveDatabaseRequest request);

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Table</p>
     * 
     * @param request the request parameters of GetDoctorHiveTable  GetDoctorHiveTableRequest
     * @return GetDoctorHiveTableResponse
     */
    CompletableFuture<GetDoctorHiveTableResponse> getDoctorHiveTable(GetDoctorHiveTableRequest request);

    /**
     * <b>description</b> :
     * <p>Get realtime job by yarn</p>
     * 
     * @param request the request parameters of GetDoctorJob  GetDoctorJobRequest
     * @return GetDoctorJobResponse
     */
    CompletableFuture<GetDoctorJobResponse> getDoctorJob(GetDoctorJobRequest request);

    /**
     * <b>description</b> :
     * <p>get specify component\&quot;s report analysis by EMR Doctor</p>
     * 
     * @param request the request parameters of GetDoctorReportComponentSummary  GetDoctorReportComponentSummaryRequest
     * @return GetDoctorReportComponentSummaryResponse
     */
    CompletableFuture<GetDoctorReportComponentSummaryResponse> getDoctorReportComponentSummary(GetDoctorReportComponentSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>获取节点组详情。</p>
     * 
     * @param request the request parameters of GetNodeGroup  GetNodeGroupRequest
     * @return GetNodeGroupResponse
     */
    CompletableFuture<GetNodeGroupResponse> getNodeGroup(GetNodeGroupRequest request);

    /**
     * @param request the request parameters of GetOperation  GetOperationRequest
     * @return GetOperationResponse
     */
    CompletableFuture<GetOperationResponse> getOperation(GetOperationRequest request);

    /**
     * @param request the request parameters of IncreaseNodes  IncreaseNodesRequest
     * @return IncreaseNodesResponse
     */
    CompletableFuture<IncreaseNodesResponse> increaseNodes(IncreaseNodesRequest request);

    /**
     * @param request the request parameters of JoinResourceGroup  JoinResourceGroupRequest
     * @return JoinResourceGroupResponse
     */
    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    /**
     * @param request the request parameters of ListApiTemplates  ListApiTemplatesRequest
     * @return ListApiTemplatesResponse
     */
    CompletableFuture<ListApiTemplatesResponse> listApiTemplates(ListApiTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>查询应用配置。</p>
     * 
     * @param request the request parameters of ListApplicationConfigs  ListApplicationConfigsRequest
     * @return ListApplicationConfigsResponse
     */
    CompletableFuture<ListApplicationConfigsResponse> listApplicationConfigs(ListApplicationConfigsRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListAutoScalingActivities  ListAutoScalingActivitiesRequest
     * @return ListAutoScalingActivitiesResponse
     */
    CompletableFuture<ListAutoScalingActivitiesResponse> listAutoScalingActivities(ListAutoScalingActivitiesRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * <b>description</b> :
     * <p>查询组件实例列表。</p>
     * 
     * @param request the request parameters of ListComponentInstances  ListComponentInstancesRequest
     * @return ListComponentInstancesResponse
     */
    CompletableFuture<ListComponentInstancesResponse> listComponentInstances(ListComponentInstancesRequest request);

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * <b>description</b> :
     * <p>list all doctor analysis apps</p>
     * 
     * @param request the request parameters of ListDoctorApplications  ListDoctorApplicationsRequest
     * @return ListDoctorApplicationsResponse
     */
    CompletableFuture<ListDoctorApplicationsResponse> listDoctorApplications(ListDoctorApplicationsRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor analysis result of cluster engine queue view</p>
     * 
     * @param request the request parameters of ListDoctorComputeSummary  ListDoctorComputeSummaryRequest
     * @return ListDoctorComputeSummaryResponse
     */
    CompletableFuture<ListDoctorComputeSummaryResponse> listDoctorComputeSummary(ListDoctorComputeSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseRegionServers</p>
     * 
     * @param request the request parameters of ListDoctorHBaseRegionServers  ListDoctorHBaseRegionServersRequest
     * @return ListDoctorHBaseRegionServersResponse
     */
    CompletableFuture<ListDoctorHBaseRegionServersResponse> listDoctorHBaseRegionServers(ListDoctorHBaseRegionServersRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTables</p>
     * 
     * @param request the request parameters of ListDoctorHBaseTables  ListDoctorHBaseTablesRequest
     * @return ListDoctorHBaseTablesResponse
     */
    CompletableFuture<ListDoctorHBaseTablesResponse> listDoctorHBaseTables(ListDoctorHBaseTablesRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor HDFSNodes</p>
     * 
     * @param request the request parameters of ListDoctorHDFSDirectories  ListDoctorHDFSDirectoriesRequest
     * @return ListDoctorHDFSDirectoriesResponse
     */
    CompletableFuture<ListDoctorHDFSDirectoriesResponse> listDoctorHDFSDirectories(ListDoctorHDFSDirectoriesRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor HDFS UGIs</p>
     * 
     * @param request the request parameters of ListDoctorHDFSUGI  ListDoctorHDFSUGIRequest
     * @return ListDoctorHDFSUGIResponse
     */
    CompletableFuture<ListDoctorHDFSUGIResponse> listDoctorHDFSUGI(ListDoctorHDFSUGIRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Databases</p>
     * 
     * @param request the request parameters of ListDoctorHiveDatabases  ListDoctorHiveDatabasesRequest
     * @return ListDoctorHiveDatabasesResponse
     */
    CompletableFuture<ListDoctorHiveDatabasesResponse> listDoctorHiveDatabases(ListDoctorHiveDatabasesRequest request);

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Tables</p>
     * 
     * @param request the request parameters of ListDoctorHiveTables  ListDoctorHiveTablesRequest
     * @return ListDoctorHiveTablesResponse
     */
    CompletableFuture<ListDoctorHiveTablesResponse> listDoctorHiveTables(ListDoctorHiveTablesRequest request);

    /**
     * <b>description</b> :
     * <p>list realtime jobs by yarn</p>
     * 
     * @param request the request parameters of ListDoctorJobs  ListDoctorJobsRequest
     * @return ListDoctorJobsResponse
     */
    CompletableFuture<ListDoctorJobsResponse> listDoctorJobs(ListDoctorJobsRequest request);

    /**
     * <b>description</b> :
     * <p>list stats groupBy jobs by yarn</p>
     * 
     * @param request the request parameters of ListDoctorJobsStats  ListDoctorJobsStatsRequest
     * @return ListDoctorJobsStatsResponse
     */
    CompletableFuture<ListDoctorJobsStatsResponse> listDoctorJobsStats(ListDoctorJobsStatsRequest request);

    /**
     * <b>description</b> :
     * <p>list all reports analysis by emr doctor</p>
     * 
     * @param request the request parameters of ListDoctorReports  ListDoctorReportsRequest
     * @return ListDoctorReportsResponse
     */
    CompletableFuture<ListDoctorReportsResponse> listDoctorReports(ListDoctorReportsRequest request);

    /**
     * @param request the request parameters of ListInstanceTypes  ListInstanceTypesRequest
     * @return ListInstanceTypesResponse
     */
    CompletableFuture<ListInstanceTypesResponse> listInstanceTypes(ListInstanceTypesRequest request);

    /**
     * @param request the request parameters of ListNodeGroups  ListNodeGroupsRequest
     * @return ListNodeGroupsResponse
     */
    CompletableFuture<ListNodeGroupsResponse> listNodeGroups(ListNodeGroupsRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * <b>description</b> :
     * <p>查询主版本。</p>
     * 
     * @param request the request parameters of ListReleaseVersions  ListReleaseVersionsRequest
     * @return ListReleaseVersionsResponse
     */
    CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request);

    /**
     * @param request the request parameters of ListScripts  ListScriptsRequest
     * @return ListScriptsResponse
     */
    CompletableFuture<ListScriptsResponse> listScripts(ListScriptsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure auto scaling policies.</p>
     * 
     * @param request the request parameters of PutAutoScalingPolicy  PutAutoScalingPolicyRequest
     * @return PutAutoScalingPolicyResponse
     */
    CompletableFuture<PutAutoScalingPolicyResponse> putAutoScalingPolicy(PutAutoScalingPolicyRequest request);

    /**
     * @param request the request parameters of RemoveAutoScalingPolicy  RemoveAutoScalingPolicyRequest
     * @return RemoveAutoScalingPolicyResponse
     */
    CompletableFuture<RemoveAutoScalingPolicyResponse> removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request);

    /**
     * @param request the request parameters of RunApiTemplate  RunApiTemplateRequest
     * @return RunApiTemplateResponse
     */
    CompletableFuture<RunApiTemplateResponse> runApiTemplate(RunApiTemplateRequest request);

    /**
     * @param request the request parameters of RunApplicationAction  RunApplicationActionRequest
     * @return RunApplicationActionResponse
     */
    CompletableFuture<RunApplicationActionResponse> runApplicationAction(RunApplicationActionRequest request);

    /**
     * @param request the request parameters of RunCluster  RunClusterRequest
     * @return RunClusterResponse
     */
    CompletableFuture<RunClusterResponse> runCluster(RunClusterRequest request);

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
     * <p>修改集群模板</p>
     * 
     * @param request the request parameters of UpdateApiTemplate  UpdateApiTemplateRequest
     * @return UpdateApiTemplateResponse
     */
    CompletableFuture<UpdateApiTemplateResponse> updateApiTemplate(UpdateApiTemplateRequest request);

    /**
     * @param request the request parameters of UpdateApplicationConfigs  UpdateApplicationConfigsRequest
     * @return UpdateApplicationConfigsResponse
     */
    CompletableFuture<UpdateApplicationConfigsResponse> updateApplicationConfigs(UpdateApplicationConfigsRequest request);

    /**
     * @param request the request parameters of UpdateScript  UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    CompletableFuture<UpdateScriptResponse> updateScript(UpdateScriptRequest request);

}
