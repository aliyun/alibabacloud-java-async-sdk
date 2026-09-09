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
         * <li><code>code == Success</code> indicates that the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault message.</li>
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
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;NODE&quot;: {
         *       &quot;饱和度&quot;: [
         *         &quot;节点CPU使用率检测&quot;,
         *         &quot;节点内核态CPU使用检测&quot;,
         *         &quot;节点软中断CPU使用检测&quot;,
         *         &quot;节点内存使用检测&quot;,
         *         &quot;节点内核内存使用检测&quot;,
         *         &quot;节点文件描述符使用检测&quot;,
         *         &quot;节点根文件系统使用检测&quot;,
         *         &quot;节点cgroup泄漏检测&quot;,
         *         &quot;节点Sockets使用检测&quot;,
         *         &quot;节点TCP内存使用检测&quot;
         *       ],
         *       &quot;延时&quot;: [
         *         &quot;节点调度延时检测&quot;,
         *         &quot;节点网络延时检测&quot;,
         *         &quot;节点磁盘写入延迟检测&quot;,
         *         &quot;节点磁盘读取延迟检测&quot;
         *       ],
         *       &quot;负载&quot;: [
         *         &quot;节点磁盘IO流量检测&quot;,
         *         &quot;节点load average检测&quot;
         *       ],
         *       &quot;错误&quot;: [
         *         &quot;节点网络丢包检测&quot;,
         *         &quot;节点OOM夯机预测及检测&quot;
         *       ]
         *     },
         *     &quot;POD&quot;: {
         *       &quot;饱和度&quot;: [
         *         &quot;Pod内存使用检测&quot;,
         *         &quot;Pod CPU使用率检测&quot;
         *       ],
         *       &quot;错误&quot;: [
         *         &quot;Pod CPU限流检测&quot;,
         *         &quot;Pod OOM事件检测&quot;
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
         * <li>Otherwise, this field contains the request error information.</li>
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
