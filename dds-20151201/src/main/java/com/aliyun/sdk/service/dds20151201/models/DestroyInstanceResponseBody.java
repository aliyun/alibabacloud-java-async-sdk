// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestroyInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DestroyInstanceResponseBody</p>
 */
public class DestroyInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DestroyInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DestroyInstanceResponseBody create() {
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

        public DestroyInstanceResponseBody build() {
            return new DestroyInstanceResponseBody(this);
        } 

    } 

}
