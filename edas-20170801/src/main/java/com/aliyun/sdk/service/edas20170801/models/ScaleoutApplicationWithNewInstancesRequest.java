// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleoutApplicationWithNewInstancesRequest} extends {@link RequestModel}
 *
 * <p>ScaleoutApplicationWithNewInstancesRequest</p>
 */
public class ScaleoutApplicationWithNewInstancesRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("InstanceChargePeriod")
    private Integer instanceChargePeriod;

    @Query
    @NameInMap("InstanceChargePeriodUnit")
    private String instanceChargePeriodUnit;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("ScalingNum")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer scalingNum;

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
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private ScaleoutApplicationWithNewInstancesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clusterId = builder.clusterId;
        this.groupId = builder.groupId;
        this.instanceChargePeriod = builder.instanceChargePeriod;
        this.instanceChargePeriodUnit = builder.instanceChargePeriodUnit;
        this.instanceChargeType = builder.instanceChargeType;
        this.scalingNum = builder.scalingNum;
        this.scalingPolicy = builder.scalingPolicy;
        this.templateId = builder.templateId;
        this.templateInstanceId = builder.templateInstanceId;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleoutApplicationWithNewInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceChargePeriod
     */
    public Integer getInstanceChargePeriod() {
        return this.instanceChargePeriod;
    }

    /**
     * @return instanceChargePeriodUnit
     */
    public String getInstanceChargePeriodUnit() {
        return this.instanceChargePeriodUnit;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return scalingNum
     */
    public Integer getScalingNum() {
        return this.scalingNum;
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
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<ScaleoutApplicationWithNewInstancesRequest, Builder> {
        private String appId; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String clusterId; 
        private String groupId; 
        private Integer instanceChargePeriod; 
        private String instanceChargePeriodUnit; 
        private String instanceChargeType; 
        private Integer scalingNum; 
        private String scalingPolicy; 
        private String templateId; 
        private String templateInstanceId; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(ScaleoutApplicationWithNewInstancesRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clusterId = request.clusterId;
            this.groupId = request.groupId;
            this.instanceChargePeriod = request.instanceChargePeriod;
            this.instanceChargePeriodUnit = request.instanceChargePeriodUnit;
            this.instanceChargeType = request.instanceChargeType;
            this.scalingNum = request.scalingNum;
            this.scalingPolicy = request.scalingPolicy;
            this.templateId = request.templateId;
            this.templateInstanceId = request.templateInstanceId;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The ID of the application that you want to scale out. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid. Valid values:
         * <p>
         * 
         * *   true: enables auto-renewal.
         * *   false: does not enable auto-renewal. This is the default value.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period. Valid values:
         * <p>
         * 
         * *   If the InstanceChargePeriodUnit parameter is set to Week, the valid values of the AutoRenewPeriod parameter are 1, 2, and 3.
         * *   If the InstanceChargePeriodUnit parameter is set to Month, the valid values of the AutoRenewPeriod parameter are 1, 2, 3, 6, 12, 24, 36, 48, and 60.
         * 
         * Default value: 1.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The ID of the cluster to which you want to add ECS instances. If the application and application instance group for the scale-out are specified, this parameter is ignored.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the instance group that you want to scale out. You can call the ListDeployGroup operation to query the group ID. For more information, see [ListDeployGroup](~~62077~~).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The duration of the subscription. The unit of the subscription duration is specified by the InstanceChargePeriodUnit parameter. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid.
         * <p>
         * 
         * *   If the InstanceChargePeriodUnit parameter is set to Week, the valid values of the InstanceChargePeriod parameter are 1, 2, 3, and 4.
         * *   If the InstanceChargePeriodUnit parameter is set to Month, the valid values of the InstanceChargePeriod parameter are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         */
        public Builder instanceChargePeriod(Integer instanceChargePeriod) {
            this.putQueryParameter("InstanceChargePeriod", instanceChargePeriod);
            this.instanceChargePeriod = instanceChargePeriod;
            return this;
        }

        /**
         * The unit of the subscription period. Valid values:
         * <p>
         * 
         * *   Week: billed on a weekly basis.
         * *   Month: billed on a monthly basis. This is the default value.
         */
        public Builder instanceChargePeriodUnit(String instanceChargePeriodUnit) {
            this.putQueryParameter("InstanceChargePeriodUnit", instanceChargePeriodUnit);
            this.instanceChargePeriodUnit = instanceChargePeriodUnit;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription.
         * *   PostPaid: pay-as-you-go. This is the default value.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The number of instances to be added for the scale-out.
         */
        public Builder scalingNum(Integer scalingNum) {
            this.putQueryParameter("ScalingNum", scalingNum);
            this.scalingNum = scalingNum;
            return this;
        }

        /**
         * The instance reclaim mode of the scaling group. Valid values:
         * <p>
         * 
         * *   recycle: economical mode
         * *   release: release mode
         * 
         * For more information about how to remove instances from a specified scaling group, see [RemoveInstances](~~25955~~).
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * The ID of the ECS instance launch template. You can call the DescribeLaunchTemplates operation to query the launch template ID. For more information, see [DescribeLaunchTemplates](~~73759~~).
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the existing ECS instance used for the scale-out. If this parameter is specified, the specifications and configurations of the specified ECS instance are used as a template to purchase new instances.
         */
        public Builder templateInstanceId(String templateInstanceId) {
            this.putQueryParameter("TemplateInstanceId", templateInstanceId);
            this.templateInstanceId = templateInstanceId;
            return this;
        }

        /**
         * The version of the ECS instance launch template. You can call the DescribeLaunchTemplateVersions operation to query the launch template version. For more information, see [DescribeLaunchTemplateVersions](~~73761~~).
         * <p>
         * 
         * > If you set this parameter to `-1`, the default launch template version is used.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public ScaleoutApplicationWithNewInstancesRequest build() {
            return new ScaleoutApplicationWithNewInstancesRequest(this);
        } 

    } 

}
