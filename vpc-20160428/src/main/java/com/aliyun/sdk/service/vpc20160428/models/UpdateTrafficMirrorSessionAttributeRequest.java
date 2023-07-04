// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficMirrorSessionAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficMirrorSessionAttributeRequest</p>
 */
public class UpdateTrafficMirrorSessionAttributeRequest extends Request {
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
    private String trafficMirrorFilterId;

    @Query
    @NameInMap("TrafficMirrorSessionDescription")
    private String trafficMirrorSessionDescription;

    @Query
    @NameInMap("TrafficMirrorSessionId")
    @Validation(required = true)
    private String trafficMirrorSessionId;

    @Query
    @NameInMap("TrafficMirrorSessionName")
    private String trafficMirrorSessionName;

    @Query
    @NameInMap("TrafficMirrorTargetId")
    private String trafficMirrorTargetId;

    @Query
    @NameInMap("TrafficMirrorTargetType")
    private String trafficMirrorTargetType;

    @Query
    @NameInMap("VirtualNetworkId")
    private Integer virtualNetworkId;

    private UpdateTrafficMirrorSessionAttributeRequest(Builder builder) {
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
        this.trafficMirrorSessionId = builder.trafficMirrorSessionId;
        this.trafficMirrorSessionName = builder.trafficMirrorSessionName;
        this.trafficMirrorTargetId = builder.trafficMirrorTargetId;
        this.trafficMirrorTargetType = builder.trafficMirrorTargetType;
        this.virtualNetworkId = builder.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMirrorSessionAttributeRequest create() {
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
     * @return trafficMirrorSessionId
     */
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    /**
     * @return trafficMirrorSessionName
     */
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
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

    public static final class Builder extends Request.Builder<UpdateTrafficMirrorSessionAttributeRequest, Builder> {
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
        private String trafficMirrorSessionId; 
        private String trafficMirrorSessionName; 
        private String trafficMirrorTargetId; 
        private String trafficMirrorTargetType; 
        private Integer virtualNetworkId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficMirrorSessionAttributeRequest request) {
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
            this.trafficMirrorSessionId = request.trafficMirrorSessionId;
            this.trafficMirrorSessionName = request.trafficMirrorSessionName;
            this.trafficMirrorTargetId = request.trafficMirrorTargetId;
            this.trafficMirrorTargetType = request.trafficMirrorTargetType;
            this.virtualNetworkId = request.virtualNetworkId;
        } 

        /**
         * The ID of the traffic mirror session.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the traffic mirror destination.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the request.
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
         * The region ID of the traffic mirror session. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list. For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](~~207513~~).
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
         * The priority of the traffic mirror session. Valid values: **1** to **32766**.
         * <p>
         * 
         * A smaller value specifies a higher priority. You cannot specify identical priorities for traffic mirror sessions that are created in the same region by using the same account.
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
         */
        public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
            this.putQueryParameter("TrafficMirrorSessionDescription", trafficMirrorSessionDescription);
            this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
            return this;
        }

        /**
         * The type of the traffic mirror destination. Valid values:
         * <p>
         * 
         * *   **NetworkInterface**: an ENI
         * *   **SLB**: an internal-facing Server Load Balancer (SLB) instance
         */
        public Builder trafficMirrorSessionId(String trafficMirrorSessionId) {
            this.putQueryParameter("TrafficMirrorSessionId", trafficMirrorSessionId);
            this.trafficMirrorSessionId = trafficMirrorSessionId;
            return this;
        }

        /**
         * Specifies whether to precheck the request without performing the operation. Valid values:
         * <p>
         * 
         * *   **true**: checks the request without performing the operation. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false**: sends the request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed. This is the default value.
         */
        public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
            this.putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
            this.trafficMirrorSessionName = trafficMirrorSessionName;
            return this;
        }

        /**
         * The ID of the traffic mirror filter.
         */
        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            this.putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        /**
         * The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: **0** to **16777215**.
         * <p>
         * 
         * You can use VNIs to identify mirrored traffic from different sessions at the traffic mirror destination. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
         */
        public Builder trafficMirrorTargetType(String trafficMirrorTargetType) {
            this.putQueryParameter("TrafficMirrorTargetType", trafficMirrorTargetType);
            this.trafficMirrorTargetType = trafficMirrorTargetType;
            return this;
        }

        /**
         * Specifies whether to enable the traffic mirror session.
         * <p>
         * 
         * *   **false**: disables the traffic mirror session. This is the default value.
         * *   **true**: enables the traffic mirror session.
         */
        public Builder virtualNetworkId(Integer virtualNetworkId) {
            this.putQueryParameter("VirtualNetworkId", virtualNetworkId);
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }

        @Override
        public UpdateTrafficMirrorSessionAttributeRequest build() {
            return new UpdateTrafficMirrorSessionAttributeRequest(this);
        } 

    } 

}
