// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplacementStrategy} extends {@link TeaModel}
 *
 * <p>ReplacementStrategy</p>
 */
public class ReplacementStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCategories")
    private java.util.List < InstanceCategory > instanceCategories;

    private ReplacementStrategy(Builder builder) {
        this.instanceCategories = builder.instanceCategories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplacementStrategy create() {
        return builder().build();
    }

    /**
     * @return instanceCategories
     */
    public java.util.List < InstanceCategory > getInstanceCategories() {
        return this.instanceCategories;
    }

    public static final class Builder {
        private java.util.List < InstanceCategory > instanceCategories; 

        /**
         * InstanceCategories.
         */
        public Builder instanceCategories(java.util.List < InstanceCategory > instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }

        public ReplacementStrategy build() {
            return new ReplacementStrategy(this);
        } 

    } 

}
