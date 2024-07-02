// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.searchengine20211025.models.*;
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
      * ## Method
      *     POST
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/actions/build-index
      *
     */
    CompletableFuture<BuildIndexResponse> buildIndex(BuildIndexRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CloneSqlInstanceResponse> cloneSqlInstance(CloneSqlInstanceRequest request);

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters`
      *
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateConfigDirResponse> createConfigDir(CreateConfigDirRequest request);

    CompletableFuture<CreateConfigFileResponse> createConfigFile(CreateConfigFileRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
      * ### Method
      * ```java
      * POST
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/indexes
      * ```
      *
     */
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/api/instances?dryRun=false`
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreatePublicUrlResponse> createPublicUrl(CreatePublicUrlRequest request);

    CompletableFuture<CreateSqlInstanceResponse> createSqlInstance(CreateSqlInstanceRequest request);

    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
     */
    CompletableFuture<DeleteAdvanceConfigResponse> deleteAdvanceConfig(DeleteAdvanceConfigRequest request);

    CompletableFuture<DeleteConfigDirResponse> deleteConfigDir(DeleteConfigDirRequest request);

    CompletableFuture<DeleteConfigFileResponse> deleteConfigFile(DeleteConfigFileRequest request);

    /**
      * ## Method
      * `DELETE`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}?dataSource=xxx
      *
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}
      *
     */
    CompletableFuture<DeleteIndexVersionResponse> deleteIndexVersion(DeleteIndexVersionRequest request);

    /**
      * ### Method
      * `DELETE`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeletePublicUrlResponse> deletePublicUrl(DeletePublicUrlRequest request);

    CompletableFuture<DeleteSqlInstanceResponse> deleteSqlInstance(DeleteSqlInstanceRequest request);

    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<ExecuteSqlInstanceResponse> executeSqlInstance(ExecuteSqlInstanceRequest request);

    /**
      * \\### Method
      * ```java
      * PUT
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/force-switch/{fsmId}
      * ```
      *
     */
    CompletableFuture<ForceSwitchResponse> forceSwitch(ForceSwitchRequest request);

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
     */
    CompletableFuture<GetAdvanceConfigResponse> getAdvanceConfig(GetAdvanceConfigRequest request);

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
      *
     */
    CompletableFuture<GetAdvanceConfigFileResponse> getAdvanceConfigFile(GetAdvanceConfigFileRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instance/{instanceId}/clusters/{clusterName}`
      *
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
      * ### Method
      * GET
      * ### URI
      * /openapi/ha3/instances/{instanceId}/cluster-run-time-info
      *
     */
    CompletableFuture<GetClusterRunTimeInfoResponse> getClusterRunTimeInfo(GetClusterRunTimeInfoRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
     */
    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    CompletableFuture<GetDataSourceDeployResponse> getDataSourceDeploy(GetDataSourceDeployRequest request);

    CompletableFuture<GetDatabaseSchemaResponse> getDatabaseSchema(GetDatabaseSchemaRequest request);

    /**
      * ## Method
      * GET
      * ## URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/deploy-graph
      * ```
      *
     */
    CompletableFuture<GetDeployGraphResponse> getDeployGraph(GetDeployGraphRequest request);

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      *
     */
    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    CompletableFuture<GetIndexOnlineStrategyResponse> getIndexOnlineStrategy(GetIndexOnlineStrategyRequest request);

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
      *
     */
    CompletableFuture<GetIndexVersionResponse> getIndexVersion(GetIndexVersionRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetNodeConfigResponse> getNodeConfig(GetNodeConfigRequest request);

    CompletableFuture<GetSqlInstanceResponse> getSqlInstance(GetSqlInstanceRequest request);

    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    CompletableFuture<GetTableGenerationResponse> getTableGeneration(GetTableGenerationRequest request);

    /**
      * ## Method
      * `GET`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir?dirName={dirName}`
      *
     */
    CompletableFuture<ListAdvanceConfigDirResponse> listAdvanceConfigDir(ListAdvanceConfigDirRequest request);

    /**
      * ## Sample requests
      * `GET /openapi/ha3/instances/ose-test1/advanced-configs`
      *
     */
    CompletableFuture<ListAdvanceConfigsResponse> listAdvanceConfigs(ListAdvanceConfigsRequest request);

    /**
      * ### Method
      * GET
      * ### URI
      * /openapi/ha3/instances/{instanceId}/cluster-names
      *
     */
    CompletableFuture<ListClusterNamesResponse> listClusterNames(ListClusterNamesRequest request);

    /**
      * ### Method
      * ```java
      * GET
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/cluster-tasks
      * ```
      *
     */
    CompletableFuture<ListClusterTasksResponse> listClusterTasks(ListClusterTasksRequest request);

    /**
      * ### Method
      * ```java
      * GET
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/clusters
      * ```
      *
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
      * ## Method
      * `GET`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/schemas`
      *
     */
    CompletableFuture<ListDataSourceSchemasResponse> listDataSourceSchemas(ListDataSourceSchemasRequest request);

    /**
      * ### Method
      * ```java
      * GET
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/data-source-tasks
      * ```
      *
     */
    CompletableFuture<ListDataSourceTasksResponse> listDataSourceTasks(ListDataSourceTasksRequest request);

    /**
      * ## Method
      * `GET`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources`
      *
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}`
      *
     */
    CompletableFuture<ListDateSourceGenerationsResponse> listDateSourceGenerations(ListDateSourceGenerationsRequest request);

    CompletableFuture<ListIndexRecoverRecordsResponse> listIndexRecoverRecords(ListIndexRecoverRecordsRequest request);

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes
      *
     */
    CompletableFuture<ListIndexesResponse> listIndexes(ListIndexesRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/specs?type=qrs`
      *
     */
    CompletableFuture<ListInstanceSpecsResponse> listInstanceSpecs(ListInstanceSpecsRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/[code]/instances`
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request);

    /**
      * ### Method
      * ```java
      * GET
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs?domain={domain}
      * ```
      *
     */
    CompletableFuture<ListOnlineConfigsResponse> listOnlineConfigs(ListOnlineConfigsRequest request);

    CompletableFuture<ListPausePolicysResponse> listPausePolicys(ListPausePolicysRequest request);

    CompletableFuture<ListPostQueryResultResponse> listPostQueryResult(ListPostQueryResultRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/query?query=xxxx`
      *
     */
    CompletableFuture<ListQueryResultResponse> listQueryResult(ListQueryResultRequest request);

    CompletableFuture<ListRestQueryResultResponse> listRestQueryResult(ListRestQueryResultRequest request);

    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    CompletableFuture<ListTableGenerationsResponse> listTableGenerations(ListTableGenerationsRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListVectorQueryResultResponse> listVectorQueryResult(ListVectorQueryResultRequest request);

    CompletableFuture<ModifyAdvanceConfigResponse> modifyAdvanceConfig(ModifyAdvanceConfigRequest request);

    /**
      * ## Method
      *     put
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
      *
     */
    CompletableFuture<ModifyAdvanceConfigFileResponse> modifyAdvanceConfigFile(ModifyAdvanceConfigFileRequest request);

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc`
      *
     */
    CompletableFuture<ModifyClusterDescResponse> modifyClusterDesc(ModifyClusterDescRequest request);

    /**
      * ## Request syntax
      *     PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
      *
     */
    CompletableFuture<ModifyClusterOfflineConfigResponse> modifyClusterOfflineConfig(ModifyClusterOfflineConfigRequest request);

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/cluster-online-config`
      *
     */
    CompletableFuture<ModifyClusterOnlineConfigResponse> modifyClusterOnlineConfig(ModifyClusterOnlineConfigRequest request);

    CompletableFuture<ModifyDataSourceDeployResponse> modifyDataSourceDeploy(ModifyDataSourceDeployRequest request);

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      *
     */
    CompletableFuture<ModifyFileResponse> modifyFile(ModifyFileRequest request);

    CompletableFuture<ModifyIndexResponse> modifyIndex(ModifyIndexRequest request);

    CompletableFuture<ModifyIndexOnlineStrategyResponse> modifyIndexOnlineStrategy(ModifyIndexOnlineStrategyRequest request);

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/index-partition`
      *
     */
    CompletableFuture<ModifyIndexPartitionResponse> modifyIndexPartition(ModifyIndexPartitionRequest request);

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
      *
     */
    CompletableFuture<ModifyIndexVersionResponse> modifyIndexVersion(ModifyIndexVersionRequest request);

    /**
      * ### Method
      * ```java
      * PUT
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/node-config?type=qrs&name=test
      * ```
      *
     */
    CompletableFuture<ModifyNodeConfigResponse> modifyNodeConfig(ModifyNodeConfigRequest request);

    /**
      * ### Method
      * ```java
      * put
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}
      * ```
      *
     */
    CompletableFuture<ModifyOnlineConfigResponse> modifyOnlineConfig(ModifyOnlineConfigRequest request);

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/password`
      *
     */
    CompletableFuture<ModifyPasswordResponse> modifyPassword(ModifyPasswordRequest request);

    CompletableFuture<ModifyPausePolicyResponse> modifyPausePolicy(ModifyPausePolicyRequest request);

    CompletableFuture<ModifyPublicUrlIpListResponse> modifyPublicUrlIpList(ModifyPublicUrlIpListRequest request);

    CompletableFuture<ModifyTableResponse> modifyTable(ModifyTableRequest request);

    /**
      * ## Method
      * ~~~
      * POST
      * ~~~
      * ## URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish
      * ~~~
      *
     */
    CompletableFuture<PublishAdvanceConfigResponse> publishAdvanceConfig(PublishAdvanceConfigRequest request);

    /**
      * ## Method
      *     POST
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/publish
      *
     */
    CompletableFuture<PublishIndexVersionResponse> publishIndexVersion(PublishIndexVersionRequest request);

    CompletableFuture<PushDocumentsResponse> pushDocuments(PushDocumentsRequest request);

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/recover-index`
      *
     */
    CompletableFuture<RecoverIndexResponse> recoverIndex(RecoverIndexRequest request);

    CompletableFuture<ReindexResponse> reindex(ReindexRequest request);

    /**
      * ### Method
      * ```java
      * DELETE
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/clusters/{clusterName}
      * ```
      *
     */
    CompletableFuture<RemoveClusterResponse> removeCluster(RemoveClusterRequest request);

    CompletableFuture<RenameFolderResponse> renameFolder(RenameFolderRequest request);

    CompletableFuture<StartIndexResponse> startIndex(StartIndexRequest request);

    CompletableFuture<StopIndexResponse> stopIndex(StopIndexRequest request);

    /**
      * ### Method
      * ```java
      * PUT
      * ```
      * ### URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/stop-task/{fsmId}
      * ```
      *
     */
    CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateSqlInstanceContentResponse> updateSqlInstanceContent(UpdateSqlInstanceContentRequest request);

    CompletableFuture<UpdateSqlInstanceNameResponse> updateSqlInstanceName(UpdateSqlInstanceNameRequest request);

    CompletableFuture<UpdateSqlInstanceParamsResponse> updateSqlInstanceParams(UpdateSqlInstanceParamsRequest request);

}
