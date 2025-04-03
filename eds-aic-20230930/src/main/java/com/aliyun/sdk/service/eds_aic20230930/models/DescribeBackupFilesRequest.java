// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeBackupFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupFilesRequest</p>
 */
public class DescribeBackupFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
    private String androidInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceName")
    private String androidInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupAll")
    private Boolean backupAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFileId")
    private String backupFileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFileName")
    private String backupFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    private DescribeBackupFilesRequest(Builder builder) {
        super(builder);
        this.androidInstanceId = builder.androidInstanceId;
        this.androidInstanceName = builder.androidInstanceName;
        this.backupAll = builder.backupAll;
        this.backupFileId = builder.backupFileId;
        this.backupFileName = builder.backupFileName;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.instanceGroupId = builder.instanceGroupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceId
     */
    public String getAndroidInstanceId() {
        return this.androidInstanceId;
    }

    /**
     * @return androidInstanceName
     */
    public String getAndroidInstanceName() {
        return this.androidInstanceName;
    }

    /**
     * @return backupAll
     */
    public Boolean getBackupAll() {
        return this.backupAll;
    }

    /**
     * @return backupFileId
     */
    public String getBackupFileId() {
        return this.backupFileId;
    }

    /**
     * @return backupFileName
     */
    public String getBackupFileName() {
        return this.backupFileName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<DescribeBackupFilesRequest, Builder> {
        private String androidInstanceId; 
        private String androidInstanceName; 
        private Boolean backupAll; 
        private String backupFileId; 
        private String backupFileName; 
        private String description; 
        private String endTime; 
        private String endUserId; 
        private String instanceGroupId; 
        private Long maxResults; 
        private String nextToken; 
        private String startTime; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupFilesRequest request) {
            super(request);
            this.androidInstanceId = request.androidInstanceId;
            this.androidInstanceName = request.androidInstanceName;
            this.backupAll = request.backupAll;
            this.backupFileId = request.backupFileId;
            this.backupFileName = request.backupFileName;
            this.description = request.description;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.instanceGroupId = request.instanceGroupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
            this.statusList = request.statusList;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        public Builder androidInstanceId(String androidInstanceId) {
            this.putQueryParameter("AndroidInstanceId", androidInstanceId);
            this.androidInstanceId = androidInstanceId;
            return this;
        }

        /**
         * <p>The name of the instance. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        public Builder androidInstanceName(String androidInstanceName) {
            this.putQueryParameter("AndroidInstanceName", androidInstanceName);
            this.androidInstanceName = androidInstanceName;
            return this;
        }

        /**
         * <p>Specifies whether the whole instance is backed up.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder backupAll(Boolean backupAll) {
            this.putQueryParameter("BackupAll", backupAll);
            this.backupAll = backupAll;
            return this;
        }

        /**
         * <p>The ID of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>bf-dxrh5jrv0zpb8****</p>
         */
        public Builder backupFileId(String backupFileId) {
            this.putQueryParameter("BackupFileId", backupFileId);
            this.backupFileId = backupFileId;
            return this;
        }

        /**
         * <p>The name of the backup file. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>defaulBackupFile</p>
         */
        public Builder backupFileName(String backupFileName) {
            this.putQueryParameter("BackupFileName", backupFileName);
            this.backupFileName = backupFileName;
            return this;
        }

        /**
         * <p>The description of the backup file. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>default description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The end of the period for querying generated backup files.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-20 10:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The owner of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-fxdx91jsfyiy3****</p>
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The beginning of the period for querying generated backup files.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-23 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the backup files.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public DescribeBackupFilesRequest build() {
            return new DescribeBackupFilesRequest(this);
        } 

    } 

}
