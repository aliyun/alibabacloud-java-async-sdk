// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeNeedAsyncQueryRequest} extends {@link RequestModel}
 *
 * <p>DescribeNeedAsyncQueryRequest</p>
 */
public class DescribeNeedAsyncQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeNeedAsyncQueryRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNeedAsyncQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeNeedAsyncQueryRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNeedAsyncQueryRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeNeedAsyncQueryRequest build() {
            return new DescribeNeedAsyncQueryRequest(this);
        } 

    } 

}
