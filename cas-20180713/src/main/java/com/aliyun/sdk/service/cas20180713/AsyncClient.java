// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cas20180713.models.*;
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

    CompletableFuture<CreateDVOrderAuditResponse> createDVOrderAudit(CreateDVOrderAuditRequest request);

    CompletableFuture<CreateUserCertificateResponse> createUserCertificate(CreateUserCertificateRequest request);

    CompletableFuture<DeleteUserCertificateResponse> deleteUserCertificate(DeleteUserCertificateRequest request);

    CompletableFuture<DescribeDVOrderResultResponse> describeDVOrderResult(DescribeDVOrderResultRequest request);

    CompletableFuture<DescribeOrderInstanceListResponse> describeOrderInstanceList(DescribeOrderInstanceListRequest request);

    CompletableFuture<DescribeUserCertificateDetailResponse> describeUserCertificateDetail(DescribeUserCertificateDetailRequest request);

    CompletableFuture<DescribeUserCertificateListResponse> describeUserCertificateList(DescribeUserCertificateListRequest request);

}
