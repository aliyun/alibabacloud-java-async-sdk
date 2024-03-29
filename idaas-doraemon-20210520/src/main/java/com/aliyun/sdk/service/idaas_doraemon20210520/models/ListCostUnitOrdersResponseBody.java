// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCostUnitOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListCostUnitOrdersResponseBody</p>
 */
public class ListCostUnitOrdersResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalElements")
    private Long totalElements;

    @NameInMap("TotalPages")
    private Long totalPages;

    private ListCostUnitOrdersResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalElements = builder.totalElements;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCostUnitOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalElements
     */
    public Long getTotalElements() {
        return this.totalElements;
    }

    /**
     * @return totalPages
     */
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Long pageSize; 
        private String requestId; 
        private Long totalElements; 
        private Long totalPages; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * TotalElements.
         */
        public Builder totalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListCostUnitOrdersResponseBody build() {
            return new ListCostUnitOrdersResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AliOrderCode")
        private String aliOrderCode;

        @NameInMap("AliOrderInstanceId")
        private String aliOrderInstanceId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Exhausted")
        private Boolean exhausted;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("RefundTime")
        private Long refundTime;

        @NameInMap("TotalCostUnit")
        private Long totalCostUnit;

        @NameInMap("UsedCostUnit")
        private Long usedCostUnit;

        private Items(Builder builder) {
            this.aliOrderCode = builder.aliOrderCode;
            this.aliOrderInstanceId = builder.aliOrderInstanceId;
            this.createTime = builder.createTime;
            this.exhausted = builder.exhausted;
            this.expiredTime = builder.expiredTime;
            this.orderStatus = builder.orderStatus;
            this.refundTime = builder.refundTime;
            this.totalCostUnit = builder.totalCostUnit;
            this.usedCostUnit = builder.usedCostUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return aliOrderCode
         */
        public String getAliOrderCode() {
            return this.aliOrderCode;
        }

        /**
         * @return aliOrderInstanceId
         */
        public String getAliOrderInstanceId() {
            return this.aliOrderInstanceId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return exhausted
         */
        public Boolean getExhausted() {
            return this.exhausted;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return refundTime
         */
        public Long getRefundTime() {
            return this.refundTime;
        }

        /**
         * @return totalCostUnit
         */
        public Long getTotalCostUnit() {
            return this.totalCostUnit;
        }

        /**
         * @return usedCostUnit
         */
        public Long getUsedCostUnit() {
            return this.usedCostUnit;
        }

        public static final class Builder {
            private String aliOrderCode; 
            private String aliOrderInstanceId; 
            private Long createTime; 
            private Boolean exhausted; 
            private Long expiredTime; 
            private String orderStatus; 
            private Long refundTime; 
            private Long totalCostUnit; 
            private Long usedCostUnit; 

            /**
             * AliOrderCode.
             */
            public Builder aliOrderCode(String aliOrderCode) {
                this.aliOrderCode = aliOrderCode;
                return this;
            }

            /**
             * AliOrderInstanceId.
             */
            public Builder aliOrderInstanceId(String aliOrderInstanceId) {
                this.aliOrderInstanceId = aliOrderInstanceId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Exhausted.
             */
            public Builder exhausted(Boolean exhausted) {
                this.exhausted = exhausted;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * RefundTime.
             */
            public Builder refundTime(Long refundTime) {
                this.refundTime = refundTime;
                return this;
            }

            /**
             * TotalCostUnit.
             */
            public Builder totalCostUnit(Long totalCostUnit) {
                this.totalCostUnit = totalCostUnit;
                return this;
            }

            /**
             * UsedCostUnit.
             */
            public Builder usedCostUnit(Long usedCostUnit) {
                this.usedCostUnit = usedCostUnit;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
