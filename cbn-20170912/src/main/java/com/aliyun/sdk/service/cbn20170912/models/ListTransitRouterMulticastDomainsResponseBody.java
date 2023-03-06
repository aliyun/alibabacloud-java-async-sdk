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
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If **NextToken** is not empty, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of entries returned.
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
             * The tag key of the multicast domain.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the multicast domain.
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
            private String status; 
            private java.util.List < Tags> tags; 
            private String transitRouterId; 
            private String transitRouterMulticastDomainDescription; 
            private String transitRouterMulticastDomainId; 
            private String transitRouterMulticastDomainName; 

            /**
             * The status of the multicast domain.
             * <p>
             * 
             * Valid value: **Active**, which indicates that the multicast domain is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the multicast domain.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the transit router.
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
