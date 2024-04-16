// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sasti20200512.models.*;
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

    CompletableFuture<DescribeDomainReportResponse> describeDomainReport(DescribeDomainReportRequest request);

    CompletableFuture<DescribeFileReportResponse> describeFileReport(DescribeFileReportRequest request);

    CompletableFuture<DescribeIpReportResponse> describeIpReport(DescribeIpReportRequest request);

}
