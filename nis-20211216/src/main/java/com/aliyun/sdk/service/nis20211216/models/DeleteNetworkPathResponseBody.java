// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkPathResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNetworkPathResponseBody</p>
 */
public class DeleteNetworkPathResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteNetworkPathResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkPathResponseBody create() {
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

        public DeleteNetworkPathResponseBody build() {
            return new DeleteNetworkPathResponseBody(this);
        } 

    } 

}
