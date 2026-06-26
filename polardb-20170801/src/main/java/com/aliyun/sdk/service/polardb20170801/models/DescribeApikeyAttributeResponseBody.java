// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApikeyAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApikeyAttributeResponseBody</p>
 */
public class DescribeApikeyAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApikeyAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApikeyAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApikeyAttributeResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F3322AFE-083E-4D77-A074-421301******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApikeyAttributeResponseBody build() {
            return new DescribeApikeyAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApikeyAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApikeyAttributeResponseBody</p>
     */
    public static class Consumer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("ConsumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("ConsumerTag")
        private String consumerTag;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Consumer(Builder builder) {
            this.apiKey = builder.apiKey;
            this.consumerGroupId = builder.consumerGroupId;
            this.consumerId = builder.consumerId;
            this.consumerTag = builder.consumerTag;
            this.createTime = builder.createTime;
            this.gwClusterId = builder.gwClusterId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Consumer create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return consumerTag
         */
        public String getConsumerTag() {
            return this.consumerTag;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String apiKey; 
            private String consumerGroupId; 
            private String consumerId; 
            private String consumerTag; 
            private String createTime; 
            private String gwClusterId; 
            private String modifyTime; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(Consumer model) {
                this.apiKey = model.apiKey;
                this.consumerGroupId = model.consumerGroupId;
                this.consumerId = model.consumerId;
                this.consumerTag = model.consumerTag;
                this.createTime = model.createTime;
                this.gwClusterId = model.gwClusterId;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * ConsumerGroupId.
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * ConsumerId.
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * ConsumerTag.
             */
            public Builder consumerTag(String consumerTag) {
                this.consumerTag = consumerTag;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * GwClusterId.
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Consumer build() {
                return new Consumer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApikeyAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApikeyAttributeResponseBody</p>
     */
    public static class UsageStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DimensionRefId")
        private String dimensionRefId;

        @com.aliyun.core.annotation.NameInMap("DimensionType")
        private String dimensionType;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("MonthlyCacheToken")
        private String monthlyCacheToken;

        @com.aliyun.core.annotation.NameInMap("MonthlyCostPoints")
        private String monthlyCostPoints;

        @com.aliyun.core.annotation.NameInMap("MonthlyInputToken")
        private String monthlyInputToken;

        @com.aliyun.core.annotation.NameInMap("MonthlyOutputToken")
        private String monthlyOutputToken;

        @com.aliyun.core.annotation.NameInMap("MonthlyToken")
        private String monthlyToken;

        @com.aliyun.core.annotation.NameInMap("TotalCacheToken")
        private String totalCacheToken;

        @com.aliyun.core.annotation.NameInMap("TotalCostPoints")
        private String totalCostPoints;

        @com.aliyun.core.annotation.NameInMap("TotalInputToken")
        private String totalInputToken;

        @com.aliyun.core.annotation.NameInMap("TotalOutputToken")
        private String totalOutputToken;

        @com.aliyun.core.annotation.NameInMap("TotalToken")
        private String totalToken;

        private UsageStatistics(Builder builder) {
            this.dimensionRefId = builder.dimensionRefId;
            this.dimensionType = builder.dimensionType;
            this.gwClusterId = builder.gwClusterId;
            this.monthlyCacheToken = builder.monthlyCacheToken;
            this.monthlyCostPoints = builder.monthlyCostPoints;
            this.monthlyInputToken = builder.monthlyInputToken;
            this.monthlyOutputToken = builder.monthlyOutputToken;
            this.monthlyToken = builder.monthlyToken;
            this.totalCacheToken = builder.totalCacheToken;
            this.totalCostPoints = builder.totalCostPoints;
            this.totalInputToken = builder.totalInputToken;
            this.totalOutputToken = builder.totalOutputToken;
            this.totalToken = builder.totalToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageStatistics create() {
            return builder().build();
        }

        /**
         * @return dimensionRefId
         */
        public String getDimensionRefId() {
            return this.dimensionRefId;
        }

        /**
         * @return dimensionType
         */
        public String getDimensionType() {
            return this.dimensionType;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return monthlyCacheToken
         */
        public String getMonthlyCacheToken() {
            return this.monthlyCacheToken;
        }

        /**
         * @return monthlyCostPoints
         */
        public String getMonthlyCostPoints() {
            return this.monthlyCostPoints;
        }

        /**
         * @return monthlyInputToken
         */
        public String getMonthlyInputToken() {
            return this.monthlyInputToken;
        }

        /**
         * @return monthlyOutputToken
         */
        public String getMonthlyOutputToken() {
            return this.monthlyOutputToken;
        }

        /**
         * @return monthlyToken
         */
        public String getMonthlyToken() {
            return this.monthlyToken;
        }

        /**
         * @return totalCacheToken
         */
        public String getTotalCacheToken() {
            return this.totalCacheToken;
        }

        /**
         * @return totalCostPoints
         */
        public String getTotalCostPoints() {
            return this.totalCostPoints;
        }

        /**
         * @return totalInputToken
         */
        public String getTotalInputToken() {
            return this.totalInputToken;
        }

        /**
         * @return totalOutputToken
         */
        public String getTotalOutputToken() {
            return this.totalOutputToken;
        }

        /**
         * @return totalToken
         */
        public String getTotalToken() {
            return this.totalToken;
        }

        public static final class Builder {
            private String dimensionRefId; 
            private String dimensionType; 
            private String gwClusterId; 
            private String monthlyCacheToken; 
            private String monthlyCostPoints; 
            private String monthlyInputToken; 
            private String monthlyOutputToken; 
            private String monthlyToken; 
            private String totalCacheToken; 
            private String totalCostPoints; 
            private String totalInputToken; 
            private String totalOutputToken; 
            private String totalToken; 

            private Builder() {
            } 

            private Builder(UsageStatistics model) {
                this.dimensionRefId = model.dimensionRefId;
                this.dimensionType = model.dimensionType;
                this.gwClusterId = model.gwClusterId;
                this.monthlyCacheToken = model.monthlyCacheToken;
                this.monthlyCostPoints = model.monthlyCostPoints;
                this.monthlyInputToken = model.monthlyInputToken;
                this.monthlyOutputToken = model.monthlyOutputToken;
                this.monthlyToken = model.monthlyToken;
                this.totalCacheToken = model.totalCacheToken;
                this.totalCostPoints = model.totalCostPoints;
                this.totalInputToken = model.totalInputToken;
                this.totalOutputToken = model.totalOutputToken;
                this.totalToken = model.totalToken;
            } 

            /**
             * DimensionRefId.
             */
            public Builder dimensionRefId(String dimensionRefId) {
                this.dimensionRefId = dimensionRefId;
                return this;
            }

            /**
             * DimensionType.
             */
            public Builder dimensionType(String dimensionType) {
                this.dimensionType = dimensionType;
                return this;
            }

            /**
             * GwClusterId.
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * MonthlyCacheToken.
             */
            public Builder monthlyCacheToken(String monthlyCacheToken) {
                this.monthlyCacheToken = monthlyCacheToken;
                return this;
            }

            /**
             * MonthlyCostPoints.
             */
            public Builder monthlyCostPoints(String monthlyCostPoints) {
                this.monthlyCostPoints = monthlyCostPoints;
                return this;
            }

            /**
             * MonthlyInputToken.
             */
            public Builder monthlyInputToken(String monthlyInputToken) {
                this.monthlyInputToken = monthlyInputToken;
                return this;
            }

            /**
             * MonthlyOutputToken.
             */
            public Builder monthlyOutputToken(String monthlyOutputToken) {
                this.monthlyOutputToken = monthlyOutputToken;
                return this;
            }

            /**
             * MonthlyToken.
             */
            public Builder monthlyToken(String monthlyToken) {
                this.monthlyToken = monthlyToken;
                return this;
            }

            /**
             * TotalCacheToken.
             */
            public Builder totalCacheToken(String totalCacheToken) {
                this.totalCacheToken = totalCacheToken;
                return this;
            }

            /**
             * TotalCostPoints.
             */
            public Builder totalCostPoints(String totalCostPoints) {
                this.totalCostPoints = totalCostPoints;
                return this;
            }

            /**
             * TotalInputToken.
             */
            public Builder totalInputToken(String totalInputToken) {
                this.totalInputToken = totalInputToken;
                return this;
            }

            /**
             * TotalOutputToken.
             */
            public Builder totalOutputToken(String totalOutputToken) {
                this.totalOutputToken = totalOutputToken;
                return this;
            }

            /**
             * TotalToken.
             */
            public Builder totalToken(String totalToken) {
                this.totalToken = totalToken;
                return this;
            }

            public UsageStatistics build() {
                return new UsageStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApikeyAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApikeyAttributeResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Consumer")
        private Consumer consumer;

        @com.aliyun.core.annotation.NameInMap("UsageStatistics")
        private java.util.List<UsageStatistics> usageStatistics;

        private Items(Builder builder) {
            this.consumer = builder.consumer;
            this.usageStatistics = builder.usageStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return consumer
         */
        public Consumer getConsumer() {
            return this.consumer;
        }

        /**
         * @return usageStatistics
         */
        public java.util.List<UsageStatistics> getUsageStatistics() {
            return this.usageStatistics;
        }

        public static final class Builder {
            private Consumer consumer; 
            private java.util.List<UsageStatistics> usageStatistics; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.consumer = model.consumer;
                this.usageStatistics = model.usageStatistics;
            } 

            /**
             * Consumer.
             */
            public Builder consumer(Consumer consumer) {
                this.consumer = consumer;
                return this;
            }

            /**
             * UsageStatistics.
             */
            public Builder usageStatistics(java.util.List<UsageStatistics> usageStatistics) {
                this.usageStatistics = usageStatistics;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
