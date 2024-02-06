// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrepayInstanceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPrepayInstanceSpecResponseBody</p>
 */
public class ModifyPrepayInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyPrepayInstanceSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrepayInstanceSpecResponseBody create() {
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

        public ModifyPrepayInstanceSpecResponseBody build() {
            return new ModifyPrepayInstanceSpecResponseBody(this);
        } 

    } 

}
