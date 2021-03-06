// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeginSessionResponseBody} extends {@link TeaModel}
 *
 * <p>BeginSessionResponseBody</p>
 */
public class BeginSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WelcomeMessage")
    private String welcomeMessage;

    private BeginSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.welcomeMessage = builder.welcomeMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return welcomeMessage
     */
    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String welcomeMessage; 

        /**
         * 请求id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 欢迎语
         */
        public Builder welcomeMessage(String welcomeMessage) {
            this.welcomeMessage = welcomeMessage;
            return this;
        }

        public BeginSessionResponseBody build() {
            return new BeginSessionResponseBody(this);
        } 

    } 

}
