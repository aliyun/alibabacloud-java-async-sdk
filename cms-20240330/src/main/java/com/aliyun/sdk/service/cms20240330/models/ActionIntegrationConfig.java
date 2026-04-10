// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ActionIntegrationConfig} extends {@link TeaModel}
 *
 * <p>ActionIntegrationConfig</p>
 */
public class ActionIntegrationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actions")
    private java.util.List<String> actions;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private ActionIntegrationConfig(Builder builder) {
        this.actions = builder.actions;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActionIntegrationConfig create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private java.util.List<String> actions; 
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(ActionIntegrationConfig model) {
            this.actions = model.actions;
            this.enabled = model.enabled;
        } 

        /**
         * <p>行动集成 ID 列表</p>
         */
        public Builder actions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>是否启用行动集成</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public ActionIntegrationConfig build() {
            return new ActionIntegrationConfig(this);
        } 

    } 

}
