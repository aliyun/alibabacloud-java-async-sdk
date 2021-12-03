// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutProvisionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>PutProvisionConfigResponseBody</p>
 */
public class PutProvisionConfigResponseBody extends TeaModel {
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
        private Long current; 
        private String resource; 
        private java.util.List < ScheduledActions > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 

        /**
         * <p>实际资源个数</p>
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * <p>资源描述</p>
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>定时策略配置</p>
         */
        public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * <p>目标资源个数</p>
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * <p>指标追踪伸缩策略配置</p>
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
