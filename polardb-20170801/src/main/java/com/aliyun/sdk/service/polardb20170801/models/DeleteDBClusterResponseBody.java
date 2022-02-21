// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDBClusterResponseBody</p>
 */
public class DeleteDBClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDBClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBClusterResponseBody create() {
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

        public DeleteDBClusterResponseBody build() {
            return new DeleteDBClusterResponseBody(this);
        } 

    } 

}
