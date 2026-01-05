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
 * {@link InstanceStatus} extends {@link TeaModel}
 *
 * <p>InstanceStatus</p>
 */
public class InstanceStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("SlotNum")
    private Integer slotNum;

    @com.aliyun.core.annotation.NameInMap("UsedCapacity")
    private String usedCapacity;

    private InstanceStatus(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.phase = builder.phase;
        this.slotNum = builder.slotNum;
        this.usedCapacity = builder.usedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return slotNum
     */
    public Integer getSlotNum() {
        return this.slotNum;
    }

    /**
     * @return usedCapacity
     */
    public String getUsedCapacity() {
        return this.usedCapacity;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String phase; 
        private Integer slotNum; 
        private String usedCapacity; 

        private Builder() {
        } 

        private Builder(InstanceStatus model) {
            this.code = model.code;
            this.message = model.message;
            this.phase = model.phase;
            this.slotNum = model.slotNum;
            this.usedCapacity = model.usedCapacity;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * SlotNum.
         */
        public Builder slotNum(Integer slotNum) {
            this.slotNum = slotNum;
            return this;
        }

        /**
         * UsedCapacity.
         */
        public Builder usedCapacity(String usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }

        public InstanceStatus build() {
            return new InstanceStatus(this);
        } 

    } 

}
