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

        private Builder(ModifyImageSharePermissionRequest response) {
            super(response);
            this.addAccounts = response.addAccounts;
            this.imageId = response.imageId;
            this.removeAccounts = response.removeAccounts;
        } 

        /**
         * AddAccounts.
         */
        public Builder addAccounts(String addAccounts) {
            this.putQueryParameter("AddAccounts", addAccounts);
            this.addAccounts = addAccounts;
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
         * RemoveAccounts.
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
