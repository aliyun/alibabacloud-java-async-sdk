// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateWebApplicationInput} extends {@link TeaModel}
 *
 * <p>UpdateWebApplicationInput</p>
 */
public class UpdateWebApplicationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("WebNetworkConfig")
    private WebNetworkConfig webNetworkConfig;

    private UpdateWebApplicationInput(Builder builder) {
        this.description = builder.description;
        this.webNetworkConfig = builder.webNetworkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebApplicationInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return webNetworkConfig
     */
    public WebNetworkConfig getWebNetworkConfig() {
        return this.webNetworkConfig;
    }

    public static final class Builder {
        private String description; 
        private WebNetworkConfig webNetworkConfig; 

        private Builder() {
        } 

        private Builder(UpdateWebApplicationInput model) {
            this.description = model.description;
            this.webNetworkConfig = model.webNetworkConfig;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * WebNetworkConfig.
         */
        public Builder webNetworkConfig(WebNetworkConfig webNetworkConfig) {
            this.webNetworkConfig = webNetworkConfig;
            return this;
        }

        public UpdateWebApplicationInput build() {
            return new UpdateWebApplicationInput(this);
        } 

    } 

}
