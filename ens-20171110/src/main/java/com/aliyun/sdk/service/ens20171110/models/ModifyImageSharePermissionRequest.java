// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageSharePermissionRequest</p>
 */
public class ModifyImageSharePermissionRequest extends Request {
    @Query
    @NameInMap("AddAccounts")
    private String addAccounts;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("RemoveAccounts")
    private String removeAccounts;

    private ModifyImageSharePermissionRequest(Builder builder) {
        super(builder);
        this.addAccounts = builder.addAccounts;
        this.imageId = builder.imageId;
        this.removeAccounts = builder.removeAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageSharePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addAccounts
     */
    public String getAddAccounts() {
        return this.addAccounts;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return removeAccounts
     */
    public String getRemoveAccounts() {
        return this.removeAccounts;
    }

    public static final class Builder extends Request.Builder<ModifyImageSharePermissionRequest, Builder> {
        private String addAccounts; 
        private String imageId; 
        private String removeAccounts; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageSharePermissionRequest request) {
            super(request);
            this.addAccounts = request.addAccounts;
            this.imageId = request.imageId;
            this.removeAccounts = request.removeAccounts;
        } 

        /**
         * The ID of the Alibaba Cloud account with which you want to share the image. You can specify multiple Alibaba Cloud IDs. Separate multiple IDs with commas (,).
         */
        public Builder addAccounts(String addAccounts) {
            this.putQueryParameter("AddAccounts", addAccounts);
            this.addAccounts = addAccounts;
            return this;
        }

        /**
         * The ID of the image. You can specify only one image ID. Custom images and public images are supported.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account from which you want to unshare the image. You can specify only one Alibaba Cloud account ID.
         */
        public Builder removeAccounts(String removeAccounts) {
            this.putQueryParameter("RemoveAccounts", removeAccounts);
            this.removeAccounts = removeAccounts;
            return this;
        }

        @Override
        public ModifyImageSharePermissionRequest build() {
            return new ModifyImageSharePermissionRequest(this);
        } 

    } 

}
