// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alimt20190102.models.*;
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

    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    CompletableFuture<ListMtConnectorResponse> listMtConnector(ListMtConnectorRequest request);

    CompletableFuture<TranslateECommerceResponse> translateECommerce(TranslateECommerceRequest request);

    CompletableFuture<TranslateGeneralResponse> translateGeneral(TranslateGeneralRequest request);

}
