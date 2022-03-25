// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualNodeRequest</p>
 */
public class CreateVirtualNodeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EipInstanceId")
    private String eipInstanceId;

    @Query
    @NameInMap("EnablePublicNetwork")
    private Boolean enablePublicNetwork;

    @Query
    @NameInMap("KubeConfig")
    private String kubeConfig;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RotateCertificateEnabled")
    private Boolean rotateCertificateEnabled;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Taint")
    private java.util.List < Taint> taint;

    @Query
    @NameInMap("TlsBootstrapEnabled")
    private Boolean tlsBootstrapEnabled;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VirtualNodeName")
    private String virtualNodeName;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateVirtualNodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.eipInstanceId = builder.eipInstanceId;
        this.enablePublicNetwork = builder.enablePublicNetwork;
        this.kubeConfig = builder.kubeConfig;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rotateCertificateEnabled = builder.rotateCertificateEnabled;
        this.securityGroupId = builder.securityGroupId;
        this.tag = builder.tag;
        this.taint = builder.taint;
        this.tlsBootstrapEnabled = builder.tlsBootstrapEnabled;
        this.vSwitchId = builder.vSwitchId;
        this.virtualNodeName = builder.virtualNodeName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualNodeRequest create() {
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
     * @return eipInstanceId
     */
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    /**
     * @return enablePublicNetwork
     */
    public Boolean getEnablePublicNetwork() {
        return this.enablePublicNetwork;
    }

    /**
     * @return kubeConfig
     */
    public String getKubeConfig() {
        return this.kubeConfig;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return rotateCertificateEnabled
     */
    public Boolean getRotateCertificateEnabled() {
        return this.rotateCertificateEnabled;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return taint
     */
    public java.util.List < Taint> getTaint() {
        return this.taint;
    }

    /**
     * @return tlsBootstrapEnabled
     */
    public Boolean getTlsBootstrapEnabled() {
        return this.tlsBootstrapEnabled;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return virtualNodeName
     */
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateVirtualNodeRequest, Builder> {
        private String clientToken; 
        private String eipInstanceId; 
        private Boolean enablePublicNetwork; 
        private String kubeConfig; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean rotateCertificateEnabled; 
        private String securityGroupId; 
        private java.util.List < Tag> tag; 
        private java.util.List < Taint> taint; 
        private Boolean tlsBootstrapEnabled; 
        private String vSwitchId; 
        private String virtualNodeName; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualNodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.eipInstanceId = request.eipInstanceId;
            this.enablePublicNetwork = request.enablePublicNetwork;
            this.kubeConfig = request.kubeConfig;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rotateCertificateEnabled = request.rotateCertificateEnabled;
            this.securityGroupId = request.securityGroupId;
            this.tag = request.tag;
            this.taint = request.taint;
            this.tlsBootstrapEnabled = request.tlsBootstrapEnabled;
            this.vSwitchId = request.vSwitchId;
            this.virtualNodeName = request.virtualNodeName;
            this.zoneId = request.zoneId;
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
         * EipInstanceId.
         */
        public Builder eipInstanceId(String eipInstanceId) {
            this.putQueryParameter("EipInstanceId", eipInstanceId);
            this.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * EnablePublicNetwork.
         */
        public Builder enablePublicNetwork(Boolean enablePublicNetwork) {
            this.putQueryParameter("EnablePublicNetwork", enablePublicNetwork);
            this.enablePublicNetwork = enablePublicNetwork;
            return this;
        }

        /**
         * KubeConfig.
         */
        public Builder kubeConfig(String kubeConfig) {
            this.putQueryParameter("KubeConfig", kubeConfig);
            this.kubeConfig = kubeConfig;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * RotateCertificateEnabled.
         */
        public Builder rotateCertificateEnabled(Boolean rotateCertificateEnabled) {
            this.putQueryParameter("RotateCertificateEnabled", rotateCertificateEnabled);
            this.rotateCertificateEnabled = rotateCertificateEnabled;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Taint.
         */
        public Builder taint(java.util.List < Taint> taint) {
            this.putQueryParameter("Taint", taint);
            this.taint = taint;
            return this;
        }

        /**
         * TlsBootstrapEnabled.
         */
        public Builder tlsBootstrapEnabled(Boolean tlsBootstrapEnabled) {
            this.putQueryParameter("TlsBootstrapEnabled", tlsBootstrapEnabled);
            this.tlsBootstrapEnabled = tlsBootstrapEnabled;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VirtualNodeName.
         */
        public Builder virtualNodeName(String virtualNodeName) {
            this.putQueryParameter("VirtualNodeName", virtualNodeName);
            this.virtualNodeName = virtualNodeName;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateVirtualNodeRequest build() {
            return new CreateVirtualNodeRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Taint extends TeaModel {
        @NameInMap("Effect")
        private String effect;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Taint(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taint create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String value; 

            /**
             * Effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taint build() {
                return new Taint(this);
            } 

        } 

    }
}
