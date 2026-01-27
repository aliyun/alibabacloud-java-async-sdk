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
 * {@link DescribeDownloadBackupSetStorageInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadBackupSetStorageInfoRequest</p>
 */
public class DescribeDownloadBackupSetStorageInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeDownloadBackupSetStorageInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupSetId = builder.backupSetId;
        this.clusterName = builder.clusterName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
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
        private String regionId; 
        private String backupSetId; 
        private String clusterName; 
        private String duration; 
        private String instanceName; 
        private String regionCode; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadBackupSetStorageInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupSetId = request.backupSetId;
            this.clusterName = request.clusterName;
            this.duration = request.duration;
            this.instanceName = request.instanceName;
            this.regionCode = request.regionCode;
            this.taskId = request.taskId;
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
         * <p>30****</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The validity period of the URL that is used as the download destination. Take note of the following items:</p>
         * <ul>
         * <li>Default value: 7200. This means that the URL is valid for 2 hours by default.</li>
         * <li>Valid values: 300 to 86400. Unit: seconds. This means that you can specify a validity period in the range of 5 minutes to 1 day.</li>
         * <li>Before you specify this parameter, convert the validity period to seconds. For example, if you want to set the validity period of the URL to 5 minutes, enter 300.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>The <strong>BackupSetId</strong> parameter is required if you specify the <strong>InstanceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6qqf569n435****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * <p>This parameter is required.</p>
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
         * <p>The download task ID.</p>
         * <ul>
         * <li>The <strong>BackupSetId</strong> and <strong>InstanceName</strong> parameters are required if you do not specify the <strong>TaskId</strong> parameter.</li>
         * <li>To view the download task ID, go to the instance details page in the console and click <strong>Backup and Restoration</strong> in the left-side navigation pane. On the <strong>Backup Download</strong> tab, view the task ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dt-s0ugzak9****</p>
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
