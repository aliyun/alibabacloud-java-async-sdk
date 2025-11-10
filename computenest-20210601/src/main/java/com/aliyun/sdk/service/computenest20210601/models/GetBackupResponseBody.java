// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetBackupResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupResponseBody</p>
 */
public class GetBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusDetail")
    private String statusDetail;

    private GetBackupResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.statusDetail = builder.statusDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
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
     * @return statusDetail
     */
    public String getStatusDetail() {
        return this.statusDetail;
    }

    public static final class Builder {
        private String backupId; 
        private String createTime; 
        private String description; 
        private String endTime; 
        private String modifiedTime; 
        private String requestId; 
        private String serviceInstanceId; 
        private String startTime; 
        private String status; 
        private String statusDetail; 

        private Builder() {
        } 

        private Builder(GetBackupResponseBody model) {
            this.backupId = model.backupId;
            this.createTime = model.createTime;
            this.description = model.description;
            this.endTime = model.endTime;
            this.modifiedTime = model.modifiedTime;
            this.requestId = model.requestId;
            this.serviceInstanceId = model.serviceInstanceId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.statusDetail = model.statusDetail;
        } 

        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-cad4a85ff5e340388b93</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The creation time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The end time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The update time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-10T19:26:20Z</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-b58c874912fc4294****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The start time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T11:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the backup task.</p>
         * <ul>
         * <li>Creating</li>
         * <li>Created</li>
         * <li>CreateFailed</li>
         * <li>Deleting</li>
         * <li>Deleted</li>
         * <li>DeleteFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The description of the deployment instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Disk i-xxxx backup failed, error message: error</p>
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        public GetBackupResponseBody build() {
            return new GetBackupResponseBody(this);
        } 

    } 

}
