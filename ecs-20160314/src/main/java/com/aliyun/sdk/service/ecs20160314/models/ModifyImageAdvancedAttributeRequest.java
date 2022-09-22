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
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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

    @Query
    @NameInMap("SupportIoOptimized")
    @Deprecated
    private String supportIoOptimized;

    private ModifyImageAdvancedAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.flag = builder.flag;
        this.imageId = builder.imageId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return supportIoOptimized
     */
    public String getSupportIoOptimized() {
        return this.supportIoOptimized;
    }

    public static final class Builder extends Request.Builder<ModifyImageAdvancedAttributeRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List < Flag> flag; 
        private String imageId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String supportIoOptimized; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageAdvancedAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.flag = request.flag;
            this.imageId = request.imageId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.supportIoOptimized = request.supportIoOptimized;
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
