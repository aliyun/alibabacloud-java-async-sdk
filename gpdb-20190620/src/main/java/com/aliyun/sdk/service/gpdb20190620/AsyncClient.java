// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gpdb20190620.models.*;
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

    CompletableFuture<DescribeDBInstanceForDmsResponse> describeDBInstanceForDms(DescribeDBInstanceForDmsRequest request);

    CompletableFuture<DescribeDBInstanceSecurityIpsResponse> describeDBInstanceSecurityIps(DescribeDBInstanceSecurityIpsRequest request);

    CompletableFuture<DescribeDBInstancesForDmsResponse> describeDBInstancesForDms(DescribeDBInstancesForDmsRequest request);

    CompletableFuture<ModifyDBInstanceSecurityIpsResponse> modifyDBInstanceSecurityIps(ModifyDBInstanceSecurityIpsRequest request);

}
