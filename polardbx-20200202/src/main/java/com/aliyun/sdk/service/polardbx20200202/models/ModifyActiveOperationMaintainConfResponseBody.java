// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationMaintainConfResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationMaintainConfResponseBody</p>
 */
public class ModifyActiveOperationMaintainConfResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyActiveOperationMaintainConfResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationMaintainConfResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyActiveOperationMaintainConfResponseBody build() {
            return new ModifyActiveOperationMaintainConfResponseBody(this);
        } 

    } 

}
