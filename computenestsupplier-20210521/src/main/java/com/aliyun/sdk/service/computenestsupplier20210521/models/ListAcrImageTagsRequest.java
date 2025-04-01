// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
         * <p>The type of the deployment package. Default value: AcrImage. Valid values:</p>
         * <ul>
         * <li>HelmChart: Helm chart image.</li>
         * <li>AcrImage: container image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AcrImage</p>
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-3gqhkza0wbxxxxxx</p>
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
