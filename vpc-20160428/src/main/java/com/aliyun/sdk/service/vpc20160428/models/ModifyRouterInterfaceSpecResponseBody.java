// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The specification of the router interface. Valid values:</p>
         * <ul>
         * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
         * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
         * <li><strong>Small.1</strong>: 10 Mbit/s</li>
         * <li><strong>Small.2</strong>: 20 Mbit/s</li>
         * <li><strong>Small.5</strong>: 50 Mbit/s</li>
         * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
         * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
         * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
         * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
         * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
         * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
         * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Small.1</p>
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
