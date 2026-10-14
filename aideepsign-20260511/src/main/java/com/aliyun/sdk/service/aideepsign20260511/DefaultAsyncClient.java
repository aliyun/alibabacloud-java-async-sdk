// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aideepsign20260511.models.*;
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
        this.product = "AIDeepSign";
        this.version = "2026-05-11";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation stops a batch trusted signing task for a bucket owned by the currently authenticated account. TaskId is the parent task ID of the bucket returned by CreateC2paBucketSignTask.</li>
     * <li>When the returned Status is <code>CANCELING</code>, the task is completing the stop process. Repeated requests may return the completed <code>CANCELED</code> status.</li>
     * <li>Call GetC2paSignResult to query the task status and final result.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelC2paBucketSignTask  CancelC2paBucketSignTaskRequest
     * @return CancelC2paBucketSignTaskResponse
     */
    @Override
    public CompletableFuture<CancelC2paBucketSignTaskResponse> cancelC2paBucketSignTask(CancelC2paBucketSignTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelC2paBucketSignTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelC2paBucketSignTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelC2paBucketSignTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a batch C2PA content credential signing task for files under a specified source prefix in an OSS bucket. It supports JPEG, JPG, PNG, MP4, FLAC, M4A, MP3, and WAV formats, and allows mixed processing under the same prefix.</li>
     * <li><code>SourcePrefix</code> must be <code>ai-deepsign/</code> or its subdirectory, and must not overlap with the output prefix <code>ai-deepsign-signed/</code>.</li>
     * <li>By default, a single task processes up to 20,000 non-directory objects. The size of a single file must not exceed 800 MiB.</li>
     * <li>The RAM identity of the caller must have permissions to call this operation. The service-linked role <code>AliyunServiceRoleForAIDeepSign</code> must have access permissions to the specified bucket and associated paths.</li>
     * <li>File name extensions are case-insensitive. Files in unsupported formats are recorded as failed, but this does not abort the processing of other files.</li>
     * <li>The signing results are written to the <code>ai-deepsign-signed/&lt;TaskId&gt;/</code> directory in the same bucket. The subdirectories relative to <code>SourcePrefix</code> and the source file name extensions are preserved, and <code>_signed</code> is added before the file name extension. The processing report is <code>c2pa_report.json</code> in the task directory.</li>
     * <li>For example, if <code>SourcePrefix=ai-deepsign/images/</code>, the signing result for the source file <code>ai-deepsign/images/audio/demo.m4a</code> is <code>ai-deepsign-signed/&lt;TaskId&gt;/audio/demo_signed.m4a</code>.</li>
     * <li>A successful creation only indicates that the task has been accepted. Call <code>GetC2paSignResult</code> to query the results. A <code>SUCCEEDED</code> status for a batch task does not mean that every file was signed successfully. Check the final statistics and processing report for file-by-file results.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateC2paBucketSignTask  CreateC2paBucketSignTaskRequest
     * @return CreateC2paBucketSignTaskResponse
     */
    @Override
    public CompletableFuture<CreateC2paBucketSignTaskResponse> createC2paBucketSignTask(CreateC2paBucketSignTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateC2paBucketSignTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateC2paBucketSignTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateC2paBucketSignTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation adds standard C2PA content credentials to a single JPEG/JPG, PNG, MP4, FLAC, M4A, MP3, or WAV file.</li>
     * <li><code>FileUrl</code> must be an absolute HTTP or HTTPS URL accessible by the service and cannot contain a username or password.</li>
     * <li>File name extensions are case-insensitive, and URL query parameters are not used for file name identification. For example, the file name for <code>https://example.com/media/demo.m4a?token=xxx</code> is <code>demo.m4a</code>.</li>
     * <li>The source URL must directly return an HTTP 200 status code. Redirect URLs are not supported.</li>
     * <li>The size of a single file cannot exceed 800 MiB. Provide a valid file in a supported format. Changing only the file name extension does not transform the file format.</li>
     * <li>The signing result retains the source file name extension and adds <code>_signed</code> before the extension. For example, <code>demo.m4a</code> becomes <code>demo_signed.m4a</code>.</li>
     * <li>Unsupported file name extensions return <code>InvalidParam</code>, and the error message is <code>FileUrl only supports files with .jpg, .jpeg, .png, .mp4, .flac, .m4a, .mp3, or .wav extensions</code>.</li>
     * <li>A successful creation only indicates that the task has been accepted. Save the returned <code>TaskId</code> and invoke <code>GetC2paSignResult</code> to query the task status and final result.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateC2paSignTask  CreateC2paSignTaskRequest
     * @return CreateC2paSignTaskResponse
     */
    @Override
    public CompletableFuture<CreateC2paSignTaskResponse> createC2paSignTask(CreateC2paSignTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateC2paSignTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateC2paSignTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateC2paSignTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation commits an image to the server for defect detection, including but not limited to blurriness, distortion, glare, and other anomalies in the image subject.</li>
     * <li><strong>ImageUrl is required</strong> and must be a publicly accessible HTTP/HTTPS URL. Currently, only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single object or the URLs of multiple objects</a></li>
     * <li>After successful commit, a node ID is returned immediately. Regardless of whether the node has been completed or is still being processed, call the GetImageDefectDetectionTaskResult operation to perform polling for the final detection result.</li>
     * <li>If a parameter fault or other issue occurs during the commit procedure, the corresponding error message is returned directly without creating a node record.</li>
     * <li>The image file size cannot exceed 10 MB. Detection is failed for images that exceed this limit.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageDefectDetectionTask  CreateImageDefectDetectionTaskRequest
     * @return CreateImageDefectDetectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageDefectDetectionTaskResponse> createImageDefectDetectionTask(CreateImageDefectDetectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageDefectDetectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageDefectDetectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageDefectDetectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External images are not currently supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload images to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single object or the URLs of multiple objects</a>.</li>
     * <li>The <strong>DetectType</strong> parameter is deprecated. This parameter is still accepted (<code>tamper</code>/<code>aigc</code>) but does not affect the actual detection pattern. Regardless of the value passed, tampering detection is executed and <code>DetectMode=tamper</code> is returned. New callers should not pass this parameter.</li>
     * <li>The <strong>UseTamperSmallModel</strong> parameter specifies whether to use the small model. If set to <code>true</code>, the small model is used and no large model report is generated. If set to <code>false</code> or not passed, the large model is used by default and a comprehensive large model analysis report is returned.</li>
     * </ul>
     * <h2>Settings</h2>
     * <ul>
     * <li>When <strong>UseTamperSmallModel</strong> is not specified, the large model is used by default.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageDetectionTask  CreateImageDetectionTaskRequest
     * @return CreateImageDetectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageDetectionTaskResponse> createImageDetectionTask(CreateImageDetectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageDetectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageDetectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageDetectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL (the server needs to download the image).</li>
     * <li>External images are not supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more files?</a></li>
     * <li>The image file size cannot exceed 10 MB. Detection of images that exceed this limit will be failed.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageIncomeTaxDetectionTask  CreateImageIncomeTaxDetectionTaskRequest
     * @return CreateImageIncomeTaxDetectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageIncomeTaxDetectionTaskResponse> createImageIncomeTaxDetectionTask(CreateImageIncomeTaxDetectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageIncomeTaxDetectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageIncomeTaxDetectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageIncomeTaxDetectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an AI image generation task. The system generates images based on the positive prompt provided by the user.</li>
     * <li>You can configure parameters such as negative prompt, model, and image size to optimize the generation results.</li>
     * <li>By default, generated images are automatically embedded with a C2PA digital signature. You can optionally add a watermark in the lower-right corner.</li>
     * <li>Set the ClientToken parameter to ensure the idempotence of the request and guarantee uniqueness across different requests.</li>
     * <li>After the task is created, call the GetImageTaskResult operation with the TaskId to query the generation results.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageTask  CreateImageTaskRequest
     * @return CreateImageTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageTaskResponse> createImageTask(CreateImageTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External images are not supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload images to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the pre-signed URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single file or the URLs of multiple files</a>.</li>
     * <li>The size of the image uploaded by using ImageUrl cannot exceed 10 MB.</li>
     * <li>The optional parameter <strong>ClientToken</strong> ensures the idempotence of the request. The client generates this parameter value, which must be unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSensitiveScanTask  CreateSensitiveScanTaskRequest
     * @return CreateSensitiveScanTaskResponse
     */
    @Override
    public CompletableFuture<CreateSensitiveScanTaskResponse> createSensitiveScanTask(CreateSensitiveScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSensitiveScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSensitiveScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSensitiveScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation creates an AI video generation task. The system generates a video based on the positive prompt provided by the user.</li>
     * <li>By default, the generated video is automatically embedded with a C2PA digital signature.</li>
     * <li>After creating the task, use the <code>TaskId</code> to call the <code>GetVideoTaskResult</code> operation to query the generation result.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVideoTask  CreateVideoTaskRequest
     * @return CreateVideoTaskResponse
     */
    @Override
    public CompletableFuture<CreateVideoTaskResponse> createVideoTask(CreateVideoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVideoTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>FileUrl</strong> must be a publicly accessible HTTP/HTTPS URL. External files are not supported. Only file URLs accessible over the Chinese mainland public network are supported. Upload the file to an Alibaba Cloud Object Storage Service (OSS) bucket in a Chinese mainland region first, and then use the presigned URL of the file as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * <li><strong>FileType</strong> must match the actual file type. The same value must be specified during both embedding and fetch.</li>
     * <li>Supported file specifications: Video files must be no longer than 10 minutes and no larger than 100 MB. Image files must be no larger than 100 MB.</li>
     * <li>The task completion time is approximately equal to the file duration. For example, embedding a 10-second video takes about 10 seconds.</li>
     * <li>If the submission fails, no task record is created and a synchronous error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateWatermarkEmbedTask  CreateWatermarkEmbedTaskRequest
     * @return CreateWatermarkEmbedTaskResponse
     */
    @Override
    public CompletableFuture<CreateWatermarkEmbedTaskResponse> createWatermarkEmbedTask(CreateWatermarkEmbedTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWatermarkEmbedTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWatermarkEmbedTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWatermarkEmbedTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>FileUrl</strong> must be a publicly accessible HTTP/HTTPS URL. External files are not supported. Only file URLs accessible from the Chinese mainland public network are supported. Upload the file to an Alibaba Cloud OSS bucket in a region within the Chinese mainland first, and then use the presigned URL of the file as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * <li><strong>FileType must be the same as the one used during embedding</strong>: Make sure that the file type (image or video) for extraction is the same as the file type used when the watermark was embedded.</li>
     * <li><strong>File specification limits</strong>: Video files must be no longer than 10 minutes and no larger than 100 MB. Image files must also be no larger than 100 MB.</li>
     * <li><strong>Processing time</strong>: Approximately equal to the actual playback duration of the file. For example, a 10-second video takes approximately 10 seconds to complete the watermark fetch procedure.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateWatermarkExtractTask  CreateWatermarkExtractTaskRequest
     * @return CreateWatermarkExtractTaskResponse
     */
    @Override
    public CompletableFuture<CreateWatermarkExtractTaskResponse> createWatermarkExtractTask(CreateWatermarkExtractTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWatermarkExtractTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWatermarkExtractTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWatermarkExtractTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation detects whether a specified image is AI-generated content (AIGC). You can specify the image to detect by using an image URL or an OSS ObjectKey.</li>
     * <li>You must provide at least one of ImageUrl and ObjectKey. If both are provided, ObjectKey takes precedence.</li>
     * <li>When using the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>This is a synchronous operation suitable for real-time detection of a single image. If you need asynchronous detection or credential detection at the same time, use the CreateImageDetectionTask operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectAigcImage  DetectAigcImageRequest
     * @return DetectAigcImageResponse
     */
    @Override
    public CompletableFuture<DetectAigcImageResponse> detectAigcImage(DetectAigcImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectAigcImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectAigcImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectAigcImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation detects and returns basic information about an image, including but not limited to the file name, image format (such as JPEG/PNG), file size, and resolution.</li>
     * <li><code>ImageUrl</code> is required and must be a publicly accessible HTTP/HTTPS URL. Currently, only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * </ul>
     * 
     * @param request the request parameters of DetectImageBasicInfo  DetectImageBasicInfoRequest
     * @return DetectImageBasicInfoResponse
     */
    @Override
    public CompletableFuture<DetectImageBasicInfoResponse> detectImageBasicInfo(DetectImageBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectImageBasicInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectImageBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectImageBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the status and final results of nodes created by using CreateC2paSignTask or CreateC2paBucketSignTask.</li>
     * <li>It supports signing node queries for images, videos, and various audio formats (FLAC, M4A, MP3, and WAV).</li>
     * <li>For BUCKET nodes, intermediate statistics information is not provided when the node is in the PROCESSING, PAUSING, PAUSED, or CANCELING state. Complete statistics information and the report location are returned only after the node enters the SUCCEEDED or CANCELED state.</li>
     * <li>A valid TaskId must be provided for the query. This ID must be the value returned when the node was created. It supports the standard UUID format and is compatible with legacy decimal node IDs.</li>
     * </ul>
     * 
     * @param request the request parameters of GetC2paSignResult  GetC2paSignResultRequest
     * @return GetC2paSignResultResponse
     */
    @Override
    public CompletableFuture<GetC2paSignResultResponse> getC2paSignResult(GetC2paSignResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetC2paSignResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetC2paSignResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetC2paSignResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries the execution status and result of an image defect detection task created by <code>CreateImageDefectDetectionTask</code>. Follow these polling conventions:</p>
     * <ul>
     * <li><strong>Set the polling interval to at least 5 seconds</strong>: When the task is in the <code>running</code> state, each call to this operation triggers a real downstream query. Excessively frequent polling only increases system load and does not speed up result retrieval.</li>
     * <li><strong>Total timeout is 30 minutes</strong>: If no result is received within 30 minutes after the task is created, the server marks the task as <code>failed</code> with the message <code>poll timeout: no result within 30m0s</code>. After that, the task no longer initiates new downstream query requests.</li>
     * <li>After the task reaches the <code>succeeded</code> or <code>failed</code> desired state, subsequent calls to this operation directly return the stored result without triggering additional downstream processing.
     * Note: The content in the <code>Result</code> field may be HTML-escaped JSON data. Unescape it before parsing.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageDefectDetectionTaskResult  GetImageDefectDetectionTaskResultRequest
     * @return GetImageDefectDetectionTaskResultResponse
     */
    @Override
    public CompletableFuture<GetImageDefectDetectionTaskResultResponse> getImageDefectDetectionTaskResult(GetImageDefectDetectionTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageDefectDetectionTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageDefectDetectionTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageDefectDetectionTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Call this operation to query the execution status and result of a specified image detection task, including AIGC detection labels and tamper detection results. Poll at intervals of 2 to 5 seconds until the task status changes to succeeded or failed.</p>
     * <h2>Precautions</h2>
     * <ul>
     * <li>Ensure that you use a valid TaskId for the query.</li>
     * <li>If the task is not complete, increase the polling interval to avoid wasting resources due to frequent requests.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageDetectionTaskResult  GetImageDetectionTaskResultRequest
     * @return GetImageDetectionTaskResultResponse
     */
    @Override
    public CompletableFuture<GetImageDetectionTaskResultResponse> getImageDetectionTaskResult(GetImageDetectionTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageDetectionTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageDetectionTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageDetectionTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Polling recommendation</strong>: Set the polling interval to at least 5 seconds. Polling more frequently while the task is in <code>running</code> status does not return results faster.</li>
     * <li><strong>Total timeout</strong>: If no result is obtained within 30 minutes after the task is created, the task is marked as <code>failed</code> with the Message <code>poll timeout: no result within 30m0s</code>.</li>
     * <li><strong>Desired state handling</strong>: <code>succeeded</code> and <code>failed</code> are the final states of the task. The result does not change after the task reaches either state.</li>
     * <li><strong>Items is an empty array</strong>: This indicates that no abnormal items are detected. It is not an error.</li>
     * <li><strong>Coordinates may be an empty array</strong>: Some abnormalities are image-wide in nature (for example, quality issues affecting the entire image) and cannot be located within a specific bounding box. In this case, <code>Coordinates</code> is an empty array, but the abnormal item itself is still valid and should still be presented to the user.</li>
     * <li><strong>Stage is an open value set</strong>: Future versions may introduce new <code>Stage</code> values. Display unknown values as-is. Do not perform whitelist validation on <code>Stage</code> or filter abnormal items based on it.</li>
     * <li><strong>quality stage</strong>: A <code>Stage</code> value of <code>quality</code> indicates that the image quality is too low and the detection result has low confidence. Prompt the user to resubmit a clear original screenshot and run the detection again.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageIncomeTaxDetectionTaskResult  GetImageIncomeTaxDetectionTaskResultRequest
     * @return GetImageIncomeTaxDetectionTaskResultResponse
     */
    @Override
    public CompletableFuture<GetImageIncomeTaxDetectionTaskResultResponse> getImageIncomeTaxDetectionTaskResult(GetImageIncomeTaxDetectionTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageIncomeTaxDetectionTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageIncomeTaxDetectionTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageIncomeTaxDetectionTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of an asynchronous image generation task created by <code>CreateImageTask</code>.</li>
     * <li>Poll at intervals of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</li>
     * <li>The image download URL (Url) returned after the task succeeds is a pre-signed URL that is valid for 1 hour.</li>
     * <li>To ensure idempotence of the request, set the <code>ClientToken</code> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageTaskResult  GetImageTaskResultRequest
     * @return GetImageTaskResultResponse
     */
    @Override
    public CompletableFuture<GetImageTaskResultResponse> getImageTaskResult(GetImageTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of a sensitive information scan task created by <code>CreateSensitiveScanTask</code>.</li>
     * <li>Poll at intervals of 3 to 5 seconds until the task status changes to <code>completed</code> or <code>terminated</code>.</li>
     * <li>The <code>ClientToken</code> parameter ensures the idempotence of the request. It is generated by the client, must be unique across different requests, supports ASCII characters, and cannot exceed 64 characters in length.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSensitiveScanResult  GetSensitiveScanResultRequest
     * @return GetSensitiveScanResultResponse
     */
    @Override
    public CompletableFuture<GetSensitiveScanResultResponse> getSensitiveScanResult(GetSensitiveScanResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSensitiveScanResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSensitiveScanResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSensitiveScanResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of an asynchronous video generation task created by calling <code>CreateVideoTask</code>.</li>
     * <li>Poll the task status at an interval of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoTaskResult  GetVideoTaskResultRequest
     * @return GetVideoTaskResultResponse
     */
    @Override
    public CompletableFuture<GetVideoTaskResultResponse> getVideoTaskResult(GetVideoTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the execution status and result of an invisible watermark embedding task created by <code>CreateWatermarkEmbedTask</code>.</li>
     * <li>Tasks are processed asynchronously on the server side. Call this operation to retrieve the latest status.</li>
     * <li><strong>Polling recommendations</strong>: Ensure that the polling interval is at least 5 seconds. For video tasks, the expected completion time is approximately equal to the media duration (about 1x speed). Image tasks are completed within 5 minutes.</li>
     * <li><strong>Timeout mechanism</strong>: The total timeout window for video tasks is 10 minutes, and for image tasks is 5 minutes. Tasks that are not completed within this period are marked as failed, and the corresponding error message is returned.</li>
     * <li>When the task status is <code>succeeded</code> or <code>failed</code>, the task has reached a desired state, and the result no longer changes.</li>
     * </ul>
     * 
     * @param request the request parameters of GetWatermarkEmbedTaskResult  GetWatermarkEmbedTaskResultRequest
     * @return GetWatermarkEmbedTaskResultResponse
     */
    @Override
    public CompletableFuture<GetWatermarkEmbedTaskResultResponse> getWatermarkEmbedTaskResult(GetWatermarkEmbedTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWatermarkEmbedTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWatermarkEmbedTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWatermarkEmbedTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Polling recommendation</strong>: Set the polling interval to at least 5 seconds. The task completion time is approximately equal to the duration of the carrier media (approximately 1x speed).</li>
     * <li><strong>Timeout handling</strong>: The total timeout window for video tasks is 10 minutes, and for image tasks is 5 minutes. If a task is not completed within this time, the task status changes to <code>failed</code>.</li>
     * <li><strong>Desired state confirmation</strong>: <code>succeeded</code> or <code>failed</code> is the final status. The result does not change after the task reaches either status.</li>
     * </ul>
     * 
     * @param request the request parameters of GetWatermarkExtractTaskResult  GetWatermarkExtractTaskResultRequest
     * @return GetWatermarkExtractTaskResultResponse
     */
    @Override
    public CompletableFuture<GetWatermarkExtractTaskResultResponse> getWatermarkExtractTaskResult(GetWatermarkExtractTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWatermarkExtractTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWatermarkExtractTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWatermarkExtractTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation pauses a batch trusted signing parent task for a bucket that is owned and still controllable by the currently authenticated account.</li>
     * <li>The paused state is persisted to the database and remains effective after a service restart.</li>
     * <li>If no files have been submitted to the trusted signing service, the task directly enters the <code>PAUSED</code> state. If submitted files exist, the task first enters the <code>PAUSING</code> state, stops scanning and new submissions, and continues to query the actual results of those files. After all results converge, the task enters the <code>PAUSED</code> state.</li>
     * <li>Pausing does not interrupt an in-progress individual OSS or trusted signing service invoke, nor does it revoke signatures or metering that have already been completed.</li>
     * <li>Invoking this operation repeatedly on a task that is already in the <code>PAUSING</code> or <code>PAUSED</code> state is idempotent and succeeds.</li>
     * <li>Tasks in the <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELING</code>, or <code>CANCELED</code> state cannot be paused.</li>
     * </ul>
     * 
     * @param request the request parameters of PauseC2paBucketSignTask  PauseC2paBucketSignTaskRequest
     * @return PauseC2paBucketSignTaskResponse
     */
    @Override
    public CompletableFuture<PauseC2paBucketSignTaskResponse> pauseC2paBucketSignTask(PauseC2paBucketSignTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PauseC2paBucketSignTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseC2paBucketSignTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseC2paBucketSignTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation resumes a Bucket batch trusted signing parent task owned by the currently authenticated account.</li>
     * <li>After resumption, the task continues execution from the saved scan cursor and per-file stage. It does not rebuild the object list or resubmit trusted signing service tasks that have already been persisted.</li>
     * <li>This operation supports resuming from the <code>PAUSED</code> or <code>PAUSING</code> state. For tasks already in the <code>PROCESSING</code> state, repeated calls are idempotent and succeed.</li>
     * <li>If the task was previously auto-paused due to failures in shared dependencies such as user OSS, internal OSS, or the trusted signing service, the pause error recorded on the parent task is cleared upon resumption. If the dependencies have not yet recovered, the task may enter the <code>PAUSING</code> or <code>PAUSED</code> state again with a new reason recorded.</li>
     * <li>Before resuming a task that was paused due to permission issues, restore the OSS permissions of <code>AliyunServiceRoleForAIDeepSign</code> for the source prefix and output prefix. Otherwise, the task will be auto-paused again.</li>
     * <li>Tasks in the <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELING</code>, or <code>CANCELED</code> state cannot be resumed.</li>
     * </ul>
     * 
     * @param request the request parameters of ResumeC2paBucketSignTask  ResumeC2paBucketSignTaskRequest
     * @return ResumeC2paBucketSignTaskResponse
     */
    @Override
    public CompletableFuture<ResumeC2paBucketSignTaskResponse> resumeC2paBucketSignTask(ResumeC2paBucketSignTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeC2paBucketSignTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeC2paBucketSignTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeC2paBucketSignTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Signature types</h2>
     * <ul>
     * <li><strong>Basic signature</strong>: Signs with a platform-owned certificate and supports content integrity verification.</li>
     * <li><strong>Trusted signature</strong>: In addition to integrity verification, the signing certificate chain can be verified through the C2PA official trust list.
     * This operation provides basic signing. For trusted signing, call <code>CreateC2paSignTask</code> to create a task and call <code>GetC2paSignResult</code> to query the result.</li>
     * </ul>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>ImageUrl</code> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External image URLs are not currently supported. Only image URLs that are publicly accessible within the Chinese mainland are supported. Upload the image to an Alibaba Cloud OSS bucket in a region within the Chinese mainland first, and then use the pre-signed URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single file or the URLs of multiple files</a>.</li>
     * <li>Supported image formats: JPEG and PNG. Unsupported formats return the C2PA_FORMAT_UNSUPPORTED fault.</li>
     * </ul>
     * 
     * @param request the request parameters of SignUserImage  SignUserImageRequest
     * @return SignUserImageResponse
     */
    @Override
    public CompletableFuture<SignUserImageResponse> signUserImage(SignUserImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SignUserImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SignUserImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SignUserImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Signature types</h2>
     * <ul>
     * <li><strong>Basic signature</strong>: Uses the platform\&quot;s own certificate for signing. Supports content integrity verification.</li>
     * <li><strong>Trusted signature</strong>: In addition to integrity verification, the signing certificate chain can be verified through the C2PA official trust list.</li>
     * </ul>
     * <h2>Verification result description</h2>
     * <ul>
     * <li>Content integrity verification checks whether the image and its signature-protected provenance information remain consistent with the state at the time of signing. It does not indicate that the visual content itself is authentic.</li>
     * <li><code>VerificationState=Valid</code> indicates that the signature and data hash are valid and content integrity verification has passed. This alone cannot be used to determine that the signature is a trusted signature.</li>
     * <li><code>VerificationState=Trusted</code> and <code>IssuerTrusted</code> present the certificate trust verification results. Whether a signature qualifies as a trusted signature as defined in this topic depends on whether the signing certificate chain can be verified through the C2PA official trust list, not solely on the certificate issuer name.</li>
     * </ul>
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation verifies the C2PA (Coalition for Content Provenance and Authenticity) digital signature embedded in a specified image.</li>
     * <li><code>ImageUrl</code> <strong>does not currently support images from external networks. Only image URLs accessible over the China public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a China region first, and then use the presigned URL of the image as the input parameter for this operation.</strong> References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * </ul>
     * 
     * @param request the request parameters of VerifyImageSignature  VerifyImageSignatureRequest
     * @return VerifyImageSignatureResponse
     */
    @Override
    public CompletableFuture<VerifyImageSignatureResponse> verifyImageSignature(VerifyImageSignatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyImageSignature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyImageSignatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyImageSignatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
