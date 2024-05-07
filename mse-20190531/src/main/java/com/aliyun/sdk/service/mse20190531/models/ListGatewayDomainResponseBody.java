// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayDomainResponseBody</p>
 */
public class ListGatewayDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGatewayDomainResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayDomainResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewayDomainResponseBody build() {
            return new ListGatewayDomainResponseBody(this);
        } 

    } 

    public static class Comment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Comment(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comment create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            /**
             * The route status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Comment build() {
                return new Comment(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertBeforeDate")
        private String certBeforeDate;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private Comment comment;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Http2")
        private String http2;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MustHttps")
        private Boolean mustHttps;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TlsMax")
        private String tlsMax;

        @com.aliyun.core.annotation.NameInMap("TlsMin")
        private String tlsMin;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.certBeforeDate = builder.certBeforeDate;
            this.certIdentifier = builder.certIdentifier;
            this.comment = builder.comment;
            this.gatewayId = builder.gatewayId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.http2 = builder.http2;
            this.id = builder.id;
            this.mustHttps = builder.mustHttps;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.tlsMax = builder.tlsMax;
            this.tlsMin = builder.tlsMin;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certBeforeDate
         */
        public String getCertBeforeDate() {
            return this.certBeforeDate;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return comment
         */
        public Comment getComment() {
            return this.comment;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
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
         * @return http2
         */
        public String getHttp2() {
            return this.http2;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mustHttps
         */
        public Boolean getMustHttps() {
            return this.mustHttps;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tlsMax
         */
        public String getTlsMax() {
            return this.tlsMax;
        }

        /**
         * @return tlsMin
         */
        public String getTlsMin() {
            return this.tlsMin;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String certBeforeDate; 
            private String certIdentifier; 
            private Comment comment; 
            private Long gatewayId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String http2; 
            private Long id; 
            private Boolean mustHttps; 
            private String name; 
            private String protocol; 
            private Integer status; 
            private String tlsMax; 
            private String tlsMin; 
            private String type; 

            /**
             * The time when the certificate expires.
             */
            public Builder certBeforeDate(String certBeforeDate) {
                this.certBeforeDate = certBeforeDate;
                return this;
            }

            /**
             * The certificate ID.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * The route comment. This parameter is returned only in ingress scenarios.
             */
            public Builder comment(Comment comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The gateway ID.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The time when the domain name was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the domain name was updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether `HTTP/2` is enabled.
             * <p>
             * 
             * *   `open`: `HTTP/2` is enabled.
             * *   `close`: `HTTP/2` is disabled.
             * *   `globalConfig`: Global configurations are used.
             */
            public Builder http2(String http2) {
                this.http2 = http2;
                return this;
            }

            /**
             * The ID of the domain name.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether HTTPS is forcefully used.
             */
            public Builder mustHttps(Boolean mustHttps) {
                this.mustHttps = mustHttps;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The state of the domain name. Valid values:
             * <p>
             * 
             * *   0: unpublished
             * *   2: publishing
             * *   3: published
             * *   4: editing
             * *   5: unpublishing
             * *   6: unavailable
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The maximum version of Transport Layer Security (TLS).
             */
            public Builder tlsMax(String tlsMax) {
                this.tlsMax = tlsMax;
                return this;
            }

            /**
             * The minimum version of TLS.
             */
            public Builder tlsMin(String tlsMin) {
                this.tlsMin = tlsMin;
                return this;
            }

            /**
             * The type of the domain name source. Valid values:
             * <p>
             * 
             * *   Op: console
             * *   Ingress: MSE Ingress
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
