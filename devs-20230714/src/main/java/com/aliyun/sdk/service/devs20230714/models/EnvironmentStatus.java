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
 * {@link EnvironmentStatus} extends {@link TeaModel}
 *
 * <p>EnvironmentStatus</p>
 */
public class EnvironmentStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latestEnvironmentDeploymentName")
    private String latestEnvironmentDeploymentName;

    @com.aliyun.core.annotation.NameInMap("observedGeneration")
    private Long observedGeneration;

    @com.aliyun.core.annotation.NameInMap("observedTime")
    private String observedTime;

    @com.aliyun.core.annotation.NameInMap("servicesInstances")
    private java.util.Map<String, ServiceInstance> servicesInstances;

    @com.aliyun.core.annotation.NameInMap("servicesWithPendingChanges")
    private java.util.List<String> servicesWithPendingChanges;

    private EnvironmentStatus(Builder builder) {
        this.latestEnvironmentDeploymentName = builder.latestEnvironmentDeploymentName;
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.servicesInstances = builder.servicesInstances;
        this.servicesWithPendingChanges = builder.servicesWithPendingChanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestEnvironmentDeploymentName
     */
    public String getLatestEnvironmentDeploymentName() {
        return this.latestEnvironmentDeploymentName;
    }

    /**
     * @return observedGeneration
     */
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * @return observedTime
     */
    public String getObservedTime() {
        return this.observedTime;
    }

    /**
     * @return servicesInstances
     */
    public java.util.Map<String, ServiceInstance> getServicesInstances() {
        return this.servicesInstances;
    }

    /**
     * @return servicesWithPendingChanges
     */
    public java.util.List<String> getServicesWithPendingChanges() {
        return this.servicesWithPendingChanges;
    }

    public static final class Builder {
        private String latestEnvironmentDeploymentName; 
        private Long observedGeneration; 
        private String observedTime; 
        private java.util.Map<String, ServiceInstance> servicesInstances; 
        private java.util.List<String> servicesWithPendingChanges; 

        private Builder() {
        } 

        private Builder(EnvironmentStatus model) {
            this.latestEnvironmentDeploymentName = model.latestEnvironmentDeploymentName;
            this.observedGeneration = model.observedGeneration;
            this.observedTime = model.observedTime;
            this.servicesInstances = model.servicesInstances;
            this.servicesWithPendingChanges = model.servicesWithPendingChanges;
        } 

        /**
         * latestEnvironmentDeploymentName.
         */
        public Builder latestEnvironmentDeploymentName(String latestEnvironmentDeploymentName) {
            this.latestEnvironmentDeploymentName = latestEnvironmentDeploymentName;
            return this;
        }

        /**
         * observedGeneration.
         */
        public Builder observedGeneration(Long observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * observedTime.
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        /**
         * servicesInstances.
         */
        public Builder servicesInstances(java.util.Map<String, ServiceInstance> servicesInstances) {
            this.servicesInstances = servicesInstances;
            return this;
        }

        /**
         * servicesWithPendingChanges.
         */
        public Builder servicesWithPendingChanges(java.util.List<String> servicesWithPendingChanges) {
            this.servicesWithPendingChanges = servicesWithPendingChanges;
            return this;
        }

        public EnvironmentStatus build() {
            return new EnvironmentStatus(this);
        } 

    } 

}
