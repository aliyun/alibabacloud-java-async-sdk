// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserStatistic} extends {@link TeaModel}
 *
 * <p>UserStatistic</p>
 */
public class UserStatistic extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceptedMarkItemsCount")
    private Float acceptedMarkItemsCount;

    @com.aliyun.core.annotation.NameInMap("CheckCount")
    private Float checkCount;

    @com.aliyun.core.annotation.NameInMap("CheckedAcceptedCount")
    private Float checkedAcceptedCount;

    @com.aliyun.core.annotation.NameInMap("CheckedAccuracy")
    private Float checkedAccuracy;

    @com.aliyun.core.annotation.NameInMap("MarkEfficiency")
    private Float markEfficiency;

    @com.aliyun.core.annotation.NameInMap("MarkTime")
    private Float markTime;

    @com.aliyun.core.annotation.NameInMap("SamplingAccuracy")
    private Float samplingAccuracy;

    @com.aliyun.core.annotation.NameInMap("SamplingCount")
    private Float samplingCount;

    @com.aliyun.core.annotation.NameInMap("SamplingErrorCount")
    private Float samplingErrorCount;

    @com.aliyun.core.annotation.NameInMap("TotalMarkItemsCount")
    private Float totalMarkItemsCount;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private UserStatistic(Builder builder) {
        this.acceptedMarkItemsCount = builder.acceptedMarkItemsCount;
        this.checkCount = builder.checkCount;
        this.checkedAcceptedCount = builder.checkedAcceptedCount;
        this.checkedAccuracy = builder.checkedAccuracy;
        this.markEfficiency = builder.markEfficiency;
        this.markTime = builder.markTime;
        this.samplingAccuracy = builder.samplingAccuracy;
        this.samplingCount = builder.samplingCount;
        this.samplingErrorCount = builder.samplingErrorCount;
        this.totalMarkItemsCount = builder.totalMarkItemsCount;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserStatistic create() {
        return builder().build();
    }

    /**
     * @return acceptedMarkItemsCount
     */
    public Float getAcceptedMarkItemsCount() {
        return this.acceptedMarkItemsCount;
    }

    /**
     * @return checkCount
     */
    public Float getCheckCount() {
        return this.checkCount;
    }

    /**
     * @return checkedAcceptedCount
     */
    public Float getCheckedAcceptedCount() {
        return this.checkedAcceptedCount;
    }

    /**
     * @return checkedAccuracy
     */
    public Float getCheckedAccuracy() {
        return this.checkedAccuracy;
    }

    /**
     * @return markEfficiency
     */
    public Float getMarkEfficiency() {
        return this.markEfficiency;
    }

    /**
     * @return markTime
     */
    public Float getMarkTime() {
        return this.markTime;
    }

    /**
     * @return samplingAccuracy
     */
    public Float getSamplingAccuracy() {
        return this.samplingAccuracy;
    }

    /**
     * @return samplingCount
     */
    public Float getSamplingCount() {
        return this.samplingCount;
    }

    /**
     * @return samplingErrorCount
     */
    public Float getSamplingErrorCount() {
        return this.samplingErrorCount;
    }

    /**
     * @return totalMarkItemsCount
     */
    public Float getTotalMarkItemsCount() {
        return this.totalMarkItemsCount;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Float acceptedMarkItemsCount; 
        private Float checkCount; 
        private Float checkedAcceptedCount; 
        private Float checkedAccuracy; 
        private Float markEfficiency; 
        private Float markTime; 
        private Float samplingAccuracy; 
        private Float samplingCount; 
        private Float samplingErrorCount; 
        private Float totalMarkItemsCount; 
        private String userId; 

        /**
         * AcceptedMarkItemsCount.
         */
        public Builder acceptedMarkItemsCount(Float acceptedMarkItemsCount) {
            this.acceptedMarkItemsCount = acceptedMarkItemsCount;
            return this;
        }

        /**
         * CheckCount.
         */
        public Builder checkCount(Float checkCount) {
            this.checkCount = checkCount;
            return this;
        }

        /**
         * CheckedAcceptedCount.
         */
        public Builder checkedAcceptedCount(Float checkedAcceptedCount) {
            this.checkedAcceptedCount = checkedAcceptedCount;
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
         * MarkEfficiency.
         */
        public Builder markEfficiency(Float markEfficiency) {
            this.markEfficiency = markEfficiency;
            return this;
        }

        /**
         * MarkTime.
         */
        public Builder markTime(Float markTime) {
            this.markTime = markTime;
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
         * SamplingCount.
         */
        public Builder samplingCount(Float samplingCount) {
            this.samplingCount = samplingCount;
            return this;
        }

        /**
         * SamplingErrorCount.
         */
        public Builder samplingErrorCount(Float samplingErrorCount) {
            this.samplingErrorCount = samplingErrorCount;
            return this;
        }

        /**
         * TotalMarkItemsCount.
         */
        public Builder totalMarkItemsCount(Float totalMarkItemsCount) {
            this.totalMarkItemsCount = totalMarkItemsCount;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserStatistic build() {
            return new UserStatistic(this);
        } 

    } 

}
