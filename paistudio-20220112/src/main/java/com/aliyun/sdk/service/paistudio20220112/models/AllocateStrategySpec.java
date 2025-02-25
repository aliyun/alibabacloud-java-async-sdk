// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link AllocateStrategySpec} extends {@link TeaModel}
 *
 * <p>AllocateStrategySpec</p>
 */
public class AllocateStrategySpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeSpecs")
    private java.util.List<NodeSpec> nodeSpecs;

    private AllocateStrategySpec(Builder builder) {
        this.nodeSpecs = builder.nodeSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateStrategySpec create() {
        return builder().build();
    }

    /**
     * @return nodeSpecs
     */
    public java.util.List<NodeSpec> getNodeSpecs() {
        return this.nodeSpecs;
    }

    public static final class Builder {
        private java.util.List<NodeSpec> nodeSpecs; 

        /**
         * NodeSpecs.
         */
        public Builder nodeSpecs(java.util.List<NodeSpec> nodeSpecs) {
            this.nodeSpecs = nodeSpecs;
            return this;
        }

        public AllocateStrategySpec build() {
            return new AllocateStrategySpec(this);
        } 

    } 

}
