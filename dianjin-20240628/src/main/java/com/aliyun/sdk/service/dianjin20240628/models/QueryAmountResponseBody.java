// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link QueryAmountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAmountResponseBody</p>
 */
public class QueryAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("retryAble")
    private Boolean retryAble;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private QueryAmountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAmountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return retryAble
     */
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean retryAble; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAmountResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.retryAble = model.retryAble;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * retryAble.
         */
        public Builder retryAble(Boolean retryAble) {
            this.retryAble = retryAble;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAmountResponseBody build() {
            return new QueryAmountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAmountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAmountResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("amountRatio")
        private String amountRatio;

        @com.aliyun.core.annotation.NameInMap("listFee")
        private String listFee;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("tier")
        private String tier;

        @com.aliyun.core.annotation.NameInMap("totalAmount")
        private String totalAmount;

        private Items(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.amount = builder.amount;
            this.amountRatio = builder.amountRatio;
            this.listFee = builder.listFee;
            this.price = builder.price;
            this.tier = builder.tier;
            this.totalAmount = builder.totalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return amountRatio
         */
        public String getAmountRatio() {
            return this.amountRatio;
        }

        /**
         * @return listFee
         */
        public String getListFee() {
            return this.listFee;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return tier
         */
        public String getTier() {
            return this.tier;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String amount; 
            private String amountRatio; 
            private String listFee; 
            private String price; 
            private String tier; 
            private String totalAmount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.aliyunUid = model.aliyunUid;
                this.amount = model.amount;
                this.amountRatio = model.amountRatio;
                this.listFee = model.listFee;
                this.price = model.price;
                this.tier = model.tier;
                this.totalAmount = model.totalAmount;
            } 

            /**
             * aliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * amountRatio.
             */
            public Builder amountRatio(String amountRatio) {
                this.amountRatio = amountRatio;
                return this;
            }

            /**
             * listFee.
             */
            public Builder listFee(String listFee) {
                this.listFee = listFee;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * tier.
             */
            public Builder tier(String tier) {
                this.tier = tier;
                return this;
            }

            /**
             * totalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAmountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAmountResponseBody</p>
     */
    public static class Total extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("listFee")
        private String listFee;

        @com.aliyun.core.annotation.NameInMap("totalAmount")
        private String totalAmount;

        private Total(Builder builder) {
            this.amount = builder.amount;
            this.listFee = builder.listFee;
            this.totalAmount = builder.totalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Total create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return listFee
         */
        public String getListFee() {
            return this.listFee;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public static final class Builder {
            private String amount; 
            private String listFee; 
            private String totalAmount; 

            private Builder() {
            } 

            private Builder(Total model) {
                this.amount = model.amount;
                this.listFee = model.listFee;
                this.totalAmount = model.totalAmount;
            } 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * listFee.
             */
            public Builder listFee(String listFee) {
                this.listFee = listFee;
                return this;
            }

            /**
             * totalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public Total build() {
                return new Total(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAmountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAmountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("scopeNote")
        private String scopeNote;

        @com.aliyun.core.annotation.NameInMap("startDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("total")
        private Total total;

        private Data(Builder builder) {
            this.endDate = builder.endDate;
            this.items = builder.items;
            this.scopeNote = builder.scopeNote;
            this.startDate = builder.startDate;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return scopeNote
         */
        public String getScopeNote() {
            return this.scopeNote;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return total
         */
        public Total getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String endDate; 
            private java.util.List<Items> items; 
            private String scopeNote; 
            private String startDate; 
            private Total total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endDate = model.endDate;
                this.items = model.items;
                this.scopeNote = model.scopeNote;
                this.startDate = model.startDate;
                this.total = model.total;
            } 

            /**
             * endDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * scopeNote.
             */
            public Builder scopeNote(String scopeNote) {
                this.scopeNote = scopeNote;
                return this;
            }

            /**
             * startDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Total total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
