// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWirelessCloudConnectorFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWirelessCloudConnectorFeatureResponseBody</p>
 */
public class ModifyWirelessCloudConnectorFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyWirelessCloudConnectorFeatureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWirelessCloudConnectorFeatureResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyWirelessCloudConnectorFeatureResponseBody build() {
            return new ModifyWirelessCloudConnectorFeatureResponseBody(this);
        } 

    } 

}
