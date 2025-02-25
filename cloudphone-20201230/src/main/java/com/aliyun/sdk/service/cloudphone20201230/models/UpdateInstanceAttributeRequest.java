// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceAttributeRequest</p>
 */
public class UpdateInstanceAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

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
    @NameInMap("Resolution")
    private String resolution;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VncPassword")
    private String vncPassword;

    private UpdateInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.keyPairName = builder.keyPairName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resolution = builder.resolution;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.tag = builder.tag;
        this.vncPassword = builder.vncPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceAttributeRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
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
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vncPassword
     */
    public String getVncPassword() {
        return this.vncPassword;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String description; 
        private String instanceId; 
        private String instanceName; 
        private String keyPairName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resolution; 
        private String resourceOwnerAccount; 
        private java.util.List < Tag> tag; 
        private String vncPassword; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.keyPairName = request.keyPairName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resolution = request.resolution;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.tag = request.tag;
            this.vncPassword = request.vncPassword;
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
         * The instance description. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The instance name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The name of the key pair that is used to connect to the instance. To improve the security of an instance, we recommend that you use a key pair to connect to the instance.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The instance resolution.
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
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
         * Details of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The VNC password of the instance. The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits.
         */
        public Builder vncPassword(String vncPassword) {
            this.putQueryParameter("VncPassword", vncPassword);
            this.vncPassword = vncPassword;
            return this;
        }

        @Override
        public UpdateInstanceAttributeRequest build() {
            return new UpdateInstanceAttributeRequest(this);
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
             * The tag key of the instance. Valid values of N: 1 to 20.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the instance. Valid values of N: 1 to 20.
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
}
