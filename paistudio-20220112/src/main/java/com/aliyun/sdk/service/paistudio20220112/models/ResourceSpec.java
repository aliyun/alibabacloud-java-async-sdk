// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResourceSpec} extends {@link TeaModel}
 *
 * <p>ResourceSpec</p>
 */
public class ResourceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeSpecs")
    private java.util.List < NodeSpec > nodeSpecs;

    private ResourceSpec(Builder builder) {
        this.nodeSpecs = builder.nodeSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceSpec create() {
        return builder().build();
    }

    /**
     * @return nodeSpecs
     */
    public java.util.List < NodeSpec > getNodeSpecs() {
        return this.nodeSpecs;
    }

    public static final class Builder {
        private java.util.List < NodeSpec > nodeSpecs; 

        /**
         * NodeSpecs.
         */
        public Builder nodeSpecs(java.util.List < NodeSpec > nodeSpecs) {
            this.nodeSpecs = nodeSpecs;
            return this;
        }

        public ResourceSpec build() {
            return new ResourceSpec(this);
        } 

    } 

}
