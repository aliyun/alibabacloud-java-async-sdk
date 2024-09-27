// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAccountFactoryBaselineItemsRequest} extends {@link RequestModel}
 *
 * <p>ListAccountFactoryBaselineItemsRequest</p>
 */
public class ListAccountFactoryBaselineItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List < String > names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List < String > versions;

    private ListAccountFactoryBaselineItemsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.names = builder.names;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountFactoryBaselineItemsRequest create() {
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
     * @return names
     */
    public java.util.List < String > getNames() {
        return this.names;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return versions
     */
    public java.util.List < String > getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<ListAccountFactoryBaselineItemsRequest, Builder> {
        private Integer maxResults; 
        private java.util.List < String > names; 
        private String nextToken; 
        private String regionId; 
        private String type; 
        private java.util.List < String > versions; 

        private Builder() {
            super();
        } 

        private Builder(ListAccountFactoryBaselineItemsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.names = request.names;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.type = request.type;
            this.versions = request.versions;
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
         * Names.
         */
        public Builder names(java.util.List < String > names) {
            this.putQueryParameter("Names", names);
            this.names = names;
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
         * <p>RegionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Versions.
         */
        public Builder versions(java.util.List < String > versions) {
            this.putQueryParameter("Versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public ListAccountFactoryBaselineItemsRequest build() {
            return new ListAccountFactoryBaselineItemsRequest(this);
        } 

    } 

}
