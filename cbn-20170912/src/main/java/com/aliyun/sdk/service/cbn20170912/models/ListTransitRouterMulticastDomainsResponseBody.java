// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTransitRouterMulticastDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterMulticastDomainsResponseBody</p>
 */
public class ListTransitRouterMulticastDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomains")
    private java.util.List < TransitRouterMulticastDomains> transitRouterMulticastDomains;

    private ListTransitRouterMulticastDomainsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterMulticastDomains = builder.transitRouterMulticastDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterMulticastDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return transitRouterMulticastDomains
     */
    public java.util.List < TransitRouterMulticastDomains> getTransitRouterMulticastDomains() {
        return this.transitRouterMulticastDomains;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterMulticastDomains> transitRouterMulticastDomains; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8A0F93D1-FD6C-56FC-B6D2-668FC92D12D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the multicast domain.</p>
         */
        public Builder transitRouterMulticastDomains(java.util.List < TransitRouterMulticastDomains> transitRouterMulticastDomains) {
            this.transitRouterMulticastDomains = transitRouterMulticastDomains;
            return this;
        }

        public ListTransitRouterMulticastDomainsResponseBody build() {
            return new ListTransitRouterMulticastDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterMulticastDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterMulticastDomainsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTransitRouterMulticastDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterMulticastDomainsResponseBody</p>
     */
    public static class TransitRouterMulticastDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainDescription")
        private String transitRouterMulticastDomainDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
        private String transitRouterMulticastDomainId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainName")
        private String transitRouterMulticastDomainName;

        private TransitRouterMulticastDomains(Builder builder) {
            this.cenId = builder.cenId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterMulticastDomainDescription = builder.transitRouterMulticastDomainDescription;
            this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
            this.transitRouterMulticastDomainName = builder.transitRouterMulticastDomainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterMulticastDomains create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterMulticastDomainDescription
         */
        public String getTransitRouterMulticastDomainDescription() {
            return this.transitRouterMulticastDomainDescription;
        }

        /**
         * @return transitRouterMulticastDomainId
         */
        public String getTransitRouterMulticastDomainId() {
            return this.transitRouterMulticastDomainId;
        }

        /**
         * @return transitRouterMulticastDomainName
         */
        public String getTransitRouterMulticastDomainName() {
            return this.transitRouterMulticastDomainName;
        }

        public static final class Builder {
            private String cenId; 
            private String regionId; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String transitRouterId; 
            private String transitRouterMulticastDomainDescription; 
            private String transitRouterMulticastDomainId; 
            private String transitRouterMulticastDomainName; 

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-a7syd349kne38g****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The region ID of the transit router.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the multicast domain.</p>
             * <p>The valid value is <strong>Active</strong>, which indicates that the multicast domain is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The transit router ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-bp1c23ijrl6d6c226h***</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The description of the multicast domain.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
                this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
                return this;
            }

            /**
             * <p>The ID of the multicast domain.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-mcast-domain-3r3bvbypxqheej****</p>
             */
            public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
                this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
                return this;
            }

            /**
             * <p>The name of the multicast domain.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder transitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
                this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
                return this;
            }

            public TransitRouterMulticastDomains build() {
                return new TransitRouterMulticastDomains(this);
            } 

        } 

    }
}
