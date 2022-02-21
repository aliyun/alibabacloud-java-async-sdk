// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasResponsePluginFieldDataDTO} extends {@link TeaModel}
 *
 * <p>PaasResponsePluginFieldDataDTO</p>
 */
public class PaasResponsePluginFieldDataDTO extends TeaModel {
    @NameInMap("ContentResponse")
    private PaasResponseNodeContentDTO contentResponse;

    @NameInMap("Name")
    private String name;

    private PaasResponsePluginFieldDataDTO(Builder builder) {
        this.contentResponse = builder.contentResponse;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasResponsePluginFieldDataDTO create() {
        return builder().build();
    }

    /**
     * @return contentResponse
     */
    public PaasResponseNodeContentDTO getContentResponse() {
        return this.contentResponse;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private PaasResponseNodeContentDTO contentResponse; 
        private String name; 

        /**
         * ContentResponse
         */
        public Builder contentResponse(PaasResponseNodeContentDTO contentResponse) {
            this.contentResponse = contentResponse;
            return this;
        }

        /**
         * Name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public PaasResponsePluginFieldDataDTO build() {
            return new PaasResponsePluginFieldDataDTO(this);
        } 

    } 

}
