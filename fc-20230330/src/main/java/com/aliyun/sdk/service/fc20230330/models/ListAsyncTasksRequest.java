// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsyncTasksRequest} extends {@link RequestModel}
 *
 * <p>ListAsyncTasksRequest</p>
 */
public class ListAsyncTasksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includePayload")
    private Boolean includePayload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sortOrderByTime")
    private String sortOrderByTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startedTimeBegin")
    private Long startedTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startedTimeEnd")
    private Long startedTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListAsyncTasksRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.includePayload = builder.includePayload;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
        this.qualifier = builder.qualifier;
        this.sortOrderByTime = builder.sortOrderByTime;
        this.startedTimeBegin = builder.startedTimeBegin;
        this.startedTimeEnd = builder.startedTimeEnd;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return includePayload
     */
    public Boolean getIncludePayload() {
        return this.includePayload;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sortOrderByTime
     */
    public String getSortOrderByTime() {
        return this.sortOrderByTime;
    }

    /**
     * @return startedTimeBegin
     */
    public Long getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    /**
     * @return startedTimeEnd
     */
    public Long getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAsyncTasksRequest, Builder> {
        private String functionName; 
        private Boolean includePayload; 
        private Integer limit; 
        private String nextToken; 
        private String prefix; 
        private String qualifier; 
        private String sortOrderByTime; 
        private Long startedTimeBegin; 
        private Long startedTimeEnd; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAsyncTasksRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.includePayload = request.includePayload;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.prefix = request.prefix;
            this.qualifier = request.qualifier;
            this.sortOrderByTime = request.sortOrderByTime;
            this.startedTimeBegin = request.startedTimeBegin;
            this.startedTimeEnd = request.startedTimeEnd;
            this.status = request.status;
        } 

        /**
         * The function name.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * Specifies whether to return input parameters of the asynchronous tasks. Valid values:
         * <p>
         * 
         * *   true: returns the `invocationPayload` parameter in the response.
         * *   false: does not return the `invocationPayload` parameter in the response.
         * 
         * >  The `invocationPayload` parameter indicates the input parameters of an asynchronous task.
         */
        public Builder includePayload(Boolean includePayload) {
            this.putQueryParameter("includePayload", includePayload);
            this.includePayload = includePayload;
            return this;
        }

        /**
         * The number of asynchronous tasks to return. Valid values: \[1,100]. Default value: 50.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID prefix of asynchronous tasks. If this parameter is specified, a list of asynchronous tasks whose IDs match the prefix is returned.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The version or alias of the function.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * The order in which the returned asynchronous tasks are sorted.
         * <p>
         * 
         * *   asc: in ascending order.
         * *   desc: in descending order.
         */
        public Builder sortOrderByTime(String sortOrderByTime) {
            this.putQueryParameter("sortOrderByTime", sortOrderByTime);
            this.sortOrderByTime = sortOrderByTime;
            return this;
        }

        /**
         * The start time of the period during which the asynchronous tasks are initiated.
         */
        public Builder startedTimeBegin(Long startedTimeBegin) {
            this.putQueryParameter("startedTimeBegin", startedTimeBegin);
            this.startedTimeBegin = startedTimeBegin;
            return this;
        }

        /**
         * The end time of the period during which the asynchronous tasks are initiated.
         */
        public Builder startedTimeEnd(Long startedTimeEnd) {
            this.putQueryParameter("startedTimeEnd", startedTimeEnd);
            this.startedTimeEnd = startedTimeEnd;
            return this;
        }

        /**
         * The state of asynchronous tasks. The following items list the states of an asynchronous task:
         * <p>
         * 
         * *   Enqueued: The asynchronous invocation is enqueued and is waiting to be executed.
         * *   Succeeded: The invocation is successful.
         * *   Failed: The invocation fails.
         * *   Running: The invocation is being executed.
         * *   Stopped: The invocation is terminated.
         * *   Stopping: The invocation is being terminated.
         * *   Invalid: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.
         * *   Expired: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period has elapsed.
         * *   Retrying: The asynchronous invocation is being retried due to an execution error.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAsyncTasksRequest build() {
            return new ListAsyncTasksRequest(this);
        } 

    } 

}
