// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataDiagnosisReportsResponseBody</p>
 */
public class ListDataDiagnosisReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExceptionRate")
    private java.util.List<ExceptionRate> exceptionRate;

    @com.aliyun.core.annotation.NameInMap("ReportsOfAbnormalBehavior")
    private java.util.List<java.util.List<ReportsOfAbnormalBehavior>> reportsOfAbnormalBehavior;

    @com.aliyun.core.annotation.NameInMap("ReportsOfBaseStatistics")
    private java.util.List<java.util.List<ReportsOfBaseStatistics>> reportsOfBaseStatistics;

    @com.aliyun.core.annotation.NameInMap("ReportsOfChangeRateData")
    private java.util.List<java.util.List<ReportsOfChangeRateData>> reportsOfChangeRateData;

    @com.aliyun.core.annotation.NameInMap("ReportsOfJoinTables")
    private java.util.List<java.util.List<ReportsOfJoinTables>> reportsOfJoinTables;

    @com.aliyun.core.annotation.NameInMap("ReportsOfPreferenceStatisticsCycle")
    private java.util.List<java.util.List<ReportsOfPreferenceStatisticsCycle>> reportsOfPreferenceStatisticsCycle;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListDataDiagnosisReportsResponseBody(Builder builder) {
        this.exceptionRate = builder.exceptionRate;
        this.reportsOfAbnormalBehavior = builder.reportsOfAbnormalBehavior;
        this.reportsOfBaseStatistics = builder.reportsOfBaseStatistics;
        this.reportsOfChangeRateData = builder.reportsOfChangeRateData;
        this.reportsOfJoinTables = builder.reportsOfJoinTables;
        this.reportsOfPreferenceStatisticsCycle = builder.reportsOfPreferenceStatisticsCycle;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataDiagnosisReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exceptionRate
     */
    public java.util.List<ExceptionRate> getExceptionRate() {
        return this.exceptionRate;
    }

    /**
     * @return reportsOfAbnormalBehavior
     */
    public java.util.List<java.util.List<ReportsOfAbnormalBehavior>> getReportsOfAbnormalBehavior() {
        return this.reportsOfAbnormalBehavior;
    }

    /**
     * @return reportsOfBaseStatistics
     */
    public java.util.List<java.util.List<ReportsOfBaseStatistics>> getReportsOfBaseStatistics() {
        return this.reportsOfBaseStatistics;
    }

    /**
     * @return reportsOfChangeRateData
     */
    public java.util.List<java.util.List<ReportsOfChangeRateData>> getReportsOfChangeRateData() {
        return this.reportsOfChangeRateData;
    }

    /**
     * @return reportsOfJoinTables
     */
    public java.util.List<java.util.List<ReportsOfJoinTables>> getReportsOfJoinTables() {
        return this.reportsOfJoinTables;
    }

    /**
     * @return reportsOfPreferenceStatisticsCycle
     */
    public java.util.List<java.util.List<ReportsOfPreferenceStatisticsCycle>> getReportsOfPreferenceStatisticsCycle() {
        return this.reportsOfPreferenceStatisticsCycle;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<ExceptionRate> exceptionRate; 
        private java.util.List<java.util.List<ReportsOfAbnormalBehavior>> reportsOfAbnormalBehavior; 
        private java.util.List<java.util.List<ReportsOfBaseStatistics>> reportsOfBaseStatistics; 
        private java.util.List<java.util.List<ReportsOfChangeRateData>> reportsOfChangeRateData; 
        private java.util.List<java.util.List<ReportsOfJoinTables>> reportsOfJoinTables; 
        private java.util.List<java.util.List<ReportsOfPreferenceStatisticsCycle>> reportsOfPreferenceStatisticsCycle; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(ListDataDiagnosisReportsResponseBody model) {
            this.exceptionRate = model.exceptionRate;
            this.reportsOfAbnormalBehavior = model.reportsOfAbnormalBehavior;
            this.reportsOfBaseStatistics = model.reportsOfBaseStatistics;
            this.reportsOfChangeRateData = model.reportsOfChangeRateData;
            this.reportsOfJoinTables = model.reportsOfJoinTables;
            this.reportsOfPreferenceStatisticsCycle = model.reportsOfPreferenceStatisticsCycle;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * ExceptionRate.
         */
        public Builder exceptionRate(java.util.List<ExceptionRate> exceptionRate) {
            this.exceptionRate = exceptionRate;
            return this;
        }

        /**
         * ReportsOfAbnormalBehavior.
         */
        public Builder reportsOfAbnormalBehavior(java.util.List<java.util.List<ReportsOfAbnormalBehavior>> reportsOfAbnormalBehavior) {
            this.reportsOfAbnormalBehavior = reportsOfAbnormalBehavior;
            return this;
        }

        /**
         * ReportsOfBaseStatistics.
         */
        public Builder reportsOfBaseStatistics(java.util.List<java.util.List<ReportsOfBaseStatistics>> reportsOfBaseStatistics) {
            this.reportsOfBaseStatistics = reportsOfBaseStatistics;
            return this;
        }

        /**
         * ReportsOfChangeRateData.
         */
        public Builder reportsOfChangeRateData(java.util.List<java.util.List<ReportsOfChangeRateData>> reportsOfChangeRateData) {
            this.reportsOfChangeRateData = reportsOfChangeRateData;
            return this;
        }

        /**
         * ReportsOfJoinTables.
         */
        public Builder reportsOfJoinTables(java.util.List<java.util.List<ReportsOfJoinTables>> reportsOfJoinTables) {
            this.reportsOfJoinTables = reportsOfJoinTables;
            return this;
        }

        /**
         * ReportsOfPreferenceStatisticsCycle.
         */
        public Builder reportsOfPreferenceStatisticsCycle(java.util.List<java.util.List<ReportsOfPreferenceStatisticsCycle>> reportsOfPreferenceStatisticsCycle) {
            this.reportsOfPreferenceStatisticsCycle = reportsOfPreferenceStatisticsCycle;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ListDataDiagnosisReportsResponseBody build() {
            return new ListDataDiagnosisReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisReportsResponseBody</p>
     */
    public static class ExceptionRate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ExceptionRate(Builder builder) {
            this.group = builder.group;
            this.message = builder.message;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExceptionRate create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String group; 
            private String message; 
            private String type; 

            private Builder() {
            } 

            private Builder(ExceptionRate model) {
                this.group = model.group;
                this.message = model.message;
                this.type = model.type;
            } 

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ExceptionRate build() {
                return new ExceptionRate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisReportsResponseBody</p>
     */
    public static class ReportsOfAbnormalBehavior extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("RankId")
        private String rankId;

        @com.aliyun.core.annotation.NameInMap("ConversionRate")
        private String conversionRate;

        @com.aliyun.core.annotation.NameInMap("ConversionRateIds")
        private String conversionRateIds;

        @com.aliyun.core.annotation.NameInMap("DownStreamCount")
        private String downStreamCount;

        @com.aliyun.core.annotation.NameInMap("DownStreamCountIds")
        private String downStreamCountIds;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("UpStreamCount")
        private String upStreamCount;

        @com.aliyun.core.annotation.NameInMap("UpStreamCountIds")
        private String upStreamCountIds;

        @com.aliyun.core.annotation.NameInMap("Distribution")
        private String distribution;

        @com.aliyun.core.annotation.NameInMap("IndicatorName")
        private String indicatorName;

        @com.aliyun.core.annotation.NameInMap("ExceptionRate")
        private String exceptionRate;

        private ReportsOfAbnormalBehavior(Builder builder) {
            this.ds = builder.ds;
            this.rankId = builder.rankId;
            this.conversionRate = builder.conversionRate;
            this.conversionRateIds = builder.conversionRateIds;
            this.downStreamCount = builder.downStreamCount;
            this.downStreamCountIds = builder.downStreamCountIds;
            this.granularity = builder.granularity;
            this.upStreamCount = builder.upStreamCount;
            this.upStreamCountIds = builder.upStreamCountIds;
            this.distribution = builder.distribution;
            this.indicatorName = builder.indicatorName;
            this.exceptionRate = builder.exceptionRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfAbnormalBehavior create() {
            return builder().build();
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return rankId
         */
        public String getRankId() {
            return this.rankId;
        }

        /**
         * @return conversionRate
         */
        public String getConversionRate() {
            return this.conversionRate;
        }

        /**
         * @return conversionRateIds
         */
        public String getConversionRateIds() {
            return this.conversionRateIds;
        }

        /**
         * @return downStreamCount
         */
        public String getDownStreamCount() {
            return this.downStreamCount;
        }

        /**
         * @return downStreamCountIds
         */
        public String getDownStreamCountIds() {
            return this.downStreamCountIds;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return upStreamCount
         */
        public String getUpStreamCount() {
            return this.upStreamCount;
        }

        /**
         * @return upStreamCountIds
         */
        public String getUpStreamCountIds() {
            return this.upStreamCountIds;
        }

        /**
         * @return distribution
         */
        public String getDistribution() {
            return this.distribution;
        }

        /**
         * @return indicatorName
         */
        public String getIndicatorName() {
            return this.indicatorName;
        }

        /**
         * @return exceptionRate
         */
        public String getExceptionRate() {
            return this.exceptionRate;
        }

        public static final class Builder {
            private String ds; 
            private String rankId; 
            private String conversionRate; 
            private String conversionRateIds; 
            private String downStreamCount; 
            private String downStreamCountIds; 
            private String granularity; 
            private String upStreamCount; 
            private String upStreamCountIds; 
            private String distribution; 
            private String indicatorName; 
            private String exceptionRate; 

            private Builder() {
            } 

            private Builder(ReportsOfAbnormalBehavior model) {
                this.ds = model.ds;
                this.rankId = model.rankId;
                this.conversionRate = model.conversionRate;
                this.conversionRateIds = model.conversionRateIds;
                this.downStreamCount = model.downStreamCount;
                this.downStreamCountIds = model.downStreamCountIds;
                this.granularity = model.granularity;
                this.upStreamCount = model.upStreamCount;
                this.upStreamCountIds = model.upStreamCountIds;
                this.distribution = model.distribution;
                this.indicatorName = model.indicatorName;
                this.exceptionRate = model.exceptionRate;
            } 

            /**
             * Ds.
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * RankId.
             */
            public Builder rankId(String rankId) {
                this.rankId = rankId;
                return this;
            }

            /**
             * ConversionRate.
             */
            public Builder conversionRate(String conversionRate) {
                this.conversionRate = conversionRate;
                return this;
            }

            /**
             * ConversionRateIds.
             */
            public Builder conversionRateIds(String conversionRateIds) {
                this.conversionRateIds = conversionRateIds;
                return this;
            }

            /**
             * DownStreamCount.
             */
            public Builder downStreamCount(String downStreamCount) {
                this.downStreamCount = downStreamCount;
                return this;
            }

            /**
             * DownStreamCountIds.
             */
            public Builder downStreamCountIds(String downStreamCountIds) {
                this.downStreamCountIds = downStreamCountIds;
                return this;
            }

            /**
             * Granularity.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * UpStreamCount.
             */
            public Builder upStreamCount(String upStreamCount) {
                this.upStreamCount = upStreamCount;
                return this;
            }

            /**
             * UpStreamCountIds.
             */
            public Builder upStreamCountIds(String upStreamCountIds) {
                this.upStreamCountIds = upStreamCountIds;
                return this;
            }

            /**
             * Distribution.
             */
            public Builder distribution(String distribution) {
                this.distribution = distribution;
                return this;
            }

            /**
             * IndicatorName.
             */
            public Builder indicatorName(String indicatorName) {
                this.indicatorName = indicatorName;
                return this;
            }

            /**
             * ExceptionRate.
             */
            public Builder exceptionRate(String exceptionRate) {
                this.exceptionRate = exceptionRate;
                return this;
            }

            public ReportsOfAbnormalBehavior build() {
                return new ReportsOfAbnormalBehavior(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisReportsResponseBody</p>
     */
    public static class ReportsOfBaseStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultNullCount")
        private String defaultNullCount;

        @com.aliyun.core.annotation.NameInMap("DefaultNullRate")
        private String defaultNullRate;

        @com.aliyun.core.annotation.NameInMap("Ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("NullCount")
        private String nullCount;

        @com.aliyun.core.annotation.NameInMap("NullRate")
        private String nullRate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("UniqueCount")
        private String uniqueCount;

        @com.aliyun.core.annotation.NameInMap("ValueMax")
        private String valueMax;

        @com.aliyun.core.annotation.NameInMap("ValueMedian")
        private String valueMedian;

        @com.aliyun.core.annotation.NameInMap("ValueMin")
        private String valueMin;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile1")
        private String valueQuantile1;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile5")
        private String valueQuantile5;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile25")
        private String valueQuantile25;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile75")
        private String valueQuantile75;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile95")
        private String valueQuantile95;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile99")
        private String valueQuantile99;

        @com.aliyun.core.annotation.NameInMap("Rn")
        private String rn;

        @com.aliyun.core.annotation.NameInMap("FrequencyMax")
        private String frequencyMax;

        @com.aliyun.core.annotation.NameInMap("FrequencyMedian")
        private String frequencyMedian;

        @com.aliyun.core.annotation.NameInMap("FrequencyMin")
        private String frequencyMin;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile1")
        private String frequencyQuantile1;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile5")
        private String frequencyQuantile5;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile25")
        private String frequencyQuantile25;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile75")
        private String frequencyQuantile75;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile95")
        private String frequencyQuantile95;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile99")
        private String frequencyQuantile99;

        @com.aliyun.core.annotation.NameInMap("Distribution")
        private String distribution;

        @com.aliyun.core.annotation.NameInMap("RankId")
        private String rankId;

        @com.aliyun.core.annotation.NameInMap("FeatureValue")
        private String featureValue;

        @com.aliyun.core.annotation.NameInMap("ValueCount")
        private String valueCount;

        @com.aliyun.core.annotation.NameInMap("ValuePercent")
        private String valuePercent;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile")
        private String valueQuantile;

        @com.aliyun.core.annotation.NameInMap("FeatureFrequency")
        private String featureFrequency;

        @com.aliyun.core.annotation.NameInMap("FrequencyCount")
        private String frequencyCount;

        @com.aliyun.core.annotation.NameInMap("FrequencyPercent")
        private String frequencyPercent;

        @com.aliyun.core.annotation.NameInMap("FrequencyQuantile")
        private String frequencyQuantile;

        private ReportsOfBaseStatistics(Builder builder) {
            this.defaultNullCount = builder.defaultNullCount;
            this.defaultNullRate = builder.defaultNullRate;
            this.ds = builder.ds;
            this.featureName = builder.featureName;
            this.featureType = builder.featureType;
            this.nullCount = builder.nullCount;
            this.nullRate = builder.nullRate;
            this.totalCount = builder.totalCount;
            this.uniqueCount = builder.uniqueCount;
            this.valueMax = builder.valueMax;
            this.valueMedian = builder.valueMedian;
            this.valueMin = builder.valueMin;
            this.valueQuantile1 = builder.valueQuantile1;
            this.valueQuantile5 = builder.valueQuantile5;
            this.valueQuantile25 = builder.valueQuantile25;
            this.valueQuantile75 = builder.valueQuantile75;
            this.valueQuantile95 = builder.valueQuantile95;
            this.valueQuantile99 = builder.valueQuantile99;
            this.rn = builder.rn;
            this.frequencyMax = builder.frequencyMax;
            this.frequencyMedian = builder.frequencyMedian;
            this.frequencyMin = builder.frequencyMin;
            this.frequencyQuantile1 = builder.frequencyQuantile1;
            this.frequencyQuantile5 = builder.frequencyQuantile5;
            this.frequencyQuantile25 = builder.frequencyQuantile25;
            this.frequencyQuantile75 = builder.frequencyQuantile75;
            this.frequencyQuantile95 = builder.frequencyQuantile95;
            this.frequencyQuantile99 = builder.frequencyQuantile99;
            this.distribution = builder.distribution;
            this.rankId = builder.rankId;
            this.featureValue = builder.featureValue;
            this.valueCount = builder.valueCount;
            this.valuePercent = builder.valuePercent;
            this.valueQuantile = builder.valueQuantile;
            this.featureFrequency = builder.featureFrequency;
            this.frequencyCount = builder.frequencyCount;
            this.frequencyPercent = builder.frequencyPercent;
            this.frequencyQuantile = builder.frequencyQuantile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfBaseStatistics create() {
            return builder().build();
        }

        /**
         * @return defaultNullCount
         */
        public String getDefaultNullCount() {
            return this.defaultNullCount;
        }

        /**
         * @return defaultNullRate
         */
        public String getDefaultNullRate() {
            return this.defaultNullRate;
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return featureType
         */
        public String getFeatureType() {
            return this.featureType;
        }

        /**
         * @return nullCount
         */
        public String getNullCount() {
            return this.nullCount;
        }

        /**
         * @return nullRate
         */
        public String getNullRate() {
            return this.nullRate;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return uniqueCount
         */
        public String getUniqueCount() {
            return this.uniqueCount;
        }

        /**
         * @return valueMax
         */
        public String getValueMax() {
            return this.valueMax;
        }

        /**
         * @return valueMedian
         */
        public String getValueMedian() {
            return this.valueMedian;
        }

        /**
         * @return valueMin
         */
        public String getValueMin() {
            return this.valueMin;
        }

        /**
         * @return valueQuantile1
         */
        public String getValueQuantile1() {
            return this.valueQuantile1;
        }

        /**
         * @return valueQuantile5
         */
        public String getValueQuantile5() {
            return this.valueQuantile5;
        }

        /**
         * @return valueQuantile25
         */
        public String getValueQuantile25() {
            return this.valueQuantile25;
        }

        /**
         * @return valueQuantile75
         */
        public String getValueQuantile75() {
            return this.valueQuantile75;
        }

        /**
         * @return valueQuantile95
         */
        public String getValueQuantile95() {
            return this.valueQuantile95;
        }

        /**
         * @return valueQuantile99
         */
        public String getValueQuantile99() {
            return this.valueQuantile99;
        }

        /**
         * @return rn
         */
        public String getRn() {
            return this.rn;
        }

        /**
         * @return frequencyMax
         */
        public String getFrequencyMax() {
            return this.frequencyMax;
        }

        /**
         * @return frequencyMedian
         */
        public String getFrequencyMedian() {
            return this.frequencyMedian;
        }

        /**
         * @return frequencyMin
         */
        public String getFrequencyMin() {
            return this.frequencyMin;
        }

        /**
         * @return frequencyQuantile1
         */
        public String getFrequencyQuantile1() {
            return this.frequencyQuantile1;
        }

        /**
         * @return frequencyQuantile5
         */
        public String getFrequencyQuantile5() {
            return this.frequencyQuantile5;
        }

        /**
         * @return frequencyQuantile25
         */
        public String getFrequencyQuantile25() {
            return this.frequencyQuantile25;
        }

        /**
         * @return frequencyQuantile75
         */
        public String getFrequencyQuantile75() {
            return this.frequencyQuantile75;
        }

        /**
         * @return frequencyQuantile95
         */
        public String getFrequencyQuantile95() {
            return this.frequencyQuantile95;
        }

        /**
         * @return frequencyQuantile99
         */
        public String getFrequencyQuantile99() {
            return this.frequencyQuantile99;
        }

        /**
         * @return distribution
         */
        public String getDistribution() {
            return this.distribution;
        }

        /**
         * @return rankId
         */
        public String getRankId() {
            return this.rankId;
        }

        /**
         * @return featureValue
         */
        public String getFeatureValue() {
            return this.featureValue;
        }

        /**
         * @return valueCount
         */
        public String getValueCount() {
            return this.valueCount;
        }

        /**
         * @return valuePercent
         */
        public String getValuePercent() {
            return this.valuePercent;
        }

        /**
         * @return valueQuantile
         */
        public String getValueQuantile() {
            return this.valueQuantile;
        }

        /**
         * @return featureFrequency
         */
        public String getFeatureFrequency() {
            return this.featureFrequency;
        }

        /**
         * @return frequencyCount
         */
        public String getFrequencyCount() {
            return this.frequencyCount;
        }

        /**
         * @return frequencyPercent
         */
        public String getFrequencyPercent() {
            return this.frequencyPercent;
        }

        /**
         * @return frequencyQuantile
         */
        public String getFrequencyQuantile() {
            return this.frequencyQuantile;
        }

        public static final class Builder {
            private String defaultNullCount; 
            private String defaultNullRate; 
            private String ds; 
            private String featureName; 
            private String featureType; 
            private String nullCount; 
            private String nullRate; 
            private String totalCount; 
            private String uniqueCount; 
            private String valueMax; 
            private String valueMedian; 
            private String valueMin; 
            private String valueQuantile1; 
            private String valueQuantile5; 
            private String valueQuantile25; 
            private String valueQuantile75; 
            private String valueQuantile95; 
            private String valueQuantile99; 
            private String rn; 
            private String frequencyMax; 
            private String frequencyMedian; 
            private String frequencyMin; 
            private String frequencyQuantile1; 
            private String frequencyQuantile5; 
            private String frequencyQuantile25; 
            private String frequencyQuantile75; 
            private String frequencyQuantile95; 
            private String frequencyQuantile99; 
            private String distribution; 
            private String rankId; 
            private String featureValue; 
            private String valueCount; 
            private String valuePercent; 
            private String valueQuantile; 
            private String featureFrequency; 
            private String frequencyCount; 
            private String frequencyPercent; 
            private String frequencyQuantile; 

            private Builder() {
            } 

            private Builder(ReportsOfBaseStatistics model) {
                this.defaultNullCount = model.defaultNullCount;
                this.defaultNullRate = model.defaultNullRate;
                this.ds = model.ds;
                this.featureName = model.featureName;
                this.featureType = model.featureType;
                this.nullCount = model.nullCount;
                this.nullRate = model.nullRate;
                this.totalCount = model.totalCount;
                this.uniqueCount = model.uniqueCount;
                this.valueMax = model.valueMax;
                this.valueMedian = model.valueMedian;
                this.valueMin = model.valueMin;
                this.valueQuantile1 = model.valueQuantile1;
                this.valueQuantile5 = model.valueQuantile5;
                this.valueQuantile25 = model.valueQuantile25;
                this.valueQuantile75 = model.valueQuantile75;
                this.valueQuantile95 = model.valueQuantile95;
                this.valueQuantile99 = model.valueQuantile99;
                this.rn = model.rn;
                this.frequencyMax = model.frequencyMax;
                this.frequencyMedian = model.frequencyMedian;
                this.frequencyMin = model.frequencyMin;
                this.frequencyQuantile1 = model.frequencyQuantile1;
                this.frequencyQuantile5 = model.frequencyQuantile5;
                this.frequencyQuantile25 = model.frequencyQuantile25;
                this.frequencyQuantile75 = model.frequencyQuantile75;
                this.frequencyQuantile95 = model.frequencyQuantile95;
                this.frequencyQuantile99 = model.frequencyQuantile99;
                this.distribution = model.distribution;
                this.rankId = model.rankId;
                this.featureValue = model.featureValue;
                this.valueCount = model.valueCount;
                this.valuePercent = model.valuePercent;
                this.valueQuantile = model.valueQuantile;
                this.featureFrequency = model.featureFrequency;
                this.frequencyCount = model.frequencyCount;
                this.frequencyPercent = model.frequencyPercent;
                this.frequencyQuantile = model.frequencyQuantile;
            } 

            /**
             * DefaultNullCount.
             */
            public Builder defaultNullCount(String defaultNullCount) {
                this.defaultNullCount = defaultNullCount;
                return this;
            }

            /**
             * DefaultNullRate.
             */
            public Builder defaultNullRate(String defaultNullRate) {
                this.defaultNullRate = defaultNullRate;
                return this;
            }

            /**
             * Ds.
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FeatureType.
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * NullCount.
             */
            public Builder nullCount(String nullCount) {
                this.nullCount = nullCount;
                return this;
            }

            /**
             * NullRate.
             */
            public Builder nullRate(String nullRate) {
                this.nullRate = nullRate;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UniqueCount.
             */
            public Builder uniqueCount(String uniqueCount) {
                this.uniqueCount = uniqueCount;
                return this;
            }

            /**
             * ValueMax.
             */
            public Builder valueMax(String valueMax) {
                this.valueMax = valueMax;
                return this;
            }

            /**
             * ValueMedian.
             */
            public Builder valueMedian(String valueMedian) {
                this.valueMedian = valueMedian;
                return this;
            }

            /**
             * ValueMin.
             */
            public Builder valueMin(String valueMin) {
                this.valueMin = valueMin;
                return this;
            }

            /**
             * ValueQuantile1.
             */
            public Builder valueQuantile1(String valueQuantile1) {
                this.valueQuantile1 = valueQuantile1;
                return this;
            }

            /**
             * ValueQuantile5.
             */
            public Builder valueQuantile5(String valueQuantile5) {
                this.valueQuantile5 = valueQuantile5;
                return this;
            }

            /**
             * ValueQuantile25.
             */
            public Builder valueQuantile25(String valueQuantile25) {
                this.valueQuantile25 = valueQuantile25;
                return this;
            }

            /**
             * ValueQuantile75.
             */
            public Builder valueQuantile75(String valueQuantile75) {
                this.valueQuantile75 = valueQuantile75;
                return this;
            }

            /**
             * ValueQuantile95.
             */
            public Builder valueQuantile95(String valueQuantile95) {
                this.valueQuantile95 = valueQuantile95;
                return this;
            }

            /**
             * ValueQuantile99.
             */
            public Builder valueQuantile99(String valueQuantile99) {
                this.valueQuantile99 = valueQuantile99;
                return this;
            }

            /**
             * Rn.
             */
            public Builder rn(String rn) {
                this.rn = rn;
                return this;
            }

            /**
             * FrequencyMax.
             */
            public Builder frequencyMax(String frequencyMax) {
                this.frequencyMax = frequencyMax;
                return this;
            }

            /**
             * FrequencyMedian.
             */
            public Builder frequencyMedian(String frequencyMedian) {
                this.frequencyMedian = frequencyMedian;
                return this;
            }

            /**
             * FrequencyMin.
             */
            public Builder frequencyMin(String frequencyMin) {
                this.frequencyMin = frequencyMin;
                return this;
            }

            /**
             * FrequencyQuantile1.
             */
            public Builder frequencyQuantile1(String frequencyQuantile1) {
                this.frequencyQuantile1 = frequencyQuantile1;
                return this;
            }

            /**
             * FrequencyQuantile5.
             */
            public Builder frequencyQuantile5(String frequencyQuantile5) {
                this.frequencyQuantile5 = frequencyQuantile5;
                return this;
            }

            /**
             * FrequencyQuantile25.
             */
            public Builder frequencyQuantile25(String frequencyQuantile25) {
                this.frequencyQuantile25 = frequencyQuantile25;
                return this;
            }

            /**
             * FrequencyQuantile75.
             */
            public Builder frequencyQuantile75(String frequencyQuantile75) {
                this.frequencyQuantile75 = frequencyQuantile75;
                return this;
            }

            /**
             * FrequencyQuantile95.
             */
            public Builder frequencyQuantile95(String frequencyQuantile95) {
                this.frequencyQuantile95 = frequencyQuantile95;
                return this;
            }

            /**
             * FrequencyQuantile99.
             */
            public Builder frequencyQuantile99(String frequencyQuantile99) {
                this.frequencyQuantile99 = frequencyQuantile99;
                return this;
            }

            /**
             * Distribution.
             */
            public Builder distribution(String distribution) {
                this.distribution = distribution;
                return this;
            }

            /**
             * RankId.
             */
            public Builder rankId(String rankId) {
                this.rankId = rankId;
                return this;
            }

            /**
             * FeatureValue.
             */
            public Builder featureValue(String featureValue) {
                this.featureValue = featureValue;
                return this;
            }

            /**
             * ValueCount.
             */
            public Builder valueCount(String valueCount) {
                this.valueCount = valueCount;
                return this;
            }

            /**
             * ValuePercent.
             */
            public Builder valuePercent(String valuePercent) {
                this.valuePercent = valuePercent;
                return this;
            }

            /**
             * ValueQuantile.
             */
            public Builder valueQuantile(String valueQuantile) {
                this.valueQuantile = valueQuantile;
                return this;
            }

            /**
             * FeatureFrequency.
             */
            public Builder featureFrequency(String featureFrequency) {
                this.featureFrequency = featureFrequency;
                return this;
            }

            /**
             * FrequencyCount.
             */
            public Builder frequencyCount(String frequencyCount) {
                this.frequencyCount = frequencyCount;
                return this;
            }

            /**
             * FrequencyPercent.
             */
            public Builder frequencyPercent(String frequencyPercent) {
                this.frequencyPercent = frequencyPercent;
                return this;
            }

            /**
             * FrequencyQuantile.
             */
            public Builder frequencyQuantile(String frequencyQuantile) {
                this.frequencyQuantile = frequencyQuantile;
                return this;
            }

            public ReportsOfBaseStatistics build() {
                return new ReportsOfBaseStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisReportsResponseBody</p>
     */
    public static class ReportsOfChangeRateData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("ChangeCount")
        private String changeCount;

        @com.aliyun.core.annotation.NameInMap("ChangeRate")
        private String changeRate;

        private ReportsOfChangeRateData(Builder builder) {
            this.ds = builder.ds;
            this.flag = builder.flag;
            this.changeCount = builder.changeCount;
            this.changeRate = builder.changeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfChangeRateData create() {
            return builder().build();
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return changeCount
         */
        public String getChangeCount() {
            return this.changeCount;
        }

        /**
         * @return changeRate
         */
        public String getChangeRate() {
            return this.changeRate;
        }

        public static final class Builder {
            private String ds; 
            private String flag; 
            private String changeCount; 
            private String changeRate; 

            private Builder() {
            } 

            private Builder(ReportsOfChangeRateData model) {
                this.ds = model.ds;
                this.flag = model.flag;
                this.changeCount = model.changeCount;
                this.changeRate = model.changeRate;
            } 

            /**
             * Ds.
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * ChangeCount.
             */
            public Builder changeCount(String changeCount) {
                this.changeCount = changeCount;
                return this;
            }

            /**
             * ChangeRate.
             */
            public Builder changeRate(String changeRate) {
                this.changeRate = changeRate;
                return this;
            }

            public ReportsOfChangeRateData build() {
                return new ReportsOfChangeRateData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisReportsResponseBody</p>
     */
    public static class ReportsOfJoinTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("JoinField")
        private String joinField;

        @com.aliyun.core.annotation.NameInMap("LeftExceptRate")
        private String leftExceptRate;

        @com.aliyun.core.annotation.NameInMap("RightExceptRate")
        private String rightExceptRate;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureValue")
        private String featureValue;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Quantile")
        private String quantile;

        @com.aliyun.core.annotation.NameInMap("ValueCount")
        private String valueCount;

        @com.aliyun.core.annotation.NameInMap("ValuePercent")
        private String valuePercent;

        @com.aliyun.core.annotation.NameInMap("ValueQuantile")
        private String valueQuantile;

        private ReportsOfJoinTables(Builder builder) {
            this.ds = builder.ds;
            this.joinField = builder.joinField;
            this.leftExceptRate = builder.leftExceptRate;
            this.rightExceptRate = builder.rightExceptRate;
            this.flag = builder.flag;
            this.featureName = builder.featureName;
            this.featureValue = builder.featureValue;
            this.percent = builder.percent;
            this.quantile = builder.quantile;
            this.valueCount = builder.valueCount;
            this.valuePercent = builder.valuePercent;
            this.valueQuantile = builder.valueQuantile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfJoinTables create() {
            return builder().build();
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return joinField
         */
        public String getJoinField() {
            return this.joinField;
        }

        /**
         * @return leftExceptRate
         */
        public String getLeftExceptRate() {
            return this.leftExceptRate;
        }

        /**
         * @return rightExceptRate
         */
        public String getRightExceptRate() {
            return this.rightExceptRate;
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return featureValue
         */
        public String getFeatureValue() {
            return this.featureValue;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return quantile
         */
        public String getQuantile() {
            return this.quantile;
        }

        /**
         * @return valueCount
         */
        public String getValueCount() {
            return this.valueCount;
        }

        /**
         * @return valuePercent
         */
        public String getValuePercent() {
            return this.valuePercent;
        }

        /**
         * @return valueQuantile
         */
        public String getValueQuantile() {
            return this.valueQuantile;
        }

        public static final class Builder {
            private String ds; 
            private String joinField; 
            private String leftExceptRate; 
            private String rightExceptRate; 
            private String flag; 
            private String featureName; 
            private String featureValue; 
            private String percent; 
            private String quantile; 
            private String valueCount; 
            private String valuePercent; 
            private String valueQuantile; 

            private Builder() {
            } 

            private Builder(ReportsOfJoinTables model) {
                this.ds = model.ds;
                this.joinField = model.joinField;
                this.leftExceptRate = model.leftExceptRate;
                this.rightExceptRate = model.rightExceptRate;
                this.flag = model.flag;
                this.featureName = model.featureName;
                this.featureValue = model.featureValue;
                this.percent = model.percent;
                this.quantile = model.quantile;
                this.valueCount = model.valueCount;
                this.valuePercent = model.valuePercent;
                this.valueQuantile = model.valueQuantile;
            } 

            /**
             * Ds.
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * JoinField.
             */
            public Builder joinField(String joinField) {
                this.joinField = joinField;
                return this;
            }

            /**
             * LeftExceptRate.
             */
            public Builder leftExceptRate(String leftExceptRate) {
                this.leftExceptRate = leftExceptRate;
                return this;
            }

            /**
             * RightExceptRate.
             */
            public Builder rightExceptRate(String rightExceptRate) {
                this.rightExceptRate = rightExceptRate;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FeatureValue.
             */
            public Builder featureValue(String featureValue) {
                this.featureValue = featureValue;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Quantile.
             */
            public Builder quantile(String quantile) {
                this.quantile = quantile;
                return this;
            }

            /**
             * ValueCount.
             */
            public Builder valueCount(String valueCount) {
                this.valueCount = valueCount;
                return this;
            }

            /**
             * ValuePercent.
             */
            public Builder valuePercent(String valuePercent) {
                this.valuePercent = valuePercent;
                return this;
            }

            /**
             * ValueQuantile.
             */
            public Builder valueQuantile(String valueQuantile) {
                this.valueQuantile = valueQuantile;
                return this;
            }

            public ReportsOfJoinTables build() {
                return new ReportsOfJoinTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataDiagnosisReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisReportsResponseBody</p>
     */
    public static class ReportsOfPreferenceStatisticsCycle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleRemainRate")
        private String cycleRemainRate;

        @com.aliyun.core.annotation.NameInMap("SingleRemainRate")
        private String singleRemainRate;

        @com.aliyun.core.annotation.NameInMap("Ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("Days")
        private String days;

        @com.aliyun.core.annotation.NameInMap("EverAppearedRate")
        private String everAppearedRate;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("PeriodRemainRate")
        private String periodRemainRate;

        @com.aliyun.core.annotation.NameInMap("PeriodRemainCount")
        private Long periodRemainCount;

        @com.aliyun.core.annotation.NameInMap("PeriodInternal")
        private Long periodInternal;

        private ReportsOfPreferenceStatisticsCycle(Builder builder) {
            this.cycleRemainRate = builder.cycleRemainRate;
            this.singleRemainRate = builder.singleRemainRate;
            this.ds = builder.ds;
            this.days = builder.days;
            this.everAppearedRate = builder.everAppearedRate;
            this.period = builder.period;
            this.periodRemainRate = builder.periodRemainRate;
            this.periodRemainCount = builder.periodRemainCount;
            this.periodInternal = builder.periodInternal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportsOfPreferenceStatisticsCycle create() {
            return builder().build();
        }

        /**
         * @return cycleRemainRate
         */
        public String getCycleRemainRate() {
            return this.cycleRemainRate;
        }

        /**
         * @return singleRemainRate
         */
        public String getSingleRemainRate() {
            return this.singleRemainRate;
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return days
         */
        public String getDays() {
            return this.days;
        }

        /**
         * @return everAppearedRate
         */
        public String getEverAppearedRate() {
            return this.everAppearedRate;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return periodRemainRate
         */
        public String getPeriodRemainRate() {
            return this.periodRemainRate;
        }

        /**
         * @return periodRemainCount
         */
        public Long getPeriodRemainCount() {
            return this.periodRemainCount;
        }

        /**
         * @return periodInternal
         */
        public Long getPeriodInternal() {
            return this.periodInternal;
        }

        public static final class Builder {
            private String cycleRemainRate; 
            private String singleRemainRate; 
            private String ds; 
            private String days; 
            private String everAppearedRate; 
            private String period; 
            private String periodRemainRate; 
            private Long periodRemainCount; 
            private Long periodInternal; 

            private Builder() {
            } 

            private Builder(ReportsOfPreferenceStatisticsCycle model) {
                this.cycleRemainRate = model.cycleRemainRate;
                this.singleRemainRate = model.singleRemainRate;
                this.ds = model.ds;
                this.days = model.days;
                this.everAppearedRate = model.everAppearedRate;
                this.period = model.period;
                this.periodRemainRate = model.periodRemainRate;
                this.periodRemainCount = model.periodRemainCount;
                this.periodInternal = model.periodInternal;
            } 

            /**
             * CycleRemainRate.
             */
            public Builder cycleRemainRate(String cycleRemainRate) {
                this.cycleRemainRate = cycleRemainRate;
                return this;
            }

            /**
             * SingleRemainRate.
             */
            public Builder singleRemainRate(String singleRemainRate) {
                this.singleRemainRate = singleRemainRate;
                return this;
            }

            /**
             * Ds.
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * Days.
             */
            public Builder days(String days) {
                this.days = days;
                return this;
            }

            /**
             * EverAppearedRate.
             */
            public Builder everAppearedRate(String everAppearedRate) {
                this.everAppearedRate = everAppearedRate;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodRemainRate.
             */
            public Builder periodRemainRate(String periodRemainRate) {
                this.periodRemainRate = periodRemainRate;
                return this;
            }

            /**
             * PeriodRemainCount.
             */
            public Builder periodRemainCount(Long periodRemainCount) {
                this.periodRemainCount = periodRemainCount;
                return this;
            }

            /**
             * PeriodInternal.
             */
            public Builder periodInternal(Long periodInternal) {
                this.periodInternal = periodInternal;
                return this;
            }

            public ReportsOfPreferenceStatisticsCycle build() {
                return new ReportsOfPreferenceStatisticsCycle(this);
            } 

        } 

    }
}
