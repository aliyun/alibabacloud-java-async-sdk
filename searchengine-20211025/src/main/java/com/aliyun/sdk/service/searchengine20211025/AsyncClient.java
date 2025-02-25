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
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/actions/build-index
     * </code></pre>
     * 
     * @param request the request parameters of BuildIndex  BuildIndexRequest
     * @return BuildIndexResponse
     */
    CompletableFuture<BuildIndexResponse> buildIndex(BuildIndexRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CloneSqlInstance  CloneSqlInstanceRequest
     * @return CloneSqlInstanceResponse
     */
    CompletableFuture<CloneSqlInstanceResponse> cloneSqlInstance(CloneSqlInstanceRequest request);

    /**
     * @param request the request parameters of CreateAlias  CreateAliasRequest
     * @return CreateAliasResponse
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#method"></a>Method</h3>
     * <p><code>POST</code></p>
     * <h3><a href="#uri"></a>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/clusters</code></p>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateConfigDir  CreateConfigDirRequest
     * @return CreateConfigDirResponse
     */
    CompletableFuture<CreateConfigDirResponse> createConfigDir(CreateConfigDirRequest request);

    /**
     * @param request the request parameters of CreateConfigFile  CreateConfigFileRequest
     * @return CreateConfigFileResponse
     */
    CompletableFuture<CreateConfigFileResponse> createConfigFile(CreateConfigFileRequest request);

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">POST
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/indexes
     * </code></pre>
     * 
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <p><code>POST</code></p>
     * <h3><a href="#uri"></a>URI</h3>
     * <p><code>/api/instances?dryRun=false</code></p>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreatePublicUrl  CreatePublicUrlRequest
     * @return CreatePublicUrlResponse
     */
    CompletableFuture<CreatePublicUrlResponse> createPublicUrl(CreatePublicUrlRequest request);

    /**
     * @param request the request parameters of CreateSqlInstance  CreateSqlInstanceRequest
     * @return CreateSqlInstanceResponse
     */
    CompletableFuture<CreateSqlInstanceResponse> createSqlInstance(CreateSqlInstanceRequest request);

    /**
     * @param request the request parameters of CreateTable  CreateTableRequest
     * @return CreateTableResponse
     */
    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
     * </code></pre>
     * 
     * @param request the request parameters of DeleteAdvanceConfig  DeleteAdvanceConfigRequest
     * @return DeleteAdvanceConfigResponse
     */
    CompletableFuture<DeleteAdvanceConfigResponse> deleteAdvanceConfig(DeleteAdvanceConfigRequest request);

    /**
     * @param request the request parameters of DeleteAlias  DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
     * @param request the request parameters of DeleteConfigDir  DeleteConfigDirRequest
     * @return DeleteConfigDirResponse
     */
    CompletableFuture<DeleteConfigDirResponse> deleteConfigDir(DeleteConfigDirRequest request);

    /**
     * @param request the request parameters of DeleteConfigFile  DeleteConfigFileRequest
     * @return DeleteConfigFileResponse
     */
    CompletableFuture<DeleteConfigFileResponse> deleteConfigFile(DeleteConfigFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>DELETE</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}</code></p>
     * 
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}?dataSource=xxx
     * </code></pre>
     * 
     * @param request the request parameters of DeleteIndex  DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>DELETE
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}
     * </code></pre>
     * 
     * @param request the request parameters of DeleteIndexVersion  DeleteIndexVersionRequest
     * @return DeleteIndexVersionResponse
     */
    CompletableFuture<DeleteIndexVersionResponse> deleteIndexVersion(DeleteIndexVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>DELETE</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeletePublicUrl  DeletePublicUrlRequest
     * @return DeletePublicUrlResponse
     */
    CompletableFuture<DeletePublicUrlResponse> deletePublicUrl(DeletePublicUrlRequest request);

    /**
     * @param request the request parameters of DeleteSqlInstance  DeleteSqlInstanceRequest
     * @return DeleteSqlInstanceResponse
     */
    CompletableFuture<DeleteSqlInstanceResponse> deleteSqlInstance(DeleteSqlInstanceRequest request);

    /**
     * @param request the request parameters of DeleteTable  DeleteTableRequest
     * @return DeleteTableResponse
     */
    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of ExecuteSqlInstance  ExecuteSqlInstanceRequest
     * @return ExecuteSqlInstanceResponse
     */
    CompletableFuture<ExecuteSqlInstanceResponse> executeSqlInstance(ExecuteSqlInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3><a href="#uri"></a>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/force-switch/{fsmId}
     * </code></pre>
     * 
     * @param request the request parameters of ForceSwitch  ForceSwitchRequest
     * @return ForceSwitchResponse
     */
    CompletableFuture<ForceSwitchResponse> forceSwitch(ForceSwitchRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
     * </code></pre>
     * 
     * @param request the request parameters of GetAdvanceConfig  GetAdvanceConfigRequest
     * @return GetAdvanceConfigResponse
     */
    CompletableFuture<GetAdvanceConfigResponse> getAdvanceConfig(GetAdvanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
     * </code></pre>
     * 
     * @param request the request parameters of GetAdvanceConfigFile  GetAdvanceConfigFileRequest
     * @return GetAdvanceConfigFileResponse
     */
    CompletableFuture<GetAdvanceConfigFileResponse> getAdvanceConfigFile(GetAdvanceConfigFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instance/{instanceId}/clusters/{clusterName}</code></p>
     * 
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p>GET</p>
     * <h3>URI</h3>
     * <p>/openapi/ha3/instances/{instanceId}/cluster-run-time-info</p>
     * 
     * @param request the request parameters of GetClusterRunTimeInfo  GetClusterRunTimeInfoRequest
     * @return GetClusterRunTimeInfoResponse
     */
    CompletableFuture<GetClusterRunTimeInfoResponse> getClusterRunTimeInfo(GetClusterRunTimeInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}</code></p>
     * 
     * @param request the request parameters of GetDataSource  GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    /**
     * @param request the request parameters of GetDataSourceDeploy  GetDataSourceDeployRequest
     * @return GetDataSourceDeployResponse
     */
    CompletableFuture<GetDataSourceDeployResponse> getDataSourceDeploy(GetDataSourceDeployRequest request);

    /**
     * @param request the request parameters of GetDatabaseSchema  GetDatabaseSchemaRequest
     * @return GetDatabaseSchemaResponse
     */
    CompletableFuture<GetDatabaseSchemaResponse> getDatabaseSchema(GetDatabaseSchemaRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p>GET</p>
     * <h2>URI</h2>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/deploy-graph
     * </code></pre>
     * 
     * @param request the request parameters of GetDeployGraph  GetDeployGraphRequest
     * @return GetDeployGraphResponse
     */
    CompletableFuture<GetDeployGraphResponse> getDeployGraph(GetDeployGraphRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2><a href="#uri"></a>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file
     * </code></pre>
     * 
     * @param request the request parameters of GetFile  GetFileRequest
     * @return GetFileResponse
     */
    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2><a href="#uri"></a>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}
     * </code></pre>
     * 
     * @param request the request parameters of GetIndex  GetIndexRequest
     * @return GetIndexResponse
     */
    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    /**
     * @param request the request parameters of GetIndexOnlineStrategy  GetIndexOnlineStrategyRequest
     * @return GetIndexOnlineStrategyResponse
     */
    CompletableFuture<GetIndexOnlineStrategyResponse> getIndexOnlineStrategy(GetIndexOnlineStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
     * </code></pre>
     * 
     * @param request the request parameters of GetIndexVersion  GetIndexVersionRequest
     * @return GetIndexVersionResponse
     */
    CompletableFuture<GetIndexVersionResponse> getIndexVersion(GetIndexVersionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3><a href="#uri"></a>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}
     * </code></pre>
     * 
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetNodeConfig  GetNodeConfigRequest
     * @return GetNodeConfigResponse
     */
    CompletableFuture<GetNodeConfigResponse> getNodeConfig(GetNodeConfigRequest request);

    /**
     * @param request the request parameters of GetSqlInstance  GetSqlInstanceRequest
     * @return GetSqlInstanceResponse
     */
    CompletableFuture<GetSqlInstanceResponse> getSqlInstance(GetSqlInstanceRequest request);

    /**
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    /**
     * @param request the request parameters of GetTableGeneration  GetTableGenerationRequest
     * @return GetTableGenerationResponse
     */
    CompletableFuture<GetTableGenerationResponse> getTableGeneration(GetTableGenerationRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir?dirName={dirName}</code></p>
     * 
     * @param request the request parameters of ListAdvanceConfigDir  ListAdvanceConfigDirRequest
     * @return ListAdvanceConfigDirResponse
     */
    CompletableFuture<ListAdvanceConfigDirResponse> listAdvanceConfigDir(ListAdvanceConfigDirRequest request);

    /**
     * <b>description</b> :
     * <h2>Sample requests</h2>
     * <p><code>GET /openapi/ha3/instances/ose-test1/advanced-configs</code></p>
     * 
     * @param request the request parameters of ListAdvanceConfigs  ListAdvanceConfigsRequest
     * @return ListAdvanceConfigsResponse
     */
    CompletableFuture<ListAdvanceConfigsResponse> listAdvanceConfigs(ListAdvanceConfigsRequest request);

    /**
     * @param request the request parameters of ListAliases  ListAliasesRequest
     * @return ListAliasesResponse
     */
    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p>GET</p>
     * <h3>URI</h3>
     * <p>/openapi/ha3/instances/{instanceId}/cluster-names</p>
     * 
     * @param request the request parameters of ListClusterNames  ListClusterNamesRequest
     * @return ListClusterNamesResponse
     */
    CompletableFuture<ListClusterNamesResponse> listClusterNames(ListClusterNamesRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/cluster-tasks
     * </code></pre>
     * 
     * @param request the request parameters of ListClusterTasks  ListClusterTasksRequest
     * @return ListClusterTasksResponse
     */
    CompletableFuture<ListClusterTasksResponse> listClusterTasks(ListClusterTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/clusters
     * </code></pre>
     * 
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/schemas</code></p>
     * 
     * @param request the request parameters of ListDataSourceSchemas  ListDataSourceSchemasRequest
     * @return ListDataSourceSchemasResponse
     */
    CompletableFuture<ListDataSourceSchemasResponse> listDataSourceSchemas(ListDataSourceSchemasRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3><a href="#uri"></a>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/data-source-tasks
     * </code></pre>
     * 
     * @param request the request parameters of ListDataSourceTasks  ListDataSourceTasksRequest
     * @return ListDataSourceTasksResponse
     */
    CompletableFuture<ListDataSourceTasksResponse> listDataSourceTasks(ListDataSourceTasksRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <p><code>GET</code></p>
     * <h2>URI</h2>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources</code></p>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}</code></p>
     * 
     * @param request the request parameters of ListDateSourceGenerations  ListDateSourceGenerationsRequest
     * @return ListDateSourceGenerationsResponse
     */
    CompletableFuture<ListDateSourceGenerationsResponse> listDateSourceGenerations(ListDateSourceGenerationsRequest request);

    /**
     * @param request the request parameters of ListIndexRecoverRecords  ListIndexRecoverRecordsRequest
     * @return ListIndexRecoverRecordsResponse
     */
    CompletableFuture<ListIndexRecoverRecordsResponse> listIndexRecoverRecords(ListIndexRecoverRecordsRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>GET
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes
     * </code></pre>
     * 
     * @param request the request parameters of ListIndexes  ListIndexesRequest
     * @return ListIndexesResponse
     */
    CompletableFuture<ListIndexesResponse> listIndexes(ListIndexesRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>GET</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/specs?type=qrs</code></p>
     * 
     * @param request the request parameters of ListInstanceSpecs  ListInstanceSpecsRequest
     * @return ListInstanceSpecsResponse
     */
    CompletableFuture<ListInstanceSpecsResponse> listInstanceSpecs(ListInstanceSpecsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <p><code>GET</code></p>
     * <h3><a href="#uri"></a>URI</h3>
     * <p><code>/openapi/ha3/instances</code></p>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLogs  ListLogsRequest
     * @return ListLogsResponse
     */
    CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">GET
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs?domain={domain}
     * </code></pre>
     * 
     * @param request the request parameters of ListOnlineConfigs  ListOnlineConfigsRequest
     * @return ListOnlineConfigsResponse
     */
    CompletableFuture<ListOnlineConfigsResponse> listOnlineConfigs(ListOnlineConfigsRequest request);

    /**
     * @param request the request parameters of ListPausePolicys  ListPausePolicysRequest
     * @return ListPausePolicysResponse
     */
    CompletableFuture<ListPausePolicysResponse> listPausePolicys(ListPausePolicysRequest request);

    /**
     * @param request the request parameters of ListPostQueryResult  ListPostQueryResultRequest
     * @return ListPostQueryResultResponse
     */
    CompletableFuture<ListPostQueryResultResponse> listPostQueryResult(ListPostQueryResultRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <p><code>GET</code></p>
     * <h3><a href="#uri"></a>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/query?query=xxxx</code></p>
     * 
     * @param request the request parameters of ListQueryResult  ListQueryResultRequest
     * @return ListQueryResultResponse
     */
    CompletableFuture<ListQueryResultResponse> listQueryResult(ListQueryResultRequest request);

    /**
     * @param request the request parameters of ListRestQueryResult  ListRestQueryResultRequest
     * @return ListRestQueryResultResponse
     */
    CompletableFuture<ListRestQueryResultResponse> listRestQueryResult(ListRestQueryResultRequest request);

    /**
     * @param request the request parameters of ListSchemas  ListSchemasRequest
     * @return ListSchemasResponse
     */
    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    /**
     * @param request the request parameters of ListTableGenerations  ListTableGenerationsRequest
     * @return ListTableGenerationsResponse
     */
    CompletableFuture<ListTableGenerationsResponse> listTableGenerations(ListTableGenerationsRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of ListVectorQueryResult  ListVectorQueryResultRequest
     * @return ListVectorQueryResultResponse
     */
    CompletableFuture<ListVectorQueryResultResponse> listVectorQueryResult(ListVectorQueryResultRequest request);

    /**
     * @param request the request parameters of ModifyAdvanceConfig  ModifyAdvanceConfigRequest
     * @return ModifyAdvanceConfigResponse
     */
    CompletableFuture<ModifyAdvanceConfigResponse> modifyAdvanceConfig(ModifyAdvanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>put
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
     * </code></pre>
     * 
     * @param request the request parameters of ModifyAdvanceConfigFile  ModifyAdvanceConfigFileRequest
     * @return ModifyAdvanceConfigFileResponse
     */
    CompletableFuture<ModifyAdvanceConfigFileResponse> modifyAdvanceConfigFile(ModifyAdvanceConfigFileRequest request);

    /**
     * @param request the request parameters of ModifyAlias  ModifyAliasRequest
     * @return ModifyAliasResponse
     */
    CompletableFuture<ModifyAliasResponse> modifyAlias(ModifyAliasRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <p><code>PUT</code></p>
     * <h3><a href="#uri"></a>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc</code></p>
     * 
     * @param request the request parameters of ModifyClusterDesc  ModifyClusterDescRequest
     * @return ModifyClusterDescResponse
     */
    CompletableFuture<ModifyClusterDescResponse> modifyClusterDesc(ModifyClusterDescRequest request);

    /**
     * <b>description</b> :
     * <h2>Request syntax</h2>
     * <pre><code>PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
     * </code></pre>
     * 
     * @param request the request parameters of ModifyClusterOfflineConfig  ModifyClusterOfflineConfigRequest
     * @return ModifyClusterOfflineConfigResponse
     */
    CompletableFuture<ModifyClusterOfflineConfigResponse> modifyClusterOfflineConfig(ModifyClusterOfflineConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/cluster-online-config</code></p>
     * 
     * @param request the request parameters of ModifyClusterOnlineConfig  ModifyClusterOnlineConfigRequest
     * @return ModifyClusterOnlineConfigResponse
     */
    CompletableFuture<ModifyClusterOnlineConfigResponse> modifyClusterOnlineConfig(ModifyClusterOnlineConfigRequest request);

    /**
     * @param request the request parameters of ModifyDataSourceDeploy  ModifyDataSourceDeployRequest
     * @return ModifyDataSourceDeployResponse
     */
    CompletableFuture<ModifyDataSourceDeployResponse> modifyDataSourceDeploy(ModifyDataSourceDeployRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>PUT
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
     * </code></pre>
     * 
     * @param request the request parameters of ModifyFile  ModifyFileRequest
     * @return ModifyFileResponse
     */
    CompletableFuture<ModifyFileResponse> modifyFile(ModifyFileRequest request);

    /**
     * @param request the request parameters of ModifyIndex  ModifyIndexRequest
     * @return ModifyIndexResponse
     */
    CompletableFuture<ModifyIndexResponse> modifyIndex(ModifyIndexRequest request);

    /**
     * @param request the request parameters of ModifyIndexOnlineStrategy  ModifyIndexOnlineStrategyRequest
     * @return ModifyIndexOnlineStrategyResponse
     */
    CompletableFuture<ModifyIndexOnlineStrategyResponse> modifyIndexOnlineStrategy(ModifyIndexOnlineStrategyRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/index-partition</code></p>
     * 
     * @param request the request parameters of ModifyIndexPartition  ModifyIndexPartitionRequest
     * @return ModifyIndexPartitionResponse
     */
    CompletableFuture<ModifyIndexPartitionResponse> modifyIndexPartition(ModifyIndexPartitionRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Method</h2>
     * <pre><code>PUT
     * </code></pre>
     * <h2><a href="#uri"></a>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
     * </code></pre>
     * 
     * @param request the request parameters of ModifyIndexVersion  ModifyIndexVersionRequest
     * @return ModifyIndexVersionResponse
     */
    CompletableFuture<ModifyIndexVersionResponse> modifyIndexVersion(ModifyIndexVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node-config?type=qrs&amp;name=test
     * </code></pre>
     * 
     * @param request the request parameters of ModifyNodeConfig  ModifyNodeConfigRequest
     * @return ModifyNodeConfigResponse
     */
    CompletableFuture<ModifyNodeConfigResponse> modifyNodeConfig(ModifyNodeConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">put
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}
     * </code></pre>
     * 
     * @param request the request parameters of ModifyOnlineConfig  ModifyOnlineConfigRequest
     * @return ModifyOnlineConfigResponse
     */
    CompletableFuture<ModifyOnlineConfigResponse> modifyOnlineConfig(ModifyOnlineConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/password</code></p>
     * 
     * @param request the request parameters of ModifyPassword  ModifyPasswordRequest
     * @return ModifyPasswordResponse
     */
    CompletableFuture<ModifyPasswordResponse> modifyPassword(ModifyPasswordRequest request);

    /**
     * @param request the request parameters of ModifyPausePolicy  ModifyPausePolicyRequest
     * @return ModifyPausePolicyResponse
     */
    CompletableFuture<ModifyPausePolicyResponse> modifyPausePolicy(ModifyPausePolicyRequest request);

    /**
     * @param request the request parameters of ModifyPublicUrlIpList  ModifyPublicUrlIpListRequest
     * @return ModifyPublicUrlIpListResponse
     */
    CompletableFuture<ModifyPublicUrlIpListResponse> modifyPublicUrlIpList(ModifyPublicUrlIpListRequest request);

    /**
     * @param request the request parameters of ModifyTable  ModifyTableRequest
     * @return ModifyTableResponse
     */
    CompletableFuture<ModifyTableResponse> modifyTable(ModifyTableRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish
     * </code></pre>
     * 
     * @param request the request parameters of PublishAdvanceConfig  PublishAdvanceConfigRequest
     * @return PublishAdvanceConfigResponse
     */
    CompletableFuture<PublishAdvanceConfigResponse> publishAdvanceConfig(PublishAdvanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Method</h2>
     * <pre><code>POST
     * </code></pre>
     * <h2>URI</h2>
     * <pre><code>/openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/publish
     * </code></pre>
     * 
     * @param request the request parameters of PublishIndexVersion  PublishIndexVersionRequest
     * @return PublishIndexVersionResponse
     */
    CompletableFuture<PublishIndexVersionResponse> publishIndexVersion(PublishIndexVersionRequest request);

    /**
     * @param request the request parameters of PushDocuments  PushDocumentsRequest
     * @return PushDocumentsResponse
     */
    CompletableFuture<PushDocumentsResponse> pushDocuments(PushDocumentsRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <p><code>POST</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}/recover-index</code></p>
     * 
     * @param request the request parameters of RecoverIndex  RecoverIndexRequest
     * @return RecoverIndexResponse
     */
    CompletableFuture<RecoverIndexResponse> recoverIndex(RecoverIndexRequest request);

    /**
     * @param request the request parameters of Reindex  ReindexRequest
     * @return ReindexResponse
     */
    CompletableFuture<ReindexResponse> reindex(ReindexRequest request);

    /**
     * <b>description</b> :
     * <h3>Method</h3>
     * <pre><code class="language-java">DELETE
     * </code></pre>
     * <h3>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/clusters/{clusterName}
     * </code></pre>
     * 
     * @param request the request parameters of RemoveCluster  RemoveClusterRequest
     * @return RemoveClusterResponse
     */
    CompletableFuture<RemoveClusterResponse> removeCluster(RemoveClusterRequest request);

    /**
     * @param request the request parameters of RenameFolder  RenameFolderRequest
     * @return RenameFolderResponse
     */
    CompletableFuture<RenameFolderResponse> renameFolder(RenameFolderRequest request);

    /**
     * @param request the request parameters of StartIndex  StartIndexRequest
     * @return StartIndexResponse
     */
    CompletableFuture<StartIndexResponse> startIndex(StartIndexRequest request);

    /**
     * @param request the request parameters of StopIndex  StopIndexRequest
     * @return StopIndexResponse
     */
    CompletableFuture<StopIndexResponse> stopIndex(StopIndexRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Method</h3>
     * <pre><code class="language-java">PUT
     * </code></pre>
     * <h3><a href="#uri"></a>URI</h3>
     * <pre><code class="language-java">/openapi/ha3/instances/{instanceId}/stop-task/{fsmId}
     * </code></pre>
     * 
     * @param request the request parameters of StopTask  StopTaskRequest
     * @return StopTaskResponse
     */
    CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request);

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
     * <h3>Method</h3>
     * <p><code>PUT</code></p>
     * <h3>URI</h3>
     * <p><code>/openapi/ha3/instances/{instanceId}</code></p>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateSqlInstanceContent  UpdateSqlInstanceContentRequest
     * @return UpdateSqlInstanceContentResponse
     */
    CompletableFuture<UpdateSqlInstanceContentResponse> updateSqlInstanceContent(UpdateSqlInstanceContentRequest request);

    /**
     * @param request the request parameters of UpdateSqlInstanceName  UpdateSqlInstanceNameRequest
     * @return UpdateSqlInstanceNameResponse
     */
    CompletableFuture<UpdateSqlInstanceNameResponse> updateSqlInstanceName(UpdateSqlInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdateSqlInstanceParams  UpdateSqlInstanceParamsRequest
     * @return UpdateSqlInstanceParamsResponse
     */
    CompletableFuture<UpdateSqlInstanceParamsResponse> updateSqlInstanceParams(UpdateSqlInstanceParamsRequest request);

}
