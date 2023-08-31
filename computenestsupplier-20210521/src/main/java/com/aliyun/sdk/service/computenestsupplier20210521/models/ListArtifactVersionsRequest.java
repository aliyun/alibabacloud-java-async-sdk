// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListArtifactVersionsRequest</p>
 */
public class ListArtifactVersionsRequest extends Request {
    @Query
    @NameInMap("ArtifactId")
    @Validation(required = true)
    private String artifactId;

    @Query
    @NameInMap("MaxResult")
    private Integer maxResult;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListArtifactVersionsRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return maxResult
     */
    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListArtifactVersionsRequest, Builder> {
        private String artifactId; 
        private Integer maxResult; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListArtifactVersionsRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
        } 

        /**
         * ArtifactId.
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * MaxResult.
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
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

        @Override
        public ListArtifactVersionsRequest build() {
            return new ListArtifactVersionsRequest(this);
        } 

    } 

}
