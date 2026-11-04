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
 * {@link UpdateFaceUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceUserRequest</p>
 */
public class UpdateFaceUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomUserId")
    private String customUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePicUrl")
    private String facePicUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(UpdateFaceUserRequest request) {
            super(request);
            this.customUserId = request.customUserId;
            this.facePicUrl = request.facePicUrl;
            this.isolationId = request.isolationId;
            this.name = request.name;
            this.params = request.params;
            this.userId = request.userId;
        } 

        /**
         * <p>The unique ID of the user in the caller\&quot;s business system, such as an ID card number or student ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52242819650301xxxx</p>
         */
        public Builder customUserId(String customUserId) {
            this.putQueryParameter("CustomUserId", customUserId);
            this.customUserId = customUserId;
            return this;
        }

        /**
         * <p>The image download URL. Currently, JPG and JPEG formats are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.com/test.jpg">https://test.com/test.jpg</a></p>
         */
        public Builder facePicUrl(String facePicUrl) {
            this.putQueryParameter("FacePicUrl", facePicUrl);
            this.facePicUrl = facePicUrl;
            return this;
        }

        /**
         * <p>The isolation ID.<br>It is used for data isolation between different applications under a tenant. For example, if a user has business operations in both Zhejiang and Shaanxi, you can create two isolation IDs for the operations in Zhejiang and Xi\&quot;an respectively.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestIsolati****</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>ZhangSan</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The user information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;age&quot;:28, &quot;sex&quot;:&quot;male&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tibce3fsgqel****</p>
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
