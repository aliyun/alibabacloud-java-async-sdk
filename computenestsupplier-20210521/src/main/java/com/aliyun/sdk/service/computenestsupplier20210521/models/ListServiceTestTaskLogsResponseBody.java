// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceTestTaskLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceTestTaskLogsResponseBody</p>
 */
public class ListServiceTestTaskLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskLogs")
    private java.util.List<TaskLogs> taskLogs;

    private ListServiceTestTaskLogsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.taskLogs = builder.taskLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTestTaskLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskLogs
     */
    public java.util.List<TaskLogs> getTaskLogs() {
        return this.taskLogs;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TaskLogs> taskLogs; 

        private Builder() {
        } 

        private Builder(ListServiceTestTaskLogsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.taskLogs = model.taskLogs;
        } 

        /**
         * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDEE055B-D5F4-5B92-8F21-999D408F1214</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service test task logs.</p>
         */
        public Builder taskLogs(java.util.List<TaskLogs> taskLogs) {
            this.taskLogs = taskLogs;
            return this;
        }

        public ListServiceTestTaskLogsResponseBody build() {
            return new ListServiceTestTaskLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceTestTaskLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceTestTaskLogsResponseBody</p>
     */
    public static class TaskLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private TaskLogs(Builder builder) {
            this.content = builder.content;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskLogs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String content; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(TaskLogs model) {
                this.content = model.content;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The log content.</p>
             * 
             * <strong>example:</strong>
             * <p>log content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The UTC timestamp when the response is returned.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-12T20:00:09Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TaskLogs build() {
                return new TaskLogs(this);
            } 

        } 

    }
}
