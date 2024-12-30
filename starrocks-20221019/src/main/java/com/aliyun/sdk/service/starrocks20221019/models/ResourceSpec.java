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

        /**
         * cu.
         */
        public Builder cu(Integer cu) {
            this.cu = cu;
            return this;
        }

        /**
         * diskNumber.
         */
        public Builder diskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }

        /**
         * localStorageInstanceType.
         */
        public Builder localStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }

        /**
         * nodeNumber.
         */
        public Builder nodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }

        /**
         * specType.
         */
        public Builder specType(String specType) {
            this.specType = specType;
            return this;
        }

        /**
         * storagePerformanceLevel.
         */
        public Builder storagePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }

        /**
         * storageSize.
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
