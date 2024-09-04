// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.marketing_event20210101.models.*;
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

    CompletableFuture<FindGuestCredentialsRecordResponse> findGuestCredentialsRecord(FindGuestCredentialsRecordRequest request);

    CompletableFuture<FindGuestTicketRecordResponse> findGuestTicketRecord(FindGuestTicketRecordRequest request);

    CompletableFuture<QueryAllActivityInfoResponse> queryAllActivityInfo(QueryAllActivityInfoRequest request);

    CompletableFuture<QuerySingleActivityInfoResponse> querySingleActivityInfo(QuerySingleActivityInfoRequest request);

    CompletableFuture<SyncSignInInfoResponse> syncSignInInfo(SyncSignInInfoRequest request);

}
