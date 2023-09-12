// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByEmailResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserIdByEmailResponseBody</p>
 */
public class GetUserIdByEmailResponseBody extends TeaModel {
    @NameInMap("userId")
    private String userId;

    private GetUserIdByEmailResponseBody(Builder builder) {
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdByEmailResponseBody create() {
        return builder().build();
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String userId; 

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetUserIdByEmailResponseBody build() {
            return new GetUserIdByEmailResponseBody(this);
        } 

    } 

}
