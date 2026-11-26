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
 * {@link RLMetricSeries} extends {@link TeaModel}
 *
 * <p>RLMetricSeries</p>
 */
public class RLMetricSeries extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aggregation")
    private String aggregation;

    @com.aliyun.core.annotation.NameInMap("Downsampled")
    private Boolean downsampled;

    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("Points")
    private java.util.List<RLMetricPoint> points;

    private RLMetricSeries(Builder builder) {
        this.aggregation = builder.aggregation;
        this.downsampled = builder.downsampled;
        this.metricName = builder.metricName;
        this.points = builder.points;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLMetricSeries create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregation
     */
    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * @return downsampled
     */
    public Boolean getDownsampled() {
        return this.downsampled;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return points
     */
    public java.util.List<RLMetricPoint> getPoints() {
        return this.points;
    }

    public static final class Builder {
        private String aggregation; 
        private Boolean downsampled; 
        private String metricName; 
        private java.util.List<RLMetricPoint> points; 

        private Builder() {
        } 

        private Builder(RLMetricSeries model) {
            this.aggregation = model.aggregation;
            this.downsampled = model.downsampled;
            this.metricName = model.metricName;
            this.points = model.points;
        } 

        /**
         * <p>生效聚合策略，即使未降采样也返回</p>
         * 
         * <strong>example:</strong>
         * <p>Last</p>
         */
        public Builder aggregation(String aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        /**
         * <p>是否为满足点数上限进行了等宽步数分桶</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder downsampled(Boolean downsampled) {
            this.downsampled = downsampled;
            return this;
        }

        /**
         * <p>本次查询的精确指标键</p>
         * 
         * <strong>example:</strong>
         * <p>actor/ppo_kl</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>按步数升序排列的有限数据点或聚合桶，同一步数取最新源事件。没有有限点时返回 []，不返回 null</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Step&quot;:1,&quot;GmtTime&quot;:&quot;2026-09-10T06:00:00Z&quot;,&quot;Value&quot;:0.012}]</p>
         */
        public Builder points(java.util.List<RLMetricPoint> points) {
            this.points = points;
            return this;
        }

        public RLMetricSeries build() {
            return new RLMetricSeries(this);
        } 

    } 

}
