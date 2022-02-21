// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasSlotDTO} extends {@link TeaModel}
 *
 * <p>PaasSlotDTO</p>
 */
public class PaasSlotDTO extends TeaModel {
    @NameInMap("PluginFieldDataSlot")
    private PaasSlotPluginFieldDataDTO pluginFieldDataSlot;

    private PaasSlotDTO(Builder builder) {
        this.pluginFieldDataSlot = builder.pluginFieldDataSlot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasSlotDTO create() {
        return builder().build();
    }

    /**
     * @return pluginFieldDataSlot
     */
    public PaasSlotPluginFieldDataDTO getPluginFieldDataSlot() {
        return this.pluginFieldDataSlot;
    }

    public static final class Builder {
        private PaasSlotPluginFieldDataDTO pluginFieldDataSlot; 

        /**
         * PluginFieldDataSlot.
         */
        public Builder pluginFieldDataSlot(PaasSlotPluginFieldDataDTO pluginFieldDataSlot) {
            this.pluginFieldDataSlot = pluginFieldDataSlot;
            return this;
        }

        public PaasSlotDTO build() {
            return new PaasSlotDTO(this);
        } 

    } 

}
