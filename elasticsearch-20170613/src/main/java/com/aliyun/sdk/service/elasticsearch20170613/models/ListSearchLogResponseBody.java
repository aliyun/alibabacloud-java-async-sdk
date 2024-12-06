// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
    private java.util.List < Result> result;

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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The level of the log. Valid values:</p>
         * <ul>
         * <li>warn: warning log</li>
         * <li>info: information log</li>
         * <li>error: error log</li>
         * <li>trace: trace logs</li>
         * <li>debug: debug logs</li>
         * </ul>
         * <p>The level information has been migrated to the contentCollection field.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The list of logs returned by the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7F40EAA1-6F1D-4DD9-8DB8-C5F00C4E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The content of the log entry. Migrated to the contentCollection field.</p>
         */
        public Builder result(java.util.List < Result> result) {
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

            /**
             * <p>The IP address of the node that generates the log.</p>
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
        private java.util.Map < String, ? > contentCollection;

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
        public java.util.Map < String, ? > getContentCollection() {
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
            private java.util.Map < String, ? > contentCollection; 
            private String host; 
            private String instanceId; 
            private String level; 
            private Long timestamp; 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[GC (Allocation Failure) 2018-07-19T17:24:20.682+0800: 7516.513: [ParNew: 6604768K-&gt;81121K(7341504K), 0.0760606 secs] 7226662K-&gt;703015K(31813056K), 0.0762507 secs] [Times: user=0.52 sys=0.00, real=0.07 secs]</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * contentCollection.
             */
            public Builder contentCollection(java.util.Map < String, ? > contentCollection) {
                this.contentCollection = contentCollection;
                return this;
            }

            /**
             * <p>Details of the log entry. Different content fields are returned for different log types.</p>
             * 
             * <strong>example:</strong>
             * <p><code>192.168.**.**</code></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The timestamp when the log is generated. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * timestamp.
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
