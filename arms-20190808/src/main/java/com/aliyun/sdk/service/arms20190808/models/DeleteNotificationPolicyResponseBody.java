// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNotificationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNotificationPolicyResponseBody</p>
 */
public class DeleteNotificationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteNotificationPolicyResponseBody(Builder builder) {
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNotificationPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The ID of the notification policy.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteNotificationPolicyResponseBody build() {
            return new DeleteNotificationPolicyResponseBody(this);
        } 

    } 

}
