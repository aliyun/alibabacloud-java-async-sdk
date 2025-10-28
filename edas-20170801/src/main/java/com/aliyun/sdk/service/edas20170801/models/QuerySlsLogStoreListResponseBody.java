// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link QuerySlsLogStoreListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySlsLogStoreListResponseBody</p>
 */
public class QuerySlsLogStoreListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(QuerySlsLogStoreListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalSize = model.totalSize;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>d6834ee9-5045-*************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of Log Service for the application.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The number of log sources configured for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public QuerySlsLogStoreListResponseBody build() {
            return new QuerySlsLogStoreListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySlsLogStoreListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySlsLogStoreListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerSide")
        private String consumerSide;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Source")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.consumerSide = model.consumerSide;
                this.createTime = model.createTime;
                this.link = model.link;
                this.logstore = model.logstore;
                this.project = model.project;
                this.source = model.source;
            } 

            /**
             * <p>The type of the logging service.</p>
             * 
             * <strong>example:</strong>
             * <p>Log Service</p>
             */
            public Builder consumerSide(String consumerSide) {
                this.consumerSide = consumerSide;
                return this;
            }

            /**
             * <p>The time when the logging service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-18 22:08:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The URL of the logging service.</p>
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>thisisatestlogstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-c846f28edbd1d4c6aa9d78c0e********</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The source of logs. Valid values:</p>
             * <ul>
             * <li>Standard output: stdout.log</li>
             * <li>File log: the directory that stores logs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/var/log/*</p>
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
