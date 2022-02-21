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
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("IncludeDesktopCount")
    private Boolean includeDesktopCount;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PropertyFilterParam")
    private java.util.List < PropertyFilterParam> propertyFilterParam;

    private FilterUsersRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.includeDesktopCount = builder.includeDesktopCount;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.propertyFilterParam = builder.propertyFilterParam;
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
     * @return propertyFilterParam
     */
    public java.util.List < PropertyFilterParam> getPropertyFilterParam() {
        return this.propertyFilterParam;
    }

    public static final class Builder extends Request.Builder<FilterUsersRequest, Builder> {
        private String filter; 
        private Boolean includeDesktopCount; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < PropertyFilterParam> propertyFilterParam; 

        private Builder() {
            super();
        } 

        private Builder(FilterUsersRequest response) {
            super(response);
            this.filter = response.filter;
            this.includeDesktopCount = response.includeDesktopCount;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.propertyFilterParam = response.propertyFilterParam;
        } 

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * IncludeDesktopCount.
         */
        public Builder includeDesktopCount(Boolean includeDesktopCount) {
            this.putQueryParameter("IncludeDesktopCount", includeDesktopCount);
            this.includeDesktopCount = includeDesktopCount;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
         * PropertyFilterParam.
         */
        public Builder propertyFilterParam(java.util.List < PropertyFilterParam> propertyFilterParam) {
            this.putQueryParameter("PropertyFilterParam", propertyFilterParam);
            this.propertyFilterParam = propertyFilterParam;
            return this;
        }

        @Override
        public FilterUsersRequest build() {
            return new FilterUsersRequest(this);
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
             * PropertyId.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * PropertyValueIds.
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
}
