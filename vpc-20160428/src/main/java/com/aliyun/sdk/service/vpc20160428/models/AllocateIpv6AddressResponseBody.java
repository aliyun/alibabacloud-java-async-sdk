// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AllocateIpv6AddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateIpv6AddressResponseBody</p>
 */
public class AllocateIpv6AddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6Address")
    private String ipv6Address;

    @com.aliyun.core.annotation.NameInMap("Ipv6AddressId")
    private String ipv6AddressId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AllocateIpv6AddressResponseBody(Builder builder) {
        this.ipv6Address = builder.ipv6Address;
        this.ipv6AddressId = builder.ipv6AddressId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateIpv6AddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return ipv6AddressId
     */
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String ipv6Address; 
        private String ipv6AddressId; 
        private String requestId; 
        private String resourceGroupId; 

        private Builder() {
        } 

        private Builder(AllocateIpv6AddressResponseBody model) {
            this.ipv6Address = model.ipv6Address;
            this.ipv6AddressId = model.ipv6AddressId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
        } 

        /**
         * <p>The IPv6 address.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:153:3921:851c:c435:7b12:1c5f</p>
         */
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * <p>The ID of the IPv6 address.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6-2zen5j4axcp5l5qyy****</p>
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazdjdhd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public AllocateIpv6AddressResponseBody build() {
            return new AllocateIpv6AddressResponseBody(this);
        } 

    } 

}
