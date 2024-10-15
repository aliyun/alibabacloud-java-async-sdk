// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Disk} extends {@link TeaModel}
 *
 * <p>Disk</p>
 */
public class Disk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    private Disk(Builder builder) {
        this.category = builder.category;
        this.count = builder.count;
        this.performanceLevel = builder.performanceLevel;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Disk create() {
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
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>每个节点磁盘数量。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>性能级别。</p>
         * 
         * <strong>example:</strong>
         * <p>S0</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>单位GB。</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public Disk build() {
            return new Disk(this);
        } 

    } 

}
