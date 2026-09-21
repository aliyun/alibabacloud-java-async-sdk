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
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

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
    @com.aliyun.core.annotation.NameInMap("InstanceTypeForModify")
    private String instanceTypeForModify;

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
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

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
        this.chargeType = builder.chargeType;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.gpuMemory = builder.gpuMemory;
        this.instanceTypeForModify = builder.instanceTypeForModify;
        this.language = builder.language;
        this.memory = builder.memory;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.nodeInstanceTypeFamily = builder.nodeInstanceTypeFamily;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
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
     * @return instanceTypeForModify
     */
    public String getInstanceTypeForModify() {
        return this.instanceTypeForModify;
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
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
        private String chargeType; 
        private Float cpu; 
        private Float gpu; 
        private Integer gpuMemory; 
        private String instanceTypeForModify; 
        private String language; 
        private Integer memory; 
        private String nodeInstanceType; 
        private String nodeInstanceTypeFamily; 
        private String orderBy; 
        private String orderType; 
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
            this.chargeType = request.chargeType;
            this.cpu = request.cpu;
            this.gpu = request.gpu;
            this.gpuMemory = request.gpuMemory;
            this.instanceTypeForModify = request.instanceTypeForModify;
            this.language = request.language;
            this.memory = request.memory;
            this.nodeInstanceType = request.nodeInstanceType;
            this.nodeInstanceTypeFamily = request.nodeInstanceTypeFamily;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.osType = request.osType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.sortType = request.sortType;
        } 

        /**
         * <p>The region ID of the resource. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
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
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpu(Float gpu) {
            this.putQueryParameter("Gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * <p>The GPU memory size. This value is meaningful for GPU-accelerated cloud desktops. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.putQueryParameter("GpuMemory", gpuMemory);
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * <p>The current specification of the instance for specification change.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.proworkstation_flagship_elite_ne.32c64g.48g1x</p>
         */
        public Builder instanceTypeForModify(String instanceTypeForModify) {
            this.putQueryParameter("InstanceTypeForModify", instanceTypeForModify);
            this.instanceTypeForModify = instanceTypeForModify;
            return this;
        }

        /**
         * <p>The language type.</p>
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
         * <p>The memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The resource specification type to query. If this parameter is not specified, all specification types are returned.</p>
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
         * <p>The instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu</p>
         */
        public Builder nodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
            this.putQueryParameter("NodeInstanceTypeFamily", nodeInstanceTypeFamily);
            this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
            return this;
        }

        /**
         * <p>CPU/Memory</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The specification change type.</p>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The supported operating system type.</p>
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
         * <p>The page number of the query results to display.</p>
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
         * <p>The number of query results per page. Valid values: 1 to 100.</p>
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
         * <p>DESC/ASC</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
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
