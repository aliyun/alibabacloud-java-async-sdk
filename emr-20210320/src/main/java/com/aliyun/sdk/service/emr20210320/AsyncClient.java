// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emr20210320.models.*;
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

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
      * 创建节点组。
      *
     */
    CompletableFuture<CreateNodeGroupResponse> createNodeGroup(CreateNodeGroupRequest request);

    /**
      * 缩容节点。
      *
     */
    CompletableFuture<DecreaseNodesResponse> decreaseNodes(DecreaseNodesRequest request);

    /**
      * 删除集群。
      *
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
      * 获取弹性伸缩活动详情。
      *
     */
    CompletableFuture<GetAutoScalingActivityResponse> getAutoScalingActivity(GetAutoScalingActivityRequest request);

    /**
      * 获取弹性伸缩策略信息。
      *
     */
    CompletableFuture<GetAutoScalingPolicyResponse> getAutoScalingPolicy(GetAutoScalingPolicyRequest request);

    /**
      * 调用GetCluster获取集群详情。
      *
     */
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

    /**
      * 获取操作详情。
      *
     */
    CompletableFuture<GetOperationResponse> getOperation(GetOperationRequest request);

    /**
      * 扩容节点。
      *
     */
    CompletableFuture<IncreaseNodesResponse> increaseNodes(IncreaseNodesRequest request);

    /**
      * 加入资源组。
      *
     */
    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

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

    CompletableFuture<ListInstanceTypesResponse> listInstanceTypes(ListInstanceTypesRequest request);

    /**
      * 查询节点组。
      *
     */
    CompletableFuture<ListNodeGroupsResponse> listNodeGroups(ListNodeGroupsRequest request);

    /**
      * 查询节点。
      *
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
      * 查询主版本。
      *
     */
    CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * 设置弹性伸缩规则。
      *
     */
    CompletableFuture<PutAutoScalingPolicyResponse> putAutoScalingPolicy(PutAutoScalingPolicyRequest request);

    CompletableFuture<RemoveAutoScalingPolicyResponse> removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request);

    CompletableFuture<RunApplicationActionResponse> runApplicationAction(RunApplicationActionRequest request);

    /**
      * 给资源打标签。
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * 删除指定资源标签。
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateApplicationConfigsResponse> updateApplicationConfigs(UpdateApplicationConfigsRequest request);

}
