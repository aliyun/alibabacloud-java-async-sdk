// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The function name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>Specifies whether to return input parameters of the asynchronous tasks. Valid values:</p>
         * <ul>
         * <li>true: returns the <code>invocationPayload</code> parameter in the response.</li>
         * <li>false: does not return the <code>invocationPayload</code> parameter in the response.</li>
         * </ul>
         * <blockquote>
         * <p> The <code>invocationPayload</code> parameter indicates the input parameters of an asynchronous task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includePayload(Boolean includePayload) {
            this.putQueryParameter("includePayload", includePayload);
            this.includePayload = includePayload;
            return this;
        }

        /**
         * <p>The number of asynchronous tasks to return. The default value is 20. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNCNhYmM=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID prefix of asynchronous tasks. If this parameter is specified, a list of asynchronous tasks whose IDs match the prefix is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>job-</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The order in which the returned asynchronous tasks are sorted.</p>
         * <ul>
         * <li>asc: in ascending order.</li>
         * <li>desc: in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortOrderByTime(String sortOrderByTime) {
            this.putQueryParameter("sortOrderByTime", sortOrderByTime);
            this.sortOrderByTime = sortOrderByTime;
            return this;
        }

        /**
         * <p>The start time of the period during which the asynchronous tasks are initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>1640966400000</p>
         */
        public Builder startedTimeBegin(Long startedTimeBegin) {
            this.putQueryParameter("startedTimeBegin", startedTimeBegin);
            this.startedTimeBegin = startedTimeBegin;
            return this;
        }

        /**
         * <p>The end time of the period during which the asynchronous tasks are initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>1640966400000</p>
         */
        public Builder startedTimeEnd(Long startedTimeEnd) {
            this.putQueryParameter("startedTimeEnd", startedTimeEnd);
            this.startedTimeEnd = startedTimeEnd;
            return this;
        }

        /**
         * <p>The state of asynchronous tasks. The following items list the states of an asynchronous task:</p>
         * <ul>
         * <li>Enqueued: The asynchronous invocation is enqueued and is waiting to be executed.</li>
         * <li>Succeeded: The invocation is successful.</li>
         * <li>Failed: The invocation fails.</li>
         * <li>Running: The invocation is being executed.</li>
         * <li>Stopped: The invocation is terminated.</li>
         * <li>Stopping: The invocation is being terminated.</li>
         * <li>Invalid: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.</li>
         * <li>Expired: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period has elapsed.</li>
         * <li>Retrying: The asynchronous invocation is being retried due to an execution error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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
