// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.openanalytics_open20180619.models.*;
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
        this.product = "openanalytics-open";
        this.version = "2018-06-19";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "openanalytics.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "openanalytics.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "openanalytics.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "openanalytics.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "openanalytics.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "openanalytics.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "openanalytics.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "datalakeanalytics.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "openanalytics.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "datalakeanalytics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "openanalytics.eu-west-1.aliyuncs.com"),
            new TeaPair("us-west-1", "openanalytics.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "datalakeanalytics.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "datalakeanalytics.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "openanalytics.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "openanalytics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "openanalytics.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-chengdu", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-edge-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-fujian", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "openanalytics.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-qingdao", "openanalytics.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-wuhan", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "openanalytics.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "openanalytics.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "openanalytics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "openanalytics.me-east-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "openanalytics.ap-northeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<CancelSparkStatementResponse> cancelSparkStatement(CancelSparkStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelSparkStatement").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelSparkStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelSparkStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ExecuteSparkStatementResponse> executeSparkStatement(ExecuteSparkStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteSparkStatement").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteSparkStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteSparkStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetJobAttemptLogResponse> getJobAttemptLog(GetJobAttemptLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobAttemptLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobAttemptLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobAttemptLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetJobDetailResponse> getJobDetail(GetJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetSparkSessionStateResponse> getSparkSessionState(GetSparkSessionStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSparkSessionState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSparkSessionStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSparkSessionStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetSparkStatementResponse> getSparkStatement(GetSparkStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSparkStatement").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSparkStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSparkStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<KillSparkJobResponse> killSparkJob(KillSparkJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("KillSparkJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KillSparkJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KillSparkJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListSparkJobResponse> listSparkJob(ListSparkJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSparkJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSparkJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSparkJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListSparkJobAttemptResponse> listSparkJobAttempt(ListSparkJobAttemptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSparkJobAttempt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSparkJobAttemptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSparkJobAttemptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListSparkStatementsResponse> listSparkStatements(ListSparkStatementsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSparkStatements").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSparkStatementsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSparkStatementsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitSparkJobResponse> submitSparkJob(SubmitSparkJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSparkJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSparkJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSparkJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitSparkSQLResponse> submitSparkSQL(SubmitSparkSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSparkSQL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSparkSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSparkSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ValidateVirtualClusterNameResponse> validateVirtualClusterName(ValidateVirtualClusterNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateVirtualClusterName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateVirtualClusterNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateVirtualClusterNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
