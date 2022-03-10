// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReadableResourcesListByUserIdRequest} extends {@link RequestModel}
 *
 * <p>QueryReadableResourcesListByUserIdRequest</p>
 */
public class QueryReadableResourcesListByUserIdRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private QueryReadableResourcesListByUserIdRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReadableResourcesListByUserIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryReadableResourcesListByUserIdRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryReadableResourcesListByUserIdRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryReadableResourcesListByUserIdRequest build() {
            return new QueryReadableResourcesListByUserIdRequest(this);
        } 

    } 

}
