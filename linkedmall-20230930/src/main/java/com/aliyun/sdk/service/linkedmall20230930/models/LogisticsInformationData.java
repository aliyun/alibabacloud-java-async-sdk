// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(LogisticsInformationData model) {
            this.logisticsStatus = model.logisticsStatus;
            this.modifiedTime = model.modifiedTime;
            this.orderId = model.orderId;
            this.orderLineId = model.orderLineId;
            this.outerPurchaseOrderId = model.outerPurchaseOrderId;
            this.purchaserId = model.purchaserId;
            this.trackingCompanyCode = model.trackingCompanyCode;
            this.trackingCompanyName = model.trackingCompanyName;
            this.trackingNumber = model.trackingNumber;
        } 

        /**
         * <p>The logistics status. A value of 2 indicates that the order is shipped and awaits the buyer\&quot;s confirmation of receipt.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }

        /**
         * <p>The time when the information was last updated, in yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>1713407100321</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6696070566****8593</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the order line.</p>
         * 
         * <strong>example:</strong>
         * <p>6692****5458</p>
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * <p>The external ID of the purchase order, provided upon creation.</p>
         * 
         * <strong>example:</strong>
         * <p>233111</p>
         */
        public Builder outerPurchaseOrderId(String outerPurchaseOrderId) {
            this.outerPurchaseOrderId = outerPurchaseOrderId;
            return this;
        }

        /**
         * <p>The ID of the purchaser.</p>
         * 
         * <strong>example:</strong>
         * <p>PID22000009</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * <p>The code of the logistics company.</p>
         * 
         * <strong>example:</strong>
         * <p>SF</p>
         */
        public Builder trackingCompanyCode(String trackingCompanyCode) {
            this.trackingCompanyCode = trackingCompanyCode;
            return this;
        }

        /**
         * <p>The name of the logistics company.</p>
         * 
         * <strong>example:</strong>
         * <p>顺丰快递</p>
         */
        public Builder trackingCompanyName(String trackingCompanyName) {
            this.trackingCompanyName = trackingCompanyName;
            return this;
        }

        /**
         * <p>The tracking number.</p>
         * 
         * <strong>example:</strong>
         * <p>SF198913131</p>
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
