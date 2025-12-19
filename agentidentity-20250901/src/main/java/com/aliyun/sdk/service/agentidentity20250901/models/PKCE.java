// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link PKCE} extends {@link TeaModel}
 *
 * <p>PKCE</p>
 */
public class PKCE extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    private PKCE(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PKCE create() {
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

        private Builder(PKCE model) {
            this.enabled = model.enabled;
        } 

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public PKCE build() {
            return new PKCE(this);
        } 

    } 

}
