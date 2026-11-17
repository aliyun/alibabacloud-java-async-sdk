// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.qweneduaisuite20261102.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "QwenEduAiSuite";
        this.version = "2026-11-02";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>开通千问教育API权限</p>
     * 
     * @param request the request parameters of ActivateQwenEduApi  ActivateQwenEduApiRequest
     * @return ActivateQwenEduApiResponse
     */
    @Override
    public CompletableFuture<ActivateQwenEduApiResponse> activateQwenEduApi(ActivateQwenEduApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ActivateQwenEduApi").setMethod(HttpMethod.POST).setPathRegex("/v1/service/activate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateQwenEduApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateQwenEduApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于提交单页作业图片进行批改，支持通过图片URL或Base64编码的图片数据。</li>
     * <li>提交后会立即返回任务ID、矫正图及题目检测结果，但不包含具体的批改结论。</li>
     * <li>需要通过查询接口轮询获取最终的批改结果。</li>
     * <li>支持对图片进行透视矫正，默认开启。</li>
     * <li>图片要求：支持多种格式（JPEG, PNG, GIF等），推荐体积不超过1MB，最大支持15MB（Base64编码后）。</li>
     * <li>每次请求仅处理一张图片，多张图片需分别提交。</li>
     * <li><code>request_id</code>字段建议由调用方生成并传递，以便于问题排查和对账。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEduHomeworkCorrectSubmit  CreateEduHomeworkCorrectSubmitRequest
     * @return CreateEduHomeworkCorrectSubmitResponse
     */
    @Override
    public CompletableFuture<CreateEduHomeworkCorrectSubmitResponse> createEduHomeworkCorrectSubmit(CreateEduHomeworkCorrectSubmitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEduHomeworkCorrectSubmit").setMethod(HttpMethod.POST).setPathRegex("/v1/homework/correct/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEduHomeworkCorrectSubmitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEduHomeworkCorrectSubmitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过单张题目图片的URL或Base64编码进行解题请求。</li>
     * <li>支持处理JPEG、JPG、PNG格式的图片，且图片大小不超过10MB，像素总数不超过260万。</li>
     * <li>请求必须携带<code>request_id</code>字段，用于链路关联和对账；建议使用UUID以保证唯一性。</li>
     * <li><code>Authorization</code>头部需包含有效的<code>appKey</code>，采用<code>Bearer &lt;appKey&gt;</code>格式。</li>
     * <li>接口响应为SSE流式数据，客户端应逐事件读取并解析，不得等待连接关闭后整体读取。</li>
     * <li>成功响应包括<code>message</code>（过程态全量解题快照）和<code>complete</code>（最终完整结果）两种事件类型。</li>
     * <li>错误处理分为建流前与建流后两个阶段，根据错误码及<code>retryable</code>字段决定是否重试。</li>
     * <li>客户端超时设置建议不低于3分钟，并确保代理层不会缓存SSE响应或提前关闭长连接。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEduProblemSolve  CreateEduProblemSolveRequest
     * @return CreateEduProblemSolveResponse
     */
    @Override
    public CompletableFuture<CreateEduProblemSolveResponse> createEduProblemSolve(CreateEduProblemSolveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEduProblemSolve").setMethod(HttpMethod.POST).setPathRegex("/v1/problem/solve/stream").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEduProblemSolveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEduProblemSolveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<CreateEduProblemSolveResponseBody> createEduProblemSolveWithResponseIterable(CreateEduProblemSolveRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CreateEduProblemSolve").setMethod(HttpMethod.POST).setPathRegex("/v1/problem/solve/stream").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        CreateEduProblemSolveResponseBodyIterator iterator = CreateEduProblemSolveResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of GetEduHomeworkCorrectionResult  GetEduHomeworkCorrectionResultRequest
     * @return GetEduHomeworkCorrectionResultResponse
     */
    @Override
    public CompletableFuture<GetEduHomeworkCorrectionResultResponse> getEduHomeworkCorrectionResult(GetEduHomeworkCorrectionResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEduHomeworkCorrectionResult").setMethod(HttpMethod.GET).setPathRegex("/v1/homework/correct/result").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEduHomeworkCorrectionResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEduHomeworkCorrectionResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQwenEduApiActivationStatus  GetQwenEduApiActivationStatusRequest
     * @return GetQwenEduApiActivationStatusResponse
     */
    @Override
    public CompletableFuture<GetQwenEduApiActivationStatusResponse> getQwenEduApiActivationStatus(GetQwenEduApiActivationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQwenEduApiActivationStatus").setMethod(HttpMethod.GET).setPathRegex("/v1/service/activation/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQwenEduApiActivationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQwenEduApiActivationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
