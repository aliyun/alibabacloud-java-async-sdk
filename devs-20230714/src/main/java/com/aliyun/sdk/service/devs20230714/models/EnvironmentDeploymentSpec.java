// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link EnvironmentDeploymentSpec} extends {@link TeaModel}
 *
 * <p>EnvironmentDeploymentSpec</p>
 */
public class EnvironmentDeploymentSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("baseline")
    private EnvironmentSnapshot baseline;

    @com.aliyun.core.annotation.NameInMap("changes")
    private EnvironmentChanges changes;

    @com.aliyun.core.annotation.NameInMap("skipRemoveResources")
    private Boolean skipRemoveResources;

    @com.aliyun.core.annotation.NameInMap("target")
    private EnvironmentStagedConfigs target;

    @com.aliyun.core.annotation.NameInMap("webhookCodeContext")
    private WebhookCodeContext webhookCodeContext;

    private EnvironmentDeploymentSpec(Builder builder) {
        this.baseline = builder.baseline;
        this.changes = builder.changes;
        this.skipRemoveResources = builder.skipRemoveResources;
        this.target = builder.target;
        this.webhookCodeContext = builder.webhookCodeContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentDeploymentSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseline
     */
    public EnvironmentSnapshot getBaseline() {
        return this.baseline;
    }

    /**
     * @return changes
     */
    public EnvironmentChanges getChanges() {
        return this.changes;
    }

    /**
     * @return skipRemoveResources
     */
    public Boolean getSkipRemoveResources() {
        return this.skipRemoveResources;
    }

    /**
     * @return target
     */
    public EnvironmentStagedConfigs getTarget() {
        return this.target;
    }

    /**
     * @return webhookCodeContext
     */
    public WebhookCodeContext getWebhookCodeContext() {
        return this.webhookCodeContext;
    }

    public static final class Builder {
        private EnvironmentSnapshot baseline; 
        private EnvironmentChanges changes; 
        private Boolean skipRemoveResources; 
        private EnvironmentStagedConfigs target; 
        private WebhookCodeContext webhookCodeContext; 

        private Builder() {
        } 

        private Builder(EnvironmentDeploymentSpec model) {
            this.baseline = model.baseline;
            this.changes = model.changes;
            this.skipRemoveResources = model.skipRemoveResources;
            this.target = model.target;
            this.webhookCodeContext = model.webhookCodeContext;
        } 

        /**
         * baseline.
         */
        public Builder baseline(EnvironmentSnapshot baseline) {
            this.baseline = baseline;
            return this;
        }

        /**
         * changes.
         */
        public Builder changes(EnvironmentChanges changes) {
            this.changes = changes;
            return this;
        }

        /**
         * skipRemoveResources.
         */
        public Builder skipRemoveResources(Boolean skipRemoveResources) {
            this.skipRemoveResources = skipRemoveResources;
            return this;
        }

        /**
         * target.
         */
        public Builder target(EnvironmentStagedConfigs target) {
            this.target = target;
            return this;
        }

        /**
         * webhookCodeContext.
         */
        public Builder webhookCodeContext(WebhookCodeContext webhookCodeContext) {
            this.webhookCodeContext = webhookCodeContext;
            return this;
        }

        public EnvironmentDeploymentSpec build() {
            return new EnvironmentDeploymentSpec(this);
        } 

    } 

}
