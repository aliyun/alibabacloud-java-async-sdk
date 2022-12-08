// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.docmind_api20220711.models.*;
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
        this.product = "docmind-api";
        this.version = "2022-07-11";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-south-1", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-chengdu", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-edge-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-fujian", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hongkong", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-qingdao", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-wuhan", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "docmind-api.aliyuncs.com"),
            new TeaPair("eu-central-1", "docmind-api.aliyuncs.com"),
            new TeaPair("eu-west-1", "docmind-api.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "docmind-api.aliyuncs.com"),
            new TeaPair("me-east-1", "docmind-api.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("us-east-1", "docmind-api.aliyuncs.com"),
            new TeaPair("us-west-1", "docmind-api.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<GetDocStructureResultResponse> getDocStructureResult(GetDocStructureResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDocStructureResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocStructureResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocStructureResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDocumentCompareResultResponse> getDocumentCompareResult(GetDocumentCompareResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDocumentCompareResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentCompareResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentCompareResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDocumentConvertResultResponse> getDocumentConvertResult(GetDocumentConvertResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDocumentConvertResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentConvertResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentConvertResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDocumentExtractResultResponse> getDocumentExtractResult(GetDocumentExtractResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDocumentExtractResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentExtractResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentExtractResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetTableUnderstandingResultResponse> getTableUnderstandingResult(GetTableUnderstandingResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTableUnderstandingResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableUnderstandingResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableUnderstandingResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitConvertImageToExcelJobResponse> submitConvertImageToExcelJob(SubmitConvertImageToExcelJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitConvertImageToExcelJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitConvertImageToExcelJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitConvertImageToExcelJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitConvertImageToPdfJobResponse> submitConvertImageToPdfJob(SubmitConvertImageToPdfJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitConvertImageToPdfJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitConvertImageToPdfJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitConvertImageToPdfJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitConvertImageToWordJobResponse> submitConvertImageToWordJob(SubmitConvertImageToWordJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitConvertImageToWordJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitConvertImageToWordJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitConvertImageToWordJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitDocumentCompareJobResponse> submitDocumentCompareJob(SubmitDocumentCompareJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDocumentCompareJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDocumentCompareJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDocumentCompareJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
