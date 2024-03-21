// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRemainResourcesRequest} extends {@link RequestModel}
 *
 * <p>QueryRemainResourcesRequest</p>
 */
public class QueryRemainResourcesRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    private QueryRemainResourcesRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRemainResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    public static final class Builder extends Request.Builder<QueryRemainResourcesRequest, Builder> {
        private String bizType; 

        private Builder() {
            super();
        } 

        private Builder(QueryRemainResourcesRequest request) {
            super(request);
            this.bizType = request.bizType;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public QueryRemainResourcesRequest build() {
            return new QueryRemainResourcesRequest(this);
        } 

    } 

}
