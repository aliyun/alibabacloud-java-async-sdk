// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlotResponseBody</p>
 */
public class CreateSlotResponseBody extends TeaModel {
    @NameInMap("EndpointIds")
    private String endpointIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlotId")
    private String slotId;

    private CreateSlotResponseBody(Builder builder) {
        this.endpointIds = builder.endpointIds;
        this.requestId = builder.requestId;
        this.slotId = builder.slotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlotResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointIds
     */
    public String getEndpointIds() {
        return this.endpointIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
    }

    public static final class Builder {
        private String endpointIds; 
        private String requestId; 
        private String slotId; 

        /**
         * EndpointIds.
         */
        public Builder endpointIds(String endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.slotId = slotId;
            return this;
        }

        public CreateSlotResponseBody build() {
            return new CreateSlotResponseBody(this);
        } 

    } 

}
