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
 * {@link TimedResidentResourcePoolApplication} extends {@link TeaModel}
 *
 * <p>TimedResidentResourcePoolApplication</p>
 */
public class TimedResidentResourcePoolApplication extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("operationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("timedPoolId")
    private String timedPoolId;

    private TimedResidentResourcePoolApplication(Builder builder) {
        this.accountId = builder.accountId;
        this.content = builder.content;
        this.createdTime = builder.createdTime;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.operationType = builder.operationType;
        this.status = builder.status;
        this.timedPoolId = builder.timedPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimedResidentResourcePoolApplication create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return timedPoolId
     */
    public String getTimedPoolId() {
        return this.timedPoolId;
    }

    public static final class Builder {
        private String accountId; 
        private String content; 
        private String createdTime; 
        private String lastModifiedTime; 
        private String operationType; 
        private String status; 
        private String timedPoolId; 

        private Builder() {
        } 

        private Builder(TimedResidentResourcePoolApplication model) {
            this.accountId = model.accountId;
            this.content = model.content;
            this.createdTime = model.createdTime;
            this.lastModifiedTime = model.lastModifiedTime;
            this.operationType = model.operationType;
            this.status = model.status;
            this.timedPoolId = model.timedPoolId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * operationType.
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
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
         * timedPoolId.
         */
        public Builder timedPoolId(String timedPoolId) {
            this.timedPoolId = timedPoolId;
            return this;
        }

        public TimedResidentResourcePoolApplication build() {
            return new TimedResidentResourcePoolApplication(this);
        } 

    } 

}
