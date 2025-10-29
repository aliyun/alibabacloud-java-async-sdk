// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link UploadAICPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>UploadAICPublicKeyRequest</p>
 */
public class UploadAICPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyGroup")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String keyGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 8)
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyType;

    private UploadAICPublicKeyRequest(Builder builder) {
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

    public static UploadAICPublicKeyRequest create() {
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

    public static final class Builder extends Request.Builder<UploadAICPublicKeyRequest, Builder> {
        private String content; 
        private String description; 
        private String keyGroup; 
        private String keyName; 
        private String keyType; 

        private Builder() {
            super();
        } 

        private Builder(UploadAICPublicKeyRequest request) {
            super(request);
            this.content = request.content;
            this.description = request.description;
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
            this.keyType = request.keyType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_dffeb6610035dcb77b413a59c3</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adb</p>
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        @Override
        public UploadAICPublicKeyRequest build() {
            return new UploadAICPublicKeyRequest(this);
        } 

    } 

}
