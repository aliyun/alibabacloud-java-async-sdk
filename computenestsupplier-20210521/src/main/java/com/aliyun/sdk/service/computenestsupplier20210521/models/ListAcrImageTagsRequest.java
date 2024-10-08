// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcrImageTagsRequest} extends {@link RequestModel}
 *
 * <p>ListAcrImageTagsRequest</p>
 */
public class ListAcrImageTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    private String artifactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
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
         * The type of the deployment package. Default value: AcrImage. Valid values:
         * <p>
         * 
         * *   HelmChart: Helm chart image.
         * *   AcrImage: container image.
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The image ID.
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
