// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingRuleRequest</p>
 */
public class ModifyScalingRuleRequest extends Request {
    @Query
    @NameInMap("AcceptEULA")
    private Boolean acceptEULA;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InCondition")
    private String inCondition;

    @Query
    @NameInMap("InCpu")
    private Integer inCpu;

    @Query
    @NameInMap("InDuration")
    private Integer inDuration;

    @Query
    @NameInMap("InEnable")
    private Boolean inEnable;

    @Query
    @NameInMap("InInstanceNum")
    private Integer inInstanceNum;

    @Query
    @NameInMap("InLoad")
    private Integer inLoad;

    @Query
    @NameInMap("InRT")
    private Integer inRT;

    @Query
    @NameInMap("InStep")
    private Integer inStep;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("MultiAzPolicy")
    private String multiAzPolicy;

    @Query
    @NameInMap("OutCPU")
    private Integer outCPU;

    @Query
    @NameInMap("OutCondition")
    private String outCondition;

    @Query
    @NameInMap("OutDuration")
    private Integer outDuration;

    @Query
    @NameInMap("OutEnable")
    private Boolean outEnable;

    @Query
    @NameInMap("OutInstanceNum")
    private Integer outInstanceNum;

    @Query
    @NameInMap("OutLoad")
    private Integer outLoad;

    @Query
    @NameInMap("OutRT")
    private Integer outRT;

    @Query
    @NameInMap("OutStep")
    private Integer outStep;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("ResourceFrom")
    private String resourceFrom;

    @Query
    @NameInMap("ScalingPolicy")
    private String scalingPolicy;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateInstanceId")
    private String templateInstanceId;

    @Query
    @NameInMap("TemplateInstanceName")
    private String templateInstanceName;

    @Query
    @NameInMap("TemplateVersion")
    private Integer templateVersion;

    @Query
    @NameInMap("VSwitchIds")
    private String vSwitchIds;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ModifyScalingRuleRequest(Builder builder) {
        super(builder);
        this.acceptEULA = builder.acceptEULA;
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.inCondition = builder.inCondition;
        this.inCpu = builder.inCpu;
        this.inDuration = builder.inDuration;
        this.inEnable = builder.inEnable;
        this.inInstanceNum = builder.inInstanceNum;
        this.inLoad = builder.inLoad;
        this.inRT = builder.inRT;
        this.inStep = builder.inStep;
        this.keyPairName = builder.keyPairName;
        this.multiAzPolicy = builder.multiAzPolicy;
        this.outCPU = builder.outCPU;
        this.outCondition = builder.outCondition;
        this.outDuration = builder.outDuration;
        this.outEnable = builder.outEnable;
        this.outInstanceNum = builder.outInstanceNum;
        this.outLoad = builder.outLoad;
        this.outRT = builder.outRT;
        this.outStep = builder.outStep;
        this.password = builder.password;
        this.resourceFrom = builder.resourceFrom;
        this.scalingPolicy = builder.scalingPolicy;
        this.templateId = builder.templateId;
        this.templateInstanceId = builder.templateInstanceId;
        this.templateInstanceName = builder.templateInstanceName;
        this.templateVersion = builder.templateVersion;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptEULA
     */
    public Boolean getAcceptEULA() {
        return this.acceptEULA;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return inCondition
     */
    public String getInCondition() {
        return this.inCondition;
    }

    /**
     * @return inCpu
     */
    public Integer getInCpu() {
        return this.inCpu;
    }

    /**
     * @return inDuration
     */
    public Integer getInDuration() {
        return this.inDuration;
    }

    /**
     * @return inEnable
     */
    public Boolean getInEnable() {
        return this.inEnable;
    }

    /**
     * @return inInstanceNum
     */
    public Integer getInInstanceNum() {
        return this.inInstanceNum;
    }

    /**
     * @return inLoad
     */
    public Integer getInLoad() {
        return this.inLoad;
    }

    /**
     * @return inRT
     */
    public Integer getInRT() {
        return this.inRT;
    }

    /**
     * @return inStep
     */
    public Integer getInStep() {
        return this.inStep;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return multiAzPolicy
     */
    public String getMultiAzPolicy() {
        return this.multiAzPolicy;
    }

    /**
     * @return outCPU
     */
    public Integer getOutCPU() {
        return this.outCPU;
    }

    /**
     * @return outCondition
     */
    public String getOutCondition() {
        return this.outCondition;
    }

    /**
     * @return outDuration
     */
    public Integer getOutDuration() {
        return this.outDuration;
    }

    /**
     * @return outEnable
     */
    public Boolean getOutEnable() {
        return this.outEnable;
    }

    /**
     * @return outInstanceNum
     */
    public Integer getOutInstanceNum() {
        return this.outInstanceNum;
    }

    /**
     * @return outLoad
     */
    public Integer getOutLoad() {
        return this.outLoad;
    }

    /**
     * @return outRT
     */
    public Integer getOutRT() {
        return this.outRT;
    }

    /**
     * @return outStep
     */
    public Integer getOutStep() {
        return this.outStep;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return resourceFrom
     */
    public String getResourceFrom() {
        return this.resourceFrom;
    }

    /**
     * @return scalingPolicy
     */
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateInstanceId
     */
    public String getTemplateInstanceId() {
        return this.templateInstanceId;
    }

    /**
     * @return templateInstanceName
     */
    public String getTemplateInstanceName() {
        return this.templateInstanceName;
    }

    /**
     * @return templateVersion
     */
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyScalingRuleRequest, Builder> {
        private Boolean acceptEULA; 
        private String appId; 
        private String groupId; 
        private String inCondition; 
        private Integer inCpu; 
        private Integer inDuration; 
        private Boolean inEnable; 
        private Integer inInstanceNum; 
        private Integer inLoad; 
        private Integer inRT; 
        private Integer inStep; 
        private String keyPairName; 
        private String multiAzPolicy; 
        private Integer outCPU; 
        private String outCondition; 
        private Integer outDuration; 
        private Boolean outEnable; 
        private Integer outInstanceNum; 
        private Integer outLoad; 
        private Integer outRT; 
        private Integer outStep; 
        private String password; 
        private String resourceFrom; 
        private String scalingPolicy; 
        private String templateId; 
        private String templateInstanceId; 
        private String templateInstanceName; 
        private Integer templateVersion; 
        private String vSwitchIds; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingRuleRequest request) {
            super(request);
            this.acceptEULA = request.acceptEULA;
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.inCondition = request.inCondition;
            this.inCpu = request.inCpu;
            this.inDuration = request.inDuration;
            this.inEnable = request.inEnable;
            this.inInstanceNum = request.inInstanceNum;
            this.inLoad = request.inLoad;
            this.inRT = request.inRT;
            this.inStep = request.inStep;
            this.keyPairName = request.keyPairName;
            this.multiAzPolicy = request.multiAzPolicy;
            this.outCPU = request.outCPU;
            this.outCondition = request.outCondition;
            this.outDuration = request.outDuration;
            this.outEnable = request.outEnable;
            this.outInstanceNum = request.outInstanceNum;
            this.outLoad = request.outLoad;
            this.outRT = request.outRT;
            this.outStep = request.outStep;
            this.password = request.password;
            this.resourceFrom = request.resourceFrom;
            this.scalingPolicy = request.scalingPolicy;
            this.templateId = request.templateId;
            this.templateInstanceId = request.templateInstanceId;
            this.templateInstanceName = request.templateInstanceName;
            this.templateVersion = request.templateVersion;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
        } 

        /**
         * Set the value to true if scale-outs are allowed.
         */
        public Builder acceptEULA(Boolean acceptEULA) {
            this.putQueryParameter("AcceptEULA", acceptEULA);
            this.acceptEULA = acceptEULA;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the instance group to which the application is deployed.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The relationship among the conditions that trigger a scale-in.
         * <p>
         * 
         * *   OR: one of the conditions
         * *   AND: all conditions
         */
        public Builder inCondition(String inCondition) {
            this.putQueryParameter("InCondition", inCondition);
            this.inCondition = inCondition;
            return this;
        }

        /**
         * The CPU utilization that triggers a scale-in.
         */
        public Builder inCpu(Integer inCpu) {
            this.putQueryParameter("InCpu", inCpu);
            this.inCpu = inCpu;
            return this;
        }

        /**
         * The duration in which the metric threshold is exceeded. Unit: minutes.
         */
        public Builder inDuration(Integer inDuration) {
            this.putQueryParameter("InDuration", inDuration);
            this.inDuration = inDuration;
            return this;
        }

        /**
         * Specifies whether to allow scale-ins.
         * <p>
         * 
         * *   true: allows scale-ins.
         * *   false: does not allow scale-ins.
         */
        public Builder inEnable(Boolean inEnable) {
            this.putQueryParameter("InEnable", inEnable);
            this.inEnable = inEnable;
            return this;
        }

        /**
         * The minimum number of instances that must be retained in each group when a scale-in is performed.
         */
        public Builder inInstanceNum(Integer inInstanceNum) {
            this.putQueryParameter("InInstanceNum", inInstanceNum);
            this.inInstanceNum = inInstanceNum;
            return this;
        }

        /**
         * The system load that triggers a scale-in.
         */
        public Builder inLoad(Integer inLoad) {
            this.putQueryParameter("InLoad", inLoad);
            this.inLoad = inLoad;
            return this;
        }

        /**
         * The minimum service latency that triggers a scale-in. The lower limit is 0. Unit: milliseconds.
         */
        public Builder inRT(Integer inRT) {
            this.putQueryParameter("InRT", inRT);
            this.inRT = inRT;
            return this;
        }

        /**
         * The number of instances that are removed during each scale-in.
         */
        public Builder inStep(Integer inStep) {
            this.putQueryParameter("InStep", inStep);
            this.inStep = inStep;
            return this;
        }

        /**
         * The key pair that is used to log on to the instance. This parameter takes effect only if you choose to create instances based on the specifications of an existing instance during a scale-out.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The multi-zone scaling policy. Valid values:
         * <p>
         * 
         * *   PRIORITY: The vSwitch that is first selected has the highest priority.
         * *   BALANCE: This policy evenly distributes instances across zones in which the vSwitches reside.
         */
        public Builder multiAzPolicy(String multiAzPolicy) {
            this.putQueryParameter("MultiAzPolicy", multiAzPolicy);
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }

        /**
         * The CPU utilization that triggers a scale-out.
         */
        public Builder outCPU(Integer outCPU) {
            this.putQueryParameter("OutCPU", outCPU);
            this.outCPU = outCPU;
            return this;
        }

        /**
         * The relationship among the conditions that trigger a scale-out.
         * <p>
         * 
         * *   OR: one of the conditions
         * *   AND: all conditions
         */
        public Builder outCondition(String outCondition) {
            this.putQueryParameter("OutCondition", outCondition);
            this.outCondition = outCondition;
            return this;
        }

        /**
         * The duration in which the metric threshold is exceeded. Unit: minutes.
         */
        public Builder outDuration(Integer outDuration) {
            this.putQueryParameter("OutDuration", outDuration);
            this.outDuration = outDuration;
            return this;
        }

        /**
         * Specifies whether to allow scale-outs.
         */
        public Builder outEnable(Boolean outEnable) {
            this.putQueryParameter("OutEnable", outEnable);
            this.outEnable = outEnable;
            return this;
        }

        /**
         * The maximum number of instances in each group when a scale-out is performed.
         */
        public Builder outInstanceNum(Integer outInstanceNum) {
            this.putQueryParameter("OutInstanceNum", outInstanceNum);
            this.outInstanceNum = outInstanceNum;
            return this;
        }

        /**
         * The system load that triggers a scale-out.
         */
        public Builder outLoad(Integer outLoad) {
            this.putQueryParameter("OutLoad", outLoad);
            this.outLoad = outLoad;
            return this;
        }

        /**
         * The minimum service latency that triggers a scale-out. The lower limit is 0. Unit: milliseconds.
         */
        public Builder outRT(Integer outRT) {
            this.putQueryParameter("OutRT", outRT);
            this.outRT = outRT;
            return this;
        }

        /**
         * The number of instances that are added during each scale-out.
         */
        public Builder outStep(Integer outStep) {
            this.putQueryParameter("OutStep", outStep);
            this.outStep = outStep;
            return this;
        }

        /**
         * The password that is used to log on to the instance. This parameter takes effect only if you choose to create instances based on the specifications of an existing instance during a scale-out.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The source of the instance to be added during a scale-out. Valid values:
         * <p>
         * 
         * *   NEW: elastic resources
         * *   AVAILABLE: existing resources If you prefer existing resources to elastic resources, set this parameter to AVAILABLE_FIRST.
         * 
         * If you set this parameter to NEW or AVAILABLE_FIRST, you must specify the auto-scaling parameters. If you set this parameter to NEW, instances are created based on a launch template or the specifications of an existing instance.
         */
        public Builder resourceFrom(String resourceFrom) {
            this.putQueryParameter("ResourceFrom", resourceFrom);
            this.resourceFrom = resourceFrom;
            return this;
        }

        /**
         * The instance handling mode during a scale-in. Valid values:
         * <p>
         * 
         * *   release: When a scale-in is performed, instances that are no longer used are released.
         * *   recycle: When a scale-in is performed, instances that are no longer used are stopped and reclaimed.
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * The ID of the launch template that is used to create instances during a scale-out. This parameter takes effect only if you set the OutEnable parameter to true. This parameter takes precedence over the TemplateInstanceId parameter.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the instance whose specifications are used to create instances during a scale-out. This parameter is valid only when you set the OutEnable parameter to true.
         */
        public Builder templateInstanceId(String templateInstanceId) {
            this.putQueryParameter("TemplateInstanceId", templateInstanceId);
            this.templateInstanceId = templateInstanceId;
            return this;
        }

        /**
         * The name of the instance whose specifications are used to create instances during a scale-out. This parameter takes effect only if you specify the TemplateInstanceId parameter.
         */
        public Builder templateInstanceName(String templateInstanceName) {
            this.putQueryParameter("TemplateInstanceName", templateInstanceName);
            this.templateInstanceName = templateInstanceName;
            return this;
        }

        /**
         * The version of the launch template that is used to create instances during a scale-out. This parameter takes effect only if you set the OutEnable parameter to true. To use the default template version, set this parameter to `-1`. Otherwise, set this parameter to the version that you want to use.
         */
        public Builder templateVersion(Integer templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The IDs of the vSwitches that are associated with the VPC. Separate multiple IDs with commas (,).
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) that is associated with the instances created based on a launch template or the specifications of an existing instance.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyScalingRuleRequest build() {
            return new ModifyScalingRuleRequest(this);
        } 

    } 

}
