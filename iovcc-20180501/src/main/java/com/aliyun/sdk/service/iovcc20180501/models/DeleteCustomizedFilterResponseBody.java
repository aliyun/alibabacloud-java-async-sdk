// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizedFilterResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCustomizedFilterResponseBody</p>
 */
public class DeleteCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteCustomizedFilterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomizedFilterResponseBody create() {
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

        public DeleteCustomizedFilterResponseBody build() {
            return new DeleteCustomizedFilterResponseBody(this);
        } 

    } 

}
