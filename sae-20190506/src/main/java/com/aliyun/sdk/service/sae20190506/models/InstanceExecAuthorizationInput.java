// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceExecAuthorizationInput} extends {@link TeaModel}
 *
 * <p>InstanceExecAuthorizationInput</p>
 */
public class InstanceExecAuthorizationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("options")
    private InstanceExecAuthorizationInputOptions options;

    private InstanceExecAuthorizationInput(Builder builder) {
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceExecAuthorizationInput create() {
        return builder().build();
    }

    /**
     * @return options
     */
    public InstanceExecAuthorizationInputOptions getOptions() {
        return this.options;
    }

    public static final class Builder {
        private InstanceExecAuthorizationInputOptions options; 

        /**
         * options.
         */
        public Builder options(InstanceExecAuthorizationInputOptions options) {
            this.options = options;
            return this;
        }

        public InstanceExecAuthorizationInput build() {
            return new InstanceExecAuthorizationInput(this);
        } 

    } 

}
