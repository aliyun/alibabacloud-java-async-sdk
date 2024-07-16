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

    CompletableFuture<CreateApiTemplateResponse> createApiTemplate(CreateApiTemplateRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
      * 创建节点组。
      *
     */
    CompletableFuture<CreateNodeGroupResponse> createNodeGroup(CreateNodeGroupRequest request);

    CompletableFuture<CreateScriptResponse> createScript(CreateScriptRequest request);

    CompletableFuture<DecreaseNodesResponse> decreaseNodes(DecreaseNodesRequest request);

    /**
      * 创建集群模板
      *
     */
    CompletableFuture<DeleteApiTemplateResponse> deleteApiTemplate(DeleteApiTemplateRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request);

    CompletableFuture<GetApiTemplateResponse> getApiTemplate(GetApiTemplateRequest request);

    /**
      * 查询应用详情。
      *
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
      * 获取弹性伸缩活动详情。
      *
     */
    CompletableFuture<GetAutoScalingActivityResponse> getAutoScalingActivity(GetAutoScalingActivityRequest request);

    CompletableFuture<GetAutoScalingPolicyResponse> getAutoScalingPolicy(GetAutoScalingPolicyRequest request);

    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
      * get one doctor analysis app
      *
     */
    CompletableFuture<GetDoctorApplicationResponse> getDoctorApplication(GetDoctorApplicationRequest request);

    /**
      * get one specific luster engine queue by <type, name>
      *
     */
    CompletableFuture<GetDoctorComputeSummaryResponse> getDoctorComputeSummary(GetDoctorComputeSummaryRequest request);

    /**
      * get Doctor HBaseCluster
      *
     */
    CompletableFuture<GetDoctorHBaseClusterResponse> getDoctorHBaseCluster(GetDoctorHBaseClusterRequest request);

    /**
      * list Doctor HBaseRegions
      *
     */
    CompletableFuture<GetDoctorHBaseRegionResponse> getDoctorHBaseRegion(GetDoctorHBaseRegionRequest request);

    /**
      * get Doctor HBaseRegionServer
      *
     */
    CompletableFuture<GetDoctorHBaseRegionServerResponse> getDoctorHBaseRegionServer(GetDoctorHBaseRegionServerRequest request);

    /**
      * get Doctor HBaseTable
      *
     */
    CompletableFuture<GetDoctorHBaseTableResponse> getDoctorHBaseTable(GetDoctorHBaseTableRequest request);

    /**
      * list Doctor HBaseTableRegions
      *
     */
    CompletableFuture<GetDoctorHDFSClusterResponse> getDoctorHDFSCluster(GetDoctorHDFSClusterRequest request);

    /**
      * get Doctor HDFSNode
      *
     */
    CompletableFuture<GetDoctorHDFSDirectoryResponse> getDoctorHDFSDirectory(GetDoctorHDFSDirectoryRequest request);

    /**
      * get Doctor HDFS UGI
      *
     */
    CompletableFuture<GetDoctorHDFSUGIResponse> getDoctorHDFSUGI(GetDoctorHDFSUGIRequest request);

    /**
      * list Doctor Hive Cluster
      *
     */
    CompletableFuture<GetDoctorHiveClusterResponse> getDoctorHiveCluster(GetDoctorHiveClusterRequest request);

    /**
      * get Doctor Hive Database
      *
     */
    CompletableFuture<GetDoctorHiveDatabaseResponse> getDoctorHiveDatabase(GetDoctorHiveDatabaseRequest request);

    /**
      * get Doctor Hive Table
      *
     */
    CompletableFuture<GetDoctorHiveTableResponse> getDoctorHiveTable(GetDoctorHiveTableRequest request);

    /**
      * Get realtime job by yarn
      *
     */
    CompletableFuture<GetDoctorJobResponse> getDoctorJob(GetDoctorJobRequest request);

    /**
      * get specify component's report analysis by emr doctor
      *
     */
    CompletableFuture<GetDoctorReportComponentSummaryResponse> getDoctorReportComponentSummary(GetDoctorReportComponentSummaryRequest request);

    /**
      * 获取节点组详情。
      *
     */
    CompletableFuture<GetNodeGroupResponse> getNodeGroup(GetNodeGroupRequest request);

    CompletableFuture<GetOperationResponse> getOperation(GetOperationRequest request);

    CompletableFuture<IncreaseNodesResponse> increaseNodes(IncreaseNodesRequest request);

    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    CompletableFuture<ListApiTemplatesResponse> listApiTemplates(ListApiTemplatesRequest request);

    /**
      * 查询应用配置。
      *
     */
    CompletableFuture<ListApplicationConfigsResponse> listApplicationConfigs(ListApplicationConfigsRequest request);

    /**
      * 查询应用列表。
      *
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
      * 查询弹性伸缩活动列表。
      *
     */
    CompletableFuture<ListAutoScalingActivitiesResponse> listAutoScalingActivities(ListAutoScalingActivitiesRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
      * 查询组件实例列表。
      *
     */
    CompletableFuture<ListComponentInstancesResponse> listComponentInstances(ListComponentInstancesRequest request);

    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
      * list all doctor analysis apps
      *
     */
    CompletableFuture<ListDoctorApplicationsResponse> listDoctorApplications(ListDoctorApplicationsRequest request);

    /**
      * list Doctor analysis result of cluster engine queue view
      *
     */
    CompletableFuture<ListDoctorComputeSummaryResponse> listDoctorComputeSummary(ListDoctorComputeSummaryRequest request);

    /**
      * list Doctor HBaseRegionServers
      *
     */
    CompletableFuture<ListDoctorHBaseRegionServersResponse> listDoctorHBaseRegionServers(ListDoctorHBaseRegionServersRequest request);

    /**
      * list Doctor HBaseTables
      *
     */
    CompletableFuture<ListDoctorHBaseTablesResponse> listDoctorHBaseTables(ListDoctorHBaseTablesRequest request);

    /**
      * list Doctor HDFSNodes
      *
     */
    CompletableFuture<ListDoctorHDFSDirectoriesResponse> listDoctorHDFSDirectories(ListDoctorHDFSDirectoriesRequest request);

    /**
      * list Doctor HDFS UGIs
      *
     */
    CompletableFuture<ListDoctorHDFSUGIResponse> listDoctorHDFSUGI(ListDoctorHDFSUGIRequest request);

    /**
      * list Doctor Hive Databases
      *
     */
    CompletableFuture<ListDoctorHiveDatabasesResponse> listDoctorHiveDatabases(ListDoctorHiveDatabasesRequest request);

    /**
      * list Doctor Hive Tables
      *
     */
    CompletableFuture<ListDoctorHiveTablesResponse> listDoctorHiveTables(ListDoctorHiveTablesRequest request);

    /**
      * list realtime jobs by yarn
      *
     */
    CompletableFuture<ListDoctorJobsResponse> listDoctorJobs(ListDoctorJobsRequest request);

    /**
      * list stats groupBy jobs by yarn
      *
     */
    CompletableFuture<ListDoctorJobsStatsResponse> listDoctorJobsStats(ListDoctorJobsStatsRequest request);

    /**
      * list all reports analysis by emr doctor
      *
     */
    CompletableFuture<ListDoctorReportsResponse> listDoctorReports(ListDoctorReportsRequest request);

    CompletableFuture<ListInspectionHistoryResponse> listInspectionHistory(ListInspectionHistoryRequest request);

    CompletableFuture<ListInstanceTypesResponse> listInstanceTypes(ListInstanceTypesRequest request);

    CompletableFuture<ListNodeGroupsResponse> listNodeGroups(ListNodeGroupsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
      * 查询主版本。
      *
     */
    CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request);

    /**
      * 查询资源巡检项。
      *
     */
    CompletableFuture<ListResourceHealthInspectionsResponse> listResourceHealthInspections(ListResourceHealthInspectionsRequest request);

    CompletableFuture<ListScriptsResponse> listScripts(ListScriptsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * You can call this operation to configure auto scaling policies.
      *
     */
    CompletableFuture<PutAutoScalingPolicyResponse> putAutoScalingPolicy(PutAutoScalingPolicyRequest request);

    CompletableFuture<RemoveAutoScalingPolicyResponse> removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request);

    CompletableFuture<RunApiTemplateResponse> runApiTemplate(RunApiTemplateRequest request);

    CompletableFuture<RunApplicationActionResponse> runApplicationAction(RunApplicationActionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * 修改集群模板
      *
     */
    CompletableFuture<UpdateApiTemplateResponse> updateApiTemplate(UpdateApiTemplateRequest request);

    CompletableFuture<UpdateApplicationConfigsResponse> updateApplicationConfigs(UpdateApplicationConfigsRequest request);

    CompletableFuture<UpdateScriptResponse> updateScript(UpdateScriptRequest request);

}
