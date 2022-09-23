package com.aliyun.sdk.service.oss20190517.presigner;

import com.aliyun.sdk.service.oss20190517.presigner.internal.DefaultPresignerClientBuilder;
import com.aliyun.sdk.service.oss20190517.presigner.models.*;

public interface PresignerClient {
    static DefaultPresignerClientBuilder builder() {
        return new DefaultPresignerClientBuilder();
    }

    static PresignerClient create() {
        return builder().build();
    }

    PutObjectPresignResponse presignPutObject(PutObjectPresignRequest request);

    GetObjectPresignResponse presignGetObject(GetObjectPresignRequest request);

    UploadPartPresignResponse presignUploadPart(UploadPartPresignRequest request);
}

