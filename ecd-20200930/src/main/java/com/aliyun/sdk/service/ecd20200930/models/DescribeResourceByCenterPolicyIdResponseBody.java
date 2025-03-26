// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeResourceByCenterPolicyIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceByCenterPolicyIdResponseBody</p>
 */
public class DescribeResourceByCenterPolicyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceModelList")
    private java.util.List<ResourceModelList> resourceModelList;

    private DescribeResourceByCenterPolicyIdResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceModelList = builder.resourceModelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceByCenterPolicyIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceModelList
     */
    public java.util.List<ResourceModelList> getResourceModelList() {
        return this.resourceModelList;
    }

    public static final class Builder {
        private String count; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ResourceModelList> resourceModelList; 

        private Builder() {
        } 

        private Builder(DescribeResourceByCenterPolicyIdResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resourceModelList = model.resourceModelList;
        } 

        /**
         * Count.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * ResourceModelList.
         */
        public Builder resourceModelList(java.util.List<ResourceModelList> resourceModelList) {
            this.resourceModelList = resourceModelList;
            return this;
        }

        public DescribeResourceByCenterPolicyIdResponseBody build() {
            return new DescribeResourceByCenterPolicyIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceByCenterPolicyIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceByCenterPolicyIdResponseBody</p>
     */
    public static class AppModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        private AppModelList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppModelList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 

            private Builder() {
            } 

            private Builder(AppModelList model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public AppModelList build() {
                return new AppModelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceByCenterPolicyIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceByCenterPolicyIdResponseBody</p>
     */
    public static class ResourceModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppModelList")
        private java.util.List<AppModelList> appModelList;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Double gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupRelCount")
        private Integer resourceGroupRelCount;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceModelList(Builder builder) {
            this.appModelList = builder.appModelList;
            this.cpu = builder.cpu;
            this.desktopType = builder.desktopType;
            this.gpuCount = builder.gpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.memory = builder.memory;
            this.osType = builder.osType;
            this.payType = builder.payType;
            this.productType = builder.productType;
            this.protocolType = builder.protocolType;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.resourceGroupRelCount = builder.resourceGroupRelCount;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceModelList create() {
            return builder().build();
        }

        /**
         * @return appModelList
         */
        public java.util.List<AppModelList> getAppModelList() {
            return this.appModelList;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return gpuCount
         */
        public Double getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return resourceGroupRelCount
         */
        public Integer getResourceGroupRelCount() {
            return this.resourceGroupRelCount;
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
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<AppModelList> appModelList; 
            private Integer cpu; 
            private String desktopType; 
            private Double gpuCount; 
            private String gpuSpec; 
            private Long memory; 
            private String osType; 
            private String payType; 
            private String productType; 
            private String protocolType; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private Integer resourceGroupRelCount; 
            private String resourceId; 
            private String resourceName; 
            private String resourceRegionId; 
            private String resourceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(ResourceModelList model) {
                this.appModelList = model.appModelList;
                this.cpu = model.cpu;
                this.desktopType = model.desktopType;
                this.gpuCount = model.gpuCount;
                this.gpuSpec = model.gpuSpec;
                this.memory = model.memory;
                this.osType = model.osType;
                this.payType = model.payType;
                this.productType = model.productType;
                this.protocolType = model.protocolType;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.resourceGroupRelCount = model.resourceGroupRelCount;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceType = model.resourceType;
                this.status = model.status;
            } 

            /**
             * AppModelList.
             */
            public Builder appModelList(java.util.List<AppModelList> appModelList) {
                this.appModelList = appModelList;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DesktopType.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * GpuCount.
             */
            public Builder gpuCount(Double gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * ResourceGroupRelCount.
             */
            public Builder resourceGroupRelCount(Integer resourceGroupRelCount) {
                this.resourceGroupRelCount = resourceGroupRelCount;
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
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceModelList build() {
                return new ResourceModelList(this);
            } 

        } 

    }
}
