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
 * {@link ListAgentIMChannelsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentIMChannelsRequest</p>
 */
public class ListAgentIMChannelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListAgentIMChannelsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.channelType = builder.channelType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentIMChannelsRequest create() {
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
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAgentIMChannelsRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String channelType; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentIMChannelsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.channelType = request.channelType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The agent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The IM channel type. Valid values:</p>
         * <ul>
         * <li>DINGTALK: DingTalk.</li>
         * <li>FEISHU: Lark.</li>
         * <li>WECOM: WeCom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("channelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. You do not need to specify this parameter for the first request. For subsequent requests, use the nextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The IM channel status. Valid values:</p>
         * <ul>
         * <li>CREATING: being created.</li>
         * <li>READY: ready.</li>
         * <li>UPDATING: being updated.</li>
         * <li>FAILED: failed.</li>
         * <li>DELETING: being deleted.</li>
         * <li>DELETE_FAILED: deletion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAgentIMChannelsRequest build() {
            return new ListAgentIMChannelsRequest(this);
        } 

    } 

}
