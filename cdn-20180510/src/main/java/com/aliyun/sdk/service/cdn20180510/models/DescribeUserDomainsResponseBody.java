// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserDomainsResponseBody</p>
 */
public class DescribeUserDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    private Domains domains;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeUserDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDomainsResponseBody create() {
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
         * The list of the accelerated domain names returned.
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUserDomainsResponseBody build() {
            return new DescribeUserDomainsResponseBody(this);
        } 

    } 

    public static class Source extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private String weight;

        private Source(Builder builder) {
            this.content = builder.content;
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
             * The port of the origin server.
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
             * The type of the origin server.
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
        @NameInMap("Source")
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
        @NameInMap("CdnType")
        private String cdnType;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("Coverage")
        private String coverage;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainId")
        private Long domainId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainStatus")
        private String domainStatus;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Sandbox")
        private String sandbox;

        @NameInMap("Sources")
        private Sources sources;

        @NameInMap("SslProtocol")
        private String sslProtocol;

        private PageData(Builder builder) {
            this.cdnType = builder.cdnType;
            this.cname = builder.cname;
            this.coverage = builder.coverage;
            this.description = builder.description;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return cdnType
         */
        public String getCdnType() {
            return this.cdnType;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainId
         */
        public Long getDomainId() {
            return this.domainId;
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
            private String cdnType; 
            private String cname; 
            private String coverage; 
            private String description; 
            private Long domainId; 
            private String domainName; 
            private String domainStatus; 
            private String gmtCreated; 
            private String gmtModified; 
            private String resourceGroupId; 
            private String sandbox; 
            private Sources sources; 
            private String sslProtocol; 

            /**
             * The type of the workload accelerated by Alibaba Cloud CDN. Valid values:
             * <p>
             * 
             * *   **web**: images and small files
             * *   **download**: large files
             * *   **video**: on-demand video and audio streaming
             */
            public Builder cdnType(String cdnType) {
                this.cdnType = cdnType;
                return this;
            }

            /**
             * The CNAME assigned to the accelerated domain name.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The acceleration region. Valid values:
             * <p>
             * 
             * *   **domestic**: Chinese mainland
             * *   **global**: global
             * *   **overseas**: outside the Chinese mainland
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * The information about Internet Content Provider (ICP) filing.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the accelerated domain name.
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * The accelerated domain.
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
             * *   **stopping**
             * *   **deleting**
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * The time when the accelerated domain name was added.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The time when the accelerated domain name was modified.
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
             * Indicates whether the accelerated domain name is in a sandbox.
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
             * Indicates whether HTTPS is enabled. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
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
        @NameInMap("PageData")
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
