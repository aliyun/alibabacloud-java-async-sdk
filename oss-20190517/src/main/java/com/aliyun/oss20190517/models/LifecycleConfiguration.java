// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LifecycleConfiguration} extends {@link TeaModel}
 *
 * <p>LifecycleConfiguration</p>
 */
public class LifecycleConfiguration extends TeaModel {
    @NameInMap("Rule")
    private java.util.List < LifecycleRule > rule;


    private LifecycleConfiguration(Builder builder) {
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LifecycleConfiguration create() {
        return builder().build();
    }

    /**
     * @return rule
     */
    public java.util.List < LifecycleRule > rule() {
        return this.rule;
    }

    public static final class Builder {
        private java.util.List < LifecycleRule > rule; 

        /**
         * <p>生命周期规则</p>
         */
        public Builder rule(java.util.List < LifecycleRule > rule) {
            this.rule = rule;
            return this;
        }

        public LifecycleConfiguration build() {
            return new LifecycleConfiguration(this);
        } 

    } 

}
