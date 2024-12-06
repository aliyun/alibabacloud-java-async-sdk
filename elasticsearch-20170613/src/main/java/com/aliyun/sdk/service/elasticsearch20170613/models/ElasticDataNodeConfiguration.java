// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ElasticDataNodeConfiguration} extends {@link TeaModel}
 *
 * <p>ElasticDataNodeConfiguration</p>
 */
public class ElasticDataNodeConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 2)
    private Long amount;

    @com.aliyun.core.annotation.NameInMap("disk")
    @com.aliyun.core.annotation.Validation(maximum = 20480, minimum = 20)
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

    private ElasticDataNodeConfiguration(Builder builder) {
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

    public static ElasticDataNodeConfiguration create() {
        return builder().build();
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

        /**
         * amount.
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * disk.
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * diskEncryption.
         */
        public Builder diskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * diskType.
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * performanceLevel.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public ElasticDataNodeConfiguration build() {
            return new ElasticDataNodeConfiguration(this);
        } 

    } 

}
