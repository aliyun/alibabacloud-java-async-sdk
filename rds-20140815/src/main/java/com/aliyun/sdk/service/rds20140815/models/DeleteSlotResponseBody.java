// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteSlotResponseBody model) {
            this.requestId = model.requestId;
            this.slotName = model.slotName;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2875D608-A228-53D7-B8C9-35F13EDCF36D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>slot_test01</p>
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
