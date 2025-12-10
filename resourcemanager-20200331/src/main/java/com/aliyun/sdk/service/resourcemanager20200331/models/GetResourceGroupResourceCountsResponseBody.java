// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetResourceGroupResourceCountsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupResourceCountsResponseBody</p>
 */
public class GetResourceGroupResourceCountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCounts")
    private java.util.List<ResourceCounts> resourceCounts;

    private GetResourceGroupResourceCountsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceCounts = builder.resourceCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupResourceCountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceCounts> resourceCounts; 

        private Builder() {
        } 

        private Builder(GetResourceGroupResourceCountsResponseBody model) {
            this.requestId = model.requestId;
            this.resourceCounts = model.resourceCounts;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The numbers of the resources.</p>
         */
        public Builder resourceCounts(java.util.List<ResourceCounts> resourceCounts) {
            this.resourceCounts = resourceCounts;
            return this;
        }

        public GetResourceGroupResourceCountsResponseBody build() {
            return new GetResourceGroupResourceCountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupResourceCountsResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResourceCountsResponseBody</p>
     */
    public static class ResourceCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("GroupByKey")
        private String groupByKey;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private ResourceCounts(Builder builder) {
            this.count = builder.count;
            this.groupByKey = builder.groupByKey;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return groupByKey
         */
        public String getGroupByKey() {
            return this.groupByKey;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private Long count; 
            private String groupByKey; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(ResourceCounts model) {
                this.count = model.count;
                this.groupByKey = model.groupByKey;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The number of the resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The dimension by which resources are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceGroupId</p>
             */
            public Builder groupByKey(String groupByKey) {
                this.groupByKey = groupByKey;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-9gLOoK****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public ResourceCounts build() {
                return new ResourceCounts(this);
            } 

        } 

    }
}
