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
         * <p>Indicates whether the information about the SLB instances that are associated with an application was obtained successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the information was obtained successfully.</li>
         * <li><strong>false</strong>: indicates that the information failed to be obtained.</li>
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the trace. It can be used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li><strong>success</strong> is returned when the request succeeds.</li>
         * <li>An error code is returned when the request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
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

        /**
         * <p>The returned data.</p>
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
        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        private Internet(Builder builder) {
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.createTime = builder.createTime;
            this.httpsCaCertId = builder.httpsCaCertId;
            this.httpsCertId = builder.httpsCertId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internet create() {
            return builder().build();
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

        public static final class Builder {
            private String cookie; 
            private Integer cookieTimeout; 
            private Long createTime; 
            private String httpsCaCertId; 
            private String httpsCertId; 
            private Integer port; 
            private String protocol; 
            private Boolean stickySession; 
            private String stickySessionType; 
            private Integer targetPort; 

            private Builder() {
            } 

            private Builder(Internet model) {
                this.cookie = model.cookie;
                this.cookieTimeout = model.cookieTimeout;
                this.createTime = model.createTime;
                this.httpsCaCertId = model.httpsCaCertId;
                this.httpsCertId = model.httpsCertId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.stickySession = model.stickySession;
                this.stickySessionType = model.stickySessionType;
                this.targetPort = model.targetPort;
            } 

            /**
             * Cookie.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * CookieTimeout.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>The timestamp when the canary release rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1741247308294</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HttpsCaCertId.
             */
            public Builder httpsCaCertId(String httpsCaCertId) {
                this.httpsCaCertId = httpsCaCertId;
                return this;
            }

            /**
             * <p>The supported protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
             */
            public Builder httpsCertId(String httpsCertId) {
                this.httpsCertId = httpsCertId;
                return this;
            }

            /**
             * <p>The ID of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The container port.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * StickySession.
             */
            public Builder stickySession(Boolean stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * StickySessionType.
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>The port specified for the SLB listener.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
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
        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        private Intranet(Builder builder) {
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.createTime = builder.createTime;
            this.httpsCaCertId = builder.httpsCaCertId;
            this.httpsCertId = builder.httpsCertId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intranet create() {
            return builder().build();
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

        public static final class Builder {
            private String cookie; 
            private Integer cookieTimeout; 
            private Long createTime; 
            private String httpsCaCertId; 
            private String httpsCertId; 
            private Integer port; 
            private String protocol; 
            private Boolean stickySession; 
            private String stickySessionType; 
            private Integer targetPort; 

            private Builder() {
            } 

            private Builder(Intranet model) {
                this.cookie = model.cookie;
                this.cookieTimeout = model.cookieTimeout;
                this.createTime = model.createTime;
                this.httpsCaCertId = model.httpsCaCertId;
                this.httpsCertId = model.httpsCertId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.stickySession = model.stickySession;
                this.stickySessionType = model.stickySessionType;
                this.targetPort = model.targetPort;
            } 

            /**
             * Cookie.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * CookieTimeout.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>The timestamp when the canary release rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1741247308294</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HttpsCaCertId.
             */
            public Builder httpsCaCertId(String httpsCaCertId) {
                this.httpsCaCertId = httpsCaCertId;
                return this;
            }

            /**
             * <p>The supported protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
             */
            public Builder httpsCertId(String httpsCertId) {
                this.httpsCertId = httpsCertId;
                return this;
            }

            /**
             * <p>The IP address of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The container port.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * StickySession.
             */
            public Builder stickySession(Boolean stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * StickySessionType.
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>The port specified for the SLB listener.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
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
             * <p>The configurations of the Internet-facing SLB instance.</p>
             */
            public Builder internet(java.util.List<Internet> internet) {
                this.internet = internet;
                return this;
            }

            /**
             * <p>The ID of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p><code>59.74.**.**</code></p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * InternetSlbChargeType.
             */
            public Builder internetSlbChargeType(String internetSlbChargeType) {
                this.internetSlbChargeType = internetSlbChargeType;
                return this;
            }

            /**
             * InternetSlbExpired.
             */
            public Builder internetSlbExpired(Boolean internetSlbExpired) {
                this.internetSlbExpired = internetSlbExpired;
                return this;
            }

            /**
             * <p>Configurations of Internet-facing SLB instances.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf6xc7wybefehnv45****</p>
             */
            public Builder internetSlbId(String internetSlbId) {
                this.internetSlbId = internetSlbId;
                return this;
            }

            /**
             * <p>The configurations of the internal-facing SLB instance.</p>
             */
            public Builder intranet(java.util.List<Intranet> intranet) {
                this.intranet = intranet;
                return this;
            }

            /**
             * <p>The error code.</p>
             * <ul>
             * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
             * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * IntranetSlbChargeType.
             */
            public Builder intranetSlbChargeType(String intranetSlbChargeType) {
                this.intranetSlbChargeType = intranetSlbChargeType;
                return this;
            }

            /**
             * IntranetSlbExpired.
             */
            public Builder intranetSlbExpired(Boolean intranetSlbExpired) {
                this.intranetSlbExpired = intranetSlbExpired;
                return this;
            }

            /**
             * <p>The IP address of the internal-facing SLB instance.</p>
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
