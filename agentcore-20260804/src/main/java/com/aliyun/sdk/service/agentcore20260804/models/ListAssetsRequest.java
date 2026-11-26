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
 * {@link ListAssetsRequest} extends {@link RequestModel}
 *
 * <p>ListAssetsRequest</p>
 */
public class ListAssetsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileNamePrefix")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String fileNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListAssetsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.fileNamePrefix = builder.fileNamePrefix;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetsRequest create() {
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
     * @return fileNamePrefix
     */
    public String getFileNamePrefix() {
        return this.fileNamePrefix;
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

    public static final class Builder extends Request.Builder<ListAssetsRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String fileNamePrefix; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.fileNamePrefix = request.fileNamePrefix;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * <p>Magic parses the tenantId from the trusted gateway call identity and verifies workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. You cannot perform cross-tenant queries by using only the knowledgeBaseId.</p>
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
         * <p>The knowledge base whose assets are to be listed.</p>
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
         * <p>Filters assets by the original file name prefix. The maximum length is 255 characters. If this parameter is omitted or left empty, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>guide</p>
         */
        public Builder fileNamePrefix(String fileNamePrefix) {
            this.putQueryParameter("fileNamePrefix", fileNamePrefix);
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        /**
         * <p>The maximum number of assets to return per page. Maximum value: 100. If this parameter is omitted or set to 0, the default value 20 is used.</p>
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
         * <p>The opaque pagination token returned in the previous response. It is a composite cursor based on the upload time and assetId, and is bound to the resource scope and filter conditions. Do not specify this parameter for the first request. If you change the resource or filter conditions, start from the first page. Do not parse or modify the token. If a legacy or cross-scope token is used, an InvalidParameter error is returned. In this case, clear the token and query again. Overwrite uploads change the sorting position, so pagination does not guarantee consistent snapshots across pages.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-next-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters assets by their current processing status. If this parameter is omitted, no filtering is applied. Deleted assets are not included in the list. If you set this parameter to DELETED, an empty list is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAssetsRequest build() {
            return new ListAssetsRequest(this);
        } 

    } 

}
