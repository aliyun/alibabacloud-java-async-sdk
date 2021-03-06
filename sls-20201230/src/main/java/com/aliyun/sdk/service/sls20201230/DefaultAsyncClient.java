// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sls20201230.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.sls.*;
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
        this.product = "Sls";
        this.version = "2020-12-30";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<ApplyConfigToMachineGroupResponse> applyConfigToMachineGroup(ApplyConfigToMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyConfigToMachineGroup").setMethod(HttpMethod.PUT).setPathRegex("/machinegroups/{machineGroup}/configs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyConfigToMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyConfigToMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BatchCreateEtlMetaResponse> batchCreateEtlMeta(BatchCreateEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchCreateEtlMeta").setMethod(HttpMethod.POST).setPathRegex("/etlmetas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BatchModifyEtlMetaStatusResponse> batchModifyEtlMetaStatus(BatchModifyEtlMetaStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchModifyEtlMetaStatus").setMethod(HttpMethod.PUT).setPathRegex("/etlmetas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchModifyEtlMetaStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchModifyEtlMetaStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BatchUpdateEtlMetaResponse> batchUpdateEtlMeta(BatchUpdateEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUpdateEtlMeta").setMethod(HttpMethod.PUT).setPathRegex("/etlmetas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/consumergroups").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDomain").setMethod(HttpMethod.POST).setPathRegex("/domains").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEtlMetaResponse> createEtlMeta(CreateEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEtlMeta").setMethod(HttpMethod.POST).setPathRegex("/etlmetas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndex").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLogStore").setMethod(HttpMethod.POST).setPathRegex("/logstores").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLogging").setMethod(HttpMethod.POST).setPathRegex("/logging").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMachineGroup").setMethod(HttpMethod.POST).setPathRegex("/machinegroups").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSavedSearch").setMethod(HttpMethod.POST).setPathRegex("/savedsearches").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConsumerGroup").setMethod(HttpMethod.DELETE).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDomain").setMethod(HttpMethod.DELETE).setPathRegex("/domains/{domainName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEtlMetaResponse> deleteEtlMeta(DeleteEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEtlMeta").setMethod(HttpMethod.DELETE).setPathRegex("/etlmetas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndex").setMethod(HttpMethod.DELETE).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogStore").setMethod(HttpMethod.DELETE).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogging").setMethod(HttpMethod.DELETE).setPathRegex("/logging").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMachineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/machinegroups/{machineGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProject").setMethod(HttpMethod.DELETE).setPathRegex("/").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSavedSearch").setMethod(HttpMethod.DELETE).setPathRegex("/savedsearches/{savedsearchName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAppliedConfigs").setMethod(HttpMethod.GET).setPathRegex("/machinegroups/{machineGroup}/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppliedConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppliedConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCheckPoint").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetContextLogs").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCursor").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/shards/{shardId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCursorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCursorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCursorTime").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/shards/{shardId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCursorTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCursorTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetEtlMetaResponse> getEtlMeta(GetEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEtlMeta").setMethod(HttpMethod.GET).setPathRegex("/etlmetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHistograms").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistogramsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistogramsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndex").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogStore").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogging").setMethod(HttpMethod.GET).setPathRegex("/logging").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogs").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMachineGroup").setMethod(HttpMethod.GET).setPathRegex("/machinegroups/{machineGroup}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProject").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectLogs").setMethod(HttpMethod.GET).setPathRegex("/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSavedSearch").setMethod(HttpMethod.GET).setPathRegex("/savedsearches/{savedsearchName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumerGroup").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/consumergroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDomains").setMethod(HttpMethod.GET).setPathRegex("/domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListEtlMetaResponse> listEtlMeta(ListEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEtlMeta").setMethod(HttpMethod.GET).setPathRegex("/etlmetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListEtlMetaNameResponse> listEtlMetaName(ListEtlMetaNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEtlMetaName").setMethod(HttpMethod.GET).setPathRegex("/etlmetanames").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEtlMetaNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEtlMetaNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogStores").setMethod(HttpMethod.GET).setPathRegex("/logstores").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMachineGroup").setMethod(HttpMethod.GET).setPathRegex("/machinegroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMachines").setMethod(HttpMethod.GET).setPathRegex("/machinegroups/{machineGroup}/machines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProject").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSavedSearch").setMethod(HttpMethod.GET).setPathRegex("/savedsearches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListShards").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/shards").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<MergeShardsResponse> mergeShards(MergeShardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MergeShards").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/shards/{shardID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MergeShardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MergeShardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveConfigFromMachineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/machinegroups/{machineGroup}/configs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveConfigFromMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveConfigFromMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SplitShard").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/shards/{shardID}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SplitShardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SplitShardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/tag").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnTagResources").setMethod(HttpMethod.POST).setPathRegex("/untag").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateCheckPointResponse> updateCheckPoint(UpdateCheckPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCheckPoint").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCheckPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCheckPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConsumerGroup").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateEtlMetaResponse> updateEtlMeta(UpdateEtlMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEtlMeta").setMethod(HttpMethod.PUT).setPathRegex("/etlmetas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEtlMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEtlMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIndex").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogStore").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogging").setMethod(HttpMethod.PUT).setPathRegex("/logging").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMachineGroup").setMethod(HttpMethod.PUT).setPathRegex("/machinegroups/{groupName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProject").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSavedSearch").setMethod(HttpMethod.PUT).setPathRegex("/savedsearches/{savedsearchName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
