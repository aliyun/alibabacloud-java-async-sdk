// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListSearchLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchLogResponseBody</p>
 */
public class ListSearchLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListSearchLogResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListSearchLogResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The response headers.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F40EAA1-6F1D-4DD9-8DB8-C5F00C4E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of logs returned by the request.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListSearchLogResponseBody build() {
            return new ListSearchLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSearchLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchLogResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xTotalCount = model.xTotalCount;
            } 

            /**
             * <p>The total number of records for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchLogResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentCollection")
        private java.util.Map<String, ?> contentCollection;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        private Result(Builder builder) {
            this.content = builder.content;
            this.contentCollection = builder.contentCollection;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentCollection
         */
        public java.util.Map<String, ?> getContentCollection() {
            return this.contentCollection;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map<String, ?> contentCollection; 
            private String host; 
            private String instanceId; 
            private String level; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.contentCollection = model.contentCollection;
                this.host = model.host;
                this.instanceId = model.instanceId;
                this.level = model.level;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The detailed log content. This field has been migrated to the contentCollection field.</p>
             * 
             * <strong>example:</strong>
             * <p>[GC (Allocation Failure) 2018-07-19T17:24:20.682+0800: 7516.513: [ParNew: 6604768K-&gt;81121K(7341504K), 0.0760606 secs] 7226662K-&gt;703015K(31813056K), 0.0762507 secs] [Times: user=0.52 sys=0.00, real=0.07 secs]</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The log details. Different log types return different content fields.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;level&quot;: &quot;info&quot;, &quot;host&quot;: &quot;<code>192.168.**.**</code>&quot;, &quot;time&quot;: &quot;2019-03-18T08:16:12.741Z&quot;,&quot;content&quot;: &quot;[o.e.c.r.a.AllocationService] [MnNASM_] Cluster health status changed from [YELLOW] to [GREEN] (reason: [shards started [[my_index][3]] ...]).&quot;}</p>
             */
            public Builder contentCollection(java.util.Map<String, ?> contentCollection) {
                this.contentCollection = contentCollection;
                return this;
            }

            /**
             * <p>The IP address of the node that generated the log.</p>
             * 
             * <strong>example:</strong>
             * <p><code>192.168.**.**</code></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-n6w1o1x0w001c****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The log level. Valid values:</p>
             * <ul>
             * <li>warn: warning log</li>
             * <li>info: information log</li>
             * <li>error: error log</li>
             * <li>trace: trace log</li>
             * <li>debug: debug log</li>
             * </ul>
             * <p>The level information has been migrated to the contentCollection field.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The timestamp when the log was generated, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1531985112420</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
