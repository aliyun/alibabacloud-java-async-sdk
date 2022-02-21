// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserPictureRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserPictureRequest</p>
 */
public class AddFaceUserPictureRequest extends Request {
    @Query
    @NameInMap("FacePicUrl")
    @Validation(required = true)
    private String facePicUrl;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
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

        private Builder(AddFaceUserPictureRequest response) {
            super(response);
            this.facePicUrl = response.facePicUrl;
            this.isolationId = response.isolationId;
            this.userId = response.userId;
        } 

        /**
         * FacePicUrl.
         */
        public Builder facePicUrl(String facePicUrl) {
            this.putQueryParameter("FacePicUrl", facePicUrl);
            this.facePicUrl = facePicUrl;
            return this;
        }

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * UserId.
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
