// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUsageTopRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUsageTopRequest</p>
 */
public class DescribePropertyUsageTopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribePropertyUsageTopRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUsageTopRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePropertyUsageTopRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyUsageTopRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * The type of the asset fingerprint. Valid value:
         * <p>
         * 
         * *   **port**: port
         * *   **process**: process
         * *   **software**: software
         * *   **user**: account
         * *   **sca**: middleware
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribePropertyUsageTopRequest build() {
            return new DescribePropertyUsageTopRequest(this);
        } 

    } 

}
