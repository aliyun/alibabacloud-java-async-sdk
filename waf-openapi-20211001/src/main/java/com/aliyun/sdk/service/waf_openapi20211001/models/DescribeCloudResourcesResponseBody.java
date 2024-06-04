// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudResourcesResponseBody</p>
 */
public class DescribeCloudResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudResources")
    private java.util.List < CloudResources> cloudResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCloudResourcesResponseBody(Builder builder) {
        this.cloudResources = builder.cloudResources;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudResources
     */
    public java.util.List < CloudResources> getCloudResources() {
        return this.cloudResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CloudResources> cloudResources; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The cloud service resources that are added to WAF.
         */
        public Builder cloudResources(java.util.List < CloudResources> cloudResources) {
            this.cloudResources = cloudResources;
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
         * The total number of cloud service resources returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudResourcesResponseBody build() {
            return new DescribeCloudResourcesResponseBody(this);
        } 

    } 

    public static class CloudResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceDomain")
        private String resourceDomain;

        @com.aliyun.core.annotation.NameInMap("ResourceFunction")
        private String resourceFunction;

        @com.aliyun.core.annotation.NameInMap("ResourceInstance")
        private String resourceInstance;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceProduct")
        private String resourceProduct;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceRouteName")
        private String resourceRouteName;

        @com.aliyun.core.annotation.NameInMap("ResourceService")
        private String resourceService;

        private CloudResources(Builder builder) {
            this.ownerUserId = builder.ownerUserId;
            this.resourceDomain = builder.resourceDomain;
            this.resourceFunction = builder.resourceFunction;
            this.resourceInstance = builder.resourceInstance;
            this.resourceName = builder.resourceName;
            this.resourceProduct = builder.resourceProduct;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceRouteName = builder.resourceRouteName;
            this.resourceService = builder.resourceService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResources create() {
            return builder().build();
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return resourceDomain
         */
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        /**
         * @return resourceFunction
         */
        public String getResourceFunction() {
            return this.resourceFunction;
        }

        /**
         * @return resourceInstance
         */
        public String getResourceInstance() {
            return this.resourceInstance;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceProduct
         */
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceRouteName
         */
        public String getResourceRouteName() {
            return this.resourceRouteName;
        }

        /**
         * @return resourceService
         */
        public String getResourceService() {
            return this.resourceService;
        }

        public static final class Builder {
            private String ownerUserId; 
            private String resourceDomain; 
            private String resourceFunction; 
            private String resourceInstance; 
            private String resourceName; 
            private String resourceProduct; 
            private String resourceRegionId; 
            private String resourceRouteName; 
            private String resourceService; 

            /**
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * The domain name. This parameter has a value only if the value of ResourceProduct is fc or sae.
             */
            public Builder resourceDomain(String resourceDomain) {
                this.resourceDomain = resourceDomain;
                return this;
            }

            /**
             * The function name. This parameter has a value only if the value of ResourceProduct is fc.
             */
            public Builder resourceFunction(String resourceFunction) {
                this.resourceFunction = resourceFunction;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceInstance(String resourceInstance) {
                this.resourceInstance = resourceInstance;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The cloud service to which the resource belongs. Valid values:
             * <p>
             * 
             * *   **alb**: ALB.
             * *   **mse**: MSE.
             * *   **fc**: Function Compute.
             * *   **sae**: SAE.
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * The region ID of the resource.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * The route name. This parameter has a value only if the value of ResourceProduct is mse.
             */
            public Builder resourceRouteName(String resourceRouteName) {
                this.resourceRouteName = resourceRouteName;
                return this;
            }

            /**
             * The service name. This parameter has a value only if the value of ResourceProduct is fc.
             */
            public Builder resourceService(String resourceService) {
                this.resourceService = resourceService;
                return this;
            }

            public CloudResources build() {
                return new CloudResources(this);
            } 

        } 

    }
}
