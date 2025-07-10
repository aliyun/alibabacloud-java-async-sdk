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
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
            this.zoneId = model.zoneId;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DashboardPassword.
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * DashboardUserName.
         */
        public Builder dashboardUserName(String dashboardUserName) {
            this.dashboardUserName = dashboardUserName;
            return this;
        }

        /**
         * DiskPerformanceLevel.
         */
        public Builder diskPerformanceLevel(String diskPerformanceLevel) {
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * PrivateConnectUrl.
         */
        public Builder privateConnectUrl(String privateConnectUrl) {
            this.privateConnectUrl = privateConnectUrl;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * ProjectSpec.
         */
        public Builder projectSpec(String projectSpec) {
            this.projectSpec = projectSpec;
            return this;
        }

        /**
         * PublicConnectUrl.
         */
        public Builder publicConnectUrl(String publicConnectUrl) {
            this.publicConnectUrl = publicConnectUrl;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityIpList.
         */
        public Builder securityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
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
