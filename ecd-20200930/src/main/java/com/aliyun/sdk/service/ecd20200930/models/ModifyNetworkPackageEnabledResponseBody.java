// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkPackageEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyNetworkPackageEnabledResponseBody</p>
 */
public class ModifyNetworkPackageEnabledResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyNetworkPackageEnabledResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkPackageEnabledResponseBody create() {
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

        public ModifyNetworkPackageEnabledResponseBody build() {
            return new ModifyNetworkPackageEnabledResponseBody(this);
        } 

    } 

}
