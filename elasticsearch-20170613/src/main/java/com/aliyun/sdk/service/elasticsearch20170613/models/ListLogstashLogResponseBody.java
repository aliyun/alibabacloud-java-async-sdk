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
 * {@link ListLogstashLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogstashLogResponseBody</p>
 */
public class ListLogstashLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListLogstashLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogstashLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListLogstashLogResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The details of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>7F40EAA1-6F1D-4DD9-8DB8-C5F00C4E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp of log generation. Unit: ms.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListLogstashLogResponseBody build() {
            return new ListLogstashLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogstashLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogstashLogResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

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
            private String host; 
            private String instanceId; 
            private String level; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.host = model.host;
                this.instanceId = model.instanceId;
                this.level = model.level;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The IP address of the node that generates the log.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * host.
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
             * <p>The ID of the instance.</p>
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
