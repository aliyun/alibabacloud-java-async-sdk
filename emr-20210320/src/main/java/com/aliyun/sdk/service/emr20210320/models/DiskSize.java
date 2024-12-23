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
 * {@link DiskSize} extends {@link TeaModel}
 *
 * <p>DiskSize</p>
 */
public class DiskSize extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.NameInMap("Size")
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
         * <p>单位GB。</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
