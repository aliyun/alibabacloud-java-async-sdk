// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCMetricListResponseBody</p>
 */
public class DescribeRCMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private String datapoints;

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

    private DescribeRCMetricListResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCMetricListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public String getDatapoints() {
        return this.datapoints;
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
        private String datapoints; 
        private String message; 
        private String nextToken; 
        private String period; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;timestamp&quot;:1722909960000,&quot;instanceId&quot;:&quot;rc-dh2jf9n6j4s14926****&quot;,&quot;userId&quot;:&quot;1695619988087373&quot;,&quot;Minimum&quot;:0.097,&quot;Maximum&quot;:0.097,&quot;Average&quot;:0.097},{&quot;timestamp&quot;:1722910020000,&quot;instanceId&quot;:&quot;rc-dh2jf9n6j4s14926****&quot;,&quot;userId&quot;:&quot;1695619988087373&quot;,&quot;Minimum&quot;:0.093,&quot;Maximum&quot;:0.093,&quot;Average&quot;:0.093}]</p>
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>The message that is returned for the request.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>6178f1825f9fb76ce0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The statistical period of the monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EA2D4F34-01A7-46EB-A339-D80882135206</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRCMetricListResponseBody build() {
            return new DescribeRCMetricListResponseBody(this);
        } 

    } 

}
