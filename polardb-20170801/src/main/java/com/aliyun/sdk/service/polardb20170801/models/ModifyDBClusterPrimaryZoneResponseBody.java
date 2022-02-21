// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterPrimaryZoneResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterPrimaryZoneResponseBody</p>
 */
public class ModifyDBClusterPrimaryZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBClusterPrimaryZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterPrimaryZoneResponseBody create() {
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

        public ModifyDBClusterPrimaryZoneResponseBody build() {
            return new ModifyDBClusterPrimaryZoneResponseBody(this);
        } 

    } 

}
