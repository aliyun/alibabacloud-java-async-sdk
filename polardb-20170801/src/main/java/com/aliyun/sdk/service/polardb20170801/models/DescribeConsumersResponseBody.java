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
 * {@link DescribeConsumersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsumersResponseBody</p>
 */
public class DescribeConsumersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeConsumersResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsumersResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeConsumersResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeConsumersResponseBody build() {
            return new DescribeConsumersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsumersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedModels")
        private String allowedModels;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
        private String consumerGroupName;

        @com.aliyun.core.annotation.NameInMap("ConsumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LifetimeCostCount")
        private Long lifetimeCostCount;

        @com.aliyun.core.annotation.NameInMap("LifetimeTokenCount")
        private Long lifetimeTokenCount;

        @com.aliyun.core.annotation.NameInMap("MtdCostCount")
        private Long mtdCostCount;

        @com.aliyun.core.annotation.NameInMap("MtdTokenCount")
        private Long mtdTokenCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private Items(Builder builder) {
            this.allowedModels = builder.allowedModels;
            this.apiKey = builder.apiKey;
            this.consumerGroupId = builder.consumerGroupId;
            this.consumerGroupName = builder.consumerGroupName;
            this.consumerId = builder.consumerId;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.lifetimeCostCount = builder.lifetimeCostCount;
            this.lifetimeTokenCount = builder.lifetimeTokenCount;
            this.mtdCostCount = builder.mtdCostCount;
            this.mtdTokenCount = builder.mtdTokenCount;
            this.name = builder.name;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return allowedModels
         */
        public String getAllowedModels() {
            return this.allowedModels;
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
         * @return consumerGroupName
         */
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lifetimeCostCount
         */
        public Long getLifetimeCostCount() {
            return this.lifetimeCostCount;
        }

        /**
         * @return lifetimeTokenCount
         */
        public Long getLifetimeTokenCount() {
            return this.lifetimeTokenCount;
        }

        /**
         * @return mtdCostCount
         */
        public Long getMtdCostCount() {
            return this.mtdCostCount;
        }

        /**
         * @return mtdTokenCount
         */
        public Long getMtdTokenCount() {
            return this.mtdTokenCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String allowedModels; 
            private String apiKey; 
            private String consumerGroupId; 
            private String consumerGroupName; 
            private String consumerId; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long lifetimeCostCount; 
            private Long lifetimeTokenCount; 
            private Long mtdCostCount; 
            private Long mtdTokenCount; 
            private String name; 
            private String nickName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.allowedModels = model.allowedModels;
                this.apiKey = model.apiKey;
                this.consumerGroupId = model.consumerGroupId;
                this.consumerGroupName = model.consumerGroupName;
                this.consumerId = model.consumerId;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.lifetimeCostCount = model.lifetimeCostCount;
                this.lifetimeTokenCount = model.lifetimeTokenCount;
                this.mtdCostCount = model.mtdCostCount;
                this.mtdTokenCount = model.mtdTokenCount;
                this.name = model.name;
                this.nickName = model.nickName;
            } 

            /**
             * AllowedModels.
             */
            public Builder allowedModels(String allowedModels) {
                this.allowedModels = allowedModels;
                return this;
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
             * ConsumerGroupName.
             */
            public Builder consumerGroupName(String consumerGroupName) {
                this.consumerGroupName = consumerGroupName;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * LifetimeCostCount.
             */
            public Builder lifetimeCostCount(Long lifetimeCostCount) {
                this.lifetimeCostCount = lifetimeCostCount;
                return this;
            }

            /**
             * LifetimeTokenCount.
             */
            public Builder lifetimeTokenCount(Long lifetimeTokenCount) {
                this.lifetimeTokenCount = lifetimeTokenCount;
                return this;
            }

            /**
             * MtdCostCount.
             */
            public Builder mtdCostCount(Long mtdCostCount) {
                this.mtdCostCount = mtdCostCount;
                return this;
            }

            /**
             * MtdTokenCount.
             */
            public Builder mtdTokenCount(Long mtdTokenCount) {
                this.mtdTokenCount = mtdTokenCount;
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
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
