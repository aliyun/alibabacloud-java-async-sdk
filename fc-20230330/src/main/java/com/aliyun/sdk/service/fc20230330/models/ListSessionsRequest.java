// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListSessionsRequest</p>
 */
public class ListSessionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionStatus")
    private String sessionStatus;

    private ListSessionsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.qualifier = builder.qualifier;
        this.sessionId = builder.sessionId;
        this.sessionStatus = builder.sessionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionsRequest create() {
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public static final class Builder extends Request.Builder<ListSessionsRequest, Builder> {
        private String functionName; 
        private Integer limit; 
        private String nextToken; 
        private String qualifier; 
        private String sessionId; 
        private String sessionStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListSessionsRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.qualifier = request.qualifier;
            this.sessionId = request.sessionId;
            this.sessionStatus = request.sessionStatus;
        } 

        /**
         * <p>The function name.</p>
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
         * <p>The number of sessions to return. Default value: 20.</p>
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
         * <p>The pagination token.</p>
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
         * <p>The function alias or version information.</p>
         * 
         * <strong>example:</strong>
         * <p>aliasName1</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The session ID to filter by. If specified, all Active or Expired status information associated with this session is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test-session-id-1</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The session status to filter by. By default, all session information in Active or Expired status is returned. You can specify Active to retrieve only active session information, or specify Expired to retrieve only expired session information.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder sessionStatus(String sessionStatus) {
            this.putQueryParameter("sessionStatus", sessionStatus);
            this.sessionStatus = sessionStatus;
            return this;
        }

        @Override
        public ListSessionsRequest build() {
            return new ListSessionsRequest(this);
        } 

    } 

}
