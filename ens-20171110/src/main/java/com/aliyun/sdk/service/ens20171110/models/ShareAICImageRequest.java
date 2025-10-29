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
 * {@link ShareAICImageRequest} extends {@link RequestModel}
 *
 * <p>ShareAICImageRequest</p>
 */
public class ShareAICImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> users;

    private ShareAICImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareAICImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<ShareAICImageRequest, Builder> {
        private String imageId; 
        private java.util.List<String> users; 

        private Builder() {
            super();
        } 

        private Builder(ShareAICImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.users = request.users;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder users(java.util.List<String> users) {
            String usersShrink = shrink(users, "Users", "json");
            this.putQueryParameter("Users", usersShrink);
            this.users = users;
            return this;
        }

        @Override
        public ShareAICImageRequest build() {
            return new ShareAICImageRequest(this);
        } 

    } 

}
