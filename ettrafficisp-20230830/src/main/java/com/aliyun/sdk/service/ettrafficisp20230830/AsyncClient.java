// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ettrafficisp20230830.models.*;
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

    CompletableFuture<AkDisableResponse> akDisable(AkDisableRequest request);

    CompletableFuture<AkEnableResponse> akEnable(AkEnableRequest request);

    CompletableFuture<AkGenerateResponse> akGenerate(AkGenerateRequest request);

    CompletableFuture<AkListPageResponse> akListPage(AkListPageRequest request);

    CompletableFuture<AkUpdateResponse> akUpdate(AkUpdateRequest request);

    CompletableFuture<DimGroupResponse> dimGroup(DimGroupRequest request);

}
