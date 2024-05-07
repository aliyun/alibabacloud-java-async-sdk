// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneralBill} extends {@link TeaModel}
 *
 * <p>GeneralBill</p>
 */
public class GeneralBill extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("billId")
    private String billId;

    @com.aliyun.core.annotation.NameInMap("billPeriod")
    private String billPeriod;

    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private java.util.List < String > downloadUrl;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("shopName")
    private String shopName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("totalAmount")
    private Money totalAmount;

    private GeneralBill(Builder builder) {
        this.billId = builder.billId;
        this.billPeriod = builder.billPeriod;
        this.downloadUrl = builder.downloadUrl;
        this.endTime = builder.endTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.shopId = builder.shopId;
        this.shopName = builder.shopName;
        this.startTime = builder.startTime;
        this.totalAmount = builder.totalAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralBill create() {
        return builder().build();
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return billPeriod
     */
    public String getBillPeriod() {
        return this.billPeriod;
    }

    /**
     * @return downloadUrl
     */
    public java.util.List < String > getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalAmount
     */
    public Money getTotalAmount() {
        return this.totalAmount;
    }

    public static final class Builder {
        private String billId; 
        private String billPeriod; 
        private java.util.List < String > downloadUrl; 
        private String endTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private String shopId; 
        private String shopName; 
        private String startTime; 
        private Money totalAmount; 

        /**
         * billId.
         */
        public Builder billId(String billId) {
            this.billId = billId;
            return this;
        }

        /**
         * billPeriod.
         */
        public Builder billPeriod(String billPeriod) {
            this.billPeriod = billPeriod;
            return this;
        }

        /**
         * downloadUrl.
         */
        public Builder downloadUrl(java.util.List < String > downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * shopName.
         */
        public Builder shopName(String shopName) {
            this.shopName = shopName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * totalAmount.
         */
        public Builder totalAmount(Money totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public GeneralBill build() {
            return new GeneralBill(this);
        } 

    } 

}
