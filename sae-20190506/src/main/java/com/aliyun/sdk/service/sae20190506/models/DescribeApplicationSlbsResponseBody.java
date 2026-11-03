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
 * {@link DescribeApplicationSlbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationSlbsResponseBody</p>
 */
public class DescribeApplicationSlbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationSlbsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationSlbsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationSlbsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Success.</li>
         * <li><strong>3xx</strong>: Redirection.</li>
         * <li><strong>4xx</strong>: Client error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Description:</p>
         * <ul>
         * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidApplication.NotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The request is successful.</li>
         * <li>Specific error code: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the SLB configuration of the application was successfully retrieved. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The configuration was successfully retrieved.</p>
         * </li>
         * <li><p><strong>false</strong>: The configuration failed to be retrieved.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID used to precisely query call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationSlbsResponseBody build() {
            return new DescribeApplicationSlbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationSlbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSlbsResponseBody</p>
     */
    public static class Internet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EnableConnectionDrain")
        private Boolean enableConnectionDrain;

        @com.aliyun.core.annotation.NameInMap("HttpsCaCertId")
        private String httpsCaCertId;

        @com.aliyun.core.annotation.NameInMap("HttpsCertId")
        private String httpsCertId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("StickySession")
        private Boolean stickySession;

        @com.aliyun.core.annotation.NameInMap("StickySessionType")
        private String stickySessionType;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private Integer targetPort;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Internet(Builder builder) {
            this.connectionDrainTimeout = builder.connectionDrainTimeout;
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.createTime = builder.createTime;
            this.enableConnectionDrain = builder.enableConnectionDrain;
            this.httpsCaCertId = builder.httpsCaCertId;
            this.httpsCertId = builder.httpsCertId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.targetPort = builder.targetPort;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internet create() {
            return builder().build();
        }

        /**
         * @return connectionDrainTimeout
         */
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        /**
         * @return cookie
         */
        public String getCookie() {
            return this.cookie;
        }

        /**
         * @return cookieTimeout
         */
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableConnectionDrain
         */
        public Boolean getEnableConnectionDrain() {
            return this.enableConnectionDrain;
        }

        /**
         * @return httpsCaCertId
         */
        public String getHttpsCaCertId() {
            return this.httpsCaCertId;
        }

        /**
         * @return httpsCertId
         */
        public String getHttpsCertId() {
            return this.httpsCertId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return stickySession
         */
        public Boolean getStickySession() {
            return this.stickySession;
        }

        /**
         * @return stickySessionType
         */
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private Integer connectionDrainTimeout; 
            private String cookie; 
            private Integer cookieTimeout; 
            private Long createTime; 
            private Boolean enableConnectionDrain; 
            private String httpsCaCertId; 
            private String httpsCertId; 
            private Integer port; 
            private String protocol; 
            private Boolean stickySession; 
            private String stickySessionType; 
            private Integer targetPort; 
            private String vServerGroupId; 

            private Builder() {
            } 

            private Builder(Internet model) {
                this.connectionDrainTimeout = model.connectionDrainTimeout;
                this.cookie = model.cookie;
                this.cookieTimeout = model.cookieTimeout;
                this.createTime = model.createTime;
                this.enableConnectionDrain = model.enableConnectionDrain;
                this.httpsCaCertId = model.httpsCaCertId;
                this.httpsCertId = model.httpsCertId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.stickySession = model.stickySession;
                this.stickySessionType = model.stickySessionType;
                this.targetPort = model.targetPort;
                this.vServerGroupId = model.vServerGroupId;
            } 

            /**
             * ConnectionDrainTimeout.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * <p>The cookie configured on the server.</p>
             * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces, and cannot start with a dollar sign ($).</p>
             * <blockquote>
             * <p>This parameter is required and valid only when <strong>StickySession</strong> is set to <strong>on</strong> and <strong>StickySessionType</strong> is set to <strong>server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>wwe</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The cookie timeout period. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * <blockquote>
             * <p>This parameter is required and valid only when <strong>StickySession</strong> is set to <strong>on</strong> and <strong>StickySessionType</strong> is set to <strong>insert</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>The timestamp when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1741247308294</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableConnectionDrain.
             */
            public Builder enableConnectionDrain(Boolean enableConnectionDrain) {
                this.enableConnectionDrain = enableConnectionDrain;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud CA certificate for the HTTPS protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
             */
            public Builder httpsCaCertId(String httpsCaCertId) {
                this.httpsCaCertId = httpsCaCertId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud certificate for the HTTPS protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
             */
            public Builder httpsCertId(String httpsCertId) {
                this.httpsCertId = httpsCertId;
                return this;
            }

            /**
             * <p>The SLB listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The supported protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Indicates whether session persistence is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stickySession(Boolean stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * <p>The cookie processing method. Valid values:</p>
             * <ul>
             * <li><p><strong>insert</strong>: Inserts a cookie. When a client accesses the service for the first time, load balancing inserts a cookie into the response. The next time the client accesses the service with this cookie, the load balancing service forwards the request to the previously recorded backend server.</p>
             * </li>
             * <li><p><strong>server</strong>: Rewrites a cookie. When load balancing detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the service with the new cookie, the load balancing service forwards the request to the previously recorded backend server.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is required and valid only when <strong>StickySession</strong> is set to <strong>on</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>insert</p>
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>The container port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Internet build() {
                return new Internet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationSlbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSlbsResponseBody</p>
     */
    public static class Intranet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EnableConnectionDrain")
        private Boolean enableConnectionDrain;

        @com.aliyun.core.annotation.NameInMap("HttpsCaCertId")
        private String httpsCaCertId;

        @com.aliyun.core.annotation.NameInMap("HttpsCertId")
        private String httpsCertId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("StickySession")
        private Boolean stickySession;

        @com.aliyun.core.annotation.NameInMap("StickySessionType")
        private String stickySessionType;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private Integer targetPort;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Intranet(Builder builder) {
            this.connectionDrainTimeout = builder.connectionDrainTimeout;
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.createTime = builder.createTime;
            this.enableConnectionDrain = builder.enableConnectionDrain;
            this.httpsCaCertId = builder.httpsCaCertId;
            this.httpsCertId = builder.httpsCertId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.targetPort = builder.targetPort;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intranet create() {
            return builder().build();
        }

        /**
         * @return connectionDrainTimeout
         */
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        /**
         * @return cookie
         */
        public String getCookie() {
            return this.cookie;
        }

        /**
         * @return cookieTimeout
         */
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableConnectionDrain
         */
        public Boolean getEnableConnectionDrain() {
            return this.enableConnectionDrain;
        }

        /**
         * @return httpsCaCertId
         */
        public String getHttpsCaCertId() {
            return this.httpsCaCertId;
        }

        /**
         * @return httpsCertId
         */
        public String getHttpsCertId() {
            return this.httpsCertId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return stickySession
         */
        public Boolean getStickySession() {
            return this.stickySession;
        }

        /**
         * @return stickySessionType
         */
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private Integer connectionDrainTimeout; 
            private String cookie; 
            private Integer cookieTimeout; 
            private Long createTime; 
            private Boolean enableConnectionDrain; 
            private String httpsCaCertId; 
            private String httpsCertId; 
            private Integer port; 
            private String protocol; 
            private Boolean stickySession; 
            private String stickySessionType; 
            private Integer targetPort; 
            private String vServerGroupId; 

            private Builder() {
            } 

            private Builder(Intranet model) {
                this.connectionDrainTimeout = model.connectionDrainTimeout;
                this.cookie = model.cookie;
                this.cookieTimeout = model.cookieTimeout;
                this.createTime = model.createTime;
                this.enableConnectionDrain = model.enableConnectionDrain;
                this.httpsCaCertId = model.httpsCaCertId;
                this.httpsCertId = model.httpsCertId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.stickySession = model.stickySession;
                this.stickySessionType = model.stickySessionType;
                this.targetPort = model.targetPort;
                this.vServerGroupId = model.vServerGroupId;
            } 

            /**
             * ConnectionDrainTimeout.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * <p>The cookie configured on the server.</p>
             * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces, and cannot start with a dollar sign ($).</p>
             * <blockquote>
             * <p>This parameter is required and valid only when <strong>StickySession</strong> is set to <strong>on</strong> and <strong>StickySessionType</strong> is set to <strong>server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>wwe</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The cookie timeout period. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * <blockquote>
             * <p>This parameter is required and valid only when <strong>StickySession</strong> is set to <strong>on</strong> and <strong>StickySessionType</strong> is set to <strong>insert</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>The timestamp when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1741247308294</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableConnectionDrain.
             */
            public Builder enableConnectionDrain(Boolean enableConnectionDrain) {
                this.enableConnectionDrain = enableConnectionDrain;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud CA certificate for the HTTPS protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
             */
            public Builder httpsCaCertId(String httpsCaCertId) {
                this.httpsCaCertId = httpsCaCertId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud certificate for the HTTPS protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
             */
            public Builder httpsCertId(String httpsCertId) {
                this.httpsCertId = httpsCertId;
                return this;
            }

            /**
             * <p>The SLB listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The supported protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Indicates whether session persistence is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stickySession(Boolean stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * <p>The cookie processing method. Valid values:</p>
             * <ul>
             * <li><p><strong>insert</strong>: Inserts a cookie. When a client accesses the service for the first time, load balancing inserts a cookie into the response. The next time the client accesses the service with this cookie, the load balancing service forwards the request to the previously recorded backend server.</p>
             * </li>
             * <li><p><strong>server</strong>: Rewrites a cookie. When load balancing detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the service with the new cookie, the load balancing service forwards the request to the previously recorded backend server.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is required and valid only when <strong>StickySession</strong> is set to <strong>on</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>insert</p>
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>The container port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Intranet build() {
                return new Intranet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationSlbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSlbsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Internet")
        private java.util.List<Internet> internet;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("InternetSlbChargeType")
        private String internetSlbChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetSlbExpired")
        private Boolean internetSlbExpired;

        @com.aliyun.core.annotation.NameInMap("InternetSlbId")
        private String internetSlbId;

        @com.aliyun.core.annotation.NameInMap("Intranet")
        private java.util.List<Intranet> intranet;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetSlbChargeType")
        private String intranetSlbChargeType;

        @com.aliyun.core.annotation.NameInMap("IntranetSlbExpired")
        private Boolean intranetSlbExpired;

        @com.aliyun.core.annotation.NameInMap("IntranetSlbId")
        private String intranetSlbId;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.internet = builder.internet;
            this.internetIp = builder.internetIp;
            this.internetSlbChargeType = builder.internetSlbChargeType;
            this.internetSlbExpired = builder.internetSlbExpired;
            this.internetSlbId = builder.internetSlbId;
            this.intranet = builder.intranet;
            this.intranetIp = builder.intranetIp;
            this.intranetSlbChargeType = builder.intranetSlbChargeType;
            this.intranetSlbExpired = builder.intranetSlbExpired;
            this.intranetSlbId = builder.intranetSlbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return internet
         */
        public java.util.List<Internet> getInternet() {
            return this.internet;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return internetSlbChargeType
         */
        public String getInternetSlbChargeType() {
            return this.internetSlbChargeType;
        }

        /**
         * @return internetSlbExpired
         */
        public Boolean getInternetSlbExpired() {
            return this.internetSlbExpired;
        }

        /**
         * @return internetSlbId
         */
        public String getInternetSlbId() {
            return this.internetSlbId;
        }

        /**
         * @return intranet
         */
        public java.util.List<Intranet> getIntranet() {
            return this.intranet;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return intranetSlbChargeType
         */
        public String getIntranetSlbChargeType() {
            return this.intranetSlbChargeType;
        }

        /**
         * @return intranetSlbExpired
         */
        public Boolean getIntranetSlbExpired() {
            return this.intranetSlbExpired;
        }

        /**
         * @return intranetSlbId
         */
        public String getIntranetSlbId() {
            return this.intranetSlbId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String clusterId; 
            private java.util.List<Internet> internet; 
            private String internetIp; 
            private String internetSlbChargeType; 
            private Boolean internetSlbExpired; 
            private String internetSlbId; 
            private java.util.List<Intranet> intranet; 
            private String intranetIp; 
            private String intranetSlbChargeType; 
            private Boolean intranetSlbExpired; 
            private String intranetSlbId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.clusterId = model.clusterId;
                this.internet = model.internet;
                this.internetIp = model.internetIp;
                this.internetSlbChargeType = model.internetSlbChargeType;
                this.internetSlbExpired = model.internetSlbExpired;
                this.internetSlbId = model.internetSlbId;
                this.intranet = model.intranet;
                this.intranetIp = model.intranetIp;
                this.intranetSlbChargeType = model.intranetSlbChargeType;
                this.intranetSlbExpired = model.intranetSlbExpired;
                this.intranetSlbId = model.intranetSlbId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>495fc79c-ae61-4600-866d-a09d68******</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The Internet-facing SLB configuration.</p>
             */
            public Builder internet(java.util.List<Internet> internet) {
                this.internet = internet;
                return this;
            }

            /**
             * <p>The Internet-facing SLB address.</p>
             * 
             * <strong>example:</strong>
             * <p><code>59.74.**.**</code></p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The billing method of Internet-facing load balancing.</p>
             * 
             * <strong>example:</strong>
             * <p>PayBySpec</p>
             */
            public Builder internetSlbChargeType(String internetSlbChargeType) {
                this.internetSlbChargeType = internetSlbChargeType;
                return this;
            }

            /**
             * <p>Indicates whether the Internet-facing SLB instance has expired.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder internetSlbExpired(Boolean internetSlbExpired) {
                this.internetSlbExpired = internetSlbExpired;
                return this;
            }

            /**
             * <p>The ID of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf6xc7wybefehnv45****</p>
             */
            public Builder internetSlbId(String internetSlbId) {
                this.internetSlbId = internetSlbId;
                return this;
            }

            /**
             * <p>The internal SLB configuration.</p>
             */
            public Builder intranet(java.util.List<Intranet> intranet) {
                this.intranet = intranet;
                return this;
            }

            /**
             * <p>The internal IP address of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The billing method of internal load balancing.</p>
             * 
             * <strong>example:</strong>
             * <p>PayBySpec</p>
             */
            public Builder intranetSlbChargeType(String intranetSlbChargeType) {
                this.intranetSlbChargeType = intranetSlbChargeType;
                return this;
            }

            /**
             * <p>Indicates whether the internal SLB instance has expired.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder intranetSlbExpired(Boolean intranetSlbExpired) {
                this.intranetSlbExpired = intranetSlbExpired;
                return this;
            }

            /**
             * <p>The ID of the internal SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf6xc7wybefehnv45****</p>
             */
            public Builder intranetSlbId(String intranetSlbId) {
                this.intranetSlbId = intranetSlbId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
