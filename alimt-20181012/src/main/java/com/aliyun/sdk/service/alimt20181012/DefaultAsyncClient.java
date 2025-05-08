// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.alimt20181012.models.*;
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
        this.product = "alimt";
        this.version = "2018-10-12";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "mt.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mt.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mt.aliyuncs.com"),
            new TeaPair("ap-south-1", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mt.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mt.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mt.aliyuncs.com"),
            new TeaPair("cn-fujian", "mt.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mt.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mt.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mt.aliyuncs.com"),
            new TeaPair("eu-central-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mt.aliyuncs.com"),
            new TeaPair("me-east-1", "mt.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mt.aliyuncs.com"),
            new TeaPair("us-east-1", "mt.aliyuncs.com"),
            new TeaPair("us-west-1", "mt.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateAsyncTranslate  CreateAsyncTranslateRequest
     * @return CreateAsyncTranslateResponse
     */
    @Override
    public CompletableFuture<CreateAsyncTranslateResponse> createAsyncTranslate(CreateAsyncTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAsyncTranslate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAsyncTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAsyncTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateImageTranslateTask  CreateImageTranslateTaskRequest
     * @return CreateImageTranslateTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageTranslateTaskResponse> createImageTranslateTask(CreateImageTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAsyncTranslate  GetAsyncTranslateRequest
     * @return GetAsyncTranslateResponse
     */
    @Override
    public CompletableFuture<GetAsyncTranslateResponse> getAsyncTranslate(GetAsyncTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAsyncTranslate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBatchTranslate  GetBatchTranslateRequest
     * @return GetBatchTranslateResponse
     */
    @Override
    public CompletableFuture<GetBatchTranslateResponse> getBatchTranslate(GetBatchTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBatchTranslate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBatchTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBatchTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBatchTranslateByVPC  GetBatchTranslateByVPCRequest
     * @return GetBatchTranslateByVPCResponse
     */
    @Override
    public CompletableFuture<GetBatchTranslateByVPCResponse> getBatchTranslateByVPC(GetBatchTranslateByVPCRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBatchTranslateByVPC").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBatchTranslateByVPCResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBatchTranslateByVPCResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDetectLanguage  GetDetectLanguageRequest
     * @return GetDetectLanguageResponse
     */
    @Override
    public CompletableFuture<GetDetectLanguageResponse> getDetectLanguage(GetDetectLanguageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDetectLanguage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDetectLanguageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDetectLanguageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDetectLanguageVpc  GetDetectLanguageVpcRequest
     * @return GetDetectLanguageVpcResponse
     */
    @Override
    public CompletableFuture<GetDetectLanguageVpcResponse> getDetectLanguageVpc(GetDetectLanguageVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDetectLanguageVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDetectLanguageVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDetectLanguageVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocTranslateTask  GetDocTranslateTaskRequest
     * @return GetDocTranslateTaskResponse
     */
    @Override
    public CompletableFuture<GetDocTranslateTaskResponse> getDocTranslateTask(GetDocTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDocTranslateTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageDiagnose  GetImageDiagnoseRequest
     * @return GetImageDiagnoseResponse
     */
    @Override
    public CompletableFuture<GetImageDiagnoseResponse> getImageDiagnose(GetImageDiagnoseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageDiagnose").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageDiagnoseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageDiagnoseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageTranslate  GetImageTranslateRequest
     * @return GetImageTranslateResponse
     */
    @Override
    public CompletableFuture<GetImageTranslateResponse> getImageTranslate(GetImageTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageTranslate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageTranslateTask  GetImageTranslateTaskRequest
     * @return GetImageTranslateTaskResponse
     */
    @Override
    public CompletableFuture<GetImageTranslateTaskResponse> getImageTranslateTask(GetImageTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTitleDiagnose  GetTitleDiagnoseRequest
     * @return GetTitleDiagnoseResponse
     */
    @Override
    public CompletableFuture<GetTitleDiagnoseResponse> getTitleDiagnose(GetTitleDiagnoseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTitleDiagnose").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTitleDiagnoseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTitleDiagnoseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTitleGenerate  GetTitleGenerateRequest
     * @return GetTitleGenerateResponse
     */
    @Override
    public CompletableFuture<GetTitleGenerateResponse> getTitleGenerate(GetTitleGenerateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTitleGenerate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTitleGenerateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTitleGenerateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTitleIntelligence  GetTitleIntelligenceRequest
     * @return GetTitleIntelligenceResponse
     */
    @Override
    public CompletableFuture<GetTitleIntelligenceResponse> getTitleIntelligence(GetTitleIntelligenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTitleIntelligence").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTitleIntelligenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTitleIntelligenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTranslateImageBatchResult  GetTranslateImageBatchResultRequest
     * @return GetTranslateImageBatchResultResponse
     */
    @Override
    public CompletableFuture<GetTranslateImageBatchResultResponse> getTranslateImageBatchResult(GetTranslateImageBatchResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranslateImageBatchResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranslateImageBatchResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranslateImageBatchResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTranslateReport  GetTranslateReportRequest
     * @return GetTranslateReportResponse
     */
    @Override
    public CompletableFuture<GetTranslateReportResponse> getTranslateReport(GetTranslateReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranslateReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranslateReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranslateReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenAlimtService  OpenAlimtServiceRequest
     * @return OpenAlimtServiceResponse
     */
    @Override
    public CompletableFuture<OpenAlimtServiceResponse> openAlimtService(OpenAlimtServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenAlimtService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenAlimtServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenAlimtServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Translate  TranslateRequest
     * @return TranslateResponse
     */
    @Override
    public CompletableFuture<TranslateResponse> translate(TranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Translate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI TranslateECommerce is deprecated, please use alimt::2018-10-12::Translate instead.  * @param request  the request parameters of TranslateECommerce  TranslateECommerceRequest
     * @return TranslateECommerceResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<TranslateECommerceResponse> translateECommerce(TranslateECommerceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TranslateECommerce").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateECommerceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateECommerceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TranslateGeneral  TranslateGeneralRequest
     * @return TranslateGeneralResponse
     */
    @Override
    public CompletableFuture<TranslateGeneralResponse> translateGeneral(TranslateGeneralRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TranslateGeneral").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateGeneralResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateGeneralResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TranslateGeneralVpc  TranslateGeneralVpcRequest
     * @return TranslateGeneralVpcResponse
     */
    @Override
    public CompletableFuture<TranslateGeneralVpcResponse> translateGeneralVpc(TranslateGeneralVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TranslateGeneralVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateGeneralVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateGeneralVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TranslateImage  TranslateImageRequest
     * @return TranslateImageResponse
     */
    @Override
    public CompletableFuture<TranslateImageResponse> translateImage(TranslateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TranslateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TranslateImageBatch  TranslateImageBatchRequest
     * @return TranslateImageBatchResponse
     */
    @Override
    public CompletableFuture<TranslateImageBatchResponse> translateImageBatch(TranslateImageBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TranslateImageBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateImageBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateImageBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TranslateSearch  TranslateSearchRequest
     * @return TranslateSearchResponse
     */
    @Override
    public CompletableFuture<TranslateSearchResponse> translateSearch(TranslateSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TranslateSearch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TranslateSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TranslateSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
