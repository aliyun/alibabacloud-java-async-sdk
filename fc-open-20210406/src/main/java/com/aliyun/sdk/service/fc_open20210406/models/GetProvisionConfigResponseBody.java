// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProvisionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetProvisionConfigResponseBody</p>
 */
public class GetProvisionConfigResponseBody extends TeaModel {
    @NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @NameInMap("current")
    private Long current;

    @NameInMap("currentError")
    private String currentError;

    @NameInMap("resource")
    private String resource;

    @NameInMap("scheduledActions")
    private java.util.List < ScheduledActions > scheduledActions;

    @NameInMap("target")
    private Long target;

    @NameInMap("targetTrackingPolicies")
    private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;

    private GetProvisionConfigResponseBody(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.current = builder.current;
        this.currentError = builder.currentError;
        this.resource = builder.resource;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionConfigResponseBody create() {
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
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
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
        private String currentError; 
        private String resource; 
        private java.util.List < ScheduledActions > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 

        /**
         * 是否始终分配CPU给函数实例。
         */
        public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }

        /**
         * 实际资源个数
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * 预留实例创建失败时的错误信息
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * 资源描述
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * 定时策略配置
         */
        public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * 目标资源个数
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * 指标追踪伸缩策略配置
         */
        public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public GetProvisionConfigResponseBody build() {
            return new GetProvisionConfigResponseBody(this);
        } 

    } 

}
