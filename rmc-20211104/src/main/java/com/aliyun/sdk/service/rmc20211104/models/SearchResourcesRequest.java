// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rmc20211104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchResourcesRequest} extends {@link RequestModel}
 *
 * <p>SearchResourcesRequest</p>
 */
public class SearchResourcesRequest extends Request {
    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SortCriterion")
    private SortCriterion sortCriterion;

    private SearchResourcesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.sortCriterion = builder.sortCriterion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sortCriterion
     */
    public SortCriterion getSortCriterion() {
        return this.sortCriterion;
    }

    public static final class Builder extends Request.Builder<SearchResourcesRequest, Builder> {
        private java.util.List < Filter> filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private SortCriterion sortCriterion; 

        private Builder() {
            super();
        } 

        private Builder(SearchResourcesRequest request) {
            super(request);
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.sortCriterion = request.sortCriterion;
        } 

        /**
         * The filter conditions.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to initiate the next request.
         * <p>
         * 
         * If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the token to initiate another request and obtain the remaining entries.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The method that is used to sort the entries.
         */
        public Builder sortCriterion(SortCriterion sortCriterion) {
            this.putQueryParameter("SortCriterion", sortCriterion);
            this.sortCriterion = sortCriterion;
            return this;
        }

        @Override
        public SearchResourcesRequest build() {
            return new SearchResourcesRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("MatchType")
        private String matchType;

        @NameInMap("Value")
        private java.util.List < String > value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.matchType = builder.matchType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return value
         */
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String matchType; 
            private java.util.List < String > value; 

            /**
             * The key of the filter condition. Valid values:
             * <p>
             * 
             * *   ResourceType: resource type
             * *   RegionId: region ID
             * *   ResourceId: resource ID
             * *   ResourceGroupId: resource group ID
             * *   ResourceName: resource name
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching method. Set the value to Equals. This value indicates that resources that match the filter conditions are queried.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * The values of the filter condition.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class SortCriterion extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Order")
        private String order;

        private SortCriterion(Builder builder) {
            this.key = builder.key;
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortCriterion create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        public static final class Builder {
            private String key; 
            private String order; 

            /**
             * The attribute based on which the entries are sorted.
             * <p>
             * 
             * The value `CreateTime` indicates the creation time of resources.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The order in which the entries are sorted. Valid values:
             * <p>
             * 
             * *   ASC: The entries are sorted in ascending order. This value is the default value.
             * *   DESC: The entries are sorted in descending order.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            public SortCriterion build() {
                return new SortCriterion(this);
            } 

        } 

    }
}
