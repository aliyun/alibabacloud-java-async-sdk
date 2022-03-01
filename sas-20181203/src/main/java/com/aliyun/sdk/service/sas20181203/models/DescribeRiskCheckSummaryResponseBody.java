// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckSummaryResponseBody</p>
 */
public class DescribeRiskCheckSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskCheckSummary")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskCheckSummary.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Status")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("CountByStatus")
        private java.util.List < CountByStatus> countByStatus;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RemainingTime")
        private Integer remainingTime;

        @NameInMap("Sort")
        private Integer sort;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
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
             * CountByStatus.
             */
            public Builder countByStatus(java.util.List < CountByStatus> countByStatus) {
                this.countByStatus = countByStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RemainingTime.
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * Sort.
             */
            public Builder sort(Integer sort) {
                this.sort = sort;
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
             * Title.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Key")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Key.
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
        @NameInMap("AffectedAssetCount")
        private Integer affectedAssetCount;

        @NameInMap("DisabledRiskCount")
        private Integer disabledRiskCount;

        @NameInMap("EnabledRiskCount")
        private Integer enabledRiskCount;

        @NameInMap("Groups")
        private java.util.List < Groups> groups;

        @NameInMap("ItemCount")
        private Integer itemCount;

        @NameInMap("PreviousCount")
        private Integer previousCount;

        @NameInMap("PreviousTime")
        private Long previousTime;

        @NameInMap("RiskCount")
        private Integer riskCount;

        @NameInMap("RiskLevelCount")
        private java.util.List < RiskLevelCount> riskLevelCount;

        @NameInMap("RiskRate")
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
             * AffectedAssetCount.
             */
            public Builder affectedAssetCount(Integer affectedAssetCount) {
                this.affectedAssetCount = affectedAssetCount;
                return this;
            }

            /**
             * DisabledRiskCount.
             */
            public Builder disabledRiskCount(Integer disabledRiskCount) {
                this.disabledRiskCount = disabledRiskCount;
                return this;
            }

            /**
             * EnabledRiskCount.
             */
            public Builder enabledRiskCount(Integer enabledRiskCount) {
                this.enabledRiskCount = enabledRiskCount;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * ItemCount.
             */
            public Builder itemCount(Integer itemCount) {
                this.itemCount = itemCount;
                return this;
            }

            /**
             * PreviousCount.
             */
            public Builder previousCount(Integer previousCount) {
                this.previousCount = previousCount;
                return this;
            }

            /**
             * PreviousTime.
             */
            public Builder previousTime(Long previousTime) {
                this.previousTime = previousTime;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * RiskLevelCount.
             */
            public Builder riskLevelCount(java.util.List < RiskLevelCount> riskLevelCount) {
                this.riskLevelCount = riskLevelCount;
                return this;
            }

            /**
             * RiskRate.
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
