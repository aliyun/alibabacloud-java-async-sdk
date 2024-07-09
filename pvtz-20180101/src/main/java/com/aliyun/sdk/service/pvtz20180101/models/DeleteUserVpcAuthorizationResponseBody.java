// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserVpcAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserVpcAuthorizationResponseBody</p>
 */
public class DeleteUserVpcAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteUserVpcAuthorizationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserVpcAuthorizationResponseBody create() {
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

        public DeleteUserVpcAuthorizationResponseBody build() {
            return new DeleteUserVpcAuthorizationResponseBody(this);
        } 

    } 

}
