// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceCountsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceCountsResponseBody</p>
 */
public class GetResourceCountsResponseBody extends TeaModel {
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

    @NameInMap("GroupByKey")
    private String groupByKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceCounts")
    private java.util.List < ResourceCounts> resourceCounts;

    private GetResourceCountsResponseBody(Builder builder) {
        this.filters = builder.filters;
        this.groupByKey = builder.groupByKey;
        this.requestId = builder.requestId;
        this.resourceCounts = builder.resourceCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceCountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return filters
     */
    public java.util.List < Filters> getFilters() {
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
    public java.util.List < ResourceCounts> getResourceCounts() {
        return this.resourceCounts;
    }

    public static final class Builder {
        private java.util.List < Filters> filters; 
        private String groupByKey; 
        private String requestId; 
        private java.util.List < ResourceCounts> resourceCounts; 

        /**
         * The filter conditions.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * The dimension by which resources are queried.
         */
        public Builder groupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The numbers of resources.
         */
        public Builder resourceCounts(java.util.List < ResourceCounts> resourceCounts) {
            this.resourceCounts = resourceCounts;
            return this;
        }

        public GetResourceCountsResponseBody build() {
            return new GetResourceCountsResponseBody(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > values; 

            /**
             * The key of the filter condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The values of the filter condition.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class ResourceCounts extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("GroupName")
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

            /**
             * The number of resources.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The group name.
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
