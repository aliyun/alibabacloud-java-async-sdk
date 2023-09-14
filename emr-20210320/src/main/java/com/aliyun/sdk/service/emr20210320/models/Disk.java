// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Disk} extends {@link TeaModel}
 *
 * <p>Disk</p>
 */
public class Disk extends TeaModel {
    @NameInMap("Category")
    private String category;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("PerformanceLevel")
    private String performanceLevel;

    @NameInMap("Size")
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
         * 磁盘类型。
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * 每个节点磁盘数量。
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * 性能级别。
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

        public Disk build() {
            return new Disk(this);
        } 

    } 

}
