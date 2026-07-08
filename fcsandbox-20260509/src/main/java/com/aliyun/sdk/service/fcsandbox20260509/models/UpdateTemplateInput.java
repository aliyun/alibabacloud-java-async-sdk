// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link UpdateTemplateInput} extends {@link TeaModel}
 *
 * <p>UpdateTemplateInput</p>
 */
public class UpdateTemplateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    private UpdateTemplateInput(Builder builder) {
        this.logConfiguration = builder.logConfiguration;
        this.networkConfiguration = builder.networkConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public static final class Builder {
        private LogConfiguration logConfiguration; 
        private NetworkConfiguration networkConfiguration; 

        private Builder() {
        } 

        private Builder(UpdateTemplateInput model) {
            this.logConfiguration = model.logConfiguration;
            this.networkConfiguration = model.networkConfiguration;
        } 

        /**
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public UpdateTemplateInput build() {
            return new UpdateTemplateInput(this);
        } 

    } 

}
