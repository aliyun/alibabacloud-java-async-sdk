// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BrowserSessionOut} extends {@link TeaModel}
 *
 * <p>BrowserSessionOut</p>
 */
public class BrowserSessionOut extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("browserId")
    private String browserId;

    @com.aliyun.core.annotation.NameInMap("browserName")
    private String browserName;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
    private Integer sessionIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private BrowserSessionOut(Builder builder) {
        this.browserId = builder.browserId;
        this.browserName = builder.browserName;
        this.createdAt = builder.createdAt;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.sessionId = builder.sessionId;
        this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserSessionOut create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserId
     */
    public String getBrowserId() {
        return this.browserId;
    }

    /**
     * @return browserName
     */
    public String getBrowserName() {
        return this.browserName;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionIdleTimeoutSeconds
     */
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String browserId; 
        private String browserName; 
        private String createdAt; 
        private String lastUpdatedAt; 
        private String sessionId; 
        private Integer sessionIdleTimeoutSeconds; 
        private String status; 

        private Builder() {
        } 

        private Builder(BrowserSessionOut model) {
            this.browserId = model.browserId;
            this.browserName = model.browserName;
            this.createdAt = model.createdAt;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.sessionId = model.sessionId;
            this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
            this.status = model.status;
        } 

        /**
         * browserId.
         */
        public Builder browserId(String browserId) {
            this.browserId = browserId;
            return this;
        }

        /**
         * browserName.
         */
        public Builder browserName(String browserName) {
            this.browserName = browserName;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>会话空闲超时时间，单位为秒</p>
         */
        public Builder sessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public BrowserSessionOut build() {
            return new BrowserSessionOut(this);
        } 

    } 

}
