// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunid_ag20180912;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aliyunid_ag20180912.models.*;
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
     * @param request the request parameters of CreateAgAccount  CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request);

    /**
     * @param request the request parameters of GetAgRelation  GetAgRelationRequest
     * @return GetAgRelationResponse
     */
    CompletableFuture<GetAgRelationResponse> getAgRelation(GetAgRelationRequest request);

    /**
     * @param request the request parameters of GetRamBind  GetRamBindRequest
     * @return GetRamBindResponse
     */
    CompletableFuture<GetRamBindResponse> getRamBind(GetRamBindRequest request);

    /**
     * @param request the request parameters of PaginateAgRelations  PaginateAgRelationsRequest
     * @return PaginateAgRelationsResponse
     */
    CompletableFuture<PaginateAgRelationsResponse> paginateAgRelations(PaginateAgRelationsRequest request);

}
