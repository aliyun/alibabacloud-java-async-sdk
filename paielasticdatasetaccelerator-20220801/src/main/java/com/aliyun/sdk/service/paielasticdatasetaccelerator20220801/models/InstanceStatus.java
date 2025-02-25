// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceStatus} extends {@link TeaModel}
 *
 * <p>InstanceStatus</p>
 */
public class InstanceStatus extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Phase")
    private String phase;

    @NameInMap("SlotNum")
    private Integer slotNum;

    @NameInMap("UsedCapacity")
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
