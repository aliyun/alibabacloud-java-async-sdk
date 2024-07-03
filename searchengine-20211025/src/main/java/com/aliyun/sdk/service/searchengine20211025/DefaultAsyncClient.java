// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.searchengine20211025.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "searchengine";
        this.version = "2021-10-25";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * ## Method
      *     POST
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/actions/build-index
      *
     */
    @Override
    public CompletableFuture<BuildIndexResponse> buildIndex(BuildIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BuildIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/actions/build-index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BuildIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BuildIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/actions/change-resource-group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CloneSqlInstanceResponse> cloneSqlInstance(CloneSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneSqlInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}/actions/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlias").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/aliases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters`
      *
     */
    @Override
    public CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCluster").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateConfigDirResponse> createConfigDir(CreateConfigDirRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConfigDir").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigDirResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigDirResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateConfigFileResponse> createConfigFile(CreateConfigFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConfigFile").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFolder").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/folders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/api/instances?dryRun=false`
      *
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreatePublicUrlResponse> createPublicUrl(CreatePublicUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePublicUrl").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/public-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePublicUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePublicUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateSqlInstanceResponse> createSqlInstance(CreateSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSqlInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTable").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
     */
    @Override
    public CompletableFuture<DeleteAdvanceConfigResponse> deleteAdvanceConfig(DeleteAdvanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAdvanceConfig").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAdvanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAdvanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlias").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/aliases/{alias}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteConfigDirResponse> deleteConfigDir(DeleteConfigDirRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConfigDir").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigDirResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigDirResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteConfigFileResponse> deleteConfigFile(DeleteConfigFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConfigFile").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      * `DELETE`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
     */
    @Override
    public CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataSource").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFolder").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/folders/{folderId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}?dataSource=xxx
      *
     */
    @Override
    public CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndex").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     DELETE
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}
      *
     */
    @Override
    public CompletableFuture<DeleteIndexVersionResponse> deleteIndexVersion(DeleteIndexVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndexVersion").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `DELETE`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstance").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeletePublicUrlResponse> deletePublicUrl(DeletePublicUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePublicUrl").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/public-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePublicUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePublicUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteSqlInstanceResponse> deleteSqlInstance(DeleteSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSqlInstance").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTable").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/tables/{tableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRegions").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ExecuteSqlInstanceResponse> executeSqlInstance(ExecuteSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteSqlInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}/actions/execution").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ForceSwitchResponse> forceSwitch(ForceSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ForceSwitch").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/force-switch/{fsmId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ForceSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ForceSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}
      *
     */
    @Override
    public CompletableFuture<GetAdvanceConfigResponse> getAdvanceConfig(GetAdvanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAdvanceConfig").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAdvanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAdvanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
      *
     */
    @Override
    public CompletableFuture<GetAdvanceConfigFileResponse> getAdvanceConfigFile(GetAdvanceConfigFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAdvanceConfigFile").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAdvanceConfigFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAdvanceConfigFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instance/{instanceId}/clusters/{clusterName}`
      *
     */
    @Override
    public CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCluster").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters/{clusterName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * GET
      * ### URI
      * /openapi/ha3/instances/{instanceId}/cluster-run-time-info
      *
     */
    @Override
    public CompletableFuture<GetClusterRunTimeInfoResponse> getClusterRunTimeInfo(GetClusterRunTimeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterRunTimeInfo").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/cluster-run-time-info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterRunTimeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterRunTimeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}`
      *
     */
    @Override
    public CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataSource").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDataSourceDeployResponse> getDataSourceDeploy(GetDataSourceDeployRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataSourceDeploy").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/deploys/{deployName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataSourceDeployResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataSourceDeployResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDatabaseSchemaResponse> getDatabaseSchema(GetDatabaseSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDatabaseSchema").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/tables/{tableName}/schema").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatabaseSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatabaseSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      * GET
      * ## URI
      * ```java
      * /openapi/ha3/instances/{instanceId}/deploy-graph
      * ```
      *
     */
    @Override
    public CompletableFuture<GetDeployGraphResponse> getDeployGraph(GetDeployGraphRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeployGraph").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/deploy-graph").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeployGraphResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeployGraphResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      *
     */
    @Override
    public CompletableFuture<GetFileResponse> getFile(GetFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFile").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndex").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetIndexOnlineStrategyResponse> getIndexOnlineStrategy(GetIndexOnlineStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndexOnlineStrategy").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/deploys/{deployName}/indexes/{indexName}/online-strategy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexOnlineStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexOnlineStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
      *
     */
    @Override
    public CompletableFuture<GetIndexVersionResponse> getIndexVersion(GetIndexVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndexVersion").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstance").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetNodeConfigResponse> getNodeConfig(GetNodeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNodeConfig").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/node-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetSqlInstanceResponse> getSqlInstance(GetSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSqlInstance").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetTableResponse> getTable(GetTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTable").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/tables/{tableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetTableGenerationResponse> getTableGeneration(GetTableGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTableGeneration").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/tables/{tableName}/index_versions/{generationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      * `GET`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir?dirName={dirName}`
      *
     */
    @Override
    public CompletableFuture<ListAdvanceConfigDirResponse> listAdvanceConfigDir(ListAdvanceConfigDirRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAdvanceConfigDir").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/dir").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAdvanceConfigDirResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAdvanceConfigDirResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Sample requests
      * `GET /openapi/ha3/instances/ose-test1/advanced-configs`
      *
     */
    @Override
    public CompletableFuture<ListAdvanceConfigsResponse> listAdvanceConfigs(ListAdvanceConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAdvanceConfigs").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAdvanceConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAdvanceConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAliases").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/aliases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAliasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAliasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * GET
      * ### URI
      * /openapi/ha3/instances/{instanceId}/cluster-names
      *
     */
    @Override
    public CompletableFuture<ListClusterNamesResponse> listClusterNames(ListClusterNamesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterNames").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/cluster-names").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterNamesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterNamesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListClusterTasksResponse> listClusterTasks(ListClusterTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterTasks").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/cluster-tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusters").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      * `GET`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/schemas`
      *
     */
    @Override
    public CompletableFuture<ListDataSourceSchemasResponse> listDataSourceSchemas(ListDataSourceSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSourceSchemas").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourceSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourceSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListDataSourceTasksResponse> listDataSourceTasks(ListDataSourceTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSourceTasks").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-source-tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourceTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourceTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      * `GET`
      * ## URI
      * `/openapi/ha3/instances/{instanceId}/data-sources`
      *
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSources").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatabases").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations?domainName={domainName}`
      *
     */
    @Override
    public CompletableFuture<ListDateSourceGenerationsResponse> listDateSourceGenerations(ListDateSourceGenerationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDateSourceGenerations").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/generations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDateSourceGenerationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDateSourceGenerationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIndexRecoverRecordsResponse> listIndexRecoverRecords(ListIndexRecoverRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexRecoverRecords").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/list-recover-records").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexRecoverRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexRecoverRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     GET
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes
      *
     */
    @Override
    public CompletableFuture<ListIndexesResponse> listIndexes(ListIndexesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexes").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/specs?type=qrs`
      *
     */
    @Override
    public CompletableFuture<ListInstanceSpecsResponse> listInstanceSpecs(ListInstanceSpecsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceSpecs").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/specs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceSpecsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceSpecsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/[code]/instances`
      *
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogs").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListOnlineConfigsResponse> listOnlineConfigs(ListOnlineConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOnlineConfigs").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOnlineConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOnlineConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPausePolicysResponse> listPausePolicys(ListPausePolicysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPausePolicys").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/pause-policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPausePolicysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPausePolicysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPostQueryResultResponse> listPostQueryResult(ListPostQueryResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPostQueryResult").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPostQueryResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPostQueryResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `GET`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/query?query=xxxx`
      *
     */
    @Override
    public CompletableFuture<ListQueryResultResponse> listQueryResult(ListQueryResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListQueryResult").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQueryResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQueryResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListRestQueryResultResponse> listRestQueryResult(ListRestQueryResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRestQueryResult").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/rest-query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRestQueryResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRestQueryResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSchemas").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTableGenerationsResponse> listTableGenerations(ListTableGenerationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTableGenerations").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/tables/{tableName}/index_versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTableGenerationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTableGenerationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTables").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/resource-tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTasks").setMethod(HttpMethod.GET).setPathRegex("/openapi/ha3/instances/{instanceId}/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListVectorQueryResultResponse> listVectorQueryResult(ListVectorQueryResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVectorQueryResult").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/vector-query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVectorQueryResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVectorQueryResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyAdvanceConfigResponse> modifyAdvanceConfig(ModifyAdvanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyAdvanceConfig").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAdvanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAdvanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     put
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file?fileName={fileName}
      *
     */
    @Override
    public CompletableFuture<ModifyAdvanceConfigFileResponse> modifyAdvanceConfigFile(ModifyAdvanceConfigFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyAdvanceConfigFile").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAdvanceConfigFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAdvanceConfigFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyAliasResponse> modifyAlias(ModifyAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyAlias").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/aliases/{alias}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc`
      *
     */
    @Override
    public CompletableFuture<ModifyClusterDescResponse> modifyClusterDesc(ModifyClusterDescRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterDesc").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/desc").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterDescResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterDescResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Request syntax
      *     PUT /openapi/ha3/instances/{instanceId}/cluster-offline-config
      *
     */
    @Override
    public CompletableFuture<ModifyClusterOfflineConfigResponse> modifyClusterOfflineConfig(ModifyClusterOfflineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterOfflineConfig").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/cluster-offline-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterOfflineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterOfflineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/cluster-online-config`
      *
     */
    @Override
    public CompletableFuture<ModifyClusterOnlineConfigResponse> modifyClusterOnlineConfig(ModifyClusterOnlineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterOnlineConfig").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/cluster-online-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterOnlineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterOnlineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDataSourceDeployResponse> modifyDataSourceDeploy(ModifyDataSourceDeployRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyDataSourceDeploy").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/deploys/{deployName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDataSourceDeployResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDataSourceDeployResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file?fileName=/root/test.txt
      *
     */
    @Override
    public CompletableFuture<ModifyFileResponse> modifyFile(ModifyFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyFile").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/versions/{versionName}/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIndexResponse> modifyIndex(ModifyIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyIndex").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIndexOnlineStrategyResponse> modifyIndexOnlineStrategy(ModifyIndexOnlineStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyIndexOnlineStrategy").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/deploys/{deployName}/indexes/{indexName}/online-strategy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIndexOnlineStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIndexOnlineStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/index-partition`
      *
     */
    @Override
    public CompletableFuture<ModifyIndexPartitionResponse> modifyIndexPartition(ModifyIndexPartitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyIndexPartition").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/index-partition").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIndexPartitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIndexPartitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     PUT
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version
      *
     */
    @Override
    public CompletableFuture<ModifyIndexVersionResponse> modifyIndexVersion(ModifyIndexVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyIndexVersion").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters/{clusterName}/index-version").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIndexVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIndexVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyNodeConfigResponse> modifyNodeConfig(ModifyNodeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyNodeConfig").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/node-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyOnlineConfigResponse> modifyOnlineConfig(ModifyOnlineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyOnlineConfig").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/node/{nodeName}/online-configs/{indexName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyOnlineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyOnlineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/password`
      *
     */
    @Override
    public CompletableFuture<ModifyPasswordResponse> modifyPassword(ModifyPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyPassword").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/password").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyPausePolicyResponse> modifyPausePolicy(ModifyPausePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyPausePolicy").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/pause-policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPausePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPausePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyPublicUrlIpListResponse> modifyPublicUrlIpList(ModifyPublicUrlIpListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyPublicUrlIpList").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/public-url-ip-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPublicUrlIpListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPublicUrlIpListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyTableResponse> modifyTable(ModifyTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyTable").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/tables/{tableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<PublishAdvanceConfigResponse> publishAdvanceConfig(PublishAdvanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishAdvanceConfig").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/advanced-configs/{configName}/actions/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishAdvanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishAdvanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Method
      *     POST
      * ## URI
      *     /openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/publish
      *
     */
    @Override
    public CompletableFuture<PublishIndexVersionResponse> publishIndexVersion(PublishIndexVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishIndexVersion").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/actions/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishIndexVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishIndexVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PushDocumentsResponse> pushDocuments(PushDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushDocuments").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/data-sources/{dataSourceName}/actions/bulk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `POST`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}/recover-index`
      *
     */
    @Override
    public CompletableFuture<RecoverIndexResponse> recoverIndex(RecoverIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecoverIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/recover-index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReindexResponse> reindex(ReindexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Reindex").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/tables/{tableName}/reindex").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReindexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReindexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RemoveClusterResponse> removeCluster(RemoveClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveCluster").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/instances/{instanceId}/clusters/{clusterName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenameFolderResponse> renameFolder(RenameFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenameFolder").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/folders/{folderId}/name").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartIndexResponse> startIndex(StartIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/startIndex").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StopIndexResponse> stopIndex(StopIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/instances/{instanceId}/indexes/{indexName}/stopIndex").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTask").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/stop-task/{fsmId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/openapi/ha3/resource-tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/ha3/resource-tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Method
      * `PUT`
      * ### URI
      * `/openapi/ha3/instances/{instanceId}`
      *
     */
    @Override
    public CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstance").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateSqlInstanceContentResponse> updateSqlInstanceContent(UpdateSqlInstanceContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSqlInstanceContent").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}/content").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSqlInstanceContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSqlInstanceContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateSqlInstanceNameResponse> updateSqlInstanceName(UpdateSqlInstanceNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSqlInstanceName").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}/name").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSqlInstanceNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSqlInstanceNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateSqlInstanceParamsResponse> updateSqlInstanceParams(UpdateSqlInstanceParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSqlInstanceParams").setMethod(HttpMethod.PUT).setPathRegex("/openapi/ha3/instances/{instanceId}/sql-studio/databases/{database}/sql-instances/{sqlInstanceId}/params").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSqlInstanceParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSqlInstanceParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
