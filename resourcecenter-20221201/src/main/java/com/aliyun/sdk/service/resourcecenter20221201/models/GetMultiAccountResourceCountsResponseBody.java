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
 * {@link GetMultiAccountResourceCountsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceCountsResponseBody</p>
 */
public class GetMultiAccountResourceCountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.NameInMap("GroupByKey")
    private String groupByKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCounts")
    private java.util.List<ResourceCounts> resourceCounts;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private GetMultiAccountResourceCountsResponseBody(Builder builder) {
        this.filters = builder.filters;
        this.groupByKey = builder.groupByKey;
        this.requestId = builder.requestId;
        this.resourceCounts = builder.resourceCounts;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiAccountResourceCountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return groupByKey
     */
    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceCounts
     */
    public java.util.List<ResourceCounts> getResourceCounts() {
        return this.resourceCounts;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private java.util.List<Filters> filters; 
        private String groupByKey; 
        private String requestId; 
        private java.util.List<ResourceCounts> resourceCounts; 
        private String scope; 

        private Builder() {
        } 

        private Builder(GetMultiAccountResourceCountsResponseBody model) {
            this.filters = model.filters;
            this.groupByKey = model.groupByKey;
            this.requestId = model.requestId;
            this.resourceCounts = model.resourceCounts;
            this.scope = model.scope;
        } 

        /**
         * Filters.
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * GroupByKey.
         */
        public Builder groupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceCounts.
         */
        public Builder resourceCounts(java.util.List<ResourceCounts> resourceCounts) {
            this.resourceCounts = resourceCounts;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public GetMultiAccountResourceCountsResponseBody build() {
            return new GetMultiAccountResourceCountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiAccountResourceCountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiAccountResourceCountsResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMultiAccountResourceCountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiAccountResourceCountsResponseBody</p>
     */
    public static class ResourceCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private ResourceCounts(Builder builder) {
            this.count = builder.count;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCounts create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Long count; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(ResourceCounts model) {
                this.count = model.count;
                this.groupName = model.groupName;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public ResourceCounts build() {
                return new ResourceCounts(this);
            } 

        } 

    }
}
