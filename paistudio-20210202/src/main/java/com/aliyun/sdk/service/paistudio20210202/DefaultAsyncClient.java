// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.paistudio20210202.models.*;
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
        this.product = "PaiStudio";
        this.version = "2021-02-02";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "pai.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai.cn-hangzhou.data.aliyun.com"),
            new TeaPair("cn-shanghai", "pai.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "pai.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "pai.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "pai.me-east-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "pai.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "pai.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "pai.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai.cn-zhangjiakou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CopyExperiment  CopyExperimentRequest
     * @return CopyExperimentResponse
     */
    @Override
    public CompletableFuture<CopyExperimentResponse> copyExperiment(CopyExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CopyExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/copy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    @Override
    public CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperimentFolder  CreateExperimentFolderRequest
     * @return CreateExperimentFolderResponse
     */
    @Override
    public CompletableFuture<CreateExperimentFolderResponse> createExperimentFolder(CreateExperimentFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperimentFolder").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentfolders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperimentMigrateValidation  CreateExperimentMigrateValidationRequest
     * @return CreateExperimentMigrateValidationResponse
     */
    @Override
    public CompletableFuture<CreateExperimentMigrateValidationResponse> createExperimentMigrateValidation(CreateExperimentMigrateValidationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperimentMigrateValidation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/migrate/experimentvalidation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentMigrateValidationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentMigrateValidationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    @Override
    public CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperiment").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperimentFolder  DeleteExperimentFolderRequest
     * @return DeleteExperimentFolderResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentFolderResponse> deleteExperimentFolder(DeleteExperimentFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperimentFolder").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experimentfolders/{FolderId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlgoTree  GetAlgoTreeRequest
     * @return GetAlgoTreeResponse
     */
    @Override
    public CompletableFuture<GetAlgoTreeResponse> getAlgoTree(GetAlgoTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlgoTree").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algo/tree").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlgoTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlgoTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlgorithmDef  GetAlgorithmDefRequest
     * @return GetAlgorithmDefResponse
     */
    @Override
    public CompletableFuture<GetAlgorithmDefResponse> getAlgorithmDef(GetAlgorithmDefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlgorithmDef").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithm/def").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlgorithmDefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlgorithmDefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlgorithmDefs  GetAlgorithmDefsRequest
     * @return GetAlgorithmDefsResponse
     */
    @Override
    public CompletableFuture<GetAlgorithmDefsResponse> getAlgorithmDefs(GetAlgorithmDefsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlgorithmDefs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithm/defs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlgorithmDefsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlgorithmDefsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlgorithmTree  GetAlgorithmTreeRequest
     * @return GetAlgorithmTreeResponse
     */
    @Override
    public CompletableFuture<GetAlgorithmTreeResponse> getAlgorithmTree(GetAlgorithmTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlgorithmTree").setMethod(HttpMethod.GET).setPathRegex("/api/v1/algorithm/tree").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlgorithmTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlgorithmTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    @Override
    public CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperiment").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentFolderChildren  GetExperimentFolderChildrenRequest
     * @return GetExperimentFolderChildrenResponse
     */
    @Override
    public CompletableFuture<GetExperimentFolderChildrenResponse> getExperimentFolderChildren(GetExperimentFolderChildrenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentFolderChildren").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experimentfolders/{FolderId}/children").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentFolderChildrenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentFolderChildrenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentMeta  GetExperimentMetaRequest
     * @return GetExperimentMetaResponse
     */
    @Override
    public CompletableFuture<GetExperimentMetaResponse> getExperimentMeta(GetExperimentMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentMeta").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}/meta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentStatus  GetExperimentStatusRequest
     * @return GetExperimentStatusResponse
     */
    @Override
    public CompletableFuture<GetExperimentStatusResponse> getExperimentStatus(GetExperimentStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentVisualizationMeta  GetExperimentVisualizationMetaRequest
     * @return GetExperimentVisualizationMetaResponse
     */
    @Override
    public CompletableFuture<GetExperimentVisualizationMetaResponse> getExperimentVisualizationMeta(GetExperimentVisualizationMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentVisualizationMeta").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}/visualizationMeta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentVisualizationMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentVisualizationMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentsStatistics  GetExperimentsStatisticsRequest
     * @return GetExperimentsStatisticsResponse
     */
    @Override
    public CompletableFuture<GetExperimentsStatisticsResponse> getExperimentsStatistics(GetExperimentsStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentsStatistics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/statistics/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentsStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentsStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentsUsersStatistics  GetExperimentsUsersStatisticsRequest
     * @return GetExperimentsUsersStatisticsResponse
     */
    @Override
    public CompletableFuture<GetExperimentsUsersStatisticsResponse> getExperimentsUsersStatistics(GetExperimentsUsersStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentsUsersStatistics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/statistics/experimentsusers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentsUsersStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentsUsersStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    @Override
    public CompletableFuture<GetJobResponse> getJob(GetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/{JobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMCTableSchema  GetMCTableSchemaRequest
     * @return GetMCTableSchemaResponse
     */
    @Override
    public CompletableFuture<GetMCTableSchemaResponse> getMCTableSchema(GetMCTableSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMCTableSchema").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasources/maxcompute/tables/{TableName}/schema").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMCTableSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMCTableSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeInputSchema  GetNodeInputSchemaRequest
     * @return GetNodeInputSchemaResponse
     */
    @Override
    public CompletableFuture<GetNodeInputSchemaResponse> getNodeInputSchema(GetNodeInputSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNodeInputSchema").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}/nodes/{NodeId}/schema").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeInputSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeInputSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeOutput  GetNodeOutputRequest
     * @return GetNodeOutputResponse
     */
    @Override
    public CompletableFuture<GetNodeOutputResponse> getNodeOutput(GetNodeOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNodeOutput").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}/nodes/{NodeId}/outputs/{OutputId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    @Override
    public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTemplate").setMethod(HttpMethod.GET).setPathRegex("/api/v1/templates/{TemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAuthRoles  ListAuthRolesRequest
     * @return ListAuthRolesResponse
     */
    @Override
    public CompletableFuture<ListAuthRolesResponse> listAuthRoles(ListAuthRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAuthRoles").setMethod(HttpMethod.GET).setPathRegex("/api/v1/authorization/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    @Override
    public CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperiments").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImageLabels  ListImageLabelsRequest
     * @return ListImageLabelsResponse
     */
    @Override
    public CompletableFuture<ListImageLabelsResponse> listImageLabels(ListImageLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListImageLabels").setMethod(HttpMethod.GET).setPathRegex("/api/v1/image/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    @Override
    public CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListImages").setMethod(HttpMethod.GET).setPathRegex("/api/v1/images").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    @Override
    public CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodeOutputs  ListNodeOutputsRequest
     * @return ListNodeOutputsResponse
     */
    @Override
    public CompletableFuture<ListNodeOutputsResponse> listNodeOutputs(ListNodeOutputsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNodeOutputs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}/nodes/{NodeId}/outputs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeOutputsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeOutputsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRecentExperiments  ListRecentExperimentsRequest
     * @return ListRecentExperimentsResponse
     */
    @Override
    public CompletableFuture<ListRecentExperimentsResponse> listRecentExperiments(ListRecentExperimentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecentExperiments").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recentexperiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecentExperimentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecentExperimentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    @Override
    public CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTemplates").setMethod(HttpMethod.GET).setPathRegex("/api/v1/templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MigrateExperimentFolders  MigrateExperimentFoldersRequest
     * @return MigrateExperimentFoldersResponse
     */
    @Override
    public CompletableFuture<MigrateExperimentFoldersResponse> migrateExperimentFolders(MigrateExperimentFoldersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MigrateExperimentFolders").setMethod(HttpMethod.POST).setPathRegex("/api/v1/migrate/folders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateExperimentFoldersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateExperimentFoldersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MigrateExperiments  MigrateExperimentsRequest
     * @return MigrateExperimentsResponse
     */
    @Override
    public CompletableFuture<MigrateExperimentsResponse> migrateExperiments(MigrateExperimentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MigrateExperiments").setMethod(HttpMethod.POST).setPathRegex("/api/v1/migrate/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateExperimentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateExperimentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreviewMCTable  PreviewMCTableRequest
     * @return PreviewMCTableResponse
     */
    @Override
    public CompletableFuture<PreviewMCTableResponse> previewMCTable(PreviewMCTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreviewMCTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasources/maxcompute/tables/{TableName}/preview").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewMCTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewMCTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishExperiment  PublishExperimentRequest
     * @return PublishExperimentResponse
     */
    @Override
    public CompletableFuture<PublishExperimentResponse> publishExperiment(PublishExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishExperiment").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryExperimentVisualizationData  QueryExperimentVisualizationDataRequest
     * @return QueryExperimentVisualizationDataResponse
     */
    @Override
    public CompletableFuture<QueryExperimentVisualizationDataResponse> queryExperimentVisualizationData(QueryExperimentVisualizationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryExperimentVisualizationData").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}/visualizationDataQuery").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryExperimentVisualizationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryExperimentVisualizationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchMCTables  SearchMCTablesRequest
     * @return SearchMCTablesResponse
     */
    @Override
    public CompletableFuture<SearchMCTablesResponse> searchMCTables(SearchMCTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchMCTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datasources/maxcompute/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMCTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMCTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopExperiment  StopExperimentRequest
     * @return StopExperimentResponse
     */
    @Override
    public CompletableFuture<StopExperimentResponse> stopExperiment(StopExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopJob  StopJobRequest
     * @return StopJobResponse
     */
    @Override
    public CompletableFuture<StopJobResponse> stopJob(StopJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopJob").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/jobs/{JobId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentContent  UpdateExperimentContentRequest
     * @return UpdateExperimentContentResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentContentResponse> updateExperimentContent(UpdateExperimentContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentContent").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}/content").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentFolder  UpdateExperimentFolderRequest
     * @return UpdateExperimentFolderResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentFolderResponse> updateExperimentFolder(UpdateExperimentFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentFolder").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experimentfolders/{FolderId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentMeta  UpdateExperimentMetaRequest
     * @return UpdateExperimentMetaResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentMetaResponse> updateExperimentMeta(UpdateExperimentMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentMeta").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}/meta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
