// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    private String logstore;

    @NameInMap("project")
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
         * <p>开启实例级别指标</p>
         */
        public Builder enableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }

        /**
         * <p>开启请求级别指标</p>
         */
        public Builder enableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }

        /**
         * <p>日志切分规则</p>
         */
        public Builder logBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }

        /**
         * <p>日志库</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>日志项目</p>
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
