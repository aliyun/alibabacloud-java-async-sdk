// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDedicatedHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDedicatedHostGroupResponseBody</p>
 */
public class DeleteDedicatedHostGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDedicatedHostGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDedicatedHostGroupResponseBody create() {
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

        public DeleteDedicatedHostGroupResponseBody build() {
            return new DeleteDedicatedHostGroupResponseBody(this);
        } 

    } 

}
