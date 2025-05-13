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
 * {@link AlertRuleAction} extends {@link TeaModel}
 *
 * <p>AlertRuleAction</p>
 */
public class AlertRuleAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actions")
    private java.util.List<String> actions;

    private AlertRuleAction(Builder builder) {
        this.actions = builder.actions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAction create() {
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

    public static final class Builder {
        private java.util.List<String> actions; 

        private Builder() {
        } 

        private Builder(AlertRuleAction model) {
            this.actions = model.actions;
        } 

        /**
         * actions.
         */
        public Builder actions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }

        public AlertRuleAction build() {
            return new AlertRuleAction(this);
        } 

    } 

}
