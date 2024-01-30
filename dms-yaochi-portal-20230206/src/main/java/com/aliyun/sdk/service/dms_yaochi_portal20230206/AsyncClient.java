// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dms_yaochi_portal20230206.models.*;
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

    CompletableFuture<CheckUserAuthResponse> checkUserAuth(CheckUserAuthRequest request);

    CompletableFuture<ListResourcesByTagResponse> listResourcesByTag(ListResourcesByTagRequest request);

    CompletableFuture<ListTagsAllResponse> listTagsAll(ListTagsAllRequest request);

    CompletableFuture<ListTagsByResourceResponse> listTagsByResource(ListTagsByResourceRequest request);

    CompletableFuture<MetaDatabaseSearchResponse> metaDatabaseSearch(MetaDatabaseSearchRequest request);

    CompletableFuture<MetaSearchResponse> metaSearch(MetaSearchRequest request);

    CompletableFuture<UpdateUserAuthResponse> updateUserAuth(UpdateUserAuthRequest request);

    CompletableFuture<YaochiSuggestResponse> yaochiSuggest(YaochiSuggestRequest request);

}
