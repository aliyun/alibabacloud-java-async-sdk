// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAppInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInstanceTypeResponseBody</p>
 */
public class ListAppInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceTypeModels")
    private java.util.List<AppInstanceTypeModels> appInstanceTypeModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAppInstanceTypeResponseBody(Builder builder) {
        this.appInstanceTypeModels = builder.appInstanceTypeModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstanceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceTypeModels
     */
    public java.util.List<AppInstanceTypeModels> getAppInstanceTypeModels() {
        return this.appInstanceTypeModels;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AppInstanceTypeModels> appInstanceTypeModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAppInstanceTypeResponseBody model) {
            this.appInstanceTypeModels = model.appInstanceTypeModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of session instance types on the current page.</p>
         */
        public Builder appInstanceTypeModels(java.util.List<AppInstanceTypeModels> appInstanceTypeModels) {
            this.appInstanceTypeModels = appInstanceTypeModels;
            return this;
        }

        /**
         * <p>The page number used in this query, which corresponds to the request parameters and the total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instance types that meet all filtering conditions, not the number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAppInstanceTypeResponseBody build() {
            return new ListAppInstanceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceTypeResponseBody</p>
     */
    public static class ZoneInventoryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneInventoryInfo(Builder builder) {
            this.amount = builder.amount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInventoryInfo create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String amount; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneInventoryInfo model) {
                this.amount = model.amount;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The available quantity in the zone obtained in this query. Unit: instances. This value is an inventory snapshot and does not indicate that resources have been reserved for the current account.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The zone ID, which can be queried by calling the <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListZones">ListZones</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneInventoryInfo build() {
                return new ZoneInventoryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceTypeResponseBody</p>
     */
    public static class InventoryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ZoneInventoryInfo")
        private java.util.List<ZoneInventoryInfo> zoneInventoryInfo;

        private InventoryInfo(Builder builder) {
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.zoneInventoryInfo = builder.zoneInventoryInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InventoryInfo create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneInventoryInfo
         */
        public java.util.List<ZoneInventoryInfo> getZoneInventoryInfo() {
            return this.zoneInventoryInfo;
        }

        public static final class Builder {
            private String regionId; 
            private String status; 
            private java.util.List<ZoneInventoryInfo> zoneInventoryInfo; 

            private Builder() {
            } 

            private Builder(InventoryInfo model) {
                this.regionId = model.regionId;
                this.status = model.status;
                this.zoneInventoryInfo = model.zoneInventoryInfo;
            } 

            /**
             * <p>The business region ID corresponding to the inventory query.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance type inventory status obtained in the current query.</p>
             * <ul>
             * <li><code>Available</code>: The total inventory of the queried zones is greater than 0.</li>
             * <li><code>SoldOut</code>: The total inventory of the queried zones is not greater than 0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of inventory information returned by zone.</p>
             */
            public Builder zoneInventoryInfo(java.util.List<ZoneInventoryInfo> zoneInventoryInfo) {
                this.zoneInventoryInfo = zoneInventoryInfo;
                return this;
            }

            public InventoryInfo build() {
                return new InventoryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceTypeResponseBody</p>
     */
    public static class AppInstanceTypeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceType")
        private String appInstanceType;

        @com.aliyun.core.annotation.NameInMap("AppInstanceTypeFamily")
        private String appInstanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Long dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private String gpu;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Long gpuMemory;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @com.aliyun.core.annotation.NameInMap("InventoryInfo")
        private InventoryInfo inventoryInfo;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Long systemDiskSize;

        private AppInstanceTypeModels(Builder builder) {
            this.appInstanceType = builder.appInstanceType;
            this.appInstanceTypeFamily = builder.appInstanceTypeFamily;
            this.cpu = builder.cpu;
            this.dataDiskSize = builder.dataDiskSize;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.gpuSpec = builder.gpuSpec;
            this.id = builder.id;
            this.instanceTypeName = builder.instanceTypeName;
            this.inventoryInfo = builder.inventoryInfo;
            this.memory = builder.memory;
            this.productType = builder.productType;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceTypeModels create() {
            return builder().build();
        }

        /**
         * @return appInstanceType
         */
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        /**
         * @return appInstanceTypeFamily
         */
        public String getAppInstanceTypeFamily() {
            return this.appInstanceTypeFamily;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return dataDiskSize
         */
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return gpu
         */
        public String getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemory
         */
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceTypeName
         */
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        /**
         * @return inventoryInfo
         */
        public InventoryInfo getInventoryInfo() {
            return this.inventoryInfo;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String appInstanceType; 
            private String appInstanceTypeFamily; 
            private String cpu; 
            private Long dataDiskSize; 
            private String gpu; 
            private Long gpuMemory; 
            private String gpuSpec; 
            private Long id; 
            private String instanceTypeName; 
            private InventoryInfo inventoryInfo; 
            private Long memory; 
            private String productType; 
            private Long systemDiskSize; 

            private Builder() {
            } 

            private Builder(AppInstanceTypeModels model) {
                this.appInstanceType = model.appInstanceType;
                this.appInstanceTypeFamily = model.appInstanceTypeFamily;
                this.cpu = model.cpu;
                this.dataDiskSize = model.dataDiskSize;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.gpuSpec = model.gpuSpec;
                this.id = model.id;
                this.instanceTypeName = model.instanceTypeName;
                this.inventoryInfo = model.inventoryInfo;
                this.memory = model.memory;
                this.productType = model.productType;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The session instance type code, which can be used as the session instance type parameter for subsequent operations.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu.4c8g</p>
             */
            public Builder appInstanceType(String appInstanceType) {
                this.appInstanceType = appInstanceType;
                return this;
            }

            /**
             * <p>The instance type family code to which the session instance type belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6</p>
             */
            public Builder appInstanceTypeFamily(String appInstanceTypeFamily) {
                this.appInstanceTypeFamily = appInstanceTypeFamily;
                return this;
            }

            /**
             * <p>The number of CPU cores included in the instance type, represented by a numeric string. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The data cloud disk capacity of the instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataDiskSize(Long dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>Not enabled yet. The example value is only used to demonstrate the format and does not represent the actual number of GPUs returned by this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The GPU memory capacity of the instance type. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder gpuMemory(Long gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * <p>The display value or display range of the GPU memory. Display it as the returned text. Do not directly use it as a numeric value for capacity conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1~2</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The identifier of the instance type record. When integrating with pricing or creation operations, use <code>AppInstanceType</code>. Do not use this field to replace the instance type code.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the instance type. The Chinese name is used only when <code>Language</code> is set to <code>zh-CN</code>. For other values or when omitted, the instance type code is used.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu.4c8g</p>
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
                return this;
            }

            /**
             * <p>The inventory information of the instance type. This parameter is returned only when the inventory is queried and the relevant information is obtained. If this parameter is not returned, it does not mean that the inventory is 0.</p>
             */
            public Builder inventoryInfo(InventoryInfo inventoryInfo) {
                this.inventoryInfo = inventoryInfo;
                return this;
            }

            /**
             * <p>The memory capacity of the instance type. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The type of the product to which the instance type belongs. The current document displays the following values:</p>
             * <ul>
             * <li><code>CloudApp</code>: Wuying Cloud Application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The system cloud disk capacity of the instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public AppInstanceTypeModels build() {
                return new AppInstanceTypeModels(this);
            } 

        } 

    }
}
