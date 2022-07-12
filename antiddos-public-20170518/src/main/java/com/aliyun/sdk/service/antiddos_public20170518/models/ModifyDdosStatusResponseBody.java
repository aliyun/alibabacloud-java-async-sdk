// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDdosStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDdosStatusResponseBody</p>
 */
public class ModifyDdosStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDdosStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDdosStatusResponseBody create() {
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

        public ModifyDdosStatusResponseBody build() {
            return new ModifyDdosStatusResponseBody(this);
        } 

    } 

}
