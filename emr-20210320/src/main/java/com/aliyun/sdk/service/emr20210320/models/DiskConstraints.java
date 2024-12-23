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
 * {@link DiskConstraints} extends {@link TeaModel}
 *
 * <p>DiskConstraints</p>
 */
public class DiskConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<String> categories;

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
    public java.util.List<String> getCategories() {
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
        private java.util.List<String> categories; 
        private ValueConstraints countConstraint; 
        private ValueConstraints sizeConstraint; 

        /**
         * <p>支持的磁盘类型。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cloud_efficiency&quot;,&quot;cloud_ssd&quot;,&quot;cloud_essd&quot;,&quot;local_disk&quot;]</p>
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>磁盘数量最小值。</p>
         */
        public Builder countConstraint(ValueConstraints countConstraint) {
            this.countConstraint = countConstraint;
            return this;
        }

        /**
         * <p>磁盘容量限制。</p>
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
