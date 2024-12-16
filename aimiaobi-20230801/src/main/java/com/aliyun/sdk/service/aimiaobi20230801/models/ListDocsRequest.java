// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDocsRequest} extends {@link RequestModel}
 *
 * <p>ListDocsRequest</p>
 */
public class ListDocsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < Integer > statuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDocsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.docName = builder.docName;
        this.docType = builder.docType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
        this.statuses = builder.statuses;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocsRequest create() {
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
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
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
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return statuses
     */
    public java.util.List < Integer > getStatuses() {
        return this.statuses;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDocsRequest, Builder> {
        private String regionId; 
        private String categoryId; 
        private String docName; 
        private String docType; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 
        private java.util.List < Integer > statuses; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDocsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.docName = request.docName;
            this.docType = request.docType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
            this.statuses = request.statuses;
            this.workspaceId = request.workspaceId;
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
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * DocName.
         */
        public Builder docName(String docName) {
            this.putBodyParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
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
         * Skip.
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List < Integer > statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putBodyParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDocsRequest build() {
            return new ListDocsRequest(this);
        } 

    } 

}
