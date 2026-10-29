// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyType")
    private String keyType;

    private UploadPublicKeyRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.description = builder.description;
        this.keyGroup = builder.keyGroup;
        this.keyName = builder.keyName;
        this.keyType = builder.keyType;
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

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    public static final class Builder extends Request.Builder<UploadPublicKeyRequest, Builder> {
        private String content; 
        private String description; 
        private String keyGroup; 
        private String keyName; 
        private String keyType; 

        private Builder() {
            super();
        } 

        private Builder(UploadPublicKeyRequest request) {
            super(request);
            this.content = request.content;
            this.description = request.description;
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
            this.keyType = request.keyType;
        } 

        /**
         * <p>The encoded content of the public key. The default encoding format is Base64.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_dffeb6610035dcb77b413a59c3*****</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The description of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>For testing purposes</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The group of the public key. Used for public key management.
         * Naming conventions:</p>
         * <ol>
         * <li>The length must be 0 to 255 characters.</li>
         * <li>The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
         * <li>The first character must be a letter or a digit.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>g-test</p>
         */
        public Builder keyGroup(String keyGroup) {
            this.putQueryParameter("KeyGroup", keyGroup);
            this.keyGroup = keyGroup;
            return this;
        }

        /**
         * <p>The name of the public key. The name must be unique.
         * Naming conventions:</p>
         * <ol>
         * <li>The length must be 8 to 255 characters.</li>
         * <li>The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
         * <li>The first character must be a letter or a digit.</li>
         * <li>The prefix cannot be &quot;group-&quot;.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey-v1.0</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>The type of the public key. Valid values:</p>
         * <ul>
         * <li><strong>adb</strong>: ADB key.</li>
         * <li><strong>ssh</strong>: SSH key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ssh</p>
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        @Override
        public UploadPublicKeyRequest build() {
            return new UploadPublicKeyRequest(this);
        } 

    } 

}
