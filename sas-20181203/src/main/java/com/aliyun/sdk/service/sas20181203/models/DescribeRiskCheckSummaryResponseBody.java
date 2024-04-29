// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckSummaryResponseBody</p>
 */
public class DescribeRiskCheckSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskCheckSummary")
    private RiskCheckSummary riskCheckSummary;

    private DescribeRiskCheckSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskCheckSummary = builder.riskCheckSummary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskCheckSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskCheckSummary
     */
    public RiskCheckSummary getRiskCheckSummary() {
        return this.riskCheckSummary;
    }

    public static final class Builder {
        private String requestId; 
        private RiskCheckSummary riskCheckSummary; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The summary information about the check results of cloud service configurations.
         */
        public Builder riskCheckSummary(RiskCheckSummary riskCheckSummary) {
            this.riskCheckSummary = riskCheckSummary;
            return this;
        }

        public DescribeRiskCheckSummaryResponseBody build() {
            return new DescribeRiskCheckSummaryResponseBody(this);
        } 

    } 

    public static class CountByStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CountByStatus(Builder builder) {
            this.count = builder.count;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CountByStatus create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer count; 
            private String status; 

            /**
             * The number of detected risk items.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The status of the check item after the check is finished. Valid values:
             * <p>
             * 
             * *   **pass**: The check item passed the check, which indicates that the check item is normal.
             * *   **failed**: The check item failed the check, which indicates that risks are detected based on the check item.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CountByStatus build() {
                return new CountByStatus(this);
            } 

        } 

    }
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountByStatus")
        private java.util.List < CountByStatus> countByStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private Integer remainingTime;

        @com.aliyun.core.annotation.NameInMap("Sort")
        private Integer sort;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Groups(Builder builder) {
            this.countByStatus = builder.countByStatus;
            this.id = builder.id;
            this.remainingTime = builder.remainingTime;
            this.sort = builder.sort;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return countByStatus
         */
        public java.util.List < CountByStatus> getCountByStatus() {
            return this.countByStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remainingTime
         */
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return sort
         */
        public Integer getSort() {
            return this.sort;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < CountByStatus> countByStatus; 
            private Long id; 
            private Integer remainingTime; 
            private Integer sort; 
            private String status; 
            private String title; 

            /**
             * An array that consists of the statistics about check results.
             */
            public Builder countByStatus(java.util.List < CountByStatus> countByStatus) {
                this.countByStatus = countByStatus;
                return this;
            }

            /**
             * The ID of the check item type.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The remaining time before the check is complete.
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * The sequence number of the check item type in the **All Types** drop-down list in the Security Center console.
             */
            public Builder sort(Integer sort) {
                this.sort = sort;
                return this;
            }

            /**
             * The status of the check. Valid values:
             * <p>
             * 
             * *   **finish**: The check is finished.
             * *   **running**: The check is in progress.
             * *   **waiting**: The check is pending.
             * *   **notStart**: The check is not started.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the check item type.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class RiskLevelCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private RiskLevelCount(Builder builder) {
            this.count = builder.count;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskLevelCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private Integer count; 
            private String key; 

            /**
             * The number of check items at the specified risk level.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The risk level of the check items. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public RiskLevelCount build() {
                return new RiskLevelCount(this);
            } 

        } 

    }
    public static class RiskCheckSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedAssetCount")
        private Integer affectedAssetCount;

        @com.aliyun.core.annotation.NameInMap("DisabledRiskCount")
        private Integer disabledRiskCount;

        @com.aliyun.core.annotation.NameInMap("EnabledRiskCount")
        private Integer enabledRiskCount;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List < Groups> groups;

        @com.aliyun.core.annotation.NameInMap("ItemCount")
        private Integer itemCount;

        @com.aliyun.core.annotation.NameInMap("PreviousCount")
        private Integer previousCount;

        @com.aliyun.core.annotation.NameInMap("PreviousTime")
        private Long previousTime;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevelCount")
        private java.util.List < RiskLevelCount> riskLevelCount;

        @com.aliyun.core.annotation.NameInMap("RiskRate")
        private Float riskRate;

        private RiskCheckSummary(Builder builder) {
            this.affectedAssetCount = builder.affectedAssetCount;
            this.disabledRiskCount = builder.disabledRiskCount;
            this.enabledRiskCount = builder.enabledRiskCount;
            this.groups = builder.groups;
            this.itemCount = builder.itemCount;
            this.previousCount = builder.previousCount;
            this.previousTime = builder.previousTime;
            this.riskCount = builder.riskCount;
            this.riskLevelCount = builder.riskLevelCount;
            this.riskRate = builder.riskRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskCheckSummary create() {
            return builder().build();
        }

        /**
         * @return affectedAssetCount
         */
        public Integer getAffectedAssetCount() {
            return this.affectedAssetCount;
        }

        /**
         * @return disabledRiskCount
         */
        public Integer getDisabledRiskCount() {
            return this.disabledRiskCount;
        }

        /**
         * @return enabledRiskCount
         */
        public Integer getEnabledRiskCount() {
            return this.enabledRiskCount;
        }

        /**
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return itemCount
         */
        public Integer getItemCount() {
            return this.itemCount;
        }

        /**
         * @return previousCount
         */
        public Integer getPreviousCount() {
            return this.previousCount;
        }

        /**
         * @return previousTime
         */
        public Long getPreviousTime() {
            return this.previousTime;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskLevelCount
         */
        public java.util.List < RiskLevelCount> getRiskLevelCount() {
            return this.riskLevelCount;
        }

        /**
         * @return riskRate
         */
        public Float getRiskRate() {
            return this.riskRate;
        }

        public static final class Builder {
            private Integer affectedAssetCount; 
            private Integer disabledRiskCount; 
            private Integer enabledRiskCount; 
            private java.util.List < Groups> groups; 
            private Integer itemCount; 
            private Integer previousCount; 
            private Long previousTime; 
            private Integer riskCount; 
            private java.util.List < RiskLevelCount> riskLevelCount; 
            private Float riskRate; 

            /**
             * The number of affected assets.
             */
            public Builder affectedAssetCount(Integer affectedAssetCount) {
                this.affectedAssetCount = affectedAssetCount;
                return this;
            }

            /**
             * The number of the check items that failed the check.
             */
            public Builder disabledRiskCount(Integer disabledRiskCount) {
                this.disabledRiskCount = disabledRiskCount;
                return this;
            }

            /**
             * The number of the check items that passed the check.
             */
            public Builder enabledRiskCount(Integer enabledRiskCount) {
                this.enabledRiskCount = enabledRiskCount;
                return this;
            }

            /**
             * An array that consists of the statistics for each type of check item.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The number of check items.
             */
            public Builder itemCount(Integer itemCount) {
                this.itemCount = itemCount;
                return this;
            }

            /**
             * The number of risk items detected in the last check.
             */
            public Builder previousCount(Integer previousCount) {
                this.previousCount = previousCount;
                return this;
            }

            /**
             * The timestamp of the last check. Unit: milliseconds.
             */
            public Builder previousTime(Long previousTime) {
                this.previousTime = previousTime;
                return this;
            }

            /**
             * The number of detected risk items.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * An array that consists of the number of check items at each risk level.
             */
            public Builder riskLevelCount(java.util.List < RiskLevelCount> riskLevelCount) {
                this.riskLevelCount = riskLevelCount;
                return this;
            }

            /**
             * The proportion of risk items to all check items.
             */
            public Builder riskRate(Float riskRate) {
                this.riskRate = riskRate;
                return this;
            }

            public RiskCheckSummary build() {
                return new RiskCheckSummary(this);
            } 

        } 

    }
}
