// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
    private java.util.List < String > statusList;

    private DescribeBackupFilesRequest(Builder builder) {
        super(builder);
        this.androidInstanceId = builder.androidInstanceId;
        this.androidInstanceName = builder.androidInstanceName;
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
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<DescribeBackupFilesRequest, Builder> {
        private String androidInstanceId; 
        private String androidInstanceName; 
        private String backupFileId; 
        private String backupFileName; 
        private String description; 
        private String endTime; 
        private String endUserId; 
        private String instanceGroupId; 
        private Long maxResults; 
        private String nextToken; 
        private String startTime; 
        private java.util.List < String > statusList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupFilesRequest request) {
            super(request);
            this.androidInstanceId = request.androidInstanceId;
            this.androidInstanceName = request.androidInstanceName;
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
         * AndroidInstanceId.
         */
        public Builder androidInstanceId(String androidInstanceId) {
            this.putQueryParameter("AndroidInstanceId", androidInstanceId);
            this.androidInstanceId = androidInstanceId;
            return this;
        }

        /**
         * AndroidInstanceName.
         */
        public Builder androidInstanceName(String androidInstanceName) {
            this.putQueryParameter("AndroidInstanceName", androidInstanceName);
            this.androidInstanceName = androidInstanceName;
            return this;
        }

        /**
         * BackupFileId.
         */
        public Builder backupFileId(String backupFileId) {
            this.putQueryParameter("BackupFileId", backupFileId);
            this.backupFileId = backupFileId;
            return this;
        }

        /**
         * BackupFileName.
         */
        public Builder backupFileName(String backupFileName) {
            this.putQueryParameter("BackupFileName", backupFileName);
            this.backupFileName = backupFileName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * InstanceGroupId.
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
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
