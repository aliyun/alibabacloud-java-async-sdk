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
 * {@link ListNodeInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ListNodeInstanceTypeRequest</p>
 */
public class ListNodeInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Float cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gpu")
    private Float gpu;

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
    @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
    private String nodeInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeInstanceTypeFamily")
    private String nodeInstanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private ListNodeInstanceTypeRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.gpuMemory = builder.gpuMemory;
        this.language = builder.language;
        this.memory = builder.memory;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.nodeInstanceTypeFamily = builder.nodeInstanceTypeFamily;
        this.orderBy = builder.orderBy;
        this.osType = builder.osType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeInstanceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return gpu
     */
    public Float getGpu() {
        return this.gpu;
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
     * @return nodeInstanceType
     */
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    /**
     * @return nodeInstanceTypeFamily
     */
    public String getNodeInstanceTypeFamily() {
        return this.nodeInstanceTypeFamily;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListNodeInstanceTypeRequest, Builder> {
        private String bizRegionId; 
        private Float cpu; 
        private Float gpu; 
        private Integer gpuMemory; 
        private String language; 
        private Integer memory; 
        private String nodeInstanceType; 
        private String nodeInstanceTypeFamily; 
        private String orderBy; 
        private String osType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeInstanceTypeRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.cpu = request.cpu;
            this.gpu = request.gpu;
            this.gpuMemory = request.gpuMemory;
            this.language = request.language;
            this.memory = request.memory;
            this.nodeInstanceType = request.nodeInstanceType;
            this.nodeInstanceTypeFamily = request.nodeInstanceTypeFamily;
            this.orderBy = request.orderBy;
            this.osType = request.osType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.sortType = request.sortType;
        } 

        /**
         * <p>The ID of the region where the resource resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-hangzhou: China (Hangzhou)</li>
         * </ul>
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
         * Cpu.
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * Gpu.
         */
        public Builder gpu(Float gpu) {
            this.putQueryParameter("Gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * GpuMemory.
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.putQueryParameter("GpuMemory", gpuMemory);
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * <p>The language that you want to use.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>en-US: English (US)</li>
         * <li>zh-CN: Simplified Chinese</li>
         * </ul>
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
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The resource type that you want to query. If you do not configure this parameter, all resource types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putQueryParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }

        /**
         * NodeInstanceTypeFamily.
         */
        public Builder nodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
            this.putQueryParameter("NodeInstanceTypeFamily", nodeInstanceTypeFamily);
            this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The operating system that is supported.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Windows: the Windows operating system</li>
         * </ul>
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
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
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
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public ListNodeInstanceTypeRequest build() {
            return new ListNodeInstanceTypeRequest(this);
        } 

    } 

}
