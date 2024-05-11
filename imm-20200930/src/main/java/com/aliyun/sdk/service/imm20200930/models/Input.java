// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Input} extends {@link TeaModel}
 *
 * <p>Input</p>
 */
public class Input extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OSS")
    private InputOSS OSS;

    private Input(Builder builder) {
        this.OSS = builder.OSS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Input create() {
        return builder().build();
    }

    /**
     * @return OSS
     */
    public InputOSS getOSS() {
        return this.OSS;
    }

    public static final class Builder {
        private InputOSS OSS; 

        /**
         * OSS.
         */
        public Builder OSS(InputOSS OSS) {
            this.OSS = OSS;
            return this;
        }

        public Input build() {
            return new Input(this);
        } 

    } 

}
