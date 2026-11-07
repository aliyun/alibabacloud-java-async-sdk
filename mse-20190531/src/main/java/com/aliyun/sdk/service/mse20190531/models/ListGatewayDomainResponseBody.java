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
 * {@link ListGatewayDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayDomainResponseBody</p>
 */
public class ListGatewayDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListGatewayDomainResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The node data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to perform this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3F5D8E93-CA66-57F1-8BCF-A223E11B6B91</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
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

        public ListGatewayDomainResponseBody build() {
            return new ListGatewayDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayDomainResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayDomainResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Comment model) {
                this.status = model.status;
            } 

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Error</p>
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
    /**
     * 
     * {@link ListGatewayDomainResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayDomainResponseBody</p>
     */
    public static class TlsCipherSuitesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("TlsCipherSuites")
        private java.util.List<String> tlsCipherSuites;

        private TlsCipherSuitesConfig(Builder builder) {
            this.configType = builder.configType;
            this.tlsCipherSuites = builder.tlsCipherSuites;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TlsCipherSuitesConfig create() {
            return builder().build();
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return tlsCipherSuites
         */
        public java.util.List<String> getTlsCipherSuites() {
            return this.tlsCipherSuites;
        }

        public static final class Builder {
            private String configType; 
            private java.util.List<String> tlsCipherSuites; 

            private Builder() {
            } 

            private Builder(TlsCipherSuitesConfig model) {
                this.configType = model.configType;
                this.tlsCipherSuites = model.tlsCipherSuites;
            } 

            /**
             * <p>The TLS encrypt cipher suite configuration type. DEFAULT indicates the default configurations, and CUSTOM indicates a custom configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The list of TLS cipher suite names.</p>
             */
            public Builder tlsCipherSuites(java.util.List<String> tlsCipherSuites) {
                this.tlsCipherSuites = tlsCipherSuites;
                return this;
            }

            public TlsCipherSuitesConfig build() {
                return new TlsCipherSuitesConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayDomainResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayDomainResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertBeforeDate")
        private String certBeforeDate;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private Comment comment;

        @com.aliyun.core.annotation.NameInMap("EnableWaf")
        private Boolean enableWaf;

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

        @com.aliyun.core.annotation.NameInMap("IsManaged")
        private Boolean isManaged;

        @com.aliyun.core.annotation.NameInMap("MustHttps")
        private Boolean mustHttps;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupportWaf")
        private Boolean supportWaf;

        @com.aliyun.core.annotation.NameInMap("TlsCipherSuitesConfig")
        private TlsCipherSuitesConfig tlsCipherSuitesConfig;

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
            this.enableWaf = builder.enableWaf;
            this.gatewayId = builder.gatewayId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.http2 = builder.http2;
            this.id = builder.id;
            this.isManaged = builder.isManaged;
            this.mustHttps = builder.mustHttps;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.supportWaf = builder.supportWaf;
            this.tlsCipherSuitesConfig = builder.tlsCipherSuitesConfig;
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
         * @return enableWaf
         */
        public Boolean getEnableWaf() {
            return this.enableWaf;
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
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
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
         * @return supportWaf
         */
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

        /**
         * @return tlsCipherSuitesConfig
         */
        public TlsCipherSuitesConfig getTlsCipherSuitesConfig() {
            return this.tlsCipherSuitesConfig;
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
            private Boolean enableWaf; 
            private Long gatewayId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String http2; 
            private Long id; 
            private Boolean isManaged; 
            private Boolean mustHttps; 
            private String name; 
            private String protocol; 
            private Integer status; 
            private Boolean supportWaf; 
            private TlsCipherSuitesConfig tlsCipherSuitesConfig; 
            private String tlsMax; 
            private String tlsMin; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.certBeforeDate = model.certBeforeDate;
                this.certIdentifier = model.certIdentifier;
                this.comment = model.comment;
                this.enableWaf = model.enableWaf;
                this.gatewayId = model.gatewayId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.http2 = model.http2;
                this.id = model.id;
                this.isManaged = model.isManaged;
                this.mustHttps = model.mustHttps;
                this.name = model.name;
                this.protocol = model.protocol;
                this.status = model.status;
                this.supportWaf = model.supportWaf;
                this.tlsCipherSuitesConfig = model.tlsCipherSuitesConfig;
                this.tlsMax = model.tlsMax;
                this.tlsMin = model.tlsMin;
                this.type = model.type;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The expiration time of the certificate. Go to the domain name details page to view the information.</p>
             * 
             * <strong>example:</strong>
             * <p>2031-03-30 02:35:12</p>
             */
            public Builder certBeforeDate(String certBeforeDate) {
                this.certBeforeDate = certBeforeDate;
                return this;
            }

            /**
             * <p>The certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3452-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The route remark (Ingress).</p>
             */
            public Builder comment(Comment comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Indicates whether WAF protection is enabled for the domain name.</p>
             */
            public Builder enableWaf(Boolean enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The time when the domain name record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2031-03-30 02:35:12</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the domain name record was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2031-03-30 02:35:12</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
             * <ul>
             * <li><code>open</code>: HTTP/2 is enabled.</li>
             * <li><code>close</code>: HTTP/2 is disabled.</li>
             * <li><code>globalConfig</code>: The global configuration is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>close</p>
             */
            public Builder http2(String http2) {
                this.http2 = http2;
                return this;
            }

            /**
             * <p>The domain name ID.</p>
             * 
             * <strong>example:</strong>
             * <p>243</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is managed.</p>
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS is forced.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mustHttps(Boolean mustHttps) {
                this.mustHttps = mustHttps;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The domain name status. Valid values:</p>
             * <ul>
             * <li>0: unpublished</li>
             * <li>2: publishing</li>
             * <li>3: published</li>
             * <li>4: editing</li>
             * <li>5: taking offline</li>
             * <li>6: unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the gateway supports WAF protection.</p>
             */
            public Builder supportWaf(Boolean supportWaf) {
                this.supportWaf = supportWaf;
                return this;
            }

            /**
             * <p>The TLS cipher suite configuration, including the configuration type and the list of cipher suite names.</p>
             */
            public Builder tlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
                this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
                return this;
            }

            /**
             * <p>The maximum TLS version.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS 1.3</p>
             */
            public Builder tlsMax(String tlsMax) {
                this.tlsMax = tlsMax;
                return this;
            }

            /**
             * <p>The minimum TLS version.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS 1.0</p>
             */
            public Builder tlsMin(String tlsMin) {
                this.tlsMin = tlsMin;
                return this;
            }

            /**
             * <p>The source type of the domain name. Valid values:</p>
             * <ul>
             * <li>Op: created in the console</li>
             * <li>Ingress: created by MSE Ingress</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Op</p>
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
