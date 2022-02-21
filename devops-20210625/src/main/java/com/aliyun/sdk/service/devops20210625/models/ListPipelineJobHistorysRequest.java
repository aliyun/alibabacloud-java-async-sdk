// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineJobHistorysRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineJobHistorysRequest</p>
 */
public class ListPipelineJobHistorysRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true, maxLength = 1000)
    private String pipelineId;

    @Query
    @NameInMap("category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("identifier")
    @Validation(required = true)
    private String identifier;

    @Query
    @NameInMap("maxResults")
    @Validation(required = true, maximum = 50)
    private Long maxResults;

    @Query
    @NameInMap("nextToken")
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

        private Builder(ListPipelineJobHistorysRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.pipelineId = response.pipelineId;
            this.category = response.category;
            this.identifier = response.identifier;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * maxResults.
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
