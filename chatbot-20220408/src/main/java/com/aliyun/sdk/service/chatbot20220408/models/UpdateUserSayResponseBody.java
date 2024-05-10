// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserSayResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserSayResponseBody</p>
 */
public class UpdateUserSayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserSayId")
    private Long userSayId;

    private UpdateUserSayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userSayId = builder.userSayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserSayResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userSayId
     */
    public Long getUserSayId() {
        return this.userSayId;
    }

    public static final class Builder {
        private String requestId; 
        private Long userSayId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserSayId.
         */
        public Builder userSayId(Long userSayId) {
            this.userSayId = userSayId;
            return this;
        }

        public UpdateUserSayResponseBody build() {
            return new UpdateUserSayResponseBody(this);
        } 

    } 

}
