// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link GetMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricDataResponseBody</p>
 */
public class GetMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("metricData")
    private MetricData metricData;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMetricDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.metricData = builder.metricData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metricData
     */
    public MetricData getMetricData() {
        return this.metricData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private MetricData metricData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMetricDataResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.metricData = model.metricData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. 200 indicates success. If the request fails, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The description of the request result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The query results for each metric. Metrics ending with QuotaRatio return a percentage from 0 to 100. For example, 25 indicates 25%.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;period&quot;:60,&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T00:02:00Z&quot;,&quot;groupBy&quot;:[&quot;teamID&quot;],&quot;results&quot;:[{&quot;metricName&quot;:&quot;cpuUsedCores&quot;,&quot;unit&quot;:&quot;Core&quot;,&quot;series&quot;:[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;points&quot;:[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]}]}]}</p>
         */
        public Builder metricData(MetricData metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-5678-9abc-123456789abc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMetricDataResponseBody build() {
            return new GetMetricDataResponseBody(this);
        } 

    } 

}
