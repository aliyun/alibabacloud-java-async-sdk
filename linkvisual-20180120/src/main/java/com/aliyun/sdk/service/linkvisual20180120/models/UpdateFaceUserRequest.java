// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaceUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceUserRequest</p>
 */
public class UpdateFaceUserRequest extends Request {
    @Query
    @NameInMap("CustomUserId")
    private String customUserId;

    @Query
    @NameInMap("FacePicUrl")
    private String facePicUrl;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private UpdateFaceUserRequest(Builder builder) {
        super(builder);
        this.customUserId = builder.customUserId;
        this.facePicUrl = builder.facePicUrl;
        this.isolationId = builder.isolationId;
        this.name = builder.name;
        this.params = builder.params;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaceUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customUserId
     */
    public String getCustomUserId() {
        return this.customUserId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateFaceUserRequest, Builder> {
        private String customUserId; 
        private String facePicUrl; 
        private String isolationId; 
        private String name; 
        private String params; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaceUserRequest response) {
            super(response);
            this.customUserId = response.customUserId;
            this.facePicUrl = response.facePicUrl;
            this.isolationId = response.isolationId;
            this.name = response.name;
            this.params = response.params;
            this.userId = response.userId;
        } 

        /**
         * CustomUserId.
         */
        public Builder customUserId(String customUserId) {
            this.putQueryParameter("CustomUserId", customUserId);
            this.customUserId = customUserId;
            return this;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
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
        public UpdateFaceUserRequest build() {
            return new UpdateFaceUserRequest(this);
        } 

    } 

}
