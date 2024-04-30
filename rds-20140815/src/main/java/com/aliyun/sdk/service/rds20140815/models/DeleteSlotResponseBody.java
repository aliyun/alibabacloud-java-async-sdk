// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSlotResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSlotResponseBody</p>
 */
public class DeleteSlotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlotName")
    private String slotName;

    private DeleteSlotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slotName = builder.slotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSlotResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slotName
     */
    public String getSlotName() {
        return this.slotName;
    }

    public static final class Builder {
        private String requestId; 
        private String slotName; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the replication slot.
         */
        public Builder slotName(String slotName) {
            this.slotName = slotName;
            return this;
        }

        public DeleteSlotResponseBody build() {
            return new DeleteSlotResponseBody(this);
        } 

    } 

}
