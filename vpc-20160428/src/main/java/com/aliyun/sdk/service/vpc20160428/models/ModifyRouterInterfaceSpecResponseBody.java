// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyRouterInterfaceSpecResponseBody model) {
            this.requestId = model.requestId;
            this.spec = model.spec;
        } 

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
         * <li><p><strong>Mini.2</strong>: 2 Mbps</p>
         * </li>
         * <li><p><strong>Mini.5</strong>: 5 Mbps</p>
         * </li>
         * <li><p><strong>Small.1</strong>: 10 Mbps</p>
         * </li>
         * <li><p><strong>Small.2</strong>: 20 Mbps</p>
         * </li>
         * <li><p><strong>Small.5</strong>: 50 Mbps</p>
         * </li>
         * <li><p><strong>Middle.1</strong>: 100 Mbps</p>
         * </li>
         * <li><p><strong>Middle.2</strong>: 200 Mbps</p>
         * </li>
         * <li><p><strong>Middle.5</strong>: 500 Mbps</p>
         * </li>
         * <li><p><strong>Large.1</strong>: 1000 Mbps</p>
         * </li>
         * <li><p><strong>Large.2</strong>: 2000 Mbps</p>
         * </li>
         * <li><p><strong>Large.5</strong>: 5000 Mbps</p>
         * </li>
         * <li><p><strong>Xlarge.1</strong>: 10000 Mbps</p>
         * </li>
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
