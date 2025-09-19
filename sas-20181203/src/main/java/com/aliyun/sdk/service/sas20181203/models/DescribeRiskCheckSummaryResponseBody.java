// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
     * @return riskCheckSummary
     */
    public RiskCheckSummary getRiskCheckSummary() {
        return this.riskCheckSummary;
    }

    public static final class Builder {
        private String requestId; 
        private RiskCheckSummary riskCheckSummary; 

        private Builder() {
        } 

        private Builder(DescribeRiskCheckSummaryResponseBody model) {
            this.requestId = model.requestId;
            this.riskCheckSummary = model.riskCheckSummary;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>291B49F9-1685-4005-9D34-606B6F78740F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The summary information about the check results of cloud service configurations.</p>
         */
        public Builder riskCheckSummary(RiskCheckSummary riskCheckSummary) {
            this.riskCheckSummary = riskCheckSummary;
            return this;
        }

        public DescribeRiskCheckSummaryResponseBody build() {
            return new DescribeRiskCheckSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckSummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CountByStatus model) {
                this.count = model.count;
                this.status = model.status;
            } 

            /**
             * <p>The number of detected risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The status of the check item after the check is finished. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The check item passed the check, which indicates that the check item is normal.</li>
             * <li><strong>failed</strong>: The check item failed the check, which indicates that risks are detected based on the check item.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
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
    /**
     * 
     * {@link DescribeRiskCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckSummaryResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountByStatus")
        private java.util.List<CountByStatus> countByStatus;

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
        public java.util.List<CountByStatus> getCountByStatus() {
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
            private java.util.List<CountByStatus> countByStatus; 
            private Long id; 
            private Integer remainingTime; 
            private Integer sort; 
            private String status; 
            private String title; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.countByStatus = model.countByStatus;
                this.id = model.id;
                this.remainingTime = model.remainingTime;
                this.sort = model.sort;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>An array that consists of the statistics about check results.</p>
             */
            public Builder countByStatus(java.util.List<CountByStatus> countByStatus) {
                this.countByStatus = countByStatus;
                return this;
            }

            /**
             * <p>The ID of the check item type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The remaining time before the check is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * <p>The sequence number of the check item type in the <strong>All Types</strong> drop-down list in the Security Center console.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sort(Integer sort) {
                this.sort = sort;
                return this;
            }

            /**
             * <p>The status of the check. Valid values:</p>
             * <ul>
             * <li><strong>finish</strong>: The check is finished.</li>
             * <li><strong>running</strong>: The check is in progress.</li>
             * <li><strong>waiting</strong>: The check is pending.</li>
             * <li><strong>notStart</strong>: The check is not started.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the check item type.</p>
             * 
             * <strong>example:</strong>
             * <p>Identity authentication and permissions</p>
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
    /**
     * 
     * {@link DescribeRiskCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckSummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RiskLevelCount model) {
                this.count = model.count;
                this.key = model.key;
            } 

            /**
             * <p>The number of check items at the specified risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The risk level of the check items. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
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
    /**
     * 
     * {@link DescribeRiskCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckSummaryResponseBody</p>
     */
    public static class RiskCheckSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedAssetCount")
        private Integer affectedAssetCount;

        @com.aliyun.core.annotation.NameInMap("DisabledRiskCount")
        private Integer disabledRiskCount;

        @com.aliyun.core.annotation.NameInMap("EnabledRiskCount")
        private Integer enabledRiskCount;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

        @com.aliyun.core.annotation.NameInMap("ItemCount")
        private Integer itemCount;

        @com.aliyun.core.annotation.NameInMap("PreviousCount")
        private Integer previousCount;

        @com.aliyun.core.annotation.NameInMap("PreviousTime")
        private Long previousTime;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevelCount")
        private java.util.List<RiskLevelCount> riskLevelCount;

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
        public java.util.List<Groups> getGroups() {
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
        public java.util.List<RiskLevelCount> getRiskLevelCount() {
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
            private java.util.List<Groups> groups; 
            private Integer itemCount; 
            private Integer previousCount; 
            private Long previousTime; 
            private Integer riskCount; 
            private java.util.List<RiskLevelCount> riskLevelCount; 
            private Float riskRate; 

            private Builder() {
            } 

            private Builder(RiskCheckSummary model) {
                this.affectedAssetCount = model.affectedAssetCount;
                this.disabledRiskCount = model.disabledRiskCount;
                this.enabledRiskCount = model.enabledRiskCount;
                this.groups = model.groups;
                this.itemCount = model.itemCount;
                this.previousCount = model.previousCount;
                this.previousTime = model.previousTime;
                this.riskCount = model.riskCount;
                this.riskLevelCount = model.riskLevelCount;
                this.riskRate = model.riskRate;
            } 

            /**
             * <p>The number of affected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder affectedAssetCount(Integer affectedAssetCount) {
                this.affectedAssetCount = affectedAssetCount;
                return this;
            }

            /**
             * <p>The number of the check items that failed the check.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder disabledRiskCount(Integer disabledRiskCount) {
                this.disabledRiskCount = disabledRiskCount;
                return this;
            }

            /**
             * <p>The number of the check items that passed the check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder enabledRiskCount(Integer enabledRiskCount) {
                this.enabledRiskCount = enabledRiskCount;
                return this;
            }

            /**
             * <p>An array that consists of the statistics for each type of check item.</p>
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The number of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder itemCount(Integer itemCount) {
                this.itemCount = itemCount;
                return this;
            }

            /**
             * <p>The number of risk items detected in the last check.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previousCount(Integer previousCount) {
                this.previousCount = previousCount;
                return this;
            }

            /**
             * <p>The timestamp of the last check. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1545012926000</p>
             */
            public Builder previousTime(Long previousTime) {
                this.previousTime = previousTime;
                return this;
            }

            /**
             * <p>The number of detected risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>An array that consists of the number of check items at each risk level.</p>
             */
            public Builder riskLevelCount(java.util.List<RiskLevelCount> riskLevelCount) {
                this.riskLevelCount = riskLevelCount;
                return this;
            }

            /**
             * <p>The proportion of risk items to all check items.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
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
