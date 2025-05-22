// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryBagRemainingRequest} extends {@link RequestModel}
 *
 * <p>QueryBagRemainingRequest</p>
 */
public class QueryBagRemainingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    private QueryBagRemainingRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBagRemainingRequest create() {
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

    public static final class Builder extends Request.Builder<QueryBagRemainingRequest, Builder> {
        private String bizType; 

        private Builder() {
            super();
        } 

        private Builder(QueryBagRemainingRequest request) {
            super(request);
            this.bizType = request.bizType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.hightech</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public QueryBagRemainingRequest build() {
            return new QueryBagRemainingRequest(this);
        } 

    } 

}
