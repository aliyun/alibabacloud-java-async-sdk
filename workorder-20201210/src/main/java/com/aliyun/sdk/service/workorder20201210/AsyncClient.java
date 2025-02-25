// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20201210;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.workorder20201210.models.*;
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
     * @param request the request parameters of GetTicketTemplate  GetTicketTemplateRequest
     * @return GetTicketTemplateResponse
     */
    CompletableFuture<GetTicketTemplateResponse> getTicketTemplate(GetTicketTemplateRequest request);

    /**
     * @param request the request parameters of IsFirstBbsTicket  IsFirstBbsTicketRequest
     * @return IsFirstBbsTicketResponse
     */
    CompletableFuture<IsFirstBbsTicketResponse> isFirstBbsTicket(IsFirstBbsTicketRequest request);

    /**
     * @param request the request parameters of SuggestCategory  SuggestCategoryRequest
     * @return SuggestCategoryResponse
     */
    CompletableFuture<SuggestCategoryResponse> suggestCategory(SuggestCategoryRequest request);

}
