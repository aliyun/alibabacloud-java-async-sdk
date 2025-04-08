// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetGatewayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayConfigResponseBody</p>
 */
public class GetGatewayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGatewayConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetGatewayConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayConfigResponseBody build() {
            return new GetGatewayConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayConfigResponseBody</p>
     */
    public static class EnableK8sSourceWorkloadFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FilterOpt")
        private String filterOpt;

        @com.aliyun.core.annotation.NameInMap("LabelKey")
        private String labelKey;

        @com.aliyun.core.annotation.NameInMap("LabelValue")
        private String labelValue;

        private EnableK8sSourceWorkloadFilter(Builder builder) {
            this.enable = builder.enable;
            this.filterOpt = builder.filterOpt;
            this.labelKey = builder.labelKey;
            this.labelValue = builder.labelValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableK8sSourceWorkloadFilter create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return filterOpt
         */
        public String getFilterOpt() {
            return this.filterOpt;
        }

        /**
         * @return labelKey
         */
        public String getLabelKey() {
            return this.labelKey;
        }

        /**
         * @return labelValue
         */
        public String getLabelValue() {
            return this.labelValue;
        }

        public static final class Builder {
            private Boolean enable; 
            private String filterOpt; 
            private String labelKey; 
            private String labelValue; 

            private Builder() {
            } 

            private Builder(EnableK8sSourceWorkloadFilter model) {
                this.enable = model.enable;
                this.filterOpt = model.filterOpt;
                this.labelKey = model.labelKey;
                this.labelValue = model.labelValue;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * FilterOpt.
             */
            public Builder filterOpt(String filterOpt) {
                this.filterOpt = filterOpt;
                return this;
            }

            /**
             * LabelKey.
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * LabelValue.
             */
            public Builder labelValue(String labelValue) {
                this.labelValue = labelValue;
                return this;
            }

            public EnableK8sSourceWorkloadFilter build() {
                return new EnableK8sSourceWorkloadFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayConfigResponseBody</p>
     */
    public static class EnableXffTrustedCidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("IpListContent")
        private String ipListContent;

        private EnableXffTrustedCidrs(Builder builder) {
            this.enable = builder.enable;
            this.ipListContent = builder.ipListContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableXffTrustedCidrs create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return ipListContent
         */
        public String getIpListContent() {
            return this.ipListContent;
        }

        public static final class Builder {
            private Boolean enable; 
            private String ipListContent; 

            private Builder() {
            } 

            private Builder(EnableXffTrustedCidrs model) {
                this.enable = model.enable;
                this.ipListContent = model.ipListContent;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * IpListContent.
             */
            public Builder ipListContent(String ipListContent) {
                this.ipListContent = ipListContent;
                return this;
            }

            public EnableXffTrustedCidrs build() {
                return new EnableXffTrustedCidrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayConfigResponseBody</p>
     */
    public static class SlsConfigDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LogOn")
        private Boolean logOn;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("NginxCompatible")
        private Boolean nginxCompatible;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private SlsConfigDetails(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.logOn = builder.logOn;
            this.logStoreName = builder.logStoreName;
            this.nginxCompatible = builder.nginxCompatible;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfigDetails create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return logOn
         */
        public Boolean getLogOn() {
            return this.logOn;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return nginxCompatible
         */
        public Boolean getNginxCompatible() {
            return this.nginxCompatible;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean logOn; 
            private String logStoreName; 
            private Boolean nginxCompatible; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(SlsConfigDetails model) {
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.logOn = model.logOn;
                this.logStoreName = model.logStoreName;
                this.nginxCompatible = model.nginxCompatible;
                this.projectName = model.projectName;
            } 

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LogOn.
             */
            public Builder logOn(Boolean logOn) {
                this.logOn = logOn;
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
             * NginxCompatible.
             */
            public Builder nginxCompatible(Boolean nginxCompatible) {
                this.nginxCompatible = nginxCompatible;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public SlsConfigDetails build() {
                return new SlsConfigDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayConfigResponseBody</p>
     */
    public static class XtraceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private Integer sample;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private String servicePort;

        @com.aliyun.core.annotation.NameInMap("TraceOn")
        private Boolean traceOn;

        @com.aliyun.core.annotation.NameInMap("TraceType")
        private String traceType;

        private XtraceDetails(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.sample = builder.sample;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.traceOn = builder.traceOn;
            this.traceType = builder.traceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XtraceDetails create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sample
         */
        public Integer getSample() {
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
         * @return traceOn
         */
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        /**
         * @return traceType
         */
        public String getTraceType() {
            return this.traceType;
        }

        public static final class Builder {
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer sample; 
            private Long serviceId; 
            private String servicePort; 
            private Boolean traceOn; 
            private String traceType; 

            private Builder() {
            } 

            private Builder(XtraceDetails model) {
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.sample = model.sample;
                this.serviceId = model.serviceId;
                this.servicePort = model.servicePort;
                this.traceOn = model.traceOn;
                this.traceType = model.traceType;
            } 

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(Integer sample) {
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
             * TraceOn.
             */
            public Builder traceOn(Boolean traceOn) {
                this.traceOn = traceOn;
                return this;
            }

            /**
             * TraceType.
             */
            public Builder traceType(String traceType) {
                this.traceType = traceType;
                return this;
            }

            public XtraceDetails build() {
                return new XtraceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogHeader")
        private String accessLogHeader;

        @com.aliyun.core.annotation.NameInMap("DownstreamConnectionBufferLimits")
        private Integer downstreamConnectionBufferLimits;

        @com.aliyun.core.annotation.NameInMap("DownstreamHttp2MaxConcurrentStream")
        private Integer downstreamHttp2MaxConcurrentStream;

        @com.aliyun.core.annotation.NameInMap("DownstreamIdleTime")
        private Integer downstreamIdleTime;

        @com.aliyun.core.annotation.NameInMap("EnableCustomAuthConfigPush")
        private String enableCustomAuthConfigPush;

        @com.aliyun.core.annotation.NameInMap("EnableGenerateRequestId")
        private Boolean enableGenerateRequestId;

        @com.aliyun.core.annotation.NameInMap("EnableGzip")
        private Boolean enableGzip;

        @com.aliyun.core.annotation.NameInMap("EnableGzipHardwareAccelerate")
        private Boolean enableGzipHardwareAccelerate;

        @com.aliyun.core.annotation.NameInMap("EnableHardwareAccelerate")
        private Boolean enableHardwareAccelerate;

        @com.aliyun.core.annotation.NameInMap("EnableHttp2")
        private Boolean enableHttp2;

        @com.aliyun.core.annotation.NameInMap("EnableHttp3")
        private Boolean enableHttp3;

        @com.aliyun.core.annotation.NameInMap("EnableK8sSourceWorkloadFilter")
        private EnableK8sSourceWorkloadFilter enableK8sSourceWorkloadFilter;

        @com.aliyun.core.annotation.NameInMap("EnableProxyProtocol")
        private Boolean enableProxyProtocol;

        @com.aliyun.core.annotation.NameInMap("EnableSlashMerge")
        private Boolean enableSlashMerge;

        @com.aliyun.core.annotation.NameInMap("EnableWaf")
        private Boolean enableWaf;

        @com.aliyun.core.annotation.NameInMap("EnableXffTrustedCidrs")
        private EnableXffTrustedCidrs enableXffTrustedCidrs;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("InitialConnectionWindowSize")
        private Integer initialConnectionWindowSize;

        @com.aliyun.core.annotation.NameInMap("InitialStreamWindowSize")
        private Integer initialStreamWindowSize;

        @com.aliyun.core.annotation.NameInMap("KeepaliveHeaderTimeout")
        private Integer keepaliveHeaderTimeout;

        @com.aliyun.core.annotation.NameInMap("LogFilterConfig")
        private String logFilterConfig;

        @com.aliyun.core.annotation.NameInMap("NoSupportedConfigList")
        private String noSupportedConfigList;

        @com.aliyun.core.annotation.NameInMap("PathWithEscapedSlashes")
        private String pathWithEscapedSlashes;

        @com.aliyun.core.annotation.NameInMap("PreserveHeaderFormat")
        private Boolean preserveHeaderFormat;

        @com.aliyun.core.annotation.NameInMap("SlsConfigDetails")
        private SlsConfigDetails slsConfigDetails;

        @com.aliyun.core.annotation.NameInMap("SupportWaf")
        private Boolean supportWaf;

        @com.aliyun.core.annotation.NameInMap("UpstreamIdleTimeout")
        private Integer upstreamIdleTimeout;

        @com.aliyun.core.annotation.NameInMap("WebsocketTermGracePeriod")
        private Integer websocketTermGracePeriod;

        @com.aliyun.core.annotation.NameInMap("XffTrustedNum")
        private Integer xffTrustedNum;

        @com.aliyun.core.annotation.NameInMap("XtraceDetails")
        private XtraceDetails xtraceDetails;

        @com.aliyun.core.annotation.NameInMap("ZipAlgorithm")
        private String zipAlgorithm;

        private Data(Builder builder) {
            this.accessLogHeader = builder.accessLogHeader;
            this.downstreamConnectionBufferLimits = builder.downstreamConnectionBufferLimits;
            this.downstreamHttp2MaxConcurrentStream = builder.downstreamHttp2MaxConcurrentStream;
            this.downstreamIdleTime = builder.downstreamIdleTime;
            this.enableCustomAuthConfigPush = builder.enableCustomAuthConfigPush;
            this.enableGenerateRequestId = builder.enableGenerateRequestId;
            this.enableGzip = builder.enableGzip;
            this.enableGzipHardwareAccelerate = builder.enableGzipHardwareAccelerate;
            this.enableHardwareAccelerate = builder.enableHardwareAccelerate;
            this.enableHttp2 = builder.enableHttp2;
            this.enableHttp3 = builder.enableHttp3;
            this.enableK8sSourceWorkloadFilter = builder.enableK8sSourceWorkloadFilter;
            this.enableProxyProtocol = builder.enableProxyProtocol;
            this.enableSlashMerge = builder.enableSlashMerge;
            this.enableWaf = builder.enableWaf;
            this.enableXffTrustedCidrs = builder.enableXffTrustedCidrs;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.initialConnectionWindowSize = builder.initialConnectionWindowSize;
            this.initialStreamWindowSize = builder.initialStreamWindowSize;
            this.keepaliveHeaderTimeout = builder.keepaliveHeaderTimeout;
            this.logFilterConfig = builder.logFilterConfig;
            this.noSupportedConfigList = builder.noSupportedConfigList;
            this.pathWithEscapedSlashes = builder.pathWithEscapedSlashes;
            this.preserveHeaderFormat = builder.preserveHeaderFormat;
            this.slsConfigDetails = builder.slsConfigDetails;
            this.supportWaf = builder.supportWaf;
            this.upstreamIdleTimeout = builder.upstreamIdleTimeout;
            this.websocketTermGracePeriod = builder.websocketTermGracePeriod;
            this.xffTrustedNum = builder.xffTrustedNum;
            this.xtraceDetails = builder.xtraceDetails;
            this.zipAlgorithm = builder.zipAlgorithm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessLogHeader
         */
        public String getAccessLogHeader() {
            return this.accessLogHeader;
        }

        /**
         * @return downstreamConnectionBufferLimits
         */
        public Integer getDownstreamConnectionBufferLimits() {
            return this.downstreamConnectionBufferLimits;
        }

        /**
         * @return downstreamHttp2MaxConcurrentStream
         */
        public Integer getDownstreamHttp2MaxConcurrentStream() {
            return this.downstreamHttp2MaxConcurrentStream;
        }

        /**
         * @return downstreamIdleTime
         */
        public Integer getDownstreamIdleTime() {
            return this.downstreamIdleTime;
        }

        /**
         * @return enableCustomAuthConfigPush
         */
        public String getEnableCustomAuthConfigPush() {
            return this.enableCustomAuthConfigPush;
        }

        /**
         * @return enableGenerateRequestId
         */
        public Boolean getEnableGenerateRequestId() {
            return this.enableGenerateRequestId;
        }

        /**
         * @return enableGzip
         */
        public Boolean getEnableGzip() {
            return this.enableGzip;
        }

        /**
         * @return enableGzipHardwareAccelerate
         */
        public Boolean getEnableGzipHardwareAccelerate() {
            return this.enableGzipHardwareAccelerate;
        }

        /**
         * @return enableHardwareAccelerate
         */
        public Boolean getEnableHardwareAccelerate() {
            return this.enableHardwareAccelerate;
        }

        /**
         * @return enableHttp2
         */
        public Boolean getEnableHttp2() {
            return this.enableHttp2;
        }

        /**
         * @return enableHttp3
         */
        public Boolean getEnableHttp3() {
            return this.enableHttp3;
        }

        /**
         * @return enableK8sSourceWorkloadFilter
         */
        public EnableK8sSourceWorkloadFilter getEnableK8sSourceWorkloadFilter() {
            return this.enableK8sSourceWorkloadFilter;
        }

        /**
         * @return enableProxyProtocol
         */
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        /**
         * @return enableSlashMerge
         */
        public Boolean getEnableSlashMerge() {
            return this.enableSlashMerge;
        }

        /**
         * @return enableWaf
         */
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        /**
         * @return enableXffTrustedCidrs
         */
        public EnableXffTrustedCidrs getEnableXffTrustedCidrs() {
            return this.enableXffTrustedCidrs;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return initialConnectionWindowSize
         */
        public Integer getInitialConnectionWindowSize() {
            return this.initialConnectionWindowSize;
        }

        /**
         * @return initialStreamWindowSize
         */
        public Integer getInitialStreamWindowSize() {
            return this.initialStreamWindowSize;
        }

        /**
         * @return keepaliveHeaderTimeout
         */
        public Integer getKeepaliveHeaderTimeout() {
            return this.keepaliveHeaderTimeout;
        }

        /**
         * @return logFilterConfig
         */
        public String getLogFilterConfig() {
            return this.logFilterConfig;
        }

        /**
         * @return noSupportedConfigList
         */
        public String getNoSupportedConfigList() {
            return this.noSupportedConfigList;
        }

        /**
         * @return pathWithEscapedSlashes
         */
        public String getPathWithEscapedSlashes() {
            return this.pathWithEscapedSlashes;
        }

        /**
         * @return preserveHeaderFormat
         */
        public Boolean getPreserveHeaderFormat() {
            return this.preserveHeaderFormat;
        }

        /**
         * @return slsConfigDetails
         */
        public SlsConfigDetails getSlsConfigDetails() {
            return this.slsConfigDetails;
        }

        /**
         * @return supportWaf
         */
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

        /**
         * @return upstreamIdleTimeout
         */
        public Integer getUpstreamIdleTimeout() {
            return this.upstreamIdleTimeout;
        }

        /**
         * @return websocketTermGracePeriod
         */
        public Integer getWebsocketTermGracePeriod() {
            return this.websocketTermGracePeriod;
        }

        /**
         * @return xffTrustedNum
         */
        public Integer getXffTrustedNum() {
            return this.xffTrustedNum;
        }

        /**
         * @return xtraceDetails
         */
        public XtraceDetails getXtraceDetails() {
            return this.xtraceDetails;
        }

        /**
         * @return zipAlgorithm
         */
        public String getZipAlgorithm() {
            return this.zipAlgorithm;
        }

        public static final class Builder {
            private String accessLogHeader; 
            private Integer downstreamConnectionBufferLimits; 
            private Integer downstreamHttp2MaxConcurrentStream; 
            private Integer downstreamIdleTime; 
            private String enableCustomAuthConfigPush; 
            private Boolean enableGenerateRequestId; 
            private Boolean enableGzip; 
            private Boolean enableGzipHardwareAccelerate; 
            private Boolean enableHardwareAccelerate; 
            private Boolean enableHttp2; 
            private Boolean enableHttp3; 
            private EnableK8sSourceWorkloadFilter enableK8sSourceWorkloadFilter; 
            private Boolean enableProxyProtocol; 
            private Boolean enableSlashMerge; 
            private Boolean enableWaf; 
            private EnableXffTrustedCidrs enableXffTrustedCidrs; 
            private String gatewayUniqueId; 
            private Integer initialConnectionWindowSize; 
            private Integer initialStreamWindowSize; 
            private Integer keepaliveHeaderTimeout; 
            private String logFilterConfig; 
            private String noSupportedConfigList; 
            private String pathWithEscapedSlashes; 
            private Boolean preserveHeaderFormat; 
            private SlsConfigDetails slsConfigDetails; 
            private Boolean supportWaf; 
            private Integer upstreamIdleTimeout; 
            private Integer websocketTermGracePeriod; 
            private Integer xffTrustedNum; 
            private XtraceDetails xtraceDetails; 
            private String zipAlgorithm; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessLogHeader = model.accessLogHeader;
                this.downstreamConnectionBufferLimits = model.downstreamConnectionBufferLimits;
                this.downstreamHttp2MaxConcurrentStream = model.downstreamHttp2MaxConcurrentStream;
                this.downstreamIdleTime = model.downstreamIdleTime;
                this.enableCustomAuthConfigPush = model.enableCustomAuthConfigPush;
                this.enableGenerateRequestId = model.enableGenerateRequestId;
                this.enableGzip = model.enableGzip;
                this.enableGzipHardwareAccelerate = model.enableGzipHardwareAccelerate;
                this.enableHardwareAccelerate = model.enableHardwareAccelerate;
                this.enableHttp2 = model.enableHttp2;
                this.enableHttp3 = model.enableHttp3;
                this.enableK8sSourceWorkloadFilter = model.enableK8sSourceWorkloadFilter;
                this.enableProxyProtocol = model.enableProxyProtocol;
                this.enableSlashMerge = model.enableSlashMerge;
                this.enableWaf = model.enableWaf;
                this.enableXffTrustedCidrs = model.enableXffTrustedCidrs;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.initialConnectionWindowSize = model.initialConnectionWindowSize;
                this.initialStreamWindowSize = model.initialStreamWindowSize;
                this.keepaliveHeaderTimeout = model.keepaliveHeaderTimeout;
                this.logFilterConfig = model.logFilterConfig;
                this.noSupportedConfigList = model.noSupportedConfigList;
                this.pathWithEscapedSlashes = model.pathWithEscapedSlashes;
                this.preserveHeaderFormat = model.preserveHeaderFormat;
                this.slsConfigDetails = model.slsConfigDetails;
                this.supportWaf = model.supportWaf;
                this.upstreamIdleTimeout = model.upstreamIdleTimeout;
                this.websocketTermGracePeriod = model.websocketTermGracePeriod;
                this.xffTrustedNum = model.xffTrustedNum;
                this.xtraceDetails = model.xtraceDetails;
                this.zipAlgorithm = model.zipAlgorithm;
            } 

            /**
             * AccessLogHeader.
             */
            public Builder accessLogHeader(String accessLogHeader) {
                this.accessLogHeader = accessLogHeader;
                return this;
            }

            /**
             * DownstreamConnectionBufferLimits.
             */
            public Builder downstreamConnectionBufferLimits(Integer downstreamConnectionBufferLimits) {
                this.downstreamConnectionBufferLimits = downstreamConnectionBufferLimits;
                return this;
            }

            /**
             * DownstreamHttp2MaxConcurrentStream.
             */
            public Builder downstreamHttp2MaxConcurrentStream(Integer downstreamHttp2MaxConcurrentStream) {
                this.downstreamHttp2MaxConcurrentStream = downstreamHttp2MaxConcurrentStream;
                return this;
            }

            /**
             * DownstreamIdleTime.
             */
            public Builder downstreamIdleTime(Integer downstreamIdleTime) {
                this.downstreamIdleTime = downstreamIdleTime;
                return this;
            }

            /**
             * EnableCustomAuthConfigPush.
             */
            public Builder enableCustomAuthConfigPush(String enableCustomAuthConfigPush) {
                this.enableCustomAuthConfigPush = enableCustomAuthConfigPush;
                return this;
            }

            /**
             * EnableGenerateRequestId.
             */
            public Builder enableGenerateRequestId(Boolean enableGenerateRequestId) {
                this.enableGenerateRequestId = enableGenerateRequestId;
                return this;
            }

            /**
             * EnableGzip.
             */
            public Builder enableGzip(Boolean enableGzip) {
                this.enableGzip = enableGzip;
                return this;
            }

            /**
             * EnableGzipHardwareAccelerate.
             */
            public Builder enableGzipHardwareAccelerate(Boolean enableGzipHardwareAccelerate) {
                this.enableGzipHardwareAccelerate = enableGzipHardwareAccelerate;
                return this;
            }

            /**
             * EnableHardwareAccelerate.
             */
            public Builder enableHardwareAccelerate(Boolean enableHardwareAccelerate) {
                this.enableHardwareAccelerate = enableHardwareAccelerate;
                return this;
            }

            /**
             * EnableHttp2.
             */
            public Builder enableHttp2(Boolean enableHttp2) {
                this.enableHttp2 = enableHttp2;
                return this;
            }

            /**
             * EnableHttp3.
             */
            public Builder enableHttp3(Boolean enableHttp3) {
                this.enableHttp3 = enableHttp3;
                return this;
            }

            /**
             * EnableK8sSourceWorkloadFilter.
             */
            public Builder enableK8sSourceWorkloadFilter(EnableK8sSourceWorkloadFilter enableK8sSourceWorkloadFilter) {
                this.enableK8sSourceWorkloadFilter = enableK8sSourceWorkloadFilter;
                return this;
            }

            /**
             * EnableProxyProtocol.
             */
            public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
                this.enableProxyProtocol = enableProxyProtocol;
                return this;
            }

            /**
             * EnableSlashMerge.
             */
            public Builder enableSlashMerge(Boolean enableSlashMerge) {
                this.enableSlashMerge = enableSlashMerge;
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
             * EnableXffTrustedCidrs.
             */
            public Builder enableXffTrustedCidrs(EnableXffTrustedCidrs enableXffTrustedCidrs) {
                this.enableXffTrustedCidrs = enableXffTrustedCidrs;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * InitialConnectionWindowSize.
             */
            public Builder initialConnectionWindowSize(Integer initialConnectionWindowSize) {
                this.initialConnectionWindowSize = initialConnectionWindowSize;
                return this;
            }

            /**
             * InitialStreamWindowSize.
             */
            public Builder initialStreamWindowSize(Integer initialStreamWindowSize) {
                this.initialStreamWindowSize = initialStreamWindowSize;
                return this;
            }

            /**
             * KeepaliveHeaderTimeout.
             */
            public Builder keepaliveHeaderTimeout(Integer keepaliveHeaderTimeout) {
                this.keepaliveHeaderTimeout = keepaliveHeaderTimeout;
                return this;
            }

            /**
             * LogFilterConfig.
             */
            public Builder logFilterConfig(String logFilterConfig) {
                this.logFilterConfig = logFilterConfig;
                return this;
            }

            /**
             * NoSupportedConfigList.
             */
            public Builder noSupportedConfigList(String noSupportedConfigList) {
                this.noSupportedConfigList = noSupportedConfigList;
                return this;
            }

            /**
             * PathWithEscapedSlashes.
             */
            public Builder pathWithEscapedSlashes(String pathWithEscapedSlashes) {
                this.pathWithEscapedSlashes = pathWithEscapedSlashes;
                return this;
            }

            /**
             * PreserveHeaderFormat.
             */
            public Builder preserveHeaderFormat(Boolean preserveHeaderFormat) {
                this.preserveHeaderFormat = preserveHeaderFormat;
                return this;
            }

            /**
             * SlsConfigDetails.
             */
            public Builder slsConfigDetails(SlsConfigDetails slsConfigDetails) {
                this.slsConfigDetails = slsConfigDetails;
                return this;
            }

            /**
             * SupportWaf.
             */
            public Builder supportWaf(Boolean supportWaf) {
                this.supportWaf = supportWaf;
                return this;
            }

            /**
             * UpstreamIdleTimeout.
             */
            public Builder upstreamIdleTimeout(Integer upstreamIdleTimeout) {
                this.upstreamIdleTimeout = upstreamIdleTimeout;
                return this;
            }

            /**
             * WebsocketTermGracePeriod.
             */
            public Builder websocketTermGracePeriod(Integer websocketTermGracePeriod) {
                this.websocketTermGracePeriod = websocketTermGracePeriod;
                return this;
            }

            /**
             * XffTrustedNum.
             */
            public Builder xffTrustedNum(Integer xffTrustedNum) {
                this.xffTrustedNum = xffTrustedNum;
                return this;
            }

            /**
             * XtraceDetails.
             */
            public Builder xtraceDetails(XtraceDetails xtraceDetails) {
                this.xtraceDetails = xtraceDetails;
                return this;
            }

            /**
             * ZipAlgorithm.
             */
            public Builder zipAlgorithm(String zipAlgorithm) {
                this.zipAlgorithm = zipAlgorithm;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
