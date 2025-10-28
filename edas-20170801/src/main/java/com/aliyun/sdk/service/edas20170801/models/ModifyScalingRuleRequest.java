// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ModifyScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingRuleRequest</p>
 */
public class ModifyScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptEULA")
    private Boolean acceptEULA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InCondition")
    private String inCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InCpu")
    private Integer inCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InDuration")
    private Integer inDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InEnable")
    private Boolean inEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InInstanceNum")
    private Integer inInstanceNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InLoad")
    private Integer inLoad;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InRT")
    private Integer inRT;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InStep")
    private Integer inStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAzPolicy")
    private String multiAzPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutCPU")
    private Integer outCPU;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutCondition")
    private String outCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutDuration")
    private Integer outDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutEnable")
    private Boolean outEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutInstanceNum")
    private Integer outInstanceNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutLoad")
    private Integer outLoad;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutRT")
    private Integer outRT;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutStep")
    private Integer outStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceFrom")
    private String resourceFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
    private String scalingPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateInstanceId")
    private String templateInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateInstanceName")
    private String templateInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private Integer templateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
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
         * <p>Set the value to true if scale-outs are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder acceptEULA(Boolean acceptEULA) {
            this.putQueryParameter("AcceptEULA", acceptEULA);
            this.acceptEULA = acceptEULA;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74ee****-db65-4322-a1f6-bcb60e5b****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance group to which the application is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The relationship among the conditions that trigger a scale-in.</p>
         * <ul>
         * <li>OR: one of the conditions</li>
         * <li>AND: all conditions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;OR&quot;</p>
         */
        public Builder inCondition(String inCondition) {
            this.putQueryParameter("InCondition", inCondition);
            this.inCondition = inCondition;
            return this;
        }

        /**
         * <p>The CPU utilization that triggers a scale-in.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder inCpu(Integer inCpu) {
            this.putQueryParameter("InCpu", inCpu);
            this.inCpu = inCpu;
            return this;
        }

        /**
         * <p>The duration in which the metric threshold is exceeded. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder inDuration(Integer inDuration) {
            this.putQueryParameter("InDuration", inDuration);
            this.inDuration = inDuration;
            return this;
        }

        /**
         * <p>Specifies whether to allow scale-ins.</p>
         * <ul>
         * <li>true: allows scale-ins.</li>
         * <li>false: does not allow scale-ins.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder inEnable(Boolean inEnable) {
            this.putQueryParameter("InEnable", inEnable);
            this.inEnable = inEnable;
            return this;
        }

        /**
         * <p>The minimum number of instances that must be retained in each group when a scale-in is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder inInstanceNum(Integer inInstanceNum) {
            this.putQueryParameter("InInstanceNum", inInstanceNum);
            this.inInstanceNum = inInstanceNum;
            return this;
        }

        /**
         * <p>The system load that triggers a scale-in.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder inLoad(Integer inLoad) {
            this.putQueryParameter("InLoad", inLoad);
            this.inLoad = inLoad;
            return this;
        }

        /**
         * <p>The minimum service latency that triggers a scale-in. The lower limit is 0. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder inRT(Integer inRT) {
            this.putQueryParameter("InRT", inRT);
            this.inRT = inRT;
            return this;
        }

        /**
         * <p>The number of instances that are removed during each scale-in.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inStep(Integer inStep) {
            this.putQueryParameter("InStep", inStep);
            this.inStep = inStep;
            return this;
        }

        /**
         * <p>The key pair that is used to log on to the instance. This parameter takes effect only if you choose to create instances based on the specifications of an existing instance during a scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;tdy218&quot;</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The multi-zone scaling policy. Valid values:</p>
         * <ul>
         * <li>PRIORITY: The vSwitch that is first selected has the highest priority.</li>
         * <li>BALANCE: This policy evenly distributes instances across zones in which the vSwitches reside.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;PRIORITY&quot;</p>
         */
        public Builder multiAzPolicy(String multiAzPolicy) {
            this.putQueryParameter("MultiAzPolicy", multiAzPolicy);
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }

        /**
         * <p>The CPU utilization that triggers a scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder outCPU(Integer outCPU) {
            this.putQueryParameter("OutCPU", outCPU);
            this.outCPU = outCPU;
            return this;
        }

        /**
         * <p>The relationship among the conditions that trigger a scale-out.</p>
         * <ul>
         * <li>OR: one of the conditions</li>
         * <li>AND: all conditions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;OR&quot;</p>
         */
        public Builder outCondition(String outCondition) {
            this.putQueryParameter("OutCondition", outCondition);
            this.outCondition = outCondition;
            return this;
        }

        /**
         * <p>The duration in which the metric threshold is exceeded. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder outDuration(Integer outDuration) {
            this.putQueryParameter("OutDuration", outDuration);
            this.outDuration = outDuration;
            return this;
        }

        /**
         * <p>Specifies whether to allow scale-outs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder outEnable(Boolean outEnable) {
            this.putQueryParameter("OutEnable", outEnable);
            this.outEnable = outEnable;
            return this;
        }

        /**
         * <p>The maximum number of instances in each group when a scale-out is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder outInstanceNum(Integer outInstanceNum) {
            this.putQueryParameter("OutInstanceNum", outInstanceNum);
            this.outInstanceNum = outInstanceNum;
            return this;
        }

        /**
         * <p>The system load that triggers a scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder outLoad(Integer outLoad) {
            this.putQueryParameter("OutLoad", outLoad);
            this.outLoad = outLoad;
            return this;
        }

        /**
         * <p>The minimum service latency that triggers a scale-out. The lower limit is 0. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder outRT(Integer outRT) {
            this.putQueryParameter("OutRT", outRT);
            this.outRT = outRT;
            return this;
        }

        /**
         * <p>The number of instances that are added during each scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder outStep(Integer outStep) {
            this.putQueryParameter("OutStep", outStep);
            this.outStep = outStep;
            return this;
        }

        /**
         * <p>The password that is used to log on to the instance. This parameter takes effect only if you choose to create instances based on the specifications of an existing instance during a scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Pwd*****&quot;</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The source of the instance to be added during a scale-out. Valid values:</p>
         * <ul>
         * <li>NEW: elastic resources</li>
         * <li>AVAILABLE: existing resources If you prefer existing resources to elastic resources, set this parameter to AVAILABLE_FIRST.</li>
         * </ul>
         * <p>If you set this parameter to NEW or AVAILABLE_FIRST, you must specify the auto-scaling parameters. If you set this parameter to NEW, instances are created based on a launch template or the specifications of an existing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;AVAILABLE&quot;</p>
         */
        public Builder resourceFrom(String resourceFrom) {
            this.putQueryParameter("ResourceFrom", resourceFrom);
            this.resourceFrom = resourceFrom;
            return this;
        }

        /**
         * <p>The instance handling mode during a scale-in. Valid values:</p>
         * <ul>
         * <li>release: When a scale-in is performed, instances that are no longer used are released.</li>
         * <li>recycle: When a scale-in is performed, instances that are no longer used are stopped and reclaimed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;release&quot;</p>
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * <p>The ID of the launch template that is used to create instances during a scale-out. This parameter takes effect only if you set the OutEnable parameter to true. This parameter takes precedence over the TemplateInstanceId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;lt-wz9hkhn8wp*****&quot;</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The ID of the instance whose specifications are used to create instances during a scale-out. This parameter is valid only when you set the OutEnable parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1&quot;</p>
         */
        public Builder templateInstanceId(String templateInstanceId) {
            this.putQueryParameter("TemplateInstanceId", templateInstanceId);
            this.templateInstanceId = templateInstanceId;
            return this;
        }

        /**
         * <p>The name of the instance whose specifications are used to create instances during a scale-out. This parameter takes effect only if you specify the TemplateInstanceId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;tpl-tdy218&quot;</p>
         */
        public Builder templateInstanceName(String templateInstanceName) {
            this.putQueryParameter("TemplateInstanceName", templateInstanceName);
            this.templateInstanceName = templateInstanceName;
            return this;
        }

        /**
         * <p>The version of the launch template that is used to create instances during a scale-out. This parameter takes effect only if you set the OutEnable parameter to true. To use the default template version, set this parameter to <code>-1</code>. Otherwise, set this parameter to the version that you want to use.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder templateVersion(Integer templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches that are associated with the VPC. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;vsw-bp1ldxs3d4fd*****&quot;</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) that is associated with the instances created based on a launch template or the specifications of an existing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;vpc-bp1j55oz3bg*****&quot;</p>
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
