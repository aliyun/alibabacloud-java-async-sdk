// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKnowledgeResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteKnowledgeResponseBody</p>
 */
public class DeleteKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteKnowledgeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKnowledgeResponseBody create() {
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

        public DeleteKnowledgeResponseBody build() {
            return new DeleteKnowledgeResponseBody(this);
        } 

    } 

}
