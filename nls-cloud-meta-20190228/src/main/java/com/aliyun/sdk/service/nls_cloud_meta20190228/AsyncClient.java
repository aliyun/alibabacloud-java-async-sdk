// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nls_cloud_meta20190228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nls_cloud_meta20190228.models.*;
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

    CompletableFuture<CreateTokenResponse> createToken(CreateTokenRequest request);

}
