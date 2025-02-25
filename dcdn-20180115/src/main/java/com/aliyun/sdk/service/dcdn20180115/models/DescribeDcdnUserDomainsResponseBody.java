// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserDomainsResponseBody</p>
 */
public class DescribeDcdnUserDomainsResponseBody extends TeaModel {
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

    private DescribeDcdnUserDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserDomainsResponseBody create() {
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
         * <p>The information about the queried domains.</p>
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AA75AADB-5E25-4970-B480-EAA1F5658483</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnUserDomainsResponseBody build() {
            return new DescribeDcdnUserDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserDomainsResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

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
             * <p>The address of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The port of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
     * {@link DescribeDcdnUserDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserDomainsResponseBody</p>
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
     * {@link DescribeDcdnUserDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserDomainsResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private Long domainId;

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

        @com.aliyun.core.annotation.NameInMap("Sandbox")
        private String sandbox;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private Sources sources;

        private PageData(Builder builder) {
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.functionType = builder.functionType;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.resourceGroupId = builder.resourceGroupId;
            this.SSLProtocol = builder.SSLProtocol;
            this.sandbox = builder.sandbox;
            this.scene = builder.scene;
            this.sources = builder.sources;
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
         * @return sandbox
         */
        public String getSandbox() {
            return this.sandbox;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
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
            private Long domainId; 
            private String domainName; 
            private String domainStatus; 
            private String functionType; 
            private String gmtCreated; 
            private String gmtModified; 
            private String resourceGroupId; 
            private String SSLProtocol; 
            private String sandbox; 
            private String scene; 
            private Sources sources; 

            /**
             * <p>The CNAME of the domain.</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyun.com.w.alikunlun.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The reason why the domain failed the review.</p>
             * 
             * <strong>example:</strong>
             * <p>audit failed</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11223344</p>
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The domain status.</p>
             * <ul>
             * <li><strong>online</strong>: The domain is active.</li>
             * <li><strong>offline</strong>: The domain is suspended.</li>
             * <li><strong>configuring</strong>: The domain is being configured.</li>
             * <li><strong>configure_failed</strong>: The domain failed to be configured.</li>
             * <li><strong>checking</strong>: The domain is under review.</li>
             * <li><strong>check_failed</strong>: The domain failed the review.</li>
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
             * <p>The computing service type. Valid values:</p>
             * <ul>
             * <li><strong>routine</strong></li>
             * <li><strong>image</strong></li>
             * <li><strong>cloudFunction</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>routine</p>
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * <p>The time when the domain was added to DCDN.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-10-28T11:05:50Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the domain was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-10-28T09:31:59Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmv6jutt**</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS was enabled.</p>
             * <ul>
             * <li><strong>on</strong>: enabled.</li>
             * <li><strong>off</strong>: disabled.</li>
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
             * <p>The sandbox status.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder sandbox(String sandbox) {
                this.sandbox = sandbox;
                return this;
            }

            /**
             * <p>The acceleration scenario. Valid values:</p>
             * <ul>
             * <li><strong>apiscene</strong>: accelerates response to API calls.</li>
             * <li><strong>webservicescene</strong>: accelerates content delivery for websites.</li>
             * <li><strong>staticscene</strong>: accelerates the delivery of videos, images, and text.</li>
             * <li>**If you leave this parameter empty, no scenarios are supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>apiscene</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The information about the origin servers.</p>
             */
            public Builder sources(Sources sources) {
                this.sources = sources;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnUserDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserDomainsResponseBody</p>
     */
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
