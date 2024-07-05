// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainDetailResponseBody</p>
 */
public class DescribeVodDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainDetail")
    private DomainDetail domainDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainDetailResponseBody(Builder builder) {
        this.domainDetail = builder.domainDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainDetail
     */
    public DomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainDetail domainDetail; 
        private String requestId; 

        /**
         * The basic information about the domain name for CDN.
         */
        public Builder domainDetail(DomainDetail domainDetail) {
            this.domainDetail = domainDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainDetailResponseBody build() {
            return new DescribeVodDomainDetailResponseBody(this);
        } 

    } 

    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private Source(Builder builder) {
            this.content = builder.content;
            this.enabled = builder.enabled;
            this.port = builder.port;
            this.priority = builder.priority;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String content; 
            private String enabled; 
            private Integer port; 
            private String priority; 
            private String type; 
            private String weight; 

            /**
             * The address of the origin server.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The status of the origin server. Valid values:
             * <p>
             * *   **online**: indicates that the origin server is enabled.
             * *   **offline**: indicates that the origin server is disabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The port number. Valid values: 443 and 80.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The priority of the origin server.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The type of the origin server. Valid values:
             * <p>
             * *   **ipaddr**: a server that you can access by using an IP address.
             * *   **domain**: a server that you can access by using a domain name.
             * *   **oss**: the URL of an Object Storage Service (OSS) bucket.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the origin server if multiple origin servers have been specified.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private java.util.List < Source> source;

        private Sources(Builder builder) {
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public java.util.List < Source> getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.List < Source> source; 

            /**
             * Source.
             */
            public Builder source(java.util.List < Source> source) {
                this.source = source;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    public static class DomainDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("SSLProtocol")
        private String SSLProtocol;

        @com.aliyun.core.annotation.NameInMap("SSLPub")
        private String SSLPub;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private Sources sources;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private DomainDetail(Builder builder) {
            this.certName = builder.certName;
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.SSLProtocol = builder.SSLProtocol;
            this.SSLPub = builder.SSLPub;
            this.scope = builder.scope;
            this.sources = builder.sources;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainDetail create() {
            return builder().build();
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return SSLProtocol
         */
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        /**
         * @return SSLPub
         */
        public String getSSLPub() {
            return this.SSLPub;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return sources
         */
        public Sources getSources() {
            return this.sources;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String certName; 
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String gmtCreated; 
            private String gmtModified; 
            private String SSLProtocol; 
            private String SSLPub; 
            private String scope; 
            private Sources sources; 
            private String weight; 

            /**
             * The name of the certificate. The value of this parameter is returned if HTTPS is enabled.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The CNAME that is assigned to the domain name for CDN. You must add a CNAME record in the system of your Domain Name System (DNS) service provider to map the domain name for CDN to the CNAME.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The description of the domain name for CDN.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The domain name for CDN.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The status of the domain name for CDN. Value values:
             * <p>
             * *   **online**: indicates that the domain name is enabled.
             * *   **offline**: indicates that the domain name is disabled.
             * *   **configuring**: indicates that the domain name is being configured.
             * *   **configure_failed**: indicates that the domain name failed to be configured.
             * *   **checking**: indicates that the domain name is under review.
             * *   **check_failed**: indicates that the domain name failed the review.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * The time when the domain name for CDN was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The last time when the domain name for CDN was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether the Secure Sockets Layer (SSL) certificate is enabled. Valid values:
             * <p>
             * *   **on**: indicates that the SSL certificate is enabled.
             * *   **off**: indicates that the SSL certificate is disabled.
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * The public key of the certificate. The value of this parameter is returned if HTTPS is enabled.
             */
            public Builder SSLPub(String SSLPub) {
                this.SSLPub = SSLPub;
                return this;
            }

            /**
             * This parameter is applicable to users of level 3 or higher in mainland China and users outside mainland China. Valid values:
             * <p>
             * *   **domestic**: mainland China. This is the default value.
             * *   **overseas**: outside mainland China.
             * *   **global**: regions in and outside mainland China.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The information about the origin server.
             */
            public Builder sources(Sources sources) {
                this.sources = sources;
                return this;
            }

            /**
             * The weight of the origin server.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public DomainDetail build() {
                return new DomainDetail(this);
            } 

        } 

    }
}
