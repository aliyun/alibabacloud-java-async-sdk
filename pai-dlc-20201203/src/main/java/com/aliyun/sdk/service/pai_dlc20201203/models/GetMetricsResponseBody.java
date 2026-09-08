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
 * {@link GetMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricsResponseBody</p>
 */
public class GetMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataPoints")
    private String dataPoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataPoints = builder.dataPoints;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricsResponseBody create() {
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
     * @return dataPoints
     */
    public String getDataPoints() {
        return this.dataPoints;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dataPoints; 
        private String message; 
        private String nextToken; 
        private String period; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetricsResponseBody model) {
            this.code = model.code;
            this.dataPoints = model.dataPoints;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.period = model.period;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The monitoring metric data.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Content\&quot;: \&quot;\&quot;, \&quot;OperationName\&quot;: \&quot;purchase\&quot;, \&quot;Success\&quot;: 1, \&quot;Id\&quot;: \&quot;217\&quot;, \&quot;LogDatetime\&quot;: 1687679582923}]</p>
         */
        public Builder dataPoints(String dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * <p>Detailed result message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lESTRpd5hnHNnmKOP/+w9F</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The statistical period for monitoring data. Valid values: 15, 60, 900, and 3600. Unit: seconds. If you do not specify a statistical period, the system uses the reporting period registered for the metric. Each cloud service metric (MetricName) may have a different statistical period. For more information, see cloud service monitoring metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation succeeded. Valid values: true (success) and false (failure).</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetricsResponseBody build() {
            return new GetMetricsResponseBody(this);
        } 

    } 

}
