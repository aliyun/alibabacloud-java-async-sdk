// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
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
