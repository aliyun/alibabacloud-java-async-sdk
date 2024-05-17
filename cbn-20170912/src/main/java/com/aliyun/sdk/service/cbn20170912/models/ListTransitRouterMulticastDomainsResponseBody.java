// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about the multicast domain.
         */
        public Builder transitRouterMulticastDomains(java.util.List < TransitRouterMulticastDomains> transitRouterMulticastDomains) {
            this.transitRouterMulticastDomains = transitRouterMulticastDomains;
            return this;
        }

        public ListTransitRouterMulticastDomainsResponseBody build() {
            return new ListTransitRouterMulticastDomainsResponseBody(this);
        } 

    } 

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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The region ID of the transit router.
             * <p>
             * 
             * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the multicast domain.
             * <p>
             * 
             * The valid value is **Active**, which indicates that the multicast domain is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The transit router ID.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The description of the multicast domain.
             */
            public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
                this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
                return this;
            }

            /**
             * The ID of the multicast domain.
             */
            public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
                this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
                return this;
            }

            /**
             * The name of the multicast domain.
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
