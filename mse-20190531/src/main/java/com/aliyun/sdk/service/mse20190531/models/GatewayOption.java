// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayOption} extends {@link TeaModel}
 *
 * <p>GatewayOption</p>
 */
public class GatewayOption extends TeaModel {
    @NameInMap("DisableHttp2Alpn")
    private Boolean disableHttp2Alpn;

    @NameInMap("EnableHardwareAcceleration")
    private Boolean enableHardwareAcceleration;

    @NameInMap("EnableWaf")
    private Boolean enableWaf;

    @NameInMap("LogConfigDetails")
    private LogConfigDetails logConfigDetails;

    @NameInMap("TraceDetails")
    private TraceDetails traceDetails;

    private GatewayOption(Builder builder) {
        this.disableHttp2Alpn = builder.disableHttp2Alpn;
        this.enableHardwareAcceleration = builder.enableHardwareAcceleration;
        this.enableWaf = builder.enableWaf;
        this.logConfigDetails = builder.logConfigDetails;
        this.traceDetails = builder.traceDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayOption create() {
        return builder().build();
    }

    /**
     * @return disableHttp2Alpn
     */
    public Boolean getDisableHttp2Alpn() {
        return this.disableHttp2Alpn;
    }

    /**
     * @return enableHardwareAcceleration
     */
    public Boolean getEnableHardwareAcceleration() {
        return this.enableHardwareAcceleration;
    }

    /**
     * @return enableWaf
     */
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    /**
     * @return logConfigDetails
     */
    public LogConfigDetails getLogConfigDetails() {
        return this.logConfigDetails;
    }

    /**
     * @return traceDetails
     */
    public TraceDetails getTraceDetails() {
        return this.traceDetails;
    }

    public static final class Builder {
        private Boolean disableHttp2Alpn; 
        private Boolean enableHardwareAcceleration; 
        private Boolean enableWaf; 
        private LogConfigDetails logConfigDetails; 
        private TraceDetails traceDetails; 

        /**
         * 是否禁用http
         */
        public Builder disableHttp2Alpn(Boolean disableHttp2Alpn) {
            this.disableHttp2Alpn = disableHttp2Alpn;
            return this;
        }

        /**
         * 是否开启硬件加速
         */
        public Builder enableHardwareAcceleration(Boolean enableHardwareAcceleration) {
            this.enableHardwareAcceleration = enableHardwareAcceleration;
            return this;
        }

        /**
         * 是否开启waf
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }

        /**
         * 日志配置详情
         */
        public Builder logConfigDetails(LogConfigDetails logConfigDetails) {
            this.logConfigDetails = logConfigDetails;
            return this;
        }

        /**
         * xtrace config option
         */
        public Builder traceDetails(TraceDetails traceDetails) {
            this.traceDetails = traceDetails;
            return this;
        }

        public GatewayOption build() {
            return new GatewayOption(this);
        } 

    } 

    public static class LogConfigDetails extends TeaModel {
        @NameInMap("LogEnabled")
        @Validation(required = true)
        private Boolean logEnabled;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("ProjectName")
        private String projectName;

        private LogConfigDetails(Builder builder) {
            this.logEnabled = builder.logEnabled;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfigDetails create() {
            return builder().build();
        }

        /**
         * @return logEnabled
         */
        public Boolean getLogEnabled() {
            return this.logEnabled;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private Boolean logEnabled; 
            private String logStoreName; 
            private String projectName; 

            /**
             * 是否开启日志投递
             */
            public Builder logEnabled(Boolean logEnabled) {
                this.logEnabled = logEnabled;
                return this;
            }

            /**
             * 投递的目标logstore
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * 投递的目标project
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public LogConfigDetails build() {
                return new LogConfigDetails(this);
            } 

        } 

    }
    public static class TraceDetails extends TeaModel {
        @NameInMap("Sample")
        private Long sample;

        @NameInMap("TraceEnabled")
        @Validation(required = true)
        private Boolean traceEnabled;

        private TraceDetails(Builder builder) {
            this.sample = builder.sample;
            this.traceEnabled = builder.traceEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceDetails create() {
            return builder().build();
        }

        /**
         * @return sample
         */
        public Long getSample() {
            return this.sample;
        }

        /**
         * @return traceEnabled
         */
        public Boolean getTraceEnabled() {
            return this.traceEnabled;
        }

        public static final class Builder {
            private Long sample; 
            private Boolean traceEnabled; 

            /**
             * trace 采样率
             */
            public Builder sample(Long sample) {
                this.sample = sample;
                return this;
            }

            /**
             * trace是否开启
             */
            public Builder traceEnabled(Boolean traceEnabled) {
                this.traceEnabled = traceEnabled;
                return this;
            }

            public TraceDetails build() {
                return new TraceDetails(this);
            } 

        } 

    }
}
