// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrderConsumeStatisticRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrderConsumeStatisticRecordsResponseBody</p>
 */
public class ListOrderConsumeStatisticRecordsResponseBody extends TeaModel {
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

    private ListOrderConsumeStatisticRecordsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalElements = builder.totalElements;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrderConsumeStatisticRecordsResponseBody create() {
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

        public ListOrderConsumeStatisticRecordsResponseBody build() {
            return new ListOrderConsumeStatisticRecordsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AliOrderCode")
        private String aliOrderCode;

        @NameInMap("ApplicationExternalId")
        private String applicationExternalId;

        @NameInMap("ChargedCount")
        private Long chargedCount;

        @NameInMap("ServiceCode")
        private String serviceCode;

        @NameInMap("StatisticTime")
        private Long statisticTime;

        @NameInMap("TotalPrice")
        private Long totalPrice;

        @NameInMap("UnitPrice")
        private Long unitPrice;

        private Items(Builder builder) {
            this.aliOrderCode = builder.aliOrderCode;
            this.applicationExternalId = builder.applicationExternalId;
            this.chargedCount = builder.chargedCount;
            this.serviceCode = builder.serviceCode;
            this.statisticTime = builder.statisticTime;
            this.totalPrice = builder.totalPrice;
            this.unitPrice = builder.unitPrice;
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
         * @return applicationExternalId
         */
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        /**
         * @return chargedCount
         */
        public Long getChargedCount() {
            return this.chargedCount;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return statisticTime
         */
        public Long getStatisticTime() {
            return this.statisticTime;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return unitPrice
         */
        public Long getUnitPrice() {
            return this.unitPrice;
        }

        public static final class Builder {
            private String aliOrderCode; 
            private String applicationExternalId; 
            private Long chargedCount; 
            private String serviceCode; 
            private Long statisticTime; 
            private Long totalPrice; 
            private Long unitPrice; 

            /**
             * AliOrderCode.
             */
            public Builder aliOrderCode(String aliOrderCode) {
                this.aliOrderCode = aliOrderCode;
                return this;
            }

            /**
             * ApplicationExternalId.
             */
            public Builder applicationExternalId(String applicationExternalId) {
                this.applicationExternalId = applicationExternalId;
                return this;
            }

            /**
             * ChargedCount.
             */
            public Builder chargedCount(Long chargedCount) {
                this.chargedCount = chargedCount;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * StatisticTime.
             */
            public Builder statisticTime(Long statisticTime) {
                this.statisticTime = statisticTime;
                return this;
            }

            /**
             * TotalPrice.
             */
            public Builder totalPrice(Long totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * UnitPrice.
             */
            public Builder unitPrice(Long unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
