// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.beian20160810.models.*;
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

    CompletableFuture<DeleteUnbeianIpCheckTypeResponse> deleteUnbeianIpCheckType(DeleteUnbeianIpCheckTypeRequest request);

    CompletableFuture<GetMainDomainResponse> getMainDomain(GetMainDomainRequest request);

    CompletableFuture<InsertUnbeianIpCheckTypeResponse> insertUnbeianIpCheckType(InsertUnbeianIpCheckTypeRequest request);

    CompletableFuture<ListUnbeianIpCheckTypeResponse> listUnbeianIpCheckType(ListUnbeianIpCheckTypeRequest request);

    CompletableFuture<ManageAccessorDomainResponse> manageAccessorDomain(ManageAccessorDomainRequest request);

    CompletableFuture<ManageAccessorDomainWhiteListResponse> manageAccessorDomainWhiteList(ManageAccessorDomainWhiteListRequest request);

    CompletableFuture<ManageAccessorIpResponse> manageAccessorIp(ManageAccessorIpRequest request);

    CompletableFuture<QueryAccessorDomainResponse> queryAccessorDomain(QueryAccessorDomainRequest request);

    CompletableFuture<QueryAccessorDomainListResponse> queryAccessorDomainList(QueryAccessorDomainListRequest request);

    CompletableFuture<QueryAccessorDomainStatusResponse> queryAccessorDomainStatus(QueryAccessorDomainStatusRequest request);

    CompletableFuture<QueryAccessorDomainWhiteListResponse> queryAccessorDomainWhiteList(QueryAccessorDomainWhiteListRequest request);

    CompletableFuture<QueryAccessorDomainsStatusResponse> queryAccessorDomainsStatus(QueryAccessorDomainsStatusRequest request);

    CompletableFuture<QueryAccessorIpResponse> queryAccessorIp(QueryAccessorIpRequest request);

    CompletableFuture<SubmitAccessorFullDomainsOssListResponse> submitAccessorFullDomainsOssList(SubmitAccessorFullDomainsOssListRequest request);

}
