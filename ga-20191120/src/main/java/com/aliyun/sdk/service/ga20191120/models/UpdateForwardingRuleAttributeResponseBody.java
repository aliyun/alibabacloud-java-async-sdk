// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateForwardingRuleAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateForwardingRuleAttributeResponseBody</p>
 */
public class UpdateForwardingRuleAttributeResponseBody extends TeaModel {
    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateForwardingRuleAttributeResponseBody(Builder builder) {
        this.endpointGroupId = builder.endpointGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateForwardingRuleAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String endpointGroupId; 
        private String requestId; 

        /**
         * EndpointGroupId.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateForwardingRuleAttributeResponseBody build() {
            return new UpdateForwardingRuleAttributeResponseBody(this);
        } 

    } 

}
