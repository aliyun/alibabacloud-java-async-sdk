// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link AddFaceUserPictureRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserPictureRequest</p>
 */
public class AddFaceUserPictureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePicUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String facePicUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private AddFaceUserPictureRequest(Builder builder) {
        super(builder);
        this.facePicUrl = builder.facePicUrl;
        this.isolationId = builder.isolationId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceUserPictureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return facePicUrl
     */
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddFaceUserPictureRequest, Builder> {
        private String facePicUrl; 
        private String isolationId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceUserPictureRequest request) {
            super(request);
            this.facePicUrl = request.facePicUrl;
            this.isolationId = request.isolationId;
            this.userId = request.userId;
        } 

        /**
         * <p>The download URL of the user\&quot;s face image. Only JPEG and JPG images are supported, and the image URL cannot contain Chinese characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/test.jpeg">https://example.com/test.jpeg</a></p>
         */
        public Builder facePicUrl(String facePicUrl) {
            this.putQueryParameter("FacePicUrl", facePicUrl);
            this.facePicUrl = facePicUrl;
            return this;
        }

        /**
         * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Keep this value consistent with the <strong>IsolationId</strong> set when calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> API operation to add a user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The user ID. Pass in the <strong>UserId</strong> value that was obtained and saved locally after calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> API operation to add a user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3mtjaqebeq4d****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddFaceUserPictureRequest build() {
            return new AddFaceUserPictureRequest(this);
        } 

    } 

}
