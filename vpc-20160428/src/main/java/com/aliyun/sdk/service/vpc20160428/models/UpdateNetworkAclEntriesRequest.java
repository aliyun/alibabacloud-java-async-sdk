// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNetworkAclEntriesRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkAclEntriesRequest</p>
 */
public class UpdateNetworkAclEntriesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EgressAclEntries")
    private java.util.List < EgressAclEntries> egressAclEntries;

    @Query
    @NameInMap("IngressAclEntries")
    private java.util.List < IngressAclEntries> ingressAclEntries;

    @Query
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    private String networkAclId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("UpdateEgressAclEntries")
    private Boolean updateEgressAclEntries;

    @Query
    @NameInMap("UpdateIngressAclEntries")
    private Boolean updateIngressAclEntries;

    private UpdateNetworkAclEntriesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.egressAclEntries = builder.egressAclEntries;
        this.ingressAclEntries = builder.ingressAclEntries;
        this.networkAclId = builder.networkAclId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.updateEgressAclEntries = builder.updateEgressAclEntries;
        this.updateIngressAclEntries = builder.updateIngressAclEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkAclEntriesRequest create() {
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
     * @return egressAclEntries
     */
    public java.util.List < EgressAclEntries> getEgressAclEntries() {
        return this.egressAclEntries;
    }

    /**
     * @return ingressAclEntries
     */
    public java.util.List < IngressAclEntries> getIngressAclEntries() {
        return this.ingressAclEntries;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return updateEgressAclEntries
     */
    public Boolean getUpdateEgressAclEntries() {
        return this.updateEgressAclEntries;
    }

    /**
     * @return updateIngressAclEntries
     */
    public Boolean getUpdateIngressAclEntries() {
        return this.updateIngressAclEntries;
    }

    public static final class Builder extends Request.Builder<UpdateNetworkAclEntriesRequest, Builder> {
        private String clientToken; 
        private java.util.List < EgressAclEntries> egressAclEntries; 
        private java.util.List < IngressAclEntries> ingressAclEntries; 
        private String networkAclId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean updateEgressAclEntries; 
        private Boolean updateIngressAclEntries; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkAclEntriesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.egressAclEntries = request.egressAclEntries;
            this.ingressAclEntries = request.ingressAclEntries;
            this.networkAclId = request.networkAclId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.updateEgressAclEntries = request.updateEgressAclEntries;
            this.updateIngressAclEntries = request.updateIngressAclEntries;
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
         * EgressAclEntries.
         */
        public Builder egressAclEntries(java.util.List < EgressAclEntries> egressAclEntries) {
            this.putQueryParameter("EgressAclEntries", egressAclEntries);
            this.egressAclEntries = egressAclEntries;
            return this;
        }

        /**
         * IngressAclEntries.
         */
        public Builder ingressAclEntries(java.util.List < IngressAclEntries> ingressAclEntries) {
            this.putQueryParameter("IngressAclEntries", ingressAclEntries);
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }

        /**
         * NetworkAclId.
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
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
         * UpdateEgressAclEntries.
         */
        public Builder updateEgressAclEntries(Boolean updateEgressAclEntries) {
            this.putQueryParameter("UpdateEgressAclEntries", updateEgressAclEntries);
            this.updateEgressAclEntries = updateEgressAclEntries;
            return this;
        }

        /**
         * UpdateIngressAclEntries.
         */
        public Builder updateIngressAclEntries(Boolean updateIngressAclEntries) {
            this.putQueryParameter("UpdateIngressAclEntries", updateIngressAclEntries);
            this.updateIngressAclEntries = updateIngressAclEntries;
            return this;
        }

        @Override
        public UpdateNetworkAclEntriesRequest build() {
            return new UpdateNetworkAclEntriesRequest(this);
        } 

    } 

    public static class EgressAclEntries extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationCidrIp")
        private String destinationCidrIp;

        @NameInMap("EntryType")
        private String entryType;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        private EgressAclEntries(Builder builder) {
            this.description = builder.description;
            this.destinationCidrIp = builder.destinationCidrIp;
            this.entryType = builder.entryType;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressAclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrIp
         */
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        /**
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String description; 
            private String destinationCidrIp; 
            private String entryType; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestinationCidrIp.
             */
            public Builder destinationCidrIp(String destinationCidrIp) {
                this.destinationCidrIp = destinationCidrIp;
                return this;
            }

            /**
             * EntryType.
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * NetworkAclEntryId.
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * NetworkAclEntryName.
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public EgressAclEntries build() {
                return new EgressAclEntries(this);
            } 

        } 

    }
    public static class IngressAclEntries extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("EntryType")
        private String entryType;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private IngressAclEntries(Builder builder) {
            this.description = builder.description;
            this.entryType = builder.entryType;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressAclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String description; 
            private String entryType; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 
            private String sourceCidrIp; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EntryType.
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * NetworkAclEntryId.
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * NetworkAclEntryName.
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public IngressAclEntries build() {
                return new IngressAclEntries(this);
            } 

        } 

    }
}
