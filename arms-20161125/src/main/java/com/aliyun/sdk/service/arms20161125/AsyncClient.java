// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20161125;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.arms20161125.models.*;
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

    CompletableFuture<ARMSQueryDataSetResponse> aRMSQueryDataSet(ARMSQueryDataSetRequest request);

    CompletableFuture<WhereInDimQueryResponse> whereInDimQuery(WhereInDimQueryRequest request);

}
