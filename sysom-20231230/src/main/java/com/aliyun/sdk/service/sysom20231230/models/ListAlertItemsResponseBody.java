// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListAlertItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertItemsResponseBody</p>
 */
public class ListAlertItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAlertItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertItemsResponseBody create() {
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
     * @return data
     */
    public Object getData() {
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
        private String code; 
        private Object data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAlertItemsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li>If <code>code == Success</code>, the authorization is successful.</li>
         * <li>Other status codes indicate authorization failure. If authorization fails, check the <code>message</code> field for detailed error messages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;NODE&quot;: {
         *       &quot;Saturation&quot;: [
         *         &quot;Node CPU utilization detection&quot;,
         *         &quot;Node kernel-mode CPU utilization detection&quot;,
         *         &quot;Node softirq CPU utilization detection&quot;,
         *         &quot;Node memory usage detection&quot;,
         *         &quot;Node kernel memory usage detection&quot;,
         *         &quot;Node file descriptor usage detection&quot;,
         *         &quot;Node root file system usage detection&quot;,
         *         &quot;Node cgroup leak detection&quot;,
         *         &quot;Node socket usage detection&quot;,
         *         &quot;Node TCP memory usage detection&quot;
         *       ],
         *       &quot;Latency&quot;: [
         *         &quot;Node scheduling latency detection&quot;,
         *         &quot;Node network latency detection&quot;,
         *         &quot;Node disk write latency detection&quot;,
         *         &quot;Node disk read latency detection&quot;
         *       ],
         *       &quot;Load&quot;: [
         *         &quot;Node disk I/O traffic detection&quot;,
         *         &quot;Node load average detection&quot;
         *       ],
         *       &quot;Errors&quot;: [
         *         &quot;Node network packet loss detection&quot;,
         *         &quot;Node OOM stall prediction and detection&quot;
         *       ]
         *     },
         *     &quot;POD&quot;: {
         *       &quot;Saturation&quot;: [
         *         &quot;Pod memory usage detection&quot;,
         *         &quot;Pod CPU utilization detection&quot;
         *       ],
         *       &quot;Errors&quot;: [
         *         &quot;Pod CPU throttling detection&quot;,
         *         &quot;Pod OOM event detection&quot;
         *       ]
         *     }
         * }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlertItemsResponseBody build() {
            return new ListAlertItemsResponseBody(this);
        } 

    } 

}
