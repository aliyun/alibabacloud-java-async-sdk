// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLogistics4DistributionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLogistics4DistributionResponseBody</p>
 */
public class QueryLogistics4DistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.List < Model> model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryLogistics4DistributionResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLogistics4DistributionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List < Model> getModel() {
        return this.model;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private java.util.List < Model> model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryLogistics4DistributionResponseBody build() {
            return new QueryLogistics4DistributionResponseBody(this);
        } 

    } 

    public static class Goods extends TeaModel {
        @NameInMap("GoodName")
        private String goodName;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("SkuId")
        private String skuId;

        private Goods(Builder builder) {
            this.goodName = builder.goodName;
            this.itemId = builder.itemId;
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
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
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private String goodName; 
            private String itemId; 
            private Integer quantity; 
            private String skuId; 

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
            public Builder itemId(String itemId) {
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

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            public Goods build() {
                return new Goods(this);
            } 

        } 

    }
    public static class LogisticsDetailList extends TeaModel {
        @NameInMap("OcurrTimeStr")
        private String ocurrTimeStr;

        @NameInMap("StanderdDesc")
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
    public static class Model extends TeaModel {
        @NameInMap("DataProvider")
        private String dataProvider;

        @NameInMap("DataProviderTitle")
        private String dataProviderTitle;

        @NameInMap("Goods")
        private java.util.List < Goods> goods;

        @NameInMap("LogisticsCompanyCode")
        private String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        private String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        private java.util.List < LogisticsDetailList> logisticsDetailList;

        @NameInMap("MailNo")
        private String mailNo;

        private Model(Builder builder) {
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

        public static Model create() {
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
        public java.util.List < Goods> getGoods() {
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
        public java.util.List < LogisticsDetailList> getLogisticsDetailList() {
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
            private java.util.List < Goods> goods; 
            private String logisticsCompanyCode; 
            private String logisticsCompanyName; 
            private java.util.List < LogisticsDetailList> logisticsDetailList; 
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
            public Builder goods(java.util.List < Goods> goods) {
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
            public Builder logisticsDetailList(java.util.List < LogisticsDetailList> logisticsDetailList) {
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

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
