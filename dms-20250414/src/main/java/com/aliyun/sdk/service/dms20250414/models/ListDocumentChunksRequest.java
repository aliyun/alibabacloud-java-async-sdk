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
         * ChunkTitlePattern.
         */
        public Builder chunkTitlePattern(String chunkTitlePattern) {
            this.putBodyParameter("ChunkTitlePattern", chunkTitlePattern);
            this.chunkTitlePattern = chunkTitlePattern;
            return this;
        }

        /**
         * DocumentName.
         */
        public Builder documentName(String documentName) {
            this.putBodyParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SortFieldName.
         */
        public Builder sortFieldName(String sortFieldName) {
            this.putBodyParameter("SortFieldName", sortFieldName);
            this.sortFieldName = sortFieldName;
            return this;
        }

        /**
         * SortOrder.
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
