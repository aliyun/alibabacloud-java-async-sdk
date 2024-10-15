// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HealthSummary} extends {@link TeaModel}
 *
 * <p>HealthSummary</p>
 */
public class HealthSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BadCount")
    private Long badCount;

    @com.aliyun.core.annotation.NameInMap("GoodCount")
    private Long goodCount;

    @com.aliyun.core.annotation.NameInMap("NoneCount")
    private Long noneCount;

    @com.aliyun.core.annotation.NameInMap("StoppedCount")
    private Long stoppedCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UnknownCount")
    private Long unknownCount;

    @com.aliyun.core.annotation.NameInMap("WarningCount")
    private Long warningCount;

    private HealthSummary(Builder builder) {
        this.badCount = builder.badCount;
        this.goodCount = builder.goodCount;
        this.noneCount = builder.noneCount;
        this.stoppedCount = builder.stoppedCount;
        this.totalCount = builder.totalCount;
        this.unknownCount = builder.unknownCount;
        this.warningCount = builder.warningCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HealthSummary create() {
        return builder().build();
    }

    /**
     * @return badCount
     */
    public Long getBadCount() {
        return this.badCount;
    }

    /**
     * @return goodCount
     */
    public Long getGoodCount() {
        return this.goodCount;
    }

    /**
     * @return noneCount
     */
    public Long getNoneCount() {
        return this.noneCount;
    }

    /**
     * @return stoppedCount
     */
    public Long getStoppedCount() {
        return this.stoppedCount;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return unknownCount
     */
    public Long getUnknownCount() {
        return this.unknownCount;
    }

    /**
     * @return warningCount
     */
    public Long getWarningCount() {
        return this.warningCount;
    }

    public static final class Builder {
        private Long badCount; 
        private Long goodCount; 
        private Long noneCount; 
        private Long stoppedCount; 
        private Long totalCount; 
        private Long unknownCount; 
        private Long warningCount; 

        /**
         * BadCount.
         */
        public Builder badCount(Long badCount) {
            this.badCount = badCount;
            return this;
        }

        /**
         * GoodCount.
         */
        public Builder goodCount(Long goodCount) {
            this.goodCount = goodCount;
            return this;
        }

        /**
         * NoneCount.
         */
        public Builder noneCount(Long noneCount) {
            this.noneCount = noneCount;
            return this;
        }

        /**
         * StoppedCount.
         */
        public Builder stoppedCount(Long stoppedCount) {
            this.stoppedCount = stoppedCount;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UnknownCount.
         */
        public Builder unknownCount(Long unknownCount) {
            this.unknownCount = unknownCount;
            return this;
        }

        /**
         * WarningCount.
         */
        public Builder warningCount(Long warningCount) {
            this.warningCount = warningCount;
            return this;
        }

        public HealthSummary build() {
            return new HealthSummary(this);
        } 

    } 

}
