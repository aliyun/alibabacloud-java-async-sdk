// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToCenResponseBody</p>
 */
public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GrantRules")
    private GrantRules grantRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeGrantRulesToCenResponseBody(Builder builder) {
        this.grantRules = builder.grantRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesToCenResponseBody create() {
        return builder().build();
    }

    /**
     * @return grantRules
     */
    public GrantRules getGrantRules() {
        return this.grantRules;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private GrantRules grantRules; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The permissions that are granted to the CEN instance.</p>
         */
        public Builder grantRules(GrantRules grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * <ul>
         * <li>If no value is specified for <strong>MaxResults</strong>, query results are returned in one batch. The value of <strong>MaxResults</strong> indicates the total number of entries.</li>
         * <li>If a value is specified for <strong>MaxResults</strong>, it indicates that you need to query results in batches. The value of <strong>MaxResults</strong> in the response indicates the number of entries in the current batch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
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
         * <p>4906B209-8613-5C19-9CC9-B7A3FFDA731C</p>
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantRulesToCenResponseBody build() {
            return new DescribeGrantRulesToCenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesToCenResponseBody</p>
     */
    public static class GrantRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
        private String childInstanceId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceOwnerId")
        private Long childInstanceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
        private String childInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceType")
        private String childInstanceType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        private GrantRule(Builder builder) {
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.childInstanceId = builder.childInstanceId;
            this.childInstanceOwnerId = builder.childInstanceOwnerId;
            this.childInstanceRegionId = builder.childInstanceRegionId;
            this.childInstanceType = builder.childInstanceType;
            this.createTime = builder.createTime;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRule create() {
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
         * @return childInstanceId
         */
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        /**
         * @return childInstanceOwnerId
         */
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        /**
         * @return childInstanceRegionId
         */
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        /**
         * @return childInstanceType
         */
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
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
            private String childInstanceId; 
            private Long childInstanceOwnerId; 
            private String childInstanceRegionId; 
            private String childInstanceType; 
            private Long createTime; 
            private String orderType; 

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-nye53d7p3hzyu4****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1rgeww9mdstuuar****</p>
             */
            public Builder childInstanceId(String childInstanceId) {
                this.childInstanceId = childInstanceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
                this.childInstanceOwnerId = childInstanceOwnerId;
                return this;
            }

            /**
             * <p>The region ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder childInstanceRegionId(String childInstanceRegionId) {
                this.childInstanceRegionId = childInstanceRegionId;
                return this;
            }

            /**
             * <p>The type of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC</li>
             * <li><strong>VBR</strong>: VBR</li>
             * <li><strong>CCN</strong>: CCN instance</li>
             * <li><strong>VPN</strong>: IPsec-VPN connection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder childInstanceType(String childInstanceType) {
                this.childInstanceType = childInstanceType;
                return this;
            }

            /**
             * <p>The time when the permissions were granted to the CEN instance.</p>
             * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-24T16:27Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The entity that pays the fees of the network instance. Valid values:</p>
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

            public GrantRule build() {
                return new GrantRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesToCenResponseBody</p>
     */
    public static class GrantRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantRule")
        private java.util.List < GrantRule> grantRule;

        private GrantRules(Builder builder) {
            this.grantRule = builder.grantRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRules create() {
            return builder().build();
        }

        /**
         * @return grantRule
         */
        public java.util.List < GrantRule> getGrantRule() {
            return this.grantRule;
        }

        public static final class Builder {
            private java.util.List < GrantRule> grantRule; 

            /**
             * GrantRule.
             */
            public Builder grantRule(java.util.List < GrantRule> grantRule) {
                this.grantRule = grantRule;
                return this;
            }

            public GrantRules build() {
                return new GrantRules(this);
            } 

        } 

    }
}
