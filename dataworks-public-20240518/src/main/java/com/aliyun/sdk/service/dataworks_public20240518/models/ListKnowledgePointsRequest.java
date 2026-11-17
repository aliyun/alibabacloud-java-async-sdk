// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListKnowledgePointsRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgePointsRequest</p>
 */
public class ListKnowledgePointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 512)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 4096)
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String type;

    private ListKnowledgePointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgePointsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListKnowledgePointsRequest, Builder> {
        private String regionId; 
        private String knowledgeBaseId; 
        private Integer maxResults; 
        private String nextToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgePointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.type = request.type;
        } 

        /**
         * <p>服务地域 ID，应与调用 Endpoint 对应的地域一致。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-finance-1</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The stable ID of the target knowledge base. You can obtain the ID by calling the ListKnowledgeBases operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The maximum number of knowledge points to return per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination cursor. Do not specify this parameter for the first page. For subsequent pages, pass the NextToken value returned in the previous response as is, and keep the knowledge base, type, and page size unchanged. An empty cursor indicates that no more data is available. If the current page is empty but the cursor is not empty, continue querying.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The type of the knowledge point. Valid values:</p>
         * <ul>
         * <li>GRAPH: local graph entry.</li>
         * <li>WIKI: Wiki page.</li>
         * <li>KNOWLEDGE_CONTENT: knowledge content.
         * If you do not specify this parameter, knowledge points of all types are listed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListKnowledgePointsRequest build() {
            return new ListKnowledgePointsRequest(this);
        } 

    } 

}
