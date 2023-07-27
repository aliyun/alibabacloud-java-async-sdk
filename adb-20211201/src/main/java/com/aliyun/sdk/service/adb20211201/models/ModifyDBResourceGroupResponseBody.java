// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBResourceGroupResponseBody</p>
 */
public class ModifyDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBResourceGroupResponseBody create() {
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

        public ModifyDBResourceGroupResponseBody build() {
            return new ModifyDBResourceGroupResponseBody(this);
        } 

    } 

}
