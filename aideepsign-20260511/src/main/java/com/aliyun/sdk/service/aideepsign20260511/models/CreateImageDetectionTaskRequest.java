// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateImageDetectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageDetectionTaskRequest</p>
 */
public class CreateImageDetectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredType")
    private String credType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectType")
    private String detectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    private CreateImageDetectionTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.credType = builder.credType;
        this.detectType = builder.detectType;
        this.imageUrl = builder.imageUrl;
        this.objectKey = builder.objectKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageDetectionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return credType
     */
    public String getCredType() {
        return this.credType;
    }

    /**
     * @return detectType
     */
    public String getDetectType() {
        return this.detectType;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    public static final class Builder extends Request.Builder<CreateImageDetectionTaskRequest, Builder> {
        private String clientToken; 
        private String credType; 
        private String detectType; 
        private String imageUrl; 
        private String objectKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageDetectionTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.credType = request.credType;
            this.detectType = request.detectType;
            this.imageUrl = request.imageUrl;
            this.objectKey = request.objectKey;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CredType.
         */
        public Builder credType(String credType) {
            this.putQueryParameter("CredType", credType);
            this.credType = credType;
            return this;
        }

        /**
         * DetectType.
         */
        public Builder detectType(String detectType) {
            this.putQueryParameter("DetectType", detectType);
            this.detectType = detectType;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * ObjectKey.
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
            return this;
        }

        @Override
        public CreateImageDetectionTaskRequest build() {
            return new CreateImageDetectionTaskRequest(this);
        } 

    } 

}
