// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregatorsResponseBody</p>
 */
public class ListAggregatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregatorsResult")
    private AggregatorsResult aggregatorsResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregatorsResponseBody(Builder builder) {
        this.aggregatorsResult = builder.aggregatorsResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregatorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregatorsResult
     */
    public AggregatorsResult getAggregatorsResult() {
        return this.aggregatorsResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AggregatorsResult aggregatorsResult; 
        private String requestId; 

        /**
         * The account groups.
         */
        public Builder aggregatorsResult(AggregatorsResult aggregatorsResult) {
            this.aggregatorsResult = aggregatorsResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregatorsResponseBody build() {
            return new ListAggregatorsResponseBody(this);
        } 

    } 

    public static class Aggregators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorAccountCount")
        private Long aggregatorAccountCount;

        @com.aliyun.core.annotation.NameInMap("AggregatorCreateTimestamp")
        private Long aggregatorCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("AggregatorName")
        private String aggregatorName;

        @com.aliyun.core.annotation.NameInMap("AggregatorStatus")
        private Integer aggregatorStatus;

        @com.aliyun.core.annotation.NameInMap("AggregatorType")
        private String aggregatorType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        private Aggregators(Builder builder) {
            this.accountId = builder.accountId;
            this.aggregatorAccountCount = builder.aggregatorAccountCount;
            this.aggregatorCreateTimestamp = builder.aggregatorCreateTimestamp;
            this.aggregatorId = builder.aggregatorId;
            this.aggregatorName = builder.aggregatorName;
            this.aggregatorStatus = builder.aggregatorStatus;
            this.aggregatorType = builder.aggregatorType;
            this.description = builder.description;
            this.folderId = builder.folderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregators create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return aggregatorAccountCount
         */
        public Long getAggregatorAccountCount() {
            return this.aggregatorAccountCount;
        }

        /**
         * @return aggregatorCreateTimestamp
         */
        public Long getAggregatorCreateTimestamp() {
            return this.aggregatorCreateTimestamp;
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return aggregatorName
         */
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        /**
         * @return aggregatorStatus
         */
        public Integer getAggregatorStatus() {
            return this.aggregatorStatus;
        }

        /**
         * @return aggregatorType
         */
        public String getAggregatorType() {
            return this.aggregatorType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        public static final class Builder {
            private Long accountId; 
            private Long aggregatorAccountCount; 
            private Long aggregatorCreateTimestamp; 
            private String aggregatorId; 
            private String aggregatorName; 
            private Integer aggregatorStatus; 
            private String aggregatorType; 
            private String description; 
            private String folderId; 

            /**
             * The ID of the management account that is used to create the account group.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The number of member accounts in the account group.
             */
            public Builder aggregatorAccountCount(Long aggregatorAccountCount) {
                this.aggregatorAccountCount = aggregatorAccountCount;
                return this;
            }

            /**
             * The timestamp generated when the account group was created.
             */
            public Builder aggregatorCreateTimestamp(Long aggregatorCreateTimestamp) {
                this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
                return this;
            }

            /**
             * The ID of the account group.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * The name of the account group.
             */
            public Builder aggregatorName(String aggregatorName) {
                this.aggregatorName = aggregatorName;
                return this;
            }

            /**
             * The status of the account group. Valid values:
             * <p>
             * 
             * *   0: The account group is being created.
             * *   1: The account group was created.
             */
            public Builder aggregatorStatus(Integer aggregatorStatus) {
                this.aggregatorStatus = aggregatorStatus;
                return this;
            }

            /**
             * The type of the account group. Valid values:
             * <p>
             * 
             * *   RD: global account group.
             * *   FOLDER: account group of the folder.
             * *   CUSTOM: custom account group.
             */
            public Builder aggregatorType(String aggregatorType) {
                this.aggregatorType = aggregatorType;
                return this;
            }

            /**
             * The description of the account group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The information about the member accounts in the account group.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            public Aggregators build() {
                return new Aggregators(this);
            } 

        } 

    }
    public static class AggregatorsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregators")
        private java.util.List < Aggregators> aggregators;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private AggregatorsResult(Builder builder) {
            this.aggregators = builder.aggregators;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregatorsResult create() {
            return builder().build();
        }

        /**
         * @return aggregators
         */
        public java.util.List < Aggregators> getAggregators() {
            return this.aggregators;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < Aggregators> aggregators; 
            private String nextToken; 

            /**
             * The information about the account groups.
             */
            public Builder aggregators(java.util.List < Aggregators> aggregators) {
                this.aggregators = aggregators;
                return this;
            }

            /**
             * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public AggregatorsResult build() {
                return new AggregatorsResult(this);
            } 

        } 

    }
}
