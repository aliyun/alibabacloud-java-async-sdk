// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumDailyBillsByItemResponseBody} extends {@link TeaModel}
 *
 * <p>SumDailyBillsByItemResponseBody</p>
 */
public class SumDailyBillsByItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumDailyBillsByItemResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumDailyBillsByItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SumDailyBillsByItemResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SumDailyBillsByItemResponseBody build() {
            return new SumDailyBillsByItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumDailyBillsByItemResponseBody} extends {@link TeaModel}
     *
     * <p>SumDailyBillsByItemResponseBody</p>
     */
    public static class ItemBills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private String cost;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("itemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private Double percentage;

        private ItemBills(Builder builder) {
            this.cost = builder.cost;
            this.currency = builder.currency;
            this.itemName = builder.itemName;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemBills create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public String getCost() {
            return this.cost;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return percentage
         */
        public Double getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private String cost; 
            private String currency; 
            private String itemName; 
            private Double percentage; 

            private Builder() {
            } 

            private Builder(ItemBills model) {
                this.cost = model.cost;
                this.currency = model.currency;
                this.itemName = model.itemName;
                this.percentage = model.percentage;
            } 

            /**
             * cost.
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * itemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * percentage.
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            public ItemBills build() {
                return new ItemBills(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumDailyBillsByItemResponseBody} extends {@link TeaModel}
     *
     * <p>SumDailyBillsByItemResponseBody</p>
     */
    public static class DailySumBills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private String cost;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("itemBills")
        private java.util.List<ItemBills> itemBills;

        private DailySumBills(Builder builder) {
            this.cost = builder.cost;
            this.currency = builder.currency;
            this.dateTime = builder.dateTime;
            this.itemBills = builder.itemBills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailySumBills create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public String getCost() {
            return this.cost;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return itemBills
         */
        public java.util.List<ItemBills> getItemBills() {
            return this.itemBills;
        }

        public static final class Builder {
            private String cost; 
            private String currency; 
            private String dateTime; 
            private java.util.List<ItemBills> itemBills; 

            private Builder() {
            } 

            private Builder(DailySumBills model) {
                this.cost = model.cost;
                this.currency = model.currency;
                this.dateTime = model.dateTime;
                this.itemBills = model.itemBills;
            } 

            /**
             * cost.
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * dateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * itemBills.
             */
            public Builder itemBills(java.util.List<ItemBills> itemBills) {
                this.itemBills = itemBills;
                return this;
            }

            public DailySumBills build() {
                return new DailySumBills(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumDailyBillsByItemResponseBody} extends {@link TeaModel}
     *
     * <p>SumDailyBillsByItemResponseBody</p>
     */
    public static class ItemSummaryBills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("dailySumBills")
        private java.util.List<DailySumBills> dailySumBills;

        @com.aliyun.core.annotation.NameInMap("itemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private Double percentage;

        @com.aliyun.core.annotation.NameInMap("specCode")
        private String specCode;

        @com.aliyun.core.annotation.NameInMap("totalCost")
        private String totalCost;

        private ItemSummaryBills(Builder builder) {
            this.currency = builder.currency;
            this.dailySumBills = builder.dailySumBills;
            this.itemName = builder.itemName;
            this.percentage = builder.percentage;
            this.specCode = builder.specCode;
            this.totalCost = builder.totalCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemSummaryBills create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return dailySumBills
         */
        public java.util.List<DailySumBills> getDailySumBills() {
            return this.dailySumBills;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return percentage
         */
        public Double getPercentage() {
            return this.percentage;
        }

        /**
         * @return specCode
         */
        public String getSpecCode() {
            return this.specCode;
        }

        /**
         * @return totalCost
         */
        public String getTotalCost() {
            return this.totalCost;
        }

        public static final class Builder {
            private String currency; 
            private java.util.List<DailySumBills> dailySumBills; 
            private String itemName; 
            private Double percentage; 
            private String specCode; 
            private String totalCost; 

            private Builder() {
            } 

            private Builder(ItemSummaryBills model) {
                this.currency = model.currency;
                this.dailySumBills = model.dailySumBills;
                this.itemName = model.itemName;
                this.percentage = model.percentage;
                this.specCode = model.specCode;
                this.totalCost = model.totalCost;
            } 

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * dailySumBills.
             */
            public Builder dailySumBills(java.util.List<DailySumBills> dailySumBills) {
                this.dailySumBills = dailySumBills;
                return this;
            }

            /**
             * itemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * percentage.
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * specCode.
             */
            public Builder specCode(String specCode) {
                this.specCode = specCode;
                return this;
            }

            /**
             * totalCost.
             */
            public Builder totalCost(String totalCost) {
                this.totalCost = totalCost;
                return this;
            }

            public ItemSummaryBills build() {
                return new ItemSummaryBills(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumDailyBillsByItemResponseBody} extends {@link TeaModel}
     *
     * <p>SumDailyBillsByItemResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("itemSummaryBills")
        private java.util.List<ItemSummaryBills> itemSummaryBills;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.itemSummaryBills = builder.itemSummaryBills;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return itemSummaryBills
         */
        public java.util.List<ItemSummaryBills> getItemSummaryBills() {
            return this.itemSummaryBills;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ItemSummaryBills> itemSummaryBills; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.itemSummaryBills = model.itemSummaryBills;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * itemSummaryBills.
             */
            public Builder itemSummaryBills(java.util.List<ItemSummaryBills> itemSummaryBills) {
                this.itemSummaryBills = itemSummaryBills;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
