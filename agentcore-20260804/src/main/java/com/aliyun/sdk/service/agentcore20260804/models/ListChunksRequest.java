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
 * {@link ListChunksRequest} extends {@link RequestModel}
 *
 * <p>ListChunksRequest</p>
 */
public class ListChunksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("assetId")
    private String assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListChunksRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
        this.enabled = builder.enabled;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChunksRequest create() {
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
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListChunksRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 
        private Boolean enabled; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListChunksRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
            this.enabled = request.enabled;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The workspace ID. Magic resolves the tenant ID from the trusted gateway call identity to verify workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. Cross-tenant queries are not supported by using only the knowledgeBaseId.</p>
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
         * <p>The unique identifier of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-2f5f9c5a8d0e4c3b</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The asset ID. This parameter is optional. If specified, only chunks in the current published generation of the asset are queried. If omitted, the entire knowledge base is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>asset-001</p>
         */
        public Builder assetId(String assetId) {
            this.putQueryParameter("assetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>Specifies whether to filter by enabled status. Valid values:</p>
         * <ul>
         * <li>true: Queries only enabled chunks.</li>
         * <li>false: Queries only disabled chunks.
         * If this parameter is omitted, chunks are not filtered by enabled status.</li>
         * </ul>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The keyword used to filter chunk content. The maximum length is 1,024 characters. This parameter is allowed only when assetId is specified. Otherwise, an InvalidParameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Product documentation</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page. Valid values: 0 to 100. If this parameter is omitted or set to 0, the default value 20 is used.</p>
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
         * <p>The token returned in the previous response for pagination. The token is bound to the tenant, workspace, knowledge base, filter conditions, and sorting, and cannot be reused across different scopes. If assetId is specified, the token is also bound to the current publish result. A VersionConflict (409) error is returned if the publish result changes. Cross-asset pagination is sorted by assetId and chunkSeq, and a full-base snapshot is not guaranteed.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-next-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListChunksRequest build() {
            return new ListChunksRequest(this);
        } 

    } 

}
