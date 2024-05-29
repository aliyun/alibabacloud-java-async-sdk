// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkAccessEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkAccessEndpointRequest</p>
 */
public class CreateNetworkAccessEndpointRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAccessEndpointName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    @com.aliyun.core.annotation.Validation(maxLength = 2)
    private java.util.List < String > vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcRegionId;

    private CreateNetworkAccessEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.networkAccessEndpointName = builder.networkAccessEndpointName;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAccessEndpointRequest create() {
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
     * @return networkAccessEndpointName
     */
    public String getNetworkAccessEndpointName() {
        return this.networkAccessEndpointName;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<CreateNetworkAccessEndpointRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String instanceId; 
        private String networkAccessEndpointName; 
        private java.util.List < String > vSwitchIds; 
        private String vpcId; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkAccessEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.networkAccessEndpointName = request.networkAccessEndpointName;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.vpcRegionId = request.vpcRegionId;
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
         * 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 专属网络端点名称。
         */
        public Builder networkAccessEndpointName(String networkAccessEndpointName) {
            this.putQueryParameter("NetworkAccessEndpointName", networkAccessEndpointName);
            this.networkAccessEndpointName = networkAccessEndpointName;
            return this;
        }

        /**
         * 专属网络端点连接的指定vSwitch。
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * 专属网络端点连接的VpcID。
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 专属网络端点连接的VpcID所属地域，该地域取值必须在ListNetworkAccessEndpointAvailableRegions接口中返回。
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putQueryParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public CreateNetworkAccessEndpointRequest build() {
            return new CreateNetworkAccessEndpointRequest(this);
        } 

    } 

}
