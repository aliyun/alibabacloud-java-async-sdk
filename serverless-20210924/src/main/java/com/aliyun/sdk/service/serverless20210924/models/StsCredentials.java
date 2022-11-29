// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StsCredentials} extends {@link TeaModel}
 *
 * <p>StsCredentials</p>
 */
public class StsCredentials extends TeaModel {
    @NameInMap("accessKeyId")
    private String accessKeyId;

    @NameInMap("expirationTime")
    private String expirationTime;

    @NameInMap("kind")
    private String kind;

    @NameInMap("secretAccessKey")
    private String secretAccessKey;

    @NameInMap("token")
    private String token;

    private StsCredentials(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.expirationTime = builder.expirationTime;
        this.kind = builder.kind;
        this.secretAccessKey = builder.secretAccessKey;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StsCredentials create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return expirationTime
     */
    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return secretAccessKey
     */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String expirationTime; 
        private String kind; 
        private String secretAccessKey; 
        private String token; 

        /**
         * Access key ID
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * Expiration time of the credentials
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * The kind of the credentials
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Secret access key
         */
        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * Token
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public StsCredentials build() {
            return new StsCredentials(this);
        } 

    } 

}
