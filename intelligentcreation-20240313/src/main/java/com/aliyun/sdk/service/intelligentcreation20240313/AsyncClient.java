// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.intelligentcreation20240313.models.*;
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

    CompletableFuture<CreateIllustrationTaskResponse> createIllustrationTask(CreateIllustrationTaskRequest request);

    CompletableFuture<CreateTextTaskResponse> createTextTask(CreateTextTaskRequest request);

    CompletableFuture<GetIllustrationResponse> getIllustration(GetIllustrationRequest request);

    CompletableFuture<GetIllustrationTaskResponse> getIllustrationTask(GetIllustrationTaskRequest request);

    CompletableFuture<GetOssUploadTokenResponse> getOssUploadToken(GetOssUploadTokenRequest request);

    CompletableFuture<GetTextResponse> getText(GetTextRequest request);

    CompletableFuture<GetTextTaskResponse> getTextTask(GetTextTaskRequest request);

    CompletableFuture<ListTextThemesResponse> listTextThemes(ListTextThemesRequest request);

    CompletableFuture<ListTextsResponse> listTexts(ListTextsRequest request);

}
