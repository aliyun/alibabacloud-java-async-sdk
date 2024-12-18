// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
         * <p>The account groups.</p>
         */
        public Builder aggregatorsResult(AggregatorsResult aggregatorsResult) {
            this.aggregatorsResult = aggregatorsResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20C8526D-12C5-4336-BC72-EBD5D1BA732F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregatorsResponseBody build() {
            return new ListAggregatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregatorsResponseBody</p>
     */
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
             * <p>The ID of the management account that is used to create the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The number of member accounts in the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder aggregatorAccountCount(Long aggregatorAccountCount) {
                this.aggregatorAccountCount = aggregatorAccountCount;
                return this;
            }

            /**
             * <p>The timestamp generated when the account group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1623036305000</p>
             */
            public Builder aggregatorCreateTimestamp(Long aggregatorCreateTimestamp) {
                this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
                return this;
            }

            /**
             * <p>The ID of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-88ea626622af0055****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The name of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test_Group</p>
             */
            public Builder aggregatorName(String aggregatorName) {
                this.aggregatorName = aggregatorName;
                return this;
            }

            /**
             * <p>The status of the account group. Valid values:</p>
             * <ul>
             * <li>0: The account group is being created.</li>
             * <li>1: The account group was created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder aggregatorStatus(Integer aggregatorStatus) {
                this.aggregatorStatus = aggregatorStatus;
                return this;
            }

            /**
             * <p>The type of the account group. Valid values:</p>
             * <ul>
             * <li>RD: global account group.</li>
             * <li>FOLDER: account group of the folder.</li>
             * <li>CUSTOM: custom account group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder aggregatorType(String aggregatorType) {
                this.aggregatorType = aggregatorType;
                return this;
            }

            /**
             * <p>The description of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>Example-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The information about the member accounts in the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>r-BU****</p>
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
    /**
     * 
     * {@link ListAggregatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregatorsResponseBody</p>
     */
    public static class AggregatorsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregators")
        private java.util.List<Aggregators> aggregators;

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
        public java.util.List<Aggregators> getAggregators() {
            return this.aggregators;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<Aggregators> aggregators; 
            private String nextToken; 

            /**
             * <p>The information about the account groups.</p>
             */
            public Builder aggregators(java.util.List<Aggregators> aggregators) {
                this.aggregators = aggregators;
                return this;
            }

            /**
             * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TGlzdFJlc291cmNlU2hhcmVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0</p>
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
