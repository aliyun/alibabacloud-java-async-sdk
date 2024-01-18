// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGlobalSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGlobalSecurityIPGroupResponseBody</p>
 */
public class DeleteGlobalSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteGlobalSecurityIPGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGlobalSecurityIPGroupResponseBody create() {
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

        public DeleteGlobalSecurityIPGroupResponseBody build() {
            return new DeleteGlobalSecurityIPGroupResponseBody(this);
        } 

    } 

}
