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
         * <p>The authorization information list.</p>
         */
        public Builder grantRules(java.util.List<GrantRules> grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * <ul>
         * <li>If you did not specify the <strong>MaxResults</strong> request parameter, paged query was not required. The value of <strong>MaxResults</strong> in the response indicates the total number of entries.</li>
         * <li>If you specified the <strong>MaxResults</strong> request parameter, paged query was required. The value of <strong>MaxResults</strong> in the response indicates the number of entries in the current page.</li>
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
         * <p>The pagination token. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token used to start the next query.</li>
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

        @com.aliyun.core.annotation.NameInMap("EffectiveOrderType")
        private String effectiveOrderType;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        private GrantRules(Builder builder) {
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.createTime = builder.createTime;
            this.effectiveOrderType = builder.effectiveOrderType;
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
         * @return effectiveOrderType
         */
        public String getEffectiveOrderType() {
            return this.effectiveOrderType;
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
            private String effectiveOrderType; 
            private String orderType; 

            private Builder() {
            } 

            private Builder(GrantRules model) {
                this.cenId = model.cenId;
                this.cenOwnerId = model.cenOwnerId;
                this.createTime = model.createTime;
                this.effectiveOrderType = model.effectiveOrderType;
                this.orderType = model.orderType;
            } 

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-44m0p68spvlrqq****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the CEN instance owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>The time when the authorization was created.
             * The time is displayed in UTC in the YYYY-MM-DDThh:mmZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-24T16:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The effective payer of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>PayByCenOwner</strong>: The fees generated by the network instance are paid by the account that owns the CEN instance.</li>
             * <li><strong>PayByResourceOwner</strong>: The fees generated by the network instance are paid by the account that owns the network instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByCenOwner</p>
             */
            public Builder effectiveOrderType(String effectiveOrderType) {
                this.effectiveOrderType = effectiveOrderType;
                return this;
            }

            /**
             * <p>The payer of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>PayByCenOwner</strong>: The transit router connection fee and transit router data processing fee generated by the network instance are paid by the account that owns the CEN instance.</li>
             * <li><strong>PayByResourceOwner</strong>: The transit router connection fee and transit router data processing fee generated by the network instance are paid by the account that owns the network instance.</li>
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
