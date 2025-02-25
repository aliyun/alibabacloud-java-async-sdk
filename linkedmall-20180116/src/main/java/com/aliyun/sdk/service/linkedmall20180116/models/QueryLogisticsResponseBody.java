// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLogisticsResponseBody</p>
 */
public class QueryLogisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryLogisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLogisticsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryLogisticsResponseBody build() {
            return new QueryLogisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLogisticsResponseBody</p>
     */
    public static class Goods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GoodName")
        private String goodName;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        private Goods(Builder builder) {
            this.goodName = builder.goodName;
            this.itemId = builder.itemId;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Goods create() {
            return builder().build();
        }

        /**
         * @return goodName
         */
        public String getGoodName() {
            return this.goodName;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String goodName; 
            private Long itemId; 
            private Integer quantity; 

            /**
             * GoodName.
             */
            public Builder goodName(String goodName) {
                this.goodName = goodName;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            public Goods build() {
                return new Goods(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLogisticsResponseBody</p>
     */
    public static class DataGoods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Goods")
        private java.util.List<Goods> goods;

        private DataGoods(Builder builder) {
            this.goods = builder.goods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataGoods create() {
            return builder().build();
        }

        /**
         * @return goods
         */
        public java.util.List<Goods> getGoods() {
            return this.goods;
        }

        public static final class Builder {
            private java.util.List<Goods> goods; 

            /**
             * Goods.
             */
            public Builder goods(java.util.List<Goods> goods) {
                this.goods = goods;
                return this;
            }

            public DataGoods build() {
                return new DataGoods(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLogisticsResponseBody</p>
     */
    public static class LogisticsDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OcurrTimeStr")
        private String ocurrTimeStr;

        @com.aliyun.core.annotation.NameInMap("StanderdDesc")
        private String standerdDesc;

        private LogisticsDetailList(Builder builder) {
            this.ocurrTimeStr = builder.ocurrTimeStr;
            this.standerdDesc = builder.standerdDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogisticsDetailList create() {
            return builder().build();
        }

        /**
         * @return ocurrTimeStr
         */
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        /**
         * @return standerdDesc
         */
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

        public static final class Builder {
            private String ocurrTimeStr; 
            private String standerdDesc; 

            /**
             * OcurrTimeStr.
             */
            public Builder ocurrTimeStr(String ocurrTimeStr) {
                this.ocurrTimeStr = ocurrTimeStr;
                return this;
            }

            /**
             * StanderdDesc.
             */
            public Builder standerdDesc(String standerdDesc) {
                this.standerdDesc = standerdDesc;
                return this;
            }

            public LogisticsDetailList build() {
                return new LogisticsDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLogisticsResponseBody</p>
     */
    public static class DataLogisticsDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogisticsDetailList")
        private java.util.List<LogisticsDetailList> logisticsDetailList;

        private DataLogisticsDetailList(Builder builder) {
            this.logisticsDetailList = builder.logisticsDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataLogisticsDetailList create() {
            return builder().build();
        }

        /**
         * @return logisticsDetailList
         */
        public java.util.List<LogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public static final class Builder {
            private java.util.List<LogisticsDetailList> logisticsDetailList; 

            /**
             * LogisticsDetailList.
             */
            public Builder logisticsDetailList(java.util.List<LogisticsDetailList> logisticsDetailList) {
                this.logisticsDetailList = logisticsDetailList;
                return this;
            }

            public DataLogisticsDetailList build() {
                return new DataLogisticsDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLogisticsResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataProvider")
        private String dataProvider;

        @com.aliyun.core.annotation.NameInMap("DataProviderTitle")
        private String dataProviderTitle;

        @com.aliyun.core.annotation.NameInMap("Goods")
        private DataGoods goods;

        @com.aliyun.core.annotation.NameInMap("LogisticsCompanyCode")
        private String logisticsCompanyCode;

        @com.aliyun.core.annotation.NameInMap("LogisticsCompanyName")
        private String logisticsCompanyName;

        @com.aliyun.core.annotation.NameInMap("LogisticsDetailList")
        private DataLogisticsDetailList logisticsDetailList;

        @com.aliyun.core.annotation.NameInMap("MailNo")
        private String mailNo;

        private DataData(Builder builder) {
            this.dataProvider = builder.dataProvider;
            this.dataProviderTitle = builder.dataProviderTitle;
            this.goods = builder.goods;
            this.logisticsCompanyCode = builder.logisticsCompanyCode;
            this.logisticsCompanyName = builder.logisticsCompanyName;
            this.logisticsDetailList = builder.logisticsDetailList;
            this.mailNo = builder.mailNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return dataProvider
         */
        public String getDataProvider() {
            return this.dataProvider;
        }

        /**
         * @return dataProviderTitle
         */
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        /**
         * @return goods
         */
        public DataGoods getGoods() {
            return this.goods;
        }

        /**
         * @return logisticsCompanyCode
         */
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        /**
         * @return logisticsCompanyName
         */
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        /**
         * @return logisticsDetailList
         */
        public DataLogisticsDetailList getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        /**
         * @return mailNo
         */
        public String getMailNo() {
            return this.mailNo;
        }

        public static final class Builder {
            private String dataProvider; 
            private String dataProviderTitle; 
            private DataGoods goods; 
            private String logisticsCompanyCode; 
            private String logisticsCompanyName; 
            private DataLogisticsDetailList logisticsDetailList; 
            private String mailNo; 

            /**
             * DataProvider.
             */
            public Builder dataProvider(String dataProvider) {
                this.dataProvider = dataProvider;
                return this;
            }

            /**
             * DataProviderTitle.
             */
            public Builder dataProviderTitle(String dataProviderTitle) {
                this.dataProviderTitle = dataProviderTitle;
                return this;
            }

            /**
             * Goods.
             */
            public Builder goods(DataGoods goods) {
                this.goods = goods;
                return this;
            }

            /**
             * LogisticsCompanyCode.
             */
            public Builder logisticsCompanyCode(String logisticsCompanyCode) {
                this.logisticsCompanyCode = logisticsCompanyCode;
                return this;
            }

            /**
             * LogisticsCompanyName.
             */
            public Builder logisticsCompanyName(String logisticsCompanyName) {
                this.logisticsCompanyName = logisticsCompanyName;
                return this;
            }

            /**
             * LogisticsDetailList.
             */
            public Builder logisticsDetailList(DataLogisticsDetailList logisticsDetailList) {
                this.logisticsDetailList = logisticsDetailList;
                return this;
            }

            /**
             * MailNo.
             */
            public Builder mailNo(String mailNo) {
                this.mailNo = mailNo;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLogisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
