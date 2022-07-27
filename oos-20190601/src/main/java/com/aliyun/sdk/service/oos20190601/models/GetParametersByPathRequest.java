// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParametersByPathRequest} extends {@link RequestModel}
 *
 * <p>GetParametersByPathRequest</p>
 */
public class GetParametersByPathRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("Recursive")
    private Boolean recursive;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetParametersByPathRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.path = builder.path;
        this.recursive = builder.recursive;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParametersByPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return recursive
     */
    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetParametersByPathRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String path; 
        private Boolean recursive; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetParametersByPathRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.path = request.path;
            this.recursive = request.recursive;
            this.regionId = request.regionId;
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
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * Recursive.
         */
        public Builder recursive(Boolean recursive) {
            this.putQueryParameter("Recursive", recursive);
            this.recursive = recursive;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetParametersByPathRequest build() {
            return new GetParametersByPathRequest(this);
        } 

    } 

}
