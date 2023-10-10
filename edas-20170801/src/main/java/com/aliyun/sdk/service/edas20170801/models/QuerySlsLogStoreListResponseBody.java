// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySlsLogStoreListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySlsLogStoreListResponseBody</p>
 */
public class QuerySlsLogStoreListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("TotalSize")
    private Integer totalSize;

    private QuerySlsLogStoreListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySlsLogStoreListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalSize; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The configurations of Log Service for the application.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The number of log sources configured for the application.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public QuerySlsLogStoreListResponseBody build() {
            return new QuerySlsLogStoreListResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ConsumerSide")
        private String consumerSide;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Link")
        private String link;

        @NameInMap("Logstore")
        private String logstore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Source")
        private String source;

        private Result(Builder builder) {
            this.consumerSide = builder.consumerSide;
            this.createTime = builder.createTime;
            this.link = builder.link;
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consumerSide
         */
        public String getConsumerSide() {
            return this.consumerSide;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String consumerSide; 
            private String createTime; 
            private String link; 
            private String logstore; 
            private String project; 
            private String source; 

            /**
             * The type of the logging service.
             */
            public Builder consumerSide(String consumerSide) {
                this.consumerSide = consumerSide;
                return this;
            }

            /**
             * The time when the logging service was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The URL of the logging service.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The name of the Logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The source of logs. Valid values:
             * <p>
             * 
             * *   Standard output: stdout.log
             * *   File log: the directory that stores logs
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
