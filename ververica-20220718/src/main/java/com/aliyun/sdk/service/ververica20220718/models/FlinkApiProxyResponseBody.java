// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlinkApiProxyResponseBody} extends {@link TeaModel}
 *
 * <p>FlinkApiProxyResponseBody</p>
 */
public class FlinkApiProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private FlinkApiProxyResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlinkApiProxyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private String data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <ul>
         * <li>If the value of success was true, the result of the proxy request was returned.</li>
         * <li>If the value of success was false, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;jobs&quot;: [ { &quot;jid&quot;: &quot;4df35f8e54554b23bf7dcd38a151****&quot;, &quot;name&quot;: &quot;69d001d5-419a-4bfc-9c2e-849cacd3****&quot;, &quot;state&quot;: &quot;RUNNING&quot;, &quot;start-time&quot;: 1659154942068, &quot;end-time&quot;: -1, &quot;duration&quot;: 188161756, &quot;last-modification&quot;: 1659154968305, &quot;tasks&quot;: { &quot;total&quot;: 2, &quot;created&quot;: 0, &quot;scheduled&quot;: 0, &quot;deploying&quot;: 0, &quot;running&quot;: 2, &quot;finished&quot;: 0, &quot;canceling&quot;: 0, &quot;canceled&quot;: 0, &quot;failed&quot;: 0, &quot;reconciling&quot;: 0, &quot;initializing&quot;: 0 } } ] }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error code was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error message was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The value was fixed to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FlinkApiProxyResponseBody build() {
            return new FlinkApiProxyResponseBody(this);
        } 

    } 

}
