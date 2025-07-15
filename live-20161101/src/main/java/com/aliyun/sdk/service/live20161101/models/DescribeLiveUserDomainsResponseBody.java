// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveUserDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveUserDomainsResponseBody</p>
 */
public class DescribeLiveUserDomainsResponseBody extends TeaModel {
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

    private DescribeLiveUserDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveUserDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveUserDomainsResponseBody model) {
            this.domains = model.domains;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The domain names.</p>
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B15267</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLiveUserDomainsResponseBody build() {
            return new DescribeLiveUserDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveUserDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUserDomainsResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LiveDomainStatus")
        private String liveDomainStatus;

        @com.aliyun.core.annotation.NameInMap("LiveDomainType")
        private String liveDomainType;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private PageData(Builder builder) {
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.liveDomainStatus = builder.liveDomainStatus;
            this.liveDomainType = builder.liveDomainType;
            this.regionName = builder.regionName;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return liveDomainStatus
         */
        public String getLiveDomainStatus() {
            return this.liveDomainStatus;
        }

        /**
         * @return liveDomainType
         */
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String cname; 
            private String description; 
            private String domainName; 
            private String gmtCreated; 
            private String gmtModified; 
            private String liveDomainStatus; 
            private String liveDomainType; 
            private String regionName; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.cname = model.cname;
                this.description = model.description;
                this.domainName = model.domainName;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.liveDomainStatus = model.liveDomainStatus;
                this.liveDomainType = model.liveDomainType;
                this.regionName = model.regionName;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The CNAME generated for the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>learn.developer.aliyundoc.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The time when the domain name was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-29T12:15:36Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the domain name was last modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-29T12:15:36Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>online</strong></li>
             * <li><strong>offline</strong></li>
             * <li><strong>configuring</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder liveDomainStatus(String liveDomainStatus) {
                this.liveDomainStatus = liveDomainStatus;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>liveVideo</strong>: streaming domain</li>
             * <li><strong>liveEdge</strong>: ingest domain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>liveVideo</p>
             */
            public Builder liveDomainType(String liveDomainType) {
                this.liveDomainType = liveDomainType;
                return this;
            }

            /**
             * <p>The ID of the region in which the domain name resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzvyjetyjjmla</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUserDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUserDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

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
        public java.util.List<PageData> getPageData() {
            return this.pageData;
        }

        public static final class Builder {
            private java.util.List<PageData> pageData; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.pageData = model.pageData;
            } 

            /**
             * PageData.
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
