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
 * {@link LogConfig} extends {@link TeaModel}
 *
 * <p>LogConfig</p>
 */
public class LogConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableInstanceMetrics")
    private Boolean enableInstanceMetrics;

    @com.aliyun.core.annotation.NameInMap("enableLlmMetrics")
    private Boolean enableLlmMetrics;

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

    private LogConfig(Builder builder) {
        this.enableInstanceMetrics = builder.enableInstanceMetrics;
        this.enableLlmMetrics = builder.enableLlmMetrics;
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
     * @return enableLlmMetrics
     */
    public Boolean getEnableLlmMetrics() {
        return this.enableLlmMetrics;
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
        private Boolean enableLlmMetrics; 
        private Boolean enableRequestMetrics; 
        private String logBeginRule; 
        private String logstore; 
        private String project; 

        private Builder() {
        } 

        private Builder(LogConfig model) {
            this.enableInstanceMetrics = model.enableInstanceMetrics;
            this.enableLlmMetrics = model.enableLlmMetrics;
            this.enableRequestMetrics = model.enableRequestMetrics;
            this.logBeginRule = model.logBeginRule;
            this.logstore = model.logstore;
            this.project = model.project;
        } 

        /**
         * <p>Specifies whether to enable instance-level metrics. After you enable this feature, you can view core metrics such as CPU usage, memory usage, network status, and request count at the instance level. Valid values: false: disables instance-level metrics. This is the default value. true: enables instance-level metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }

        /**
         * <p>Specifies whether to enable LLM metrics. After you enable this feature, you can view LLM metrics. We recommend that you enable this feature only for LLM inference services. Valid values: false: disables LLM metrics. This is the default value. true: enables LLM metrics.</p>
         */
        public Builder enableLlmMetrics(Boolean enableLlmMetrics) {
            this.enableLlmMetrics = enableLlmMetrics;
            return this;
        }

        /**
         * <p>Specifies whether to enable request-level metrics. After you enable this feature, you can view the time and memory consumed by each invocation of all functions in the service. Valid values: false: disables request-level metrics. true: enables request-level metrics. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }

        /**
         * <p>The log line beginning matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultRegex</p>
         */
        public Builder logBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }

        /**
         * <p>The Logstore name in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The project name in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
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
