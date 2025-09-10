// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeNodeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeTypeResponseBody</p>
 */
public class DescribeNodeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EniHighDenseQuantity")
    private Integer eniHighDenseQuantity;

    @com.aliyun.core.annotation.NameInMap("EniIpv6AddressQuantity")
    private Integer eniIpv6AddressQuantity;

    @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddressQuantity")
    private Integer eniPrivateIpAddressQuantity;

    @com.aliyun.core.annotation.NameInMap("EniQuantity")
    private Integer eniQuantity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNodeTypeResponseBody(Builder builder) {
        this.eniHighDenseQuantity = builder.eniHighDenseQuantity;
        this.eniIpv6AddressQuantity = builder.eniIpv6AddressQuantity;
        this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
        this.eniQuantity = builder.eniQuantity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eniHighDenseQuantity
     */
    public Integer getEniHighDenseQuantity() {
        return this.eniHighDenseQuantity;
    }

    /**
     * @return eniIpv6AddressQuantity
     */
    public Integer getEniIpv6AddressQuantity() {
        return this.eniIpv6AddressQuantity;
    }

    /**
     * @return eniPrivateIpAddressQuantity
     */
    public Integer getEniPrivateIpAddressQuantity() {
        return this.eniPrivateIpAddressQuantity;
    }

    /**
     * @return eniQuantity
     */
    public Integer getEniQuantity() {
        return this.eniQuantity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer eniHighDenseQuantity; 
        private Integer eniIpv6AddressQuantity; 
        private Integer eniPrivateIpAddressQuantity; 
        private Integer eniQuantity; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNodeTypeResponseBody model) {
            this.eniHighDenseQuantity = model.eniHighDenseQuantity;
            this.eniIpv6AddressQuantity = model.eniIpv6AddressQuantity;
            this.eniPrivateIpAddressQuantity = model.eniPrivateIpAddressQuantity;
            this.eniQuantity = model.eniQuantity;
            this.requestId = model.requestId;
        } 

        /**
         * EniHighDenseQuantity.
         */
        public Builder eniHighDenseQuantity(Integer eniHighDenseQuantity) {
            this.eniHighDenseQuantity = eniHighDenseQuantity;
            return this;
        }

        /**
         * EniIpv6AddressQuantity.
         */
        public Builder eniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
            this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
            return this;
        }

        /**
         * EniPrivateIpAddressQuantity.
         */
        public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }

        /**
         * EniQuantity.
         */
        public Builder eniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodeTypeResponseBody build() {
            return new DescribeNodeTypeResponseBody(this);
        } 

    } 

}
