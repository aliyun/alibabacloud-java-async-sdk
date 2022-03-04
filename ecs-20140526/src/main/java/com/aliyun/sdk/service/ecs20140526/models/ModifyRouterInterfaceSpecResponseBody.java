// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRouterInterfaceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRouterInterfaceSpecResponseBody</p>
 */
public class ModifyRouterInterfaceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spec")
    private String spec;

    private ModifyRouterInterfaceSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouterInterfaceSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private String requestId; 
        private String spec; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public ModifyRouterInterfaceSpecResponseBody build() {
            return new ModifyRouterInterfaceSpecResponseBody(this);
        } 

    } 

}
