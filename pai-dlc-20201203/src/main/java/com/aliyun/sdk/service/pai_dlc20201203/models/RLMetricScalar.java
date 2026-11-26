// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLMetricScalar} extends {@link TeaModel}
 *
 * <p>RLMetricScalar</p>
 */
public class RLMetricScalar extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtTime")
    private String gmtTime;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("Step")
    private Long step;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Double value;

    private RLMetricScalar(Builder builder) {
        this.gmtTime = builder.gmtTime;
        this.metricName = builder.metricName;
        this.step = builder.step;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLMetricScalar create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtTime
     */
    public String getGmtTime() {
        return this.gmtTime;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return step
     */
    public Long getStep() {
        return this.step;
    }

    /**
     * @return value
     */
    public Double getValue() {
        return this.value;
    }

    public static final class Builder {
        private String gmtTime; 
        private String metricName; 
        private Long step; 
        private Double value; 

        private Builder() {
        } 

        private Builder(RLMetricScalar model) {
            this.gmtTime = model.gmtTime;
            this.metricName = model.metricName;
            this.step = model.step;
            this.value = model.value;
        } 

        /**
         * <p>该标量的源事件时间，UTC RFC3339，秒精度</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-10T06:00:00Z</p>
         */
        public Builder gmtTime(String gmtTime) {
            this.gmtTime = gmtTime;
            return this;
        }

        /**
         * <p>精确且区分大小写的原生指标键</p>
         * 
         * <strong>example:</strong>
         * <p>actor/ppo_kl</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>该指标在生效日志窗口内最高已观测步数，0 有效；稀疏指标的步数可以不同</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder step(Long step) {
            this.step = step;
            return this;
        }

        /**
         * <p>最新已观测值；空值或非有限值为 null，不回退到较早有限值，也不填 0。完整读取时为 Available，空值本身不产生原因码；查询受限或记录损坏时仍为 Partial</p>
         * 
         * <strong>example:</strong>
         * <p>0.012</p>
         */
        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public RLMetricScalar build() {
            return new RLMetricScalar(this);
        } 

    } 

}
