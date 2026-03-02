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
 * {@link MonitorMetricResult} extends {@link TeaModel}
 *
 * <p>MonitorMetricResult</p>
 */
public class MonitorMetricResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("measureData")
    private java.util.List<MonitorMetricMeasureData> measureData;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private MonitorMetricResult(Builder builder) {
        this.measureData = builder.measureData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorMetricResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return measureData
     */
    public java.util.List<MonitorMetricMeasureData> getMeasureData() {
        return this.measureData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MonitorMetricMeasureData> measureData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(MonitorMetricResult model) {
            this.measureData = model.measureData;
            this.requestId = model.requestId;
        } 

        /**
         * measureData.
         */
        public Builder measureData(java.util.List<MonitorMetricMeasureData> measureData) {
            this.measureData = measureData;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MonitorMetricResult build() {
            return new MonitorMetricResult(this);
        } 

    } 

}
