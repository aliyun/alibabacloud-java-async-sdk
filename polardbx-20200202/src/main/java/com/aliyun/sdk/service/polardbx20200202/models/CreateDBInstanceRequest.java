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
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CNNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer CNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnClass")
    private String cnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer DBNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DNNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer DNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnClass")
    private String dnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnStorageSpace")
    private String dnStorageSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraParams")
    private java.util.Map<String, String> extraParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsColumnarReadDBInstance")
    private Boolean isColumnarReadDBInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReadDBInstance")
    private Boolean isReadDBInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryDBInstanceName")
    private String primaryDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZone")
    private String primaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZone")
    private String secondaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Series")
    private String series;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TertiaryZone")
    private String tertiaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopologyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topologyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.CNNodeCount = builder.CNNodeCount;
        this.clientToken = builder.clientToken;
        this.cnClass = builder.cnClass;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBNodeCount = builder.DBNodeCount;
        this.DNNodeCount = builder.DNNodeCount;
        this.dnClass = builder.dnClass;
        this.dnStorageSpace = builder.dnStorageSpace;
        this.engineVersion = builder.engineVersion;
        this.extraParams = builder.extraParams;
        this.isColumnarReadDBInstance = builder.isColumnarReadDBInstance;
        this.isReadDBInstance = builder.isReadDBInstance;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.primaryDBInstanceName = builder.primaryDBInstanceName;
        this.primaryZone = builder.primaryZone;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.secondaryZone = builder.secondaryZone;
        this.series = builder.series;
        this.tertiaryZone = builder.tertiaryZone;
        this.topologyType = builder.topologyType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
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
     * @return CNNodeCount
     */
    public Integer getCNNodeCount() {
        return this.CNNodeCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cnClass
     */
    public String getCnClass() {
        return this.cnClass;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBNodeCount
     */
    public Integer getDBNodeCount() {
        return this.DBNodeCount;
    }

    /**
     * @return DNNodeCount
     */
    public Integer getDNNodeCount() {
        return this.DNNodeCount;
    }

    /**
     * @return dnClass
     */
    public String getDnClass() {
        return this.dnClass;
    }

    /**
     * @return dnStorageSpace
     */
    public String getDnStorageSpace() {
        return this.dnStorageSpace;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return extraParams
     */
    public java.util.Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return isColumnarReadDBInstance
     */
    public Boolean getIsColumnarReadDBInstance() {
        return this.isColumnarReadDBInstance;
    }

    /**
     * @return isReadDBInstance
     */
    public Boolean getIsReadDBInstance() {
        return this.isReadDBInstance;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return primaryDBInstanceName
     */
    public String getPrimaryDBInstanceName() {
        return this.primaryDBInstanceName;
    }

    /**
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
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
     * @return secondaryZone
     */
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return tertiaryZone
     */
    public String getTertiaryZone() {
        return this.tertiaryZone;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private Boolean autoRenew; 
        private Integer CNNodeCount; 
        private String clientToken; 
        private String cnClass; 
        private String DBNodeClass; 
        private Integer DBNodeCount; 
        private Integer DNNodeCount; 
        private String dnClass; 
        private String dnStorageSpace; 
        private String engineVersion; 
        private java.util.Map<String, String> extraParams; 
        private Boolean isColumnarReadDBInstance; 
        private Boolean isReadDBInstance; 
        private String networkType; 
        private String payType; 
        private String period; 
        private String primaryDBInstanceName; 
        private String primaryZone; 
        private String regionId; 
        private String resourceGroupId; 
        private String secondaryZone; 
        private String series; 
        private String tertiaryZone; 
        private String topologyType; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.CNNodeCount = request.CNNodeCount;
            this.clientToken = request.clientToken;
            this.cnClass = request.cnClass;
            this.DBNodeClass = request.DBNodeClass;
            this.DBNodeCount = request.DBNodeCount;
            this.DNNodeCount = request.DNNodeCount;
            this.dnClass = request.dnClass;
            this.dnStorageSpace = request.dnStorageSpace;
            this.engineVersion = request.engineVersion;
            this.extraParams = request.extraParams;
            this.isColumnarReadDBInstance = request.isColumnarReadDBInstance;
            this.isReadDBInstance = request.isReadDBInstance;
            this.networkType = request.networkType;
            this.payType = request.payType;
            this.period = request.period;
            this.primaryDBInstanceName = request.primaryDBInstanceName;
            this.primaryZone = request.primaryZone;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.secondaryZone = request.secondaryZone;
            this.series = request.series;
            this.tertiaryZone = request.tertiaryZone;
            this.topologyType = request.topologyType;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * CNNodeCount.
         */
        public Builder CNNodeCount(Integer CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CnClass.
         */
        public Builder cnClass(String cnClass) {
            this.putQueryParameter("CnClass", cnClass);
            this.cnClass = cnClass;
            return this;
        }

        /**
         * DBNodeClass.
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * DBNodeCount.
         */
        public Builder DBNodeCount(Integer DBNodeCount) {
            this.putQueryParameter("DBNodeCount", DBNodeCount);
            this.DBNodeCount = DBNodeCount;
            return this;
        }

        /**
         * DNNodeCount.
         */
        public Builder DNNodeCount(Integer DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
            return this;
        }

        /**
         * DnClass.
         */
        public Builder dnClass(String dnClass) {
            this.putQueryParameter("DnClass", dnClass);
            this.dnClass = dnClass;
            return this;
        }

        /**
         * DnStorageSpace.
         */
        public Builder dnStorageSpace(String dnStorageSpace) {
            this.putQueryParameter("DnStorageSpace", dnStorageSpace);
            this.dnStorageSpace = dnStorageSpace;
            return this;
        }

        /**
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
         * ExtraParams.
         */
        public Builder extraParams(java.util.Map<String, String> extraParams) {
            String extraParamsShrink = shrink(extraParams, "ExtraParams", "json");
            this.putQueryParameter("ExtraParams", extraParamsShrink);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * IsColumnarReadDBInstance.
         */
        public Builder isColumnarReadDBInstance(Boolean isColumnarReadDBInstance) {
            this.putQueryParameter("IsColumnarReadDBInstance", isColumnarReadDBInstance);
            this.isColumnarReadDBInstance = isColumnarReadDBInstance;
            return this;
        }

        /**
         * IsReadDBInstance.
         */
        public Builder isReadDBInstance(Boolean isReadDBInstance) {
            this.putQueryParameter("IsReadDBInstance", isReadDBInstance);
            this.isReadDBInstance = isReadDBInstance;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
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
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PrimaryDBInstanceName.
         */
        public Builder primaryDBInstanceName(String primaryDBInstanceName) {
            this.putQueryParameter("PrimaryDBInstanceName", primaryDBInstanceName);
            this.primaryDBInstanceName = primaryDBInstanceName;
            return this;
        }

        /**
         * PrimaryZone.
         */
        public Builder primaryZone(String primaryZone) {
            this.putQueryParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecondaryZone.
         */
        public Builder secondaryZone(String secondaryZone) {
            this.putQueryParameter("SecondaryZone", secondaryZone);
            this.secondaryZone = secondaryZone;
            return this;
        }

        /**
         * Series.
         */
        public Builder series(String series) {
            this.putQueryParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * TertiaryZone.
         */
        public Builder tertiaryZone(String tertiaryZone) {
            this.putQueryParameter("TertiaryZone", tertiaryZone);
            this.tertiaryZone = tertiaryZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * UsedTime.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>VPC ID。</p>
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
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

}
