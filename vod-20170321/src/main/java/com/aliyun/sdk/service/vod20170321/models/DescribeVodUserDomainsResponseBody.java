// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodUserDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodUserDomainsResponseBody</p>
 */
public class DescribeVodUserDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private Domains domains;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeVodUserDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public Domains getDomains() {
        return this.domains;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Domains domains; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The detailed information about each domain name for CDN. The returned information is displayed in the format that is specified by the PageData parameter.
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVodUserDomainsResponseBody build() {
            return new DescribeVodUserDomainsResponseBody(this);
        } 

    } 

    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Source(Builder builder) {
            this.content = builder.content;
            this.port = builder.port;
            this.priority = builder.priority;
            this.type = builder.type;
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

        public static final class Builder {
            private String content; 
            private Integer port; 
            private String priority; 
            private String type; 

            /**
             * The address of the origin server.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The port number. Valid values: **443** and **80**.
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
             * 
             * *   **ipaddr**: an IP address.
             * *   **domain**: an origin domain name
             * *   **oss**: the OSS domain of an Object Storage Service (OSS) bucket
             */
            public Builder type(String type) {
                this.type = type;
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
    public static class PageData extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Sandbox")
        private String sandbox;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private Sources sources;

        @com.aliyun.core.annotation.NameInMap("SslProtocol")
        private String sslProtocol;

        private PageData(Builder builder) {
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.sandbox = builder.sandbox;
            this.sources = builder.sources;
            this.sslProtocol = builder.sslProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
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
         * @return sandbox
         */
        public String getSandbox() {
            return this.sandbox;
        }

        /**
         * @return sources
         */
        public Sources getSources() {
            return this.sources;
        }

        /**
         * @return sslProtocol
         */
        public String getSslProtocol() {
            return this.sslProtocol;
        }

        public static final class Builder {
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String gmtCreated; 
            private String gmtModified; 
            private String sandbox; 
            private Sources sources; 
            private String sslProtocol; 

            /**
             * The CNAME that is assigned to the domain name for CDN.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The remarks.
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
             * The status of the domain name for CDN. Valid values:
             * <p>
             * 
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
             * The time when the domain name for CDN was added. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The last time when the domain name for CDN was modified. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether the accelerated domain name was in a sandbox.
             */
            public Builder sandbox(String sandbox) {
                this.sandbox = sandbox;
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
             * Indicates whether HTTPS is enabled.
             * <p>
             * 
             * *   **on**: HTTPS is enabled.
             * *   **off**: HTTPS is not eabled.
             */
            public Builder sslProtocol(String sslProtocol) {
                this.sslProtocol = sslProtocol;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List < PageData> pageData;

        private Domains(Builder builder) {
            this.pageData = builder.pageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return pageData
         */
        public java.util.List < PageData> getPageData() {
            return this.pageData;
        }

        public static final class Builder {
            private java.util.List < PageData> pageData; 

            /**
             * PageData.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
