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
 * {@link QueryStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStatisticResponseBody</p>
 */
public class QueryStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCapacityEachType")
    private java.util.Map<String, ?> instanceCapacityEachType;

    @com.aliyun.core.annotation.NameInMap("InstanceNumEachType")
    private java.util.Map<String, ?> instanceNumEachType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlotNumEachType")
    private java.util.Map<String, ?> slotNumEachType;

    private QueryStatisticResponseBody(Builder builder) {
        this.instanceCapacityEachType = builder.instanceCapacityEachType;
        this.instanceNumEachType = builder.instanceNumEachType;
        this.requestId = builder.requestId;
        this.slotNumEachType = builder.slotNumEachType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceCapacityEachType
     */
    public java.util.Map<String, ?> getInstanceCapacityEachType() {
        return this.instanceCapacityEachType;
    }

    /**
     * @return instanceNumEachType
     */
    public java.util.Map<String, ?> getInstanceNumEachType() {
        return this.instanceNumEachType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slotNumEachType
     */
    public java.util.Map<String, ?> getSlotNumEachType() {
        return this.slotNumEachType;
    }

    public static final class Builder {
        private java.util.Map<String, ?> instanceCapacityEachType; 
        private java.util.Map<String, ?> instanceNumEachType; 
        private String requestId; 
        private java.util.Map<String, ?> slotNumEachType; 

        private Builder() {
        } 

        private Builder(QueryStatisticResponseBody model) {
            this.instanceCapacityEachType = model.instanceCapacityEachType;
            this.instanceNumEachType = model.instanceNumEachType;
            this.requestId = model.requestId;
            this.slotNumEachType = model.slotNumEachType;
        } 

        /**
         * InstanceCapacityEachType.
         */
        public Builder instanceCapacityEachType(java.util.Map<String, ?> instanceCapacityEachType) {
            this.instanceCapacityEachType = instanceCapacityEachType;
            return this;
        }

        /**
         * InstanceNumEachType.
         */
        public Builder instanceNumEachType(java.util.Map<String, ?> instanceNumEachType) {
            this.instanceNumEachType = instanceNumEachType;
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
         * SlotNumEachType.
         */
        public Builder slotNumEachType(java.util.Map<String, ?> slotNumEachType) {
            this.slotNumEachType = slotNumEachType;
            return this;
        }

        public QueryStatisticResponseBody build() {
            return new QueryStatisticResponseBody(this);
        } 

    } 

}
