// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyImageSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageSharePermissionRequest</p>
 */
public class ModifyImageSharePermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddAccounts")
    private String addAccounts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveAccounts")
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
         * <p>The ID of the Alibaba Cloud account with which you want to share the image. You can specify multiple Alibaba Cloud IDs. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1122334455**</p>
         */
        public Builder addAccounts(String addAccounts) {
            this.putQueryParameter("AddAccounts", addAccounts);
            this.addAccounts = addAccounts;
            return this;
        }

        /**
         * <p>The ID of the image. You can specify only one image ID. Custom images and public images are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5s7qotzavwbrnzaqh4unm****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account from which you want to unshare the image. You can specify only one Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>113355**</p>
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
