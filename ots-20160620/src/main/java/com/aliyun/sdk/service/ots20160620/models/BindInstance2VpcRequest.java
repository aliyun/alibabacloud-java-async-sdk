// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstance2VpcRequest} extends {@link RequestModel}
 *
 * <p>BindInstance2VpcRequest</p>
 */
public class BindInstance2VpcRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("InstanceVpcName")
    @Validation(required = true)
    private String instanceVpcName;

    @Query
    @NameInMap("Network")
    private String network;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VirtualSwitchId")
    @Validation(required = true)
    private String virtualSwitchId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private BindInstance2VpcRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.instanceVpcName = builder.instanceVpcName;
        this.network = builder.network;
        this.regionNo = builder.regionNo;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.virtualSwitchId = builder.virtualSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindInstance2VpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceVpcName
     */
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return virtualSwitchId
     */
    public String getVirtualSwitchId() {
        return this.virtualSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<BindInstance2VpcRequest, Builder> {
        private String instanceName; 
        private String instanceVpcName; 
        private String network; 
        private String regionNo; 
        private Long resourceOwnerId; 
        private String virtualSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(BindInstance2VpcRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.instanceVpcName = request.instanceVpcName;
            this.network = request.network;
            this.regionNo = request.regionNo;
            this.resourceOwnerId = request.resourceOwnerId;
            this.virtualSwitchId = request.virtualSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceVpcName.
         */
        public Builder instanceVpcName(String instanceVpcName) {
            this.putQueryParameter("InstanceVpcName", instanceVpcName);
            this.instanceVpcName = instanceVpcName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putQueryParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * VirtualSwitchId.
         */
        public Builder virtualSwitchId(String virtualSwitchId) {
            this.putQueryParameter("VirtualSwitchId", virtualSwitchId);
            this.virtualSwitchId = virtualSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public BindInstance2VpcRequest build() {
            return new BindInstance2VpcRequest(this);
        } 

    } 

}
