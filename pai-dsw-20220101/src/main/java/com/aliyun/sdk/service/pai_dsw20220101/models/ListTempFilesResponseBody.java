// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ListTempFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTempFilesResponseBody</p>
 */
public class ListTempFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TempFiles")
    private java.util.List<TempFiles> tempFiles;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTempFilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tempFiles = builder.tempFiles;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTempFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tempFiles
     */
    public java.util.List<TempFiles> getTempFiles() {
        return this.tempFiles;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Quota quota; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TempFiles> tempFiles; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTempFilesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.quota = model.quota;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tempFiles = model.tempFiles;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TempFiles.
         */
        public Builder tempFiles(java.util.List<TempFiles> tempFiles) {
            this.tempFiles = tempFiles;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTempFilesResponseBody build() {
            return new ListTempFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTempFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTempFilesResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Long totalCapacity;

        @com.aliyun.core.annotation.NameInMap("TotalFileNum")
        private Long totalFileNum;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedFileNum")
        private Long usedFileNum;

        private Quota(Builder builder) {
            this.totalCapacity = builder.totalCapacity;
            this.totalFileNum = builder.totalFileNum;
            this.usedCapacity = builder.usedCapacity;
            this.usedFileNum = builder.usedFileNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return totalCapacity
         */
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return totalFileNum
         */
        public Long getTotalFileNum() {
            return this.totalFileNum;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedFileNum
         */
        public Long getUsedFileNum() {
            return this.usedFileNum;
        }

        public static final class Builder {
            private Long totalCapacity; 
            private Long totalFileNum; 
            private Long usedCapacity; 
            private Long usedFileNum; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.totalCapacity = model.totalCapacity;
                this.totalFileNum = model.totalFileNum;
                this.usedCapacity = model.usedCapacity;
                this.usedFileNum = model.usedFileNum;
            } 

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * TotalFileNum.
             */
            public Builder totalFileNum(Long totalFileNum) {
                this.totalFileNum = totalFileNum;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * UsedFileNum.
             */
            public Builder usedFileNum(Long usedFileNum) {
                this.usedFileNum = usedFileNum;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTempFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTempFilesResponseBody</p>
     */
    public static class TempFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
        private String gmtExpiredTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UploadUrl")
        private String uploadUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private TempFiles(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.description = builder.description;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtExpiredTime = builder.gmtExpiredTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.prefix = builder.prefix;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
            this.uploadUrl = builder.uploadUrl;
            this.userId = builder.userId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TempFiles create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtExpiredTime
         */
        public String getGmtExpiredTime() {
            return this.gmtExpiredTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Long capacity; 
            private String description; 
            private String downloadUrl; 
            private String gmtCreateTime; 
            private String gmtExpiredTime; 
            private String gmtModifiedTime; 
            private String instanceId; 
            private String name; 
            private String ownerId; 
            private String prefix; 
            private String status; 
            private String taskId; 
            private String type; 
            private String uploadUrl; 
            private String userId; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(TempFiles model) {
                this.bandwidth = model.bandwidth;
                this.capacity = model.capacity;
                this.description = model.description;
                this.downloadUrl = model.downloadUrl;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtExpiredTime = model.gmtExpiredTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.prefix = model.prefix;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
                this.uploadUrl = model.uploadUrl;
                this.userId = model.userId;
                this.uuid = model.uuid;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtExpiredTime.
             */
            public Builder gmtExpiredTime(String gmtExpiredTime) {
                this.gmtExpiredTime = gmtExpiredTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Owner Id</p>
             * 
             * <strong>example:</strong>
             * <p>1612285282502324</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UploadUrl.
             */
            public Builder uploadUrl(String uploadUrl) {
                this.uploadUrl = uploadUrl;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public TempFiles build() {
                return new TempFiles(this);
            } 

        } 

    }
}
