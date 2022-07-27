// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretParameterVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListSecretParameterVersionsRequest</p>
 */
public class ListSecretParameterVersionsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 10)
    private Integer maxResults;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    @Query
    @NameInMap("WithDecryption")
    private Boolean withDecryption;

    private ListSecretParameterVersionsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.shareType = builder.shareType;
        this.withDecryption = builder.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretParameterVersionsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return withDecryption
     */
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

    public static final class Builder extends Request.Builder<ListSecretParameterVersionsRequest, Builder> {
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String regionId; 
        private String shareType; 
        private Boolean withDecryption; 

        private Builder() {
            super();
        } 

        private Builder(ListSecretParameterVersionsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.shareType = request.shareType;
            this.withDecryption = request.withDecryption;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
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
        public ListSecretParameterVersionsRequest build() {
            return new ListSecretParameterVersionsRequest(this);
        } 

    } 

}
