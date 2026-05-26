// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentexplorer20260317;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentexplorer20260317.models.*;
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

    /**
     * @param request the request parameters of GetSkillContent  GetSkillContentRequest
     * @return GetSkillContentResponse
     */
    CompletableFuture<GetSkillContentResponse> getSkillContent(GetSkillContentRequest request);

    /**
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    /**
     * @param request the request parameters of SearchSkills  SearchSkillsRequest
     * @return SearchSkillsResponse
     */
    CompletableFuture<SearchSkillsResponse> searchSkills(SearchSkillsRequest request);

}
