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
 * {@link QueryAvailableNumbersRequest} extends {@link RequestModel}
 *
 * <p>QueryAvailableNumbersRequest</p>
 */
public class QueryAvailableNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    private QueryAvailableNumbersRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvailableNumbersRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAvailableNumbersRequest, Builder> {
        private String bizType; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvailableNumbersRequest request) {
            super(request);
            this.bizType = request.bizType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public QueryAvailableNumbersRequest build() {
            return new QueryAvailableNumbersRequest(this);
        } 

    } 

}
