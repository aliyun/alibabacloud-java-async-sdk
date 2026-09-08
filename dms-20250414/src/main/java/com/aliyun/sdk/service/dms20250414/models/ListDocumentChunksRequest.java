// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDocumentChunksRequest} extends {@link RequestModel}
 *
 * <p>ListDocumentChunksRequest</p>
 */
public class ListDocumentChunksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkTitlePattern")
    private String chunkTitlePattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentName")
    private String documentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortFieldName")
    private String sortFieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    private ListDocumentChunksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chunkTitlePattern = builder.chunkTitlePattern;
        this.documentName = builder.documentName;
        this.kbUuid = builder.kbUuid;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sortFieldName = builder.sortFieldName;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentChunksRequest create() {
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
     * @return chunkTitlePattern
     */
    public String getChunkTitlePattern() {
        return this.chunkTitlePattern;
    }

    /**
     * @return documentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
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
     * @return sortFieldName
     */
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<ListDocumentChunksRequest, Builder> {
        private String regionId; 
        private String chunkTitlePattern; 
        private String documentName; 
        private String kbUuid; 
        private Integer maxResults; 
        private String nextToken; 
        private String sortFieldName; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListDocumentChunksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chunkTitlePattern = request.chunkTitlePattern;
            this.documentName = request.documentName;
            this.kbUuid = request.kbUuid;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sortFieldName = request.sortFieldName;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>A filter pattern. The operation returns only the chunks whose titles contain this pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder chunkTitlePattern(String chunkTitlePattern) {
            this.putBodyParameter("ChunkTitlePattern", chunkTitlePattern);
            this.chunkTitlePattern = chunkTitlePattern;
            return this;
        }

        /**
         * <p>The name of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>test.md</p>
         */
        public Builder documentName(String documentName) {
            this.putBodyParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putBodyParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 20.</p>
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
         * <p>The token used to retrieve the next page of results. Omit this parameter to get the first page. If the response returns a <code>NextToken</code>, it indicates that more results are available. To get the next page, pass this <code>NextToken</code> value in the <code>NextToken</code> parameter of your next request. A null value for NextToken indicates that all results have been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>zCXSmY0CJbybp6FZV7vo0Wjw64X-*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li><p><strong>id</strong> (default): The chunk ID.</p>
         * </li>
         * <li><p><strong>hits</strong>: The number of hits.</p>
         * </li>
         * <li><p><strong>modifyTime</strong>: The modification time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hits</p>
         */
        public Builder sortFieldName(String sortFieldName) {
            this.putBodyParameter("SortFieldName", sortFieldName);
            this.sortFieldName = sortFieldName;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><strong>ASC</strong> (default): ascending order.</p>
         * </li>
         * <li><p><strong>DESC</strong>: descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListDocumentChunksRequest build() {
            return new ListDocumentChunksRequest(this);
        } 

    } 

}
