// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregatorResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregatorResponseBody</p>
 */
public class GetAggregatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aggregator")
    private Aggregator aggregator;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregatorResponseBody(Builder builder) {
        this.aggregator = builder.aggregator;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregatorResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregator
     */
    public Aggregator getAggregator() {
        return this.aggregator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Aggregator aggregator; 
        private String requestId; 

        /**
         * The details of the account group.
         */
        public Builder aggregator(Aggregator aggregator) {
            this.aggregator = aggregator;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregatorResponseBody build() {
            return new GetAggregatorResponseBody(this);
        } 

    } 

    public static class AggregatorAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("RecorderStatus")
        private String recorderStatus;

        private AggregatorAccounts(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.accountType = builder.accountType;
            this.recorderStatus = builder.recorderStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregatorAccounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return recorderStatus
         */
        public String getRecorderStatus() {
            return this.recorderStatus;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private String accountType; 
            private String recorderStatus; 

            /**
             * The ID of the member account.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the member account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The type of the member account. Only ResourceDirectory is returned, which indicates that the account is a resource directory account.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The status of the configuration recorder for the member account. Valid values:
             * <p>
             * 
             * *   REGISTRABLE: The configuration recorder is not registered.
             * *   BUILDING: The configuration recorder is being deployed.
             * *   REGISTERED: The configuration recorder is registered.
             * *   REBUILDING: The configuration recorder is being redeployed.
             */
            public Builder recorderStatus(String recorderStatus) {
                this.recorderStatus = recorderStatus;
                return this;
            }

            public AggregatorAccounts build() {
                return new AggregatorAccounts(this);
            } 

        } 

    }
    public static class Aggregator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorAccountCount")
        private Long aggregatorAccountCount;

        @com.aliyun.core.annotation.NameInMap("AggregatorAccounts")
        private java.util.List < AggregatorAccounts> aggregatorAccounts;

        @com.aliyun.core.annotation.NameInMap("AggregatorCreateTimestamp")
        private String aggregatorCreateTimestamp;

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

        private Aggregator(Builder builder) {
            this.accountId = builder.accountId;
            this.aggregatorAccountCount = builder.aggregatorAccountCount;
            this.aggregatorAccounts = builder.aggregatorAccounts;
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

        public static Aggregator create() {
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
         * @return aggregatorAccounts
         */
        public java.util.List < AggregatorAccounts> getAggregatorAccounts() {
            return this.aggregatorAccounts;
        }

        /**
         * @return aggregatorCreateTimestamp
         */
        public String getAggregatorCreateTimestamp() {
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
            private java.util.List < AggregatorAccounts> aggregatorAccounts; 
            private String aggregatorCreateTimestamp; 
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
             * The information about the member accounts in the account group.
             */
            public Builder aggregatorAccounts(java.util.List < AggregatorAccounts> aggregatorAccounts) {
                this.aggregatorAccounts = aggregatorAccounts;
                return this;
            }

            /**
             * The timestamp generated when the account group was created.
             */
            public Builder aggregatorCreateTimestamp(String aggregatorCreateTimestamp) {
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
             * *   RD: a global account group.
             * *   FOLDER: an account group for a folder.
             * *   CUSTOM: a custom account group.
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
             * The ID of the attached folder of the account group.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            public Aggregator build() {
                return new Aggregator(this);
            } 

        } 

    }
}
