// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FilterUsersRequest} extends {@link RequestModel}
 *
 * <p>FilterUsersRequest</p>
 */
public class FilterUsersRequest extends Request {
    @Query
    @NameInMap("ExcludeEndUserIds")
    private java.util.List < String > excludeEndUserIds;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("IncludeDesktopCount")
    private Boolean includeDesktopCount;

    @Query
    @NameInMap("IncludeDesktopGroupCount")
    private Boolean includeDesktopGroupCount;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 200, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderParam")
    private OrderParam orderParam;

    @Query
    @NameInMap("OrgId")
    private String orgId;

    @Query
    @NameInMap("OwnerType")
    private String ownerType;

    @Query
    @NameInMap("PropertyFilterParam")
    private java.util.List < PropertyFilterParam> propertyFilterParam;

    @Query
    @NameInMap("PropertyKeyValueFilterParam")
    private java.util.List < PropertyKeyValueFilterParam> propertyKeyValueFilterParam;

    private FilterUsersRequest(Builder builder) {
        super(builder);
        this.excludeEndUserIds = builder.excludeEndUserIds;
        this.filter = builder.filter;
        this.includeDesktopCount = builder.includeDesktopCount;
        this.includeDesktopGroupCount = builder.includeDesktopGroupCount;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderParam = builder.orderParam;
        this.orgId = builder.orgId;
        this.ownerType = builder.ownerType;
        this.propertyFilterParam = builder.propertyFilterParam;
        this.propertyKeyValueFilterParam = builder.propertyKeyValueFilterParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilterUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeEndUserIds
     */
    public java.util.List < String > getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return includeDesktopCount
     */
    public Boolean getIncludeDesktopCount() {
        return this.includeDesktopCount;
    }

    /**
     * @return includeDesktopGroupCount
     */
    public Boolean getIncludeDesktopGroupCount() {
        return this.includeDesktopGroupCount;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderParam
     */
    public OrderParam getOrderParam() {
        return this.orderParam;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return propertyFilterParam
     */
    public java.util.List < PropertyFilterParam> getPropertyFilterParam() {
        return this.propertyFilterParam;
    }

    /**
     * @return propertyKeyValueFilterParam
     */
    public java.util.List < PropertyKeyValueFilterParam> getPropertyKeyValueFilterParam() {
        return this.propertyKeyValueFilterParam;
    }

    public static final class Builder extends Request.Builder<FilterUsersRequest, Builder> {
        private java.util.List < String > excludeEndUserIds; 
        private String filter; 
        private Boolean includeDesktopCount; 
        private Boolean includeDesktopGroupCount; 
        private Long maxResults; 
        private String nextToken; 
        private OrderParam orderParam; 
        private String orgId; 
        private String ownerType; 
        private java.util.List < PropertyFilterParam> propertyFilterParam; 
        private java.util.List < PropertyKeyValueFilterParam> propertyKeyValueFilterParam; 

        private Builder() {
            super();
        } 

        private Builder(FilterUsersRequest request) {
            super(request);
            this.excludeEndUserIds = request.excludeEndUserIds;
            this.filter = request.filter;
            this.includeDesktopCount = request.includeDesktopCount;
            this.includeDesktopGroupCount = request.includeDesktopGroupCount;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderParam = request.orderParam;
            this.orgId = request.orgId;
            this.ownerType = request.ownerType;
            this.propertyFilterParam = request.propertyFilterParam;
            this.propertyKeyValueFilterParam = request.propertyKeyValueFilterParam;
        } 

        /**
         * The IDs of excluded users.
         */
        public Builder excludeEndUserIds(java.util.List < String > excludeEndUserIds) {
            this.putQueryParameter("ExcludeEndUserIds", excludeEndUserIds);
            this.excludeEndUserIds = excludeEndUserIds;
            return this;
        }

        /**
         * The string that you enter for a fuzzy search. You can enter a string to match the username or email address.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * Specifies whether to return information about cloud desktops that are assigned to the convenience user.
         */
        public Builder includeDesktopCount(Boolean includeDesktopCount) {
            this.putQueryParameter("IncludeDesktopCount", includeDesktopCount);
            this.includeDesktopCount = includeDesktopCount;
            return this;
        }

        /**
         * Specifies whether to return the number of desktop groups that are assigned to the user.
         */
        public Builder includeDesktopGroupCount(Boolean includeDesktopGroupCount) {
            this.putQueryParameter("IncludeDesktopGroupCount", includeDesktopGroupCount);
            this.includeDesktopGroupCount = includeDesktopGroupCount;
            return this;
        }

        /**
         * The number of entries to return on each page. If you set this parameter to a value greater than 100, the system resets the value to 100.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. You do not need to configure this parameter if you call this operation for the first time. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to perform the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The parameter that is supported to sort query results.
         */
        public Builder orderParam(OrderParam orderParam) {
            String orderParamShrink = shrink(orderParam, "OrderParam", "json");
            this.putQueryParameter("OrderParam", orderParamShrink);
            this.orderParam = orderParam;
            return this;
        }

        /**
         * The ID of the organization.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * The type of the account ownership.
         */
        public Builder ownerType(String ownerType) {
            this.putQueryParameter("OwnerType", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * Details of the user property that you want to perform fuzzy search.
         */
        public Builder propertyFilterParam(java.util.List < PropertyFilterParam> propertyFilterParam) {
            this.putQueryParameter("PropertyFilterParam", propertyFilterParam);
            this.propertyFilterParam = propertyFilterParam;
            return this;
        }

        /**
         * Details of the properties and property values.
         */
        public Builder propertyKeyValueFilterParam(java.util.List < PropertyKeyValueFilterParam> propertyKeyValueFilterParam) {
            this.putQueryParameter("PropertyKeyValueFilterParam", propertyKeyValueFilterParam);
            this.propertyKeyValueFilterParam = propertyKeyValueFilterParam;
            return this;
        }

        @Override
        public FilterUsersRequest build() {
            return new FilterUsersRequest(this);
        } 

    } 

    public static class OrderParam extends TeaModel {
        @NameInMap("OrderField")
        private String orderField;

        @NameInMap("OrderType")
        private String orderType;

        private OrderParam(Builder builder) {
            this.orderField = builder.orderField;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderParam create() {
            return builder().build();
        }

        /**
         * @return orderField
         */
        public String getOrderField() {
            return this.orderField;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private String orderField; 
            private String orderType; 

            /**
             * The method that you want to use to sort query results.
             */
            public Builder orderField(String orderField) {
                this.orderField = orderField;
                return this;
            }

            /**
             * Specifies whether to sort query results in ascending or descending order.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public OrderParam build() {
                return new OrderParam(this);
            } 

        } 

    }
    public static class PropertyFilterParam extends TeaModel {
        @NameInMap("PropertyId")
        private Long propertyId;

        @NameInMap("PropertyValueIds")
        private String propertyValueIds;

        private PropertyFilterParam(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyValueIds = builder.propertyValueIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyFilterParam create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyValueIds
         */
        public String getPropertyValueIds() {
            return this.propertyValueIds;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyValueIds; 

            /**
             * The ID of the property.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * The IDs of the property values.
             */
            public Builder propertyValueIds(String propertyValueIds) {
                this.propertyValueIds = propertyValueIds;
                return this;
            }

            public PropertyFilterParam build() {
                return new PropertyFilterParam(this);
            } 

        } 

    }
    public static class PropertyKeyValueFilterParam extends TeaModel {
        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyValues")
        private String propertyValues;

        private PropertyKeyValueFilterParam(Builder builder) {
            this.propertyKey = builder.propertyKey;
            this.propertyValues = builder.propertyValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyKeyValueFilterParam create() {
            return builder().build();
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyValues
         */
        public String getPropertyValues() {
            return this.propertyValues;
        }

        public static final class Builder {
            private String propertyKey; 
            private String propertyValues; 

            /**
             * The name of the property.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * The values of the property.
             */
            public Builder propertyValues(String propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            public PropertyKeyValueFilterParam build() {
                return new PropertyKeyValueFilterParam(this);
            } 

        } 

    }
}
