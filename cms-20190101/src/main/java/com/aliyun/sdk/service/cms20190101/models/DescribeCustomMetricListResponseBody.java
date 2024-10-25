// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomMetricListResponseBody</p>
 */
public class DescribeCustomMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private DescribeCustomMetricListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomMetricListResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String result; 

        /**
         * <p>The responses code.</p>
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AF425E4-1DEA-54F2-910A-8117C9686140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The reported custom metrics that are found in the query.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;all&quot;:0,&quot;size&quot;:10,&quot;param&quot;:{&quot;metric&quot;:&quot;{\&quot;metricName\&quot;:\&quot;cpu_total\&quot;,\&quot;groupId\&quot;:7378****,\&quot;project\&quot;:\&quot;acs_customMetric_120886317861****\&quot;,\&quot;dimension\&quot;:\&quot;sampleName1=value1&amp;sampleName2=value2\&quot;,\&quot;status\&quot;:1}&quot;,&quot;service&quot;:&quot;metric-center.aliyun-inc.com&quot;},&quot;page&quot;:1,&quot;list&quot;:[]}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public DescribeCustomMetricListResponseBody build() {
            return new DescribeCustomMetricListResponseBody(this);
        } 

    } 

}
