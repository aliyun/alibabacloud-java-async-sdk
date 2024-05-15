// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskStatistic} extends {@link TeaModel}
 *
 * <p>TaskStatistic</p>
 */
public class TaskStatistic extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceptItemCount")
    private Float acceptItemCount;

    @com.aliyun.core.annotation.NameInMap("CheckAbandon")
    private Float checkAbandon;

    @com.aliyun.core.annotation.NameInMap("CheckAccuracy")
    private Float checkAccuracy;

    @com.aliyun.core.annotation.NameInMap("CheckEfficiency")
    private Float checkEfficiency;

    @com.aliyun.core.annotation.NameInMap("CheckedAccuracy")
    private Float checkedAccuracy;

    @com.aliyun.core.annotation.NameInMap("CheckedError")
    private Float checkedError;

    @com.aliyun.core.annotation.NameInMap("CheckedRejectCount")
    private Float checkedRejectCount;

    @com.aliyun.core.annotation.NameInMap("FinalAbandonCount")
    private Float finalAbandonCount;

    @com.aliyun.core.annotation.NameInMap("FinishedItemCount")
    private Long finishedItemCount;

    @com.aliyun.core.annotation.NameInMap("FinishedSubtaskCount")
    private Long finishedSubtaskCount;

    @com.aliyun.core.annotation.NameInMap("MarkEfficiency")
    private Float markEfficiency;

    @com.aliyun.core.annotation.NameInMap("PreMarkFixedCount")
    private Float preMarkFixedCount;

    @com.aliyun.core.annotation.NameInMap("SampledAccuracy")
    private Float sampledAccuracy;

    @com.aliyun.core.annotation.NameInMap("SampledErrorCount")
    private Float sampledErrorCount;

    @com.aliyun.core.annotation.NameInMap("SampledRejectCount")
    private Float sampledRejectCount;

    @com.aliyun.core.annotation.NameInMap("SamplingAccuracy")
    private Float samplingAccuracy;

    @com.aliyun.core.annotation.NameInMap("TotalCheckCount")
    private Float totalCheckCount;

    @com.aliyun.core.annotation.NameInMap("TotalCheckTime")
    private Float totalCheckTime;

    @com.aliyun.core.annotation.NameInMap("TotalCheckedCount")
    private Float totalCheckedCount;

    @com.aliyun.core.annotation.NameInMap("TotalItemCount")
    private Long totalItemCount;

    @com.aliyun.core.annotation.NameInMap("TotalMarkTime")
    private Float totalMarkTime;

    @com.aliyun.core.annotation.NameInMap("TotalSampledCount")
    private Float totalSampledCount;

    @com.aliyun.core.annotation.NameInMap("TotalSamplingCount")
    private Float totalSamplingCount;

    @com.aliyun.core.annotation.NameInMap("TotalSubtaskCount")
    private Long totalSubtaskCount;

    @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
    private Float totalWorkTime;

    private TaskStatistic(Builder builder) {
        this.acceptItemCount = builder.acceptItemCount;
        this.checkAbandon = builder.checkAbandon;
        this.checkAccuracy = builder.checkAccuracy;
        this.checkEfficiency = builder.checkEfficiency;
        this.checkedAccuracy = builder.checkedAccuracy;
        this.checkedError = builder.checkedError;
        this.checkedRejectCount = builder.checkedRejectCount;
        this.finalAbandonCount = builder.finalAbandonCount;
        this.finishedItemCount = builder.finishedItemCount;
        this.finishedSubtaskCount = builder.finishedSubtaskCount;
        this.markEfficiency = builder.markEfficiency;
        this.preMarkFixedCount = builder.preMarkFixedCount;
        this.sampledAccuracy = builder.sampledAccuracy;
        this.sampledErrorCount = builder.sampledErrorCount;
        this.sampledRejectCount = builder.sampledRejectCount;
        this.samplingAccuracy = builder.samplingAccuracy;
        this.totalCheckCount = builder.totalCheckCount;
        this.totalCheckTime = builder.totalCheckTime;
        this.totalCheckedCount = builder.totalCheckedCount;
        this.totalItemCount = builder.totalItemCount;
        this.totalMarkTime = builder.totalMarkTime;
        this.totalSampledCount = builder.totalSampledCount;
        this.totalSamplingCount = builder.totalSamplingCount;
        this.totalSubtaskCount = builder.totalSubtaskCount;
        this.totalWorkTime = builder.totalWorkTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskStatistic create() {
        return builder().build();
    }

    /**
     * @return acceptItemCount
     */
    public Float getAcceptItemCount() {
        return this.acceptItemCount;
    }

    /**
     * @return checkAbandon
     */
    public Float getCheckAbandon() {
        return this.checkAbandon;
    }

    /**
     * @return checkAccuracy
     */
    public Float getCheckAccuracy() {
        return this.checkAccuracy;
    }

    /**
     * @return checkEfficiency
     */
    public Float getCheckEfficiency() {
        return this.checkEfficiency;
    }

    /**
     * @return checkedAccuracy
     */
    public Float getCheckedAccuracy() {
        return this.checkedAccuracy;
    }

    /**
     * @return checkedError
     */
    public Float getCheckedError() {
        return this.checkedError;
    }

    /**
     * @return checkedRejectCount
     */
    public Float getCheckedRejectCount() {
        return this.checkedRejectCount;
    }

    /**
     * @return finalAbandonCount
     */
    public Float getFinalAbandonCount() {
        return this.finalAbandonCount;
    }

    /**
     * @return finishedItemCount
     */
    public Long getFinishedItemCount() {
        return this.finishedItemCount;
    }

    /**
     * @return finishedSubtaskCount
     */
    public Long getFinishedSubtaskCount() {
        return this.finishedSubtaskCount;
    }

    /**
     * @return markEfficiency
     */
    public Float getMarkEfficiency() {
        return this.markEfficiency;
    }

    /**
     * @return preMarkFixedCount
     */
    public Float getPreMarkFixedCount() {
        return this.preMarkFixedCount;
    }

    /**
     * @return sampledAccuracy
     */
    public Float getSampledAccuracy() {
        return this.sampledAccuracy;
    }

    /**
     * @return sampledErrorCount
     */
    public Float getSampledErrorCount() {
        return this.sampledErrorCount;
    }

    /**
     * @return sampledRejectCount
     */
    public Float getSampledRejectCount() {
        return this.sampledRejectCount;
    }

    /**
     * @return samplingAccuracy
     */
    public Float getSamplingAccuracy() {
        return this.samplingAccuracy;
    }

    /**
     * @return totalCheckCount
     */
    public Float getTotalCheckCount() {
        return this.totalCheckCount;
    }

    /**
     * @return totalCheckTime
     */
    public Float getTotalCheckTime() {
        return this.totalCheckTime;
    }

    /**
     * @return totalCheckedCount
     */
    public Float getTotalCheckedCount() {
        return this.totalCheckedCount;
    }

    /**
     * @return totalItemCount
     */
    public Long getTotalItemCount() {
        return this.totalItemCount;
    }

    /**
     * @return totalMarkTime
     */
    public Float getTotalMarkTime() {
        return this.totalMarkTime;
    }

    /**
     * @return totalSampledCount
     */
    public Float getTotalSampledCount() {
        return this.totalSampledCount;
    }

    /**
     * @return totalSamplingCount
     */
    public Float getTotalSamplingCount() {
        return this.totalSamplingCount;
    }

    /**
     * @return totalSubtaskCount
     */
    public Long getTotalSubtaskCount() {
        return this.totalSubtaskCount;
    }

    /**
     * @return totalWorkTime
     */
    public Float getTotalWorkTime() {
        return this.totalWorkTime;
    }

    public static final class Builder {
        private Float acceptItemCount; 
        private Float checkAbandon; 
        private Float checkAccuracy; 
        private Float checkEfficiency; 
        private Float checkedAccuracy; 
        private Float checkedError; 
        private Float checkedRejectCount; 
        private Float finalAbandonCount; 
        private Long finishedItemCount; 
        private Long finishedSubtaskCount; 
        private Float markEfficiency; 
        private Float preMarkFixedCount; 
        private Float sampledAccuracy; 
        private Float sampledErrorCount; 
        private Float sampledRejectCount; 
        private Float samplingAccuracy; 
        private Float totalCheckCount; 
        private Float totalCheckTime; 
        private Float totalCheckedCount; 
        private Long totalItemCount; 
        private Float totalMarkTime; 
        private Float totalSampledCount; 
        private Float totalSamplingCount; 
        private Long totalSubtaskCount; 
        private Float totalWorkTime; 

        /**
         * AcceptItemCount.
         */
        public Builder acceptItemCount(Float acceptItemCount) {
            this.acceptItemCount = acceptItemCount;
            return this;
        }

        /**
         * CheckAbandon.
         */
        public Builder checkAbandon(Float checkAbandon) {
            this.checkAbandon = checkAbandon;
            return this;
        }

        /**
         * CheckAccuracy.
         */
        public Builder checkAccuracy(Float checkAccuracy) {
            this.checkAccuracy = checkAccuracy;
            return this;
        }

        /**
         * CheckEfficiency.
         */
        public Builder checkEfficiency(Float checkEfficiency) {
            this.checkEfficiency = checkEfficiency;
            return this;
        }

        /**
         * CheckedAccuracy.
         */
        public Builder checkedAccuracy(Float checkedAccuracy) {
            this.checkedAccuracy = checkedAccuracy;
            return this;
        }

        /**
         * CheckedError.
         */
        public Builder checkedError(Float checkedError) {
            this.checkedError = checkedError;
            return this;
        }

        /**
         * CheckedRejectCount.
         */
        public Builder checkedRejectCount(Float checkedRejectCount) {
            this.checkedRejectCount = checkedRejectCount;
            return this;
        }

        /**
         * FinalAbandonCount.
         */
        public Builder finalAbandonCount(Float finalAbandonCount) {
            this.finalAbandonCount = finalAbandonCount;
            return this;
        }

        /**
         * FinishedItemCount.
         */
        public Builder finishedItemCount(Long finishedItemCount) {
            this.finishedItemCount = finishedItemCount;
            return this;
        }

        /**
         * FinishedSubtaskCount.
         */
        public Builder finishedSubtaskCount(Long finishedSubtaskCount) {
            this.finishedSubtaskCount = finishedSubtaskCount;
            return this;
        }

        /**
         * MarkEfficiency.
         */
        public Builder markEfficiency(Float markEfficiency) {
            this.markEfficiency = markEfficiency;
            return this;
        }

        /**
         * PreMarkFixedCount.
         */
        public Builder preMarkFixedCount(Float preMarkFixedCount) {
            this.preMarkFixedCount = preMarkFixedCount;
            return this;
        }

        /**
         * SampledAccuracy.
         */
        public Builder sampledAccuracy(Float sampledAccuracy) {
            this.sampledAccuracy = sampledAccuracy;
            return this;
        }

        /**
         * SampledErrorCount.
         */
        public Builder sampledErrorCount(Float sampledErrorCount) {
            this.sampledErrorCount = sampledErrorCount;
            return this;
        }

        /**
         * SampledRejectCount.
         */
        public Builder sampledRejectCount(Float sampledRejectCount) {
            this.sampledRejectCount = sampledRejectCount;
            return this;
        }

        /**
         * SamplingAccuracy.
         */
        public Builder samplingAccuracy(Float samplingAccuracy) {
            this.samplingAccuracy = samplingAccuracy;
            return this;
        }

        /**
         * TotalCheckCount.
         */
        public Builder totalCheckCount(Float totalCheckCount) {
            this.totalCheckCount = totalCheckCount;
            return this;
        }

        /**
         * TotalCheckTime.
         */
        public Builder totalCheckTime(Float totalCheckTime) {
            this.totalCheckTime = totalCheckTime;
            return this;
        }

        /**
         * TotalCheckedCount.
         */
        public Builder totalCheckedCount(Float totalCheckedCount) {
            this.totalCheckedCount = totalCheckedCount;
            return this;
        }

        /**
         * TotalItemCount.
         */
        public Builder totalItemCount(Long totalItemCount) {
            this.totalItemCount = totalItemCount;
            return this;
        }

        /**
         * TotalMarkTime.
         */
        public Builder totalMarkTime(Float totalMarkTime) {
            this.totalMarkTime = totalMarkTime;
            return this;
        }

        /**
         * TotalSampledCount.
         */
        public Builder totalSampledCount(Float totalSampledCount) {
            this.totalSampledCount = totalSampledCount;
            return this;
        }

        /**
         * TotalSamplingCount.
         */
        public Builder totalSamplingCount(Float totalSamplingCount) {
            this.totalSamplingCount = totalSamplingCount;
            return this;
        }

        /**
         * TotalSubtaskCount.
         */
        public Builder totalSubtaskCount(Long totalSubtaskCount) {
            this.totalSubtaskCount = totalSubtaskCount;
            return this;
        }

        /**
         * TotalWorkTime.
         */
        public Builder totalWorkTime(Float totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }

        public TaskStatistic build() {
            return new TaskStatistic(this);
        } 

    } 

}
