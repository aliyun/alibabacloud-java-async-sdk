// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIpsRequest</p>
 */
public class ModifySecurityIpsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
    private String securityIpGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityIps")
    private String securityIps;

    private ModifySecurityIpsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.securityIpGroupName = builder.securityIpGroupName;
        this.securityIps = builder.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return securityIpGroupName
     */
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIpsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String securityIpGroupName; 
        private String securityIps; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIpsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.securityIpGroupName = request.securityIpGroupName;
            this.securityIps = request.securityIps;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The information of the IP address whitelist group.
         */
        public Builder securityIpGroupName(String securityIpGroupName) {
            this.putBodyParameter("SecurityIpGroupName", securityIpGroupName);
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }

        /**
         * The list of IP addresses and CIDR blocks in the whitelist.   
         * <p>
         * It is a JSON array. Each object in the array is an IP address or CIDR block. You can specify at most 40 IP addresses or CIDR blocks.
         */
        public Builder securityIps(String securityIps) {
            this.putBodyParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        @Override
        public ModifySecurityIpsRequest build() {
            return new ModifySecurityIpsRequest(this);
        } 

    } 

}
