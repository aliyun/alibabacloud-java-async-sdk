// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcrImageTagsRequest} extends {@link RequestModel}
 *
 * <p>ListAcrImageTagsRequest</p>
 */
public class ListAcrImageTagsRequest extends Request {
    @Query
    @NameInMap("ArtifactType")
    private String artifactType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    private ListAcrImageTagsRequest(Builder builder) {
        super(builder);
        this.artifactType = builder.artifactType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAcrImageTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<ListAcrImageTagsRequest, Builder> {
        private String artifactType; 
        private Integer maxResults; 
        private String nextToken; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(ListAcrImageTagsRequest request) {
            super(request);
            this.artifactType = request.artifactType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.repoId = request.repoId;
        } 

        /**
         * ArtifactType.
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public ListAcrImageTagsRequest build() {
            return new ListAcrImageTagsRequest(this);
        } 

    } 

}
