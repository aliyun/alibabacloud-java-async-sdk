// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GenerateYikeLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateYikeLoginTokenResponseBody</p>
 */
public class GenerateYikeLoginTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GenerateYikeLoginTokenResponseBody(Builder builder) {
        this.expiresAt = builder.expiresAt;
        this.requestId = builder.requestId;
        this.token = builder.token;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateYikeLoginTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String expiresAt; 
        private String requestId; 
        private String token; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GenerateYikeLoginTokenResponseBody model) {
            this.expiresAt = model.expiresAt;
            this.requestId = model.requestId;
            this.token = model.token;
            this.userId = model.userId;
        } 

        /**
         * ExpiresAt.
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GenerateYikeLoginTokenResponseBody build() {
            return new GenerateYikeLoginTokenResponseBody(this);
        } 

    } 

}
