// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeGrantRulesToResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToResourceResponseBody</p>
 */
public class DescribeGrantRulesToResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GrantRules")
    private java.util.List<GrantRules> grantRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantRules
     */
    public java.util.List<GrantRules> getGrantRules() {
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
        private java.util.List<GrantRules> grantRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeGrantRulesToResourceResponseBody model) {
            this.grantRules = model.grantRules;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The permissions that are granted to the CEN instance.</p>
         */
        public Builder grantRules(java.util.List<GrantRules> grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * <ul>
         * <li>If no value is specified for <strong>MaxResults</strong>, query results are returned in one batch. The value of <strong>MaxResults</strong> indicates the total number of entries.</li>
         * <li>If a value is specified for <strong>MaxResults</strong>, query results are returned in batches. The value of <strong>MaxResults</strong> in the response indicates the number of entries in the current batch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If the <strong>NextToken</strong> parameter is empty, no next page exists.</li>
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
         * <p>C6E5992C-A57B-5A6C-9B26-568074DC68BA</p>
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

        public DescribeGrantRulesToResourceResponseBody build() {
            return new DescribeGrantRulesToResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantRulesToResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesToResourceResponseBody</p>
     */
    public static class GrantRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        private GrantRules(Builder builder) {
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.createTime = builder.createTime;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
            private String createTime; 
            private String orderType; 

            private Builder() {
            } 

            private Builder(GrantRules model) {
                this.cenId = model.cenId;
                this.cenOwnerId = model.cenOwnerId;
                this.createTime = model.createTime;
                this.orderType = model.orderType;
            } 

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-44m0p68spvlrqq****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>The timestamp when the permissions were granted. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-24T16:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The entity that pays the fees of the network instance. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>PayByCenOwner</strong>: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the CEN instance belongs.</li>
             * <li><strong>PayByResourceOwner</strong>: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the network instance belongs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByCenOwner</p>
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
