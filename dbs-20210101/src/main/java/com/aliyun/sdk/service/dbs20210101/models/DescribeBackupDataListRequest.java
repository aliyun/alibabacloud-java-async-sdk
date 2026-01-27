// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>213064****</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><strong>Physical</strong></li>
         * <li><strong>Logical</strong></li>
         * <li><strong>Snapshot</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The backup scale. Valid values:</p>
         * <ul>
         * <li><strong>DBInstance</strong></li>
         * <li><strong>DBTable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DBInstance</p>
         */
        public Builder backupScale(String backupScale) {
            this.putQueryParameter("BackupScale", backupScale);
            this.backupScale = backupScale;
            return this;
        }

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The backup succeeded.</li>
         * <li><strong>ERROR</strong>: The backup failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder backupStatus(String backupStatus) {
            this.putQueryParameter("BackupStatus", backupStatus);
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong></li>
         * <li><strong>IncrementBackup</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * <p>This is a reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. The time follows the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-17T17:00:32Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether the cluster is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder instanceIsDeleted(Boolean instanceIsDeleted) {
            this.putQueryParameter("InstanceIsDeleted", instanceIsDeleted);
            this.instanceIsDeleted = instanceIsDeleted;
            return this;
        }

        /**
         * <p>The ID of the PolarDB for MySQL cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze3nrr64c5******</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The region in which the original cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder instanceRegion(String instanceRegion) {
            this.putQueryParameter("InstanceRegion", instanceRegion);
            this.instanceRegion = instanceRegion;
            return this;
        }

        /**
         * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the backup set resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * <p>The type of the backup scenario. Set the value to <strong>LEVEL_1</strong>, which indicates the level-1 backup of the region in which the PolarDB for MySQL cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>LEVEL_1</p>
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-17T17:00:16Z</p>
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
