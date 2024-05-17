// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDataListRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupDataListRequest</p>
 */
public class DescribeBackupDataListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupScale")
    private String backupScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIsDeleted")
    private Boolean instanceIsDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRegion")
    private String instanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private String sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeBackupDataListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupId = builder.backupId;
        this.backupMethod = builder.backupMethod;
        this.backupMode = builder.backupMode;
        this.backupScale = builder.backupScale;
        this.backupStatus = builder.backupStatus;
        this.backupType = builder.backupType;
        this.dataSourceId = builder.dataSourceId;
        this.endTime = builder.endTime;
        this.instanceIsDeleted = builder.instanceIsDeleted;
        this.instanceName = builder.instanceName;
        this.instanceRegion = builder.instanceRegion;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionCode = builder.regionCode;
        this.sceneType = builder.sceneType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupDataListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return backupScale
     */
    public String getBackupScale() {
        return this.backupScale;
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceIsDeleted
     */
    public Boolean getInstanceIsDeleted() {
        return this.instanceIsDeleted;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceRegion
     */
    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeBackupDataListRequest, Builder> {
        private String regionId; 
        private String backupId; 
        private String backupMethod; 
        private String backupMode; 
        private String backupScale; 
        private String backupStatus; 
        private String backupType; 
        private String dataSourceId; 
        private String endTime; 
        private Boolean instanceIsDeleted; 
        private String instanceName; 
        private String instanceRegion; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionCode; 
        private String sceneType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupDataListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupId = request.backupId;
            this.backupMethod = request.backupMethod;
            this.backupMode = request.backupMode;
            this.backupScale = request.backupScale;
            this.backupStatus = request.backupStatus;
            this.backupType = request.backupType;
            this.dataSourceId = request.dataSourceId;
            this.endTime = request.endTime;
            this.instanceIsDeleted = request.instanceIsDeleted;
            this.instanceName = request.instanceName;
            this.instanceRegion = request.instanceRegion;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionCode = request.regionCode;
            this.sceneType = request.sceneType;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupMethod.
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * BackupScale.
         */
        public Builder backupScale(String backupScale) {
            this.putQueryParameter("BackupScale", backupScale);
            this.backupScale = backupScale;
            return this;
        }

        /**
         * BackupStatus.
         */
        public Builder backupStatus(String backupStatus) {
            this.putQueryParameter("BackupStatus", backupStatus);
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * BackupType.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceIsDeleted.
         */
        public Builder instanceIsDeleted(Boolean instanceIsDeleted) {
            this.putQueryParameter("InstanceIsDeleted", instanceIsDeleted);
            this.instanceIsDeleted = instanceIsDeleted;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceRegion.
         */
        public Builder instanceRegion(String instanceRegion) {
            this.putQueryParameter("InstanceRegion", instanceRegion);
            this.instanceRegion = instanceRegion;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeBackupDataListRequest build() {
            return new DescribeBackupDataListRequest(this);
        } 

    } 

}
