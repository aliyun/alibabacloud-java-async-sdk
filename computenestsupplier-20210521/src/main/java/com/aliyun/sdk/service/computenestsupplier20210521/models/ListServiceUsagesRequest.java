// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceUsagesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceUsagesRequest</p>
 */
public class ListServiceUsagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierRole")
    private String supplierRole;

    private ListServiceUsagesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.supplierRole = builder.supplierRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceUsagesRequest create() {
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
     * @return supplierRole
     */
    public String getSupplierRole() {
        return this.supplierRole;
    }

    public static final class Builder extends Request.Builder<ListServiceUsagesRequest, Builder> {
        private java.util.List<Filter> filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String supplierRole; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceUsagesRequest request) {
            super(request);
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.supplierRole = request.supplierRole;
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The role of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplier</p>
         */
        public Builder supplierRole(String supplierRole) {
            this.putQueryParameter("SupplierRole", supplierRole);
            this.supplierRole = supplierRole;
            return this;
        }

        @Override
        public ListServiceUsagesRequest build() {
            return new ListServiceUsagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceUsagesRequest} extends {@link TeaModel}
     *
     * <p>ListServiceUsagesRequest</p>
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

            /**
             * <p>The parameter name of the filter. You can specify one or more filters. Valid values:</p>
             * <ul>
             * <li>ServiceId: the ID of the service.</li>
             * <li>ServiceName: the service name.</li>
             * <li>Status: the state of the service.</li>
             * <li>SupplierName: the name of the service provider.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ServiceId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter value N of the filter. Valid values of N: 1 to 10.</p>
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
}
