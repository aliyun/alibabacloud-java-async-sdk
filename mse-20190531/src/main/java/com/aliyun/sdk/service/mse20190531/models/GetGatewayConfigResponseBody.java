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
         * <p>The code used to synchronize with the success field.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data overview.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>This field is not used. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>This field is not used. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6092602-C357-4750-89D9-E572FBEA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request result. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>Specifies whether to enable tag filtering for Kubernetes service source workloads.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The tag filtering method. Valid values: EQUAL (matches the specified tag) and NOT_EQUAL (excludes the specified tag).</p>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder filterOpt(String filterOpt) {
                this.filterOpt = filterOpt;
                return this;
            }

            /**
             * <p>The tag key used to filter Kubernetes workloads.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * <p>The tag value used to filter Kubernetes workloads.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
             * <p>Specifies whether to enable the configuration for trusted X-Forwarded-For source CIDR blocks.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The list of trusted source IP addresses or CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
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
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-61f465fa2dd044069e2208c4912*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>Not available for use.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Not available for use.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Not available for use.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Specifies whether log delivery is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logOn(Boolean logOn) {
                this.logOn = logOn;
                return this;
            }

            /**
             * <p>The destination Logstore for log delivery. Valid values:</p>
             * <ul>
             * <li><p>mse_gw_access_log: Nginx Ingress compatibility is disabled.</p>
             * </li>
             * <li><p>nginx-ingress: Nginx Ingress compatibility is enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mse_gw_access_log</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>Specifies whether Nginx Ingress compatibility is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nginxCompatible(Boolean nginxCompatible) {
                this.nginxCompatible = nginxCompatible;
                return this;
            }

            /**
             * <p>The destination Simple Log Service project for log delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-61f465fa2dd044069e2208c4912*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The time when the Tracing Analysis information was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-12T09:39:07.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the Tracing Analysis information was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-12T09:39:07.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the Tracing Analysis information.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The sampling rate (%).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sample(Integer sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <p>The SkyWalking service ID for self-managed SkyWalking.</p>
             * 
             * <strong>example:</strong>
             * <p>333</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The SkyWalking service port for self-managed SkyWalking.</p>
             * 
             * <strong>example:</strong>
             * <p>8888</p>
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>Specifies whether Tracing Analysis is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder traceOn(Boolean traceOn) {
                this.traceOn = traceOn;
                return this;
            }

            /**
             * <p>The Tracing Analysis type. Valid values:</p>
             * <ul>
             * <li><p>XTRACE: Managed Service for OpenTelemetry with the Zipkin Tracing Analysis protocol.</p>
             * </li>
             * <li><p>SKYWALKING: Self-managed SkyWalking.</p>
             * </li>
             * <li><p>OPENTELEMETRY: Managed Service for OpenTelemetry with the OpenTelemetry Tracing Analysis protocol.</p>
             * </li>
             * <li><p>OTSKYWALKING: Managed Service for OpenTelemetry with the SkyWalking Tracing Analysis protocol.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPENTELEMETRY</p>
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

        @com.aliyun.core.annotation.NameInMap("LiteMetrics")
        private Boolean liteMetrics;

        @com.aliyun.core.annotation.NameInMap("LogFilterConfig")
        private String logFilterConfig;

        @com.aliyun.core.annotation.NameInMap("LogRequestResponseConfig")
        private String logRequestResponseConfig;

        @com.aliyun.core.annotation.NameInMap("NoSupportedConfigList")
        private String noSupportedConfigList;

        @com.aliyun.core.annotation.NameInMap("PathWithEscapedSlashes")
        private String pathWithEscapedSlashes;

        @com.aliyun.core.annotation.NameInMap("PreserveExternalRequestID")
        private Boolean preserveExternalRequestID;

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
            this.liteMetrics = builder.liteMetrics;
            this.logFilterConfig = builder.logFilterConfig;
            this.logRequestResponseConfig = builder.logRequestResponseConfig;
            this.noSupportedConfigList = builder.noSupportedConfigList;
            this.pathWithEscapedSlashes = builder.pathWithEscapedSlashes;
            this.preserveExternalRequestID = builder.preserveExternalRequestID;
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
         * @return liteMetrics
         */
        public Boolean getLiteMetrics() {
            return this.liteMetrics;
        }

        /**
         * @return logFilterConfig
         */
        public String getLogFilterConfig() {
            return this.logFilterConfig;
        }

        /**
         * @return logRequestResponseConfig
         */
        public String getLogRequestResponseConfig() {
            return this.logRequestResponseConfig;
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
         * @return preserveExternalRequestID
         */
        public Boolean getPreserveExternalRequestID() {
            return this.preserveExternalRequestID;
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
            private Boolean liteMetrics; 
            private String logFilterConfig; 
            private String logRequestResponseConfig; 
            private String noSupportedConfigList; 
            private String pathWithEscapedSlashes; 
            private Boolean preserveExternalRequestID; 
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
                this.liteMetrics = model.liteMetrics;
                this.logFilterConfig = model.logFilterConfig;
                this.logRequestResponseConfig = model.logRequestResponseConfig;
                this.noSupportedConfigList = model.noSupportedConfigList;
                this.pathWithEscapedSlashes = model.pathWithEscapedSlashes;
                this.preserveExternalRequestID = model.preserveExternalRequestID;
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
             * <p>The custom log format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;requestMetadata&quot;:[],&quot;responseHeaders&quot;:[],&quot;requestHeaders&quot;:[&quot;x-test&quot;],&quot;responseMetadata&quot;:[]}</p>
             */
            public Builder accessLogHeader(String accessLogHeader) {
                this.accessLogHeader = accessLogHeader;
                return this;
            }

            /**
             * <p>The buffer size for a single gateway connection. Configuring this parameter affects throughput and gateway memory usage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>32768</p>
             */
            public Builder downstreamConnectionBufferLimits(Integer downstreamConnectionBufferLimits) {
                this.downstreamConnectionBufferLimits = downstreamConnectionBufferLimits;
                return this;
            }

            /**
             * <p>The maximum number of concurrent streams on a single connection when the client uses HTTP/2. This parameter takes effect at the request level.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder downstreamHttp2MaxConcurrentStream(Integer downstreamHttp2MaxConcurrentStream) {
                this.downstreamHttp2MaxConcurrentStream = downstreamHttp2MaxConcurrentStream;
                return this;
            }

            /**
             * <p>The idle timeout period for connections from the client to the gateway. Unit: seconds. If no request is received within the specified period, the gateway disconnects the connection. Valid values: 0 to 600.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder downstreamIdleTime(Integer downstreamIdleTime) {
                this.downstreamIdleTime = downstreamIdleTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable custom authentication configuration push for self-managed authentication services. When enabled, changes to authentication rules do not cause connection interruptions. This feature is applicable to WebSocket and online business scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableCustomAuthConfigPush(String enableCustomAuthConfigPush) {
                this.enableCustomAuthConfigPush = enableCustomAuthConfigPush;
                return this;
            }

            /**
             * <p>Specifies whether to generate a request ID in the request header for request tracking. This parameter takes effect at the request level.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableGenerateRequestId(Boolean enableGenerateRequestId) {
                this.enableGenerateRequestId = enableGenerateRequestId;
                return this;
            }

            /**
             * <p>Specifies whether to enable Gzip compression for requests and responses. Enabling this feature reduces gateway traffic but increases gateway CPU consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableGzip(Boolean enableGzip) {
                this.enableGzip = enableGzip;
                return this;
            }

            /**
             * <p>Specifies whether to enable Gzip hardware acceleration.</p>
             */
            public Builder enableGzipHardwareAccelerate(Boolean enableGzipHardwareAccelerate) {
                this.enableGzipHardwareAccelerate = enableGzipHardwareAccelerate;
                return this;
            }

            /**
             * <p>Specifies whether to enable hardware acceleration. This configuration fails if the region does not support hardware acceleration at the underlying layer or if hardware acceleration was not specified during purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableHardwareAccelerate(Boolean enableHardwareAccelerate) {
                this.enableHardwareAccelerate = enableHardwareAccelerate;
                return this;
            }

            /**
             * <p>Specifies whether to use HTTP/2 during negotiation between the server and the client. This parameter takes effect at the request level. Changes take effect after 1 to 2 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableHttp2(Boolean enableHttp2) {
                this.enableHttp2 = enableHttp2;
                return this;
            }

            /**
             * <p>Specifies whether the HTTP/3 protocol is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableHttp3(Boolean enableHttp3) {
                this.enableHttp3 = enableHttp3;
                return this;
            }

            /**
             * <p>The tag filtering configuration for Kubernetes service source workloads.</p>
             */
            public Builder enableK8sSourceWorkloadFilter(EnableK8sSourceWorkloadFilter enableK8sSourceWorkloadFilter) {
                this.enableK8sSourceWorkloadFilter = enableK8sSourceWorkloadFilter;
                return this;
            }

            /**
             * <p>Specifies whether to enable the PROXY protocol. If the gateway ingress traffic is routed through a Network Load Balancer (NLB) and this feature is disabled, the real IP address of the client cannot be obtained. Enabling this feature does not affect non-PROXY protocol requests.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
                this.enableProxyProtocol = enableProxyProtocol;
                return this;
            }

            /**
             * <p>Specifies whether to merge consecutive slashes in a request URL. For example, if this feature is enabled, the extra slash in <code>www.a.com//b</code> is merged, making it equivalent to <code>www.a.com/b</code>. This parameter takes effect at the request level.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSlashMerge(Boolean enableSlashMerge) {
                this.enableSlashMerge = enableSlashMerge;
                return this;
            }

            /**
             * <p>Specifies whether WAF is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWaf(Boolean enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * <p>The configuration for trusted X-Forwarded-For source CIDR blocks.</p>
             */
            public Builder enableXffTrustedCidrs(EnableXffTrustedCidrs enableXffTrustedCidrs) {
                this.enableXffTrustedCidrs = enableXffTrustedCidrs;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-61f465fa2dd044069e2208c4912*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The initial connection-level window size negotiated between the gateway and the client when HTTP/2 is used. Unit: bytes. This parameter takes effect at the request level.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder initialConnectionWindowSize(Integer initialConnectionWindowSize) {
                this.initialConnectionWindowSize = initialConnectionWindowSize;
                return this;
            }

            /**
             * <p>The initial stream window size negotiated between the gateway and the client when HTTP/2 is used. Unit: bytes. This parameter takes effect at the request level.</p>
             * 
             * <strong>example:</strong>
             * <p>65535</p>
             */
            public Builder initialStreamWindowSize(Integer initialStreamWindowSize) {
                this.initialStreamWindowSize = initialStreamWindowSize;
                return this;
            }

            /**
             * <p>The keep-alive time in the Keep-Alive response header. Unit: seconds. If this parameter is set to 0, the response header is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder keepaliveHeaderTimeout(Integer keepaliveHeaderTimeout) {
                this.keepaliveHeaderTimeout = keepaliveHeaderTimeout;
                return this;
            }

            /**
             * <p>Indicates whether lightweight metric collection is enabled.</p>
             */
            public Builder liteMetrics(Boolean liteMetrics) {
                this.liteMetrics = liteMetrics;
                return this;
            }

            /**
             * <p>Not available for use.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder logFilterConfig(String logFilterConfig) {
                this.logFilterConfig = logFilterConfig;
                return this;
            }

            /**
             * <p>The log collection configuration for request and response headers and bodies. The content is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;request&quot;:{&quot;headers&quot;:{&quot;enabled&quot;:true}}}</p>
             */
            public Builder logRequestResponseConfig(String logRequestResponseConfig) {
                this.logRequestResponseConfig = logRequestResponseConfig;
                return this;
            }

            /**
             * <p>The list of unsupported configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;EnableProxyProtocol,EnableCustomAuthConfigPush&quot;</p>
             */
            public Builder noSupportedConfigList(String noSupportedConfigList) {
                this.noSupportedConfigList = noSupportedConfigList;
                return this;
            }

            /**
             * <p>The action to take when a URI path contains escaped slashes such as %2F, %2f, %5C, or %5c. Default value: KEEP_UNCHANGED. Valid values:</p>
             * <ul>
             * <li><p>KEEP_UNCHANGED</p>
             * </li>
             * <li><p>REJECT_REQUEST</p>
             * </li>
             * <li><p>UNESCAPE_AND_REDIRECT</p>
             * </li>
             * <li><p>UNESCAPE_AND_FORWARD</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KEEP_UNCHANGED</p>
             */
            public Builder pathWithEscapedSlashes(String pathWithEscapedSlashes) {
                this.pathWithEscapedSlashes = pathWithEscapedSlashes;
                return this;
            }

            /**
             * <p>Specifies whether to preserve the request ID passed by the client.</p>
             */
            public Builder preserveExternalRequestID(Boolean preserveExternalRequestID) {
                this.preserveExternalRequestID = preserveExternalRequestID;
                return this;
            }

            /**
             * <p>Specifies whether to preserve the original case of request and response headers. In HTTP/1.1, headers are case-insensitive. To ensure compatibility with HTTP/2, headers are converted to lowercase by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder preserveHeaderFormat(Boolean preserveHeaderFormat) {
                this.preserveHeaderFormat = preserveHeaderFormat;
                return this;
            }

            /**
             * <p>The log delivery information.</p>
             */
            public Builder slsConfigDetails(SlsConfigDetails slsConfigDetails) {
                this.slsConfigDetails = slsConfigDetails;
                return this;
            }

            /**
             * <p>Indicates whether the gateway supports Web Application Firewall (WAF).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportWaf(Boolean supportWaf) {
                this.supportWaf = supportWaf;
                return this;
            }

            /**
             * <p>The default idle timeout period for upstream connections.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder upstreamIdleTimeout(Integer upstreamIdleTimeout) {
                this.upstreamIdleTimeout = upstreamIdleTimeout;
                return this;
            }

            /**
             * <p>The keep-alive time maintained for WebSocket connections when connections must be closed during gateway instance upgrades or restarts. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder websocketTermGracePeriod(Integer websocketTermGracePeriod) {
                this.websocketTermGracePeriod = websocketTermGracePeriod;
                return this;
            }

            /**
             * <p>The number of trusted proxies in front of the gateway. This parameter affects whether the gateway uses request headers such as X-Forwarded-For and X-Request-ID generated by the client. This parameter takes effect at the request level.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder xffTrustedNum(Integer xffTrustedNum) {
                this.xffTrustedNum = xffTrustedNum;
                return this;
            }

            /**
             * <p>The Tracing Analysis information.</p>
             */
            public Builder xtraceDetails(XtraceDetails xtraceDetails) {
                this.xtraceDetails = xtraceDetails;
                return this;
            }

            /**
             * <p>The compression algorithm used when compression is enabled. Valid values: brotli and gzip. If this parameter is set and EnableGzip is disabled, EnableGzip is automatically enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;gzip&quot;]</p>
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
