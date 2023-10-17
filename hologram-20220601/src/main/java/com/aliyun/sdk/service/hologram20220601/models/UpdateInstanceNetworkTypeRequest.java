// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceNetworkTypeRequest</p>
 */
public class UpdateInstanceNetworkTypeRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Body
    @NameInMap("anyTunnelToSingleTunnel")
    private String anyTunnelToSingleTunnel;

    @Body
    @NameInMap("networkTypes")
    private String networkTypes;

    @Body
    @NameInMap("vSwitchId")
    private String vSwitchId;

    @Body
    @NameInMap("vpcId")
    private String vpcId;

    @Body
    @NameInMap("vpcOwnerId")
    private String vpcOwnerId;

    @Body
    @NameInMap("vpcRegionId")
    private String vpcRegionId;

    private UpdateInstanceNetworkTypeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.anyTunnelToSingleTunnel = builder.anyTunnelToSingleTunnel;
        this.networkTypes = builder.networkTypes;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.vpcOwnerId = builder.vpcOwnerId;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceNetworkTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return anyTunnelToSingleTunnel
     */
    public String getAnyTunnelToSingleTunnel() {
        return this.anyTunnelToSingleTunnel;
    }

    /**
     * @return networkTypes
     */
    public String getNetworkTypes() {
        return this.networkTypes;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcOwnerId
     */
    public String getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceNetworkTypeRequest, Builder> {
        private String instanceId; 
        private String anyTunnelToSingleTunnel; 
        private String networkTypes; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpcOwnerId; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceNetworkTypeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.anyTunnelToSingleTunnel = request.anyTunnelToSingleTunnel;
            this.networkTypes = request.networkTypes;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.vpcOwnerId = request.vpcOwnerId;
            this.vpcRegionId = request.vpcRegionId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to change the network type from AnyTunnel to SingleTunnel. This parameter is invalid for new instances. For new instances, this parameter is set to null by default.
         * <p>
         * 
         * Valid values:
         * 
         * *   others/null
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder anyTunnelToSingleTunnel(String anyTunnelToSingleTunnel) {
            this.putBodyParameter("anyTunnelToSingleTunnel", anyTunnelToSingleTunnel);
            this.anyTunnelToSingleTunnel = anyTunnelToSingleTunnel;
            return this;
        }

        /**
         * A list of network types that you want to enable. The list of enabled network types is randomly ordered. For example, the Internet, internal network, and VPCSingleTunnel network types are enabled. If you want to disable the Internet type, set this parameter to Intranet,VPCSingleTunnel.
         */
        public Builder networkTypes(String networkTypes) {
            this.putBodyParameter("networkTypes", networkTypes);
            this.networkTypes = networkTypes;
            return this;
        }

        /**
         * The vSwitch ID.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("vSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the VPC to which the instance belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The owner ID of the VPC, which is the ID of the Alibaba Cloud account.
         */
        public Builder vpcOwnerId(String vpcOwnerId) {
            this.putBodyParameter("vpcOwnerId", vpcOwnerId);
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }

        /**
         * The region ID of the VPC.
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putBodyParameter("vpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public UpdateInstanceNetworkTypeRequest build() {
            return new UpdateInstanceNetworkTypeRequest(this);
        } 

    } 

}
