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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("OriginMinorVersion")
    private String originMinorVersion;

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
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

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
        this.description = builder.description;
        this.dnClass = builder.dnClass;
        this.dnStorageSpace = builder.dnStorageSpace;
        this.engineVersion = builder.engineVersion;
        this.extraParams = builder.extraParams;
        this.isColumnarReadDBInstance = builder.isColumnarReadDBInstance;
        this.isReadDBInstance = builder.isReadDBInstance;
        this.networkType = builder.networkType;
        this.originMinorVersion = builder.originMinorVersion;
        this.payType = builder.payType;
        this.period = builder.period;
        this.primaryDBInstanceName = builder.primaryDBInstanceName;
        this.primaryZone = builder.primaryZone;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.secondaryZone = builder.secondaryZone;
        this.series = builder.series;
        this.storageType = builder.storageType;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return originMinorVersion
     */
    public String getOriginMinorVersion() {
        return this.originMinorVersion;
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
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
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
        private String description; 
        private String dnClass; 
        private String dnStorageSpace; 
        private String engineVersion; 
        private java.util.Map<String, String> extraParams; 
        private Boolean isColumnarReadDBInstance; 
        private Boolean isReadDBInstance; 
        private String networkType; 
        private String originMinorVersion; 
        private String payType; 
        private String period; 
        private String primaryDBInstanceName; 
        private String primaryZone; 
        private String regionId; 
        private String resourceGroupId; 
        private String secondaryZone; 
        private String series; 
        private String storageType; 
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
            this.description = request.description;
            this.dnClass = request.dnClass;
            this.dnStorageSpace = request.dnStorageSpace;
            this.engineVersion = request.engineVersion;
            this.extraParams = request.extraParams;
            this.isColumnarReadDBInstance = request.isColumnarReadDBInstance;
            this.isReadDBInstance = request.isReadDBInstance;
            this.networkType = request.networkType;
            this.originMinorVersion = request.originMinorVersion;
            this.payType = request.payType;
            this.period = request.period;
            this.primaryDBInstanceName = request.primaryDBInstanceName;
            this.primaryZone = request.primaryZone;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.secondaryZone = request.secondaryZone;
            this.series = request.series;
            this.storageType = request.storageType;
            this.tertiaryZone = request.tertiaryZone;
            this.topologyType = request.topologyType;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal. Default value: true. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enables auto-renewal.</li>
         * <li><strong>false</strong>: Disables auto-renewal.</li>
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
         * <p>The number of compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder CNNodeCount(Integer CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You must specify a unique token for each request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx-xxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The specifications of compute nodes. Required when you create an Enterprise Edition instance. Not required for a Standard Edition instance.</p>
         * <p>Local node specifications for Enterprise Edition:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.2e</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>polarx.x4.large.2e</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>polarx.x4.xlarge.2e</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>polarx.x8.large.2e</strong>: 4 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.x2.large.2x</strong>: 8 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.x4.xlarge.2x</strong>: 8 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.x8.xlarge.2e</strong>: 8 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>polarx.st.8xlarge.2e</strong>: 60 vCPUs, 470 GB (dedicated)</li>
         * <li><strong>polarx.st.12xlarge.2e</strong>: 90 vCPUs, 720 GB (dedicated)</li>
         * </ul>
         * <p>Cloud node specifications for Enterprise Edition:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.c2e</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>polarx.x4.large.c2e</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>polarx.x4.xlarge.c2e</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>polarx.x4.2xlarge.c2e</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>polarx.x8.large.c2e</strong>: 4 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.x2.large.c2x</strong>: 8 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.x4.xlarge.c2x</strong>: 8 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.x8.xlarge.c2e</strong>: 8 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>polarx.x8.2xlarge.c2e</strong>: 16 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.x4.4xlarge.c2e</strong>: 32 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.x8.4xlarge.c2e</strong>: 32 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>polarx.st.8xlarge.c2e</strong>: 60 vCPUs, 470 GB (dedicated)</li>
         * <li><strong>polarx.st.12xlarge.c2e</strong>: 90 vCPUs, 720 GB (dedicated)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.medium.2e</p>
         */
        public Builder cnClass(String cnClass) {
            this.putQueryParameter("CnClass", cnClass);
            this.cnClass = cnClass;
            return this;
        }

        /**
         * <p>Required when you create a Standard Edition instance. Not required for an Enterprise Edition instance.</p>
         * <p>Local disk specifications for Standard Edition:</p>
         * <ul>
         * <li><strong>mysql.n8.small.25</strong>: 1 vCPU, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n2.medium.25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n8.medium.25</strong>: 2 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>mysql.n8.large.25</strong>: 4 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>mysql.n2.xlarge.25</strong>: 8 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>mysql.n8.xlarge.25</strong>: 8 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>mysql.n2.2xlarge.25</strong>: 16 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>mysql.n8.2xlarge.25</strong>: 16 vCPUs, 128 GB (general-purpose)</li>
         * <li><strong>mysql.x2.medium.25</strong>: 2 vCPUs, 4 GB (dedicated)</li>
         * <li><strong>mysql.x4.medium.25</strong>: 2 vCPUs, 8 GB (dedicated)</li>
         * <li><strong>mysql.x8.medium.25</strong>: 2 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>mysql.x2.large.25</strong>: 4 vCPUs, 8 GB (dedicated)</li>
         * <li><strong>mysql.x4.large.25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>mysql.x2.xlarge.25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>mysql.x4.xlarge.25</strong>: 8 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>mysql.x2.2xlarge.25</strong>: 16 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>mysql.x4.2xlarge.25</strong>: 16 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>mysql.x4.8xlarge.25</strong>: 64 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>mysql.x8.8xlarge.25</strong>: 64 vCPUs, 512 GB (dedicated)</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 vCPUs, 720 GB (dedicated)</li>
         * </ul>
         * <p>Cloud disk specifications for Standard Edition:</p>
         * <ul>
         * <li><strong>polarx.mysql.n2.medium.c25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.medium.c25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n8.medium.c25</strong>: 2 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n2.large.c25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.large.c25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n8.large.c25</strong>: 4 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n2.xlarge.c25</strong>: 8 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.xlarge.c25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n8.xlarge.c25</strong>: 8 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.x2.medium.c25</strong>: 2 vCPUs, 4 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.medium.c25</strong>: 2 vCPUs, 8 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.medium.c25</strong>: 2 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.large.c25</strong>: 4 vCPUs, 8 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.large.c25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.large.c25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.xlarge.c25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.xlarge.c25</strong>: 8 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.xlarge.c25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.2xlarge.c25</strong>: 16 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.2xlarge.c25</strong>: 16 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.4xlarge.c25</strong>: 32 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.8xlarge.c25</strong>: 64 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.8xlarge.c25</strong>: 64 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.8xlarge.c25</strong>: 64 vCPUs, 512 GB (dedicated)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.2xlarge.2d</p>
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * <p>The number of nodes in the instance. Valid values:</p>
         * <ul>
         * <li>Standard Edition: 1</li>
         * <li>Enterprise Edition: 2 or greater</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder DBNodeCount(Integer DBNodeCount) {
            this.putQueryParameter("DBNodeCount", DBNodeCount);
            this.DBNodeCount = DBNodeCount;
            return this;
        }

        /**
         * <p>The number of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DNNodeCount(Integer DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
            return this;
        }

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_api_apidata_mobilegame_pay_api_di</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The specifications of storage nodes. Required when you create an Enterprise Edition instance. Not required for a Standard Edition instance.</p>
         * <p>Local node specifications for Enterprise Edition:</p>
         * <ul>
         * <li><strong>mysql.n2.medium.25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>mysql.x4.large.25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>mysql.x2.xlarge.25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>mysql.st.8xlarge.25</strong>: 60 vCPUs, 470 GB (dedicated)</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 vCPUs, 720 GB (dedicated)</li>
         * <li><strong>mysql.x8.45xlarge.25</strong>: 180 vCPUs, 1440 GB (dedicated)</li>
         * <li><strong>mysql.x8.60xlarge.25</strong>: 240 vCPUs, 1920 GB (dedicated)</li>
         * </ul>
         * <p>Cloud node specifications for Enterprise Edition:</p>
         * <ul>
         * <li><strong>polarx.mysql.n2.medium.c25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.medium.c25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n2.large.c25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.large.c25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.xlarge.c25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.2xlarge.c25</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.x4.large.c25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.large.c25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.xlarge.c25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.xlarge.c25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
         * <li><strong>polarx.mysql.st.8xlarge.c25</strong>: 60 vCPUs, 470 GB (dedicated)</li>
         * <li><strong>polarx.mysql.st.12xlarge.c25</strong>: 90 vCPUs, 720 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.45xlarge.c25</strong>: 180 vCPUs, 1440 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.60xlarge.c25</strong>: 240 vCPUs, 1920 GB (dedicated)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql.n4.medium.25</p>
         */
        public Builder dnClass(String dnClass) {
            this.putQueryParameter("DnClass", dnClass);
            this.dnClass = dnClass;
            return this;
        }

        /**
         * <p>The disk space of the storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        public Builder dnStorageSpace(String dnStorageSpace) {
            this.putQueryParameter("DnStorageSpace", dnStorageSpace);
            this.dnStorageSpace = dnStorageSpace;
            return this;
        }

        /**
         * <p>The MySQL DPI engine version. Valid values: 5.7 and 8.0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The extra parameters.</p>
         */
        public Builder extraParams(java.util.Map<String, String> extraParams) {
            String extraParamsShrink = shrink(extraParams, "ExtraParams", "json");
            this.putQueryParameter("ExtraParams", extraParamsShrink);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * <p>Specifies whether the instance to be created is a column store read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isColumnarReadDBInstance(Boolean isColumnarReadDBInstance) {
            this.putQueryParameter("IsColumnarReadDBInstance", isColumnarReadDBInstance);
            this.isColumnarReadDBInstance = isColumnarReadDBInstance;
            return this;
        }

        /**
         * <p>Specifies whether the instance is a read-only instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isReadDBInstance(Boolean isReadDBInstance) {
            this.putQueryParameter("IsReadDBInstance", isReadDBInstance);
            this.isReadDBInstance = isReadDBInstance;
            return this;
        }

        /**
         * <p>The network type of the instance. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The minor engine version. This parameter is generally not required.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb-2.4.0_standard_xcluster8.4.20-20260331</p>
         */
        public Builder originMinorVersion(String originMinorVersion) {
            this.putQueryParameter("OriginMinorVersion", originMinorVersion);
            this.originMinorVersion = originMinorVersion;
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
         * <p>The billing cycle. Valid values for subscription instances: Year and Month. Default value for pay-as-you-go instances: Hour.</p>
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
         * <p>The name of the primary instance. This parameter is required if the instance is a read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        public Builder primaryDBInstanceName(String primaryDBInstanceName) {
            this.putQueryParameter("PrimaryDBInstanceName", primaryDBInstanceName);
            this.primaryDBInstanceName = primaryDBInstanceName;
            return this;
        }

        /**
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder primaryZone(String primaryZone) {
            this.putQueryParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * <p>The region of the instance.</p>
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
         * <p>The resource group ID. This parameter is not supported and can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-a</p>
         */
        public Builder secondaryZone(String secondaryZone) {
            this.putQueryParameter("SecondaryZone", secondaryZone);
            this.secondaryZone = secondaryZone;
            return this;
        }

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li>enterprise: Enterprise Edition</li>
         * <li>standard: Standard Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder series(String series) {
            this.putQueryParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>custom_local_ssd: local disk</li>
         * <li>cloud_auto: cloud disk</li>
         * </ul>
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
         * <p>The third active zone in a Three-zone deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder tertiaryZone(String tertiaryZone) {
            this.putQueryParameter("TertiaryZone", tertiaryZone);
            this.tertiaryZone = tertiaryZone;
            return this;
        }

        /**
         * <p>The topology type. Valid values:</p>
         * <ul>
         * <li><strong>3azones</strong>: Three-zone deployment (three active zones).</li>
         * <li><strong>1azone</strong>: Single active zone.</li>
         * </ul>
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
         * <p>The subscription duration. This parameter is required when the billing method is set to subscription.</p>
         * <blockquote>
         * <p>If Period is set to Year, valid values are 1, 2, and 3.</p>
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
         * <p>The zone of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
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
