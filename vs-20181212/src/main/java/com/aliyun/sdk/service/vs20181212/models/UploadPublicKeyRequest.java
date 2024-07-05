// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>UploadPublicKeyRequest</p>
 */
public class UploadPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyGroup")
    private String keyGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 8)
    private String keyName;

    private UploadPublicKeyRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.description = builder.description;
        this.keyGroup = builder.keyGroup;
        this.keyName = builder.keyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPublicKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return keyGroup
     */
    public String getKeyGroup() {
        return this.keyGroup;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    public static final class Builder extends Request.Builder<UploadPublicKeyRequest, Builder> {
        private String content; 
        private String description; 
        private String keyGroup; 
        private String keyName; 

        private Builder() {
            super();
        } 

        private Builder(UploadPublicKeyRequest request) {
            super(request);
            this.content = request.content;
            this.description = request.description;
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * KeyGroup.
         */
        public Builder keyGroup(String keyGroup) {
            this.putQueryParameter("KeyGroup", keyGroup);
            this.keyGroup = keyGroup;
            return this;
        }

        /**
         * KeyName.
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        @Override
        public UploadPublicKeyRequest build() {
            return new UploadPublicKeyRequest(this);
        } 

    } 

}
