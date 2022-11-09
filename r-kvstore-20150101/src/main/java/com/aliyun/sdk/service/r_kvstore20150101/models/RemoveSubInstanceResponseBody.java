// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSubInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveSubInstanceResponseBody</p>
 */
public class RemoveSubInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveSubInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSubInstanceResponseBody create() {
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

        public RemoveSubInstanceResponseBody build() {
            return new RemoveSubInstanceResponseBody(this);
        } 

    } 

}
