// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link QueryCostByCostCenterResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostByCostCenterResponseBody</p>
 */
public class QueryCostByCostCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumeAmountList")
    private java.util.List<ConsumeAmountList> consumeAmountList;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalAmount")
    private String totalAmount;

    private QueryCostByCostCenterResponseBody(Builder builder) {
        this.consumeAmountList = builder.consumeAmountList;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
        this.totalAmount = builder.totalAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostByCostCenterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumeAmountList
     */
    public java.util.List<ConsumeAmountList> getConsumeAmountList() {
        return this.consumeAmountList;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalAmount
     */
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public static final class Builder {
        private java.util.List<ConsumeAmountList> consumeAmountList; 
        private Object metadata; 
        private String requestId; 
        private String totalAmount; 

        private Builder() {
        } 

        private Builder(QueryCostByCostCenterResponseBody model) {
            this.consumeAmountList = model.consumeAmountList;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
            this.totalAmount = model.totalAmount;
        } 

        /**
         * ConsumeAmountList.
         */
        public Builder consumeAmountList(java.util.List<ConsumeAmountList> consumeAmountList) {
            this.consumeAmountList = consumeAmountList;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
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
         * TotalAmount.
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public QueryCostByCostCenterResponseBody build() {
            return new QueryCostByCostCenterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostByCostCenterResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostByCostCenterResponseBody</p>
     */
    public static class ConsumeAmountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedAmount")
        private String allocatedAmount;

        @com.aliyun.core.annotation.NameInMap("CostCenterCode")
        private String costCenterCode;

        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("DirectAmount")
        private String directAmount;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountName")
        private String ownerAccountName;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        private Long parentCostCenterId;

        @com.aliyun.core.annotation.NameInMap("PreCostCenterId")
        private Long preCostCenterId;

        @com.aliyun.core.annotation.NameInMap("TotalAllocatedAmount")
        private String totalAllocatedAmount;

        @com.aliyun.core.annotation.NameInMap("TotalAllocatedAmountPercent")
        private String totalAllocatedAmountPercent;

        private ConsumeAmountList(Builder builder) {
            this.allocatedAmount = builder.allocatedAmount;
            this.costCenterCode = builder.costCenterCode;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.directAmount = builder.directAmount;
            this.level = builder.level;
            this.ownerAccountId = builder.ownerAccountId;
            this.ownerAccountName = builder.ownerAccountName;
            this.parentCostCenterId = builder.parentCostCenterId;
            this.preCostCenterId = builder.preCostCenterId;
            this.totalAllocatedAmount = builder.totalAllocatedAmount;
            this.totalAllocatedAmountPercent = builder.totalAllocatedAmountPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeAmountList create() {
            return builder().build();
        }

        /**
         * @return allocatedAmount
         */
        public String getAllocatedAmount() {
            return this.allocatedAmount;
        }

        /**
         * @return costCenterCode
         */
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return directAmount
         */
        public String getDirectAmount() {
            return this.directAmount;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return ownerAccountName
         */
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        /**
         * @return preCostCenterId
         */
        public Long getPreCostCenterId() {
            return this.preCostCenterId;
        }

        /**
         * @return totalAllocatedAmount
         */
        public String getTotalAllocatedAmount() {
            return this.totalAllocatedAmount;
        }

        /**
         * @return totalAllocatedAmountPercent
         */
        public String getTotalAllocatedAmountPercent() {
            return this.totalAllocatedAmountPercent;
        }

        public static final class Builder {
            private String allocatedAmount; 
            private String costCenterCode; 
            private Long costCenterId; 
            private String costCenterName; 
            private String directAmount; 
            private Integer level; 
            private Long ownerAccountId; 
            private String ownerAccountName; 
            private Long parentCostCenterId; 
            private Long preCostCenterId; 
            private String totalAllocatedAmount; 
            private String totalAllocatedAmountPercent; 

            private Builder() {
            } 

            private Builder(ConsumeAmountList model) {
                this.allocatedAmount = model.allocatedAmount;
                this.costCenterCode = model.costCenterCode;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.directAmount = model.directAmount;
                this.level = model.level;
                this.ownerAccountId = model.ownerAccountId;
                this.ownerAccountName = model.ownerAccountName;
                this.parentCostCenterId = model.parentCostCenterId;
                this.preCostCenterId = model.preCostCenterId;
                this.totalAllocatedAmount = model.totalAllocatedAmount;
                this.totalAllocatedAmountPercent = model.totalAllocatedAmountPercent;
            } 

            /**
             * AllocatedAmount.
             */
            public Builder allocatedAmount(String allocatedAmount) {
                this.allocatedAmount = allocatedAmount;
                return this;
            }

            /**
             * CostCenterCode.
             */
            public Builder costCenterCode(String costCenterCode) {
                this.costCenterCode = costCenterCode;
                return this;
            }

            /**
             * CostCenterId.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * CostCenterName.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * DirectAmount.
             */
            public Builder directAmount(String directAmount) {
                this.directAmount = directAmount;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * OwnerAccountId.
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * OwnerAccountName.
             */
            public Builder ownerAccountName(String ownerAccountName) {
                this.ownerAccountName = ownerAccountName;
                return this;
            }

            /**
             * ParentCostCenterId.
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            /**
             * PreCostCenterId.
             */
            public Builder preCostCenterId(Long preCostCenterId) {
                this.preCostCenterId = preCostCenterId;
                return this;
            }

            /**
             * TotalAllocatedAmount.
             */
            public Builder totalAllocatedAmount(String totalAllocatedAmount) {
                this.totalAllocatedAmount = totalAllocatedAmount;
                return this;
            }

            /**
             * TotalAllocatedAmountPercent.
             */
            public Builder totalAllocatedAmountPercent(String totalAllocatedAmountPercent) {
                this.totalAllocatedAmountPercent = totalAllocatedAmountPercent;
                return this;
            }

            public ConsumeAmountList build() {
                return new ConsumeAmountList(this);
            } 

        } 

    }
}
