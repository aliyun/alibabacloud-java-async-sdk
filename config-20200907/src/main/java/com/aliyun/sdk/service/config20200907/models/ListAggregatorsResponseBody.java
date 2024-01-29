// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregatorsResponseBody</p>
 */
public class ListAggregatorsResponseBody extends TeaModel {
    @NameInMap("AggregatorsResult")
    private AggregatorsResult aggregatorsResult;

    @NameInMap("RequestId")
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
         * The account groups returned.
         */
        public Builder aggregatorsResult(AggregatorsResult aggregatorsResult) {
            this.aggregatorsResult = aggregatorsResult;
            return this;
        }

        /**
         * The ID of the request.
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
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AggregatorAccountCount")
        private Long aggregatorAccountCount;

        @NameInMap("AggregatorCreateTimestamp")
        private Long aggregatorCreateTimestamp;

        @NameInMap("AggregatorId")
        private String aggregatorId;

        @NameInMap("AggregatorName")
        private String aggregatorName;

        @NameInMap("AggregatorStatus")
        private Integer aggregatorStatus;

        @NameInMap("AggregatorType")
        private String aggregatorType;

        @NameInMap("Description")
        private String description;

        @NameInMap("FolderId")
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
             * The ID of the management account used to create the account group.
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
             * The timestamp when the account group was created.
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
             * *   0: being created.
             * *   1: created.
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
             * FolderId.
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
        @NameInMap("Aggregators")
        private java.util.List < Aggregators> aggregators;

        @NameInMap("NextToken")
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
             * The token that is used to initiate the next request. If the response of the current request is truncated, this token is used to initiate another request and obtain the remaining entries.
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
