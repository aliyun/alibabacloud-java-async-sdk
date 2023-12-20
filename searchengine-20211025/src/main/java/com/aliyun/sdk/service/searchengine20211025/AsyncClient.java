// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.searchengine20211025.models.*;
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

    /**
      * The result returned
      *
     */
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
      * The information about the index
      *
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
      * The result
      *
     */
    CompletableFuture<DeleteIndexVersionResponse> deleteIndexVersion(DeleteIndexVersionRequest request);

    /**
      * The result returned
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

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

    CompletableFuture<GetAdvanceConfigFileResponse> getAdvanceConfigFile(GetAdvanceConfigFileRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instance/{instanceId}/clusters/{clusterName}`
      *
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    CompletableFuture<GetClusterRunTimeInfoResponse> getClusterRunTimeInfo(GetClusterRunTimeInfoRequest request);

    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    CompletableFuture<GetDataSourceDeployResponse> getDataSourceDeploy(GetDataSourceDeployRequest request);

    /**
      * ### Sample requests
      * ```java
      * GET /openapi/ha3/instances/{instanceId}/deploy-graph
      * ```
      *
     */
    CompletableFuture<GetDeployGraphResponse> getDeployGraph(GetDeployGraphRequest request);

    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    /**
      * ## Examples
      * Sample requests
      *     GET  /openapi/ha3/instances/ha3_instance_id_1/clusters/cluster1/index-version
      *
     */
    CompletableFuture<GetIndexVersionResponse> getIndexVersion(GetIndexVersionRequest request);

    /**
      * The billing method.
      *
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetNodeConfigResponse> getNodeConfig(GetNodeConfigRequest request);

    /**
      * ## Sample requests
      * `GET /openapi/ha3/instances/ose-test1/advanced-configs`
      *
     */
    CompletableFuture<ListAdvanceConfigDirResponse> listAdvanceConfigDir(ListAdvanceConfigDirRequest request);

    /**
      * http
      *
     */
    CompletableFuture<ListAdvanceConfigsResponse> listAdvanceConfigs(ListAdvanceConfigsRequest request);

    /**
      * ### Sample requests
      * ```java
      * GET /openapi/ha3/instances/ha3_instance_name/cluster-names
      * ```
      *
     */
    CompletableFuture<ListClusterNamesResponse> listClusterNames(ListClusterNamesRequest request);

    CompletableFuture<ListClusterTasksResponse> listClusterTasks(ListClusterTasksRequest request);

    /**
      * http
      *
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
      * Obtains the schema information of a specified data source.
      *
     */
    CompletableFuture<ListDataSourceSchemasResponse> listDataSourceSchemas(ListDataSourceSchemasRequest request);

    CompletableFuture<ListDataSourceTasksResponse> listDataSourceTasks(ListDataSourceTasksRequest request);

    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}`
      *
     */
    CompletableFuture<ListDateSourceGenerationsResponse> listDateSourceGenerations(ListDateSourceGenerationsRequest request);

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
      * Indicates whether an overdue payment is involved
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * \\### Sample requests
      * ```java
      * GET  /openapi/ha3/instances/ha-test1/node/ihome_searcher/online-configs?domain=pre_ea120
      * ```
      *
     */
    CompletableFuture<ListOnlineConfigsResponse> listOnlineConfigs(ListOnlineConfigsRequest request);

    /**
      * The ID of the instance
      *
     */
    CompletableFuture<ListQueryResultResponse> listQueryResult(ListQueryResultRequest request);

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
      *     ...
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
      * The result returned
      *
     */
    CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request);

    /**
      * ### Method
      * ~~~
      * PUT
      * ~~~
      * ### URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      * ~~~
      *
     */
    CompletableFuture<ModifyFileResponse> modifyFile(ModifyFileRequest request);

    /**
      * The information about each index.
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
      *  ~~~
      * PUT
      * ~~~
      * ### URI
      * ~~~
      * /openapi/ha3/instances/{instanceId}/node-config?type=qrs&name=test
      * ~~~
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
      * The information about the index
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

    /**
      * The result
      *
     */
    CompletableFuture<RemoveClusterResponse> removeCluster(RemoveClusterRequest request);

    /**
      * The information about the index
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
