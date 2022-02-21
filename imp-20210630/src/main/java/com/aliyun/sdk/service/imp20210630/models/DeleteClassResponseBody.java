// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClassResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteClassResponseBody</p>
 */
public class DeleteClassResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteClassResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClassResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteClassResponseBody build() {
            return new DeleteClassResponseBody(this);
        } 

    } 

}
