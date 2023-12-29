// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProvisionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>PutProvisionConfigResponseBody</p>
 */
public class PutProvisionConfigResponseBody extends TeaModel {
    @NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @NameInMap("current")
    private Long current;

    @NameInMap("resource")
    private String resource;

    @NameInMap("scheduledActions")
    private java.util.List < ScheduledActions > scheduledActions;

    @NameInMap("target")
    private Long target;

    @NameInMap("targetTrackingPolicies")
    private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;

    private PutProvisionConfigResponseBody(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.current = builder.current;
        this.resource = builder.resource;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProvisionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return alwaysAllocateCPU
     */
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return scheduledActions
     */
    public java.util.List < ScheduledActions > getScheduledActions() {
        return this.scheduledActions;
    }

    /**
     * @return target
     */
    public Long getTarget() {
        return this.target;
    }

    /**
     * @return targetTrackingPolicies
     */
    public java.util.List < TargetTrackingPolicies > getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    public static final class Builder {
        private Boolean alwaysAllocateCPU; 
        private Long current; 
        private String resource; 
        private java.util.List < ScheduledActions > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 

        /**
         * Specifies whether to always allocate CPU to a function instance.
         */
        public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }

        /**
         * The actual number of provisioned instances.
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * The description of the resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * The configurations of scheduled auto scaling.
         */
        public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * The number of target provisioned instances.
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * The configurations of metric-based auto scaling.
         */
        public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public PutProvisionConfigResponseBody build() {
            return new PutProvisionConfigResponseBody(this);
        } 

    } 

}
