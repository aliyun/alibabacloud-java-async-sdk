// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateUserKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateUserKeyRequest</p>
 */
public class CreateUserKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("publicKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private CreateUserKeyRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.expireTime = builder.expireTime;
        this.keyScope = builder.keyScope;
        this.publicKey = builder.publicKey;
        this.title = builder.title;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return keyScope
     */
    public String getKeyScope() {
        return this.keyScope;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateUserKeyRequest, Builder> {
        private String accessToken; 
        private String expireTime; 
        private String keyScope; 
        private String publicKey; 
        private String title; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserKeyRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.expireTime = request.expireTime;
            this.keyScope = request.keyScope;
            this.publicKey = request.publicKey;
            this.title = request.title;
            this.organizationId = request.organizationId;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("expireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder keyScope(String keyScope) {
            this.putBodyParameter("keyScope", keyScope);
            this.keyScope = keyScope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder publicKey(String publicKey) {
            this.putBodyParameter("publicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH Title</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public CreateUserKeyRequest build() {
            return new CreateUserKeyRequest(this);
        } 

    } 

}
