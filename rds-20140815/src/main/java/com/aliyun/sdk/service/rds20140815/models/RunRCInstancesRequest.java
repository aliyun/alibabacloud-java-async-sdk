// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link RunRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>RunRCInstancesRequest</p>
 */
public class RunRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 30, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateAckEdgeParam")
    private CreateAckEdgeParam createAckEdgeParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateExtraParam")
    private String createExtraParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateMode")
    private String createMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoOptimized")
    private String ioOptimized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportCase")
    private String supportCase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDataInBase64")
    private Boolean userDataInBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private RunRCInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.createAckEdgeParam = builder.createAckEdgeParam;
        this.createExtraParam = builder.createExtraParam;
        this.createMode = builder.createMode;
        this.dataDisk = builder.dataDisk;
        this.deploymentSetId = builder.deploymentSetId;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.keyPairName = builder.keyPairName;
        this.password = builder.password;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.securityGroupId = builder.securityGroupId;
        this.spotStrategy = builder.spotStrategy;
        this.supportCase = builder.supportCase;
        this.systemDisk = builder.systemDisk;
        this.tag = builder.tag;
        this.userData = builder.userData;
        this.userDataInBase64 = builder.userDataInBase64;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunRCInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createAckEdgeParam
     */
    public CreateAckEdgeParam getCreateAckEdgeParam() {
        return this.createAckEdgeParam;
    }

    /**
     * @return createExtraParam
     */
    public String getCreateExtraParam() {
        return this.createExtraParam;
    }

    /**
     * @return createMode
     */
    public String getCreateMode() {
        return this.createMode;
    }

    /**
     * @return dataDisk
     */
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return supportCase
     */
    public String getSupportCase() {
        return this.supportCase;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return userDataInBase64
     */
    public Boolean getUserDataInBase64() {
        return this.userDataInBase64;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<RunRCInstancesRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String clientToken; 
        private CreateAckEdgeParam createAckEdgeParam; 
        private String createExtraParam; 
        private String createMode; 
        private java.util.List<DataDisk> dataDisk; 
        private String deploymentSetId; 
        private String description; 
        private Boolean dryRun; 
        private String hostName; 
        private String imageId; 
        private String instanceChargeType; 
        private String instanceName; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private String keyPairName; 
        private String password; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityEnhancementStrategy; 
        private String securityGroupId; 
        private String spotStrategy; 
        private String supportCase; 
        private SystemDisk systemDisk; 
        private java.util.List<Tag> tag; 
        private String userData; 
        private Boolean userDataInBase64; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(RunRCInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.createAckEdgeParam = request.createAckEdgeParam;
            this.createExtraParam = request.createExtraParam;
            this.createMode = request.createMode;
            this.dataDisk = request.dataDisk;
            this.deploymentSetId = request.deploymentSetId;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.hostName = request.hostName;
            this.imageId = request.imageId;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.ioOptimized = request.ioOptimized;
            this.keyPairName = request.keyPairName;
            this.password = request.password;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
            this.securityGroupId = request.securityGroupId;
            this.spotStrategy = request.spotStrategy;
            this.supportCase = request.supportCase;
            this.systemDisk = request.systemDisk;
            this.tag = request.tag;
            this.userData = request.userData;
            this.userDataInBase64 = request.userDataInBase64;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The number of RDS Custom instances that you want to create. The parameter is available if you want to create multiple RDS Custom instances at a time.</p>
         * <p>Valid values: <strong>1</strong> to <strong>10</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables the feature. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> If your account balance is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CreateAckEdgeParam.
         */
        public Builder createAckEdgeParam(CreateAckEdgeParam createAckEdgeParam) {
            String createAckEdgeParamShrink = shrink(createAckEdgeParam, "CreateAckEdgeParam", "json");
            this.putQueryParameter("CreateAckEdgeParam", createAckEdgeParamShrink);
            this.createAckEdgeParam = createAckEdgeParam;
            return this;
        }

        /**
         * CreateExtraParam.
         */
        public Builder createExtraParam(String createExtraParam) {
            this.putQueryParameter("CreateExtraParam", createExtraParam);
            this.createExtraParam = createExtraParam;
            return this;
        }

        /**
         * CreateMode.
         */
        public Builder createMode(String createMode) {
            this.putQueryParameter("CreateMode", createMode);
            this.createMode = createMode;
            return this;
        }

        /**
         * <p>The information about the data disks.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            String dataDiskShrink = shrink(dataDisk, "DataDisk", "json");
            this.putQueryParameter("DataDisk", dataDiskShrink);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-uf6670sipmph5j5b6ke4</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance_Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and insufficient inventory errors.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the instance is directly created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the image used by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>image-dsvjzw2ii8n4fvr6de</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Set the value to <strong>Prepaid</strong>, which indicates the subscription billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance type. For more information about the instance types that are supported by RDS Custom instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">Instance types for RDS Custom instances</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.i8.large.2cm</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * <p>The name of the AccessKey pair. You can specify only one name.</p>
         * 
         * <strong>example:</strong>
         * <p>dell5502</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The password of the account that is used to log on to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2F9e9@a69c!e18b569c8</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The subscription duration of the instance. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * <p>The ID of the security group to which you want to add the new instance. Instances in the same security group can communicate with each other. The maximum number of instances allowed in a security group varies based on the type of the security group. For more information, see the &quot;Security group limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
         * <blockquote>
         * <p> The network type of the instance is determined by the security group specified by the SecurityGroupId parameter. For example, if the network type of the specified security group is VPC, the instance is a VPC-type instance. In this case, you must specify the VSwitchId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6av412xaxixuezol6w</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * SupportCase.
         */
        public Builder supportCase(String supportCase) {
            this.putQueryParameter("SupportCase", supportCase);
            this.supportCase = supportCase;
            return this;
        }

        /**
         * <p>The specification of the system disk.</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            String systemDiskShrink = shrink(systemDisk, "SystemDisk", "json");
            this.putQueryParameter("SystemDisk", systemDiskShrink);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * UserDataInBase64.
         */
        public Builder userDataInBase64(Boolean userDataInBase64) {
            this.putQueryParameter("UserDataInBase64", userDataInBase64);
            this.userDataInBase64 = userDataInBase64;
            return this;
        }

        /**
         * <p>The vSwitch ID of the instance. You must specify this parameter when you create an instance of the virtual private cloud (VPC) type. The specified vSwitch and security group must belong to the same VPC.</p>
         * <blockquote>
         * <p> If you specify the VSwitchId parameter, the zone specified by the ZoneId parameter must be the same as the zone in which the specified vSwitch resides. You can leave the ZoneId parameter empty. In this case, the system uses the zone in which the specified vSwitch resides.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vcd61ngm890sk****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the instance. You can call the DescribeZones operation to query the zone IDs.</p>
         * <blockquote>
         * <p> If you specify the VSwitchId parameter, the zone specified by the ZoneId parameter must be the same as the zone in which the specified vSwitch resides. You can leave the ZoneId parameter empty. In this case, the system uses the zone in which the specified vSwitch resides.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public RunRCInstancesRequest build() {
            return new RunRCInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunRCInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunRCInstancesRequest</p>
     */
    public static class CreateAckEdgeParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("NodePoolId")
        private String nodePoolId;

        private CreateAckEdgeParam(Builder builder) {
            this.clusterId = builder.clusterId;
            this.nodePoolId = builder.nodePoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateAckEdgeParam create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public static final class Builder {
            private String clusterId; 
            private String nodePoolId; 

            private Builder() {
            } 

            private Builder(CreateAckEdgeParam model) {
                this.clusterId = model.clusterId;
                this.nodePoolId = model.nodePoolId;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * NodePoolId.
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            public CreateAckEdgeParam build() {
                return new CreateAckEdgeParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunRCInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunRCInstancesRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.device = builder.device;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String category; 
            private Boolean deleteWithInstance; 
            private String device; 
            private String encrypted; 
            private String performanceLevel; 
            private Integer size; 
            private String snapshotId; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.device = model.device;
                this.encrypted = model.encrypted;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The type of the data disk. Set the value to <strong>cloud_essd</strong>, which indicates Enterprise SSDs (ESSDs).</p>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the cloud disk. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunRCInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunRCInstancesRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String performanceLevel; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The type of the system disk. Set the value to <strong>cloud_essd</strong>, which indicates ESSDs.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB. Only performance level 1 (PL1) ESSDs are supported. Valid values: 20 to 2048.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunRCInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunRCInstancesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
