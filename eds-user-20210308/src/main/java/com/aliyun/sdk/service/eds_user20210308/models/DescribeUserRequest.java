// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeUserRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserRequest</p>
 */
public class DescribeUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireExtraAttributes")
    private java.util.List<String> requireExtraAttributes;

    private DescribeUserRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.endUserId = builder.endUserId;
        this.requireExtraAttributes = builder.requireExtraAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return requireExtraAttributes
     */
    public java.util.List<String> getRequireExtraAttributes() {
        return this.requireExtraAttributes;
    }

    public static final class Builder extends Request.Builder<DescribeUserRequest, Builder> {
        private String businessChannel; 
        private String endUserId; 
        private java.util.List<String> requireExtraAttributes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.endUserId = request.endUserId;
            this.requireExtraAttributes = request.requireExtraAttributes;
        } 

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * RequireExtraAttributes.
         */
        public Builder requireExtraAttributes(java.util.List<String> requireExtraAttributes) {
            this.putQueryParameter("RequireExtraAttributes", requireExtraAttributes);
            this.requireExtraAttributes = requireExtraAttributes;
            return this;
        }

        @Override
        public DescribeUserRequest build() {
            return new DescribeUserRequest(this);
        } 

    } 

}
