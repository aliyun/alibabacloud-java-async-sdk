// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMirrorSessionRequest</p>
 */
public class CreateTrafficMirrorSessionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Enabled")
    private Boolean enabled;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PacketLength")
    private Integer packetLength;

    @Query
    @NameInMap("Priority")
    @Validation(required = true, maximum = 32766, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficMirrorFilterId")
    @Validation(required = true)
    private String trafficMirrorFilterId;

    @Query
    @NameInMap("TrafficMirrorSessionDescription")
    private String trafficMirrorSessionDescription;

    @Query
    @NameInMap("TrafficMirrorSessionName")
    private String trafficMirrorSessionName;

    @Query
    @NameInMap("TrafficMirrorSourceIds")
    @Validation(required = true, maxLength = 128)
    private java.util.List < String > trafficMirrorSourceIds;

    @Query
    @NameInMap("TrafficMirrorTargetId")
    @Validation(required = true)
    private String trafficMirrorTargetId;

    @Query
    @NameInMap("TrafficMirrorTargetType")
    @Validation(required = true)
    private String trafficMirrorTargetType;

    @Query
    @NameInMap("VirtualNetworkId")
    private Integer virtualNetworkId;

    private CreateTrafficMirrorSessionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.enabled = builder.enabled;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.packetLength = builder.packetLength;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
        this.trafficMirrorSessionDescription = builder.trafficMirrorSessionDescription;
        this.trafficMirrorSessionName = builder.trafficMirrorSessionName;
        this.trafficMirrorSourceIds = builder.trafficMirrorSourceIds;
        this.trafficMirrorTargetId = builder.trafficMirrorTargetId;
        this.trafficMirrorTargetType = builder.trafficMirrorTargetType;
        this.virtualNetworkId = builder.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorSessionRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return packetLength
     */
    public Integer getPacketLength() {
        return this.packetLength;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * @return trafficMirrorSessionDescription
     */
    public String getTrafficMirrorSessionDescription() {
        return this.trafficMirrorSessionDescription;
    }

    /**
     * @return trafficMirrorSessionName
     */
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    /**
     * @return trafficMirrorSourceIds
     */
    public java.util.List < String > getTrafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
    }

    /**
     * @return trafficMirrorTargetId
     */
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * @return trafficMirrorTargetType
     */
    public String getTrafficMirrorTargetType() {
        return this.trafficMirrorTargetType;
    }

    /**
     * @return virtualNetworkId
     */
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static final class Builder extends Request.Builder<CreateTrafficMirrorSessionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Boolean enabled; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer packetLength; 
        private Integer priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMirrorFilterId; 
        private String trafficMirrorSessionDescription; 
        private String trafficMirrorSessionName; 
        private java.util.List < String > trafficMirrorSourceIds; 
        private String trafficMirrorTargetId; 
        private String trafficMirrorTargetType; 
        private Integer virtualNetworkId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMirrorSessionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.enabled = request.enabled;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.packetLength = request.packetLength;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMirrorFilterId = request.trafficMirrorFilterId;
            this.trafficMirrorSessionDescription = request.trafficMirrorSessionDescription;
            this.trafficMirrorSessionName = request.trafficMirrorSessionName;
            this.trafficMirrorSourceIds = request.trafficMirrorSourceIds;
            this.trafficMirrorTargetId = request.trafficMirrorTargetId;
            this.trafficMirrorTargetType = request.trafficMirrorTargetType;
            this.virtualNetworkId = request.virtualNetworkId;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PacketLength.
         */
        public Builder packetLength(Integer packetLength) {
            this.putQueryParameter("PacketLength", packetLength);
            this.packetLength = packetLength;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * TrafficMirrorFilterId.
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * TrafficMirrorSessionDescription.
         */
        public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
            this.putQueryParameter("TrafficMirrorSessionDescription", trafficMirrorSessionDescription);
            this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
            return this;
        }

        /**
         * TrafficMirrorSessionName.
         */
        public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
            this.putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
            this.trafficMirrorSessionName = trafficMirrorSessionName;
            return this;
        }

        /**
         * TrafficMirrorSourceIds.
         */
        public Builder trafficMirrorSourceIds(java.util.List < String > trafficMirrorSourceIds) {
            this.putQueryParameter("TrafficMirrorSourceIds", trafficMirrorSourceIds);
            this.trafficMirrorSourceIds = trafficMirrorSourceIds;
            return this;
        }

        /**
         * TrafficMirrorTargetId.
         */
        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            this.putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        /**
         * TrafficMirrorTargetType.
         */
        public Builder trafficMirrorTargetType(String trafficMirrorTargetType) {
            this.putQueryParameter("TrafficMirrorTargetType", trafficMirrorTargetType);
            this.trafficMirrorTargetType = trafficMirrorTargetType;
            return this;
        }

        /**
         * VirtualNetworkId.
         */
        public Builder virtualNetworkId(Integer virtualNetworkId) {
            this.putQueryParameter("VirtualNetworkId", virtualNetworkId);
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }

        @Override
        public CreateTrafficMirrorSessionRequest build() {
            return new CreateTrafficMirrorSessionRequest(this);
        } 

    } 

}
