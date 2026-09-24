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
 * {@link WarmNodeConfiguration} extends {@link TeaModel}
 *
 * <p>WarmNodeConfiguration</p>
 */
public class WarmNodeConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Long amount;

    @com.aliyun.core.annotation.NameInMap("disk")
    @com.aliyun.core.annotation.Validation(maximum = 20480, minimum = 500)
    private Long disk;

    @com.aliyun.core.annotation.NameInMap("diskEncryption")
    private Boolean diskEncryption;

    @com.aliyun.core.annotation.NameInMap("diskType")
    private String diskType;

    @com.aliyun.core.annotation.NameInMap("performanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private WarmNodeConfiguration(Builder builder) {
        this.amount = builder.amount;
        this.disk = builder.disk;
        this.diskEncryption = builder.diskEncryption;
        this.diskType = builder.diskType;
        this.performanceLevel = builder.performanceLevel;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WarmNodeConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return disk
     */
    public Long getDisk() {
        return this.disk;
    }

    /**
     * @return diskEncryption
     */
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
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
        private Long amount; 
        private Long disk; 
        private Boolean diskEncryption; 
        private String diskType; 
        private String performanceLevel; 
        private String spec; 

        private Builder() {
        } 

        private Builder(WarmNodeConfiguration model) {
            this.amount = model.amount;
            this.disk = model.disk;
            this.diskEncryption = model.diskEncryption;
            this.diskType = model.diskType;
            this.performanceLevel = model.performanceLevel;
            this.spec = model.spec;
        } 

        /**
         * <p>The number of cold data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The storage space size of cold data nodes, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * <p>Specifies whether to enable cloud disk encryption for cold data nodes. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: not enabled.</li>
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
         * <p>The storage type of cold data nodes. Only cloud_efficiency (ultra cloud disk) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The performance level (PL) of the ESSD cloud disk. This parameter is required when the disk type of cold data nodes is a standard SSD. Valid values: PL1, PL2, and PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The node specifications of cold data nodes. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public WarmNodeConfiguration build() {
            return new WarmNodeConfiguration(this);
        } 

    } 

}
