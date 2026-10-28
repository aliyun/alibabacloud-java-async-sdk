// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link ListMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListMessagesRequest</p>
 */
public class ListMessagesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    private ListMessagesRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.runId = builder.runId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    public static final class Builder extends Request.Builder<ListMessagesRequest, Builder> {
        private String sessionId; 
        private String maxResults; 
        private String nextToken; 
        private String runId; 

        private Builder() {
            super();
        } 

        private Builder(ListMessagesRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.runId = request.runId;
        } 

        /**
         * <p>The ID of the session for which to query the message history.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The maximum number of timeline entries to return per page. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Do not specify this parameter for the first request. For subsequent requests, use the value returned from the previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>example-next-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters messages by the specified run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        public Builder runId(String runId) {
            this.putQueryParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        @Override
        public ListMessagesRequest build() {
            return new ListMessagesRequest(this);
        } 

    } 

}
