// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQueryConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeQueryConfigsRequest</p>
 */
public class DescribeQueryConfigsRequest extends Request {
    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeQueryConfigsRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryConfigsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeQueryConfigsRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQueryConfigsRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeQueryConfigsRequest build() {
            return new DescribeQueryConfigsRequest(this);
        } 

    } 

}
