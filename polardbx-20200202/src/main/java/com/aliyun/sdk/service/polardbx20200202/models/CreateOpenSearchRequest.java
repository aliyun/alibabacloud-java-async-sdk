// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateOpenSearchRequest} extends {@link RequestModel}
 *
 * <p>CreateOpenSearchRequest</p>
 */
public class CreateOpenSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99)
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    private Integer storageSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopologyType")
    private String topologyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zone2")
    private String zone2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zone3")
    private String zone3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateOpenSearchRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBNodeClass = builder.DBNodeClass;
        this.engineVersion = builder.engineVersion;
        this.instanceSpec = builder.instanceSpec;
        this.nodeCount = builder.nodeCount;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.topologyType = builder.topologyType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zone2 = builder.zone2;
        this.zone3 = builder.zone3;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpenSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
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
    public String getPeriod() {
        return this.period;
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
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return this.storageSpace;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return topologyType
     */
    public String getTopologyType() {
        return this.topologyType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zone2
     */
    public String getZone2() {
        return this.zone2;
    }

    /**
     * @return zone3
     */
    public String getZone3() {
        return this.zone3;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateOpenSearchRequest, Builder> {
        private Boolean autoRenew; 
        private String clientToken; 
        private String DBInstanceDescription; 
        private String DBNodeClass; 
        private String engineVersion; 
        private String instanceSpec; 
        private Integer nodeCount; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer storageSpace; 
        private String storageType; 
        private String topologyType; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zone2; 
        private String zone3; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOpenSearchRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBNodeClass = request.DBNodeClass;
            this.engineVersion = request.engineVersion;
            this.instanceSpec = request.instanceSpec;
            this.nodeCount = request.nodeCount;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storageSpace = request.storageSpace;
            this.storageType = request.storageType;
            this.topologyType = request.topologyType;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zone2 = request.zone2;
            this.zone3 = request.zone3;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal. Default value: true. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables auto-renewal</li>
         * <li><strong>false</strong>: disables auto-renewal</li>
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
         * <p>The idempotency token. Make sure that the value is unique for each creation request.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The code for the node specifications of the PolarDBX Search data node. The active node specifications vary by region and sales configuration. Use a PolarDBX Search node specifications code that is available for purchase in the current region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch.sn2ne.large.1</p>
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * <p>The database engine version of PolarDBX Search. The current fixed DPI engine version is 3.0. If this parameter is not specified, 3.0 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>A compatible parameter. This parameter does not take effect. Specify the node specifications of the PolarDBX Search data node by using DBNodeClass.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch.sn2ne.large.1</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>The number of PolarDBX Search data nodes. The value must be a positive integer and an integer multiple of the number of selected zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle. For subscription instances, only Year and Month are supported. For pay-as-you-go instances, the default value is Hour.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The resource group ID. This parameter can be left empty and is not currently supported.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The storage space per node, in GB. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder storageSpace(Integer storageSpace) {
            this.putQueryParameter("StorageSpace", storageSpace);
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * <p>The storage type. Default value: cloud_auto.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The active topology type. Valid values:</p>
         * <ul>
         * <li><strong>1azone</strong>: single-zone.</li>
         * <li><strong>3azones</strong>: Three-zone deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3azones</p>
         */
        public Builder topologyType(String topologyType) {
            this.putQueryParameter("TopologyType", topologyType);
            this.topologyType = topologyType;
            return this;
        }

        /**
         * <p>The subscription duration. You can specify a duration in months or years for subscription instances.</p>
         * <blockquote>
         * <p>When Period is set to Year, valid values for this parameter are 1, 2, and 3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The secondary zone. This parameter is required when TopologyType is set to 3azones, and the value must be different from other zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zone2(String zone2) {
            this.putQueryParameter("Zone2", zone2);
            this.zone2 = zone2;
            return this;
        }

        /**
         * <p>The third zone for Three-zone deployment. This parameter is required when TopologyType is set to 3azones, and the value must be different from other active zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder zone3(String zone3) {
            this.putQueryParameter("Zone3", zone3);
            this.zone3 = zone3;
            return this;
        }

        /**
         * <p>The zone of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateOpenSearchRequest build() {
            return new CreateOpenSearchRequest(this);
        } 

    } 

}
