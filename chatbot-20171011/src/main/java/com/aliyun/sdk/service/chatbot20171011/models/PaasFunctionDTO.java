// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasFunctionDTO} extends {@link TeaModel}
 *
 * <p>PaasFunctionDTO</p>
 */
public class PaasFunctionDTO extends TeaModel {
    @NameInMap("PluginFieldDataFunction")
    private PaasFunctionPluginFieldDataDTO pluginFieldDataFunction;

    private PaasFunctionDTO(Builder builder) {
        this.pluginFieldDataFunction = builder.pluginFieldDataFunction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasFunctionDTO create() {
        return builder().build();
    }

    /**
     * @return pluginFieldDataFunction
     */
    public PaasFunctionPluginFieldDataDTO getPluginFieldDataFunction() {
        return this.pluginFieldDataFunction;
    }

    public static final class Builder {
        private PaasFunctionPluginFieldDataDTO pluginFieldDataFunction; 

        /**
         * PluginFieldDataFunction
         */
        public Builder pluginFieldDataFunction(PaasFunctionPluginFieldDataDTO pluginFieldDataFunction) {
            this.pluginFieldDataFunction = pluginFieldDataFunction;
            return this;
        }

        public PaasFunctionDTO build() {
            return new PaasFunctionDTO(this);
        } 

    } 

}
