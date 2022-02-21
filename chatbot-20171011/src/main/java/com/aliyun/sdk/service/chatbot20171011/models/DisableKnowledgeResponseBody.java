// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableKnowledgeResponseBody} extends {@link TeaModel}
 *
 * <p>DisableKnowledgeResponseBody</p>
 */
public class DisableKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableKnowledgeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableKnowledgeResponseBody create() {
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

        public DisableKnowledgeResponseBody build() {
            return new DisableKnowledgeResponseBody(this);
        } 

    } 

}
