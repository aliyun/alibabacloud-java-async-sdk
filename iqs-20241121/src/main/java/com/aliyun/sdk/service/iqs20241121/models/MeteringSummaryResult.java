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
 * {@link MeteringSummaryResult} extends {@link TeaModel}
 *
 * <p>MeteringSummaryResult</p>
 */
public class MeteringSummaryResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("meteringSummaryList")
    private java.util.List<MeteringSummaryList> meteringSummaryList;

    private MeteringSummaryResult(Builder builder) {
        this.meteringSummaryList = builder.meteringSummaryList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MeteringSummaryResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return meteringSummaryList
     */
    public java.util.List<MeteringSummaryList> getMeteringSummaryList() {
        return this.meteringSummaryList;
    }

    public static final class Builder {
        private java.util.List<MeteringSummaryList> meteringSummaryList; 

        private Builder() {
        } 

        private Builder(MeteringSummaryResult model) {
            this.meteringSummaryList = model.meteringSummaryList;
        } 

        /**
         * meteringSummaryList.
         */
        public Builder meteringSummaryList(java.util.List<MeteringSummaryList> meteringSummaryList) {
            this.meteringSummaryList = meteringSummaryList;
            return this;
        }

        public MeteringSummaryResult build() {
            return new MeteringSummaryResult(this);
        } 

    } 

    /**
     * 
     * {@link MeteringSummaryResult} extends {@link TeaModel}
     *
     * <p>MeteringSummaryResult</p>
     */
    public static class MeteringSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingFunctionItem")
        private String billingFunctionItem;

        @com.aliyun.core.annotation.NameInMap("billingItem")
        private String billingItem;

        @com.aliyun.core.annotation.NameInMap("failCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private MeteringSummaryList(Builder builder) {
            this.billingFunctionItem = builder.billingFunctionItem;
            this.billingItem = builder.billingItem;
            this.failCount = builder.failCount;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringSummaryList create() {
            return builder().build();
        }

        /**
         * @return billingFunctionItem
         */
        public String getBillingFunctionItem() {
            return this.billingFunctionItem;
        }

        /**
         * @return billingItem
         */
        public String getBillingItem() {
            return this.billingItem;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private String billingFunctionItem; 
            private String billingItem; 
            private Integer failCount; 
            private Integer successCount; 

            private Builder() {
            } 

            private Builder(MeteringSummaryList model) {
                this.billingFunctionItem = model.billingFunctionItem;
                this.billingItem = model.billingItem;
                this.failCount = model.failCount;
                this.successCount = model.successCount;
            } 

            /**
             * billingFunctionItem.
             */
            public Builder billingFunctionItem(String billingFunctionItem) {
                this.billingFunctionItem = billingFunctionItem;
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
             * failCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public MeteringSummaryList build() {
                return new MeteringSummaryList(this);
            } 

        } 

    }
}
