// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserRequest</p>
 */
public class AddFaceUserRequest extends Request {
    @Query
    @NameInMap("CustomUserId")
    @Validation(required = true)
    private String customUserId;

    @Query
    @NameInMap("FacePicUrl")
    @Validation(required = true)
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

    private AddFaceUserRequest(Builder builder) {
        super(builder);
        this.customUserId = builder.customUserId;
        this.facePicUrl = builder.facePicUrl;
        this.isolationId = builder.isolationId;
        this.name = builder.name;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceUserRequest create() {
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

    public static final class Builder extends Request.Builder<AddFaceUserRequest, Builder> {
        private String customUserId; 
        private String facePicUrl; 
        private String isolationId; 
        private String name; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceUserRequest request) {
            super(request);
            this.customUserId = request.customUserId;
            this.facePicUrl = request.facePicUrl;
            this.isolationId = request.isolationId;
            this.name = request.name;
            this.params = request.params;
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

        @Override
        public AddFaceUserRequest build() {
            return new AddFaceUserRequest(this);
        } 

    } 

}
