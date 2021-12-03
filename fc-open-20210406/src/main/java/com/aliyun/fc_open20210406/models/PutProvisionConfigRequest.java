// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutProvisionConfigRequest} extends {@link RequestModel}
 *
 * <p>PutProvisionConfigRequest</p>
 */
public class PutProvisionConfigRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Body
    @NameInMap("scheduledActions")
    private java.util.List < ScheduledActions > scheduledActions;

    @Body
    @NameInMap("target")
    private Long target;

    @Body
    @NameInMap("targetTrackingPolicies")
    private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;

    @Query
    @NameInMap("qualifier")
    private String qualifier;


    private PutProvisionConfigRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProvisionConfigRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
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

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private java.util.List < ScheduledActions > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 
        private String qualifier; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>定时策略配置</p>
         */
        public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
            this.putBodyParameter("scheduledActions", scheduledActions);
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * <p>预留的目标资源个数</p>
         */
        public Builder target(Long target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>指标追踪伸缩策略配置</p>
         */
        public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
            this.putBodyParameter("targetTrackingPolicies", targetTrackingPolicies);
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        /**
         * <p>别名名称</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        public PutProvisionConfigRequest build() {
            return new PutProvisionConfigRequest(this);
        } 

    } 

}
