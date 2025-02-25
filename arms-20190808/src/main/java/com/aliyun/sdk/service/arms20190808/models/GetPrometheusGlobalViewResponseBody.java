// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetPrometheusGlobalViewResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusGlobalViewResponseBody</p>
 */
public class GetPrometheusGlobalViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPrometheusGlobalViewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusGlobalViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * <p>Status code. 200 is success, other status codes are exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The struct returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;clusterId&quot;:&quot;The ID of the global aggregation instance.&quot;, &quot;groupName&quot;:&quot;The name of the global aggregation instance.&quot;, &quot;dataSources&quot;:[ { &quot;sourceName&quot;:&quot;The name of the data source.- ArmsPrometheus No.1&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;userId&quot;:&quot;UserID&quot;, &quot;clusterId&quot;:&quot;ClusterId&quot; }, // more datasources ] }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Returns a hint message for the result.</p>
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
         * <p>743AD493-D006-53BD-AAEC-DDCE7FB68EA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrometheusGlobalViewResponseBody build() {
            return new GetPrometheusGlobalViewResponseBody(this);
        } 

    } 

}
