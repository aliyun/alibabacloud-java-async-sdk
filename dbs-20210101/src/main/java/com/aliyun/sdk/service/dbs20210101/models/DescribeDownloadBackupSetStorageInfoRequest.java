// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadBackupSetStorageInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadBackupSetStorageInfoRequest</p>
 */
public class DescribeDownloadBackupSetStorageInfoRequest extends Request {
    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("Duration")
    @Validation(required = true)
    private String duration;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("RegionCode")
    @Validation(required = true)
    private String regionCode;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DescribeDownloadBackupSetStorageInfoRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.duration = builder.duration;
        this.instanceName = builder.instanceName;
        this.regionCode = builder.regionCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadBackupSetStorageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeDownloadBackupSetStorageInfoRequest, Builder> {
        private String backupSetId; 
        private String duration; 
        private String instanceName; 
        private String regionCode; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadBackupSetStorageInfoRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.duration = request.duration;
            this.instanceName = request.instanceName;
            this.regionCode = request.regionCode;
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the backup set.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * Set this parameter if the Download Destination parameter is set to URL.
         * <p>
         * 
         * *   By default, a URL is valid for 2 hours, which is equal to 7,200 seconds.
         * *   The valid duration is 5 minutes (300 seconds) to 1 day (86,400 seconds).
         * *   Before you set this parameter, convert the time to seconds. For example, if you want to set the validity period of the link to 5 minutes, enter 300.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  The **BackupSetId** parameter is required if you specify the **InstanceName** parameter.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * The ID of the download task.
         * <p>
         * 
         * *   The **BackupSetId** and **InstanceName** parameters are required if you do not specify the **TaskId** parameter.
         * *   You can find the instance and click **Backup and Restoration**. On the **Backup Download** tab, view the **task ID**.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeDownloadBackupSetStorageInfoRequest build() {
            return new DescribeDownloadBackupSetStorageInfoRequest(this);
        } 

    } 

}
