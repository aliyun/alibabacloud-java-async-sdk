// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeCreditUsageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreditUsageInfoResponseBody</p>
 */
public class DescribeCreditUsageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageInfoList")
    private java.util.List<UsageInfoList> usageInfoList;

    private DescribeCreditUsageInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageInfoList = builder.usageInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditUsageInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageInfoList
     */
    public java.util.List<UsageInfoList> getUsageInfoList() {
        return this.usageInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UsageInfoList> usageInfoList; 

        private Builder() {
        } 

        private Builder(DescribeCreditUsageInfoResponseBody model) {
            this.requestId = model.requestId;
            this.usageInfoList = model.usageInfoList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageInfoList.
         */
        public Builder usageInfoList(java.util.List<UsageInfoList> usageInfoList) {
            this.usageInfoList = usageInfoList;
            return this;
        }

        public DescribeCreditUsageInfoResponseBody build() {
            return new DescribeCreditUsageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCreditUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditUsageInfoResponseBody</p>
     */
    public static class CreditTrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimePoint")
        private String timePoint;

        @com.aliyun.core.annotation.NameInMap("UsedCredit")
        private Long usedCredit;

        private CreditTrendList(Builder builder) {
            this.timePoint = builder.timePoint;
            this.usedCredit = builder.usedCredit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditTrendList create() {
            return builder().build();
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        /**
         * @return usedCredit
         */
        public Long getUsedCredit() {
            return this.usedCredit;
        }

        public static final class Builder {
            private String timePoint; 
            private Long usedCredit; 

            private Builder() {
            } 

            private Builder(CreditTrendList model) {
                this.timePoint = model.timePoint;
                this.usedCredit = model.usedCredit;
            } 

            /**
             * TimePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            /**
             * UsedCredit.
             */
            public Builder usedCredit(Long usedCredit) {
                this.usedCredit = usedCredit;
                return this;
            }

            public CreditTrendList build() {
                return new CreditTrendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCreditUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditUsageInfoResponseBody</p>
     */
    public static class RemainCreditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeductingAmount")
        private Integer deductingAmount;

        @com.aliyun.core.annotation.NameInMap("PendingAmount")
        private Integer pendingAmount;

        private RemainCreditInfo(Builder builder) {
            this.deductingAmount = builder.deductingAmount;
            this.pendingAmount = builder.pendingAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemainCreditInfo create() {
            return builder().build();
        }

        /**
         * @return deductingAmount
         */
        public Integer getDeductingAmount() {
            return this.deductingAmount;
        }

        /**
         * @return pendingAmount
         */
        public Integer getPendingAmount() {
            return this.pendingAmount;
        }

        public static final class Builder {
            private Integer deductingAmount; 
            private Integer pendingAmount; 

            private Builder() {
            } 

            private Builder(RemainCreditInfo model) {
                this.deductingAmount = model.deductingAmount;
                this.pendingAmount = model.pendingAmount;
            } 

            /**
             * DeductingAmount.
             */
            public Builder deductingAmount(Integer deductingAmount) {
                this.deductingAmount = deductingAmount;
                return this;
            }

            /**
             * PendingAmount.
             */
            public Builder pendingAmount(Integer pendingAmount) {
                this.pendingAmount = pendingAmount;
                return this;
            }

            public RemainCreditInfo build() {
                return new RemainCreditInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCreditUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditUsageInfoResponseBody</p>
     */
    public static class UsageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableAmount")
        private Integer availableAmount;

        @com.aliyun.core.annotation.NameInMap("ContactGroupNames")
        private java.util.List<String> contactGroupNames;

        @com.aliyun.core.annotation.NameInMap("CreditTrendList")
        private java.util.List<CreditTrendList> creditTrendList;

        @com.aliyun.core.annotation.NameInMap("CurrentInstanceExpiredTime")
        private String currentInstanceExpiredTime;

        @com.aliyun.core.annotation.NameInMap("CurrentInstanceId")
        private String currentInstanceId;

        @com.aliyun.core.annotation.NameInMap("CurrentRemainCredit")
        private Long currentRemainCredit;

        @com.aliyun.core.annotation.NameInMap("CurrentTotalCredit")
        private Long currentTotalCredit;

        @com.aliyun.core.annotation.NameInMap("CurrentUsedCredit")
        private Long currentUsedCredit;

        @com.aliyun.core.annotation.NameInMap("DayUsedCredit")
        private Long dayUsedCredit;

        @com.aliyun.core.annotation.NameInMap("LastTriggeredAt")
        private String lastTriggeredAt;

        @com.aliyun.core.annotation.NameInMap("PeriodTotalCredit")
        private Long periodTotalCredit;

        @com.aliyun.core.annotation.NameInMap("PeriodUsedCredit")
        private Long periodUsedCredit;

        @com.aliyun.core.annotation.NameInMap("RemainCredit")
        private Long remainCredit;

        @com.aliyun.core.annotation.NameInMap("RemainCreditInfo")
        private RemainCreditInfo remainCreditInfo;

        @com.aliyun.core.annotation.NameInMap("TodayUsed")
        private String todayUsed;

        @com.aliyun.core.annotation.NameInMap("TotalCredit")
        private Long totalCredit;

        @com.aliyun.core.annotation.NameInMap("TotalUsed")
        private String totalUsed;

        @com.aliyun.core.annotation.NameInMap("TotalUsedCredit")
        private Long totalUsedCredit;

        @com.aliyun.core.annotation.NameInMap("WarnPercent")
        private Integer warnPercent;

        @com.aliyun.core.annotation.NameInMap("WeekUsedCredit")
        private Long weekUsedCredit;

        private UsageInfo(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.contactGroupNames = builder.contactGroupNames;
            this.creditTrendList = builder.creditTrendList;
            this.currentInstanceExpiredTime = builder.currentInstanceExpiredTime;
            this.currentInstanceId = builder.currentInstanceId;
            this.currentRemainCredit = builder.currentRemainCredit;
            this.currentTotalCredit = builder.currentTotalCredit;
            this.currentUsedCredit = builder.currentUsedCredit;
            this.dayUsedCredit = builder.dayUsedCredit;
            this.lastTriggeredAt = builder.lastTriggeredAt;
            this.periodTotalCredit = builder.periodTotalCredit;
            this.periodUsedCredit = builder.periodUsedCredit;
            this.remainCredit = builder.remainCredit;
            this.remainCreditInfo = builder.remainCreditInfo;
            this.todayUsed = builder.todayUsed;
            this.totalCredit = builder.totalCredit;
            this.totalUsed = builder.totalUsed;
            this.totalUsedCredit = builder.totalUsedCredit;
            this.warnPercent = builder.warnPercent;
            this.weekUsedCredit = builder.weekUsedCredit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageInfo create() {
            return builder().build();
        }

        /**
         * @return availableAmount
         */
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        /**
         * @return contactGroupNames
         */
        public java.util.List<String> getContactGroupNames() {
            return this.contactGroupNames;
        }

        /**
         * @return creditTrendList
         */
        public java.util.List<CreditTrendList> getCreditTrendList() {
            return this.creditTrendList;
        }

        /**
         * @return currentInstanceExpiredTime
         */
        public String getCurrentInstanceExpiredTime() {
            return this.currentInstanceExpiredTime;
        }

        /**
         * @return currentInstanceId
         */
        public String getCurrentInstanceId() {
            return this.currentInstanceId;
        }

        /**
         * @return currentRemainCredit
         */
        public Long getCurrentRemainCredit() {
            return this.currentRemainCredit;
        }

        /**
         * @return currentTotalCredit
         */
        public Long getCurrentTotalCredit() {
            return this.currentTotalCredit;
        }

        /**
         * @return currentUsedCredit
         */
        public Long getCurrentUsedCredit() {
            return this.currentUsedCredit;
        }

        /**
         * @return dayUsedCredit
         */
        public Long getDayUsedCredit() {
            return this.dayUsedCredit;
        }

        /**
         * @return lastTriggeredAt
         */
        public String getLastTriggeredAt() {
            return this.lastTriggeredAt;
        }

        /**
         * @return periodTotalCredit
         */
        public Long getPeriodTotalCredit() {
            return this.periodTotalCredit;
        }

        /**
         * @return periodUsedCredit
         */
        public Long getPeriodUsedCredit() {
            return this.periodUsedCredit;
        }

        /**
         * @return remainCredit
         */
        public Long getRemainCredit() {
            return this.remainCredit;
        }

        /**
         * @return remainCreditInfo
         */
        public RemainCreditInfo getRemainCreditInfo() {
            return this.remainCreditInfo;
        }

        /**
         * @return todayUsed
         */
        public String getTodayUsed() {
            return this.todayUsed;
        }

        /**
         * @return totalCredit
         */
        public Long getTotalCredit() {
            return this.totalCredit;
        }

        /**
         * @return totalUsed
         */
        public String getTotalUsed() {
            return this.totalUsed;
        }

        /**
         * @return totalUsedCredit
         */
        public Long getTotalUsedCredit() {
            return this.totalUsedCredit;
        }

        /**
         * @return warnPercent
         */
        public Integer getWarnPercent() {
            return this.warnPercent;
        }

        /**
         * @return weekUsedCredit
         */
        public Long getWeekUsedCredit() {
            return this.weekUsedCredit;
        }

        public static final class Builder {
            private Integer availableAmount; 
            private java.util.List<String> contactGroupNames; 
            private java.util.List<CreditTrendList> creditTrendList; 
            private String currentInstanceExpiredTime; 
            private String currentInstanceId; 
            private Long currentRemainCredit; 
            private Long currentTotalCredit; 
            private Long currentUsedCredit; 
            private Long dayUsedCredit; 
            private String lastTriggeredAt; 
            private Long periodTotalCredit; 
            private Long periodUsedCredit; 
            private Long remainCredit; 
            private RemainCreditInfo remainCreditInfo; 
            private String todayUsed; 
            private Long totalCredit; 
            private String totalUsed; 
            private Long totalUsedCredit; 
            private Integer warnPercent; 
            private Long weekUsedCredit; 

            private Builder() {
            } 

            private Builder(UsageInfo model) {
                this.availableAmount = model.availableAmount;
                this.contactGroupNames = model.contactGroupNames;
                this.creditTrendList = model.creditTrendList;
                this.currentInstanceExpiredTime = model.currentInstanceExpiredTime;
                this.currentInstanceId = model.currentInstanceId;
                this.currentRemainCredit = model.currentRemainCredit;
                this.currentTotalCredit = model.currentTotalCredit;
                this.currentUsedCredit = model.currentUsedCredit;
                this.dayUsedCredit = model.dayUsedCredit;
                this.lastTriggeredAt = model.lastTriggeredAt;
                this.periodTotalCredit = model.periodTotalCredit;
                this.periodUsedCredit = model.periodUsedCredit;
                this.remainCredit = model.remainCredit;
                this.remainCreditInfo = model.remainCreditInfo;
                this.todayUsed = model.todayUsed;
                this.totalCredit = model.totalCredit;
                this.totalUsed = model.totalUsed;
                this.totalUsedCredit = model.totalUsedCredit;
                this.warnPercent = model.warnPercent;
                this.weekUsedCredit = model.weekUsedCredit;
            } 

            /**
             * AvailableAmount.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * ContactGroupNames.
             */
            public Builder contactGroupNames(java.util.List<String> contactGroupNames) {
                this.contactGroupNames = contactGroupNames;
                return this;
            }

            /**
             * CreditTrendList.
             */
            public Builder creditTrendList(java.util.List<CreditTrendList> creditTrendList) {
                this.creditTrendList = creditTrendList;
                return this;
            }

            /**
             * CurrentInstanceExpiredTime.
             */
            public Builder currentInstanceExpiredTime(String currentInstanceExpiredTime) {
                this.currentInstanceExpiredTime = currentInstanceExpiredTime;
                return this;
            }

            /**
             * CurrentInstanceId.
             */
            public Builder currentInstanceId(String currentInstanceId) {
                this.currentInstanceId = currentInstanceId;
                return this;
            }

            /**
             * CurrentRemainCredit.
             */
            public Builder currentRemainCredit(Long currentRemainCredit) {
                this.currentRemainCredit = currentRemainCredit;
                return this;
            }

            /**
             * CurrentTotalCredit.
             */
            public Builder currentTotalCredit(Long currentTotalCredit) {
                this.currentTotalCredit = currentTotalCredit;
                return this;
            }

            /**
             * CurrentUsedCredit.
             */
            public Builder currentUsedCredit(Long currentUsedCredit) {
                this.currentUsedCredit = currentUsedCredit;
                return this;
            }

            /**
             * DayUsedCredit.
             */
            public Builder dayUsedCredit(Long dayUsedCredit) {
                this.dayUsedCredit = dayUsedCredit;
                return this;
            }

            /**
             * LastTriggeredAt.
             */
            public Builder lastTriggeredAt(String lastTriggeredAt) {
                this.lastTriggeredAt = lastTriggeredAt;
                return this;
            }

            /**
             * PeriodTotalCredit.
             */
            public Builder periodTotalCredit(Long periodTotalCredit) {
                this.periodTotalCredit = periodTotalCredit;
                return this;
            }

            /**
             * PeriodUsedCredit.
             */
            public Builder periodUsedCredit(Long periodUsedCredit) {
                this.periodUsedCredit = periodUsedCredit;
                return this;
            }

            /**
             * RemainCredit.
             */
            public Builder remainCredit(Long remainCredit) {
                this.remainCredit = remainCredit;
                return this;
            }

            /**
             * RemainCreditInfo.
             */
            public Builder remainCreditInfo(RemainCreditInfo remainCreditInfo) {
                this.remainCreditInfo = remainCreditInfo;
                return this;
            }

            /**
             * TodayUsed.
             */
            public Builder todayUsed(String todayUsed) {
                this.todayUsed = todayUsed;
                return this;
            }

            /**
             * TotalCredit.
             */
            public Builder totalCredit(Long totalCredit) {
                this.totalCredit = totalCredit;
                return this;
            }

            /**
             * TotalUsed.
             */
            public Builder totalUsed(String totalUsed) {
                this.totalUsed = totalUsed;
                return this;
            }

            /**
             * TotalUsedCredit.
             */
            public Builder totalUsedCredit(Long totalUsedCredit) {
                this.totalUsedCredit = totalUsedCredit;
                return this;
            }

            /**
             * WarnPercent.
             */
            public Builder warnPercent(Integer warnPercent) {
                this.warnPercent = warnPercent;
                return this;
            }

            /**
             * WeekUsedCredit.
             */
            public Builder weekUsedCredit(Long weekUsedCredit) {
                this.weekUsedCredit = weekUsedCredit;
                return this;
            }

            public UsageInfo build() {
                return new UsageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCreditUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditUsageInfoResponseBody</p>
     */
    public static class UsageInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageInfo")
        private UsageInfo usageInfo;

        @com.aliyun.core.annotation.NameInMap("UsageInfoKey")
        private String usageInfoKey;

        private UsageInfoList(Builder builder) {
            this.usageInfo = builder.usageInfo;
            this.usageInfoKey = builder.usageInfoKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageInfoList create() {
            return builder().build();
        }

        /**
         * @return usageInfo
         */
        public UsageInfo getUsageInfo() {
            return this.usageInfo;
        }

        /**
         * @return usageInfoKey
         */
        public String getUsageInfoKey() {
            return this.usageInfoKey;
        }

        public static final class Builder {
            private UsageInfo usageInfo; 
            private String usageInfoKey; 

            private Builder() {
            } 

            private Builder(UsageInfoList model) {
                this.usageInfo = model.usageInfo;
                this.usageInfoKey = model.usageInfoKey;
            } 

            /**
             * UsageInfo.
             */
            public Builder usageInfo(UsageInfo usageInfo) {
                this.usageInfo = usageInfo;
                return this;
            }

            /**
             * UsageInfoKey.
             */
            public Builder usageInfoKey(String usageInfoKey) {
                this.usageInfoKey = usageInfoKey;
                return this;
            }

            public UsageInfoList build() {
                return new UsageInfoList(this);
            } 

        } 

    }
}
