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
 * {@link ServiceDeploymentSpec} extends {@link TeaModel}
 *
 * <p>ServiceDeploymentSpec</p>
 */
public class ServiceDeploymentSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("baseline")
    private ServiceBaseline baseline;

    @com.aliyun.core.annotation.NameInMap("changes")
    private ServiceChanges changes;

    @com.aliyun.core.annotation.NameInMap("skipRemoveResources")
    private Boolean skipRemoveResources;

    @com.aliyun.core.annotation.NameInMap("target")
    private ServiceBaseline target;

    private ServiceDeploymentSpec(Builder builder) {
        this.baseline = builder.baseline;
        this.changes = builder.changes;
        this.skipRemoveResources = builder.skipRemoveResources;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceDeploymentSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseline
     */
    public ServiceBaseline getBaseline() {
        return this.baseline;
    }

    /**
     * @return changes
     */
    public ServiceChanges getChanges() {
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
    public ServiceBaseline getTarget() {
        return this.target;
    }

    public static final class Builder {
        private ServiceBaseline baseline; 
        private ServiceChanges changes; 
        private Boolean skipRemoveResources; 
        private ServiceBaseline target; 

        private Builder() {
        } 

        private Builder(ServiceDeploymentSpec model) {
            this.baseline = model.baseline;
            this.changes = model.changes;
            this.skipRemoveResources = model.skipRemoveResources;
            this.target = model.target;
        } 

        /**
         * baseline.
         */
        public Builder baseline(ServiceBaseline baseline) {
            this.baseline = baseline;
            return this;
        }

        /**
         * changes.
         */
        public Builder changes(ServiceChanges changes) {
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
        public Builder target(ServiceBaseline target) {
            this.target = target;
            return this;
        }

        public ServiceDeploymentSpec build() {
            return new ServiceDeploymentSpec(this);
        } 

    } 

}
