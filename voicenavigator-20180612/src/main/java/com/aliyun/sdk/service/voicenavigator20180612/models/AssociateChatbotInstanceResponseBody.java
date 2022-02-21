// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateChatbotInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateChatbotInstanceResponseBody</p>
 */
public class AssociateChatbotInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AssociateChatbotInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateChatbotInstanceResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateChatbotInstanceResponseBody build() {
            return new AssociateChatbotInstanceResponseBody(this);
        } 

    } 

}
