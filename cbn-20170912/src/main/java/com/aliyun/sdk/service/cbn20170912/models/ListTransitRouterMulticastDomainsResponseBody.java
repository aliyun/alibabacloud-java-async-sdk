// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterMulticastDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterMulticastDomainsResponseBody</p>
 */
public class ListTransitRouterMulticastDomainsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterMulticastDomains")
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
         * $.parameters[8].schema.example
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * $.parameters[8].schema.enumValueTitles
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * $.parameters[7].schema.enumValueTitles
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * $.parameters[8].schema.description
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * {
         * <p>
         *     "RequestId": "8A0F93D1-FD6C-56FC-B6D2-668FC92D12D2",
         *     "TotalCount": 1,
         *     "MaxResults": 20,
         *     "NextToken": "FFmyTO70tTpLG6I3FmYAXGKPd****",
         *     "TransitRouterMulticastDomains": [
         *         {
         *             "TransitRouterMulticastDomainId": "tr-mcast-domain-3r3bvbypxqheej****",
         *             "TransitRouterMulticastDomainName": "nametest",
         *             "TransitRouterMulticastDomainDescription": "desctest",
         *             "Status": "Active"
         *         }
         *     ]
         * }
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterMulticastDomainDescription")
        private String transitRouterMulticastDomainDescription;

        @NameInMap("TransitRouterMulticastDomainId")
        private String transitRouterMulticastDomainId;

        @NameInMap("TransitRouterMulticastDomainName")
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
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * WB656982
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TransitRouterId.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * ListTransitRouterMulticastDomains
             */
            public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
                this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
                return this;
            }

            /**
             * <ListTransitRouterMulticastDomainsResponse>
             * <p>
             *     <RequestId>8A0F93D1-FD6C-56FC-B6D2-668FC92D12D2</RequestId>
             *     <TotalCount>1</TotalCount>
             *     <MaxResults>20</MaxResults>
             *     <NextToken>FFmyTO70tTpLG6I3FmYAXGKPd****</NextToken>
             *     <TransitRouterMulticastDomains>
             *         <TransitRouterMulticastDomainId>tr-mcast-domain-3r3bvbypxqheej****</TransitRouterMulticastDomainId>
             *         <TransitRouterMulticastDomainName>nametest</TransitRouterMulticastDomainName>
             *         <TransitRouterMulticastDomainDescription>desctest</TransitRouterMulticastDomainDescription>
             *         <Status>Active</Status>
             *     </TransitRouterMulticastDomains>
             * </ListTransitRouterMulticastDomainsResponse>
             */
            public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
                this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
                return this;
            }

            /**
             * Queries the information about a multicast domain.
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
