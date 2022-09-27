// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeSpec} extends {@link TeaModel}
 *
 * <p>NodeSpec</p>
 */
public class NodeSpec extends TeaModel {
    @NameInMap("disk")
    private Integer disk;

    @NameInMap("diskEncryption")
    private Boolean diskEncryption;

    @NameInMap("diskType")
    private String diskType;

    @NameInMap("performanceLevel")
    private String performanceLevel;

    @NameInMap("spec")
    private String spec;

    private NodeSpec(Builder builder) {
        this.disk = builder.disk;
        this.diskEncryption = builder.diskEncryption;
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
        private String diskType; 
        private String performanceLevel; 
        private String spec; 

        /**
         * 数据节点磁盘大小
         */
        public Builder disk(Integer disk) {
            this.disk = disk;
            return this;
        }

        /**
         * 数据节点磁盘加密
         */
        public Builder diskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * 数据节点磁盘类型
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * 数据节点essd磁盘等级
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * 数据节点规格
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
