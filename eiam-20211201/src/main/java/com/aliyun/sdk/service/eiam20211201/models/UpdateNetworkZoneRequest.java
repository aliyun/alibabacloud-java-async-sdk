// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateNetworkZoneRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkZoneRequest</p>
 */
public class UpdateNetworkZoneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
    private java.util.List<String> ipv4Cidrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Cidrs")
    private java.util.List<String> ipv6Cidrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkZoneId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String networkZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkZoneName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String networkZoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String vpcId;

    private UpdateNetworkZoneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.ipv4Cidrs = builder.ipv4Cidrs;
        this.ipv6Cidrs = builder.ipv6Cidrs;
        this.networkZoneId = builder.networkZoneId;
        this.networkZoneName = builder.networkZoneName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkZoneRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipv4Cidrs
     */
    public java.util.List<String> getIpv4Cidrs() {
        return this.ipv4Cidrs;
    }

    /**
     * @return ipv6Cidrs
     */
    public java.util.List<String> getIpv6Cidrs() {
        return this.ipv6Cidrs;
    }

    /**
     * @return networkZoneId
     */
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

    /**
     * @return networkZoneName
     */
    public String getNetworkZoneName() {
        return this.networkZoneName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<UpdateNetworkZoneRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String instanceId; 
        private java.util.List<String> ipv4Cidrs; 
        private java.util.List<String> ipv6Cidrs; 
        private String networkZoneId; 
        private String networkZoneName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkZoneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.ipv4Cidrs = request.ipv4Cidrs;
            this.ipv6Cidrs = request.ipv6Cidrs;
            this.networkZoneId = request.networkZoneId;
            this.networkZoneName = request.networkZoneName;
            this.vpcId = request.vpcId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>包含的CIDR</p>
         */
        public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.putQueryParameter("Ipv4Cidrs", ipv4Cidrs);
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }

        /**
         * <p>网络区域ipv6Cidr</p>
         */
        public Builder ipv6Cidrs(java.util.List<String> ipv6Cidrs) {
            this.putQueryParameter("Ipv6Cidrs", ipv6Cidrs);
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }

        /**
         * <p>IDaaS的网络区域主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>network_11111</p>
         */
        public Builder networkZoneId(String networkZoneId) {
            this.putQueryParameter("NetworkZoneId", networkZoneId);
            this.networkZoneId = networkZoneId;
            return this;
        }

        /**
         * <p>网络区域名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IPV4Test</p>
         */
        public Builder networkZoneName(String networkZoneName) {
            this.putQueryParameter("NetworkZoneName", networkZoneName);
            this.networkZoneName = networkZoneName;
            return this;
        }

        /**
         * <p>专有网络VpcId</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_xxxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public UpdateNetworkZoneRequest build() {
            return new UpdateNetworkZoneRequest(this);
        } 

    } 

}
