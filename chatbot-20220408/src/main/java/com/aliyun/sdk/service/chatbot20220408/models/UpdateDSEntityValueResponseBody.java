// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDSEntityValueResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDSEntityValueResponseBody</p>
 */
public class UpdateDSEntityValueResponseBody extends TeaModel {
    @NameInMap("EntityValueId")
    private Long entityValueId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateDSEntityValueResponseBody(Builder builder) {
        this.entityValueId = builder.entityValueId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDSEntityValueResponseBody create() {
        return builder().build();
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

        /**
         * EntityValueId.
         */
        public Builder entityValueId(Long entityValueId) {
            this.entityValueId = entityValueId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDSEntityValueResponseBody build() {
            return new UpdateDSEntityValueResponseBody(this);
        } 

    } 

}
