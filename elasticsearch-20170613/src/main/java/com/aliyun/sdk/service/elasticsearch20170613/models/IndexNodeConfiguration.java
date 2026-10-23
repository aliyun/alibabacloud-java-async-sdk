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
 * {@link IndexNodeConfiguration} extends {@link TeaModel}
 *
 * <p>IndexNodeConfiguration</p>
 */
public class IndexNodeConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    private Integer amount;

    @com.aliyun.core.annotation.NameInMap("disk")
    private Integer disk;

    @com.aliyun.core.annotation.NameInMap("diskType")
    private String diskType;

    @com.aliyun.core.annotation.NameInMap("performanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("spec")
    private String spec;

    private IndexNodeConfiguration(Builder builder) {
        this.amount = builder.amount;
        this.disk = builder.disk;
        this.diskType = builder.diskType;
        this.performanceLevel = builder.performanceLevel;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexNodeConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return disk
     */
    public Integer getDisk() {
        return this.disk;
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
        private Integer amount; 
        private Integer disk; 
        private String diskType; 
        private String performanceLevel; 
        private String spec; 

        private Builder() {
        } 

        private Builder(IndexNodeConfiguration model) {
            this.amount = model.amount;
            this.disk = model.disk;
            this.diskType = model.diskType;
            this.performanceLevel = model.performanceLevel;
            this.spec = model.spec;
        } 

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>The disk size.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder disk(Integer disk) {
            this.disk = disk;
            return this;
        }

        /**
         * <p>The disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The disk performance level (PL) PL0.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.turbo1.ci.xlarge</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public IndexNodeConfiguration build() {
            return new IndexNodeConfiguration(this);
        } 

    } 

}
