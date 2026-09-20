// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link CreateServerlessClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateServerlessClusterRequest</p>
 */
public class CreateServerlessClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    @com.aliyun.core.annotation.Validation(maximum = 36)
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(maximum = 60)
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
    @com.aliyun.core.annotation.NameInMap("ServerlessCapability")
    @com.aliyun.core.annotation.Validation(maximum = 20000, minimum = 50)
    private Integer serverlessCapability;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessSpec")
    private String serverlessSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessStorage")
    @com.aliyun.core.annotation.Validation(maximum = 20000, minimum = 10)
    private Integer serverlessStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateServerlessClusterRequest(Builder builder) {
        super(builder);
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clientType = builder.clientType;
        this.clusterName = builder.clusterName;
        this.diskType = builder.diskType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverlessCapability = builder.serverlessCapability;
        this.serverlessSpec = builder.serverlessSpec;
        this.serverlessStorage = builder.serverlessStorage;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerlessClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return serverlessCapability
     */
    public Integer getServerlessCapability() {
        return this.serverlessCapability;
    }

    /**
     * @return serverlessSpec
     */
    public String getServerlessSpec() {
        return this.serverlessSpec;
    }

    /**
     * @return serverlessStorage
     */
    public Integer getServerlessStorage() {
        return this.serverlessStorage;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateServerlessClusterRequest, Builder> {
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clientType; 
        private String clusterName; 
        private String diskType; 
        private String engine; 
        private String engineVersion; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer serverlessCapability; 
        private String serverlessSpec; 
        private Integer serverlessStorage; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerlessClusterRequest request) {
            super(request);
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.clientType = request.clientType;
            this.clusterName = request.clusterName;
            this.diskType = request.diskType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.serverlessCapability = request.serverlessCapability;
            this.serverlessSpec = request.serverlessSpec;
            this.serverlessStorage = request.serverlessStorage;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The auto-renewal period of the instance. Unit: months.</p>
         * <blockquote>
         * <ul><li>The default value of the auto-renewal period is 0, which indicates that the instance is not automatically renewed after the instance expires.</li>
         * </blockquote>
         * <li>For example, if the auto-renewal period is set to 2, the instance is automatically renewed for two months after the instance expires.</li></ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
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
         * <p>The parameter that identifies the source of the creation request. For public cloud, leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless-name</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The disk type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra cloud disk.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD.</li>
         * <li><strong>local_hdd_pro</strong>: local HDD.</li>
         * <li><strong>local_ssd_pro</strong>: local SSD.</li>
         * <li><strong>cloud_essd_pl1</strong>: ESSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The engine type of the HBase Serverless instance. Set the value to <strong>serverlesshbase</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>serverlesshbase</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The subscription duration of the subscription instance. Valid values:</p>
         * <ul>
         * <li>If PeriodUnit is set to year, valid values are <strong>1</strong> to <strong>3</strong>.</li>
         * <li>If PeriodUnit is set to month, valid values are <strong>1</strong> to <strong>9</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only when the billing method of the instance is <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration for the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>year</strong>: year.</li>
         * <li><strong>month</strong>: month.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only when the billing method of the instance is <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-j4d53glb3****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The processing capability per unit. Unit: CU.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder serverlessCapability(Integer serverlessCapability) {
            this.putQueryParameter("ServerlessCapability", serverlessCapability);
            this.serverlessCapability = serverlessCapability;
            return this;
        }

        /**
         * <p>The specification type. Valid values: leave empty or <strong>serverless.small</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless.small</p>
         */
        public Builder serverlessSpec(String serverlessSpec) {
            this.putQueryParameter("ServerlessSpec", serverlessSpec);
            this.serverlessSpec = serverlessSpec;
            return this;
        }

        /**
         * <p>The storage size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder serverlessStorage(Integer serverlessStorage) {
            this.putQueryParameter("ServerlessStorage", serverlessStorage);
            this.serverlessStorage = serverlessStorage;
            return this;
        }

        /**
         * <p>The vSwitch ID within the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp191ipotqj1ssyl*****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <blockquote>
         * <p>If both this parameter and the VswitchId parameter are left empty, the network type of the instance is classic network.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp120k6ixs4eog****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-f</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateServerlessClusterRequest build() {
            return new CreateServerlessClusterRequest(this);
        } 

    } 

}
