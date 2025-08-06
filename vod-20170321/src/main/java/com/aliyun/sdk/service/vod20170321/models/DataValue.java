// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private String itemId;

    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("PurchaseStatus")
    private String purchaseStatus;

    @com.aliyun.core.annotation.NameInMap("ExpiredOn")
    private String expiredOn;

    private DataValue(Builder builder) {
        this.itemId = builder.itemId;
        this.businessType = builder.businessType;
        this.appName = builder.appName;
        this.status = builder.status;
        this.purchaseStatus = builder.purchaseStatus;
        this.expiredOn = builder.expiredOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return purchaseStatus
     */
    public String getPurchaseStatus() {
        return this.purchaseStatus;
    }

    /**
     * @return expiredOn
     */
    public String getExpiredOn() {
        return this.expiredOn;
    }

    public static final class Builder {
        private String itemId; 
        private String businessType; 
        private String appName; 
        private String status; 
        private String purchaseStatus; 
        private String expiredOn; 

        private Builder() {
        } 

        private Builder(DataValue model) {
            this.itemId = model.itemId;
            this.businessType = model.businessType;
            this.appName = model.appName;
            this.status = model.status;
            this.purchaseStatus = model.purchaseStatus;
            this.expiredOn = model.expiredOn;
        } 

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * PurchaseStatus.
         */
        public Builder purchaseStatus(String purchaseStatus) {
            this.purchaseStatus = purchaseStatus;
            return this;
        }

        /**
         * ExpiredOn.
         */
        public Builder expiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
