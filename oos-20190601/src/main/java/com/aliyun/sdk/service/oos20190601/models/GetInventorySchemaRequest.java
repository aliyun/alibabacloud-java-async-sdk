// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventorySchemaRequest} extends {@link RequestModel}
 *
 * <p>GetInventorySchemaRequest</p>
 */
public class GetInventorySchemaRequest extends Request {
    @Query
    @NameInMap("Aggregator")
    private Boolean aggregator;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TypeName")
    private String typeName;

    private GetInventorySchemaRequest(Builder builder) {
        super(builder);
        this.aggregator = builder.aggregator;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.typeName = builder.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventorySchemaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregator
     */
    public Boolean getAggregator() {
        return this.aggregator;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    public static final class Builder extends Request.Builder<GetInventorySchemaRequest, Builder> {
        private Boolean aggregator; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String typeName; 

        private Builder() {
            super();
        } 

        private Builder(GetInventorySchemaRequest response) {
            super(response);
            this.aggregator = response.aggregator;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.typeName = response.typeName;
        } 

        /**
         * Aggregator.
         */
        public Builder aggregator(Boolean aggregator) {
            this.putQueryParameter("Aggregator", aggregator);
            this.aggregator = aggregator;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TypeName.
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        @Override
        public GetInventorySchemaRequest build() {
            return new GetInventorySchemaRequest(this);
        } 

    } 

}
