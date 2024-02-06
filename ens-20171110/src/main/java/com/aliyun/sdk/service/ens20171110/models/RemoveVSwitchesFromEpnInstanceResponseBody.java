// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVSwitchesFromEpnInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveVSwitchesFromEpnInstanceResponseBody</p>
 */
public class RemoveVSwitchesFromEpnInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveVSwitchesFromEpnInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVSwitchesFromEpnInstanceResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveVSwitchesFromEpnInstanceResponseBody build() {
            return new RemoveVSwitchesFromEpnInstanceResponseBody(this);
        } 

    } 

}
