// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDSEntityResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDSEntityResponseBody</p>
 */
public class DeleteDSEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteDSEntityResponseBody(Builder builder) {
        this.entityId = builder.entityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDSEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteDSEntityResponseBody model) {
            this.entityId = model.entityId;
            this.requestId = model.requestId;
        } 

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

        public DeleteDSEntityResponseBody build() {
            return new DeleteDSEntityResponseBody(this);
        } 

    } 

}
