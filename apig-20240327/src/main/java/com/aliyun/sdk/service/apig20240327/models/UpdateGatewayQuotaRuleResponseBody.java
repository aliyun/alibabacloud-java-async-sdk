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
 * {@link UpdateGatewayQuotaRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGatewayQuotaRuleResponseBody</p>
 */
public class UpdateGatewayQuotaRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateGatewayQuotaRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayQuotaRuleResponseBody create() {
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

        private Builder(UpdateGatewayQuotaRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGatewayQuotaRuleResponseBody build() {
            return new UpdateGatewayQuotaRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayQuotaRuleResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conflictPeriodType")
        private String conflictPeriodType;

        @com.aliyun.core.annotation.NameInMap("conflictType")
        private String conflictType;

        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("consumerName")
        private String consumerName;

        private Items(Builder builder) {
            this.conflictPeriodType = builder.conflictPeriodType;
            this.conflictType = builder.conflictType;
            this.consumerId = builder.consumerId;
            this.consumerName = builder.consumerName;
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

        public static final class Builder {
            private String conflictPeriodType; 
            private String conflictType; 
            private String consumerId; 
            private String consumerName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.conflictPeriodType = model.conflictPeriodType;
                this.conflictType = model.conflictType;
                this.consumerId = model.consumerId;
                this.consumerName = model.consumerName;
            } 

            /**
             * conflictPeriodType.
             */
            public Builder conflictPeriodType(String conflictPeriodType) {
                this.conflictPeriodType = conflictPeriodType;
                return this;
            }

            /**
             * conflictType.
             */
            public Builder conflictType(String conflictType) {
                this.conflictType = conflictType;
                return this;
            }

            /**
             * consumerId.
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * consumerName.
             */
            public Builder consumerName(String consumerName) {
                this.consumerName = consumerName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayQuotaRuleResponseBody</p>
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
             * conflictHash.
             */
            public Builder conflictHash(String conflictHash) {
                this.conflictHash = conflictHash;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * totalConflictCount.
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
     * {@link UpdateGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayQuotaRuleResponseBody</p>
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
             * accepted.
             */
            public Builder accepted(Boolean accepted) {
                this.accepted = accepted;
                return this;
            }

            /**
             * conflictPreview.
             */
            public Builder conflictPreview(ConflictPreview conflictPreview) {
                this.conflictPreview = conflictPreview;
                return this;
            }

            /**
             * dryRun.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * ruleId.
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
