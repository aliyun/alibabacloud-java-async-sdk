// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceCountsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceCountsRequest</p>
 */
public class GetResourceCountsRequest extends Request {
    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("GroupByKey")
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
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return groupByKey
     */
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public static final class Builder extends Request.Builder<GetResourceCountsRequest, Builder> {
        private java.util.List < Filter> filter; 
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
         * The filter conditions.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The dimension by which resources are queried. Valid values:
         * <p>
         * 
         * *   ResourceType
         * *   Region
         * *   ResourceGroupId
         * *   TagKey
         * *   TagValue
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
             * The key of the filter condition. For more information, see `Supported filter parameters`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching mode.
             * <p>
             * 
             * The value Equals indicates an equal match.
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
}
