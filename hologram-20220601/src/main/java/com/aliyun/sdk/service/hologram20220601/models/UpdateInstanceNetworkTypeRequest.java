// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateInstanceNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceNetworkTypeRequest</p>
 */
public class UpdateInstanceNetworkTypeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("anyTunnelToSingleTunnel")
    private String anyTunnelToSingleTunnel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkTypes")
    private String networkTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcOwnerId")
    private String vpcOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcRegionId")
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-lbj35pw74002</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to change the network type from AnyTunnel to SingleTunnel. This parameter is invalid for new instances. For new instances, this parameter is set to null by default.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>others/null: The network type is not changed from AnyTunnel to SingleTunnel.</li>
         * <li>true: The network type is changed from AnyTunnel to SingleTunnel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder anyTunnelToSingleTunnel(String anyTunnelToSingleTunnel) {
            this.putBodyParameter("anyTunnelToSingleTunnel", anyTunnelToSingleTunnel);
            this.anyTunnelToSingleTunnel = anyTunnelToSingleTunnel;
            return this;
        }

        /**
         * <p>A list of network types that you want to enable. The network types are randomly ordered in the list. For example, the Internet, Intranet, and VPCSingleTunnel network types are enabled. If you want to disable the Internet type, set this parameter to Intranet,VPCSingleTunnel.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>VPCSingleTunnel: virtual private cloud (VPC).</li>
         * <li>Intranet: internal network.</li>
         * <li>VPCAnyTunnel: compatibility requirements. This value is not supported by new instances.</li>
         * <li>Internet: Internet.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet,VPCSingleTunnel</p>
         */
        public Builder networkTypes(String networkTypes) {
            this.putBodyParameter("networkTypes", networkTypes);
            this.networkTypes = networkTypes;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vccsiymtqr9aavew0vo3</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("vSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4netc3y5etlondfb5ra7</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1999365732646672</p>
         */
        public Builder vpcOwnerId(String vpcOwnerId) {
            this.putBodyParameter("vpcOwnerId", vpcOwnerId);
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }

        /**
         * <p>The region in which the VPC resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
