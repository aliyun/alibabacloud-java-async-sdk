// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.maxcompute20220104.models.*;
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
        this.product = "MaxCompute";
        this.version = "2022-01-04";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-south-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-chengdu", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-edge-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-fujian", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hongkong", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-qingdao", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-wuhan", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-central-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-west-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "maxcompute.aliyuncs.com"),
            new TeaPair("me-east-1", "maxcompute.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("us-east-1", "maxcompute.aliyuncs.com"),
            new TeaPair("us-west-1", "maxcompute.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of ApplyComputeQuotaPlan  ApplyComputeQuotaPlanRequest
     * @return ApplyComputeQuotaPlanResponse
     */
    @Override
    public CompletableFuture<ApplyComputeQuotaPlanResponse> applyComputeQuotaPlan(ApplyComputeQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyComputeQuotaPlan").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaPlan/{planName}/apply").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyComputeQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyComputeQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of CreateComputeQuotaPlan  CreateComputeQuotaPlanRequest
     * @return CreateComputeQuotaPlanResponse
     */
    @Override
    public CompletableFuture<CreateComputeQuotaPlanResponse> createComputeQuotaPlan(CreateComputeQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComputeQuotaPlan").setMethod(HttpMethod.POST).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMmsDataSource  CreateMmsDataSourceRequest
     * @return CreateMmsDataSourceResponse
     */
    @Override
    public CompletableFuture<CreateMmsDataSourceResponse> createMmsDataSource(CreateMmsDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMmsDataSource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMmsDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMmsDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMmsFetchMetadataJob  CreateMmsFetchMetadataJobRequest
     * @return CreateMmsFetchMetadataJobResponse
     */
    @Override
    public CompletableFuture<CreateMmsFetchMetadataJobResponse> createMmsFetchMetadataJob(CreateMmsFetchMetadataJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMmsFetchMetadataJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources/{sourceId}/scans").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMmsFetchMetadataJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMmsFetchMetadataJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMmsJob  CreateMmsJobRequest
     * @return CreateMmsJobResponse
     */
    @Override
    public CompletableFuture<CreateMmsJobResponse> createMmsJob(CreateMmsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMmsJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMmsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMmsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePackage  CreatePackageRequest
     * @return CreatePackageResponse
     */
    @Override
    public CompletableFuture<CreatePackageResponse> createPackage(CreatePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePackage").setMethod(HttpMethod.POST).setPathRegex("/api/v1/projects/{projectName}/packages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/api/v1/projects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQuotaPlan  CreateQuotaPlanRequest
     * @return CreateQuotaPlanResponse
     */
    @Override
    public CompletableFuture<CreateQuotaPlanResponse> createQuotaPlan(CreateQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateQuotaPlan").setMethod(HttpMethod.POST).setPathRegex("/api/v1/quotas/{nickname}/plans").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    @Override
    public CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRole").setMethod(HttpMethod.POST).setPathRegex("/api/v1/projects/{projectName}/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteComputeQuotaPlan  DeleteComputeQuotaPlanRequest
     * @return DeleteComputeQuotaPlanResponse
     */
    @Override
    public CompletableFuture<DeleteComputeQuotaPlanResponse> deleteComputeQuotaPlan(DeleteComputeQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteComputeQuotaPlan").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaPlan/{planName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComputeQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComputeQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMmsDataSource  DeleteMmsDataSourceRequest
     * @return DeleteMmsDataSourceResponse
     */
    @Override
    public CompletableFuture<DeleteMmsDataSourceResponse> deleteMmsDataSource(DeleteMmsDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMmsDataSource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/mms/datasources/{sourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMmsDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMmsDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMmsJob  DeleteMmsJobRequest
     * @return DeleteMmsJobResponse
     */
    @Override
    public CompletableFuture<DeleteMmsJobResponse> deleteMmsJob(DeleteMmsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMmsJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs/{jobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMmsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMmsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQuotaPlan  DeleteQuotaPlanRequest
     * @return DeleteQuotaPlanResponse
     */
    @Override
    public CompletableFuture<DeleteQuotaPlanResponse> deleteQuotaPlan(DeleteQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteQuotaPlan").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/quotas/{nickname}/plans/{planName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetComputeEffectivePlan  GetComputeEffectivePlanRequest
     * @return GetComputeEffectivePlanResponse
     */
    @Override
    public CompletableFuture<GetComputeEffectivePlanResponse> getComputeEffectivePlan(GetComputeEffectivePlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetComputeEffectivePlan").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/computeEffectivePlan/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeEffectivePlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeEffectivePlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetComputeQuotaPlan  GetComputeQuotaPlanRequest
     * @return GetComputeQuotaPlanResponse
     */
    @Override
    public CompletableFuture<GetComputeQuotaPlanResponse> getComputeQuotaPlan(GetComputeQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetComputeQuotaPlan").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaPlan/{planName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetComputeQuotaSchedule  GetComputeQuotaScheduleRequest
     * @return GetComputeQuotaScheduleResponse
     */
    @Override
    public CompletableFuture<GetComputeQuotaScheduleResponse> getComputeQuotaSchedule(GetComputeQuotaScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetComputeQuotaSchedule").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaSchedule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeQuotaScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeQuotaScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobResourceUsage  GetJobResourceUsageRequest
     * @return GetJobResourceUsageResponse
     */
    @Override
    public CompletableFuture<GetJobResourceUsageResponse> getJobResourceUsage(GetJobResourceUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJobResourceUsage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/resourceUsage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobResourceUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobResourceUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsAsyncTask  GetMmsAsyncTaskRequest
     * @return GetMmsAsyncTaskResponse
     */
    @Override
    public CompletableFuture<GetMmsAsyncTaskResponse> getMmsAsyncTask(GetMmsAsyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsAsyncTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/asyncTasks/{asyncTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsAsyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsAsyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsDataSource  GetMmsDataSourceRequest
     * @return GetMmsDataSourceResponse
     */
    @Override
    public CompletableFuture<GetMmsDataSourceResponse> getMmsDataSource(GetMmsDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsDataSource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsDb  GetMmsDbRequest
     * @return GetMmsDbResponse
     */
    @Override
    public CompletableFuture<GetMmsDbResponse> getMmsDb(GetMmsDbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsDb").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/dbs/{dbId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsDbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsDbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsFetchMetadataJob  GetMmsFetchMetadataJobRequest
     * @return GetMmsFetchMetadataJobResponse
     */
    @Override
    public CompletableFuture<GetMmsFetchMetadataJobResponse> getMmsFetchMetadataJob(GetMmsFetchMetadataJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsFetchMetadataJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/scans/{scanId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsFetchMetadataJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsFetchMetadataJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsJob  GetMmsJobRequest
     * @return GetMmsJobResponse
     */
    @Override
    public CompletableFuture<GetMmsJobResponse> getMmsJob(GetMmsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs/{jobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsPartition  GetMmsPartitionRequest
     * @return GetMmsPartitionResponse
     */
    @Override
    public CompletableFuture<GetMmsPartitionResponse> getMmsPartition(GetMmsPartitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsPartition").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/partitions/{partitionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsPartitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsPartitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsTable  GetMmsTableRequest
     * @return GetMmsTableResponse
     */
    @Override
    public CompletableFuture<GetMmsTableResponse> getMmsTable(GetMmsTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/tables/{tableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMmsTask  GetMmsTaskRequest
     * @return GetMmsTaskResponse
     */
    @Override
    public CompletableFuture<GetMmsTaskResponse> getMmsTask(GetMmsTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMmsTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMmsTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMmsTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPackage  GetPackageRequest
     * @return GetPackageResponse
     */
    @Override
    public CompletableFuture<GetPackageResponse> getPackage(GetPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPackage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/packages/{packageName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProject").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuota  GetQuotaRequest
     * @return GetQuotaResponse
     */
    @Override
    public CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQuota").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuotaPlan  GetQuotaPlanRequest
     * @return GetQuotaPlanResponse
     */
    @Override
    public CompletableFuture<GetQuotaPlanResponse> getQuotaPlan(GetQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQuotaPlan").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/plans/{planName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuotaSchedule  GetQuotaScheduleRequest
     * @return GetQuotaScheduleResponse
     */
    @Override
    public CompletableFuture<GetQuotaScheduleResponse> getQuotaSchedule(GetQuotaScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQuotaSchedule").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/schedule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuotaUsage  GetQuotaUsageRequest
     * @return GetQuotaUsageResponse
     */
    @Override
    public CompletableFuture<GetQuotaUsageResponse> getQuotaUsage(GetQuotaUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQuotaUsage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/usage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRoleAcl  GetRoleAclRequest
     * @return GetRoleAclResponse
     */
    @Override
    public CompletableFuture<GetRoleAclResponse> getRoleAcl(GetRoleAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRoleAcl").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/roles/{roleName}/roleAcl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRoleAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRoleAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRoleAclOnObject  GetRoleAclOnObjectRequest
     * @return GetRoleAclOnObjectResponse
     */
    @Override
    public CompletableFuture<GetRoleAclOnObjectResponse> getRoleAclOnObject(GetRoleAclOnObjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRoleAclOnObject").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/roles/{roleName}/acl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRoleAclOnObjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRoleAclOnObjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRolePolicy  GetRolePolicyRequest
     * @return GetRolePolicyResponse
     */
    @Override
    public CompletableFuture<GetRolePolicyResponse> getRolePolicy(GetRolePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRolePolicy").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/roles/{roleName}/policy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRolePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRolePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRunningJobs  GetRunningJobsRequest
     * @return GetRunningJobsResponse
     */
    @Override
    public CompletableFuture<GetRunningJobsResponse> getRunningJobs(GetRunningJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRunningJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobs/runningJobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRunningJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRunningJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTableInfo  GetTableInfoRequest
     * @return GetTableInfoResponse
     */
    @Override
    public CompletableFuture<GetTableInfoResponse> getTableInfo(GetTableInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTableInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/tables/{tableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrustedProjects  GetTrustedProjectsRequest
     * @return GetTrustedProjectsResponse
     */
    @Override
    public CompletableFuture<GetTrustedProjectsResponse> getTrustedProjects(GetTrustedProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrustedProjects").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/trustedProjects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrustedProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrustedProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of KillJobs  KillJobsRequest
     * @return KillJobsResponse
     */
    @Override
    public CompletableFuture<KillJobsResponse> killJobs(KillJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("KillJobs").setMethod(HttpMethod.POST).setPathRegex("/api/v1/jobs/kill").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KillJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KillJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComputeQuotaPlan  ListComputeQuotaPlanRequest
     * @return ListComputeQuotaPlanResponse
     */
    @Override
    public CompletableFuture<ListComputeQuotaPlanResponse> listComputeQuotaPlan(ListComputeQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComputeQuotaPlan").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    @Override
    public CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFunctions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/functions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFunctionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFunctionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobInfos  ListJobInfosRequest
     * @return ListJobInfosResponse
     */
    @Override
    public CompletableFuture<ListJobInfosResponse> listJobInfos(ListJobInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobInfos").setMethod(HttpMethod.POST).setPathRegex("/api/v1/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsDataSources  ListMmsDataSourcesRequest
     * @return ListMmsDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListMmsDataSourcesResponse> listMmsDataSources(ListMmsDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsDataSources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsDbs  ListMmsDbsRequest
     * @return ListMmsDbsResponse
     */
    @Override
    public CompletableFuture<ListMmsDbsResponse> listMmsDbs(ListMmsDbsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsDbs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/dbs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsDbsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsDbsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsJobs  ListMmsJobsRequest
     * @return ListMmsJobsResponse
     */
    @Override
    public CompletableFuture<ListMmsJobsResponse> listMmsJobs(ListMmsJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsPartitions  ListMmsPartitionsRequest
     * @return ListMmsPartitionsResponse
     */
    @Override
    public CompletableFuture<ListMmsPartitionsResponse> listMmsPartitions(ListMmsPartitionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsPartitions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/partitions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsPartitionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsPartitionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsTables  ListMmsTablesRequest
     * @return ListMmsTablesResponse
     */
    @Override
    public CompletableFuture<ListMmsTablesResponse> listMmsTables(ListMmsTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsTaskLogs  ListMmsTaskLogsRequest
     * @return ListMmsTaskLogsResponse
     */
    @Override
    public CompletableFuture<ListMmsTaskLogsResponse> listMmsTaskLogs(ListMmsTaskLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsTaskLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/tasks/{taskId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsTaskLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsTaskLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMmsTasks  ListMmsTasksRequest
     * @return ListMmsTasksResponse
     */
    @Override
    public CompletableFuture<ListMmsTasksResponse> listMmsTasks(ListMmsTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMmsTasks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/mms/datasources/{sourceId}/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMmsTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMmsTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPackages  ListPackagesRequest
     * @return ListPackagesResponse
     */
    @Override
    public CompletableFuture<ListPackagesResponse> listPackages(ListPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPackages").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/packages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectUsers  ListProjectUsersRequest
     * @return ListProjectUsersResponse
     */
    @Override
    public CompletableFuture<ListProjectUsersResponse> listProjectUsers(ListProjectUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjectUsers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    @Override
    public CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjects").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    @Override
    public CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListQuotas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotasPlans  ListQuotasPlansRequest
     * @return ListQuotasPlansResponse
     */
    @Override
    public CompletableFuture<ListQuotasPlansResponse> listQuotasPlans(ListQuotasPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListQuotasPlans").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/plans").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotasPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotasPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    @Override
    public CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    @Override
    public CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRoles").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStoragePartitionsInfo  ListStoragePartitionsInfoRequest
     * @return ListStoragePartitionsInfoResponse
     */
    @Override
    public CompletableFuture<ListStoragePartitionsInfoResponse> listStoragePartitionsInfo(ListStoragePartitionsInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListStoragePartitionsInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/observations/analysis/storage/projects/{project}/tables/{table}/partitionsInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStoragePartitionsInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStoragePartitionsInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStorageTablesInfo  ListStorageTablesInfoRequest
     * @return ListStorageTablesInfoResponse
     */
    @Override
    public CompletableFuture<ListStorageTablesInfoResponse> listStorageTablesInfo(ListStorageTablesInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListStorageTablesInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/observations/analysis/storage/projects/{project}/tablesInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStorageTablesInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStorageTablesInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTunnelQuotaTimer  ListTunnelQuotaTimerRequest
     * @return ListTunnelQuotaTimerResponse
     */
    @Override
    public CompletableFuture<ListTunnelQuotaTimerResponse> listTunnelQuotaTimer(ListTunnelQuotaTimerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTunnelQuotaTimer").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tunnel/{nickname}/timers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTunnelQuotaTimerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTunnelQuotaTimerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUsersByRole  ListUsersByRoleRequest
     * @return ListUsersByRoleResponse
     */
    @Override
    public CompletableFuture<ListUsersByRoleResponse> listUsersByRole(ListUsersByRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsersByRole").setMethod(HttpMethod.GET).setPathRegex("/api/v1/projects/{projectName}/roles/{roleName}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersByRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersByRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryQuota  QueryQuotaRequest
     * @return QueryQuotaResponse
     */
    @Override
    public CompletableFuture<QueryQuotaResponse> queryQuota(QueryQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryQuota").setMethod(HttpMethod.GET).setPathRegex("/api/v1/quotas/{nickname}/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryMmsJob  RetryMmsJobRequest
     * @return RetryMmsJobResponse
     */
    @Override
    public CompletableFuture<RetryMmsJobResponse> retryMmsJob(RetryMmsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryMmsJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs/{jobId}/retry").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryMmsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryMmsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartMmsJob  StartMmsJobRequest
     * @return StartMmsJobResponse
     */
    @Override
    public CompletableFuture<StartMmsJobResponse> startMmsJob(StartMmsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartMmsJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs/{jobId}/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartMmsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartMmsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopMmsJob  StopMmsJobRequest
     * @return StopMmsJobResponse
     */
    @Override
    public CompletableFuture<StopMmsJobResponse> stopMmsJob(StopMmsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopMmsJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/mms/datasources/{sourceId}/jobs/{jobId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopMmsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopMmsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of UpdateComputeQuotaPlan  UpdateComputeQuotaPlanRequest
     * @return UpdateComputeQuotaPlanResponse
     */
    @Override
    public CompletableFuture<UpdateComputeQuotaPlanResponse> updateComputeQuotaPlan(UpdateComputeQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateComputeQuotaPlan").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of UpdateComputeQuotaSchedule  UpdateComputeQuotaScheduleRequest
     * @return UpdateComputeQuotaScheduleResponse
     */
    @Override
    public CompletableFuture<UpdateComputeQuotaScheduleResponse> updateComputeQuotaSchedule(UpdateComputeQuotaScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateComputeQuotaSchedule").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{nickname}/computeQuotaSchedule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeQuotaScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeQuotaScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateComputeSubQuota  UpdateComputeSubQuotaRequest
     * @return UpdateComputeSubQuotaResponse
     */
    @Override
    public CompletableFuture<UpdateComputeSubQuotaResponse> updateComputeSubQuota(UpdateComputeSubQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateComputeSubQuota").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{nickname}/computeSubQuota").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeSubQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeSubQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMmsDataSource  UpdateMmsDataSourceRequest
     * @return UpdateMmsDataSourceResponse
     */
    @Override
    public CompletableFuture<UpdateMmsDataSourceResponse> updateMmsDataSource(UpdateMmsDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMmsDataSource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/mms/datasources/{sourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMmsDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMmsDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePackage  UpdatePackageRequest
     * @return UpdatePackageResponse
     */
    @Override
    public CompletableFuture<UpdatePackageResponse> updatePackage(UpdatePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePackage").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/projects/{projectName}/packages/{packageName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectBasicMeta  UpdateProjectBasicMetaRequest
     * @return UpdateProjectBasicMetaResponse
     */
    @Override
    public CompletableFuture<UpdateProjectBasicMetaResponse> updateProjectBasicMeta(UpdateProjectBasicMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProjectBasicMeta").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/projects/{projectName}/meta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectBasicMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectBasicMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectDefaultQuota  UpdateProjectDefaultQuotaRequest
     * @return UpdateProjectDefaultQuotaResponse
     */
    @Override
    public CompletableFuture<UpdateProjectDefaultQuotaResponse> updateProjectDefaultQuota(UpdateProjectDefaultQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProjectDefaultQuota").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/projects/{projectName}/quota").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectDefaultQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectDefaultQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectIpWhiteList  UpdateProjectIpWhiteListRequest
     * @return UpdateProjectIpWhiteListResponse
     */
    @Override
    public CompletableFuture<UpdateProjectIpWhiteListResponse> updateProjectIpWhiteList(UpdateProjectIpWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProjectIpWhiteList").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/projects/{projectName}/ipWhiteList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectIpWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectIpWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQuotaPlan  UpdateQuotaPlanRequest
     * @return UpdateQuotaPlanResponse
     */
    @Override
    public CompletableFuture<UpdateQuotaPlanResponse> updateQuotaPlan(UpdateQuotaPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateQuotaPlan").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{nickname}/plans/{planName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQuotaPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQuotaPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQuotaSchedule  UpdateQuotaScheduleRequest
     * @return UpdateQuotaScheduleResponse
     */
    @Override
    public CompletableFuture<UpdateQuotaScheduleResponse> updateQuotaSchedule(UpdateQuotaScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateQuotaSchedule").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/quotas/{nickname}/schedule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQuotaScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQuotaScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTunnelQuotaTimer  UpdateTunnelQuotaTimerRequest
     * @return UpdateTunnelQuotaTimerResponse
     */
    @Override
    public CompletableFuture<UpdateTunnelQuotaTimerResponse> updateTunnelQuotaTimer(UpdateTunnelQuotaTimerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTunnelQuotaTimer").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tunnel/{nickname}/timers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTunnelQuotaTimerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTunnelQuotaTimerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
