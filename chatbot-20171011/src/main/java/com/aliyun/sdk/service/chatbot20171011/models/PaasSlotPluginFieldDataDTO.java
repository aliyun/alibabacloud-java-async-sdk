// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasSlotPluginFieldDataDTO} extends {@link TeaModel}
 *
 * <p>PaasSlotPluginFieldDataDTO</p>
 */
public class PaasSlotPluginFieldDataDTO extends TeaModel {
    @NameInMap("ContentSlot")
    private java.util.List < PaasSlotConfigDTO > contentSlot;

    @NameInMap("IntentId")
    private String intentId;

    @NameInMap("IntentName")
    private String intentName;

    @NameInMap("IsSysIntent")
    private Boolean isSysIntent;

    @NameInMap("Name")
    private String name;

    private PaasSlotPluginFieldDataDTO(Builder builder) {
        this.contentSlot = builder.contentSlot;
        this.intentId = builder.intentId;
        this.intentName = builder.intentName;
        this.isSysIntent = builder.isSysIntent;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasSlotPluginFieldDataDTO create() {
        return builder().build();
    }

    /**
     * @return contentSlot
     */
    public java.util.List < PaasSlotConfigDTO > getContentSlot() {
        return this.contentSlot;
    }

    /**
     * @return intentId
     */
    public String getIntentId() {
        return this.intentId;
    }

    /**
     * @return intentName
     */
    public String getIntentName() {
        return this.intentName;
    }

    /**
     * @return isSysIntent
     */
    public Boolean getIsSysIntent() {
        return this.isSysIntent;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.List < PaasSlotConfigDTO > contentSlot; 
        private String intentId; 
        private String intentName; 
        private Boolean isSysIntent; 
        private String name; 

        /**
         * ContentSlot.
         */
        public Builder contentSlot(java.util.List < PaasSlotConfigDTO > contentSlot) {
            this.contentSlot = contentSlot;
            return this;
        }

        /**
         * IntentId.
         */
        public Builder intentId(String intentId) {
            this.intentId = intentId;
            return this;
        }

        /**
         * IntentName.
         */
        public Builder intentName(String intentName) {
            this.intentName = intentName;
            return this;
        }

        /**
         * IsSysIntent.
         */
        public Builder isSysIntent(Boolean isSysIntent) {
            this.isSysIntent = isSysIntent;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public PaasSlotPluginFieldDataDTO build() {
            return new PaasSlotPluginFieldDataDTO(this);
        } 

    } 

}
