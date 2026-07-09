// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aideepsign20260511.models.*;
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
     * @param request the request parameters of CreateImageDetectionTask  CreateImageDetectionTaskRequest
     * @return CreateImageDetectionTaskResponse
     */
    CompletableFuture<CreateImageDetectionTaskResponse> createImageDetectionTask(CreateImageDetectionTaskRequest request);

    /**
     * @param request the request parameters of CreateImageTask  CreateImageTaskRequest
     * @return CreateImageTaskResponse
     */
    CompletableFuture<CreateImageTaskResponse> createImageTask(CreateImageTaskRequest request);

    /**
     * @param request the request parameters of CreateSensitiveScanTask  CreateSensitiveScanTaskRequest
     * @return CreateSensitiveScanTaskResponse
     */
    CompletableFuture<CreateSensitiveScanTaskResponse> createSensitiveScanTask(CreateSensitiveScanTaskRequest request);

    /**
     * @param request the request parameters of DetectAigcImage  DetectAigcImageRequest
     * @return DetectAigcImageResponse
     */
    CompletableFuture<DetectAigcImageResponse> detectAigcImage(DetectAigcImageRequest request);

    /**
     * @param request the request parameters of DetectImageBasicInfo  DetectImageBasicInfoRequest
     * @return DetectImageBasicInfoResponse
     */
    CompletableFuture<DetectImageBasicInfoResponse> detectImageBasicInfo(DetectImageBasicInfoRequest request);

    /**
     * @param request the request parameters of GetImageDetectionTaskResult  GetImageDetectionTaskResultRequest
     * @return GetImageDetectionTaskResultResponse
     */
    CompletableFuture<GetImageDetectionTaskResultResponse> getImageDetectionTaskResult(GetImageDetectionTaskResultRequest request);

    /**
     * @param request the request parameters of GetImageTaskResult  GetImageTaskResultRequest
     * @return GetImageTaskResultResponse
     */
    CompletableFuture<GetImageTaskResultResponse> getImageTaskResult(GetImageTaskResultRequest request);

    /**
     * @param request the request parameters of GetSensitiveScanResult  GetSensitiveScanResultRequest
     * @return GetSensitiveScanResultResponse
     */
    CompletableFuture<GetSensitiveScanResultResponse> getSensitiveScanResult(GetSensitiveScanResultRequest request);

    /**
     * @param request the request parameters of SignUserImage  SignUserImageRequest
     * @return SignUserImageResponse
     */
    CompletableFuture<SignUserImageResponse> signUserImage(SignUserImageRequest request);

    /**
     * @param request the request parameters of VerifyImageSignature  VerifyImageSignatureRequest
     * @return VerifyImageSignatureResponse
     */
    CompletableFuture<VerifyImageSignatureResponse> verifyImageSignature(VerifyImageSignatureRequest request);

}
