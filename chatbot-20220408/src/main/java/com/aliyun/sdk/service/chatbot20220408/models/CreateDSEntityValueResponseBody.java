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
 * {@link CreateDSEntityValueResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDSEntityValueResponseBody</p>
 */
public class CreateDSEntityValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityValueId")
    private Long entityValueId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDSEntityValueResponseBody(Builder builder) {
        this.entityValueId = builder.entityValueId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDSEntityValueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityValueId
     */
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long entityValueId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDSEntityValueResponseBody model) {
            this.entityValueId = model.entityValueId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The entity member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2434543453</p>
         */
        public Builder entityValueId(Long entityValueId) {
            this.entityValueId = entityValueId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g763hg48j3f3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDSEntityValueResponseBody build() {
            return new CreateDSEntityValueResponseBody(this);
        } 

    } 

}
