// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebLockStatusResponseBody</p>
 */
public class ModifyWebLockStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWebLockStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockStatusResponseBody create() {
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

        public ModifyWebLockStatusResponseBody build() {
            return new ModifyWebLockStatusResponseBody(this);
        } 

    } 

}
