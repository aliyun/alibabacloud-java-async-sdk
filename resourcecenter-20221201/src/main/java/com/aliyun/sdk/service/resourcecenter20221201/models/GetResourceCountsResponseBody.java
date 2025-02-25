// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResourceCountsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceCountsResponseBody</p>
 */
public class GetResourceCountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List < Filters> filters;

    @com.aliyun.core.annotation.NameInMap("GroupByKey")
    private String groupByKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCounts")
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
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * <p>The dimension by which resources are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceType</p>
         */
        public Builder groupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D98D9B0-318D-56A4-910C-93B5F945AF2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The numbers of resources.</p>
         */
        public Builder resourceCounts(java.util.List < ResourceCounts> resourceCounts) {
            this.resourceCounts = resourceCounts;
            return this;
        }

        public GetResourceCountsResponseBody build() {
            return new GetResourceCountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceCountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceCountsResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * <p>The key of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The values of the filter condition.</p>
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
    /**
     * 
     * {@link GetResourceCountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceCountsResponseBody</p>
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

            /**
             * <p>The number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::NetworkInterface</p>
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
