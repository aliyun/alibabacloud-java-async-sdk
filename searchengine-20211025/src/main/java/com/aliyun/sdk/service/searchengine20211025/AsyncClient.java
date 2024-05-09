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

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters`
      *
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

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

    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
     */
    CompletableFuture<DeleteAdvanceConfigResponse> deleteAdvanceConfig(DeleteAdvanceConfigRequest request);

    /**
      * ## Method
      * `DELETE`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

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

    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

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

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}`
      *
     */
    CompletableFuture<ListDateSourceGenerationsResponse> listDateSourceGenerations(ListDateSourceGenerationsRequest request);

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

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/query?query=xxxx`
      *
     */
    CompletableFuture<ListQueryResultResponse> listQueryResult(ListQueryResultRequest request);

    CompletableFuture<ListTableGenerationsResponse> listTableGenerations(ListTableGenerationsRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

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

    /**
      * ## Method
      * `PUT`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
     */
    CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request);

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      *
     */
    CompletableFuture<ModifyFileResponse> modifyFile(ModifyFileRequest request);

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

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

}
