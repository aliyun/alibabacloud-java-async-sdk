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
 * {@link SumBillsByDateResponseBody} extends {@link TeaModel}
 *
 * <p>SumBillsByDateResponseBody</p>
 */
public class SumBillsByDateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumBillsByDateResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumBillsByDateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SumBillsByDateResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BB66A390-4EF7-557E-9489-7F98D6F44002</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SumBillsByDateResponseBody build() {
            return new SumBillsByDateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumBillsByDateResponseBody} extends {@link TeaModel}
     *
     * <p>SumBillsByDateResponseBody</p>
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
             * <p>The cost.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The currency. This is a fixed value.</p>
             * 
             * <strong>example:</strong>
             * <p>RMB</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The name of the item. The value of this parameter depends on the <code>statsType</code> parameter in the request. If <code>statsType</code> is <code>PROJECT</code>, this parameter indicates the instance name. If <code>statsType</code> is <code>FEE_ITEM</code>, this parameter can be a value such as <code>DRStorage</code>, <code>ComputationSql</code>, or <code>Storage</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>projectName</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The item\&quot;s cost as a percentage of the total daily cost. This value does not include a percent sign (%).</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
     * {@link SumBillsByDateResponseBody} extends {@link TeaModel}
     *
     * <p>SumBillsByDateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private String cost;

        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("itemBills")
        private java.util.List<ItemBills> itemBills;

        private Data(Builder builder) {
            this.cost = builder.cost;
            this.currency = builder.currency;
            this.dateTime = builder.dateTime;
            this.itemBills = builder.itemBills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            private Builder(Data model) {
                this.cost = model.cost;
                this.currency = model.currency;
                this.dateTime = model.dateTime;
                this.itemBills = model.itemBills;
            } 

            /**
             * <p>The total cost for the specified <code>dateTime</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The currency. This is a fixed value.</p>
             * 
             * <strong>example:</strong>
             * <p>RMB</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The date of the statistics, in <code>yyyyMMdd</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>20250719</p>
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * <p>A list of billable items.</p>
             */
            public Builder itemBills(java.util.List<ItemBills> itemBills) {
                this.itemBills = itemBills;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
