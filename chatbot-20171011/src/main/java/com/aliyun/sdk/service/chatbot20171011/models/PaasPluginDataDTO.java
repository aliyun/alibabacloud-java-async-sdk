// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasPluginDataDTO} extends {@link TeaModel}
 *
 * <p>PaasPluginDataDTO</p>
 */
public class PaasPluginDataDTO extends TeaModel {
    @NameInMap("Entry")
    private PaasEntryDTO entry;

    @NameInMap("Function")
    private PaasFunctionDTO function;

    @NameInMap("Response")
    private PaasResponseDTO response;

    @NameInMap("Slot")
    private PaasSlotDTO slot;

    private PaasPluginDataDTO(Builder builder) {
        this.entry = builder.entry;
        this.function = builder.function;
        this.response = builder.response;
        this.slot = builder.slot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasPluginDataDTO create() {
        return builder().build();
    }

    /**
     * @return entry
     */
    public PaasEntryDTO getEntry() {
        return this.entry;
    }

    /**
     * @return function
     */
    public PaasFunctionDTO getFunction() {
        return this.function;
    }

    /**
     * @return response
     */
    public PaasResponseDTO getResponse() {
        return this.response;
    }

    /**
     * @return slot
     */
    public PaasSlotDTO getSlot() {
        return this.slot;
    }

    public static final class Builder {
        private PaasEntryDTO entry; 
        private PaasFunctionDTO function; 
        private PaasResponseDTO response; 
        private PaasSlotDTO slot; 

        /**
         * Entry.
         */
        public Builder entry(PaasEntryDTO entry) {
            this.entry = entry;
            return this;
        }

        /**
         * Function.
         */
        public Builder function(PaasFunctionDTO function) {
            this.function = function;
            return this;
        }

        /**
         * Response.
         */
        public Builder response(PaasResponseDTO response) {
            this.response = response;
            return this;
        }

        /**
         * Slot.
         */
        public Builder slot(PaasSlotDTO slot) {
            this.slot = slot;
            return this;
        }

        public PaasPluginDataDTO build() {
            return new PaasPluginDataDTO(this);
        } 

    } 

}
