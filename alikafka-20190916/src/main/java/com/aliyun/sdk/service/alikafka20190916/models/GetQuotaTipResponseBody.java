// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetQuotaTipResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaTipResponseBody</p>
 */
public class GetQuotaTipResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QuotaData")
    private QuotaData quotaData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetQuotaTipResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.quotaData = model.quotaData;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional message. This message is typically used to describe API call failures for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The quota.</p>
         */
        public Builder quotaData(QuotaData quotaData) {
            this.quotaData = quotaData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0178A3A7-E87B-5E50-A16F-3E62F534****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQuotaTipResponseBody build() {
            return new GetQuotaTipResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaTipResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaTipResponseBody</p>
     */
    public static class QuotaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupLeft")
        private Integer groupLeft;

        @com.aliyun.core.annotation.NameInMap("GroupUsed")
        private Integer groupUsed;

        @com.aliyun.core.annotation.NameInMap("IsPartitionBuy")
        private Integer isPartitionBuy;

        @com.aliyun.core.annotation.NameInMap("PartitionLeft")
        private Integer partitionLeft;

        @com.aliyun.core.annotation.NameInMap("PartitionNumOfBuy")
        private Integer partitionNumOfBuy;

        @com.aliyun.core.annotation.NameInMap("PartitionQuota")
        private Integer partitionQuota;

        @com.aliyun.core.annotation.NameInMap("PartitionUsed")
        private Integer partitionUsed;

        @com.aliyun.core.annotation.NameInMap("TopicLeft")
        private Integer topicLeft;

        @com.aliyun.core.annotation.NameInMap("TopicNumOfBuy")
        private Integer topicNumOfBuy;

        @com.aliyun.core.annotation.NameInMap("TopicQuota")
        private Integer topicQuota;

        @com.aliyun.core.annotation.NameInMap("TopicUsed")
        private Integer topicUsed;

        private QuotaData(Builder builder) {
            this.groupLeft = builder.groupLeft;
            this.groupUsed = builder.groupUsed;
            this.isPartitionBuy = builder.isPartitionBuy;
            this.partitionLeft = builder.partitionLeft;
            this.partitionNumOfBuy = builder.partitionNumOfBuy;
            this.partitionQuota = builder.partitionQuota;
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
         * @return partitionQuota
         */
        public Integer getPartitionQuota() {
            return this.partitionQuota;
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
            private Integer partitionQuota; 
            private Integer partitionUsed; 
            private Integer topicLeft; 
            private Integer topicNumOfBuy; 
            private Integer topicQuota; 
            private Integer topicUsed; 

            private Builder() {
            } 

            private Builder(QuotaData model) {
                this.groupLeft = model.groupLeft;
                this.groupUsed = model.groupUsed;
                this.isPartitionBuy = model.isPartitionBuy;
                this.partitionLeft = model.partitionLeft;
                this.partitionNumOfBuy = model.partitionNumOfBuy;
                this.partitionQuota = model.partitionQuota;
                this.partitionUsed = model.partitionUsed;
                this.topicLeft = model.topicLeft;
                this.topicNumOfBuy = model.topicNumOfBuy;
                this.topicQuota = model.topicQuota;
                this.topicUsed = model.topicUsed;
            } 

            /**
             * <p>The number of available groups.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder groupLeft(Integer groupLeft) {
                this.groupLeft = groupLeft;
                return this;
            }

            /**
             * <p>The number of used groups.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder groupUsed(Integer groupUsed) {
                this.groupUsed = groupUsed;
                return this;
            }

            /**
             * <p>The method that you use to purchase partitions. Valid values:</p>
             * <ul>
             * <li>0: indicates that the instance is purchased based on topics.</li>
             * <li>1: indicates that the instance is purchased based on partitions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPartitionBuy(Integer isPartitionBuy) {
                this.isPartitionBuy = isPartitionBuy;
                return this;
            }

            /**
             * <p>The number of available partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>1050</p>
             */
            public Builder partitionLeft(Integer partitionLeft) {
                this.partitionLeft = partitionLeft;
                return this;
            }

            /**
             * <p>The number of purchased partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder partitionNumOfBuy(Integer partitionNumOfBuy) {
                this.partitionNumOfBuy = partitionNumOfBuy;
                return this;
            }

            /**
             * <p>The quota of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>1100</p>
             */
            public Builder partitionQuota(Integer partitionQuota) {
                this.partitionQuota = partitionQuota;
                return this;
            }

            /**
             * <p>The number of used partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder partitionUsed(Integer partitionUsed) {
                this.partitionUsed = partitionUsed;
                return this;
            }

            /**
             * <p>The number of available topics.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder topicLeft(Integer topicLeft) {
                this.topicLeft = topicLeft;
                return this;
            }

            /**
             * <p>The number of purchased topics.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder topicNumOfBuy(Integer topicNumOfBuy) {
                this.topicNumOfBuy = topicNumOfBuy;
                return this;
            }

            /**
             * <p>The quota of topics.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder topicQuota(Integer topicQuota) {
                this.topicQuota = topicQuota;
                return this;
            }

            /**
             * <p>The number of used topics.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
