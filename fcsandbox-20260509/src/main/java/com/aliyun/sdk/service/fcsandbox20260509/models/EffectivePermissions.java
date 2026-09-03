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
 * {@link EffectivePermissions} extends {@link TeaModel}
 *
 * <p>EffectivePermissions</p>
 */
public class EffectivePermissions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actions")
    private java.util.List<String> actions;

    @com.aliyun.core.annotation.NameInMap("capabilities")
    private java.util.List<String> capabilities;

    private EffectivePermissions(Builder builder) {
        this.actions = builder.actions;
        this.capabilities = builder.capabilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EffectivePermissions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<String> getActions() {
        return this.actions;
    }

    /**
     * @return capabilities
     */
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public static final class Builder {
        private java.util.List<String> actions; 
        private java.util.List<String> capabilities; 

        private Builder() {
        } 

        private Builder(EffectivePermissions model) {
            this.actions = model.actions;
            this.capabilities = model.capabilities;
        } 

        /**
         * actions.
         */
        public Builder actions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * capabilities.
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public EffectivePermissions build() {
            return new EffectivePermissions(this);
        } 

    } 

}
