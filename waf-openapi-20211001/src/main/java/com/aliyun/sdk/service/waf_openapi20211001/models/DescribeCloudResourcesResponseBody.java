// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudResourcesResponseBody</p>
 */
public class DescribeCloudResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudResources")
    private java.util.List<CloudResources> cloudResources;

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
    public java.util.List<CloudResources> getCloudResources() {
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
        private java.util.List<CloudResources> cloudResources; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The cloud service resources that are added to WAF.</p>
         */
        public Builder cloudResources(java.util.List<CloudResources> cloudResources) {
            this.cloudResources = cloudResources;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C327F81A-CCE2-5B21-817C-F93E29C5****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of cloud service resources returned.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudResourcesResponseBody build() {
            return new DescribeCloudResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudResourcesResponseBody</p>
     */
    public static class CloudResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpPortCount")
        private Integer httpPortCount;

        @com.aliyun.core.annotation.NameInMap("HttpsPortCount")
        private Integer httpsPortCount;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceDomain")
        private String resourceDomain;

        @com.aliyun.core.annotation.NameInMap("ResourceFunction")
        private String resourceFunction;

        @com.aliyun.core.annotation.NameInMap("ResourceInstance")
        @Deprecated
        private String resourceInstance;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceIp")
        private String resourceInstanceIp;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        @Deprecated
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
            this.httpPortCount = builder.httpPortCount;
            this.httpsPortCount = builder.httpsPortCount;
            this.ownerUserId = builder.ownerUserId;
            this.resourceDomain = builder.resourceDomain;
            this.resourceFunction = builder.resourceFunction;
            this.resourceInstance = builder.resourceInstance;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceIp = builder.resourceInstanceIp;
            this.resourceInstanceName = builder.resourceInstanceName;
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
         * @return httpPortCount
         */
        public Integer getHttpPortCount() {
            return this.httpPortCount;
        }

        /**
         * @return httpsPortCount
         */
        public Integer getHttpsPortCount() {
            return this.httpsPortCount;
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
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceInstanceIp
         */
        public String getResourceInstanceIp() {
            return this.resourceInstanceIp;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
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
            private Integer httpPortCount; 
            private Integer httpsPortCount; 
            private String ownerUserId; 
            private String resourceDomain; 
            private String resourceFunction; 
            private String resourceInstance; 
            private String resourceInstanceId; 
            private String resourceInstanceIp; 
            private String resourceInstanceName; 
            private String resourceName; 
            private String resourceProduct; 
            private String resourceRegionId; 
            private String resourceRouteName; 
            private String resourceService; 

            /**
             * <p>The number of the HTTP ports that are added to WAF.</p>
             * <blockquote>
             * <p> This parameter is returned only if the cloud service is ECS or CLB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpPortCount(Integer httpPortCount) {
                this.httpPortCount = httpPortCount;
                return this;
            }

            /**
             * <p>The number of the HTTPS ports that are added to WAF.</p>
             * <blockquote>
             * <p> This parameter is returned only if the cloud service is ECS or CLB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpsPortCount(Integer httpsPortCount) {
                this.httpsPortCount = httpsPortCount;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>11769793******</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The domain name. This parameter has a value only if the value of ResourceProduct is fc or sae.</p>
             * 
             * <strong>example:</strong>
             * <p>test-resource-domain</p>
             */
            public Builder resourceDomain(String resourceDomain) {
                this.resourceDomain = resourceDomain;
                return this;
            }

            /**
             * <p>The function name. This parameter has a value only if the value of ResourceProduct is fc.</p>
             * 
             * <strong>example:</strong>
             * <p>test-resource-function</p>
             */
            public Builder resourceFunction(String resourceFunction) {
                this.resourceFunction = resourceFunction;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-ffff****</p>
             */
            public Builder resourceInstance(String resourceInstance) {
                this.resourceInstance = resourceInstance;
                return this;
            }

            /**
             * <p>The ID of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf60ub45fr9b***</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The IP address of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder resourceInstanceIp(String resourceInstanceIp) {
                this.resourceInstanceIp = resourceInstanceIp;
                return this;
            }

            /**
             * <p>The name of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test-resource-name</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The cloud service to which the resource belongs. Valid values:</p>
             * <ul>
             * <li><strong>alb</strong>: ALB.</li>
             * <li><strong>mse</strong>: MSE.</li>
             * <li><strong>fc</strong>: Function Compute.</li>
             * <li><strong>sae</strong>: SAE.</li>
             * <li><strong>ecs</strong>: ECS.</li>
             * <li><strong>clb4</strong>: Layer 4 CLB.</li>
             * <li><strong>clb7</strong>: Layer 7 CLB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alb</p>
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The route name. This parameter has a value only if the value of ResourceProduct is mse.</p>
             * 
             * <strong>example:</strong>
             * <p>test-route-name</p>
             */
            public Builder resourceRouteName(String resourceRouteName) {
                this.resourceRouteName = resourceRouteName;
                return this;
            }

            /**
             * <p>The service name. This parameter has a value only if the value of ResourceProduct is fc.</p>
             * 
             * <strong>example:</strong>
             * <p>test-resource-service</p>
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
