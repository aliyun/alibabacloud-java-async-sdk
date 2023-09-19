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
         * DisableHttp2Alpn.
         */
        public Builder disableHttp2Alpn(Boolean disableHttp2Alpn) {
            this.disableHttp2Alpn = disableHttp2Alpn;
            return this;
        }

        /**
         * EnableHardwareAcceleration.
         */
        public Builder enableHardwareAcceleration(Boolean enableHardwareAcceleration) {
            this.enableHardwareAcceleration = enableHardwareAcceleration;
            return this;
        }

        /**
         * EnableWaf.
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }

        /**
         * LogConfigDetails.
         */
        public Builder logConfigDetails(LogConfigDetails logConfigDetails) {
            this.logConfigDetails = logConfigDetails;
            return this;
        }

        /**
         * TraceDetails.
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
             * LogEnabled.
             */
            public Builder logEnabled(Boolean logEnabled) {
                this.logEnabled = logEnabled;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * ProjectName.
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

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("ServicePort")
        private String servicePort;

        @NameInMap("TraceEnabled")
        @Validation(required = true)
        private Boolean traceEnabled;

        @NameInMap("TraceType")
        private String traceType;

        private TraceDetails(Builder builder) {
            this.sample = builder.sample;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.traceEnabled = builder.traceEnabled;
            this.traceType = builder.traceType;
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
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public String getServicePort() {
            return this.servicePort;
        }

        /**
         * @return traceEnabled
         */
        public Boolean getTraceEnabled() {
            return this.traceEnabled;
        }

        /**
         * @return traceType
         */
        public String getTraceType() {
            return this.traceType;
        }

        public static final class Builder {
            private Long sample; 
            private Long serviceId; 
            private String servicePort; 
            private Boolean traceEnabled; 
            private String traceType; 

            /**
             * Sample.
             */
            public Builder sample(Long sample) {
                this.sample = sample;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServicePort.
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * TraceEnabled.
             */
            public Builder traceEnabled(Boolean traceEnabled) {
                this.traceEnabled = traceEnabled;
                return this;
            }

            /**
             * TraceType.
             */
            public Builder traceType(String traceType) {
                this.traceType = traceType;
                return this;
            }

            public TraceDetails build() {
                return new TraceDetails(this);
            } 

        } 

    }
}
