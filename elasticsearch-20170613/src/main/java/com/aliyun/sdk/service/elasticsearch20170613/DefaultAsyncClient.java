// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.elasticsearch20170613.models.*;
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
        this.product = "elasticsearch";
        this.version = "2017-06-13";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ActivateZones  ActivateZonesRequest
     * @return ActivateZonesResponse
     */
    @Override
    public CompletableFuture<ActivateZonesResponse> activateZones(ActivateZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ActivateZones").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/recover-zones").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddConnectableCluster  AddConnectableClusterRequest
     * @return AddConnectableClusterResponse
     */
    @Override
    public CompletableFuture<AddConnectableClusterResponse> addConnectableCluster(AddConnectableClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddConnectableCluster").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/connected-clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddConnectableClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddConnectableClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSnapshotRepo  AddSnapshotRepoRequest
     * @return AddSnapshotRepoResponse
     */
    @Override
    public CompletableFuture<AddSnapshotRepoResponse> addSnapshotRepo(AddSnapshotRepoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddSnapshotRepo").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/snapshot-repos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSnapshotRepoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSnapshotRepoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelDeletion  CancelDeletionRequest
     * @return CancelDeletionResponse
     */
    @Override
    public CompletableFuture<CancelDeletionResponse> cancelDeletion(CancelDeletionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelDeletion").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/cancel-deletion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDeletionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDeletionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelLogstashDeletion  CancelLogstashDeletionRequest
     * @return CancelLogstashDeletionResponse
     */
    @Override
    public CompletableFuture<CancelLogstashDeletionResponse> cancelLogstashDeletion(CancelLogstashDeletionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelLogstashDeletion").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/actions/cancel-deletion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelLogstashDeletionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelLogstashDeletionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/cancel-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CapacityPlan  CapacityPlanRequest
     * @return CapacityPlanResponse
     */
    @Override
    public CompletableFuture<CapacityPlanResponse> capacityPlan(CapacityPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CapacityPlan").setMethod(HttpMethod.POST).setPathRegex("/openapi/assist/actions/capacity-plan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CapacityPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CapacityPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseDiagnosis  CloseDiagnosisRequest
     * @return CloseDiagnosisResponse
     */
    @Override
    public CompletableFuture<CloseDiagnosisResponse> closeDiagnosis(CloseDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/actions/close-diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseHttps  CloseHttpsRequest
     * @return CloseHttpsResponse
     */
    @Override
    public CompletableFuture<CloseHttpsResponse> closeHttps(CloseHttpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseHttps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/close-https").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseHttpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseHttpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseManagedIndex  CloseManagedIndexRequest
     * @return CloseManagedIndexResponse
     */
    @Override
    public CompletableFuture<CloseManagedIndexResponse> closeManagedIndex(CloseManagedIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseManagedIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/indices/{Index}/close-managed").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseManagedIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseManagedIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCollector  CreateCollectorRequest
     * @return CreateCollectorResponse
     */
    @Override
    public CompletableFuture<CreateCollectorResponse> createCollector(CreateCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCollector").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateComponentIndex  CreateComponentIndexRequest
     * @return CreateComponentIndexResponse
     */
    @Override
    public CompletableFuture<CreateComponentIndexResponse> createComponentIndex(CreateComponentIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComponentIndex").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/component-index/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComponentIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComponentIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataStream  CreateDataStreamRequest
     * @return CreateDataStreamResponse
     */
    @Override
    public CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataStream").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/data-streams").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateILMPolicy  CreateILMPolicyRequest
     * @return CreateILMPolicyResponse
     */
    @Override
    public CompletableFuture<CreateILMPolicyResponse> createILMPolicy(CreateILMPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateILMPolicy").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/ilm-policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateILMPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateILMPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIndexTemplate  CreateIndexTemplateRequest
     * @return CreateIndexTemplateResponse
     */
    @Override
    public CompletableFuture<CreateIndexTemplateResponse> createIndexTemplate(CreateIndexTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndexTemplate").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/index-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndexTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndexTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLogstash  CreateLogstashRequest
     * @return CreateLogstashResponse
     */
    @Override
    public CompletableFuture<CreateLogstashResponse> createLogstash(CreateLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLogstash").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePipelines  CreatePipelinesRequest
     * @return CreatePipelinesResponse
     */
    @Override
    public CompletableFuture<CreatePipelinesResponse> createPipelines(CreatePipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePipelines").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    @Override
    public CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSnapshot").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/snapshots").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\<em>\</em>\*</p>
     * 
     * @param request the request parameters of CreateVpcEndpoint  CreateVpcEndpointRequest
     * @return CreateVpcEndpointResponse
     */
    @Override
    public CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/vpc-endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeactivateZones  DeactivateZonesRequest
     * @return DeactivateZonesResponse
     */
    @Override
    public CompletableFuture<DeactivateZonesResponse> deactivateZones(DeactivateZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeactivateZones").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/down-zones").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactivateZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactivateZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCollector  DeleteCollectorRequest
     * @return DeleteCollectorResponse
     */
    @Override
    public CompletableFuture<DeleteCollectorResponse> deleteCollector(DeleteCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCollector").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/collectors/{ResId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteComponentIndex  DeleteComponentIndexRequest
     * @return DeleteComponentIndexResponse
     */
    @Override
    public CompletableFuture<DeleteComponentIndexResponse> deleteComponentIndex(DeleteComponentIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteComponentIndex").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/component-index/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComponentIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComponentIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConnectedCluster  DeleteConnectedClusterRequest
     * @return DeleteConnectedClusterResponse
     */
    @Override
    public CompletableFuture<DeleteConnectedClusterResponse> deleteConnectedCluster(DeleteConnectedClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConnectedCluster").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/connected-clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConnectedClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConnectedClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataStream  DeleteDataStreamRequest
     * @return DeleteDataStreamResponse
     */
    @Override
    public CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataStream").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/data-streams/{DataStream}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataTask  DeleteDataTaskRequest
     * @return DeleteDataTaskResponse
     */
    @Override
    public CompletableFuture<DeleteDataTaskResponse> deleteDataTask(DeleteDataTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataTask").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/data-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeprecatedTemplate  DeleteDeprecatedTemplateRequest
     * @return DeleteDeprecatedTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteDeprecatedTemplateResponse> deleteDeprecatedTemplate(DeleteDeprecatedTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDeprecatedTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/deprecated-templates/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeprecatedTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeprecatedTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteILMPolicy  DeleteILMPolicyRequest
     * @return DeleteILMPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteILMPolicyResponse> deleteILMPolicy(DeleteILMPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteILMPolicy").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/ilm-policies/{PolicyName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteILMPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteILMPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIndexTemplate  DeleteIndexTemplateRequest
     * @return DeleteIndexTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndexTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/index-templates/{IndexTemplate}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstance").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.</p>
     * 
     * @param request the request parameters of DeleteLogstash  DeleteLogstashRequest
     * @return DeleteLogstashResponse
     */
    @Override
    public CompletableFuture<DeleteLogstashResponse> deleteLogstash(DeleteLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogstash").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/logstashes/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePipelines  DeletePipelinesRequest
     * @return DeletePipelinesResponse
     */
    @Override
    public CompletableFuture<DeletePipelinesResponse> deletePipelines(DeletePipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePipelines").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSnapshotRepo  DeleteSnapshotRepoRequest
     * @return DeleteSnapshotRepoResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotRepoResponse> deleteSnapshotRepo(DeleteSnapshotRepoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSnapshotRepo").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/snapshot-repos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotRepoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotRepoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVpcEndpoint  DeleteVpcEndpointRequest
     * @return DeleteVpcEndpointResponse
     */
    @Override
    public CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteVpcEndpoint").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/instances/{InstanceId}/vpc-endpoints/{EndpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAckOperator  DescribeAckOperatorRequest
     * @return DescribeAckOperatorResponse
     */
    @Override
    public CompletableFuture<DescribeAckOperatorResponse> describeAckOperator(DescribeAckOperatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeAckOperator").setMethod(HttpMethod.GET).setPathRegex("/openapi/ack-clusters/{ClusterId}/operator").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAckOperatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAckOperatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApm  DescribeApmRequest
     * @return DescribeApmResponse
     */
    @Override
    public CompletableFuture<DescribeApmResponse> describeApm(DescribeApmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApm").setMethod(HttpMethod.GET).setPathRegex("/openapi/apm/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCollector  DescribeCollectorRequest
     * @return DescribeCollectorResponse
     */
    @Override
    public CompletableFuture<DescribeCollectorResponse> describeCollector(DescribeCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeCollector").setMethod(HttpMethod.GET).setPathRegex("/openapi/collectors/{ResId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeComponentIndex  DescribeComponentIndexRequest
     * @return DescribeComponentIndexResponse
     */
    @Override
    public CompletableFuture<DescribeComponentIndexResponse> describeComponentIndex(DescribeComponentIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeComponentIndex").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/component-index/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeComponentIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeComponentIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConnectableClusters  DescribeConnectableClustersRequest
     * @return DescribeConnectableClustersResponse
     */
    @Override
    public CompletableFuture<DescribeConnectableClustersResponse> describeConnectableClusters(DescribeConnectableClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeConnectableClusters").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/connectable-clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConnectableClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConnectableClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeprecatedTemplate  DescribeDeprecatedTemplateRequest
     * @return DescribeDeprecatedTemplateResponse
     */
    @Override
    public CompletableFuture<DescribeDeprecatedTemplateResponse> describeDeprecatedTemplate(DescribeDeprecatedTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDeprecatedTemplate").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/deprecated-templates/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeprecatedTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeprecatedTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDiagnoseReport  DescribeDiagnoseReportRequest
     * @return DescribeDiagnoseReportResponse
     */
    @Override
    public CompletableFuture<DescribeDiagnoseReportResponse> describeDiagnoseReport(DescribeDiagnoseReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDiagnoseReport").setMethod(HttpMethod.GET).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/reports/{ReportId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnoseReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnoseReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDiagnosisSettings  DescribeDiagnosisSettingsRequest
     * @return DescribeDiagnosisSettingsResponse
     */
    @Override
    public CompletableFuture<DescribeDiagnosisSettingsResponse> describeDiagnosisSettings(DescribeDiagnosisSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDiagnosisSettings").setMethod(HttpMethod.GET).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosisSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosisSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDynamicSettings  DescribeDynamicSettingsRequest
     * @return DescribeDynamicSettingsResponse
     */
    @Override
    public CompletableFuture<DescribeDynamicSettingsResponse> describeDynamicSettings(DescribeDynamicSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeDynamicSettings").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/dynamic-settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDynamicSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDynamicSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An Elasticsearch cluster can be in a health state indicated by one of the following colors:</p>
     * <ul>
     * <li>GREEN: Primary shards and replica shards for the primary shards are normally allocated.</li>
     * <li>YELLOW: Primary shards are normally allocated, but replica shards for the primary shards are not normally allocated.</li>
     * <li>RED: Primary shards are not normally allocated.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeElasticsearchHealth  DescribeElasticsearchHealthRequest
     * @return DescribeElasticsearchHealthResponse
     */
    @Override
    public CompletableFuture<DescribeElasticsearchHealthResponse> describeElasticsearchHealth(DescribeElasticsearchHealthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeElasticsearchHealth").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/elasticsearch-health").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeElasticsearchHealthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeElasticsearchHealthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeILMPolicy  DescribeILMPolicyRequest
     * @return DescribeILMPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeILMPolicyResponse> describeILMPolicy(DescribeILMPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeILMPolicy").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/ilm-policies/{PolicyName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeILMPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeILMPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeIndexTemplate  DescribeIndexTemplateRequest
     * @return DescribeIndexTemplateResponse
     */
    @Override
    public CompletableFuture<DescribeIndexTemplateResponse> describeIndexTemplate(DescribeIndexTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeIndexTemplate").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/index-templates/{IndexTemplate}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIndexTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIndexTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeInstance").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeKibanaSettings  DescribeKibanaSettingsRequest
     * @return DescribeKibanaSettingsResponse
     */
    @Override
    public CompletableFuture<DescribeKibanaSettingsResponse> describeKibanaSettings(DescribeKibanaSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeKibanaSettings").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/kibana-settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKibanaSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKibanaSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogstash  DescribeLogstashRequest
     * @return DescribeLogstashResponse
     */
    @Override
    public CompletableFuture<DescribeLogstashResponse> describeLogstash(DescribeLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeLogstash").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePipeline  DescribePipelineRequest
     * @return DescribePipelineResponse
     */
    @Override
    public CompletableFuture<DescribePipelineResponse> describePipeline(DescribePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePipeline").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines/{PipelineId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePipelineManagementConfig  DescribePipelineManagementConfigRequest
     * @return DescribePipelineManagementConfigResponse
     */
    @Override
    public CompletableFuture<DescribePipelineManagementConfigResponse> describePipelineManagementConfig(DescribePipelineManagementConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePipelineManagementConfig").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/pipeline-management-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePipelineManagementConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePipelineManagementConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRegions").setMethod(HttpMethod.GET).setPathRegex("/openapi/regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSnapshotSetting  DescribeSnapshotSettingRequest
     * @return DescribeSnapshotSettingResponse
     */
    @Override
    public CompletableFuture<DescribeSnapshotSettingResponse> describeSnapshotSetting(DescribeSnapshotSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSnapshotSetting").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/snapshot-setting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTemplates  DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    @Override
    public CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTemplates").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeXpackMonitorConfig  DescribeXpackMonitorConfigRequest
     * @return DescribeXpackMonitorConfigResponse
     */
    @Override
    public CompletableFuture<DescribeXpackMonitorConfigResponse> describeXpackMonitorConfig(DescribeXpackMonitorConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeXpackMonitorConfig").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/xpack-monitor-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeXpackMonitorConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeXpackMonitorConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DiagnoseInstance  DiagnoseInstanceRequest
     * @return DiagnoseInstanceResponse
     */
    @Override
    public CompletableFuture<DiagnoseInstanceResponse> diagnoseInstance(DiagnoseInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DiagnoseInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/actions/diagnose").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiagnoseInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiagnoseInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableKibanaPvlNetwork  DisableKibanaPvlNetworkRequest
     * @return DisableKibanaPvlNetworkResponse
     */
    @Override
    public CompletableFuture<DisableKibanaPvlNetworkResponse> disableKibanaPvlNetwork(DisableKibanaPvlNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableKibanaPvlNetwork").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/disable-kibana-private").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableKibanaPvlNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableKibanaPvlNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableKibanaPvlNetwork  EnableKibanaPvlNetworkRequest
     * @return EnableKibanaPvlNetworkResponse
     */
    @Override
    public CompletableFuture<EnableKibanaPvlNetworkResponse> enableKibanaPvlNetwork(EnableKibanaPvlNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableKibanaPvlNetwork").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/enable-kibana-private").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableKibanaPvlNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableKibanaPvlNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EstimatedLogstashRestartTime  EstimatedLogstashRestartTimeRequest
     * @return EstimatedLogstashRestartTimeResponse
     */
    @Override
    public CompletableFuture<EstimatedLogstashRestartTimeResponse> estimatedLogstashRestartTime(EstimatedLogstashRestartTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EstimatedLogstashRestartTime").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/estimated-time/restart-time").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EstimatedLogstashRestartTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EstimatedLogstashRestartTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EstimatedRestartTime  EstimatedRestartTimeRequest
     * @return EstimatedRestartTimeResponse
     */
    @Override
    public CompletableFuture<EstimatedRestartTimeResponse> estimatedRestartTime(EstimatedRestartTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EstimatedRestartTime").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/estimated-time/restart-time").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EstimatedRestartTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EstimatedRestartTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterDataInformation  GetClusterDataInformationRequest
     * @return GetClusterDataInformationResponse
     */
    @Override
    public CompletableFuture<GetClusterDataInformationResponse> getClusterDataInformation(GetClusterDataInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterDataInformation").setMethod(HttpMethod.POST).setPathRegex("/openapi/cluster/data-information").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterDataInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterDataInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetElastictask  GetElastictaskRequest
     * @return GetElastictaskResponse
     */
    @Override
    public CompletableFuture<GetElastictaskResponse> getElastictask(GetElastictaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetElastictask").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/elastic-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetElastictaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetElastictaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEmonGrafanaAlerts  GetEmonGrafanaAlertsRequest
     * @return GetEmonGrafanaAlertsResponse
     */
    @Override
    public CompletableFuture<GetEmonGrafanaAlertsResponse> getEmonGrafanaAlerts(GetEmonGrafanaAlertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEmonGrafanaAlerts").setMethod(HttpMethod.GET).setPathRegex("/openapi/emon/projects/{ProjectId}/grafana/proxy/api/alerts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmonGrafanaAlertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmonGrafanaAlertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEmonGrafanaDashboards  GetEmonGrafanaDashboardsRequest
     * @return GetEmonGrafanaDashboardsResponse
     */
    @Override
    public CompletableFuture<GetEmonGrafanaDashboardsResponse> getEmonGrafanaDashboards(GetEmonGrafanaDashboardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEmonGrafanaDashboards").setMethod(HttpMethod.GET).setPathRegex("/openapi/emon/projects/{ProjectId}/grafana/proxy/api/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmonGrafanaDashboardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmonGrafanaDashboardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEmonMonitorData  GetEmonMonitorDataRequest
     * @return GetEmonMonitorDataResponse
     */
    @Override
    public CompletableFuture<GetEmonMonitorDataResponse> getEmonMonitorData(GetEmonMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEmonMonitorData").setMethod(HttpMethod.POST).setPathRegex("/openapi/emon/projects/{ProjectId}/metrics/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmonMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmonMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpenStoreUsage  GetOpenStoreUsageRequest
     * @return GetOpenStoreUsageResponse
     */
    @Override
    public CompletableFuture<GetOpenStoreUsageResponse> getOpenStoreUsage(GetOpenStoreUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOpenStoreUsage").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/openstore/usage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpenStoreUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpenStoreUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRegionConfiguration  GetRegionConfigurationRequest
     * @return GetRegionConfigurationResponse
     */
    @Override
    public CompletableFuture<GetRegionConfigurationResponse> getRegionConfiguration(GetRegionConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRegionConfiguration").setMethod(HttpMethod.GET).setPathRegex("/openapi/region").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRegionConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRegionConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRegionalInstanceConfig  GetRegionalInstanceConfigRequest
     * @return GetRegionalInstanceConfigResponse
     */
    @Override
    public CompletableFuture<GetRegionalInstanceConfigResponse> getRegionalInstanceConfig(GetRegionalInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRegionalInstanceConfig").setMethod(HttpMethod.GET).setPathRegex("/openapi/regions/instance-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRegionalInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRegionalInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSuggestShrinkableNodes  GetSuggestShrinkableNodesRequest
     * @return GetSuggestShrinkableNodesResponse
     */
    @Override
    public CompletableFuture<GetSuggestShrinkableNodesResponse> getSuggestShrinkableNodes(GetSuggestShrinkableNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSuggestShrinkableNodes").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/suggest-shrinkable-nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSuggestShrinkableNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSuggestShrinkableNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTransferableNodes  GetTransferableNodesRequest
     * @return GetTransferableNodesResponse
     */
    @Override
    public CompletableFuture<GetTransferableNodesResponse> getTransferableNodes(GetTransferableNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTransferableNodes").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/transferable-nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTransferableNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTransferableNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InitializeOperationRole  InitializeOperationRoleRequest
     * @return InitializeOperationRoleResponse
     */
    @Override
    public CompletableFuture<InitializeOperationRoleResponse> initializeOperationRole(InitializeOperationRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InitializeOperationRole").setMethod(HttpMethod.POST).setPathRegex("/openapi/user/slr").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitializeOperationRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitializeOperationRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InstallAckOperator  InstallAckOperatorRequest
     * @return InstallAckOperatorResponse
     */
    @Override
    public CompletableFuture<InstallAckOperatorResponse> installAckOperator(InstallAckOperatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAckOperator").setMethod(HttpMethod.POST).setPathRegex("/openapi/ack-clusters/{ClusterId}/operator").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAckOperatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAckOperatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallKibanaSystemPlugin  InstallKibanaSystemPluginRequest
     * @return InstallKibanaSystemPluginResponse
     */
    @Override
    public CompletableFuture<InstallKibanaSystemPluginResponse> installKibanaSystemPlugin(InstallKibanaSystemPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallKibanaSystemPlugin").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/kibana-plugins/system/actions/install").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallKibanaSystemPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallKibanaSystemPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>ls-cn-oew1qbgl\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of InstallLogstashSystemPlugin  InstallLogstashSystemPluginRequest
     * @return InstallLogstashSystemPluginResponse
     */
    @Override
    public CompletableFuture<InstallLogstashSystemPluginResponse> installLogstashSystemPlugin(InstallLogstashSystemPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallLogstashSystemPlugin").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/plugins/system/actions/install").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallLogstashSystemPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallLogstashSystemPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallSystemPlugin  InstallSystemPluginRequest
     * @return InstallSystemPluginResponse
     */
    @Override
    public CompletableFuture<InstallSystemPluginResponse> installSystemPlugin(InstallSystemPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallSystemPlugin").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/plugins/system/actions/install").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallSystemPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallSystemPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallUserPlugins  InstallUserPluginsRequest
     * @return InstallUserPluginsResponse
     */
    @Override
    public CompletableFuture<InstallUserPluginsResponse> installUserPlugins(InstallUserPluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallUserPlugins").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/plugins/user/actions/install").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallUserPluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallUserPluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InterruptElasticsearchTask  InterruptElasticsearchTaskRequest
     * @return InterruptElasticsearchTaskResponse
     */
    @Override
    public CompletableFuture<InterruptElasticsearchTaskResponse> interruptElasticsearchTask(InterruptElasticsearchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InterruptElasticsearchTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/interrupt").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InterruptElasticsearchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InterruptElasticsearchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InterruptLogstashTask  InterruptLogstashTaskRequest
     * @return InterruptLogstashTaskResponse
     */
    @Override
    public CompletableFuture<InterruptLogstashTaskResponse> interruptLogstashTask(InterruptLogstashTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InterruptLogstashTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/actions/interrupt").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InterruptLogstashTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InterruptLogstashTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAckClusters  ListAckClustersRequest
     * @return ListAckClustersResponse
     */
    @Override
    public CompletableFuture<ListAckClustersResponse> listAckClusters(ListAckClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAckClusters").setMethod(HttpMethod.GET).setPathRegex("/openapi/ack-clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAckClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAckClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAckNamespaces  ListAckNamespacesRequest
     * @return ListAckNamespacesResponse
     */
    @Override
    public CompletableFuture<ListAckNamespacesResponse> listAckNamespaces(ListAckNamespacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAckNamespaces").setMethod(HttpMethod.GET).setPathRegex("/openapi/ack-clusters/{ClusterId}/namespaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAckNamespacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAckNamespacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListActionRecords  ListActionRecordsRequest
     * @return ListActionRecordsResponse
     */
    @Override
    public CompletableFuture<ListActionRecordsResponse> listActionRecords(ListActionRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListActionRecords").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/action-records").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListActionRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListActionRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAllNode  ListAllNodeRequest
     * @return ListAllNodeResponse
     */
    @Override
    public CompletableFuture<ListAllNodeResponse> listAllNode(ListAllNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAllNode").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlternativeSnapshotRepos  ListAlternativeSnapshotReposRequest
     * @return ListAlternativeSnapshotReposResponse
     */
    @Override
    public CompletableFuture<ListAlternativeSnapshotReposResponse> listAlternativeSnapshotRepos(ListAlternativeSnapshotReposRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlternativeSnapshotRepos").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/alternative-snapshot-repos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlternativeSnapshotReposResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlternativeSnapshotReposResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApm  ListApmRequest
     * @return ListApmResponse
     */
    @Override
    public CompletableFuture<ListApmResponse> listApm(ListApmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApm").setMethod(HttpMethod.GET).setPathRegex("/openapi/apm").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvailableEsInstanceIds  ListAvailableEsInstanceIdsRequest
     * @return ListAvailableEsInstanceIdsResponse
     */
    @Override
    public CompletableFuture<ListAvailableEsInstanceIdsResponse> listAvailableEsInstanceIds(ListAvailableEsInstanceIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAvailableEsInstanceIds").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/available-elasticsearch-for-centralized-management").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableEsInstanceIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableEsInstanceIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCollectors  ListCollectorsRequest
     * @return ListCollectorsResponse
     */
    @Override
    public CompletableFuture<ListCollectorsResponse> listCollectors(ListCollectorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCollectors").setMethod(HttpMethod.GET).setPathRegex("/openapi/collectors").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCollectorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCollectorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComponentIndices  ListComponentIndicesRequest
     * @return ListComponentIndicesResponse
     */
    @Override
    public CompletableFuture<ListComponentIndicesResponse> listComponentIndices(ListComponentIndicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComponentIndices").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/component-index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentIndicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentIndicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConnectedClusters  ListConnectedClustersRequest
     * @return ListConnectedClustersResponse
     */
    @Override
    public CompletableFuture<ListConnectedClustersResponse> listConnectedClusters(ListConnectedClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConnectedClusters").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/connected-clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConnectedClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConnectedClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataStreams  ListDataStreamsRequest
     * @return ListDataStreamsResponse
     */
    @Override
    public CompletableFuture<ListDataStreamsResponse> listDataStreams(ListDataStreamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataStreams").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/data-streams").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataStreamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataStreamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataTasks  ListDataTasksRequest
     * @return ListDataTasksResponse
     */
    @Override
    public CompletableFuture<ListDataTasksResponse> listDataTasks(ListDataTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataTasks").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/data-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDefaultCollectorConfigurations  ListDefaultCollectorConfigurationsRequest
     * @return ListDefaultCollectorConfigurationsResponse
     */
    @Override
    public CompletableFuture<ListDefaultCollectorConfigurationsResponse> listDefaultCollectorConfigurations(ListDefaultCollectorConfigurationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDefaultCollectorConfigurations").setMethod(HttpMethod.GET).setPathRegex("/openapi/beats/default-configurations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDefaultCollectorConfigurationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDefaultCollectorConfigurationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeprecatedTemplates  ListDeprecatedTemplatesRequest
     * @return ListDeprecatedTemplatesResponse
     */
    @Override
    public CompletableFuture<ListDeprecatedTemplatesResponse> listDeprecatedTemplates(ListDeprecatedTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeprecatedTemplates").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/deprecated-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeprecatedTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeprecatedTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnoseIndices  ListDiagnoseIndicesRequest
     * @return ListDiagnoseIndicesResponse
     */
    @Override
    public CompletableFuture<ListDiagnoseIndicesResponse> listDiagnoseIndices(ListDiagnoseIndicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDiagnoseIndices").setMethod(HttpMethod.GET).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/indices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnoseIndicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnoseIndicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnoseReport  ListDiagnoseReportRequest
     * @return ListDiagnoseReportResponse
     */
    @Override
    public CompletableFuture<ListDiagnoseReportResponse> listDiagnoseReport(ListDiagnoseReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDiagnoseReport").setMethod(HttpMethod.GET).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/reports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnoseReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnoseReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnoseReportIds  ListDiagnoseReportIdsRequest
     * @return ListDiagnoseReportIdsResponse
     */
    @Override
    public CompletableFuture<ListDiagnoseReportIdsResponse> listDiagnoseReportIds(ListDiagnoseReportIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDiagnoseReportIds").setMethod(HttpMethod.GET).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/report-ids").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnoseReportIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnoseReportIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnosisItems  ListDiagnosisItemsRequest
     * @return ListDiagnosisItemsResponse
     */
    @Override
    public CompletableFuture<ListDiagnosisItemsResponse> listDiagnosisItems(ListDiagnosisItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDiagnosisItems").setMethod(HttpMethod.GET).setPathRegex("/openapi/diagnosis/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnosisItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnosisItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDictInformation  ListDictInformationRequest
     * @return ListDictInformationResponse
     */
    @Override
    public CompletableFuture<ListDictInformationResponse> listDictInformation(ListDictInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDictInformation").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/dict/_info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDictInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDictInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDicts  ListDictsRequest
     * @return ListDictsResponse
     */
    @Override
    public CompletableFuture<ListDictsResponse> listDicts(ListDictsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDicts").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/dicts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDictsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDictsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Important</em>* To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see <a href="https://help.aliyun.com/document_detail/146446.html">Collect ECS service logs</a>.</p>
     * 
     * @param request the request parameters of ListEcsInstances  ListEcsInstancesRequest
     * @return ListEcsInstancesResponse
     */
    @Override
    public CompletableFuture<ListEcsInstancesResponse> listEcsInstances(ListEcsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEcsInstances").setMethod(HttpMethod.GET).setPathRegex("/openapi/ecs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEcsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEcsInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExtendfiles  ListExtendfilesRequest
     * @return ListExtendfilesResponse
     */
    @Override
    public CompletableFuture<ListExtendfilesResponse> listExtendfiles(ListExtendfilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExtendfiles").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/extendfiles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExtendfilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExtendfilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListILMPolicies  ListILMPoliciesRequest
     * @return ListILMPoliciesResponse
     */
    @Override
    public CompletableFuture<ListILMPoliciesResponse> listILMPolicies(ListILMPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListILMPolicies").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/ilm-policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListILMPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListILMPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIndexTemplates  ListIndexTemplatesRequest
     * @return ListIndexTemplatesResponse
     */
    @Override
    public CompletableFuture<ListIndexTemplatesResponse> listIndexTemplates(ListIndexTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexTemplates").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/index-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    @Override
    public CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstance").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceHistoryEvents  ListInstanceHistoryEventsRequest
     * @return ListInstanceHistoryEventsResponse
     */
    @Override
    public CompletableFuture<ListInstanceHistoryEventsResponse> listInstanceHistoryEvents(ListInstanceHistoryEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/openapi/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceHistoryEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceHistoryEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceIndices  ListInstanceIndicesRequest
     * @return ListInstanceIndicesResponse
     */
    @Override
    public CompletableFuture<ListInstanceIndicesResponse> listInstanceIndices(ListInstanceIndicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceIndices").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/indices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceIndicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceIndicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKibanaPlugins  ListKibanaPluginsRequest
     * @return ListKibanaPluginsResponse
     */
    @Override
    public CompletableFuture<ListKibanaPluginsResponse> listKibanaPlugins(ListKibanaPluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKibanaPlugins").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/kibana-plugins").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKibanaPluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKibanaPluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKibanaPvlNetwork  ListKibanaPvlNetworkRequest
     * @return ListKibanaPvlNetworkResponse
     */
    @Override
    public CompletableFuture<ListKibanaPvlNetworkResponse> listKibanaPvlNetwork(ListKibanaPvlNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKibanaPvlNetwork").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/actions/get-kibana-private").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKibanaPvlNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKibanaPvlNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogstash  ListLogstashRequest
     * @return ListLogstashResponse
     */
    @Override
    public CompletableFuture<ListLogstashResponse> listLogstash(ListLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogstash").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogstashLog  ListLogstashLogRequest
     * @return ListLogstashLogResponse
     */
    @Override
    public CompletableFuture<ListLogstashLogResponse> listLogstashLog(ListLogstashLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogstashLog").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/search-log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogstashLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogstashLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogstashPlugins  ListLogstashPluginsRequest
     * @return ListLogstashPluginsResponse
     */
    @Override
    public CompletableFuture<ListLogstashPluginsResponse> listLogstashPlugins(ListLogstashPluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogstashPlugins").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/plugins").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogstashPluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogstashPluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    @Override
    public CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNodes").setMethod(HttpMethod.GET).setPathRegex("/openapi/collectors/{ResId}/nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipeline  ListPipelineRequest
     * @return ListPipelineResponse
     */
    @Override
    public CompletableFuture<ListPipelineResponse> listPipeline(ListPipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipeline").setMethod(HttpMethod.GET).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineIds  ListPipelineIdsRequest
     * @return ListPipelineIdsResponse
     */
    @Override
    public CompletableFuture<ListPipelineIdsResponse> listPipelineIds(ListPipelineIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineIds").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/pipeline-ids").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPlugins  ListPluginsRequest
     * @return ListPluginsResponse
     */
    @Override
    public CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPlugins").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/plugins").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSearchLog  ListSearchLogRequest
     * @return ListSearchLogResponse
     */
    @Override
    public CompletableFuture<ListSearchLogResponse> listSearchLog(ListSearchLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSearchLog").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/search-log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSearchLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSearchLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListShardRecoveries  ListShardRecoveriesRequest
     * @return ListShardRecoveriesResponse
     */
    @Override
    public CompletableFuture<ListShardRecoveriesResponse> listShardRecoveries(ListShardRecoveriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListShardRecoveries").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/cat-recovery").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShardRecoveriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShardRecoveriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSnapshotReposByInstanceId  ListSnapshotReposByInstanceIdRequest
     * @return ListSnapshotReposByInstanceIdResponse
     */
    @Override
    public CompletableFuture<ListSnapshotReposByInstanceIdResponse> listSnapshotReposByInstanceId(ListSnapshotReposByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSnapshotReposByInstanceId").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/snapshot-repos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotReposByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotReposByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/openapi/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    @Override
    public CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTags").setMethod(HttpMethod.GET).setPathRegex("/openapi/tags/all-tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpoints  ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVpcEndpoints").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/vpc-endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:</p>
     * <ul>
     * <li>The error message returned because the current account is in a zone that has sufficient resources.
     * After migrating nodes with current specifications to another zone, you need to manually <a href="https://help.aliyun.com/document_detail/96650.html">upgrade cluster</a> because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.</li>
     * <li>The cluster is in the healthy state.
     * Can be passed<code> GET _cat/health?v </code>command to view the health status of the cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    @Override
    public CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MigrateToOtherZone").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/migrate-zones").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateToOtherZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateToOtherZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDeployMachine  ModifyDeployMachineRequest
     * @return ModifyDeployMachineResponse
     */
    @Override
    public CompletableFuture<ModifyDeployMachineResponse> modifyDeployMachine(ModifyDeployMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyDeployMachine").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors/{ResId}/actions/modify-deploy-machines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDeployMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDeployMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyElastictask  ModifyElastictaskRequest
     * @return ModifyElastictaskResponse
     */
    @Override
    public CompletableFuture<ModifyElastictaskResponse> modifyElastictask(ModifyElastictaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyElastictask").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/elastic-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyElastictaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyElastictaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>es-cn-n6w1o1x0w001c\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyInstanceMaintainTime").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/modify-maintaintime").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMaintainTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMaintainTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ID of the cluster.</p>
     * 
     * @param request the request parameters of ModifyWhiteIps  ModifyWhiteIpsRequest
     * @return ModifyWhiteIpsResponse
     */
    @Override
    public CompletableFuture<ModifyWhiteIpsResponse> modifyWhiteIps(ModifyWhiteIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyWhiteIps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/modify-white-ips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWhiteIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWhiteIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    @Override
    public CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MoveResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/resourcegroup").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenDiagnosis  OpenDiagnosisRequest
     * @return OpenDiagnosisResponse
     */
    @Override
    public CompletableFuture<OpenDiagnosisResponse> openDiagnosis(OpenDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/actions/open-diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To ensure data security, we recommend that you enable HTTPS.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenHttps  OpenHttpsRequest
     * @return OpenHttpsResponse
     */
    @Override
    public CompletableFuture<OpenHttpsResponse> openHttps(OpenHttpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenHttps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/open-https").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenHttpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenHttpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PostEmonTryAlarmRule  PostEmonTryAlarmRuleRequest
     * @return PostEmonTryAlarmRuleResponse
     */
    @Override
    public CompletableFuture<PostEmonTryAlarmRuleResponse> postEmonTryAlarmRule(PostEmonTryAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PostEmonTryAlarmRule").setMethod(HttpMethod.POST).setPathRegex("/openapi/emon/projects/{ProjectId}/alarm-groups/{AlarmGroupId}/alarm-rules/_test").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PostEmonTryAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PostEmonTryAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecommendTemplates  RecommendTemplatesRequest
     * @return RecommendTemplatesResponse
     */
    @Override
    public CompletableFuture<RecommendTemplatesResponse> recommendTemplates(RecommendTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecommendTemplates").setMethod(HttpMethod.GET).setPathRegex("/openapi/instances/{InstanceId}/recommended-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecommendTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecommendTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReinstallCollector  ReinstallCollectorRequest
     * @return ReinstallCollectorResponse
     */
    @Override
    public CompletableFuture<ReinstallCollectorResponse> reinstallCollector(ReinstallCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReinstallCollector").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors/{ResId}/actions/reinstall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReinstallCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReinstallCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveApm  RemoveApmRequest
     * @return RemoveApmResponse
     */
    @Override
    public CompletableFuture<RemoveApmResponse> removeApm(RemoveApmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveApm").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/apm/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveApmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveApmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/renew").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewLogstash  RenewLogstashRequest
     * @return RenewLogstashResponse
     */
    @Override
    public CompletableFuture<RenewLogstashResponse> renewLogstash(RenewLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenewLogstash").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/actions/renew").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartCollector  RestartCollectorRequest
     * @return RestartCollectorResponse
     */
    @Override
    public CompletableFuture<RestartCollectorResponse> restartCollector(RestartCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartCollector").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors/{ResId}/actions/restart").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    @Override
    public CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/restart").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartLogstash  RestartLogstashRequest
     * @return RestartLogstashResponse
     */
    @Override
    public CompletableFuture<RestartLogstashResponse> restartLogstash(RestartLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartLogstash").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/actions/restart").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeElasticsearchTask  ResumeElasticsearchTaskRequest
     * @return ResumeElasticsearchTaskResponse
     */
    @Override
    public CompletableFuture<ResumeElasticsearchTaskResponse> resumeElasticsearchTask(ResumeElasticsearchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeElasticsearchTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/resume").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeElasticsearchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeElasticsearchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeLogstashTask  ResumeLogstashTaskRequest
     * @return ResumeLogstashTaskResponse
     */
    @Override
    public CompletableFuture<ResumeLogstashTaskResponse> resumeLogstashTask(ResumeLogstashTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeLogstashTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/actions/resume").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeLogstashTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeLogstashTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RolloverDataStream  RolloverDataStreamRequest
     * @return RolloverDataStreamResponse
     */
    @Override
    public CompletableFuture<RolloverDataStreamResponse> rolloverDataStream(RolloverDataStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RolloverDataStream").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/data-streams/{DataStream}/rollover").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RolloverDataStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RolloverDataStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunPipelines  RunPipelinesRequest
     * @return RunPipelinesResponse
     */
    @Override
    public CompletableFuture<RunPipelinesResponse> runPipelines(RunPipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunPipelines").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines/action/run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunPipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunPipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ShrinkNode  ShrinkNodeRequest
     * @return ShrinkNodeResponse
     */
    @Override
    public CompletableFuture<ShrinkNodeResponse> shrinkNode(ShrinkNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ShrinkNode").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/shrink").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ShrinkNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ShrinkNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartApm  StartApmRequest
     * @return StartApmResponse
     */
    @Override
    public CompletableFuture<StartApmResponse> startApm(StartApmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartApm").setMethod(HttpMethod.POST).setPathRegex("/openapi/apm/{instanceId}/actions/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartApmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartApmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartCollector  StartCollectorRequest
     * @return StartCollectorResponse
     */
    @Override
    public CompletableFuture<StartCollectorResponse> startCollector(StartCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartCollector").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors/{ResId}/actions/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopApm  StopApmRequest
     * @return StopApmResponse
     */
    @Override
    public CompletableFuture<StopApmResponse> stopApm(StopApmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopApm").setMethod(HttpMethod.POST).setPathRegex("/openapi/apm/{instanceId}/actions/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopApmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopApmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopCollector  StopCollectorRequest
     * @return StopCollectorResponse
     */
    @Override
    public CompletableFuture<StopCollectorResponse> stopCollector(StopCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopCollector").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors/{ResId}/actions/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopPipelines  StopPipelinesRequest
     * @return StopPipelinesResponse
     */
    @Override
    public CompletableFuture<StopPipelinesResponse> stopPipelines(StopPipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopPipelines").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopPipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopPipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/openapi/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferNode  TransferNodeRequest
     * @return TransferNodeResponse
     */
    @Override
    public CompletableFuture<TransferNodeResponse> transferNode(TransferNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransferNode").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/transfer").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerNetwork  TriggerNetworkRequest
     * @return TriggerNetworkResponse
     */
    @Override
    public CompletableFuture<TriggerNetworkResponse> triggerNetwork(TriggerNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TriggerNetwork").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/network-trigger").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallKibanaPlugin  UninstallKibanaPluginRequest
     * @return UninstallKibanaPluginResponse
     */
    @Override
    public CompletableFuture<UninstallKibanaPluginResponse> uninstallKibanaPlugin(UninstallKibanaPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallKibanaPlugin").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/kibana-plugins/actions/uninstall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallKibanaPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallKibanaPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallLogstashPlugin  UninstallLogstashPluginRequest
     * @return UninstallLogstashPluginResponse
     */
    @Override
    public CompletableFuture<UninstallLogstashPluginResponse> uninstallLogstashPlugin(UninstallLogstashPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallLogstashPlugin").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/plugins/actions/uninstall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallLogstashPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallLogstashPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallPlugin  UninstallPluginRequest
     * @return UninstallPluginResponse
     */
    @Override
    public CompletableFuture<UninstallPluginResponse> uninstallPlugin(UninstallPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallPlugin").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/plugins/actions/uninstall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can only delete user tags.<blockquote>
     * <p>User labels are manually added to instances by users. A system Tag is a tag that Alibaba Cloud services add to instances. System labels are divided into visible labels and invisible labels.</p>
     * </blockquote>
     * </li>
     * <li>If you delete a resource tag relationship that is not associated with any resources, you must delete the tags.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of UpdateAdminPassword  UpdateAdminPasswordRequest
     * @return UpdateAdminPasswordResponse
     */
    @Override
    public CompletableFuture<UpdateAdminPasswordResponse> updateAdminPassword(UpdateAdminPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAdminPassword").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/admin-pwd").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAdminPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAdminPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAdvancedSetting  UpdateAdvancedSettingRequest
     * @return UpdateAdvancedSettingResponse
     */
    @Override
    public CompletableFuture<UpdateAdvancedSettingResponse> updateAdvancedSetting(UpdateAdvancedSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAdvancedSetting").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/update-advanced-setting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAdvancedSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAdvancedSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Elasticsearch V5.X clusters do not support the analysis-aliws plug-in.</li>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAliwsDict  UpdateAliwsDictRequest
     * @return UpdateAliwsDictResponse
     */
    @Override
    public CompletableFuture<UpdateAliwsDictResponse> updateAliwsDict(UpdateAliwsDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAliwsDict").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/aliws-dict").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAliwsDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAliwsDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApm  UpdateApmRequest
     * @return UpdateApmResponse
     */
    @Override
    public CompletableFuture<UpdateApmResponse> updateApm(UpdateApmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApm").setMethod(HttpMethod.PUT).setPathRegex("/openapi/apm/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateBlackIps is deprecated  * @param request  the request parameters of UpdateBlackIps  UpdateBlackIpsRequest
     * @return UpdateBlackIpsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateBlackIpsResponse> updateBlackIps(UpdateBlackIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateBlackIps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/black-ips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBlackIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBlackIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCollector  UpdateCollectorRequest
     * @return UpdateCollectorResponse
     */
    @Override
    public CompletableFuture<UpdateCollectorResponse> updateCollector(UpdateCollectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCollector").setMethod(HttpMethod.PUT).setPathRegex("/openapi/collectors/{ResId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCollectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCollectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCollectorName  UpdateCollectorNameRequest
     * @return UpdateCollectorNameResponse
     */
    @Override
    public CompletableFuture<UpdateCollectorNameResponse> updateCollectorName(UpdateCollectorNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCollectorName").setMethod(HttpMethod.POST).setPathRegex("/openapi/collectors/{ResId}/actions/rename").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCollectorNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCollectorNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateComponentIndex  UpdateComponentIndexRequest
     * @return UpdateComponentIndexResponse
     */
    @Override
    public CompletableFuture<UpdateComponentIndexResponse> updateComponentIndex(UpdateComponentIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateComponentIndex").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/component-index/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComponentIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComponentIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDescription  UpdateDescriptionRequest
     * @return UpdateDescriptionResponse
     */
    @Override
    public CompletableFuture<UpdateDescriptionResponse> updateDescription(UpdateDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDescription").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/description").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDiagnosisSettings  UpdateDiagnosisSettingsRequest
     * @return UpdateDiagnosisSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateDiagnosisSettingsResponse> updateDiagnosisSettings(UpdateDiagnosisSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDiagnosisSettings").setMethod(HttpMethod.PUT).setPathRegex("/openapi/diagnosis/instances/{InstanceId}/settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDiagnosisSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDiagnosisSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDict  UpdateDictRequest
     * @return UpdateDictResponse
     */
    @Override
    public CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDict").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/dict").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDynamicSettings  UpdateDynamicSettingsRequest
     * @return UpdateDynamicSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateDynamicSettingsResponse> updateDynamicSettings(UpdateDynamicSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDynamicSettings").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/dynamic-settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDynamicSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDynamicSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExtendConfig  UpdateExtendConfigRequest
     * @return UpdateExtendConfigResponse
     */
    @Override
    public CompletableFuture<UpdateExtendConfigResponse> updateExtendConfig(UpdateExtendConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExtendConfig").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/extend-configs/actions/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExtendConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExtendConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.</p>
     * 
     * @param request the request parameters of UpdateExtendfiles  UpdateExtendfilesRequest
     * @return UpdateExtendfilesResponse
     */
    @Override
    public CompletableFuture<UpdateExtendfilesResponse> updateExtendfiles(UpdateExtendfilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExtendfiles").setMethod(HttpMethod.PUT).setPathRegex("/openapi/logstashes/{InstanceId}/extendfiles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExtendfilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExtendfilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHotIkDicts  UpdateHotIkDictsRequest
     * @return UpdateHotIkDictsResponse
     */
    @Override
    public CompletableFuture<UpdateHotIkDictsResponse> updateHotIkDicts(UpdateHotIkDictsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHotIkDicts").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/ik-hot-dict").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHotIkDictsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHotIkDictsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateILMPolicy  UpdateILMPolicyRequest
     * @return UpdateILMPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateILMPolicyResponse> updateILMPolicy(UpdateILMPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateILMPolicy").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/ilm-policies/{PolicyName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateILMPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateILMPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIndexTemplate  UpdateIndexTemplateRequest
     * @return UpdateIndexTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateIndexTemplateResponse> updateIndexTemplate(UpdateIndexTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIndexTemplate").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/index-templates/{IndexTemplate}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIndexTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIndexTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>es-cn-n6w1ptcb30009\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstance").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceChargeType  UpdateInstanceChargeTypeRequest
     * @return UpdateInstanceChargeTypeResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceChargeTypeResponse> updateInstanceChargeType(UpdateInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/convert-pay-type").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:
     * When the instance is in the activating, invalid, or inactive state, you cannot update the configuration.</p>
     * 
     * @param request the request parameters of UpdateInstanceSettings  UpdateInstanceSettingsRequest
     * @return UpdateInstanceSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceSettingsResponse> updateInstanceSettings(UpdateInstanceSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceSettings").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/instance-settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateKibanaPvlNetwork  UpdateKibanaPvlNetworkRequest
     * @return UpdateKibanaPvlNetworkResponse
     */
    @Override
    public CompletableFuture<UpdateKibanaPvlNetworkResponse> updateKibanaPvlNetwork(UpdateKibanaPvlNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKibanaPvlNetwork").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/update-kibana-private").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKibanaPvlNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKibanaPvlNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateKibanaSettings  UpdateKibanaSettingsRequest
     * @return UpdateKibanaSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateKibanaSettingsResponse> updateKibanaSettings(UpdateKibanaSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKibanaSettings").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/update-kibana-settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKibanaSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKibanaSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.</p>
     * <ul>
     * <li>You can update an IP address whitelist by using the following parameters:<ul>
     * <li>kibanaIPWhitelist</li>
     * <li>modifyMode and whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>You cannot specify private IP addresses for public IP address whitelists and cannot specify public IP addresses for private IP address whitelists.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKibanaWhiteIps  UpdateKibanaWhiteIpsRequest
     * @return UpdateKibanaWhiteIpsResponse
     */
    @Override
    public CompletableFuture<UpdateKibanaWhiteIpsResponse> updateKibanaWhiteIps(UpdateKibanaWhiteIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKibanaWhiteIps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/kibana-white-ips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKibanaWhiteIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKibanaWhiteIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLogstash  UpdateLogstashRequest
     * @return UpdateLogstashResponse
     */
    @Override
    public CompletableFuture<UpdateLogstashResponse> updateLogstash(UpdateLogstashRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogstash").setMethod(HttpMethod.PUT).setPathRegex("/openapi/logstashes/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogstashResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogstashResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLogstashChargeType  UpdateLogstashChargeTypeRequest
     * @return UpdateLogstashChargeTypeResponse
     */
    @Override
    public CompletableFuture<UpdateLogstashChargeTypeResponse> updateLogstashChargeType(UpdateLogstashChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogstashChargeType").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/actions/convert-pay-type").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogstashChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogstashChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.</p>
     * 
     * @param request the request parameters of UpdateLogstashDescription  UpdateLogstashDescriptionRequest
     * @return UpdateLogstashDescriptionResponse
     */
    @Override
    public CompletableFuture<UpdateLogstashDescriptionResponse> updateLogstashDescription(UpdateLogstashDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogstashDescription").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/description").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogstashDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogstashDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:
     * If the instance is in the Active (activating), Invalid (invalid), and Inactive (inactive) state, the information cannot be updated.</p>
     * 
     * @param request the request parameters of UpdateLogstashSettings  UpdateLogstashSettingsRequest
     * @return UpdateLogstashSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateLogstashSettingsResponse> updateLogstashSettings(UpdateLogstashSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogstashSettings").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/instance-settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogstashSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogstashSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePipelineManagementConfig  UpdatePipelineManagementConfigRequest
     * @return UpdatePipelineManagementConfigResponse
     */
    @Override
    public CompletableFuture<UpdatePipelineManagementConfigResponse> updatePipelineManagementConfig(UpdatePipelineManagementConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePipelineManagementConfig").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/pipeline-management-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelineManagementConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelineManagementConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePipelines  UpdatePipelinesRequest
     * @return UpdatePipelinesResponse
     */
    @Override
    public CompletableFuture<UpdatePipelinesResponse> updatePipelines(UpdatePipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePipelines").setMethod(HttpMethod.PUT).setPathRegex("/openapi/logstashes/{InstanceId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/142230.html">ListInstance</a>. You cannot force a dependency in a program to get these parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdatePrivateNetworkWhiteIps  UpdatePrivateNetworkWhiteIpsRequest
     * @return UpdatePrivateNetworkWhiteIpsResponse
     */
    @Override
    public CompletableFuture<UpdatePrivateNetworkWhiteIpsResponse> updatePrivateNetworkWhiteIps(UpdatePrivateNetworkWhiteIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePrivateNetworkWhiteIps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/private-network-white-ips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePrivateNetworkWhiteIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePrivateNetworkWhiteIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:
     * When the instance is in the activating, invalid, or inactive state, its configuration cannot be updated.</p>
     * 
     * @param request the request parameters of UpdatePublicNetwork  UpdatePublicNetworkRequest
     * @return UpdatePublicNetworkResponse
     */
    @Override
    public CompletableFuture<UpdatePublicNetworkResponse> updatePublicNetwork(UpdatePublicNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePublicNetwork").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/public-network").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublicNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublicNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/142230.html">ListInstance</a>. You cannot force a dependency in a program to get these parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdatePublicWhiteIps  UpdatePublicWhiteIpsRequest
     * @return UpdatePublicWhiteIpsResponse
     */
    @Override
    public CompletableFuture<UpdatePublicWhiteIpsResponse> updatePublicWhiteIps(UpdatePublicWhiteIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePublicWhiteIps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/public-white-ips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublicWhiteIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublicWhiteIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateReadWritePolicy  UpdateReadWritePolicyRequest
     * @return UpdateReadWritePolicyResponse
     */
    @Override
    public CompletableFuture<UpdateReadWritePolicyResponse> updateReadWritePolicy(UpdateReadWritePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateReadWritePolicy").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/update-read-write-policy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateReadWritePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateReadWritePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSnapshotSetting  UpdateSnapshotSettingRequest
     * @return UpdateSnapshotSettingResponse
     */
    @Override
    public CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSnapshotSetting").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/snapshot-setting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSnapshotSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSnapshotSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSynonymsDicts  UpdateSynonymsDictsRequest
     * @return UpdateSynonymsDictsResponse
     */
    @Override
    public CompletableFuture<UpdateSynonymsDictsResponse> updateSynonymsDicts(UpdateSynonymsDictsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSynonymsDicts").setMethod(HttpMethod.PUT).setPathRegex("/openapi/instances/{InstanceId}/synonymsDict").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSynonymsDictsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSynonymsDictsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTemplate").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/templates/{TemplateName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see <a href="https://help.aliyun.com/document_detail/142230.html">ListInstance</a>. You cannot force your program to obtain these parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateWhiteIps  UpdateWhiteIpsRequest
     * @return UpdateWhiteIpsResponse
     */
    @Override
    public CompletableFuture<UpdateWhiteIpsResponse> updateWhiteIps(UpdateWhiteIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWhiteIps").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/white-ips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWhiteIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWhiteIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateXpackMonitorConfig  UpdateXpackMonitorConfigRequest
     * @return UpdateXpackMonitorConfigResponse
     */
    @Override
    public CompletableFuture<UpdateXpackMonitorConfigResponse> updateXpackMonitorConfig(UpdateXpackMonitorConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateXpackMonitorConfig").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/xpack-monitor-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateXpackMonitorConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateXpackMonitorConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of UpgradeEngineVersion  UpgradeEngineVersionRequest
     * @return UpgradeEngineVersionResponse
     */
    @Override
    public CompletableFuture<UpgradeEngineVersionResponse> upgradeEngineVersion(UpgradeEngineVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeEngineVersion").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/actions/upgrade-version").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeEngineVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeEngineVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ValidateConnection  ValidateConnectionRequest
     * @return ValidateConnectionResponse
     */
    @Override
    public CompletableFuture<ValidateConnectionResponse> validateConnection(ValidateConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateConnection").setMethod(HttpMethod.POST).setPathRegex("/openapi/logstashes/{InstanceId}/validate-connection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateShrinkNodes  ValidateShrinkNodesRequest
     * @return ValidateShrinkNodesResponse
     */
    @Override
    public CompletableFuture<ValidateShrinkNodesResponse> validateShrinkNodes(ValidateShrinkNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateShrinkNodes").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/validate-shrink-nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateShrinkNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateShrinkNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateSlrPermission  ValidateSlrPermissionRequest
     * @return ValidateSlrPermissionResponse
     */
    @Override
    public CompletableFuture<ValidateSlrPermissionResponse> validateSlrPermission(ValidateSlrPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateSlrPermission").setMethod(HttpMethod.GET).setPathRegex("/openapi/user/servicerolepermission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateSlrPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateSlrPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateTransferableNodes  ValidateTransferableNodesRequest
     * @return ValidateTransferableNodesResponse
     */
    @Override
    public CompletableFuture<ValidateTransferableNodesResponse> validateTransferableNodes(ValidateTransferableNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateTransferableNodes").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances/{InstanceId}/validate-transfer-nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateTransferableNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateTransferableNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The configurations of warm nodes.</p>
     * 
     * @param request the request parameters of createInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("createInstance").setMethod(HttpMethod.POST).setPathRegex("/openapi/instances").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
