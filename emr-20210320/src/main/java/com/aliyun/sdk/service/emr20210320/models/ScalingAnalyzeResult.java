// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingAnalyzeResult} extends {@link TeaModel}
 *
 * <p>ScalingAnalyzeResult</p>
 */
public class ScalingAnalyzeResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualUsage")
    private Float actualUsage;

    @com.aliyun.core.annotation.NameInMap("IdealUsage")
    private Float idealUsage;

    @com.aliyun.core.annotation.NameInMap("ReleaseCores")
    private Integer releaseCores;

    @com.aliyun.core.annotation.NameInMap("ReservedCores")
    private Integer reservedCores;

    private ScalingAnalyzeResult(Builder builder) {
        this.actualUsage = builder.actualUsage;
        this.idealUsage = builder.idealUsage;
        this.releaseCores = builder.releaseCores;
        this.reservedCores = builder.reservedCores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingAnalyzeResult create() {
        return builder().build();
    }

    /**
     * @return actualUsage
     */
    public Float getActualUsage() {
        return this.actualUsage;
    }

    /**
     * @return idealUsage
     */
    public Float getIdealUsage() {
        return this.idealUsage;
    }

    /**
     * @return releaseCores
     */
    public Integer getReleaseCores() {
        return this.releaseCores;
    }

    /**
     * @return reservedCores
     */
    public Integer getReservedCores() {
        return this.reservedCores;
    }

    public static final class Builder {
        private Float actualUsage; 
        private Float idealUsage; 
        private Integer releaseCores; 
        private Integer reservedCores; 

        /**
         * 实际资源利用率。
         */
        public Builder actualUsage(Float actualUsage) {
            this.actualUsage = actualUsage;
            return this;
        }

        /**
         * 理想资源用量。
         */
        public Builder idealUsage(Float idealUsage) {
            this.idealUsage = idealUsage;
            return this;
        }

        /**
         * 固定资源释放核数（非master）core。
         */
        public Builder releaseCores(Integer releaseCores) {
            this.releaseCores = releaseCores;
            return this;
        }

        /**
         * 固定资源保留核数（非master）core。
         */
        public Builder reservedCores(Integer reservedCores) {
            this.reservedCores = reservedCores;
            return this;
        }

        public ScalingAnalyzeResult build() {
            return new ScalingAnalyzeResult(this);
        } 

    } 

}
