// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GetOAuthAuthorizationSessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetOAuthAuthorizationSessionResponseBody</p>
 */
public class GetOAuthAuthorizationSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authenticationTokenId")
    private String authenticationTokenId;

    @com.aliyun.core.annotation.NameInMap("authorizationUrl")
    private String authorizationUrl;

    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("consumerType")
    private String consumerType;

    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("creatorType")
    private String creatorType;

    @com.aliyun.core.annotation.NameInMap("credentialProviderIdentifier")
    private String credentialProviderIdentifier;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorDescription")
    private String errorDescription;

    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private Long expirationTime;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionStatus")
    private String sessionStatus;

    @com.aliyun.core.annotation.NameInMap("sessionUri")
    private String sessionUri;

    private GetOAuthAuthorizationSessionResponseBody(Builder builder) {
        this.authenticationTokenId = builder.authenticationTokenId;
        this.authorizationUrl = builder.authorizationUrl;
        this.consumerId = builder.consumerId;
        this.consumerType = builder.consumerType;
        this.creatorId = builder.creatorId;
        this.creatorType = builder.creatorType;
        this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
        this.errorCode = builder.errorCode;
        this.errorDescription = builder.errorDescription;
        this.expirationTime = builder.expirationTime;
        this.instanceId = builder.instanceId;
        this.sessionId = builder.sessionId;
        this.sessionStatus = builder.sessionStatus;
        this.sessionUri = builder.sessionUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOAuthAuthorizationSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationTokenId
     */
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    /**
     * @return authorizationUrl
     */
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return consumerType
     */
    public String getConsumerType() {
        return this.consumerType;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return creatorType
     */
    public String getCreatorType() {
        return this.creatorType;
    }

    /**
     * @return credentialProviderIdentifier
     */
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorDescription
     */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return sessionUri
     */
    public String getSessionUri() {
        return this.sessionUri;
    }

    public static final class Builder {
        private String authenticationTokenId; 
        private String authorizationUrl; 
        private String consumerId; 
        private String consumerType; 
        private String creatorId; 
        private String creatorType; 
        private String credentialProviderIdentifier; 
        private String errorCode; 
        private String errorDescription; 
        private Long expirationTime; 
        private String instanceId; 
        private String sessionId; 
        private String sessionStatus; 
        private String sessionUri; 

        private Builder() {
        } 

        private Builder(GetOAuthAuthorizationSessionResponseBody model) {
            this.authenticationTokenId = model.authenticationTokenId;
            this.authorizationUrl = model.authorizationUrl;
            this.consumerId = model.consumerId;
            this.consumerType = model.consumerType;
            this.creatorId = model.creatorId;
            this.creatorType = model.creatorType;
            this.credentialProviderIdentifier = model.credentialProviderIdentifier;
            this.errorCode = model.errorCode;
            this.errorDescription = model.errorDescription;
            this.expirationTime = model.expirationTime;
            this.instanceId = model.instanceId;
            this.sessionId = model.sessionId;
            this.sessionStatus = model.sessionStatus;
            this.sessionUri = model.sessionUri;
        } 

        /**
         * authenticationTokenId.
         */
        public Builder authenticationTokenId(String authenticationTokenId) {
            this.authenticationTokenId = authenticationTokenId;
            return this;
        }

        /**
         * authorizationUrl.
         */
        public Builder authorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * consumerType.
         */
        public Builder consumerType(String consumerType) {
            this.consumerType = consumerType;
            return this;
        }

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * creatorType.
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * credentialProviderIdentifier.
         */
        public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorDescription.
         */
        public Builder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }

        /**
         * expirationTime.
         */
        public Builder expirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * sessionStatus.
         */
        public Builder sessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * sessionUri.
         */
        public Builder sessionUri(String sessionUri) {
            this.sessionUri = sessionUri;
            return this;
        }

        public GetOAuthAuthorizationSessionResponseBody build() {
            return new GetOAuthAuthorizationSessionResponseBody(this);
        } 

    } 

}
