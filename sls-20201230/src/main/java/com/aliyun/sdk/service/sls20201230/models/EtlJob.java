// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EtlJob} extends {@link TeaModel}
 *
 * <p>EtlJob</p>
 */
public class EtlJob extends TeaModel {
    @NameInMap("enable")
    @Validation(required = true)
    private Boolean enable;

    @NameInMap("etlJobName")
    @Validation(required = true)
    private String etlJobName;

    @NameInMap("functionConfig")
    @Validation(required = true)
    private FunctionConfig functionConfig;

    @NameInMap("functionParameter")
    @Validation(required = true)
    private java.util.Map < String, ? > functionParameter;

    @NameInMap("logConfig")
    @Validation(required = true)
    private LogConfig logConfig;

    @NameInMap("sourceConfig")
    @Validation(required = true)
    private SourceConfig sourceConfig;

    @NameInMap("triggerConfig")
    @Validation(required = true)
    private TriggerConfig triggerConfig;

    private EtlJob(Builder builder) {
        this.enable = builder.enable;
        this.etlJobName = builder.etlJobName;
        this.functionConfig = builder.functionConfig;
        this.functionParameter = builder.functionParameter;
        this.logConfig = builder.logConfig;
        this.sourceConfig = builder.sourceConfig;
        this.triggerConfig = builder.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EtlJob create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return etlJobName
     */
    public String getEtlJobName() {
        return this.etlJobName;
    }

    /**
     * @return functionConfig
     */
    public FunctionConfig getFunctionConfig() {
        return this.functionConfig;
    }

    /**
     * @return functionParameter
     */
    public java.util.Map < String, ? > getFunctionParameter() {
        return this.functionParameter;
    }

    /**
     * @return logConfig
     */
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return sourceConfig
     */
    public SourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    /**
     * @return triggerConfig
     */
    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static final class Builder {
        private Boolean enable; 
        private String etlJobName; 
        private FunctionConfig functionConfig; 
        private java.util.Map < String, ? > functionParameter; 
        private LogConfig logConfig; 
        private SourceConfig sourceConfig; 
        private TriggerConfig triggerConfig; 

        /**
         * 是否启用
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * 任务名称
         */
        public Builder etlJobName(String etlJobName) {
            this.etlJobName = etlJobName;
            return this;
        }

        /**
         * 运行函数配置
         */
        public Builder functionConfig(FunctionConfig functionConfig) {
            this.functionConfig = functionConfig;
            return this;
        }

        /**
         * 参数列表
         */
        public Builder functionParameter(java.util.Map < String, ? > functionParameter) {
            this.functionParameter = functionParameter;
            return this;
        }

        /**
         * 日志配置
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * 配置数据来源
         */
        public Builder sourceConfig(SourceConfig sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }

        /**
         * 触发器配置
         */
        public Builder triggerConfig(TriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        public EtlJob build() {
            return new EtlJob(this);
        } 

    } 

    public static class FunctionConfig extends TeaModel {
        @NameInMap("accountId")
        private String accountId;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("functionName")
        private String functionName;

        @NameInMap("functionProvider")
        @Validation(required = true)
        private String functionProvider;

        @NameInMap("regionName")
        private String regionName;

        @NameInMap("roleArn")
        private String roleArn;

        @NameInMap("serviceName")
        private String serviceName;

        private FunctionConfig(Builder builder) {
            this.accountId = builder.accountId;
            this.endpoint = builder.endpoint;
            this.functionName = builder.functionName;
            this.functionProvider = builder.functionProvider;
            this.regionName = builder.regionName;
            this.roleArn = builder.roleArn;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionConfig create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return functionProvider
         */
        public String getFunctionProvider() {
            return this.functionProvider;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String accountId; 
            private String endpoint; 
            private String functionName; 
            private String functionProvider; 
            private String regionName; 
            private String roleArn; 
            private String serviceName; 

            /**
             * 账户 id
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * endpoint
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * 函数名
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * 函数 provider，可选值为 FunctionCompute 、CloudProdLogDispatch。当值为 FunctionCompute 时，endpoint、accountid 、regionName 、serviceName 、functionName 必选。
             */
            public Builder functionProvider(String functionProvider) {
                this.functionProvider = functionProvider;
                return this;
            }

            /**
             * 地域
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * 角色授权
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * 服务名
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FunctionConfig build() {
                return new FunctionConfig(this);
            } 

        } 

    }
    public static class LogConfig extends TeaModel {
        @NameInMap("endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("logstoreName")
        @Validation(required = true)
        private String logstoreName;

        @NameInMap("projectName")
        @Validation(required = true)
        private String projectName;

        private LogConfig(Builder builder) {
            this.endpoint = builder.endpoint;
            this.logstoreName = builder.logstoreName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String endpoint; 
            private String logstoreName; 
            private String projectName; 

            /**
             * endpoint
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * logstore 名称
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * project 名称
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    public static class SourceConfig extends TeaModel {
        @NameInMap("logstoreName")
        @Validation(required = true)
        private String logstoreName;

        private SourceConfig(Builder builder) {
            this.logstoreName = builder.logstoreName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceConfig create() {
            return builder().build();
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public static final class Builder {
            private String logstoreName; 

            /**
             * logstore 名称
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            public SourceConfig build() {
                return new SourceConfig(this);
            } 

        } 

    }
    public static class TriggerConfig extends TeaModel {
        @NameInMap("maxRetryTime")
        @Validation(required = true)
        private Integer maxRetryTime;

        @NameInMap("roleArn")
        @Validation(required = true)
        private String roleArn;

        @NameInMap("startingPosition")
        private String startingPosition;

        @NameInMap("startingUnixtime")
        private Long startingUnixtime;

        @NameInMap("triggerInterval")
        @Validation(required = true)
        private Integer triggerInterval;

        private TriggerConfig(Builder builder) {
            this.maxRetryTime = builder.maxRetryTime;
            this.roleArn = builder.roleArn;
            this.startingPosition = builder.startingPosition;
            this.startingUnixtime = builder.startingUnixtime;
            this.triggerInterval = builder.triggerInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConfig create() {
            return builder().build();
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return startingPosition
         */
        public String getStartingPosition() {
            return this.startingPosition;
        }

        /**
         * @return startingUnixtime
         */
        public Long getStartingUnixtime() {
            return this.startingUnixtime;
        }

        /**
         * @return triggerInterval
         */
        public Integer getTriggerInterval() {
            return this.triggerInterval;
        }

        public static final class Builder {
            private Integer maxRetryTime; 
            private String roleArn; 
            private String startingPosition; 
            private Long startingUnixtime; 
            private Integer triggerInterval; 

            /**
             * 最大重试次数，必须在[0,100] 之间
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * 角色授权配置
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * 开始位置，可选 latest、at-unixtime， 默认 latest。
             */
            public Builder startingPosition(String startingPosition) {
                this.startingPosition = startingPosition;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startingUnixtime(Long startingUnixtime) {
                this.startingUnixtime = startingUnixtime;
                return this;
            }

            /**
             * 触发间隔，单位为秒，必须在 [3,600] 之间
             */
            public Builder triggerInterval(Integer triggerInterval) {
                this.triggerInterval = triggerInterval;
                return this;
            }

            public TriggerConfig build() {
                return new TriggerConfig(this);
            } 

        } 

    }
}
