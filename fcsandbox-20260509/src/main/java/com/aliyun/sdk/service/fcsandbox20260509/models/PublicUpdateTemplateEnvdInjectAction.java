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
 * {@link PublicUpdateTemplateEnvdInjectAction} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateEnvdInjectAction</p>
 */
public class PublicUpdateTemplateEnvdInjectAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private PublicUpdateTemplateEnvdInjectAction(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateEnvdInjectAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateEnvdInjectAction model) {
            this.enabled = model.enabled;
        } 

        /**
         * <p>Specifies whether envd injection is enabled.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public PublicUpdateTemplateEnvdInjectAction build() {
            return new PublicUpdateTemplateEnvdInjectAction(this);
        } 

    } 

}
