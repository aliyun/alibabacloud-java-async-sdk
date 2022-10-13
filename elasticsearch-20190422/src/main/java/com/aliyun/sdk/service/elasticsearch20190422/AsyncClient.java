// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20190422;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.elasticsearch20190422.models.*;
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

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

}
