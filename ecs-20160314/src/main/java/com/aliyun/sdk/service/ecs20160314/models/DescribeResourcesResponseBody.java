// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcesResponseBody</p>
 */
public class DescribeResourcesResponseBody extends TeaModel {
    @NameInMap("EstimatedTotal")
    private Integer estimatedTotal;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private Resources resources;

    @NameInMap("Truncated")
    private Boolean truncated;

    private DescribeResourcesResponseBody(Builder builder) {
        this.estimatedTotal = builder.estimatedTotal;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.truncated = builder.truncated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return estimatedTotal
     */
    public Integer getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return truncated
     */
    public Boolean getTruncated() {
        return this.truncated;
    }

    public static final class Builder {
        private Integer estimatedTotal; 
        private String marker; 
        private String requestId; 
        private Resources resources; 
        private Boolean truncated; 

        /**
         * EstimatedTotal.
         */
        public Builder estimatedTotal(Integer estimatedTotal) {
            this.estimatedTotal = estimatedTotal;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
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
         * Resources.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Truncated.
         */
        public Builder truncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }

        public DescribeResourcesResponseBody build() {
            return new DescribeResourcesResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MatchedAttributes")
        private String matchedAttributes;

        @NameInMap("Product")
        private String product;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Resource(Builder builder) {
            this.arn = builder.arn;
            this.createTime = builder.createTime;
            this.matchedAttributes = builder.matchedAttributes;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return matchedAttributes
         */
        public String getMatchedAttributes() {
            return this.matchedAttributes;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String arn; 
            private String createTime; 
            private String matchedAttributes; 
            private String product; 
            private String regionId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String updateTime; 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MatchedAttributes.
             */
            public Builder matchedAttributes(String matchedAttributes) {
                this.matchedAttributes = matchedAttributes;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
