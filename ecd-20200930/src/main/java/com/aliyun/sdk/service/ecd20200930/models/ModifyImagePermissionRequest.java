// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImagePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImagePermissionRequest</p>
 */
public class ModifyImagePermissionRequest extends Request {
    @Query
    @NameInMap("AddAccount")
    private java.util.List < Long > addAccount;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoveAccount")
    private java.util.List < Long > removeAccount;

    private ModifyImagePermissionRequest(Builder builder) {
        super(builder);
        this.addAccount = builder.addAccount;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
        this.removeAccount = builder.removeAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImagePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addAccount
     */
    public java.util.List < Long > getAddAccount() {
        return this.addAccount;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return removeAccount
     */
    public java.util.List < Long > getRemoveAccount() {
        return this.removeAccount;
    }

    public static final class Builder extends Request.Builder<ModifyImagePermissionRequest, Builder> {
        private java.util.List < Long > addAccount; 
        private String imageId; 
        private String regionId; 
        private java.util.List < Long > removeAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImagePermissionRequest request) {
            super(request);
            this.addAccount = request.addAccount;
            this.imageId = request.imageId;
            this.regionId = request.regionId;
            this.removeAccount = request.removeAccount;
        } 

        /**
         * AddAccount.
         */
        public Builder addAccount(java.util.List < Long > addAccount) {
            this.putQueryParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemoveAccount.
         */
        public Builder removeAccount(java.util.List < Long > removeAccount) {
            this.putQueryParameter("RemoveAccount", removeAccount);
            this.removeAccount = removeAccount;
            return this;
        }

        @Override
        public ModifyImagePermissionRequest build() {
            return new ModifyImagePermissionRequest(this);
        } 

    } 

}
