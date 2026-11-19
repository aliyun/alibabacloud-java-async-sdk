// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListMemoriesRequest} extends {@link RequestModel}
 *
 * <p>ListMemoriesRequest</p>
 */
public class ListMemoriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamId")
    private String teamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private String types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updatedAtFrom")
    private String updatedAtFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updatedAtTo")
    private String updatedAtTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("valid")
    private Boolean valid;

    private ListMemoriesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.agentId = builder.agentId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sessionId = builder.sessionId;
        this.source = builder.source;
        this.teamId = builder.teamId;
        this.types = builder.types;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
        this.userId = builder.userId;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return teamId
     */
    public String getTeamId() {
        return this.teamId;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return updatedAtFrom
     */
    public String getUpdatedAtFrom() {
        return this.updatedAtFrom;
    }

    /**
     * @return updatedAtTo
     */
    public String getUpdatedAtTo() {
        return this.updatedAtTo;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return this.valid;
    }

    public static final class Builder extends Request.Builder<ListMemoriesRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private String agentId; 
        private Integer maxResults; 
        private String nextToken; 
        private String sessionId; 
        private String source; 
        private String teamId; 
        private String types; 
        private String updatedAtFrom; 
        private String updatedAtTo; 
        private String userId; 
        private Boolean valid; 

        private Builder() {
            super();
        } 

        private Builder(ListMemoriesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.agentId = request.agentId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sessionId = request.sessionId;
            this.source = request.source;
            this.teamId = request.teamId;
            this.types = request.types;
            this.updatedAtFrom = request.updatedAtFrom;
            this.updatedAtTo = request.updatedAtTo;
            this.userId = request.userId;
            this.valid = request.valid;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>The agent ID. If not specified, all agents are matched. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*).</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The maximum number of records per page. Default value: 50. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjEwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The session ID. If not specified, all sessions are matched. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*).</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The source of the memory. Valid values:</p>
         * <ul>
         * <li>session_extraction: Extracted from session events.</li>
         * <li>content_extraction: Extracted from text or messages.</li>
         * <li>direct: Written directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>session_extraction</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The business team ID defined by the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        public Builder teamId(String teamId) {
            this.putQueryParameter("teamId", teamId);
            this.teamId = teamId;
            return this;
        }

        /**
         * <p>The memory content types. Specify the value as a JSON array string, such as [&quot;skill&quot;]. Valid values: semantic, skill, user_profile, and session_summary. If this parameter is omitted or set to [], all types are queried. The value auto is not supported. Keep the filter conditions consistent when you retrieve subsequent pages.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;semantic&quot;]</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("types", types);
            this.types = types;
            return this;
        }

        /**
         * <p>The start time for filtering by update time. The time must be in RFC 3339 format with a time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            this.putQueryParameter("updatedAtFrom", updatedAtFrom);
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * <p>The end time for filtering by update time. The time must be in RFC 3339 format with a time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-24T10:00:00Z</p>
         */
        public Builder updatedAtTo(String updatedAtTo) {
            this.putQueryParameter("updatedAtTo", updatedAtTo);
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * <p>The user ID. If not specified, all users are matched. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*).</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>Specifies whether the memory is valid. Default value: true. If this parameter is omitted, only valid records are returned. If set to false, revoked records are returned.</p>
         */
        public Builder valid(Boolean valid) {
            this.putQueryParameter("valid", valid);
            this.valid = valid;
            return this;
        }

        @Override
        public ListMemoriesRequest build() {
            return new ListMemoriesRequest(this);
        } 

    } 

}
