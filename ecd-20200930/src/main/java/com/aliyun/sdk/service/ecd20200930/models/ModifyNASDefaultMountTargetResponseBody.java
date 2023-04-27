// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNASDefaultMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyNASDefaultMountTargetResponseBody</p>
 */
public class ModifyNASDefaultMountTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyNASDefaultMountTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNASDefaultMountTargetResponseBody create() {
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

        public ModifyNASDefaultMountTargetResponseBody build() {
            return new ModifyNASDefaultMountTargetResponseBody(this);
        } 

    } 

}
