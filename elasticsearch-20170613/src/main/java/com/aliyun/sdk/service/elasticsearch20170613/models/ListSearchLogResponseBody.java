// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchLogResponseBody</p>
 */
public class ListSearchLogResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * The header of the response.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of logs returned by the request.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListSearchLogResponseBody build() {
            return new ListSearchLogResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Total-Count")
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
             * The number of entries returned per page.
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
    public static class Result extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("contentCollection")
        private java.util.Map < String, ? > contentCollection;

        @NameInMap("host")
        private String host;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("level")
        private String level;

        @NameInMap("timestamp")
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
             * The content of the log entry. Migrated to the contentCollection field.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Details of the log entry. Different content fields are returned for different log types.
             */
            public Builder contentCollection(java.util.Map < String, ? > contentCollection) {
                this.contentCollection = contentCollection;
                return this;
            }

            /**
             * The IP address of the node that generates the log.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The level of the log. Valid values:
             * <p>
             * 
             * *   warn: warning log
             * *   info: information log
             * *   error: error log
             * *   trace: trace logs
             * *   debug: debug logs
             * 
             * The level information has been migrated to the contentCollection field.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The timestamp when the log is generated. Unit: ms.
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
