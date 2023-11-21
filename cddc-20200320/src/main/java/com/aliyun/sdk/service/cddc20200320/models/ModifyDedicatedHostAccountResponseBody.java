// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostAccountResponseBody</p>
 */
public class ModifyDedicatedHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDedicatedHostAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostAccountResponseBody create() {
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

        public ModifyDedicatedHostAccountResponseBody build() {
            return new ModifyDedicatedHostAccountResponseBody(this);
        } 

    } 

}
