// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ResourceSpec} extends {@link TeaModel}
 *
 * <p>ResourceSpec</p>
 */
public class ResourceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cu")
    private Integer cu;

    @com.aliyun.core.annotation.NameInMap("diskNumber")
    private Integer diskNumber;

    @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
    private String localStorageInstanceType;

    @com.aliyun.core.annotation.NameInMap("nodeNumber")
    private Integer nodeNumber;

    @com.aliyun.core.annotation.NameInMap("specType")
    private String specType;

    @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
    private String storagePerformanceLevel;

    @com.aliyun.core.annotation.NameInMap("storageSize")
    private Integer storageSize;

    private ResourceSpec(Builder builder) {
        this.cu = builder.cu;
        this.diskNumber = builder.diskNumber;
        this.localStorageInstanceType = builder.localStorageInstanceType;
        this.nodeNumber = builder.nodeNumber;
        this.specType = builder.specType;
        this.storagePerformanceLevel = builder.storagePerformanceLevel;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return diskNumber
     */
    public Integer getDiskNumber() {
        return this.diskNumber;
    }

    /**
     * @return localStorageInstanceType
     */
    public String getLocalStorageInstanceType() {
        return this.localStorageInstanceType;
    }

    /**
     * @return nodeNumber
     */
    public Integer getNodeNumber() {
        return this.nodeNumber;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return storagePerformanceLevel
     */
    public String getStoragePerformanceLevel() {
        return this.storagePerformanceLevel;
    }

    /**
     * @return storageSize
     */
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder {
        private Integer cu; 
        private Integer diskNumber; 
        private String localStorageInstanceType; 
        private Integer nodeNumber; 
        private String specType; 
        private String storagePerformanceLevel; 
        private Integer storageSize; 

        private Builder() {
        } 

        private Builder(ResourceSpec model) {
            this.cu = model.cu;
            this.diskNumber = model.diskNumber;
            this.localStorageInstanceType = model.localStorageInstanceType;
            this.nodeNumber = model.nodeNumber;
            this.specType = model.specType;
            this.storagePerformanceLevel = model.storagePerformanceLevel;
            this.storageSize = model.storageSize;
        } 

        /**
         * <p>The number of CUs. A compute unit (CU) is the basic metering unit of a service. 1 CU = 1 CPU core + 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder cu(Integer cu) {
            this.cu = cu;
            return this;
        }

        /**
         * <p>The number of disk blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder diskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }

        /**
         * <p>Local SSD Instance Specification for the node group. This parameter is applicable only when the node group is based on ECS instances and the SpecType is set to \&quot;Local SSD / Large-capacity Storage\&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        public Builder localStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }

        /**
         * <p>The type of the node group. The following types are included:</p>
         * <ul>
         * <li>standard, Standard Edition, ECS + cloud disk.</li>
         * <li>localSSD , local SSD.</li>
         * <li>bigData, which stores large specifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder specType(String specType) {
            this.specType = specType;
            return this;
        }

        /**
         * <p>The performance level of the disks. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can achieve up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single disk can achieve up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can achieve up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can achieve up to 1 million random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        public Builder storagePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }

        /**
         * <p>The storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder storageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        public ResourceSpec build() {
            return new ResourceSpec(this);
        } 

    } 

}
