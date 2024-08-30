// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogisticsInformationData} extends {@link TeaModel}
 *
 * <p>LogisticsInformationData</p>
 */
public class LogisticsInformationData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logisticsStatus")
    private String logisticsStatus;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("orderLineId")
    private String orderLineId;

    @com.aliyun.core.annotation.NameInMap("outerPurchaseOrderId")
    private String outerPurchaseOrderId;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    private String purchaserId;

    @com.aliyun.core.annotation.NameInMap("trackingCompanyCode")
    private String trackingCompanyCode;

    @com.aliyun.core.annotation.NameInMap("trackingCompanyName")
    private String trackingCompanyName;

    @com.aliyun.core.annotation.NameInMap("trackingNumber")
    private String trackingNumber;

    private LogisticsInformationData(Builder builder) {
        this.logisticsStatus = builder.logisticsStatus;
        this.modifiedTime = builder.modifiedTime;
        this.orderId = builder.orderId;
        this.orderLineId = builder.orderLineId;
        this.outerPurchaseOrderId = builder.outerPurchaseOrderId;
        this.purchaserId = builder.purchaserId;
        this.trackingCompanyCode = builder.trackingCompanyCode;
        this.trackingCompanyName = builder.trackingCompanyName;
        this.trackingNumber = builder.trackingNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogisticsInformationData create() {
        return builder().build();
    }

    /**
     * @return logisticsStatus
     */
    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    /**
     * @return outerPurchaseOrderId
     */
    public String getOuterPurchaseOrderId() {
        return this.outerPurchaseOrderId;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return trackingCompanyCode
     */
    public String getTrackingCompanyCode() {
        return this.trackingCompanyCode;
    }

    /**
     * @return trackingCompanyName
     */
    public String getTrackingCompanyName() {
        return this.trackingCompanyName;
    }

    /**
     * @return trackingNumber
     */
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    public static final class Builder {
        private String logisticsStatus; 
        private String modifiedTime; 
        private String orderId; 
        private String orderLineId; 
        private String outerPurchaseOrderId; 
        private String purchaserId; 
        private String trackingCompanyCode; 
        private String trackingCompanyName; 
        private String trackingNumber; 

        /**
         * logisticsStatus.
         */
        public Builder logisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }

        /**
         * modifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * orderLineId.
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * outerPurchaseOrderId.
         */
        public Builder outerPurchaseOrderId(String outerPurchaseOrderId) {
            this.outerPurchaseOrderId = outerPurchaseOrderId;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * trackingCompanyCode.
         */
        public Builder trackingCompanyCode(String trackingCompanyCode) {
            this.trackingCompanyCode = trackingCompanyCode;
            return this;
        }

        /**
         * trackingCompanyName.
         */
        public Builder trackingCompanyName(String trackingCompanyName) {
            this.trackingCompanyName = trackingCompanyName;
            return this;
        }

        /**
         * trackingNumber.
         */
        public Builder trackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
            return this;
        }

        public LogisticsInformationData build() {
            return new LogisticsInformationData(this);
        } 

    } 

}
