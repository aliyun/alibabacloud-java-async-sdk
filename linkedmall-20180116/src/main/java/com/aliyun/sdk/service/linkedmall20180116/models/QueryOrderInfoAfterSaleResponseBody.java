// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderInfoAfterSaleResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderInfoAfterSaleResponseBody</p>
 */
public class QueryOrderInfoAfterSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private QueryOrderInfoAfterSaleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderInfoAfterSaleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryOrderInfoAfterSaleResponseBody build() {
            return new QueryOrderInfoAfterSaleResponseBody(this);
        } 

    } 

    public static class Logistics extends TeaModel {
        @NameInMap("LogisticsCompanyCode")
        private String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        private String logisticsCompanyName;

        @NameInMap("LogisticsNo")
        private String logisticsNo;

        @NameInMap("LogisticsStatus")
        private String logisticsStatus;

        private Logistics(Builder builder) {
            this.logisticsCompanyCode = builder.logisticsCompanyCode;
            this.logisticsCompanyName = builder.logisticsCompanyName;
            this.logisticsNo = builder.logisticsNo;
            this.logisticsStatus = builder.logisticsStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logistics create() {
            return builder().build();
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
         * @return logisticsNo
         */
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        /**
         * @return logisticsStatus
         */
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public static final class Builder {
            private String logisticsCompanyCode; 
            private String logisticsCompanyName; 
            private String logisticsNo; 
            private String logisticsStatus; 

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
             * LogisticsNo.
             */
            public Builder logisticsNo(String logisticsNo) {
                this.logisticsNo = logisticsNo;
                return this;
            }

            /**
             * LogisticsStatus.
             */
            public Builder logisticsStatus(String logisticsStatus) {
                this.logisticsStatus = logisticsStatus;
                return this;
            }

            public Logistics build() {
                return new Logistics(this);
            } 

        } 

    }
    public static class LogisticsList extends TeaModel {
        @NameInMap("Logistics")
        private java.util.List < Logistics> logistics;

        private LogisticsList(Builder builder) {
            this.logistics = builder.logistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogisticsList create() {
            return builder().build();
        }

        /**
         * @return logistics
         */
        public java.util.List < Logistics> getLogistics() {
            return this.logistics;
        }

        public static final class Builder {
            private java.util.List < Logistics> logistics; 

            /**
             * Logistics.
             */
            public Builder logistics(java.util.List < Logistics> logistics) {
                this.logistics = logistics;
                return this;
            }

            public LogisticsList build() {
                return new LogisticsList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("CashAmount")
        private String cashAmount;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("ExtJson")
        private String extJson;

        @NameInMap("LmOrderId")
        private Long lmOrderId;

        @NameInMap("LogisticsList")
        private LogisticsList logisticsList;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("Points")
        private Long points;

        @NameInMap("PointsAmount")
        private Long pointsAmount;

        @NameInMap("RefundAmount")
        private Long refundAmount;

        @NameInMap("RefundPoints")
        private Long refundPoints;

        @NameInMap("RefundRate")
        private String refundRate;

        @NameInMap("RefundStatus")
        private String refundStatus;

        @NameInMap("ShopName")
        private String shopName;

        @NameInMap("ShopServiceTelephone")
        private String shopServiceTelephone;

        @NameInMap("TbOrderId")
        private Long tbOrderId;

        @NameInMap("XiaomiCode")
        private String xiaomiCode;

        private Model(Builder builder) {
            this.cashAmount = builder.cashAmount;
            this.createDate = builder.createDate;
            this.extJson = builder.extJson;
            this.lmOrderId = builder.lmOrderId;
            this.logisticsList = builder.logisticsList;
            this.orderStatus = builder.orderStatus;
            this.points = builder.points;
            this.pointsAmount = builder.pointsAmount;
            this.refundAmount = builder.refundAmount;
            this.refundPoints = builder.refundPoints;
            this.refundRate = builder.refundRate;
            this.refundStatus = builder.refundStatus;
            this.shopName = builder.shopName;
            this.shopServiceTelephone = builder.shopServiceTelephone;
            this.tbOrderId = builder.tbOrderId;
            this.xiaomiCode = builder.xiaomiCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return cashAmount
         */
        public String getCashAmount() {
            return this.cashAmount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return extJson
         */
        public String getExtJson() {
            return this.extJson;
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return logisticsList
         */
        public LogisticsList getLogisticsList() {
            return this.logisticsList;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        /**
         * @return pointsAmount
         */
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        /**
         * @return refundAmount
         */
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundPoints
         */
        public Long getRefundPoints() {
            return this.refundPoints;
        }

        /**
         * @return refundRate
         */
        public String getRefundRate() {
            return this.refundRate;
        }

        /**
         * @return refundStatus
         */
        public String getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return shopServiceTelephone
         */
        public String getShopServiceTelephone() {
            return this.shopServiceTelephone;
        }

        /**
         * @return tbOrderId
         */
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        /**
         * @return xiaomiCode
         */
        public String getXiaomiCode() {
            return this.xiaomiCode;
        }

        public static final class Builder {
            private String cashAmount; 
            private String createDate; 
            private String extJson; 
            private Long lmOrderId; 
            private LogisticsList logisticsList; 
            private String orderStatus; 
            private Long points; 
            private Long pointsAmount; 
            private Long refundAmount; 
            private Long refundPoints; 
            private String refundRate; 
            private String refundStatus; 
            private String shopName; 
            private String shopServiceTelephone; 
            private Long tbOrderId; 
            private String xiaomiCode; 

            /**
             * CashAmount.
             */
            public Builder cashAmount(String cashAmount) {
                this.cashAmount = cashAmount;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * ExtJson.
             */
            public Builder extJson(String extJson) {
                this.extJson = extJson;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * LogisticsList.
             */
            public Builder logisticsList(LogisticsList logisticsList) {
                this.logisticsList = logisticsList;
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
             * Points.
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            /**
             * PointsAmount.
             */
            public Builder pointsAmount(Long pointsAmount) {
                this.pointsAmount = pointsAmount;
                return this;
            }

            /**
             * RefundAmount.
             */
            public Builder refundAmount(Long refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * RefundPoints.
             */
            public Builder refundPoints(Long refundPoints) {
                this.refundPoints = refundPoints;
                return this;
            }

            /**
             * RefundRate.
             */
            public Builder refundRate(String refundRate) {
                this.refundRate = refundRate;
                return this;
            }

            /**
             * RefundStatus.
             */
            public Builder refundStatus(String refundStatus) {
                this.refundStatus = refundStatus;
                return this;
            }

            /**
             * ShopName.
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            /**
             * ShopServiceTelephone.
             */
            public Builder shopServiceTelephone(String shopServiceTelephone) {
                this.shopServiceTelephone = shopServiceTelephone;
                return this;
            }

            /**
             * TbOrderId.
             */
            public Builder tbOrderId(Long tbOrderId) {
                this.tbOrderId = tbOrderId;
                return this;
            }

            /**
             * XiaomiCode.
             */
            public Builder xiaomiCode(String xiaomiCode) {
                this.xiaomiCode = xiaomiCode;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
