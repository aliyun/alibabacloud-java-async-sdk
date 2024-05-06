// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRouterInterfaceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRouterInterfaceSpecResponseBody</p>
 */
public class ModifyRouterInterfaceSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Spec")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The specification of the router interface. Valid values:
         * <p>
         * 
         * *   **Mini.2**: 2 Mbit/s
         * *   **Mini.5**: 5 Mbit/s
         * *   **Small.1**: 10 Mbit/s
         * *   **Small.2**: 20 Mbit/s
         * *   **Small.5**: 50 Mbit/s
         * *   **Middle.1**: 100 Mbit/s
         * *   **Middle.2**: 200 Mbit/s
         * *   **Middle.5**: 500 Mbit/s
         * *   **Large.1**: 1,000 Mbit/s
         * *   **Large.2**: 2,000 Mbit/s
         * *   **Large.5**: 5,000 Mbit/s
         * *   **Xlarge.1**: 10,000 Mbit/s
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
