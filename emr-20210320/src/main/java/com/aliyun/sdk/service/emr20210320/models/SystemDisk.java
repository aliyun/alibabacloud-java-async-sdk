// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SystemDisk} extends {@link TeaModel}
 *
 * <p>SystemDisk</p>
 */
public class SystemDisk extends TeaModel {
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("PerformanceLevel")
    private String performanceLevel;

    @NameInMap("Size")
    @Validation(required = true)
    private Integer size;

    private SystemDisk(Builder builder) {
        this.category = builder.category;
        this.count = builder.count;
        this.performanceLevel = builder.performanceLevel;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SystemDisk create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder {
        private String category; 
        private Integer count; 
        private String performanceLevel; 
        private Integer size; 

        /**
         * 磁盘类型。
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * 每个节点系统盘数量，默认值为1。
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * 创建ESSD云盘作为系统盘使用时，设置云盘的性能等级。取值范围：
         * <p>
         * - PL0：单盘最高随机读写IOPS 1万。
         * - PL1（默认）：单盘最高随机读写IOPS 5万。
         * - PL2：单盘最高随机读写IOPS 10万。
         * - PL3：单盘最高随机读写IOPS 100万。
         * 
         * 默认值：PL1。
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * 单位GB。
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public SystemDisk build() {
            return new SystemDisk(this);
        } 

    } 

}
