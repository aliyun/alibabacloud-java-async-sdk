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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The business data array.</p>
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
             * <p>The time point in the <code>yyyy-MM-dd HH</code> format, accurate to the hour.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-02 10</p>
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            /**
             * <p>The number of credits consumed in the hour.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
             * <p>The number of instances being deducted.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder deductingAmount(Integer deductingAmount) {
                this.deductingAmount = deductingAmount;
                return this;
            }

            /**
             * <p>The number of instances pending to take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
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

        @com.aliyun.core.annotation.NameInMap("PeriodCreditQuota")
        private Long periodCreditQuota;

        @com.aliyun.core.annotation.NameInMap("PeriodPayGoUsedCredit")
        private Long periodPayGoUsedCredit;

        @com.aliyun.core.annotation.NameInMap("PeriodSharedUsedCredit")
        private Long periodSharedUsedCredit;

        @com.aliyun.core.annotation.NameInMap("PeriodTotalCredit")
        private Long periodTotalCredit;

        @com.aliyun.core.annotation.NameInMap("PeriodTotalUsedCredit")
        private Long periodTotalUsedCredit;

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
            this.periodCreditQuota = builder.periodCreditQuota;
            this.periodPayGoUsedCredit = builder.periodPayGoUsedCredit;
            this.periodSharedUsedCredit = builder.periodSharedUsedCredit;
            this.periodTotalCredit = builder.periodTotalCredit;
            this.periodTotalUsedCredit = builder.periodTotalUsedCredit;
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
         * @return periodCreditQuota
         */
        public Long getPeriodCreditQuota() {
            return this.periodCreditQuota;
        }

        /**
         * @return periodPayGoUsedCredit
         */
        public Long getPeriodPayGoUsedCredit() {
            return this.periodPayGoUsedCredit;
        }

        /**
         * @return periodSharedUsedCredit
         */
        public Long getPeriodSharedUsedCredit() {
            return this.periodSharedUsedCredit;
        }

        /**
         * @return periodTotalCredit
         */
        public Long getPeriodTotalCredit() {
            return this.periodTotalCredit;
        }

        /**
         * @return periodTotalUsedCredit
         */
        public Long getPeriodTotalUsedCredit() {
            return this.periodTotalUsedCredit;
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
            private Long periodCreditQuota; 
            private Long periodPayGoUsedCredit; 
            private Long periodSharedUsedCredit; 
            private Long periodTotalCredit; 
            private Long periodTotalUsedCredit; 
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
                this.periodCreditQuota = model.periodCreditQuota;
                this.periodPayGoUsedCredit = model.periodPayGoUsedCredit;
                this.periodSharedUsedCredit = model.periodSharedUsedCredit;
                this.periodTotalCredit = model.periodTotalCredit;
                this.periodTotalUsedCredit = model.periodTotalUsedCredit;
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
             * <p>The number of currently available instances for the reported resources.</p>
             * 
             * <strong>example:</strong>
             * <p>9976.00</p>
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * <p>The list of contact group names.</p>
             */
            public Builder contactGroupNames(java.util.List<String> contactGroupNames) {
                this.contactGroupNames = contactGroupNames;
                return this;
            }

            /**
             * <p>The hourly consumption samples of the current credit package.</p>
             */
            public Builder creditTrendList(java.util.List<CreditTrendList> creditTrendList) {
                this.creditTrendList = creditTrendList;
                return this;
            }

            /**
             * <p>The time when the current instance expires, in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-02 00:00:00</p>
             */
            public Builder currentInstanceExpiredTime(String currentInstanceExpiredTime) {
                this.currentInstanceExpiredTime = currentInstanceExpiredTime;
                return this;
            }

            /**
             * <p>The instance ID of the currently active credit package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-inst-001</p>
             */
            public Builder currentInstanceId(String currentInstanceId) {
                this.currentInstanceId = currentInstanceId;
                return this;
            }

            /**
             * <p>The remaining amount of the currently active credit package.</p>
             * 
             * <strong>example:</strong>
             * <p>Remaining credits for the current period</p>
             */
            public Builder currentRemainCredit(Long currentRemainCredit) {
                this.currentRemainCredit = currentRemainCredit;
                return this;
            }

            /**
             * <p>The total amount of the currently active credit package.</p>
             * 
             * <strong>example:</strong>
             * <p>Credit quota for the current period</p>
             */
            public Builder currentTotalCredit(Long currentTotalCredit) {
                this.currentTotalCredit = currentTotalCredit;
                return this;
            }

            /**
             * <p>The used amount of the currently active credit package.</p>
             * 
             * <strong>example:</strong>
             * <p>Credits consumed in the current period</p>
             */
            public Builder currentUsedCredit(Long currentUsedCredit) {
                this.currentUsedCredit = currentUsedCredit;
                return this;
            }

            /**
             * <p>The credit usage in the last day.</p>
             * 
             * <strong>example:</strong>
             * <p>Credits consumed in the last day</p>
             */
            public Builder dayUsedCredit(Long dayUsedCredit) {
                this.dayUsedCredit = dayUsedCredit;
                return this;
            }

            /**
             * <p>The last trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-02 10:10:10</p>
             */
            public Builder lastTriggeredAt(String lastTriggeredAt) {
                this.lastTriggeredAt = lastTriggeredAt;
                return this;
            }

            /**
             * <p>The credit quota for the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder periodCreditQuota(Long periodCreditQuota) {
                this.periodCreditQuota = periodCreditQuota;
                return this;
            }

            /**
             * <p>The pay-as-you-go credits consumed in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
             */
            public Builder periodPayGoUsedCredit(Long periodPayGoUsedCredit) {
                this.periodPayGoUsedCredit = periodPayGoUsedCredit;
                return this;
            }

            /**
             * <p>The shared credits consumed in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder periodSharedUsedCredit(Long periodSharedUsedCredit) {
                this.periodSharedUsedCredit = periodSharedUsedCredit;
                return this;
            }

            /**
             * <p>The shared credit quota in the current active period.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder periodTotalCredit(Long periodTotalCredit) {
                this.periodTotalCredit = periodTotalCredit;
                return this;
            }

            /**
             * <p>The total credits consumed in the current period.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder periodTotalUsedCredit(Long periodTotalUsedCredit) {
                this.periodTotalUsedCredit = periodTotalUsedCredit;
                return this;
            }

            /**
             * <p>The shared credit usage in the current active period.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder periodUsedCredit(Long periodUsedCredit) {
                this.periodUsedCredit = periodUsedCredit;
                return this;
            }

            /**
             * <p>The cumulative remaining billable credits.</p>
             * 
             * <strong>example:</strong>
             * <p>Remaining credits</p>
             */
            public Builder remainCredit(Long remainCredit) {
                this.remainCredit = remainCredit;
                return this;
            }

            /**
             * <p>The remaining credit information.</p>
             */
            public Builder remainCreditInfo(RemainCreditInfo remainCreditInfo) {
                this.remainCreditInfo = remainCreditInfo;
                return this;
            }

            /**
             * <p>The used quota for today.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder todayUsed(String todayUsed) {
                this.todayUsed = todayUsed;
                return this;
            }

            /**
             * <p>The cumulative total credits.</p>
             * 
             * <strong>example:</strong>
             * <p>Credit quota</p>
             */
            public Builder totalCredit(Long totalCredit) {
                this.totalCredit = totalCredit;
                return this;
            }

            /**
             * <p>The cumulative used quota.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalUsed(String totalUsed) {
                this.totalUsed = totalUsed;
                return this;
            }

            /**
             * <p>The cumulative credit usage.</p>
             * 
             * <strong>example:</strong>
             * <p>Total credits consumed</p>
             */
            public Builder totalUsedCredit(Long totalUsedCredit) {
                this.totalUsedCredit = totalUsedCredit;
                return this;
            }

            /**
             * <p>The alert threshold percentage, ranging from 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder warnPercent(Integer warnPercent) {
                this.warnPercent = warnPercent;
                return this;
            }

            /**
             * <p>The credit usage in the last week.</p>
             * 
             * <strong>example:</strong>
             * <p>Credits consumed in the last week</p>
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
             * <p>The usage data details.</p>
             */
            public Builder usageInfo(UsageInfo usageInfo) {
                this.usageInfo = usageInfo;
                return this;
            }

            /**
             * <p>The primary key for usage. The value is <code>aliUid</code> when <code>UsageType</code> is <code>User</code>, the credit package instance ID when <code>UsageType</code> is <code>CreditPackage</code>, and the agent ID when <code>UsageType</code> is <code>Agent</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-abc</p>
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
