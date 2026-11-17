// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qweneduaisuite20261102.models.*;
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
     * <p>开通千问教育API权限</p>
     * 
     * @param request the request parameters of ActivateQwenEduApi  ActivateQwenEduApiRequest
     * @return ActivateQwenEduApiResponse
     */
    CompletableFuture<ActivateQwenEduApiResponse> activateQwenEduApi(ActivateQwenEduApiRequest request);

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
    CompletableFuture<CreateEduHomeworkCorrectSubmitResponse> createEduHomeworkCorrectSubmit(CreateEduHomeworkCorrectSubmitRequest request);

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
    CompletableFuture<CreateEduProblemSolveResponse> createEduProblemSolve(CreateEduProblemSolveRequest request);

    ResponseIterable<CreateEduProblemSolveResponseBody> createEduProblemSolveWithResponseIterable(CreateEduProblemSolveRequest request);

    /**
     * @param request the request parameters of GetEduHomeworkCorrectionResult  GetEduHomeworkCorrectionResultRequest
     * @return GetEduHomeworkCorrectionResultResponse
     */
    CompletableFuture<GetEduHomeworkCorrectionResultResponse> getEduHomeworkCorrectionResult(GetEduHomeworkCorrectionResultRequest request);

    /**
     * @param request the request parameters of GetQwenEduApiActivationStatus  GetQwenEduApiActivationStatusRequest
     * @return GetQwenEduApiActivationStatusResponse
     */
    CompletableFuture<GetQwenEduApiActivationStatusResponse> getQwenEduApiActivationStatus(GetQwenEduApiActivationStatusRequest request);

}
