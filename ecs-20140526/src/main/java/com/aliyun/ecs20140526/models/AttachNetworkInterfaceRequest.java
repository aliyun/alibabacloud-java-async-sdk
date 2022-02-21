// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>AttachNetworkInterfaceRequest</p>
 */
public class AttachNetworkInterfaceRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrunkNetworkInstanceId")
    private String trunkNetworkInstanceId;

    @Query
    @NameInMap("WaitForNetworkConfigurationReady")
    private Boolean waitForNetworkConfigurationReady;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private AttachNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trunkNetworkInstanceId = builder.trunkNetworkInstanceId;
        this.waitForNetworkConfigurationReady = builder.waitForNetworkConfigurationReady;
        this.regionId = builder.regionId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachNetworkInterfaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return trunkNetworkInstanceId
     */
    public String getTrunkNetworkInstanceId() {
        return this.trunkNetworkInstanceId;
    }

    /**
     * @return waitForNetworkConfigurationReady
     */
    public Boolean getWaitForNetworkConfigurationReady() {
        return this.waitForNetworkConfigurationReady;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AttachNetworkInterfaceRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String trunkNetworkInstanceId; 
        private Boolean waitForNetworkConfigurationReady; 
        private String regionId; 
        private String networkInterfaceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AttachNetworkInterfaceRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.trunkNetworkInstanceId = response.trunkNetworkInstanceId;
            this.waitForNetworkConfigurationReady = response.waitForNetworkConfigurationReady;
            this.regionId = response.regionId;
            this.networkInterfaceId = response.networkInterfaceId;
            this.instanceId = response.instanceId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * TrunkNetworkInstanceId.
         */
        public Builder trunkNetworkInstanceId(String trunkNetworkInstanceId) {
            this.putQueryParameter("TrunkNetworkInstanceId", trunkNetworkInstanceId);
            this.trunkNetworkInstanceId = trunkNetworkInstanceId;
            return this;
        }

        /**
         * WaitForNetworkConfigurationReady.
         */
        public Builder waitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
            this.putQueryParameter("WaitForNetworkConfigurationReady", waitForNetworkConfigurationReady);
            this.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
            return this;
        }

        /**
         * The ID of the region where the instance is located. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Eni.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public AttachNetworkInterfaceRequest build() {
            return new AttachNetworkInterfaceRequest(this);
        } 

    } 

}
