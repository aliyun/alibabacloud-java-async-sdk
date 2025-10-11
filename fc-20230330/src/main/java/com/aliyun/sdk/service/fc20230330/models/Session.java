// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Session} extends {@link TeaModel}
 *
 * <p>Session</p>
 */
public class Session extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("containerId")
    private String containerId;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("sessionAffinityType")
    private String sessionAffinityType;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutInSeconds")
    private Long sessionIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sessionStatus")
    private String sessionStatus;

    @com.aliyun.core.annotation.NameInMap("sessionTTLInSeconds")
    private Long sessionTTLInSeconds;

    private Session(Builder builder) {
        this.containerId = builder.containerId;
        this.createdTime = builder.createdTime;
        this.functionName = builder.functionName;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.nasConfig = builder.nasConfig;
        this.qualifier = builder.qualifier;
        this.sessionAffinityType = builder.sessionAffinityType;
        this.sessionId = builder.sessionId;
        this.sessionIdleTimeoutInSeconds = builder.sessionIdleTimeoutInSeconds;
        this.sessionStatus = builder.sessionStatus;
        this.sessionTTLInSeconds = builder.sessionTTLInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Session create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sessionAffinityType
     */
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionIdleTimeoutInSeconds
     */
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return sessionTTLInSeconds
     */
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

    public static final class Builder {
        private String containerId; 
        private String createdTime; 
        private String functionName; 
        private String lastModifiedTime; 
        private NASConfig nasConfig; 
        private String qualifier; 
        private String sessionAffinityType; 
        private String sessionId; 
        private Long sessionIdleTimeoutInSeconds; 
        private String sessionStatus; 
        private Long sessionTTLInSeconds; 

        private Builder() {
        } 

        private Builder(Session model) {
            this.containerId = model.containerId;
            this.createdTime = model.createdTime;
            this.functionName = model.functionName;
            this.lastModifiedTime = model.lastModifiedTime;
            this.nasConfig = model.nasConfig;
            this.qualifier = model.qualifier;
            this.sessionAffinityType = model.sessionAffinityType;
            this.sessionId = model.sessionId;
            this.sessionIdleTimeoutInSeconds = model.sessionIdleTimeoutInSeconds;
            this.sessionStatus = model.sessionStatus;
            this.sessionTTLInSeconds = model.sessionTTLInSeconds;
        } 

        /**
         * containerId.
         */
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * sessionAffinityType.
         */
        public Builder sessionAffinityType(String sessionAffinityType) {
            this.sessionAffinityType = sessionAffinityType;
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
         * sessionIdleTimeoutInSeconds.
         */
        public Builder sessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
            this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
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
         * sessionTTLInSeconds.
         */
        public Builder sessionTTLInSeconds(Long sessionTTLInSeconds) {
            this.sessionTTLInSeconds = sessionTTLInSeconds;
            return this;
        }

        public Session build() {
            return new Session(this);
        } 

    } 

}
