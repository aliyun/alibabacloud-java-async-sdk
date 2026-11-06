// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AddGatewayQuotaRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddGatewayQuotaRuleResponseBody</p>
 */
public class AddGatewayQuotaRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AddGatewayQuotaRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayQuotaRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddGatewayQuotaRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code or error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200, 404, 500</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key\&quot;: \&quot;value\&quot;}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddGatewayQuotaRuleResponseBody build() {
            return new AddGatewayQuotaRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>AddGatewayQuotaRuleResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conflictPeriodType")
        @Deprecated
        private String conflictPeriodType;

        @com.aliyun.core.annotation.NameInMap("conflictType")
        private String conflictType;

        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("consumerName")
        private String consumerName;

        @com.aliyun.core.annotation.NameInMap("periodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("subjectId")
        private String subjectId;

        @com.aliyun.core.annotation.NameInMap("subjectName")
        private String subjectName;

        @com.aliyun.core.annotation.NameInMap("subjectType")
        private String subjectType;

        private Items(Builder builder) {
            this.conflictPeriodType = builder.conflictPeriodType;
            this.conflictType = builder.conflictType;
            this.consumerId = builder.consumerId;
            this.consumerName = builder.consumerName;
            this.periodType = builder.periodType;
            this.subjectId = builder.subjectId;
            this.subjectName = builder.subjectName;
            this.subjectType = builder.subjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return conflictPeriodType
         */
        public String getConflictPeriodType() {
            return this.conflictPeriodType;
        }

        /**
         * @return conflictType
         */
        public String getConflictType() {
            return this.conflictType;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return consumerName
         */
        public String getConsumerName() {
            return this.consumerName;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return subjectId
         */
        public String getSubjectId() {
            return this.subjectId;
        }

        /**
         * @return subjectName
         */
        public String getSubjectName() {
            return this.subjectName;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        public static final class Builder {
            private String conflictPeriodType; 
            private String conflictType; 
            private String consumerId; 
            private String consumerName; 
            private String periodType; 
            private String subjectId; 
            private String subjectName; 
            private String subjectType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.conflictPeriodType = model.conflictPeriodType;
                this.conflictType = model.conflictType;
                this.consumerId = model.consumerId;
                this.consumerName = model.consumerName;
                this.periodType = model.periodType;
                this.subjectId = model.subjectId;
                this.subjectName = model.subjectName;
                this.subjectType = model.subjectType;
            } 

            /**
             * <p>The period type of the existing conflicting rule on the subject. This is a legacy field. Use periodType in the actual response instead. This field is not guaranteed to be returned. A value of day, week, or month indicates that the period of the existing conflicting rule is day, week, or month.</p>
             * 
             * <strong>example:</strong>
             * <p>week</p>
             */
            public Builder conflictPeriodType(String conflictPeriodType) {
                this.conflictPeriodType = conflictPeriodType;
                return this;
            }

            /**
             * <p>The type of the existing conflicting rule on the subject. A value of calendar indicates that the existing conflicting rule uses a natural period. A value of epoch indicates that the existing conflicting rule uses a custom period.</p>
             * 
             * <strong>example:</strong>
             * <p>calendar</p>
             */
            public Builder conflictType(String conflictType) {
                this.conflictType = conflictType;
                return this;
            }

            /**
             * <p>The ID of the conflicting consumer. You can use subjectId instead.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-xxxxxx</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The name of the conflicting consumer. You can use subjectName instead.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder consumerName(String consumerName) {
                this.consumerName = consumerName;
                return this;
            }

            /**
             * <p>The period type of the existing conflicting rule. Valid values: day, week, and month.</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The ID of the conflicting subject.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-xxx</p>
             */
            public Builder subjectId(String subjectId) {
                this.subjectId = subjectId;
                return this;
            }

            /**
             * <p>The name of the conflicting subject.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder subjectName(String subjectName) {
                this.subjectName = subjectName;
                return this;
            }

            /**
             * <p>The type of the conflicting subject. Valid values: consumer and consumer_group.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer</p>
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>AddGatewayQuotaRuleResponseBody</p>
     */
    public static class ConflictPreview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conflictHash")
        private String conflictHash;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("totalConflictCount")
        private Integer totalConflictCount;

        private ConflictPreview(Builder builder) {
            this.conflictHash = builder.conflictHash;
            this.items = builder.items;
            this.totalConflictCount = builder.totalConflictCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConflictPreview create() {
            return builder().build();
        }

        /**
         * @return conflictHash
         */
        public String getConflictHash() {
            return this.conflictHash;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return totalConflictCount
         */
        public Integer getTotalConflictCount() {
            return this.totalConflictCount;
        }

        public static final class Builder {
            private String conflictHash; 
            private java.util.List<Items> items; 
            private Integer totalConflictCount; 

            private Builder() {
            } 

            private Builder(ConflictPreview model) {
                this.conflictHash = model.conflictHash;
                this.items = model.items;
                this.totalConflictCount = model.totalConflictCount;
            } 

            /**
             * <p>The hash of the conflicts.</p>
             * 
             * <strong>example:</strong>
             * <p>f8f44dc6cf369a017d56b7197eb4fb5ac4bbb6b09a92b9b41999541fxxxxxxxx</p>
             */
            public Builder conflictHash(String conflictHash) {
                this.conflictHash = conflictHash;
                return this;
            }

            /**
             * <p>The list of conflicting subjects (consumers or consumer groups).</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The total number of conflicts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalConflictCount(Integer totalConflictCount) {
                this.totalConflictCount = totalConflictCount;
                return this;
            }

            public ConflictPreview build() {
                return new ConflictPreview(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>AddGatewayQuotaRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accepted")
        private Boolean accepted;

        @com.aliyun.core.annotation.NameInMap("conflictPreview")
        private ConflictPreview conflictPreview;

        @com.aliyun.core.annotation.NameInMap("dryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        private Data(Builder builder) {
            this.accepted = builder.accepted;
            this.conflictPreview = builder.conflictPreview;
            this.dryRun = builder.dryRun;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accepted
         */
        public Boolean getAccepted() {
            return this.accepted;
        }

        /**
         * @return conflictPreview
         */
        public ConflictPreview getConflictPreview() {
            return this.conflictPreview;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Boolean accepted; 
            private ConflictPreview conflictPreview; 
            private Boolean dryRun; 
            private String ruleId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accepted = model.accepted;
                this.conflictPreview = model.conflictPreview;
                this.dryRun = model.dryRun;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>Indicates whether the semantics of the write request can be accepted by the system. A value of false typically occurs in retryable scenarios, such as when conflicts are not confirmed for overwriting.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accepted(Boolean accepted) {
                this.accepted = accepted;
                return this;
            }

            /**
             * <p>The conflict preview.</p>
             */
            public Builder conflictPreview(ConflictPreview conflictPreview) {
                this.conflictPreview = conflictPreview;
                return this;
            }

            /**
             * <p>Indicates whether a dry run is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>qr-xxxxx</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
