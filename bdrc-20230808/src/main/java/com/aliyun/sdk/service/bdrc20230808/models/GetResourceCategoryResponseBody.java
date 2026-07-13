// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link GetResourceCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceCategoryResponseBody</p>
 */
public class GetResourceCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceCategoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceCategoryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceCategoryResponseBody build() {
            return new GetResourceCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceCategoryResponseBody</p>
     */
    public static class ResourceCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceCount(Builder builder) {
            this.count = builder.count;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long count; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceCount model) {
                this.count = model.count;
                this.resourceType = model.resourceType;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceCount build() {
                return new ResourceCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceCategoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
        private String resourceCategoryId;

        @com.aliyun.core.annotation.NameInMap("ResourceCategoryName")
        private String resourceCategoryName;

        @com.aliyun.core.annotation.NameInMap("ResourceCategoryType")
        private String resourceCategoryType;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private java.util.List<ResourceCount> resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceMatcher")
        private String resourceMatcher;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Data(Builder builder) {
            this.productType = builder.productType;
            this.resourceCategoryId = builder.resourceCategoryId;
            this.resourceCategoryName = builder.resourceCategoryName;
            this.resourceCategoryType = builder.resourceCategoryType;
            this.resourceCount = builder.resourceCount;
            this.resourceMatcher = builder.resourceMatcher;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return resourceCategoryId
         */
        public String getResourceCategoryId() {
            return this.resourceCategoryId;
        }

        /**
         * @return resourceCategoryName
         */
        public String getResourceCategoryName() {
            return this.resourceCategoryName;
        }

        /**
         * @return resourceCategoryType
         */
        public String getResourceCategoryType() {
            return this.resourceCategoryType;
        }

        /**
         * @return resourceCount
         */
        public java.util.List<ResourceCount> getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceMatcher
         */
        public String getResourceMatcher() {
            return this.resourceMatcher;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String productType; 
            private String resourceCategoryId; 
            private String resourceCategoryName; 
            private String resourceCategoryType; 
            private java.util.List<ResourceCount> resourceCount; 
            private String resourceMatcher; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.productType = model.productType;
                this.resourceCategoryId = model.resourceCategoryId;
                this.resourceCategoryName = model.resourceCategoryName;
                this.resourceCategoryType = model.resourceCategoryType;
                this.resourceCount = model.resourceCount;
                this.resourceMatcher = model.resourceMatcher;
                this.resourceType = model.resourceType;
            } 

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * ResourceCategoryId.
             */
            public Builder resourceCategoryId(String resourceCategoryId) {
                this.resourceCategoryId = resourceCategoryId;
                return this;
            }

            /**
             * ResourceCategoryName.
             */
            public Builder resourceCategoryName(String resourceCategoryName) {
                this.resourceCategoryName = resourceCategoryName;
                return this;
            }

            /**
             * ResourceCategoryType.
             */
            public Builder resourceCategoryType(String resourceCategoryType) {
                this.resourceCategoryType = resourceCategoryType;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(java.util.List<ResourceCount> resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * ResourceMatcher.
             */
            public Builder resourceMatcher(String resourceMatcher) {
                this.resourceMatcher = resourceMatcher;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
