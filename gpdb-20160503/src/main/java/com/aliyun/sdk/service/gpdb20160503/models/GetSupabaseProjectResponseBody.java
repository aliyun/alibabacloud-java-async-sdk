// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSupabaseProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupabaseProjectResponseBody</p>
 */
public class GetSupabaseProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DashboardPassword")
    private String dashboardPassword;

    @com.aliyun.core.annotation.NameInMap("DashboardUserName")
    private String dashboardUserName;

    @com.aliyun.core.annotation.NameInMap("DiskPerformanceLevel")
    private String diskPerformanceLevel;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("InstanceVersion")
    private String instanceVersion;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PrivateConnectUrl")
    private String privateConnectUrl;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("ProjectSpec")
    private String projectSpec;

    @com.aliyun.core.annotation.NameInMap("PublicConnectUrl")
    private String publicConnectUrl;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpList")
    private String securityIpList;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private GetSupabaseProjectResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.dashboardPassword = builder.dashboardPassword;
        this.dashboardUserName = builder.dashboardUserName;
        this.diskPerformanceLevel = builder.diskPerformanceLevel;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceVersion = builder.instanceVersion;
        this.payType = builder.payType;
        this.privateConnectUrl = builder.privateConnectUrl;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.projectSpec = builder.projectSpec;
        this.publicConnectUrl = builder.publicConnectUrl;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityIpList = builder.securityIpList;
        this.status = builder.status;
        this.storageSize = builder.storageSize;
        this.storageType = builder.storageType;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupabaseProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dashboardPassword
     */
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    /**
     * @return dashboardUserName
     */
    public String getDashboardUserName() {
        return this.dashboardUserName;
    }

    /**
     * @return diskPerformanceLevel
     */
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
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
     * @return instanceVersion
     */
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return privateConnectUrl
     */
    public String getPrivateConnectUrl() {
        return this.privateConnectUrl;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return projectSpec
     */
    public String getProjectSpec() {
        return this.projectSpec;
    }

    /**
     * @return publicConnectUrl
     */
    public String getPublicConnectUrl() {
        return this.publicConnectUrl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpList
     */
    public String getSecurityIpList() {
        return this.securityIpList;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
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

    public static final class Builder {
        private String createTime; 
        private String dashboardPassword; 
        private String dashboardUserName; 
        private String diskPerformanceLevel; 
        private String engine; 
        private String engineVersion; 
        private String instanceVersion; 
        private String payType; 
        private String privateConnectUrl; 
        private String projectId; 
        private String projectName; 
        private String projectSpec; 
        private String publicConnectUrl; 
        private String regionId; 
        private String requestId; 
        private String securityIpList; 
        private String status; 
        private Long storageSize; 
        private String storageType; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(GetSupabaseProjectResponseBody model) {
            this.createTime = model.createTime;
            this.dashboardPassword = model.dashboardPassword;
            this.dashboardUserName = model.dashboardUserName;
            this.diskPerformanceLevel = model.diskPerformanceLevel;
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.instanceVersion = model.instanceVersion;
            this.payType = model.payType;
            this.privateConnectUrl = model.privateConnectUrl;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.projectSpec = model.projectSpec;
            this.publicConnectUrl = model.publicConnectUrl;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.securityIpList = model.securityIpList;
            this.status = model.status;
            this.storageSize = model.storageSize;
            this.storageType = model.storageType;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The Supabase Dashboard password (Not Used)</p>
         * 
         * <strong>example:</strong>
         * <p>xxpassword</p>
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * <p>The Supabase Dashboard user name (Not Used)</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder dashboardUserName(String dashboardUserName) {
            this.dashboardUserName = dashboardUserName;
            return this;
        }

        /**
         * <p>The Enterprise SSD (ESSD) performance level of the cluster. Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder diskPerformanceLevel(String diskPerformanceLevel) {
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>postgres</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * InstanceVersion.
         */
        public Builder instanceVersion(String instanceVersion) {
            this.instanceVersion = instanceVersion;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The private (VPC) connection URL for the Supabase Dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.11</p>
         */
        public Builder privateConnectUrl(String privateConnectUrl) {
            this.privateConnectUrl = privateConnectUrl;
            return this;
        }

        /**
         * <p>The Supabase instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-545434</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the Supabase project.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase_project</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The performance level of the Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1C1G</p>
         */
        public Builder projectSpec(String projectSpec) {
            this.projectSpec = projectSpec;
            return this;
        }

        /**
         * <p>The public connection URL for the Supabase Dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>10.154.11.10</p>
         */
        public Builder publicConnectUrl(String publicConnectUrl) {
            this.publicConnectUrl = publicConnectUrl;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A comma-separated list of IP addresses and CIDR blocks allowed to connect.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder securityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        /**
         * <p>The status of the Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder storageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The vSwitch ID of the instance. This parameter must be specified when VPCId is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/208327.html">DescribeRdsVpcs</a> operation to query the available VPC IDs.</p>
         * </li>
         * <li><p>This parameter is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp*******************</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list and zone list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetSupabaseProjectResponseBody build() {
            return new GetSupabaseProjectResponseBody(this);
        } 

    } 

}
