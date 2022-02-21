// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterParametersResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterParametersResponseBody</p>
 */
public class ModifyDBClusterParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBClusterParametersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterParametersResponseBody create() {
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

        public ModifyDBClusterParametersResponseBody build() {
            return new ModifyDBClusterParametersResponseBody(this);
        } 

    } 

}
