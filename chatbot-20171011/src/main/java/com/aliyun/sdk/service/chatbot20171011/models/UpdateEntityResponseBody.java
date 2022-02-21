// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEntityResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEntityResponseBody</p>
 */
public class UpdateEntityResponseBody extends TeaModel {
    @NameInMap("EntityId")
    private Long entityId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateEntityResponseBody(Builder builder) {
        this.entityId = builder.entityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long entityId; 
        private String requestId; 

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateEntityResponseBody build() {
            return new UpdateEntityResponseBody(this);
        } 

    } 

}
