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
 * {@link ListMeteringDailyDetailResult} extends {@link TeaModel}
 *
 * <p>ListMeteringDailyDetailResult</p>
 */
public class ListMeteringDailyDetailResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("meteringDailyDetailList")
    private java.util.List<MeteringDailyDetailList> meteringDailyDetailList;

    private ListMeteringDailyDetailResult(Builder builder) {
        this.meteringDailyDetailList = builder.meteringDailyDetailList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMeteringDailyDetailResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return meteringDailyDetailList
     */
    public java.util.List<MeteringDailyDetailList> getMeteringDailyDetailList() {
        return this.meteringDailyDetailList;
    }

    public static final class Builder {
        private java.util.List<MeteringDailyDetailList> meteringDailyDetailList; 

        private Builder() {
        } 

        private Builder(ListMeteringDailyDetailResult model) {
            this.meteringDailyDetailList = model.meteringDailyDetailList;
        } 

        /**
         * meteringDailyDetailList.
         */
        public Builder meteringDailyDetailList(java.util.List<MeteringDailyDetailList> meteringDailyDetailList) {
            this.meteringDailyDetailList = meteringDailyDetailList;
            return this;
        }

        public ListMeteringDailyDetailResult build() {
            return new ListMeteringDailyDetailResult(this);
        } 

    } 

    /**
     * 
     * {@link ListMeteringDailyDetailResult} extends {@link TeaModel}
     *
     * <p>ListMeteringDailyDetailResult</p>
     */
    public static class MeteringDailyDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billDate")
        private String billDate;

        @com.aliyun.core.annotation.NameInMap("billPeriod")
        private String billPeriod;

        @com.aliyun.core.annotation.NameInMap("billingFunctionItem")
        private String billingFunctionItem;

        @com.aliyun.core.annotation.NameInMap("billingItem")
        private String billingItem;

        @com.aliyun.core.annotation.NameInMap("billingQps")
        private Integer billingQps;

        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("ladderTypeCode")
        private Integer ladderTypeCode;

        @com.aliyun.core.annotation.NameInMap("subAccountId")
        private String subAccountId;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private MeteringDailyDetailList(Builder builder) {
            this.billDate = builder.billDate;
            this.billPeriod = builder.billPeriod;
            this.billingFunctionItem = builder.billingFunctionItem;
            this.billingItem = builder.billingItem;
            this.billingQps = builder.billingQps;
            this.failedCount = builder.failedCount;
            this.ladderTypeCode = builder.ladderTypeCode;
            this.subAccountId = builder.subAccountId;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringDailyDetailList create() {
            return builder().build();
        }

        /**
         * @return billDate
         */
        public String getBillDate() {
            return this.billDate;
        }

        /**
         * @return billPeriod
         */
        public String getBillPeriod() {
            return this.billPeriod;
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
         * @return billingQps
         */
        public Integer getBillingQps() {
            return this.billingQps;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return ladderTypeCode
         */
        public Integer getLadderTypeCode() {
            return this.ladderTypeCode;
        }

        /**
         * @return subAccountId
         */
        public String getSubAccountId() {
            return this.subAccountId;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private String billDate; 
            private String billPeriod; 
            private String billingFunctionItem; 
            private String billingItem; 
            private Integer billingQps; 
            private Integer failedCount; 
            private Integer ladderTypeCode; 
            private String subAccountId; 
            private Integer successCount; 

            private Builder() {
            } 

            private Builder(MeteringDailyDetailList model) {
                this.billDate = model.billDate;
                this.billPeriod = model.billPeriod;
                this.billingFunctionItem = model.billingFunctionItem;
                this.billingItem = model.billingItem;
                this.billingQps = model.billingQps;
                this.failedCount = model.failedCount;
                this.ladderTypeCode = model.ladderTypeCode;
                this.subAccountId = model.subAccountId;
                this.successCount = model.successCount;
            } 

            /**
             * billDate.
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
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
             * billingQps.
             */
            public Builder billingQps(Integer billingQps) {
                this.billingQps = billingQps;
                return this;
            }

            /**
             * failedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * ladderTypeCode.
             */
            public Builder ladderTypeCode(Integer ladderTypeCode) {
                this.ladderTypeCode = ladderTypeCode;
                return this;
            }

            /**
             * subAccountId.
             */
            public Builder subAccountId(String subAccountId) {
                this.subAccountId = subAccountId;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public MeteringDailyDetailList build() {
                return new MeteringDailyDetailList(this);
            } 

        } 

    }
}
