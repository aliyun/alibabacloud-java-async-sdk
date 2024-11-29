// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVpnPbrRouteEntryAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpnPbrRouteEntryAttributeResponseBody</p>
 */
public class ModifyVpnPbrRouteEntryAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyVpnPbrRouteEntryAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpnPbrRouteEntryAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVpnPbrRouteEntryAttributeResponseBody build() {
            return new ModifyVpnPbrRouteEntryAttributeResponseBody(this);
        } 

    } 

}
