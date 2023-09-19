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

        private Builder(GetSecretParametersByPathRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.path = request.path;
            this.recursive = request.recursive;
            this.regionId = request.regionId;
            this.withDecryption = request.withDecryption;
        } 

        /**
         * The number of entries per page. Valid values: 1 to 10. Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The path of the encryption parameter. The path must be 1 to 200 characters in length. For example, if the name of an encryption parameter is /secretParameter/mySecretParameter, the path of the encryption parameter is /secretParameter.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * Specifies whether to recursively query encryption parameters from all levels of directories in the specified path. Valid values: true and false. For example, if you want to query the /secretParameter/mySecretParameter and /secretParameter/secretParameter 1/mySecretParameter parameters, the valid values specify the parameters to be returned.
         * <p>
         * 
         * *   true: returns both of the /secretParameter/mySecretParameter and /secretParameter/secretParameter1/mySecretParameter parameters.
         * *   false: returns only the /secretParameter/mySecretParameter parameter.
         */
        public Builder recursive(Boolean recursive) {
            this.putQueryParameter("Recursive", recursive);
            this.recursive = recursive;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to decrypt the parameter value. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
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
