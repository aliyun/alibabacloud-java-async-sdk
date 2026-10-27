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
 * {@link ModifyDBInstanceClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceClassRequest</p>
 */
public class ModifyDBInstanceClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlignStoragePrimaryAzone")
    private Boolean alignStoragePrimaryAzone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnClass")
    private String cnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnClass")
    private String dnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnStorageSpace")
    private String dnStorageSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedDNScale")
    private Boolean specifiedDNScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedDNSpecMapJson")
    private String specifiedDNSpecMapJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBInstanceClass")
    private String targetDBInstanceClass;

    private ModifyDBInstanceClassRequest(Builder builder) {
        super(builder);
        this.alignStoragePrimaryAzone = builder.alignStoragePrimaryAzone;
        this.clientToken = builder.clientToken;
        this.cnClass = builder.cnClass;
        this.DBInstanceName = builder.DBInstanceName;
        this.dnClass = builder.dnClass;
        this.dnStorageSpace = builder.dnStorageSpace;
        this.regionId = builder.regionId;
        this.specifiedDNScale = builder.specifiedDNScale;
        this.specifiedDNSpecMapJson = builder.specifiedDNSpecMapJson;
        this.storageType = builder.storageType;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.targetDBInstanceClass = builder.targetDBInstanceClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alignStoragePrimaryAzone
     */
    public Boolean getAlignStoragePrimaryAzone() {
        return this.alignStoragePrimaryAzone;
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return specifiedDNScale
     */
    public Boolean getSpecifiedDNScale() {
        return this.specifiedDNScale;
    }

    /**
     * @return specifiedDNSpecMapJson
     */
    public String getSpecifiedDNSpecMapJson() {
        return this.specifiedDNSpecMapJson;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    /**
     * @return targetDBInstanceClass
     */
    public String getTargetDBInstanceClass() {
        return this.targetDBInstanceClass;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceClassRequest, Builder> {
        private Boolean alignStoragePrimaryAzone; 
        private String clientToken; 
        private String cnClass; 
        private String DBInstanceName; 
        private String dnClass; 
        private String dnStorageSpace; 
        private String regionId; 
        private Boolean specifiedDNScale; 
        private String specifiedDNSpecMapJson; 
        private String storageType; 
        private String switchTime; 
        private String switchTimeMode; 
        private String targetDBInstanceClass; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceClassRequest request) {
            super(request);
            this.alignStoragePrimaryAzone = request.alignStoragePrimaryAzone;
            this.clientToken = request.clientToken;
            this.cnClass = request.cnClass;
            this.DBInstanceName = request.DBInstanceName;
            this.dnClass = request.dnClass;
            this.dnStorageSpace = request.dnStorageSpace;
            this.regionId = request.regionId;
            this.specifiedDNScale = request.specifiedDNScale;
            this.specifiedDNSpecMapJson = request.specifiedDNSpecMapJson;
            this.storageType = request.storageType;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.targetDBInstanceClass = request.targetDBInstanceClass;
        } 

        /**
         * AlignStoragePrimaryAzone.
         */
        public Builder alignStoragePrimaryAzone(Boolean alignStoragePrimaryAzone) {
            this.putQueryParameter("AlignStoragePrimaryAzone", alignStoragePrimaryAzone);
            this.alignStoragePrimaryAzone = alignStoragePrimaryAzone;
            return this;
        }

        /**
         * <p>The client token. It is an arbitrary unique string used to ensure the idempotence of the request.</p>
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
         * <p><strong>Target specifications for Enterprise Edition compute nodes</strong></p>
         * <p><strong>Primary instance compute node specifications (Enterprise Edition CN) (General-purpose)</strong>	</p>
         * <ul>
         * <li>polarx.x4.medium.2e 2 vCPUs, 8 GB (General-purpose)</li>
         * <li>polarx.x4.large.2e 4 vCPUs, 16 GB (General-purpose)</li>
         * <li>polarx.x4.xlarge.2e 8 vCPUs, 32 GB (General-purpose)</li>
         * <li>polarx.x4.2xlarge.2e 16 vCPUs, 64 GB (General-purpose)</li>
         * </ul>
         * <p><strong>Primary instance compute node specifications (Enterprise Edition CN) (Dedicated)</strong>	</p>
         * <ul>
         * <li>polarx.x8.large.2e 4 vCPUs, 32 GB (Dedicated)</li>
         * <li>polarx.x8.xlarge.2e 8 vCPUs, 64 GB (Dedicated)</li>
         * <li>polarx.x8.2xlarge.2e 16 vCPUs, 128 GB (Dedicated)</li>
         * <li>polarx.x4.4xlarge.2e 32 vCPUs, 128 GB (Dedicated)</li>
         * <li>polarx.x8.4xlarge.2e 32 vCPUs, 256 GB (Dedicated)</li>
         * <li>polarx.st.8xlarge.2e 60 vCPUs, 470 GB (Dedicated)</li>
         * <li>polarx.st.12xlarge.2e 90 vCPUs, 720 GB (Dedicated)</li>
         * </ul>
         * <p><strong>Read-only instance compute node specifications (Enterprise Edition CN) (General-purpose)</strong>	</p>
         * <ul>
         * <li>polarxro.x4.medium.2e 2 vCPUs, 8 GB (General-purpose)</li>
         * <li>polarxro.x4.large.2e 4 vCPUs, 16 GB (General-purpose)</li>
         * <li>polarxro.x4.xlarge.2e 8 vCPUs, 32 GB (General-purpose)</li>
         * <li>polarxro.x4.2xlarge.2e 16 vCPUs, 64 GB (General-purpose)</li>
         * </ul>
         * <p><strong>Read-only instance compute node specifications (Enterprise Edition CN) (Dedicated)</strong>	</p>
         * <ul>
         * <li>polarxro.x8.large.2e 4 vCPUs, 32 GB (Dedicated)</li>
         * <li>polarxro.x8.xlarge.2e 8 vCPUs, 64 GB (Dedicated)</li>
         * <li>polarxro.x8.2xlarge.2e 16 vCPUs, 128 GB (Dedicated)</li>
         * <li>polarxro.x4.4xlarge.2e 32 vCPUs, 128 GB (Dedicated)</li>
         * <li>polarxro.x8.4xlarge.2e 32 vCPUs, 256 GB (Dedicated)</li>
         * <li>polarxro.st.8xlarge.2e 60 vCPUs, 470 GB (Dedicated physical host)</li>
         * <li>polarxro.st.12xlarge.2e 90 vCPUs, 720 GB (Dedicated physical host)</li>
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p><strong>Target specifications for Enterprise Edition storage nodes</strong></p>
         * <p><strong>Storage node specifications (Enterprise Edition DN) (General-purpose)</strong>	</p>
         * <ul>
         * <li>mysql.n4.medium.25 2 vCPUs, 8 GB (General-purpose)</li>
         * <li>mysql.n4.large.25 4 vCPUs, 16 GB (General-purpose)</li>
         * <li>mysql.n4.xlarge.25 8 vCPUs, 32 GB (General-purpose)</li>
         * <li>mysql.n4.2xlarge.25 16 vCPUs, 64 GB (General-purpose)</li>
         * </ul>
         * <p><strong>Storage node specifications (Enterprise Edition DN) (Dedicated)</strong>	</p>
         * <ul>
         * <li>mysql.x8.large.25 4 vCPUs, 32 GB (Dedicated)</li>
         * <li>mysql.x8.xlarge.25 8 vCPUs, 64 GB (Dedicated)</li>
         * <li>mysql.x8.2xlarge.25 16 vCPUs, 128 GB (Dedicated)</li>
         * <li>mysql.x4.4xlarge.25 32 vCPUs, 128 GB (Dedicated)</li>
         * <li>mysql.x8.4xlarge.25 32 vCPUs, 256 GB (Dedicated)</li>
         * <li>mysql.st.8xlarge.25 60 vCPUs, 470 GB (Dedicated)</li>
         * <li>mysql.st.12xlarge.25 90 vCPUs, 720 GB (Dedicated)</li>
         * </ul>
         * <p><strong>Read-only instance storage node specifications (Enterprise Edition DN) (General-purpose)</strong>	</p>
         * <ul>
         * <li>rds.mysql.s2.xlarge 2 vCPUs, 8 GB (General-purpose)</li>
         * <li>mysqlro.x4.large.1 4 vCPUs, 16 GB (General-purpose)</li>
         * <li>mysqlro.x4.xlarge.1 8 vCPUs, 32 GB (General-purpose)</li>
         * <li>mysqlro.x4.2xlarge.1 16 vCPUs, 64 GB (General-purpose)</li>
         * </ul>
         * <p><strong>Read-only instance storage node specifications (Enterprise Edition DN) (Dedicated)</strong>	</p>
         * <ul>
         * <li>mysqlro.x8.large.1 4 vCPUs, 32 GB (Dedicated)</li>
         * <li>mysqlro.x8.xlarge.1 8 vCPUs, 64 GB (Dedicated)</li>
         * <li>mysqlro.x8.2xlarge.1 16 vCPUs, 128 GB (Dedicated)</li>
         * <li>mysqlro.x4.4xlarge.1 32 vCPUs, 128 GB (Dedicated)</li>
         * <li>mysqlro.x8.4xlarge.1 32 vCPUs, 256 GB (Dedicated)</li>
         * <li>rds.mysql.st.h43 60 vCPUs, 470 GB (Dedicated physical host)</li>
         * <li>rds.mysql.st.v52 90 vCPUs, 720 GB (Dedicated physical host)</li>
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
         * <p>The target cloud disk size after the specification change.</p>
         * <ul>
         * <li>If the instance uses a fixed-size cloud disk, you cannot change the cloud disk size. In this case, do not specify DnStorageSpace.</li>
         * <li>Valid values of DnStorageSpace: 20 to 3072.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder dnStorageSpace(String dnStorageSpace) {
            this.putQueryParameter("DnStorageSpace", dnStorageSpace);
            this.dnStorageSpace = dnStorageSpace;
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
         * <p>Specifies whether to change the DN nodes to different specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder specifiedDNScale(Boolean specifiedDNScale) {
            this.putQueryParameter("SpecifiedDNScale", specifiedDNScale);
            this.specifiedDNScale = specifiedDNScale;
            return this;
        }

        /**
         * <p>The target specification for each DN node when DN nodes are changed to different specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pxc-xdb-s-htr3rh44ki3s6a4354&quot;:&quot;mysql.n4.medium.25&quot;,&quot;pxc-xdb-s-htr3rh44ki3s6a71c6&quot;:&quot;mysql.n4.medium.25&quot;}</p>
         */
        public Builder specifiedDNSpecMapJson(String specifiedDNSpecMapJson) {
            this.putQueryParameter("SpecifiedDNSpecMapJson", specifiedDNSpecMapJson);
            this.specifiedDNSpecMapJson = specifiedDNSpecMapJson;
            return this;
        }

        /**
         * <p>The target storage type.</p>
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
         * <p>The start time of the switchover. The switchover is performed within the period from the start time T to T+30 minutes. This parameter is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-11T17:10:00Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The switching time. Valid values:</p>
         * <ul>
         * <li>0: Immediately.</li>
         * <li>1: Within the O&amp;M window.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * <p><strong>Target specifications for Standard Edition</strong></p>
         * <p><strong>Primary instance node specifications (Standard Edition) (General-purpose):</strong></p>
         * <ul>
         * <li>mysql.n2.medium.25 2 vCPUs, 4 GB (General-purpose)</li>
         * <li>mysql.n4.medium.25 2 vCPUs, 8 GB (General-purpose)</li>
         * <li>mysql.n8.medium.25 2 vCPUs, 16 GB (General-purpose)</li>
         * <li>mysql.n2.large.25 4 vCPUs, 8 GB (General-purpose)</li>
         * <li>mysql.n4.large.25 4 vCPUs, 16 GB (General-purpose)</li>
         * <li>mysql.n8.large.25 4 vCPUs, 32 GB (General-purpose)</li>
         * <li>mysql.n2.xlarge.25 8 vCPUs, 16 GB (General-purpose)</li>
         * <li>mysql.n4.xlarge.25 8 vCPUs, 32 GB (General-purpose)</li>
         * <li>mysql.n8.xlarge.25 8 vCPUs, 64 GB (General-purpose)</li>
         * <li>mysql.n2.2xlarge.25 16 vCPUs, 32 GB (General-purpose)</li>
         * <li>mysql.n4.2xlarge.25 16 vCPUs, 64 GB (General-purpose)</li>
         * <li>mysql.n8.2xlarge.25 16 vCPUs, 128 GB (General-purpose)</li>
         * </ul>
         * <p><strong>Primary instance node specifications (Standard Edition) (Dedicated):</strong></p>
         * <ul>
         * <li>mysql.x2.medium.25 2 vCPUs, 4 GB (Dedicated)</li>
         * <li>mysql.x4.medium.25 2 vCPUs, 8 GB (Dedicated)</li>
         * <li>mysql.x8.medium.25 2 vCPUs, 16 GB (Dedicated)</li>
         * <li>mysql.x2.large.25 4 vCPUs, 8 GB (Dedicated)</li>
         * <li>mysql.x4.large.25 4 vCPUs, 16 GB (Dedicated)</li>
         * <li>mysql.x8.large.25 4 vCPUs, 32 GB (Dedicated)</li>
         * <li>mysql.x2.xlarge.25 8 vCPUs, 16 GB (Dedicated)</li>
         * <li>mysql.x4.xlarge.25 8 vCPUs, 32 GB (Dedicated)</li>
         * <li>mysql.x8.xlarge.25 8 vCPUs, 64 GB (Dedicated)</li>
         * <li>mysql.x2.2xlarge.25 16 vCPUs, 32 GB (Dedicated)</li>
         * <li>mysql.x4.2xlarge.25 16 vCPUs, 64 GB (Dedicated)</li>
         * <li>mysql.x8.2xlarge.25 16 vCPUs, 128 GB (Dedicated)</li>
         * </ul>
         * <p><strong>Read-only instance node specifications (Standard Edition) (General-purpose)</strong>	</p>
         * <ul>
         * <li>rds.mysql.s2.xlarge 2 vCPUs, 8 GB (General-purpose)</li>
         * <li>mysqlro.x4.large.1 4 vCPUs, 16 GB (General-purpose)</li>
         * <li>mysqlro.x4.xlarge.1 8 vCPUs, 32 GB (General-purpose)</li>
         * <li>mysqlro.x4.2xlarge.1 16 vCPUs, 64 GB (General-purpose)</li>
         * </ul>
         * <p><strong>Read-only instance node specifications (Standard Edition) (Dedicated)</strong>	</p>
         * <ul>
         * <li>mysqlro.x8.large.1 4 vCPUs, 32 GB (Dedicated) </li>
         * <li>mysqlro.x8.xlarge.1 8 vCPUs, 64 GB (Dedicated) </li>
         * <li>mysqlro.x8.2xlarge.1 16 vCPUs, 128 GB (Dedicated) </li>
         * <li>mysqlro.x4.4xlarge.1 32 vCPUs, 128 GB (Dedicated) </li>
         * <li>mysqlro.x8.4xlarge.1 32 vCPUs, 256 GB (Dedicated)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.medium.25</p>
         */
        public Builder targetDBInstanceClass(String targetDBInstanceClass) {
            this.putQueryParameter("TargetDBInstanceClass", targetDBInstanceClass);
            this.targetDBInstanceClass = targetDBInstanceClass;
            return this;
        }

        @Override
        public ModifyDBInstanceClassRequest build() {
            return new ModifyDBInstanceClassRequest(this);
        } 

    } 

}
