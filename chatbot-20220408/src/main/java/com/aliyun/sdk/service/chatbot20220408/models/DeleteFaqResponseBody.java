// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaqResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFaqResponseBody</p>
 */
public class DeleteFaqResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteFaqResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaqResponseBody create() {
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

        public DeleteFaqResponseBody build() {
            return new DeleteFaqResponseBody(this);
        } 

    } 

}
