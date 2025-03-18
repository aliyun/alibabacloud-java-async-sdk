// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GetUserIdByPhoneNumberResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserIdByPhoneNumberResponseBody</p>
 */
public class GetUserIdByPhoneNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private GetUserIdByPhoneNumberResponseBody(Builder builder) {
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdByPhoneNumberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String userId; 

        private Builder() {
        } 

        private Builder(GetUserIdByPhoneNumberResponseBody model) {
            this.userId = model.userId;
        } 

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetUserIdByPhoneNumberResponseBody build() {
            return new GetUserIdByPhoneNumberResponseBody(this);
        } 

    } 

}
