// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntentCreateDTO} extends {@link TeaModel}
 *
 * <p>IntentCreateDTO</p>
 */
public class IntentCreateDTO extends TeaModel {
    @NameInMap("IntentId")
    private Long intentId;

    @NameInMap("Name")
    private String name;

    @NameInMap("RuleCheck")
    private java.util.List < RuleMtopDTO > ruleCheck;

    @NameInMap("Slot")
    private java.util.List < SlotrecordMtopDTO > slot;

    @NameInMap("UserSay")
    private java.util.List < UsersayMtopDTO > userSay;

    private IntentCreateDTO(Builder builder) {
        this.intentId = builder.intentId;
        this.name = builder.name;
        this.ruleCheck = builder.ruleCheck;
        this.slot = builder.slot;
        this.userSay = builder.userSay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntentCreateDTO create() {
        return builder().build();
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ruleCheck
     */
    public java.util.List < RuleMtopDTO > getRuleCheck() {
        return this.ruleCheck;
    }

    /**
     * @return slot
     */
    public java.util.List < SlotrecordMtopDTO > getSlot() {
        return this.slot;
    }

    /**
     * @return userSay
     */
    public java.util.List < UsersayMtopDTO > getUserSay() {
        return this.userSay;
    }

    public static final class Builder {
        private Long intentId; 
        private String name; 
        private java.util.List < RuleMtopDTO > ruleCheck; 
        private java.util.List < SlotrecordMtopDTO > slot; 
        private java.util.List < UsersayMtopDTO > userSay; 

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RuleCheck.
         */
        public Builder ruleCheck(java.util.List < RuleMtopDTO > ruleCheck) {
            this.ruleCheck = ruleCheck;
            return this;
        }

        /**
         * Slot.
         */
        public Builder slot(java.util.List < SlotrecordMtopDTO > slot) {
            this.slot = slot;
            return this;
        }

        /**
         * UserSay.
         */
        public Builder userSay(java.util.List < UsersayMtopDTO > userSay) {
            this.userSay = userSay;
            return this;
        }

        public IntentCreateDTO build() {
            return new IntentCreateDTO(this);
        } 

    } 

}
