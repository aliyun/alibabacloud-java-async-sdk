// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DownloadJobResult} extends {@link TeaModel}
 *
 * <p>DownloadJobResult</p>
 */
public class DownloadJobResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("DownloadJobId")
    private String downloadJobId;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("LogCount")
    private Integer logCount;

    @com.aliyun.core.annotation.NameInMap("PodIds")
    private java.util.List<String> podIds;

    @com.aliyun.core.annotation.NameInMap("PodUids")
    private java.util.List<String> podUids;

    @com.aliyun.core.annotation.NameInMap("SourceJobId")
    private String sourceJobId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UrlExpireTime")
    private String urlExpireTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DownloadJobResult(Builder builder) {
        this.displayName = builder.displayName;
        this.downloadJobId = builder.downloadJobId;
        this.downloadUrl = builder.downloadUrl;
        this.endTime = builder.endTime;
        this.fileType = builder.fileType;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.logCount = builder.logCount;
        this.podIds = builder.podIds;
        this.podUids = builder.podUids;
        this.sourceJobId = builder.sourceJobId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.urlExpireTime = builder.urlExpireTime;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadJobResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return downloadJobId
     */
    public String getDownloadJobId() {
        return this.downloadJobId;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return logCount
     */
    public Integer getLogCount() {
        return this.logCount;
    }

    /**
     * @return podIds
     */
    public java.util.List<String> getPodIds() {
        return this.podIds;
    }

    /**
     * @return podUids
     */
    public java.util.List<String> getPodUids() {
        return this.podUids;
    }

    /**
     * @return sourceJobId
     */
    public String getSourceJobId() {
        return this.sourceJobId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return urlExpireTime
     */
    public String getUrlExpireTime() {
        return this.urlExpireTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String displayName; 
        private String downloadJobId; 
        private String downloadUrl; 
        private String endTime; 
        private String fileType; 
        private String gmtCreated; 
        private String gmtModified; 
        private Integer logCount; 
        private java.util.List<String> podIds; 
        private java.util.List<String> podUids; 
        private String sourceJobId; 
        private String startTime; 
        private String status; 
        private String tenantId; 
        private String type; 
        private String urlExpireTime; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DownloadJobResult model) {
            this.displayName = model.displayName;
            this.downloadJobId = model.downloadJobId;
            this.downloadUrl = model.downloadUrl;
            this.endTime = model.endTime;
            this.fileType = model.fileType;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.logCount = model.logCount;
            this.podIds = model.podIds;
            this.podUids = model.podUids;
            this.sourceJobId = model.sourceJobId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.tenantId = model.tenantId;
            this.type = model.type;
            this.urlExpireTime = model.urlExpireTime;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The display name of the download job.</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The ID of the download job.</p>
         */
        public Builder downloadJobId(String downloadJobId) {
            this.downloadJobId = downloadJobId;
            return this;
        }

        /**
         * <p>A temporary, pre-signed URL for downloading the result file.</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The completion time of the download job, in UTC format.</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of file to download, such as <code>logs</code> or <code>output</code>.</p>
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The creation time of the download job, in UTC format.</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The last modification time of the download job, in UTC format.</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The number of log entries included in the download.</p>
         */
        public Builder logCount(Integer logCount) {
            this.logCount = logCount;
            return this;
        }

        /**
         * <p>The IDs of the pods for the source job.</p>
         */
        public Builder podIds(java.util.List<String> podIds) {
            this.podIds = podIds;
            return this;
        }

        /**
         * <p>The UIDs of the pods for the source job.</p>
         */
        public Builder podUids(java.util.List<String> podUids) {
            this.podUids = podUids;
            return this;
        }

        /**
         * <p>The ID of the source job whose results are downloaded.</p>
         */
        public Builder sourceJobId(String sourceJobId) {
            this.sourceJobId = sourceJobId;
            return this;
        }

        /**
         * <p>The start time of the download job, in UTC format.</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the download job. Valid values: <code>Running</code>, <code>Succeeded</code>, and <code>Failed</code>.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the tenant that the job belongs to.</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The type of the download job.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The time when the download URL expires, in UTC format.</p>
         */
        public Builder urlExpireTime(String urlExpireTime) {
            this.urlExpireTime = urlExpireTime;
            return this;
        }

        /**
         * <p>The ID of the user who created the job.</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the workspace where the job was created.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DownloadJobResult build() {
            return new DownloadJobResult(this);
        } 

    } 

}
