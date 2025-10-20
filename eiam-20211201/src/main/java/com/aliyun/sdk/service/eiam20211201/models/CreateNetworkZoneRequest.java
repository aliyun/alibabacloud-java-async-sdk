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
 * {@link CreateNetworkZoneRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkZoneRequest</p>
 */
public class CreateNetworkZoneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("NetworkZoneName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String networkZoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkZoneType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String networkZoneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String vpcId;

    private CreateNetworkZoneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.ipv4Cidrs = builder.ipv4Cidrs;
        this.ipv6Cidrs = builder.ipv6Cidrs;
        this.networkZoneName = builder.networkZoneName;
        this.networkZoneType = builder.networkZoneType;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkZoneRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return networkZoneName
     */
    public String getNetworkZoneName() {
        return this.networkZoneName;
    }

    /**
     * @return networkZoneType
     */
    public String getNetworkZoneType() {
        return this.networkZoneType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateNetworkZoneRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String description; 
        private String instanceId; 
        private java.util.List<String> ipv4Cidrs; 
        private java.util.List<String> ipv6Cidrs; 
        private String networkZoneName; 
        private String networkZoneType; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkZoneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.ipv4Cidrs = request.ipv4Cidrs;
            this.ipv6Cidrs = request.ipv6Cidrs;
            this.networkZoneName = request.networkZoneName;
            this.networkZoneType = request.networkZoneType;
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
         * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>网络区域描述</p>
         * 
         * <strong>example:</strong>
         * <p>测试描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * <p>网络区域ipv4Cidr</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.putQueryParameter("Ipv4Cidrs", ipv4Cidrs);
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }

        /**
         * <p>网络区域ipv6Cidr</p>
         * 
         * <strong>example:</strong>
         * <p>::/0</p>
         */
        public Builder ipv6Cidrs(java.util.List<String> ipv6Cidrs) {
            this.putQueryParameter("Ipv6Cidrs", ipv6Cidrs);
            this.ipv6Cidrs = ipv6Cidrs;
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
         * <p>网络区域类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:network:zone:classic</p>
         */
        public Builder networkZoneType(String networkZoneType) {
            this.putQueryParameter("NetworkZoneType", networkZoneType);
            this.networkZoneType = networkZoneType;
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
        public CreateNetworkZoneRequest build() {
            return new CreateNetworkZoneRequest(this);
        } 

    } 

}
