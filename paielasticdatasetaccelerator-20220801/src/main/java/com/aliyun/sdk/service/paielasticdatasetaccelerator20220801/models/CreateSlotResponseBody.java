// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link CreateSlotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlotResponseBody</p>
 */
public class CreateSlotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointIds")
    private String endpointIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlotId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateSlotResponseBody model) {
            this.endpointIds = model.endpointIds;
            this.requestId = model.requestId;
            this.slotId = model.slotId;
        } 

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
