// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiskSize} extends {@link TeaModel}
 *
 * <p>DiskSize</p>
 */
public class DiskSize extends TeaModel {
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @NameInMap("Size")
    private Integer size;

    private DiskSize(Builder builder) {
        this.category = builder.category;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiskSize create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder {
        private String category; 
        private Integer size; 

        /**
         * 磁盘类型。
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * 单位GB。
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public DiskSize build() {
            return new DiskSize(this);
        } 

    } 

}
