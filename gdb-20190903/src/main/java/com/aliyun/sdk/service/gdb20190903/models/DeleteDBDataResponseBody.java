// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBDataResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDBDataResponseBody</p>
 */
public class DeleteDBDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDBDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBDataResponseBody create() {
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

        public DeleteDBDataResponseBody build() {
            return new DeleteDBDataResponseBody(this);
        } 

    } 

}
