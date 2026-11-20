// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListCommandInvocationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommandInvocationResultsResponseBody</p>
 */
public class ListCommandInvocationResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandInvocationResultModel")
    private java.util.List<CommandInvocationResultModel> commandInvocationResultModel;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCommandInvocationResultsResponseBody(Builder builder) {
        this.commandInvocationResultModel = builder.commandInvocationResultModel;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommandInvocationResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandInvocationResultModel
     */
    public java.util.List<CommandInvocationResultModel> getCommandInvocationResultModel() {
        return this.commandInvocationResultModel;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CommandInvocationResultModel> commandInvocationResultModel; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCommandInvocationResultsResponseBody model) {
            this.commandInvocationResultModel = model.commandInvocationResultModel;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of command execution results. Each element corresponds to an execution record on a persistent session. If no records meet the conditions, an empty array is returned.</p>
         */
        public Builder commandInvocationResultModel(java.util.List<CommandInvocationResultModel> commandInvocationResultModel) {
            this.commandInvocationResultModel = commandInvocationResultModel;
            return this;
        }

        /**
         * <p>This field is not returned in the current version. Use PageNumber, PageSize, and TotalCount for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This field is not returned in the current version. Use PageNumber, PageSize, and TotalCount for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kDw2Ml****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number of the query results. In the current version, this field always returns 0 and does not echo echo request parameter PageNumber. Refer to echo request parameter for the actual value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of query results on each page. In the current version, this field always returns 0 and does not echo echo request parameter PageSize. Refer to echo request parameter for the actual value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results. If no records meet the conditions, 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCommandInvocationResultsResponseBody build() {
            return new ListCommandInvocationResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCommandInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCommandInvocationResultsResponseBody</p>
     */
    public static class CommandInvocationResultModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
        private String appInstancePersistentId;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InvocationId")
        private String invocationId;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CommandInvocationResultModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.appInstancePersistentId = builder.appInstancePersistentId;
            this.finishTime = builder.finishTime;
            this.invocationId = builder.invocationId;
            this.invocationStatus = builder.invocationStatus;
            this.output = builder.output;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandInvocationResultModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return appInstancePersistentId
         */
        public String getAppInstancePersistentId() {
            return this.appInstancePersistentId;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return invocationId
         */
        public String getInvocationId() {
            return this.invocationId;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String appInstancePersistentId; 
            private String finishTime; 
            private String invocationId; 
            private String invocationStatus; 
            private String output; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CommandInvocationResultModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceId = model.appInstanceId;
                this.appInstancePersistentId = model.appInstancePersistentId;
                this.finishTime = model.finishTime;
                this.invocationId = model.invocationId;
                this.invocationStatus = model.invocationStatus;
                this.output = model.output;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The ID of the delivery group to which the persistent session that executed the command belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-0bxls9m9arax6****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The instance ID of the application that executed the command.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-azn3kmwruh1vl****</p>
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * <p>The ID of the persistent session that executed the command.</p>
             * 
             * <strong>example:</strong>
             * <p>p-0cc7s3mw2fg4j****</p>
             */
            public Builder appInstancePersistentId(String appInstancePersistentId) {
                this.appInstancePersistentId = appInstancePersistentId;
                return this;
            }

            /**
             * <p>The time when the command finished executing. The time is displayed in UTC and follows the RFC 3339 standard in the yyyy-MM-ddTHH:mm:ssZ format. If the command has not finished executing, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-10T08:49:30Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The command execution ID, which is the same as the InvocationId request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>t-0bxls9m9ara****</p>
             */
            public Builder invocationId(String invocationId) {
                this.invocationId = invocationId;
                return this;
            }

            /**
             * <p>The execution status of the command on the persistent session, such as Pending (waiting for execution), Running (executing), Success (executed successfully), and Timeout (execution timed out).</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The output content generated by the command execution in raw text. If the command has not finished or has no output, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>hello world</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The time when the command started to execute. The time is displayed in UTC and follows the RFC 3339 standard in the yyyy-MM-ddTHH:mm:ssZ format. If the command has not started to execute, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-10T08:49:24Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CommandInvocationResultModel build() {
                return new CommandInvocationResultModel(this);
            } 

        } 

    }
}
