// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MetricData} extends {@link TeaModel}
 *
 * <p>MetricData</p>
 */
public class MetricData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.NameInMap("measures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String measures;

    @com.aliyun.core.annotation.NameInMap("metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.NameInMap("time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long time;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("typeValue")
    private String typeValue;

    private MetricData(Builder builder) {
        this.data = builder.data;
        this.measures = builder.measures;
        this.metric = builder.metric;
        this.time = builder.time;
        this.type = builder.type;
        this.typeValue = builder.typeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return measures
     */
    public String getMeasures() {
        return this.measures;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return typeValue
     */
    public String getTypeValue() {
        return this.typeValue;
    }

    public static final class Builder {
        private String data; 
        private String measures; 
        private String metric; 
        private Long time; 
        private String type; 
        private String typeValue; 

        private Builder() {
        } 

        private Builder(MetricData model) {
            this.data = model.data;
            this.measures = model.measures;
            this.metric = model.metric;
            this.time = model.time;
            this.type = model.type;
            this.typeValue = model.typeValue;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>youngGcCount</p>
         */
        public Builder measures(String measures) {
            this.measures = measures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>appstat.vm</p>
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1654777095632</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * typeValue.
         */
        public Builder typeValue(String typeValue) {
            this.typeValue = typeValue;
            return this;
        }

        public MetricData build() {
            return new MetricData(this);
        } 

    } 

}
