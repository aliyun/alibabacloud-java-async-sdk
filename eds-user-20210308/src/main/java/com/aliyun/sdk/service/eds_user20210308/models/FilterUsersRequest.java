// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FilterUsersRequest} extends {@link RequestModel}
 *
 * <p>FilterUsersRequest</p>
 */
public class FilterUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeEndUserIds")
    private java.util.List < String > excludeEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDesktopCount")
    private Boolean includeDesktopCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDesktopGroupCount")
    private Boolean includeDesktopGroupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderParam")
    private OrderParam orderParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyFilterParam")
    private java.util.List < PropertyFilterParam> propertyFilterParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyKeyValueFilterParam")
    private java.util.List < PropertyKeyValueFilterParam> propertyKeyValueFilterParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

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
        this.status = builder.status;
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

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
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
        private Integer status; 

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
            this.status = request.status;
        } 

        /**
         * The list of usernames to be precisely excluded.
         */
        public Builder excludeEndUserIds(java.util.List < String > excludeEndUserIds) {
            this.putQueryParameter("ExcludeEndUserIds", excludeEndUserIds);
            this.excludeEndUserIds = excludeEndUserIds;
            return this;
        }

        /**
         * The string that is used for fuzzy search. You can use usernames and email addresses to perform fuzzy search. Wildcard characters (\*) are supported for this parameter. For example, if you set this parameter to a\*m, the usernames or an email addresses that start with a or end with m are returned.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * Specifies whether to return the number of cloud desktops that are assigned to the convenience user.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder includeDesktopCount(Boolean includeDesktopCount) {
            this.putQueryParameter("IncludeDesktopCount", includeDesktopCount);
            this.includeDesktopCount = includeDesktopCount;
            return this;
        }

        /**
         * Specifies whether to return the number of cloud desktop pools that are assigned to the convenience user.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder includeDesktopGroupCount(Boolean includeDesktopGroupCount) {
            this.putQueryParameter("IncludeDesktopGroupCount", includeDesktopGroupCount);
            this.includeDesktopGroupCount = includeDesktopGroupCount;
            return this;
        }

        /**
         * The number of entries per page. If you set this parameter to a value greater than 100, the system resets the value to 100.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The parameters that are used to sort query results.
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
         * The list of properties for fuzzy search.
         */
        public Builder propertyFilterParam(java.util.List < PropertyFilterParam> propertyFilterParam) {
            this.putQueryParameter("PropertyFilterParam", propertyFilterParam);
            this.propertyFilterParam = propertyFilterParam;
            return this;
        }

        /**
         * The list of property names and property values.
         */
        public Builder propertyKeyValueFilterParam(java.util.List < PropertyKeyValueFilterParam> propertyKeyValueFilterParam) {
            this.putQueryParameter("PropertyKeyValueFilterParam", propertyKeyValueFilterParam);
            this.propertyKeyValueFilterParam = propertyKeyValueFilterParam;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public FilterUsersRequest build() {
            return new FilterUsersRequest(this);
        } 

    } 

    public static class OrderParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderField")
        private String orderField;

        @com.aliyun.core.annotation.NameInMap("OrderType")
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
             * The parameter based on which to sort query results.
             * <p>
             * 
             * Valid values:
             * 
             * *   EndUserId: the username.
             * *   id: the ID of the user primary key.
             * *   gmt_created: the time when the convenience user was created.
             */
            public Builder orderField(String orderField) {
                this.orderField = orderField;
                return this;
            }

            /**
             * Specifies whether to sort query results in ascending or descending order.
             * <p>
             * 
             * Valid values:
             * 
             * *   ASC: ascending
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DESC (default): descending
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyValueIds")
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
        @com.aliyun.core.annotation.NameInMap("PropertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("PropertyValues")
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
             * The property name.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * The property values.
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
