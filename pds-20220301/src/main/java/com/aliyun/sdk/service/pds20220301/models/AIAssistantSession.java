// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantSession} extends {@link TeaModel}
 *
 * <p>AIAssistantSession</p>
 */
public class AIAssistantSession extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("client_id")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("custom_labels")
    private java.util.List < String > customLabels;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("expired_at")
    private Long expiredAt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("session_id")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private AIAssistantSession(Builder builder) {
        this.clientId = builder.clientId;
        this.createdAt = builder.createdAt;
        this.customLabels = builder.customLabels;
        this.domainId = builder.domainId;
        this.expiredAt = builder.expiredAt;
        this.name = builder.name;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantSession create() {
        return builder().build();
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return customLabels
     */
    public java.util.List < String > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return expiredAt
     */
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String clientId; 
        private Long createdAt; 
        private java.util.List < String > customLabels; 
        private String domainId; 
        private Long expiredAt; 
        private String name; 
        private String sessionId; 
        private String status; 
        private Long updatedAt; 
        private String userId; 

        /**
         * client_id.
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * custom_labels.
         */
        public Builder customLabels(java.util.List < String > customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * expired_at.
         */
        public Builder expiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * session_id.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AIAssistantSession build() {
            return new AIAssistantSession(this);
        } 

    } 

}
