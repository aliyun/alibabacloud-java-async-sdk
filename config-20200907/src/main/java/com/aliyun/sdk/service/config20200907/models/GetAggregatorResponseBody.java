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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAggregatorResponseBody model) {
            this.aggregator = model.aggregator;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the account group.</p>
         */
        public Builder aggregator(Aggregator aggregator) {
            this.aggregator = aggregator;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>733DD93C-2277-4905-AE0C-0BA95C04B8BC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregatorResponseBody build() {
            return new GetAggregatorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregatorResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregatorResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AggregatorAccounts model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.accountType = model.accountType;
                this.recorderStatus = model.recorderStatus;
            } 

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>171322098523****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The display name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The resource directory to which the member belongs. Valid value: ResourceDirectory. ResourceDirectory indicates that the member belongs to a resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceDirectory</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The status of the configuration recorder for the member. Valid values:</p>
             * <ul>
             * <li>REGISTRABLE: The configuration recorder is not registered.</li>
             * <li>BUILDING: The configuration recorder is being deployed.</li>
             * <li>REGISTERED: The configuration recorder is registered.</li>
             * <li>REBUILDING: The configuration recorder is being redeployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGISTERED</p>
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
    /**
     * 
     * {@link GetAggregatorResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregatorResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAggregatorResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregatorResponseBody</p>
     */
    public static class Aggregator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorAccountCount")
        private Long aggregatorAccountCount;

        @com.aliyun.core.annotation.NameInMap("AggregatorAccounts")
        private java.util.List<AggregatorAccounts> aggregatorAccounts;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.tags = builder.tags;
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
        public java.util.List<AggregatorAccounts> getAggregatorAccounts() {
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

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long accountId; 
            private Long aggregatorAccountCount; 
            private java.util.List<AggregatorAccounts> aggregatorAccounts; 
            private String aggregatorCreateTimestamp; 
            private String aggregatorId; 
            private String aggregatorName; 
            private Integer aggregatorStatus; 
            private String aggregatorType; 
            private String description; 
            private String folderId; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Aggregator model) {
                this.accountId = model.accountId;
                this.aggregatorAccountCount = model.aggregatorAccountCount;
                this.aggregatorAccounts = model.aggregatorAccounts;
                this.aggregatorCreateTimestamp = model.aggregatorCreateTimestamp;
                this.aggregatorId = model.aggregatorId;
                this.aggregatorName = model.aggregatorName;
                this.aggregatorStatus = model.aggregatorStatus;
                this.aggregatorType = model.aggregatorType;
                this.description = model.description;
                this.folderId = model.folderId;
                this.tags = model.tags;
            } 

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
             * <p>The number of members in the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder aggregatorAccountCount(Long aggregatorAccountCount) {
                this.aggregatorAccountCount = aggregatorAccountCount;
                return this;
            }

            /**
             * <p>The information about the members in the account group.</p>
             */
            public Builder aggregatorAccounts(java.util.List<AggregatorAccounts> aggregatorAccounts) {
                this.aggregatorAccounts = aggregatorAccounts;
                return this;
            }

            /**
             * <p>The timestamp generated when the account group was created.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1623034091000</p>
             */
            public Builder aggregatorCreateTimestamp(String aggregatorCreateTimestamp) {
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
             * <p>Test-Group</p>
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
             * <li>RD: a global account group.</li>
             * <li>FOLDER: an account group for a folder.</li>
             * <li>CUSTOM: a custom account group.</li>
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
             * <p>The description of the test account group.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the attached folder of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-brHdgv****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>tags</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Aggregator build() {
                return new Aggregator(this);
            } 

        } 

    }
}
