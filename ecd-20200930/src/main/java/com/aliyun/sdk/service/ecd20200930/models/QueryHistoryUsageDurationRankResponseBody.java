// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryUsageDurationRankResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHistoryUsageDurationRankResponseBody</p>
 */
public class QueryHistoryUsageDurationRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UsageDurationList")
    private java.util.List<UsageDurationList> usageDurationList;

    private QueryHistoryUsageDurationRankResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usageDurationList = builder.usageDurationList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryUsageDurationRankResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return usageDurationList
     */
    public java.util.List<UsageDurationList> getUsageDurationList() {
        return this.usageDurationList;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<UsageDurationList> usageDurationList; 

        private Builder() {
        } 

        private Builder(QueryHistoryUsageDurationRankResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.usageDurationList = model.usageDurationList;
        } 

        /**
         * <p>The paging token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWvmfbFWy0uSlxZ6pIAKAnuwt1ezsRqxI6hPibm27fMH</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of user usage duration metrics.</p>
         */
        public Builder usageDurationList(java.util.List<UsageDurationList> usageDurationList) {
            this.usageDurationList = usageDurationList;
            return this;
        }

        public QueryHistoryUsageDurationRankResponseBody build() {
            return new QueryHistoryUsageDurationRankResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryUsageDurationRankResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoryUsageDurationRankResponseBody</p>
     */
    public static class UsageDurationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UsageDuration")
        private Long usageDuration;

        private UsageDurationList(Builder builder) {
            this.chargeType = builder.chargeType;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endUserId = builder.endUserId;
            this.regionId = builder.regionId;
            this.usageDuration = builder.usageDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageDurationList create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return usageDuration
         */
        public Long getUsageDuration() {
            return this.usageDuration;
        }

        public static final class Builder {
            private String chargeType; 
            private String desktopId; 
            private String desktopName; 
            private String endUserId; 
            private String regionId; 
            private Long usageDuration; 

            private Builder() {
            } 

            private Builder(UsageDurationList model) {
                this.chargeType = model.chargeType;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.endUserId = model.endUserId;
                this.regionId = model.regionId;
                this.usageDuration = model.usageDuration;
            } 

            /**
             * <p>The billing type. Valid values:</p>
             * <ul>
             * <li>POST_PAID: pay-as-you-go.</li>
             * <li>PRE_PAID: subscription.</li>
             * <li>MONTH_PACKAGE: monthly package.</li>
             * <li>DURATION: duration-based package.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-8cndajrdrd424sb99</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>endUserId</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The usage duration, in seconds. This value is of the Long type. Handle precision conversion on the frontend.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder usageDuration(Long usageDuration) {
                this.usageDuration = usageDuration;
                return this;
            }

            public UsageDurationList build() {
                return new UsageDurationList(this);
            } 

        } 

    }
}
