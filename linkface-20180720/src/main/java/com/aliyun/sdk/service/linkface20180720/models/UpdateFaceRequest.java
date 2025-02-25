// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link UpdateFaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceRequest</p>
 */
public class UpdateFaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private String userInfo;

    private UpdateFaceRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
        this.userId = builder.userId;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userInfo
     */
    public String getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<UpdateFaceRequest, Builder> {
        private String image; 
        private String userId; 
        private String userInfo; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaceRequest request) {
            super(request);
            this.image = request.image;
            this.userId = request.userId;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun1</p>
         */
        public Builder image(String image) {
            this.putBodyParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>base64picdata</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(String userInfo) {
            this.putBodyParameter("UserInfo", userInfo);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public UpdateFaceRequest build() {
            return new UpdateFaceRequest(this);
        } 

    } 

}
