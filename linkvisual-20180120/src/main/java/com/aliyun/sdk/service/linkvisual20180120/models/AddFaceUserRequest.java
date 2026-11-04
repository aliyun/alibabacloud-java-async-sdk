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
 * {@link AddFaceUserRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserRequest</p>
 */
public class AddFaceUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePicUrl")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The user identification ID. It supports any uppercase letter and digits. Recommended Settings: the user\&quot;s ID card number, student ID, or similar identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder customUserId(String customUserId) {
            this.putQueryParameter("CustomUserId", customUserId);
            this.customUserId = customUserId;
            return this;
        }

        /**
         * <p>The URL for downloading the user\&quot;s face image. Only JPEG and JPG image formats are supported, and the image URL cannot contain Chinese characters.</p>
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
         * <p>The business isolation ID. It is used for data isolation between different business applications under the same Alibaba Cloud account. It supports uppercase and lowercase English letters and digits.</p>
         * <p>For example, if you have face recognition businesses in Region A and Region B, you can set different business isolation IDs to distinguish the face recognition businesses in Region A and Region B.</p>
         * <blockquote>
         * <p>Notice: 
         * Save the business isolation ID properly for use in subsequent calls to other API operations in this business isolation zone.</p>
         * </blockquote>
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
         * <p>The username. It supports Chinese characters, uppercase and lowercase English letters, digits, underscores (_), and hyphens (-). The length cannot exceed 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Tony</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The custom user parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;:&quot;value2&quot;}</p>
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
