// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("SessionTitle")
    private String sessionTitle;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private Session(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModified = builder.gmtModified;
        this.ownerId = builder.ownerId;
        this.sessionId = builder.sessionId;
        this.sessionTitle = builder.sessionTitle;
        this.userId = builder.userId;
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionTitle
     */
    public String getSessionTitle() {
        return this.sessionTitle;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtModified; 
        private String ownerId; 
        private String sessionId; 
        private String sessionTitle; 
        private String userId; 

        private Builder() {
        } 

        private Builder(Session model) {
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModified = model.gmtModified;
            this.ownerId = model.ownerId;
            this.sessionId = model.sessionId;
            this.sessionTitle = model.sessionTitle;
            this.userId = model.userId;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SessionTitle.
         */
        public Builder sessionTitle(String sessionTitle) {
            this.sessionTitle = sessionTitle;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Session build() {
            return new Session(this);
        } 

    } 

}
