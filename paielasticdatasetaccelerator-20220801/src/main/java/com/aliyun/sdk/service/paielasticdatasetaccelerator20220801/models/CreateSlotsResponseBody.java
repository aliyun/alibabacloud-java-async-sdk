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
 * {@link CreateSlotsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlotsResponseBody</p>
 */
public class CreateSlotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlotIds")
    private String slotIds;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private java.util.Map<String, String> summary;

    private CreateSlotsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slotIds = builder.slotIds;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlotsResponseBody create() {
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
     * @return slotIds
     */
    public String getSlotIds() {
        return this.slotIds;
    }

    /**
     * @return summary
     */
    public java.util.Map<String, String> getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private String requestId; 
        private String slotIds; 
        private java.util.Map<String, String> summary; 

        private Builder() {
        } 

        private Builder(CreateSlotsResponseBody model) {
            this.requestId = model.requestId;
            this.slotIds = model.slotIds;
            this.summary = model.summary;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlotIds.
         */
        public Builder slotIds(String slotIds) {
            this.slotIds = slotIds;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(java.util.Map<String, String> summary) {
            this.summary = summary;
            return this;
        }

        public CreateSlotsResponseBody build() {
            return new CreateSlotsResponseBody(this);
        } 

    } 

}
