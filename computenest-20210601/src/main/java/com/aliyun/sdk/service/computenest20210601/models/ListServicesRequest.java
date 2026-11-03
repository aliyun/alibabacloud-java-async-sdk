// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListServicesRequest} extends {@link RequestModel}
 *
 * <p>ListServicesRequest</p>
 */
public class ListServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyKeyword")
    private String fuzzyKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InUsed")
    private Boolean inUsed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByType")
    private String orderByType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccessType")
    private String serviceAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListServicesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.fuzzyKeyword = builder.fuzzyKeyword;
        this.inUsed = builder.inUsed;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderByType = builder.orderByType;
        this.regionId = builder.regionId;
        this.serviceAccessType = builder.serviceAccessType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return fuzzyKeyword
     */
    public String getFuzzyKeyword() {
        return this.fuzzyKeyword;
    }

    /**
     * @return inUsed
     */
    public Boolean getInUsed() {
        return this.inUsed;
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
     * @return orderByType
     */
    public String getOrderByType() {
        return this.orderByType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceAccessType
     */
    public String getServiceAccessType() {
        return this.serviceAccessType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListServicesRequest, Builder> {
        private java.util.List<Filter> filter; 
        private String fuzzyKeyword; 
        private Boolean inUsed; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderByType; 
        private String regionId; 
        private String serviceAccessType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListServicesRequest request) {
            super(request);
            this.filter = request.filter;
            this.fuzzyKeyword = request.fuzzyKeyword;
            this.inUsed = request.inUsed;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderByType = request.orderByType;
            this.regionId = request.regionId;
            this.serviceAccessType = request.serviceAccessType;
            this.tag = request.tag;
        } 

        /**
         * <p>The filter.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The keyword for a fuzzy query.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder fuzzyKeyword(String fuzzyKeyword) {
            this.putQueryParameter("FuzzyKeyword", fuzzyKeyword);
            this.fuzzyKeyword = fuzzyKeyword;
            return this;
        }

        /**
         * <p>Specifies whether the service is in use. Valid values:</p>
         * <ul>
         * <li><p>false: The service is not in use.</p>
         * </li>
         * <li><p>true: The service is in use.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inUsed(Boolean inUsed) {
            this.putQueryParameter("InUsed", inUsed);
            this.inUsed = inUsed;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results. Set this to the NextToken value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sorting type for services.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateTime</p>
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The service access type.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder serviceAccessType(String serviceAccessType) {
            this.putQueryParameter("ServiceAccessType", serviceAccessType);
            this.serviceAccessType = serviceAccessType;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListServicesRequest build() {
            return new ListServicesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListServicesRequest} extends {@link TeaModel}
     *
     * <p>ListServicesRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The filter name. You can specify one or more filter names to query services. Valid values:</p>
             * <ul>
             * <li><p>ServiceId: The service ID.</p>
             * </li>
             * <li><p>Name: The service name.</p>
             * </li>
             * <li><p>Status: The service status.</p>
             * </li>
             * <li><p>SupplierName: The service provider name.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Status</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The filter values.</p>
             */
            public Builder value(java.util.List<String> value) {
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
     * {@link ListServicesRequest} extends {@link TeaModel}
     *
     * <p>ListServicesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
