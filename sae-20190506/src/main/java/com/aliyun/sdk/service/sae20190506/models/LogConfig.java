// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link LogConfig} extends {@link TeaModel}
 *
 * <p>LogConfig</p>
 */
public class LogConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableInstanceMetrics")
    private Boolean enableInstanceMetrics;

    @com.aliyun.core.annotation.NameInMap("enableRequestMetrics")
    private Boolean enableRequestMetrics;

    @com.aliyun.core.annotation.NameInMap("logBeginRule")
    private String logBeginRule;

    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(maxLength = 63)
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(maxLength = 63)
    private String project;

    @com.aliyun.core.annotation.NameInMap("pushToUserSLS")
    private Boolean pushToUserSLS;

    private LogConfig(Builder builder) {
        this.enableInstanceMetrics = builder.enableInstanceMetrics;
        this.enableRequestMetrics = builder.enableRequestMetrics;
        this.logBeginRule = builder.logBeginRule;
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.pushToUserSLS = builder.pushToUserSLS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableInstanceMetrics
     */
    public Boolean getEnableInstanceMetrics() {
        return this.enableInstanceMetrics;
    }

    /**
     * @return enableRequestMetrics
     */
    public Boolean getEnableRequestMetrics() {
        return this.enableRequestMetrics;
    }

    /**
     * @return logBeginRule
     */
    public String getLogBeginRule() {
        return this.logBeginRule;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return pushToUserSLS
     */
    public Boolean getPushToUserSLS() {
        return this.pushToUserSLS;
    }

    public static final class Builder {
        private Boolean enableInstanceMetrics; 
        private Boolean enableRequestMetrics; 
        private String logBeginRule; 
        private String logstore; 
        private String project; 
        private Boolean pushToUserSLS; 

        private Builder() {
        } 

        private Builder(LogConfig model) {
            this.enableInstanceMetrics = model.enableInstanceMetrics;
            this.enableRequestMetrics = model.enableRequestMetrics;
            this.logBeginRule = model.logBeginRule;
            this.logstore = model.logstore;
            this.project = model.project;
            this.pushToUserSLS = model.pushToUserSLS;
        } 

        /**
         * enableInstanceMetrics.
         */
        public Builder enableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }

        /**
         * enableRequestMetrics.
         */
        public Builder enableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }

        /**
         * logBeginRule.
         */
        public Builder logBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * pushToUserSLS.
         */
        public Builder pushToUserSLS(Boolean pushToUserSLS) {
            this.pushToUserSLS = pushToUserSLS;
            return this;
        }

        public LogConfig build() {
            return new LogConfig(this);
        } 

    } 

}
