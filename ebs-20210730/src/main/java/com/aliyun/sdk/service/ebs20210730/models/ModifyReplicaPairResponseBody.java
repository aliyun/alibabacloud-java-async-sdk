// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReplicaPairResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyReplicaPairResponseBody</p>
 */
public class ModifyReplicaPairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyReplicaPairResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReplicaPairResponseBody create() {
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

        public ModifyReplicaPairResponseBody build() {
            return new ModifyReplicaPairResponseBody(this);
        } 

    } 

}
