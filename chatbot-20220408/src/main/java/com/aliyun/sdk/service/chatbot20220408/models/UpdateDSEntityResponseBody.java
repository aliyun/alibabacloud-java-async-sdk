// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDSEntityResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDSEntityResponseBody</p>
 */
public class UpdateDSEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDSEntityResponseBody(Builder builder) {
        this.entityId = builder.entityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDSEntityResponseBody create() {
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

        public UpdateDSEntityResponseBody build() {
            return new UpdateDSEntityResponseBody(this);
        } 

    } 

}
