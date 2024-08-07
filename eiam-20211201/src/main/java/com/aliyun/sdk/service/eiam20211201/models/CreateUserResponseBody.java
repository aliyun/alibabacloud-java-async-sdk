// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserResponseBody</p>
 */
public class CreateUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private CreateUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String requestId; 
        private String userId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the account.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public CreateUserResponseBody build() {
            return new CreateUserResponseBody(this);
        } 

    } 

}
