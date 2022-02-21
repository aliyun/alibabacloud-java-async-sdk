// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasEntryDTO} extends {@link TeaModel}
 *
 * <p>PaasEntryDTO</p>
 */
public class PaasEntryDTO extends TeaModel {
    @NameInMap("PluginFieldDataEntry")
    private PaasEntryPluginFieldDataDTO pluginFieldDataEntry;

    private PaasEntryDTO(Builder builder) {
        this.pluginFieldDataEntry = builder.pluginFieldDataEntry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasEntryDTO create() {
        return builder().build();
    }

    /**
     * @return pluginFieldDataEntry
     */
    public PaasEntryPluginFieldDataDTO getPluginFieldDataEntry() {
        return this.pluginFieldDataEntry;
    }

    public static final class Builder {
        private PaasEntryPluginFieldDataDTO pluginFieldDataEntry; 

        /**
         * PluginFieldDataEntry
         */
        public Builder pluginFieldDataEntry(PaasEntryPluginFieldDataDTO pluginFieldDataEntry) {
            this.pluginFieldDataEntry = pluginFieldDataEntry;
            return this;
        }

        public PaasEntryDTO build() {
            return new PaasEntryDTO(this);
        } 

    } 

}
