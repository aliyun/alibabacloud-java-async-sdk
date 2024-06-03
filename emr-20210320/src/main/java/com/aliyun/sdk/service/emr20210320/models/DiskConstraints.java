// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiskConstraints} extends {@link TeaModel}
 *
 * <p>DiskConstraints</p>
 */
public class DiskConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List < String > categories;

    @com.aliyun.core.annotation.NameInMap("CountConstraint")
    private ValueConstraints countConstraint;

    @com.aliyun.core.annotation.NameInMap("SizeConstraint")
    private ValueConstraints sizeConstraint;

    private DiskConstraints(Builder builder) {
        this.categories = builder.categories;
        this.countConstraint = builder.countConstraint;
        this.sizeConstraint = builder.sizeConstraint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiskConstraints create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public java.util.List < String > getCategories() {
        return this.categories;
    }

    /**
     * @return countConstraint
     */
    public ValueConstraints getCountConstraint() {
        return this.countConstraint;
    }

    /**
     * @return sizeConstraint
     */
    public ValueConstraints getSizeConstraint() {
        return this.sizeConstraint;
    }

    public static final class Builder {
        private java.util.List < String > categories; 
        private ValueConstraints countConstraint; 
        private ValueConstraints sizeConstraint; 

        /**
         * 支持的磁盘类型。
         */
        public Builder categories(java.util.List < String > categories) {
            this.categories = categories;
            return this;
        }

        /**
         * 磁盘数量最小值。
         */
        public Builder countConstraint(ValueConstraints countConstraint) {
            this.countConstraint = countConstraint;
            return this;
        }

        /**
         * 磁盘容量限制。
         */
        public Builder sizeConstraint(ValueConstraints sizeConstraint) {
            this.sizeConstraint = sizeConstraint;
            return this;
        }

        public DiskConstraints build() {
            return new DiskConstraints(this);
        } 

    } 

}
