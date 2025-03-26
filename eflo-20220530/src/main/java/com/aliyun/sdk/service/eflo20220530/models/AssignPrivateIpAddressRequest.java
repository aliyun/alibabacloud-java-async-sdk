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
 * {@link AssignPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>AssignPrivateIpAddressRequest</p>
 */
public class AssignPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssignMac")
    private Boolean assignMac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("SkipConfig")
    private Boolean skipConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subnetId;

    private AssignPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.assignMac = builder.assignMac;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.skipConfig = builder.skipConfig;
        this.subnetId = builder.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignPrivateIpAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignMac
     */
    public Boolean getAssignMac() {
        return this.assignMac;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return skipConfig
     */
    public Boolean getSkipConfig() {
        return this.skipConfig;
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static final class Builder extends Request.Builder<AssignPrivateIpAddressRequest, Builder> {
        private Boolean assignMac; 
        private String clientToken; 
        private String description; 
        private String networkInterfaceId; 
        private String privateIpAddress; 
        private String regionId; 
        private Boolean skipConfig; 
        private String subnetId; 

        private Builder() {
            super();
        } 

        private Builder(AssignPrivateIpAddressRequest request) {
            super(request);
            this.assignMac = request.assignMac;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.networkInterfaceId = request.networkInterfaceId;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.skipConfig = request.skipConfig;
            this.subnetId = request.subnetId;
        } 

        /**
         * <p>Specifies whether to assign a mac address.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder assignMac(Boolean assignMac) {
            this.putBodyParameter("AssignMac", assignMac);
            this.assignMac = assignMac;
            return this;
        }

        /**
         * <p>By default, popApi is not ignored and idempotent</p>
         * 
         * <strong>example:</strong>
         * <p>3fd79d62-ab1d-11ec-9a53-0242ac110004</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the network interface controller.</p>
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
         * <p>The secondary private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.6.194</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putBodyParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The default value is false. If you set the value to true, the secondary private IP address application process can be accelerated.</p>
         * <blockquote>
         * <p> For more information, submit a ticket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipConfig(Boolean skipConfig) {
            this.putBodyParameter("SkipConfig", skipConfig);
            this.skipConfig = skipConfig;
            return this;
        }

        /**
         * <p>It belongs to the Lingjun subnet.</p>
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
        public AssignPrivateIpAddressRequest build() {
            return new AssignPrivateIpAddressRequest(this);
        } 

    } 

}
