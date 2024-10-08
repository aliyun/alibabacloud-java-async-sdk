// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchResourcesRequest} extends {@link RequestModel}
 *
 * <p>SearchResourcesRequest</p>
 */
public class SearchResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List < Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortCriterion")
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
         * <p>The filter conditions.</p>
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <p>If the total number of entries returned for the current request exceeds the value of the <code>MaxResults</code> parameter, the entries are truncated. In this case, you can use the <code>token</code> to initiate another request and obtain the remaining entries.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The method that is used to sort the entries returned.</p>
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

    /**
     * 
     * {@link SearchResourcesRequest} extends {@link TeaModel}
     *
     * <p>SearchResourcesRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the filter condition. For more information, see <code>Supported filter parameters</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching mode.</p>
             * <p>The value Equals indicates an equal match.</p>
             * 
             * <strong>example:</strong>
             * <p>Equals</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The values of the filter condition.</p>
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
    /**
     * 
     * {@link SearchResourcesRequest} extends {@link TeaModel}
     *
     * <p>SearchResourcesRequest</p>
     */
    public static class SortCriterion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Order")
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
             * <p>The attribute based on which the entries are sorted.</p>
             * <p>The value CreateTime indicates the creation time of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateTime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The order in which the entries are sorted. Valid values:</p>
             * <ul>
             * <li>ASC: The entries are sorted in ascending order. This value is the default value.</li>
             * <li>DESC: The entries are sorted in descending order.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASC</p>
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
