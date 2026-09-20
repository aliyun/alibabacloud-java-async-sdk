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
 * {@link EnableHBaseueModuleRequest} extends {@link RequestModel}
 *
 * <p>EnableHBaseueModuleRequest</p>
 */
public class EnableHBaseueModuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BdsId")
    private String bdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("HbaseueClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hbaseueClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleClusterName")
    private String moduleClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleTypeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleTypeName;

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
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private EnableHBaseueModuleRequest(Builder builder) {
        super(builder);
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.bdsId = builder.bdsId;
        this.clientToken = builder.clientToken;
        this.coreInstanceType = builder.coreInstanceType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.hbaseueClusterId = builder.hbaseueClusterId;
        this.masterInstanceType = builder.masterInstanceType;
        this.moduleClusterName = builder.moduleClusterName;
        this.moduleTypeName = builder.moduleTypeName;
        this.nodeCount = builder.nodeCount;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableHBaseueModuleRequest create() {
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
     * @return bdsId
     */
    public String getBdsId() {
        return this.bdsId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return hbaseueClusterId
     */
    public String getHbaseueClusterId() {
        return this.hbaseueClusterId;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return moduleClusterName
     */
    public String getModuleClusterName() {
        return this.moduleClusterName;
    }

    /**
     * @return moduleTypeName
     */
    public String getModuleTypeName() {
        return this.moduleTypeName;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<EnableHBaseueModuleRequest, Builder> {
        private Integer autoRenewPeriod; 
        private String bdsId; 
        private String clientToken; 
        private String coreInstanceType; 
        private Integer diskSize; 
        private String diskType; 
        private String hbaseueClusterId; 
        private String masterInstanceType; 
        private String moduleClusterName; 
        private String moduleTypeName; 
        private Integer nodeCount; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(EnableHBaseueModuleRequest request) {
            super(request);
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.bdsId = request.bdsId;
            this.clientToken = request.clientToken;
            this.coreInstanceType = request.coreInstanceType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.hbaseueClusterId = request.hbaseueClusterId;
            this.masterInstanceType = request.masterInstanceType;
            this.moduleClusterName = request.moduleClusterName;
            this.moduleTypeName = request.moduleTypeName;
            this.nodeCount = request.nodeCount;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
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
         * <p>The ID of the BDS cluster associated with the ApsaraDB for HBase Performance-enhanced Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bds-bp174pm3tsk3****</p>
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The value of this parameter is generated by the client. The value must be unique among different requests, is case-sensitive, and cannot exceed 64 ASCII characters in length.</p>
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
         * <p>The node specifications of the core node. You can invoke the <a href="https://help.aliyun.com/document_detail/188244.html">DescribeAvailableResource</a> operation to obtain the specification value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.large</p>
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * <p>The disk size per node. Unit: GB.</p>
         * <ul>
         * <li>If the instance is a single-node instance, the disk size of a single core node ranges from 20 to 500 GB, with a step size of 1 GB.</li>
         * <li>If the instance uses cloud disks, the disk size of a single core node ranges from 400 to 64,000 GB, with a step size of 40 GB.</li>
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
         * <p>The disk type of the core node. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>local_hdd_pro: local HDD.</li>
         * <li>local_ssd_pro: local SSD.</li>
         * <li>cloud_essd_pl1: ESSD.</li>
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
         * <p>The instance ID of the ApsaraDB for HBase Performance-enhanced Edition database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
         */
        public Builder hbaseueClusterId(String hbaseueClusterId) {
            this.putQueryParameter("HbaseueClusterId", hbaseueClusterId);
            this.hbaseueClusterId = hbaseueClusterId;
            return this;
        }

        /**
         * <p>The node specifications of the master node. You can invoke the <a href="https://help.aliyun.com/document_detail/188244.html">DescribeAvailableResource</a> operation to obtain the specification value.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.large</p>
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * <p>The name of the extension cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-name</p>
         */
        public Builder moduleClusterName(String moduleClusterName) {
            this.putQueryParameter("ModuleClusterName", moduleClusterName);
            this.moduleClusterName = moduleClusterName;
            return this;
        }

        /**
         * <p>The type of the extension module. Set the value to solr.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>solr</p>
         */
        public Builder moduleTypeName(String moduleTypeName) {
            this.putQueryParameter("ModuleTypeName", moduleTypeName);
            this.moduleTypeName = moduleTypeName;
            return this;
        }

        /**
         * <p>The number of nodes. Valid values:</p>
         * <ul>
         * <li>If the instance is a single-node instance, the number of core nodes is fixed to 1.</li>
         * <li>If the instance uses cloud disks, the number of core nodes ranges from 2 to 100.</li>
         * </ul>
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
         * <li>Prepaid: subscription.</li>
         * <li>Postpaid: pay-as-you-go.</li>
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
         * <li>If PeriodUnit is set to year, the valid values are 1 to 3.</li>
         * <li>If PeriodUnit is set to month, the valid values are 1 to 9.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only when the billing method is Prepaid.</p>
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
         * <li><strong>year</strong></li>
         * <li><strong>month</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required only when the billing method is <strong>Prepaid</strong>.</p>
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
         * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp120k6ixs4eog*****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp191ipotqj1ssyl*****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>The ID of the zone. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to obtain the zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public EnableHBaseueModuleRequest build() {
            return new EnableHBaseueModuleRequest(this);
        } 

    } 

}
