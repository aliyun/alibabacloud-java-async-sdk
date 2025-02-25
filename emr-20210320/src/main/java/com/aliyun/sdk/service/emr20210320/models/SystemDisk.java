// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link SystemDisk} extends {@link TeaModel}
 *
 * <p>SystemDisk</p>
 */
public class SystemDisk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>磁盘类型。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>每个节点系统盘数量，默认值为1。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>创建ESSD云盘作为系统盘使用时，设置云盘的性能等级。取值范围：</p>
         * <ul>
         * <li>PL0：单盘最高随机读写IOPS 1万。</li>
         * <li>PL1（默认）：单盘最高随机读写IOPS 5万。</li>
         * <li>PL2：单盘最高随机读写IOPS 10万。</li>
         * <li>PL3：单盘最高随机读写IOPS 100万。</li>
         * </ul>
         * <p>默认值：PL1。</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>单位GB。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
