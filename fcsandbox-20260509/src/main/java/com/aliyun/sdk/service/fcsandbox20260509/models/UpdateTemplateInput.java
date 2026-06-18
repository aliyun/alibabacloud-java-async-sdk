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

    private UpdateTemplateInput(Builder builder) {
        this.logConfiguration = builder.logConfiguration;
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

    public static final class Builder {
        private LogConfiguration logConfiguration; 

        private Builder() {
        } 

        private Builder(UpdateTemplateInput model) {
            this.logConfiguration = model.logConfiguration;
        } 

        /**
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        public UpdateTemplateInput build() {
            return new UpdateTemplateInput(this);
        } 

    } 

}
