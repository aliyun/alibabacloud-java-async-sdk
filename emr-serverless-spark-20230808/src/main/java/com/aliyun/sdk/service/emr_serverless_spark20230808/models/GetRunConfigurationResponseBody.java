// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetRunConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunConfigurationResponseBody</p>
 */
public class GetRunConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runConfiguration")
    private RunConfiguration runConfiguration;

    private GetRunConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.runConfiguration = builder.runConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runConfiguration
     */
    public RunConfiguration getRunConfiguration() {
        return this.runConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private RunConfiguration runConfiguration; 

        private Builder() {
        } 

        private Builder(GetRunConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.runConfiguration = model.runConfiguration;
        } 

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * runConfiguration.
         */
        public Builder runConfiguration(RunConfiguration runConfiguration) {
            this.runConfiguration = runConfiguration;
            return this;
        }

        public GetRunConfigurationResponseBody build() {
            return new GetRunConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRunConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunConfigurationResponseBody</p>
     */
    public static class ApplicationConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("configItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("configItemValue")
        private String configItemValue;

        private ApplicationConfigs(Builder builder) {
            this.configFileName = builder.configFileName;
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationConfigs create() {
            return builder().build();
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return configItemKey
         */
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        /**
         * @return configItemValue
         */
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public static final class Builder {
            private String configFileName; 
            private String configItemKey; 
            private String configItemValue; 

            private Builder() {
            } 

            private Builder(ApplicationConfigs model) {
                this.configFileName = model.configFileName;
                this.configItemKey = model.configItemKey;
                this.configItemValue = model.configItemValue;
            } 

            /**
             * <p>应用配置文件名。 应用配置文件名。 <code>spark-defaults.conf</code></p>
             * 
             * <strong>example:</strong>
             * <p>spark-defaults.conf</p>
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * <p>配置项键。 配置项键。 <code>dfs.namenode.checkpoint.period</code></p>
             * 
             * <strong>example:</strong>
             * <p>spark.driver.cores</p>
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * <p>配置项值。 配置项值。 <code>3600s</code></p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public ApplicationConfigs build() {
                return new ApplicationConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRunConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunConfigurationResponseBody</p>
     */
    public static class LogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        @com.aliyun.core.annotation.NameInMap("LogPath")
        private String logPath;

        private LogConfig(Builder builder) {
            this.logLevel = builder.logLevel;
            this.logPath = builder.logPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        public static final class Builder {
            private String logLevel; 
            private String logPath; 

            private Builder() {
            } 

            private Builder(LogConfig model) {
                this.logLevel = model.logLevel;
                this.logPath = model.logPath;
            } 

            /**
             * LogLevel.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * LogPath.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRunConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunConfigurationResponseBody</p>
     */
    public static class RunConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationConfigs")
        private java.util.List<ApplicationConfigs> applicationConfigs;

        @com.aliyun.core.annotation.NameInMap("logConfig")
        private LogConfig logConfig;

        @com.aliyun.core.annotation.NameInMap("runtimeConfigs")
        private java.util.List<Tag> runtimeConfigs;

        private RunConfiguration(Builder builder) {
            this.applicationConfigs = builder.applicationConfigs;
            this.logConfig = builder.logConfig;
            this.runtimeConfigs = builder.runtimeConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunConfiguration create() {
            return builder().build();
        }

        /**
         * @return applicationConfigs
         */
        public java.util.List<ApplicationConfigs> getApplicationConfigs() {
            return this.applicationConfigs;
        }

        /**
         * @return logConfig
         */
        public LogConfig getLogConfig() {
            return this.logConfig;
        }

        /**
         * @return runtimeConfigs
         */
        public java.util.List<Tag> getRuntimeConfigs() {
            return this.runtimeConfigs;
        }

        public static final class Builder {
            private java.util.List<ApplicationConfigs> applicationConfigs; 
            private LogConfig logConfig; 
            private java.util.List<Tag> runtimeConfigs; 

            private Builder() {
            } 

            private Builder(RunConfiguration model) {
                this.applicationConfigs = model.applicationConfigs;
                this.logConfig = model.logConfig;
                this.runtimeConfigs = model.runtimeConfigs;
            } 

            /**
             * <p>应用配置项</p>
             */
            public Builder applicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
                this.applicationConfigs = applicationConfigs;
                return this;
            }

            /**
             * logConfig.
             */
            public Builder logConfig(LogConfig logConfig) {
                this.logConfig = logConfig;
                return this;
            }

            /**
             * <p>运行配置。</p>
             */
            public Builder runtimeConfigs(java.util.List<Tag> runtimeConfigs) {
                this.runtimeConfigs = runtimeConfigs;
                return this;
            }

            public RunConfiguration build() {
                return new RunConfiguration(this);
            } 

        } 

    }
}
