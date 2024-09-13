// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassignPrivateIpAddressesRequest} extends {@link RequestModel}
 *
 * <p>UnassignPrivateIpAddressesRequest</p>
 */
public class UnassignPrivateIpAddressesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > privateIpAddress;

    private UnassignPrivateIpAddressesRequest(Builder builder) {
        super(builder);
        this.networkInterfaceId = builder.networkInterfaceId;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassignPrivateIpAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return privateIpAddress
     */
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<UnassignPrivateIpAddressesRequest, Builder> {
        private String networkInterfaceId; 
        private java.util.List < String > privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(UnassignPrivateIpAddressesRequest request) {
            super(request);
            this.networkInterfaceId = request.networkInterfaceId;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The secondary private IP addresses to unassign.
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public UnassignPrivateIpAddressesRequest build() {
            return new UnassignPrivateIpAddressesRequest(this);
        } 

    } 

}
