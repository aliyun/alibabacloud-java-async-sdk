// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageAdvancedAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageAdvancedAttributeRequest</p>
 */
public class ModifyImageAdvancedAttributeRequest extends Request {
    @Query
    @NameInMap("Flag")
    private java.util.List < Flag> flag;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

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

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("SupportIoOptimized")
    private String supportIoOptimized;

    private ModifyImageAdvancedAttributeRequest(Builder builder) {
        super(builder);
        this.flag = builder.flag;
        this.imageId = builder.imageId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceRegionId = builder.sourceRegionId;
        this.supportIoOptimized = builder.supportIoOptimized;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageAdvancedAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flag
     */
    public java.util.List < Flag> getFlag() {
        return this.flag;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return supportIoOptimized
     */
    public String getSupportIoOptimized() {
        return this.supportIoOptimized;
    }

    public static final class Builder extends Request.Builder<ModifyImageAdvancedAttributeRequest, Builder> {
        private java.util.List < Flag> flag; 
        private String imageId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceRegionId; 
        private String supportIoOptimized; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageAdvancedAttributeRequest response) {
            super(response);
            this.flag = response.flag;
            this.imageId = response.imageId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceRegionId = response.sourceRegionId;
            this.supportIoOptimized = response.supportIoOptimized;
        } 

        /**
         * Flag.
         */
        public Builder flag(java.util.List < Flag> flag) {
            this.putQueryParameter("Flag", flag);
            this.flag = flag;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * SupportIoOptimized.
         */
        public Builder supportIoOptimized(String supportIoOptimized) {
            this.putQueryParameter("SupportIoOptimized", supportIoOptimized);
            this.supportIoOptimized = supportIoOptimized;
            return this;
        }

        @Override
        public ModifyImageAdvancedAttributeRequest build() {
            return new ModifyImageAdvancedAttributeRequest(this);
        } 

    } 

    public static class Flag extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private Boolean value;

        private Flag(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flag create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Boolean getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Boolean value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Boolean value) {
                this.value = value;
                return this;
            }

            public Flag build() {
                return new Flag(this);
            } 

        } 

    }
}
