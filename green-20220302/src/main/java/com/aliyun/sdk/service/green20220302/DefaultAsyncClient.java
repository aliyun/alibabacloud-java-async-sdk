// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.green20220302.models.*;
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
        this.product = "Green";
        this.version = "2022-03-02";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "green.aliyuncs.com"),
            new TeaPair("cn-hongkong", "green.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "green.aliyuncs.com"),
            new TeaPair("cn-qingdao", "green.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "green.aliyuncs.com"),
            new TeaPair("eu-central-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "green.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "green.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of DescribeFileModerationResult  DescribeFileModerationResultRequest
     * @return DescribeFileModerationResultResponse
     */
    @Override
    public CompletableFuture<DescribeFileModerationResultResponse> describeFileModerationResult(DescribeFileModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFileModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>QPS limit: You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImageModerationResult  DescribeImageModerationResultRequest
     * @return DescribeImageModerationResultResponse
     */
    @Override
    public CompletableFuture<DescribeImageModerationResultResponse> describeImageModerationResult(DescribeImageModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageResultExt  DescribeImageResultExtRequest
     * @return DescribeImageResultExtResponse
     */
    @Override
    public CompletableFuture<DescribeImageResultExtResponse> describeImageResultExt(DescribeImageResultExtRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageResultExt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageResultExtResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageResultExtResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUploadToken  DescribeUploadTokenRequest
     * @return DescribeUploadTokenResponse
     */
    @Override
    public CompletableFuture<DescribeUploadTokenResponse> describeUploadToken(DescribeUploadTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUploadToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUploadTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUploadTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>Query timeout: We recommend that you query moderation results at least 480 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for up to 3 days. After 3 days, the results are deleted.</li>
     * <li>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUrlModerationResult  DescribeUrlModerationResultRequest
     * @return DescribeUrlModerationResultResponse
     */
    @Override
    public CompletableFuture<DescribeUrlModerationResultResponse> describeUrlModerationResult(DescribeUrlModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUrlModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUrlModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUrlModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FileModeration  FileModerationRequest
     * @return FileModerationResponse
     */
    @Override
    public CompletableFuture<FileModerationResponse> fileModeration(FileModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FileModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FileModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FileModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageAsyncModeration  ImageAsyncModerationRequest
     * @return ImageAsyncModerationResponse
     */
    @Override
    public CompletableFuture<ImageAsyncModerationResponse> imageAsyncModeration(ImageAsyncModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageAsyncModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageAsyncModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageAsyncModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageBatchModeration  ImageBatchModerationRequest
     * @return ImageBatchModerationResponse
     */
    @Override
    public CompletableFuture<ImageBatchModerationResponse> imageBatchModeration(ImageBatchModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageBatchModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageBatchModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageBatchModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/467826.html">billing</a><a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag"></a> of Image Moderation 2.0.</p>
     * 
     * @param request the request parameters of ImageModeration  ImageModerationRequest
     * @return ImageModerationResponse
     */
    @Override
    public CompletableFuture<ImageModerationResponse> imageModeration(ImageModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TextModeration  TextModerationRequest
     * @return TextModerationResponse
     */
    @Override
    public CompletableFuture<TextModerationResponse> textModeration(TextModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TextModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TextModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TextModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activated the Content Moderation 2.0 service</a> and are familiar with the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing</a> of the Text Moderation 2.0 Plus service.</p>
     * 
     * @param request the request parameters of TextModerationPlus  TextModerationPlusRequest
     * @return TextModerationPlusResponse
     */
    @Override
    public CompletableFuture<TextModerationPlusResponse> textModerationPlus(TextModerationPlusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TextModerationPlus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TextModerationPlusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TextModerationPlusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UrlAsyncModeration  UrlAsyncModerationRequest
     * @return UrlAsyncModerationResponse
     */
    @Override
    public CompletableFuture<UrlAsyncModerationResponse> urlAsyncModeration(UrlAsyncModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UrlAsyncModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UrlAsyncModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UrlAsyncModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VideoModeration  VideoModerationRequest
     * @return VideoModerationResponse
     */
    @Override
    public CompletableFuture<VideoModerationResponse> videoModeration(VideoModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VideoModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VideoModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VideoModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VideoModerationCancel  VideoModerationCancelRequest
     * @return VideoModerationCancelResponse
     */
    @Override
    public CompletableFuture<VideoModerationCancelResponse> videoModerationCancel(VideoModerationCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VideoModerationCancel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VideoModerationCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VideoModerationCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is free of charge. We recommend that you query moderation results at least 30 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for at most 24 hours. After 24 hours, the results are deleted.</p>
     * 
     * @param request the request parameters of VideoModerationResult  VideoModerationResultRequest
     * @return VideoModerationResultResponse
     */
    @Override
    public CompletableFuture<VideoModerationResultResponse> videoModerationResult(VideoModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VideoModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VideoModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VideoModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VoiceModeration  VoiceModerationRequest
     * @return VoiceModerationResponse
     */
    @Override
    public CompletableFuture<VoiceModerationResponse> voiceModeration(VoiceModerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VoiceModeration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VoiceModerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VoiceModerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VoiceModerationCancel  VoiceModerationCancelRequest
     * @return VoiceModerationCancelResponse
     */
    @Override
    public CompletableFuture<VoiceModerationCancelResponse> voiceModerationCancel(VoiceModerationCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VoiceModerationCancel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VoiceModerationCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VoiceModerationCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VoiceModerationResult  VoiceModerationResultRequest
     * @return VoiceModerationResultResponse
     */
    @Override
    public CompletableFuture<VoiceModerationResultResponse> voiceModerationResult(VoiceModerationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VoiceModerationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VoiceModerationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VoiceModerationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
