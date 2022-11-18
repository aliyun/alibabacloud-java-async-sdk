// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaTipResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaTipResponseBody</p>
 */
public class GetQuotaTipResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("QuotaData")
    private QuotaData quotaData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetQuotaTipResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.quotaData = builder.quotaData;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaTipResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return quotaData
     */
    public QuotaData getQuotaData() {
        return this.quotaData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private QuotaData quotaData; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * QuotaData.
         */
        public Builder quotaData(QuotaData quotaData) {
            this.quotaData = quotaData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQuotaTipResponseBody build() {
            return new GetQuotaTipResponseBody(this);
        } 

    } 

    public static class QuotaData extends TeaModel {
        @NameInMap("GroupLeft")
        private Integer groupLeft;

        @NameInMap("GroupUsed")
        private Integer groupUsed;

        @NameInMap("IsPartitionBuy")
        private Integer isPartitionBuy;

        @NameInMap("PartitionLeft")
        private Integer partitionLeft;

        @NameInMap("PartitionNumOfBuy")
        private Integer partitionNumOfBuy;

        @NameInMap("PartitionQuata")
        private Integer partitionQuata;

        @NameInMap("PartitionUsed")
        private Integer partitionUsed;

        @NameInMap("TopicLeft")
        private Integer topicLeft;

        @NameInMap("TopicNumOfBuy")
        private Integer topicNumOfBuy;

        @NameInMap("TopicQuota")
        private Integer topicQuota;

        @NameInMap("TopicUsed")
        private Integer topicUsed;

        private QuotaData(Builder builder) {
            this.groupLeft = builder.groupLeft;
            this.groupUsed = builder.groupUsed;
            this.isPartitionBuy = builder.isPartitionBuy;
            this.partitionLeft = builder.partitionLeft;
            this.partitionNumOfBuy = builder.partitionNumOfBuy;
            this.partitionQuata = builder.partitionQuata;
            this.partitionUsed = builder.partitionUsed;
            this.topicLeft = builder.topicLeft;
            this.topicNumOfBuy = builder.topicNumOfBuy;
            this.topicQuota = builder.topicQuota;
            this.topicUsed = builder.topicUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaData create() {
            return builder().build();
        }

        /**
         * @return groupLeft
         */
        public Integer getGroupLeft() {
            return this.groupLeft;
        }

        /**
         * @return groupUsed
         */
        public Integer getGroupUsed() {
            return this.groupUsed;
        }

        /**
         * @return isPartitionBuy
         */
        public Integer getIsPartitionBuy() {
            return this.isPartitionBuy;
        }

        /**
         * @return partitionLeft
         */
        public Integer getPartitionLeft() {
            return this.partitionLeft;
        }

        /**
         * @return partitionNumOfBuy
         */
        public Integer getPartitionNumOfBuy() {
            return this.partitionNumOfBuy;
        }

        /**
         * @return partitionQuata
         */
        public Integer getPartitionQuata() {
            return this.partitionQuata;
        }

        /**
         * @return partitionUsed
         */
        public Integer getPartitionUsed() {
            return this.partitionUsed;
        }

        /**
         * @return topicLeft
         */
        public Integer getTopicLeft() {
            return this.topicLeft;
        }

        /**
         * @return topicNumOfBuy
         */
        public Integer getTopicNumOfBuy() {
            return this.topicNumOfBuy;
        }

        /**
         * @return topicQuota
         */
        public Integer getTopicQuota() {
            return this.topicQuota;
        }

        /**
         * @return topicUsed
         */
        public Integer getTopicUsed() {
            return this.topicUsed;
        }

        public static final class Builder {
            private Integer groupLeft; 
            private Integer groupUsed; 
            private Integer isPartitionBuy; 
            private Integer partitionLeft; 
            private Integer partitionNumOfBuy; 
            private Integer partitionQuata; 
            private Integer partitionUsed; 
            private Integer topicLeft; 
            private Integer topicNumOfBuy; 
            private Integer topicQuota; 
            private Integer topicUsed; 

            /**
             * GroupLeft.
             */
            public Builder groupLeft(Integer groupLeft) {
                this.groupLeft = groupLeft;
                return this;
            }

            /**
             * GroupUsed.
             */
            public Builder groupUsed(Integer groupUsed) {
                this.groupUsed = groupUsed;
                return this;
            }

            /**
             * IsPartitionBuy.
             */
            public Builder isPartitionBuy(Integer isPartitionBuy) {
                this.isPartitionBuy = isPartitionBuy;
                return this;
            }

            /**
             * PartitionLeft.
             */
            public Builder partitionLeft(Integer partitionLeft) {
                this.partitionLeft = partitionLeft;
                return this;
            }

            /**
             * PartitionNumOfBuy.
             */
            public Builder partitionNumOfBuy(Integer partitionNumOfBuy) {
                this.partitionNumOfBuy = partitionNumOfBuy;
                return this;
            }

            /**
             * PartitionQuata.
             */
            public Builder partitionQuata(Integer partitionQuata) {
                this.partitionQuata = partitionQuata;
                return this;
            }

            /**
             * PartitionUsed.
             */
            public Builder partitionUsed(Integer partitionUsed) {
                this.partitionUsed = partitionUsed;
                return this;
            }

            /**
             * TopicLeft.
             */
            public Builder topicLeft(Integer topicLeft) {
                this.topicLeft = topicLeft;
                return this;
            }

            /**
             * TopicNumOfBuy.
             */
            public Builder topicNumOfBuy(Integer topicNumOfBuy) {
                this.topicNumOfBuy = topicNumOfBuy;
                return this;
            }

            /**
             * TopicQuota.
             */
            public Builder topicQuota(Integer topicQuota) {
                this.topicQuota = topicQuota;
                return this;
            }

            /**
             * TopicUsed.
             */
            public Builder topicUsed(Integer topicUsed) {
                this.topicUsed = topicUsed;
                return this;
            }

            public QuotaData build() {
                return new QuotaData(this);
            } 

        } 

    }
}
