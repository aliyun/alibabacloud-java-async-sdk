// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnIpaDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnIpaDomainDetailResponseBody</p>
 */
public class DescribeDcdnIpaDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainDetail")
    private DomainDetail domainDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnIpaDomainDetailResponseBody(Builder builder) {
        this.domainDetail = builder.domainDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnIpaDomainDetailResponseBody create() {
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
         * <p>The details about the accelerated domain name.</p>
         */
        public Builder domainDetail(DomainDetail domainDetail) {
            this.domainDetail = domainDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>09ABE829-6CD3-4FE0-AFEE-556113E29727</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnIpaDomainDetailResponseBody build() {
            return new DescribeDcdnIpaDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnIpaDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnIpaDomainDetailResponseBody</p>
     */
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
             * <p>The address of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The custom port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of the origin server. Valid values:</p>
             * <ul>
             * <li><strong>ipaddr</strong>: an origin IP address</li>
             * <li><strong>domain</strong>: a domain name.</li>
             * <li><strong>oss</strong>: Object Storage Service (OSS) buckets are not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the origin server if multiple origin servers have been specified.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeDcdnIpaDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnIpaDomainDetailResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDcdnIpaDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnIpaDomainDetailResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SSLProtocol")
        private String SSLProtocol;

        @com.aliyun.core.annotation.NameInMap("SSLPub")
        private String SSLPub;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private Sources sources;

        private DomainDetail(Builder builder) {
            this.certName = builder.certName;
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.resourceGroupId = builder.resourceGroupId;
            this.SSLProtocol = builder.SSLProtocol;
            this.SSLPub = builder.SSLPub;
            this.scope = builder.scope;
            this.sources = builder.sources;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public static final class Builder {
            private String certName; 
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String gmtCreated; 
            private String gmtModified; 
            private String resourceGroupId; 
            private String SSLProtocol; 
            private String SSLPub; 
            private String scope; 
            private Sources sources; 

            /**
             * <p>Indicates the name of the certificate if the HTTPS protocol is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>yourCertName</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The CNAME assigned to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>audit failed</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The accelerated domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of the accelerated domain name. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: enabled</li>
             * <li><strong>offline</strong>: disabled</li>
             * <li><strong>configuring</strong>: configuring</li>
             * <li><strong>configure_failed</strong>: configuration failed</li>
             * <li><strong>checking</strong>: reviewing</li>
             * <li><strong>check_failed:</strong> review failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-27T06:51:26Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the domain name was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-27T06:51:26Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyuji4b6xxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the Security Socket Layer (SSL) certificate is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * <p>The public key of the certificate if HTTPS is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>SSLPub</p>
             */
            public Builder SSLPub(String SSLPub) {
                this.SSLPub = SSLPub;
                return this;
            }

            /**
             * <p>The acceleration region. Valid values:</p>
             * <ul>
             * <li>domestic: Chinese mainland</li>
             * <li>overseas: outside the Chinese mainland</li>
             * <li>global: global</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>overseas</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The information about the origin server.</p>
             */
            public Builder sources(Sources sources) {
                this.sources = sources;
                return this;
            }

            public DomainDetail build() {
                return new DomainDetail(this);
            } 

        } 

    }
}
