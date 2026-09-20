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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdStorageSize")
    private Integer coldStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coreInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

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
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

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

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clusterName = builder.clusterName;
        this.coldStorageSize = builder.coldStorageSize;
        this.coreInstanceType = builder.coreInstanceType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.masterInstanceType = builder.masterInstanceType;
        this.nodeCount = builder.nodeCount;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityIPList = builder.securityIPList;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return coldStorageSize
     */
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
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
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clusterName; 
        private Integer coldStorageSize; 
        private String coreInstanceType; 
        private Integer diskSize; 
        private String diskType; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String masterInstanceType; 
        private Integer nodeCount; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityIPList; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.clusterName = request.clusterName;
            this.coldStorageSize = request.coldStorageSize;
            this.coreInstanceType = request.coreInstanceType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.encryptionKey = request.encryptionKey;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.masterInstanceType = request.masterInstanceType;
            this.nodeCount = request.nodeCount;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityIPList = request.securityIPList;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Settings for the auto-renewal period of the instance. Unit: months.</p>
         * <blockquote>
         * <ul>
         * <li>The default value is <strong>0</strong>, which indicates that the instance is not automatically renewed after the instance expires.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For example, if the value is set to <strong>2</strong>, the instance is automatically renewed for two months after the instance expires.</li>
         * </ul>
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
         * <p>The client token that is used to ensure the idempotence of the request. The value is generated by the client and must be unique among different requests. The value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
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
         * <p>The name of the instance. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name must start with an uppercase letter, a lowercase letter, or a Chinese character.</li>
         * <li>The name can contain digits and special characters, including periods (.), hyphens (-), and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hbase_test</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The cold storage capacity of the instance. Unit: GB. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Cold storage is disabled.</li>
         * <li><strong>800</strong> to <strong>1000000</strong>: Cold storage is enabled.</li>
         * </ul>
         * <blockquote>
         * <p>Cold storage takes effect only when the engine type is <strong>hbaseue</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder coldStorageSize(Integer coldStorageSize) {
            this.putQueryParameter("ColdStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * <p>The node specifications of the core node. You can invoke the <a href="https://help.aliyun.com/document_detail/188244.html">DescribeAvailableResource</a> operation to query the specifications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.medium</p>
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * <p>The disk size of a single core node. Unit: GB.</p>
         * <ul>
         *    <li>If the instance is a single-node instance, the disk size of a single core node ranges from 20 to 500 GB, with a step size of 1 GB.</li>
         *    <li>If the instance uses cloud disks, the disk size of a single core node ranges from 400 to 64,000 GB, with a step size of 40 GB.</li>
         *    <li>If the instance uses local disks, the disk size of a single core node depends on the core node specifications:
         * <ul>
         *   <li>If the core node specifications are hbase.d1.4xlarge, the disk size is 44,000.</li>
         *   <li>If the core node specifications are hbase.d1.6xlarge, the disk size is 66,000.</li>
         *   <li>If the core node specifications are hbase.d1.8xlarge, the disk size is 88,000.</li>
         *   <li>If the core node specifications are hbase.i2.xlarge, the disk size is 894.</li>
         *   <li>If the core node specifications are hbase.i2.2xlarge, the disk size is 1,788.</li>
         *   <li>If the core node specifications are hbase.i2.4xlarge, the disk size is 3,576.</li>
         *   <li>If the core node specifications are hbase.i2.8xlarge, the disk size is 7,152.</li>
         *   <li>If the core node specifications are hbase.d2s.5xlarge, the disk size is 58,400.</li>
         *   <li>If the core node specifications are hbase.d2s.10xlarge, the disk size is 109,500.</li>
         * </ul>
         *   </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The cloud disk type of the core node. Valid values:</p>
         * <ul>
         *  <li>**cloud_efficiency**: ultra cloud disk.</li>
         * <li>**cloud_ssd**: standard SSD.</li>
         * <li>**local_hdd_pro**: local HDD.</li>
         * <li>**local_ssd_pro**: local SSD.</li>
         * <li>**cloud_essd_pl1**: ESSD.</li>
         * </ul>.
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
         * <p>The encryption key ID. This parameter is empty if encryption is not enabled.</p>
         * <blockquote>
         * <p>After cloud disk encryption is enabled, it cannot be disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0d2470df-da7b-4786-b981-9a164dae****</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The database engine type. Valid values:</p>
         * <ul>
         * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition or ApsaraDB for HBase single-node edition.</li>
         * <li><strong>hbaseue</strong>: ApsaraDB for HBase Performance-enhanced Edition.</li>
         * <li><strong>bds</strong>: BDS instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>Database engine version of the instance. The value depends on the engine type. Valid values:</p>
         * <ul>
         * <li>If the engine type is <strong>hbase</strong>, database engine version is <strong>1.1</strong> or <strong>2.0</strong>.</li>
         * <li>If the engine type is <strong>hbaseue</strong>, database engine version is <strong>2.0</strong>.</li>
         * <li>If the engine type is <strong>bds</strong>, database engine version is <strong>1.0</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The node specifications of the master node. You can invoke the <a href="https://help.aliyun.com/document_detail/188244.html">DescribeAvailableResource</a> operation to query the specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.medium</p>
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * <p>The number of core nodes. Valid values:</p>
         * <ul>
         *    <li>If the instance is a single-node instance, the number of core nodes is fixed to **1**.</li>
         *    <li>If the instance uses cloud disks, the number of core nodes ranges from **2** to **100**.</li>
         *    <li>If the instance uses local disks, the number of core nodes ranges from **4** to **100**.</li>
         * </ul>.
         * 
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
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
         * <p>The subscription period of the subscription instance. Valid values:</p>
         * <ul>
         * <li>If PeriodUnit is set to <strong>year</strong>, the valid values are <strong>1</strong> to <strong>3</strong>.</li>
         * <li>If PeriodUnit is set to <strong>month</strong>, the valid values are <strong>1</strong> to <strong>9</strong>.</li>
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
         * <p>The unit of the subscription period for the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>year</strong></li>
         * <li><strong>month</strong></li>
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
         * <p>The IP addresses in the whitelist of the instance. Separate multiple IP addresses with commas (,).</p>
         * <blockquote>
         * <p>If the IP address is set to 127.0.0.1, all addresses are denied access to the instance. For example, 192.168.0.0/24 indicates that all IP addresses in the 192.168.0.XX range are allowed to access the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX/24</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The vSwitch ID in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp191otqj1ssyl****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
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
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
