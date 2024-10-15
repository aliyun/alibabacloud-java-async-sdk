// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SystemDiskParam} extends {@link TeaModel}
 *
 * <p>SystemDiskParam</p>
 */
public class SystemDiskParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    private SystemDiskParam(Builder builder) {
        this.category = builder.category;
        this.performanceLevel = builder.performanceLevel;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SystemDiskParam create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
        private String performanceLevel; 
        private Integer size; 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * PerformanceLevel.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public SystemDiskParam build() {
            return new SystemDiskParam(this);
        } 

    } 

}
