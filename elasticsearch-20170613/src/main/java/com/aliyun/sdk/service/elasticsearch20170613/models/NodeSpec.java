// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link NodeSpec} extends {@link TeaModel}
 *
 * <p>NodeSpec</p>
 */
public class NodeSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disk")
    @com.aliyun.core.annotation.Validation(maximum = 20480, minimum = 20)
    private Integer disk;

    @com.aliyun.core.annotation.NameInMap("diskEncryption")
    private Boolean diskEncryption;

    @com.aliyun.core.annotation.NameInMap("diskPreference")
    private String diskPreference;

    @com.aliyun.core.annotation.NameInMap("diskType")
    private String diskType;

    @com.aliyun.core.annotation.NameInMap("performanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private NodeSpec(Builder builder) {
        this.disk = builder.disk;
        this.diskEncryption = builder.diskEncryption;
        this.diskPreference = builder.diskPreference;
        this.diskType = builder.diskType;
        this.performanceLevel = builder.performanceLevel;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disk
     */
    public Integer getDisk() {
        return this.disk;
    }

    /**
     * @return diskEncryption
     */
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    /**
     * @return diskPreference
     */
    public String getDiskPreference() {
        return this.diskPreference;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private Integer disk; 
        private Boolean diskEncryption; 
        private String diskPreference; 
        private String diskType; 
        private String performanceLevel; 
        private String spec; 

        private Builder() {
        } 

        private Builder(NodeSpec model) {
            this.disk = model.disk;
            this.diskEncryption = model.diskEncryption;
            this.diskPreference = model.diskPreference;
            this.diskType = model.diskType;
            this.performanceLevel = model.performanceLevel;
            this.spec = model.spec;
        } 

        /**
         * <p>Storage space size of data nodes, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder disk(Integer disk) {
            this.disk = disk;
            return this;
        }

        /**
         * <p>Whether to enable cloud disk encryption for data nodes:</p>
         * <ul>
         * <li>true: Enabled</li>
         * <li>false: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder diskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * <p>Storage preference.</p>
         */
        public Builder diskPreference(String diskPreference) {
            this.diskPreference = diskPreference;
            return this;
        }

        /**
         * <p>Storage type of data nodes. Supported values:</p>
         * <ul>
         * <li>cloud_ssd: SSD cloud disk</li>
         * <li>cloud_essd: ESSD cloud disk</li>
         * <li>cloud_efficiency: Ultra cloud disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>Performance level of ESSD cloud disks. Required when the disk type of data nodes is ESSD cloud disk. Supported values: PL1, PL2, PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>Data node specification. Specification details can be viewed in <a href="https://help.aliyun.com/document_detail/271718.html">Product Specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public NodeSpec build() {
            return new NodeSpec(this);
        } 

    } 

}
