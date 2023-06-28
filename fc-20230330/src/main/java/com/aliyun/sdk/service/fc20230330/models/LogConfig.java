// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogConfig} extends {@link TeaModel}
 *
 * <p>LogConfig</p>
 */
public class LogConfig extends TeaModel {
    @NameInMap("enableInstanceMetrics")
    private Boolean enableInstanceMetrics;

    @NameInMap("enableRequestMetrics")
    private Boolean enableRequestMetrics;

    @NameInMap("logBeginRule")
    private String logBeginRule;

    @NameInMap("logstore")
    @Validation(maxLength = 63)
    private String logstore;

    @NameInMap("project")
    @Validation(maxLength = 63)
    private String project;

    private LogConfig(Builder builder) {
        this.enableInstanceMetrics = builder.enableInstanceMetrics;
        this.enableRequestMetrics = builder.enableRequestMetrics;
        this.logBeginRule = builder.logBeginRule;
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogConfig create() {
        return builder().build();
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

    public static final class Builder {
        private Boolean enableInstanceMetrics; 
        private Boolean enableRequestMetrics; 
        private String logBeginRule; 
        private String logstore; 
        private String project; 

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

        public LogConfig build() {
            return new LogConfig(this);
        } 

    } 

}
