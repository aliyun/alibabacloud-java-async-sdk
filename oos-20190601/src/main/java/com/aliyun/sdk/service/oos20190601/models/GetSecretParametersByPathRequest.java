// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParametersByPathRequest} extends {@link RequestModel}
 *
 * <p>GetSecretParametersByPathRequest</p>
 */
public class GetSecretParametersByPathRequest extends Request {
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

    @Query
    @NameInMap("WithDecryption")
    private Boolean withDecryption;

    private GetSecretParametersByPathRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.path = builder.path;
        this.recursive = builder.recursive;
        this.regionId = builder.regionId;
        this.withDecryption = builder.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretParametersByPathRequest create() {
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

    /**
     * @return withDecryption
     */
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

    public static final class Builder extends Request.Builder<GetSecretParametersByPathRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String path; 
        private Boolean recursive; 
        private String regionId; 
        private Boolean withDecryption; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretParametersByPathRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.path = response.path;
            this.recursive = response.recursive;
            this.regionId = response.regionId;
            this.withDecryption = response.withDecryption;
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

        /**
         * WithDecryption.
         */
        public Builder withDecryption(Boolean withDecryption) {
            this.putQueryParameter("WithDecryption", withDecryption);
            this.withDecryption = withDecryption;
            return this;
        }

        @Override
        public GetSecretParametersByPathRequest build() {
            return new GetSecretParametersByPathRequest(this);
        } 

    } 

}
