// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasResponseDTO} extends {@link TeaModel}
 *
 * <p>PaasResponseDTO</p>
 */
public class PaasResponseDTO extends TeaModel {
    @NameInMap("PluginFieldDataResponse")
    private PaasResponsePluginFieldDataDTO pluginFieldDataResponse;

    private PaasResponseDTO(Builder builder) {
        this.pluginFieldDataResponse = builder.pluginFieldDataResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasResponseDTO create() {
        return builder().build();
    }

    /**
     * @return pluginFieldDataResponse
     */
    public PaasResponsePluginFieldDataDTO getPluginFieldDataResponse() {
        return this.pluginFieldDataResponse;
    }

    public static final class Builder {
        private PaasResponsePluginFieldDataDTO pluginFieldDataResponse; 

        /**
         * PluginFieldDataResponse.
         */
        public Builder pluginFieldDataResponse(PaasResponsePluginFieldDataDTO pluginFieldDataResponse) {
            this.pluginFieldDataResponse = pluginFieldDataResponse;
            return this;
        }

        public PaasResponseDTO build() {
            return new PaasResponseDTO(this);
        } 

    } 

}
