// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListPipelineJobHistorysRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineJobHistorysRequest</p>
 */
public class ListPipelineJobHistorysRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1000)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListPipelineJobHistorysRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.category = builder.category;
        this.identifier = builder.identifier;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineJobHistorysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListPipelineJobHistorysRequest, Builder> {
        private String organizationId; 
        private String pipelineId; 
        private String category; 
        private String identifier; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineJobHistorysRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.category = request.category;
            this.identifier = request.identifier;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOY</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10_ssasasa</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListPipelineJobHistorysRequest build() {
            return new ListPipelineJobHistorysRequest(this);
        } 

    } 

}
