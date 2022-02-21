// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromGroupResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveUserFromGroupResponseBody</p>
 */
public class RemoveUserFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveUserFromGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserFromGroupResponseBody create() {
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

        public RemoveUserFromGroupResponseBody build() {
            return new RemoveUserFromGroupResponseBody(this);
        } 

    } 

}
