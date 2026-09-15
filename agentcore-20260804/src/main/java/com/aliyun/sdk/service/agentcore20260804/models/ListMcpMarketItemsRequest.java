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
 * {@link ListMcpMarketItemsRequest} extends {@link RequestModel}
 *
 * <p>ListMcpMarketItemsRequest</p>
 */
public class ListMcpMarketItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mcpType")
    private String mcpType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("officialTag")
    private String officialTag;

    private ListMcpMarketItemsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.mcpType = builder.mcpType;
        this.nextToken = builder.nextToken;
        this.officialTag = builder.officialTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpMarketItemsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mcpType
     */
    public String getMcpType() {
        return this.mcpType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officialTag
     */
    public String getOfficialTag() {
        return this.officialTag;
    }

    public static final class Builder extends Request.Builder<ListMcpMarketItemsRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String keyword; 
        private Integer maxResults; 
        private String mcpType; 
        private String nextToken; 
        private String officialTag; 

        private Builder() {
            super();
        } 

        private Builder(ListMcpMarketItemsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.mcpType = request.mcpType;
            this.nextToken = request.nextToken;
            this.officialTag = request.officialTag;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The keyword used to filter MCP marketplace templates.</p>
         * 
         * <strong>example:</strong>
         * <p>Knowledge</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of records to return in this query.</p>
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
         * <p>The MCP type.</p>
         * 
         * <strong>example:</strong>
         * <p>CODE_PACKAGE</p>
         */
        public Builder mcpType(String mcpType) {
            this.putQueryParameter("mcpType", mcpType);
            this.mcpType = mcpType;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The official usage tag.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE_BASE</p>
         */
        public Builder officialTag(String officialTag) {
            this.putQueryParameter("officialTag", officialTag);
            this.officialTag = officialTag;
            return this;
        }

        @Override
        public ListMcpMarketItemsRequest build() {
            return new ListMcpMarketItemsRequest(this);
        } 

    } 

}
