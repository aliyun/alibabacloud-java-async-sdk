// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WarmNodeConfiguration} extends {@link TeaModel}
 *
 * <p>WarmNodeConfiguration</p>
 */
public class WarmNodeConfiguration extends TeaModel {
    @NameInMap("amount")
    @Validation(maximum = 50, minimum = 1)
    private Long amount;

    @NameInMap("disk")
    @Validation(maximum = 20480, minimum = 500)
    private Long disk;

    @NameInMap("diskEncryption")
    private Boolean diskEncryption;

    @NameInMap("diskType")
    private String diskType;

    @NameInMap("performanceLevel")
    private String performanceLevel;

    @NameInMap("spec")
    @Validation(required = true)
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
         * 节点数量
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * 节点磁盘
         */
        public Builder disk(Long disk) {
            this.disk = disk;
            return this;
        }

        /**
         * 节点磁盘加密
         */
        public Builder diskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * 节点磁盘类型
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * 节点essd磁盘等级
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * 节点规格
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
