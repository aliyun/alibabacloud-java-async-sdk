// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstanceMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstanceMetricDataResponseBody</p>
 */
public class DescribeDatabaseInstanceMetricDataResponseBody extends TeaModel {
    @NameInMap("DataFormat")
    private String dataFormat;

    @NameInMap("MetricData")
    private String metricData;

    @NameInMap("MetricName")
    private String metricName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Unit")
    private String unit;

    private DescribeDatabaseInstanceMetricDataResponseBody(Builder builder) {
        this.dataFormat = builder.dataFormat;
        this.metricData = builder.metricData;
        this.metricName = builder.metricName;
        this.requestId = builder.requestId;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstanceMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return metricData
     */
    public String getMetricData() {
        return this.metricData;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private String dataFormat; 
        private String metricData; 
        private String metricName; 
        private String requestId; 
        private String unit; 

        /**
         * DataFormat.
         */
        public Builder dataFormat(String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * MetricData.
         */
        public Builder metricData(String metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
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
         * Unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public DescribeDatabaseInstanceMetricDataResponseBody build() {
            return new DescribeDatabaseInstanceMetricDataResponseBody(this);
        } 

    } 

}
