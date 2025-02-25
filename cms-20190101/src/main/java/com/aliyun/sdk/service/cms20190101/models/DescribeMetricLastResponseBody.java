// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricLastResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricLastResponseBody</p>
 */
public class DescribeMetricLastResponseBody extends TeaModel {
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

    private DescribeMetricLastResponseBody(Builder builder) {
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

    public static DescribeMetricLastResponseBody create() {
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
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
         * <p>[{&quot;timestamp&quot;:1548777660000,&quot;userId&quot;:&quot;123456789876****&quot;,&quot;instanceId&quot;:&quot;i-abcdefgh12****&quot;,&quot;Minimum&quot;:93.1,&quot;Average&quot;:99.52,&quot;Maximum&quot;:100}]</p>
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The time interval.</p>
         * <p>Unit: seconds.</p>
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
         * <p>021472A6-25E3-4094-8D00-BA4B6A5486C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMetricLastResponseBody build() {
            return new DescribeMetricLastResponseBody(this);
        } 

    } 

}
