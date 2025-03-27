// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mobi20240411;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mobi20240411.models.*;
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
     * @param request the request parameters of CreateAppFromTemplate  CreateAppFromTemplateRequest
     * @return CreateAppFromTemplateResponse
     */
    CompletableFuture<CreateAppFromTemplateResponse> createAppFromTemplate(CreateAppFromTemplateRequest request);

}
