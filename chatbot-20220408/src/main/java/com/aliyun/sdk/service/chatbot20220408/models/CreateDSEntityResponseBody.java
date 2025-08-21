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
 * {@link CreateDSEntityResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDSEntityResponseBody</p>
 */
public class CreateDSEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDSEntityResponseBody(Builder builder) {
        this.entityId = builder.entityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDSEntityResponseBody create() {
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

        private Builder(CreateDSEntityResponseBody model) {
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

        public CreateDSEntityResponseBody build() {
            return new CreateDSEntityResponseBody(this);
        } 

    } 

}
