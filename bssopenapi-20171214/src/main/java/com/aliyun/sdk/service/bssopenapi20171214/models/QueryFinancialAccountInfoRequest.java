// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFinancialAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryFinancialAccountInfoRequest</p>
 */
public class QueryFinancialAccountInfoRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private Long userId;

    private QueryFinancialAccountInfoRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFinancialAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryFinancialAccountInfoRequest, Builder> {
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFinancialAccountInfoRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryFinancialAccountInfoRequest build() {
            return new QueryFinancialAccountInfoRequest(this);
        } 

    } 

}
