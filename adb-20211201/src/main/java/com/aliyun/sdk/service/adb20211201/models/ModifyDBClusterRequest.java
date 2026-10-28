// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodeNumber")
    private Integer AINodeNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodeSpec")
    private String AINodeSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDefaultResourcePool")
    private Boolean enableDefaultResourcePool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductForm")
    private String productForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductVersion")
    private String productVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeCount")
    private Integer reservedNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeSize")
    private String reservedNodeSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResource")
    private String storageResource;

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.AINodeNumber = builder.AINodeNumber;
        this.AINodeSpec = builder.AINodeSpec;
        this.computeResource = builder.computeResource;
        this.DBClusterId = builder.DBClusterId;
        this.enableDefaultResourcePool = builder.enableDefaultResourcePool;
        this.productForm = builder.productForm;
        this.productVersion = builder.productVersion;
        this.regionId = builder.regionId;
        this.reservedNodeCount = builder.reservedNodeCount;
        this.reservedNodeSize = builder.reservedNodeSize;
        this.storageResource = builder.storageResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AINodeNumber
     */
    public Integer getAINodeNumber() {
        return this.AINodeNumber;
    }

    /**
     * @return AINodeSpec
     */
    public String getAINodeSpec() {
        return this.AINodeSpec;
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableDefaultResourcePool
     */
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
    }

    /**
     * @return productForm
     */
    public String getProductForm() {
        return this.productForm;
    }

    /**
     * @return productVersion
     */
    public String getProductVersion() {
        return this.productVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reservedNodeCount
     */
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    /**
     * @return reservedNodeSize
     */
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
    }

    /**
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private Integer AINodeNumber; 
        private String AINodeSpec; 
        private String computeResource; 
        private String DBClusterId; 
        private Boolean enableDefaultResourcePool; 
        private String productForm; 
        private String productVersion; 
        private String regionId; 
        private Integer reservedNodeCount; 
        private String reservedNodeSize; 
        private String storageResource; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.AINodeNumber = request.AINodeNumber;
            this.AINodeSpec = request.AINodeSpec;
            this.computeResource = request.computeResource;
            this.DBClusterId = request.DBClusterId;
            this.enableDefaultResourcePool = request.enableDefaultResourcePool;
            this.productForm = request.productForm;
            this.productVersion = request.productVersion;
            this.regionId = request.regionId;
            this.reservedNodeCount = request.reservedNodeCount;
            this.reservedNodeSize = request.reservedNodeSize;
            this.storageResource = request.storageResource;
        } 

        /**
         * <p>The number of AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder AINodeNumber(Integer AINodeNumber) {
            this.putQueryParameter("AINodeNumber", AINodeNumber);
            this.AINodeNumber = AINodeNumber;
            return this;
        }

        /**
         * <p>The AI node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB.MLPlus.4</p>
         */
        public Builder AINodeSpec(String AINodeSpec) {
            this.putQueryParameter("AINodeSpec", AINodeSpec);
            this.AINodeSpec = AINodeSpec;
            return this;
        }

        /**
         * <p>The reserved compute resources. Valid values: 0 ACU to 4096 ACU. Step: 16. 1 ACU is approximately equal to 1 core and 4 GB of memory.</p>
         * <blockquote>
         * <p>Include the unit when you specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The ID of the Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the ID of the Data Lakehouse Edition cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1r053byu48p****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to allocate all reserved compute resources to the default resource group (user_default). Valid values:</p>
         * <ul>
         * <li>true (default): Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDefaultResourcePool(Boolean enableDefaultResourcePool) {
            this.putQueryParameter("EnableDefaultResourcePool", enableDefaultResourcePool);
            this.enableDefaultResourcePool = enableDefaultResourcePool;
            return this;
        }

        /**
         * <p>The product form. Valid values:</p>
         * <ul>
         * <li><strong>IntegrationForm</strong>: Integration form.</li>
         * <li><strong>LegacyForm</strong>: Data Lakehouse Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LegacyForm</p>
         */
        public Builder productForm(String productForm) {
            this.putQueryParameter("ProductForm", productForm);
            this.productForm = productForm;
            return this;
        }

        /**
         * <p>The target product version. When you switch from LegacyForm to IntegrationForm Enterprise Edition in-place, set this parameter to enterprise_version and specify ProductForm, ReservedNodeSize, and ReservedNodeCount at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise_version</p>
         */
        public Builder productVersion(String productVersion) {
            this.putQueryParameter("ProductVersion", productVersion);
            this.productVersion = productVersion;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID of the specified Data Lakehouse Edition cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of reserved nodes. </p>
         * <ul>
         * <li>For Enterprise Edition, the default value is 3 and the step is 3.</li>
         * <li>For Basic Edition, the default value is 1.<blockquote>
         * <p>Specify this parameter only when ProductForm is set to IntegrationForm.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder reservedNodeCount(Integer reservedNodeCount) {
            this.putQueryParameter("ReservedNodeCount", reservedNodeCount);
            this.reservedNodeCount = reservedNodeCount;
            return this;
        }

        /**
         * <p>The node specifications for reserved storage resources. Valid values: 8 ACU, 12 ACU, and 16 ACU.</p>
         * <blockquote>
         * <p>Include the unit when you specify this parameter. Specify this parameter only when ProductForm is set to IntegrationForm.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8ACU</p>
         */
        public Builder reservedNodeSize(String reservedNodeSize) {
            this.putQueryParameter("ReservedNodeSize", reservedNodeSize);
            this.reservedNodeSize = reservedNodeSize;
            return this;
        }

        /**
         * <p>The reserved storage resources. Valid values: 0 ACU to 2064 ACU. Step: 24. 1 ACU is approximately equal to 1 core and 4 GB of memory.</p>
         * <blockquote>
         * <p>Include the unit when you specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
            return this;
        }

        @Override
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
