// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretParametersRequest} extends {@link RequestModel}
 *
 * <p>ListSecretParametersRequest</p>
 */
public class ListSecretParametersRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 10)
    private Integer maxResults;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("Recursive")
    private Boolean recursive;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SortField")
    private String sortField;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    private ListSecretParametersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.path = builder.path;
        this.recursive = builder.recursive;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretParametersRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListSecretParametersRequest, Builder> {
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String path; 
        private Boolean recursive; 
        private String regionId; 
        private String resourceGroupId; 
        private String sortField; 
        private String sortOrder; 
        private java.util.Map < String, ? > tags; 

        private Builder() {
            super();
        } 

        private Builder(ListSecretParametersRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.path = request.path;
            this.recursive = request.recursive;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.tags = request.tags;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListSecretParametersRequest build() {
            return new ListSecretParametersRequest(this);
        } 

    } 

}
