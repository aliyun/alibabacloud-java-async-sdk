// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainDetailResponseBody</p>
 */
public class DescribeDcdnDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainDetail")
    private DomainDetail domainDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainDetailResponseBody(Builder builder) {
        this.domainDetail = builder.domainDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainDetailResponseBody create() {
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
         * The information about the accelerated domain name.
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

        public DescribeDcdnDomainDetailResponseBody build() {
            return new DescribeDcdnDomainDetailResponseBody(this);
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
             * The status.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The port over which requests are redirected to the origin server. Ports 443 and 80 are supported.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The type of the origin server. Valid values:
             * <p>
             * 
             * *   **ipaddr**: an IP address
             * *   **domain**: an origin domain name
             * *   **oss**: the domain name of an Object Storage Service (OSS) bucket
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the origin server if multiple origin servers are specified.
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
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("FunctionType")
        private String functionType;

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

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private Sources sources;

        private DomainDetail(Builder builder) {
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.functionType = builder.functionType;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.resourceGroupId = builder.resourceGroupId;
            this.SSLProtocol = builder.SSLProtocol;
            this.SSLPub = builder.SSLPub;
            this.scene = builder.scene;
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
         * @return functionType
         */
        public String getFunctionType() {
            return this.functionType;
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
         * @return scene
         */
        public String getScene() {
            return this.scene;
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
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String functionType; 
            private String gmtCreated; 
            private String gmtModified; 
            private String resourceGroupId; 
            private String SSLProtocol; 
            private String SSLPub; 
            private String scene; 
            private String scope; 
            private Sources sources; 

            /**
             * The CNAME that is assigned to the accelerated domain name. You must add the CNAME record to the system of your Domain Name System (DNS) provider to map the accelerated domain name to the CNAME.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The information about the Internet content provider (ICP) filing of the domain name.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The status of the accelerated domain name. Valid values:
             * <p>
             * 
             * *   **online**
             * *   **offline**
             * *   **configuring**
             * *   **configure_failed**
             * *   **checking**
             * *   **check_failed**
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * Computing service type. Valid values:
             * <p>
             * 
             * *   **routine**
             * *   **image**
             * *   **cloudFunction**
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * The time when the domain name was added.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The time when the domain name was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the Security Socket Layer (SSL) certificate is enabled. Valid values:
             * <p>
             * 
             * *   **on**: **enabled**
             * *   **off**: **disabled**
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * The public key of the certificate if HTTPS is enabled.
             */
            public Builder SSLPub(String SSLPub) {
                this.SSLPub = SSLPub;
                return this;
            }

            /**
             * Acceleration scenario. Valid values:
             * <p>
             * 
             * *   **apiscene**: API acceleration.
             * *   **webservicescene**: website acceleration.
             * *   **staticscene**: video, image, and text acceleration.
             * *   **an empty string**: no acceleration scenario is used.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The acceleration region. Default value: domestic. Valid values:
             * <p>
             * 
             * *   **domestic**: Chinese mainland
             * *   **overseas**: global (excluding the Chinese mainland)
             * *   **global**: global
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

            public DomainDetail build() {
                return new DomainDetail(this);
            } 

        } 

    }
}
