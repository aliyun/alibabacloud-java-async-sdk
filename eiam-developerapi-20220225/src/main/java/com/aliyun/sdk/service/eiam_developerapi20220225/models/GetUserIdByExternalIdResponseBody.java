// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByExternalIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserIdByExternalIdResponseBody</p>
 */
public class GetUserIdByExternalIdResponseBody extends TeaModel {
    @NameInMap("userId")
    private String userId;

    private GetUserIdByExternalIdResponseBody(Builder builder) {
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdByExternalIdResponseBody create() {
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
         * 账户ID
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetUserIdByExternalIdResponseBody build() {
            return new GetUserIdByExternalIdResponseBody(this);
        } 

    } 

}
