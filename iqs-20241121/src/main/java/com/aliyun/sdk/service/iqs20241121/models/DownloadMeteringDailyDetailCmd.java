// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link DownloadMeteringDailyDetailCmd} extends {@link TeaModel}
 *
 * <p>DownloadMeteringDailyDetailCmd</p>
 */
public class DownloadMeteringDailyDetailCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("billPeriod")
    private String billPeriod;

    @com.aliyun.core.annotation.NameInMap("billingItem")
    private String billingItem;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("subAccountId")
    private String subAccountId;

    private DownloadMeteringDailyDetailCmd(Builder builder) {
        this.billPeriod = builder.billPeriod;
        this.billingItem = builder.billingItem;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadMeteringDailyDetailCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billPeriod
     */
    public String getBillPeriod() {
        return this.billPeriod;
    }

    /**
     * @return billingItem
     */
    public String getBillingItem() {
        return this.billingItem;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static final class Builder {
        private String billPeriod; 
        private String billingItem; 
        private String endTime; 
        private String startTime; 
        private String subAccountId; 

        private Builder() {
        } 

        private Builder(DownloadMeteringDailyDetailCmd model) {
            this.billPeriod = model.billPeriod;
            this.billingItem = model.billingItem;
            this.endTime = model.endTime;
            this.startTime = model.startTime;
            this.subAccountId = model.subAccountId;
        } 

        /**
         * billPeriod.
         */
        public Builder billPeriod(String billPeriod) {
            this.billPeriod = billPeriod;
            return this;
        }

        /**
         * billingItem.
         */
        public Builder billingItem(String billingItem) {
            this.billingItem = billingItem;
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
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }

        public DownloadMeteringDailyDetailCmd build() {
            return new DownloadMeteringDailyDetailCmd(this);
        } 

    } 

}
