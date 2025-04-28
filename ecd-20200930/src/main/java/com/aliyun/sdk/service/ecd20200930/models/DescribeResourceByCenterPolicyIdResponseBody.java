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
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48174475-5EB2-5F99-A9E9-6F892D645****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
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
             * <p>The application ID. This parameter is only applicable to cloud applications.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>alipic-powergem</p>
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
             * <p>The cloud applications.</p>
             */
            public Builder appModelList(java.util.List<AppModelList> appModelList) {
                this.appModelList = appModelList;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The cloud computer type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of the cloud computer types supported by Alibaba Cloud Workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.enterprise_office.8c32g</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.125</p>
             */
            public Builder gpuCount(Double gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>2GiB</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The OS type.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>postPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The service type.</p>
             * 
             * <strong>example:</strong>
             * <p>desktop</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-d7pasxsd3b9nhq**</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The number of associated resource groups</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder resourceGroupRelCount(Integer resourceGroupRelCount) {
                this.resourceGroupRelCount = resourceGroupRelCount;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7o96aa08fr****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>desktop</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>Stopped</p>
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
