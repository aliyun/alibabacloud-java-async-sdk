// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link GetResourceCountsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceCountsRequest</p>
 */
public class GetResourceCountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupByKey")
    private String groupByKey;

    private GetResourceCountsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.groupByKey = builder.groupByKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceCountsRequest create() {
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
     * @return groupByKey
     */
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public static final class Builder extends Request.Builder<GetResourceCountsRequest, Builder> {
        private java.util.List<Filter> filter; 
        private String groupByKey; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceCountsRequest request) {
            super(request);
            this.filter = request.filter;
            this.groupByKey = request.groupByKey;
        } 

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The dimension by which resources are queried. Valid values:</p>
         * <ul>
         * <li>ResourceType</li>
         * <li>Region</li>
         * <li>ResourceGroupId</li>
         * <li>TagKey</li>
         * <li>TagValue</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceType</p>
         */
        public Builder groupByKey(String groupByKey) {
            this.putQueryParameter("GroupByKey", groupByKey);
            this.groupByKey = groupByKey;
            return this;
        }

        @Override
        public GetResourceCountsRequest build() {
            return new GetResourceCountsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceCountsRequest} extends {@link TeaModel}
     *
     * <p>GetResourceCountsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

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
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String matchType; 
            private java.util.List<String> value; 

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
