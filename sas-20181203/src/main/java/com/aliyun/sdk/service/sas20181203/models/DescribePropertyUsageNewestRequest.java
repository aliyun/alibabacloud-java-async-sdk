// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUsageNewestRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUsageNewestRequest</p>
 */
public class DescribePropertyUsageNewestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribePropertyUsageNewestRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUsageNewestRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePropertyUsageNewestRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyUsageNewestRequest request) {
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
        public DescribePropertyUsageNewestRequest build() {
            return new DescribePropertyUsageNewestRequest(this);
        } 

    } 

}
