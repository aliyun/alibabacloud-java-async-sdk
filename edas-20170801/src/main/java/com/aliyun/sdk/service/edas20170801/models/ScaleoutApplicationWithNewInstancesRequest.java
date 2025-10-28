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
 * {@link ScaleoutApplicationWithNewInstancesRequest} extends {@link RequestModel}
 *
 * <p>ScaleoutApplicationWithNewInstancesRequest</p>
 */
public class ScaleoutApplicationWithNewInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargePeriod")
    private Integer instanceChargePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargePeriodUnit")
    private String instanceChargePeriodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingNum")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer scalingNum;

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
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
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
         * <p>The ID of the application that you want to scale out. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>e370c17f-*****-3df0721a327</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: does not enable auto-renewal. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal period. Valid values:</p>
         * <ul>
         * <li>If the InstanceChargePeriodUnit parameter is set to Week, the valid values of the AutoRenewPeriod parameter are 1, 2, and 3.</li>
         * <li>If the InstanceChargePeriodUnit parameter is set to Month, the valid values of the AutoRenewPeriod parameter are 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The ID of the cluster to which you want to add ECS instances. If the application and application instance group for the scale-out are specified, this parameter is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>e37**********-33df0721a327</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the instance group that you want to scale out. You can call the ListDeployGroup operation to query the group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62077.html">ListDeployGroup</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>e37**********-33df0721a327</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The duration of the subscription. The unit of the subscription duration is specified by the InstanceChargePeriodUnit parameter. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid.</p>
         * <ul>
         * <li>If the InstanceChargePeriodUnit parameter is set to Week, the valid values of the InstanceChargePeriod parameter are 1, 2, 3, and 4.</li>
         * <li>If the InstanceChargePeriodUnit parameter is set to Month, the valid values of the InstanceChargePeriod parameter are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceChargePeriod(Integer instanceChargePeriod) {
            this.putQueryParameter("InstanceChargePeriod", instanceChargePeriod);
            this.instanceChargePeriod = instanceChargePeriod;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li>Week: billed on a weekly basis.</li>
         * <li>Month: billed on a monthly basis. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder instanceChargePeriodUnit(String instanceChargePeriodUnit) {
            this.putQueryParameter("InstanceChargePeriodUnit", instanceChargePeriodUnit);
            this.instanceChargePeriodUnit = instanceChargePeriodUnit;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The number of instances to be added for the scale-out.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scalingNum(Integer scalingNum) {
            this.putQueryParameter("ScalingNum", scalingNum);
            this.scalingNum = scalingNum;
            return this;
        }

        /**
         * <p>The instance reclaim mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>recycle: economical mode</li>
         * <li>release: release mode</li>
         * </ul>
         * <p>For more information about how to remove instances from a specified scaling group, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * <p>The ID of the ECS instance launch template. You can call the DescribeLaunchTemplates operation to query the launch template ID. For more information, see <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-****hy9s2</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The ID of the existing ECS instance used for the scale-out. If this parameter is specified, the specifications and configurations of the specified ECS instance are used as a template to purchase new instances.</p>
         * 
         * <strong>example:</strong>
         * <p>i-28wt4****</p>
         */
        public Builder templateInstanceId(String templateInstanceId) {
            this.putQueryParameter("TemplateInstanceId", templateInstanceId);
            this.templateInstanceId = templateInstanceId;
            return this;
        }

        /**
         * <p>The version of the ECS instance launch template. You can call the DescribeLaunchTemplateVersions operation to query the launch template version. For more information, see <a href="https://help.aliyun.com/document_detail/73761.html">DescribeLaunchTemplateVersions</a>.</p>
         * <blockquote>
         * <p>If you set this parameter to <code>-1</code>, the default launch template version is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
