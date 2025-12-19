// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link CompleteResourceTokenAuthRequest} extends {@link RequestModel}
 *
 * <p>CompleteResourceTokenAuthRequest</p>
 */
public class CompleteResourceTokenAuthRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionURI")
    private String sessionURI;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdentifier")
    private UserIdentifier userIdentifier;

    private CompleteResourceTokenAuthRequest(Builder builder) {
        super(builder);
        this.sessionURI = builder.sessionURI;
        this.userIdentifier = builder.userIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteResourceTokenAuthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionURI
     */
    public String getSessionURI() {
        return this.sessionURI;
    }

    /**
     * @return userIdentifier
     */
    public UserIdentifier getUserIdentifier() {
        return this.userIdentifier;
    }

    public static final class Builder extends Request.Builder<CompleteResourceTokenAuthRequest, Builder> {
        private String sessionURI; 
        private UserIdentifier userIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CompleteResourceTokenAuthRequest request) {
            super(request);
            this.sessionURI = request.sessionURI;
            this.userIdentifier = request.userIdentifier;
        } 

        /**
         * SessionURI.
         */
        public Builder sessionURI(String sessionURI) {
            this.putBodyParameter("SessionURI", sessionURI);
            this.sessionURI = sessionURI;
            return this;
        }

        /**
         * UserIdentifier.
         */
        public Builder userIdentifier(UserIdentifier userIdentifier) {
            String userIdentifierShrink = shrink(userIdentifier, "UserIdentifier", "json");
            this.putBodyParameter("UserIdentifier", userIdentifierShrink);
            this.userIdentifier = userIdentifier;
            return this;
        }

        @Override
        public CompleteResourceTokenAuthRequest build() {
            return new CompleteResourceTokenAuthRequest(this);
        } 

    } 

    /**
     * 
     * {@link CompleteResourceTokenAuthRequest} extends {@link TeaModel}
     *
     * <p>CompleteResourceTokenAuthRequest</p>
     */
    public static class UserIdentifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserJWT")
        private String userJWT;

        private UserIdentifier(Builder builder) {
            this.userId = builder.userId;
            this.userJWT = builder.userJWT;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserIdentifier create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userJWT
         */
        public String getUserJWT() {
            return this.userJWT;
        }

        public static final class Builder {
            private String userId; 
            private String userJWT; 

            private Builder() {
            } 

            private Builder(UserIdentifier model) {
                this.userId = model.userId;
                this.userJWT = model.userJWT;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserJWT.
             */
            public Builder userJWT(String userJWT) {
                this.userJWT = userJWT;
                return this;
            }

            public UserIdentifier build() {
                return new UserIdentifier(this);
            } 

        } 

    }
}
