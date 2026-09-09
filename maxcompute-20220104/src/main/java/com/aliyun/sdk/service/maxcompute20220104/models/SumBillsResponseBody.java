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
 * {@link SumBillsResponseBody} extends {@link TeaModel}
 *
 * <p>SumBillsResponseBody</p>
 */
public class SumBillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumBillsResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumBillsResponseBody create() {
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

        private Builder(SumBillsResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
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

        public SumBillsResponseBody build() {
            return new SumBillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumBillsResponseBody} extends {@link TeaModel}
     *
     * <p>SumBillsResponseBody</p>
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
             * <p>123.56</p>
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The item name. When the request\&quot;s <code>statsType</code> is <code>PROJECT</code>, this is the instance name. When <code>statsType</code> is <code>FEE_ITEM</code>, this is the billable item type (for example, <code>DRStorage</code>, <code>ComputationSql</code>, or <code>Storage</code>).</p>
             * 
             * <strong>example:</strong>
             * <p>projectName</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The percentage of the total cost that this item represents. The value does not include a percent sign (%).</p>
             * 
             * <strong>example:</strong>
             * <p>56.12</p>
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
     * {@link SumBillsResponseBody} extends {@link TeaModel}
     *
     * <p>SumBillsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("itemBills")
        private java.util.List<ItemBills> itemBills;

        @com.aliyun.core.annotation.NameInMap("totalCost")
        private String totalCost;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.itemBills = builder.itemBills;
            this.totalCost = builder.totalCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return itemBills
         */
        public java.util.List<ItemBills> getItemBills() {
            return this.itemBills;
        }

        /**
         * @return totalCost
         */
        public String getTotalCost() {
            return this.totalCost;
        }

        public static final class Builder {
            private String currency; 
            private java.util.List<ItemBills> itemBills; 
            private String totalCost; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currency = model.currency;
                this.itemBills = model.itemBills;
                this.totalCost = model.totalCost;
            } 

            /**
             * <p>The currency used for all cost values.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>A list of billable items.</p>
             */
            public Builder itemBills(java.util.List<ItemBills> itemBills) {
                this.itemBills = itemBills;
                return this;
            }

            /**
             * <p>The total cost of all returned billable items.</p>
             * 
             * <strong>example:</strong>
             * <p>123.56</p>
             */
            public Builder totalCost(String totalCost) {
                this.totalCost = totalCost;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
