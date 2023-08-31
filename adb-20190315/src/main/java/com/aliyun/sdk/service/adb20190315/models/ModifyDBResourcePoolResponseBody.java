// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBResourcePoolResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBResourcePoolResponseBody</p>
 */
public class ModifyDBResourcePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBResourcePoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBResourcePoolResponseBody create() {
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

        public ModifyDBResourcePoolResponseBody build() {
            return new ModifyDBResourcePoolResponseBody(this);
        } 

    } 

}
