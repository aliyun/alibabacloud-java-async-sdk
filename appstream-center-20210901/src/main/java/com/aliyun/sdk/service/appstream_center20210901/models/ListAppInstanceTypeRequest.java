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
 * {@link ListAppInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ListAppInstanceTypeRequest</p>
 */
public class ListAppInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCenterImageId")
    private String appCenterImageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceType")
    private String appInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceTypeFamily")
    private String appInstanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceTypeList")
    private java.util.List<String> appInstanceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private String cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuMemory")
    private Integer gpuMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryInventory")
    private Boolean queryInventory;

    private ListAppInstanceTypeRequest(Builder builder) {
        super(builder);
        this.appCenterImageId = builder.appCenterImageId;
        this.appInstanceType = builder.appInstanceType;
        this.appInstanceTypeFamily = builder.appInstanceTypeFamily;
        this.appInstanceTypeList = builder.appInstanceTypeList;
        this.bizRegionId = builder.bizRegionId;
        this.category = builder.category;
        this.chargeType = builder.chargeType;
        this.cpu = builder.cpu;
        this.gpuMemory = builder.gpuMemory;
        this.language = builder.language;
        this.memory = builder.memory;
        this.osType = builder.osType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.queryInventory = builder.queryInventory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstanceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageId
     */
    public String getAppCenterImageId() {
        return this.appCenterImageId;
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
     * @return appInstanceTypeList
     */
    public java.util.List<String> getAppInstanceTypeList() {
        return this.appInstanceTypeList;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return gpuMemory
     */
    public Integer getGpuMemory() {
        return this.gpuMemory;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return queryInventory
     */
    public Boolean getQueryInventory() {
        return this.queryInventory;
    }

    public static final class Builder extends Request.Builder<ListAppInstanceTypeRequest, Builder> {
        private String appCenterImageId; 
        private String appInstanceType; 
        private String appInstanceTypeFamily; 
        private java.util.List<String> appInstanceTypeList; 
        private String bizRegionId; 
        private String category; 
        private String chargeType; 
        private String cpu; 
        private Integer gpuMemory; 
        private String language; 
        private Integer memory; 
        private String osType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private Boolean queryInventory; 

        private Builder() {
            super();
        } 

        private Builder(ListAppInstanceTypeRequest request) {
            super(request);
            this.appCenterImageId = request.appCenterImageId;
            this.appInstanceType = request.appInstanceType;
            this.appInstanceTypeFamily = request.appInstanceTypeFamily;
            this.appInstanceTypeList = request.appInstanceTypeList;
            this.bizRegionId = request.bizRegionId;
            this.category = request.category;
            this.chargeType = request.chargeType;
            this.cpu = request.cpu;
            this.gpuMemory = request.gpuMemory;
            this.language = request.language;
            this.memory = request.memory;
            this.osType = request.osType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.queryInventory = request.queryInventory;
        } 

        /**
         * <p>The application image ID. The current session instance type query does not filter based on this parameter. Omit this parameter. Do not infer image compatibility based on whether this parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>img-8z4nztpaqvay4****</p>
         */
        public Builder appCenterImageId(String appCenterImageId) {
            this.putQueryParameter("AppCenterImageId", appCenterImageId);
            this.appCenterImageId = appCenterImageId;
            return this;
        }

        /**
         * <p>The session instance type code. An exact match is performed based on the complete code. If this parameter and AppInstanceTypeList are specified at the same time, the results are filtered by intersection. You can first call this operation without this condition, and then select a returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g</p>
         */
        public Builder appInstanceType(String appInstanceType) {
            this.putQueryParameter("AppInstanceType", appInstanceType);
            this.appInstanceType = appInstanceType;
            return this;
        }

        /**
         * <p>The instance type family code. Exact match is performed based on the complete code. Use the instance type family value from the query results. Do not extract it from the instance type name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        public Builder appInstanceTypeFamily(String appInstanceTypeFamily) {
            this.putQueryParameter("AppInstanceTypeFamily", appInstanceTypeFamily);
            this.appInstanceTypeFamily = appInstanceTypeFamily;
            return this;
        }

        /**
         * <p>The list of session instance type codes. A maximum of 100 items can be specified. This parameter takes effect by intersection with other filtering conditions. If this parameter and AppInstanceType are specified at the same time, the results must also match the single code.</p>
         */
        public Builder appInstanceTypeList(java.util.List<String> appInstanceTypeList) {
            this.putQueryParameter("AppInstanceTypeList", appInstanceTypeList);
            this.appInstanceTypeList = appInstanceTypeList;
            return this;
        }

        /**
         * <p>The business region ID. If this parameter is omitted, the region of the current request is used. The available instance types may vary by region and account. You can call <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListRegions">ListRegions</a> to obtain the business region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The instance type category filtering condition. If this parameter is omitted, no category filtering condition is added. Valid values:</p>
         * <ul>
         * <li>Cpu: CPU instance type.</li>
         * <li>Gpu: GPU instance type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Gpu</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The billing method for filtering available instance types. If this parameter is omitted, no billing method condition is added. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The number of CPU cores for exact filtering. Use a decimal numeric string. Unit: cores. If this parameter is omitted, the number of CPU cores is not limited.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder cpu(String cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The GPU memory capacity for exact filtering. Unit: MB. If this parameter is omitted, the GPU memory capacity is not limited.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.putQueryParameter("GpuMemory", gpuMemory);
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * <p>The language of the instance type name.</p>
         * <ul>
         * <li>zh-CN: The Chinese name of the instance type.</li>
         * <li>Other values or omitted: The instance type code is used as the name.</li>
         * </ul>
         * <p>This parameter only affects the display of InstanceTypeName and does not change the instance type code.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The memory capacity for exact filtering. Unit: MB. If this parameter is omitted, the memory capacity is not limited.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The operating system type. For the Wuying Cloud App (CloudApp) scenario, use the following values:</p>
         * <ul>
         * <li>Windows: Windows operating system.</li>
         * </ul>
         * <p>If this parameter is omitted, no operating system filtering condition is added.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The page number. Explicitly specify a page number starting from 1. If this parameter is omitted, the default value 0 is used to query the first batch of results. For subsequent pages, request in the order of 1, 2, and 3.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of instance types to return on each page. Unit: entries. Default value: 200. Explicitly set a positive integer that meets your business requirements. The default value here does not indicate the maximum value allowed by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type. Set the value to the following fixed value when you call this operation:</p>
         * <ul>
         * <li>CloudApp: Wuying Cloud App.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>Specifies whether to query the instance type inventory at the same time. Default value: false.</p>
         * <ul>
         * <li>true: Queries the inventory and returns InventoryInfo if the inventory information is available.</li>
         * <li>false: Queries only the instance types and does not query the inventory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder queryInventory(Boolean queryInventory) {
            this.putQueryParameter("QueryInventory", queryInventory);
            this.queryInventory = queryInventory;
            return this;
        }

        @Override
        public ListAppInstanceTypeRequest build() {
            return new ListAppInstanceTypeRequest(this);
        } 

    } 

}
