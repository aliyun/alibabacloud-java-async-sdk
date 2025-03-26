// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link UnAssignPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>UnAssignPrivateIpAddressRequest</p>
 */
public class UnAssignPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subnetId;

    private UnAssignPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ipName = builder.ipName;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnAssignPrivateIpAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipName
     */
    public String getIpName() {
        return this.ipName;
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
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static final class Builder extends Request.Builder<UnAssignPrivateIpAddressRequest, Builder> {
        private String clientToken; 
        private String ipName; 
        private String networkInterfaceId; 
        private String privateIpAddress; 
        private String regionId; 
        private String subnetId; 

        private Builder() {
            super();
        } 

        private Builder(UnAssignPrivateIpAddressRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ipName = request.ipName;
            this.networkInterfaceId = request.networkInterfaceId;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
        } 

        /**
         * <p>By default, popApi is not ignored and idempotent</p>
         * 
         * <strong>example:</strong>
         * <p>141cccd6-dfbd-11ec-b8e8-0242ac110003</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>IP unique identifier</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-xxxx</p>
         */
        public Builder ipName(String ipName) {
            this.putBodyParameter("IpName", ipName);
            this.ipName = ipName;
            return this;
        }

        /**
         * <p>Lingjun network interface controller ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-bp18exxqa2rvfn45e5pz</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putBodyParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The private IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.209.75.242</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putBodyParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>Region</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Subnet</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-f3zfzmnc</p>
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        @Override
        public UnAssignPrivateIpAddressRequest build() {
            return new UnAssignPrivateIpAddressRequest(this);
        } 

    } 

}
