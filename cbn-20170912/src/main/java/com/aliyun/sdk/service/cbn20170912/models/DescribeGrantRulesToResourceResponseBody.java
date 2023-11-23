// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGrantRulesToResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToResourceResponseBody</p>
 */
public class DescribeGrantRulesToResourceResponseBody extends TeaModel {
    @NameInMap("GrantRules")
    private java.util.List < GrantRules> grantRules;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGrantRulesToResourceResponseBody(Builder builder) {
        this.grantRules = builder.grantRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesToResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return grantRules
     */
    public java.util.List < GrantRules> getGrantRules() {
        return this.grantRules;
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

    public static final class Builder {
        private java.util.List < GrantRules> grantRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The permissions that are granted to the CEN instance.
         */
        public Builder grantRules(java.util.List < GrantRules> grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * *   If no value is specified for **MaxResults**, query results are returned in one batch. The value of **MaxResults** indicates the total number of entries.
         * <p>
         * *   If a value is specified for **MaxResults**, query results are returned in batches. The value of **MaxResults** in the response indicates the number of entries in the current batch.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If the **NextToken** parameter is empty, no next page exists.
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

        public DescribeGrantRulesToResourceResponseBody build() {
            return new DescribeGrantRulesToResourceResponseBody(this);
        } 

    } 

    public static class GrantRules extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @NameInMap("OrderType")
        private String orderType;

        private GrantRules(Builder builder) {
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRules create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenOwnerId
         */
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private String cenId; 
            private Long cenOwnerId; 
            private String orderType; 

            /**
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the CEN instance belongs.
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * The entity that pays the fees of the network instance. Valid values: Valid values:
             * <p>
             * 
             * *   **PayByCenOwner**: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the CEN instance belongs.
             * *   **PayByResourceOwner**: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the network instance belongs.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public GrantRules build() {
                return new GrantRules(this);
            } 

        } 

    }
}
