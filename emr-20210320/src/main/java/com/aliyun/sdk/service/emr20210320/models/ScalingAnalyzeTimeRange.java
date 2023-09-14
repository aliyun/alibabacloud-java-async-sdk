// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingAnalyzeTimeRange} extends {@link TeaModel}
 *
 * <p>ScalingAnalyzeTimeRange</p>
 */
public class ScalingAnalyzeTimeRange extends TeaModel {
    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Type")
    private String type;

    private ScalingAnalyzeTimeRange(Builder builder) {
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingAnalyzeTimeRange create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long endTime; 
        private Long startTime; 
        private String type; 

        /**
         * 结束时间。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 起始时间。
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * 峰谷类型。 peak/valley
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ScalingAnalyzeTimeRange build() {
            return new ScalingAnalyzeTimeRange(this);
        } 

    } 

}
