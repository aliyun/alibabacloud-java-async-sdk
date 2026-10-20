// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link CacheLoadTaskInfo} extends {@link TeaModel}
 *
 * <p>CacheLoadTaskInfo</p>
 */
public class CacheLoadTaskInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("completedFiles")
    private Long completedFiles;

    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("enumeratedFiles")
    private Long enumeratedFiles;

    @com.aliyun.core.annotation.NameInMap("enumerationDone")
    private Boolean enumerationDone;

    @com.aliyun.core.annotation.NameInMap("extraOptions")
    private java.util.Map<String, String> extraOptions;

    @com.aliyun.core.annotation.NameInMap("failedFiles")
    private Long failedFiles;

    @com.aliyun.core.annotation.NameInMap("lastError")
    private String lastError;

    @com.aliyun.core.annotation.NameInMap("loadedBytes")
    private Long loadedBytes;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private Long startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("taskUpdatedAt")
    private Long taskUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("totalBytes")
    private Long totalBytes;

    @com.aliyun.core.annotation.NameInMap("totalFiles")
    private Long totalFiles;

    private CacheLoadTaskInfo(Builder builder) {
        this.catalogId = builder.catalogId;
        this.completedFiles = builder.completedFiles;
        this.database = builder.database;
        this.enumeratedFiles = builder.enumeratedFiles;
        this.enumerationDone = builder.enumerationDone;
        this.extraOptions = builder.extraOptions;
        this.failedFiles = builder.failedFiles;
        this.lastError = builder.lastError;
        this.loadedBytes = builder.loadedBytes;
        this.path = builder.path;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.table = builder.table;
        this.taskId = builder.taskId;
        this.taskUpdatedAt = builder.taskUpdatedAt;
        this.totalBytes = builder.totalBytes;
        this.totalFiles = builder.totalFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CacheLoadTaskInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return completedFiles
     */
    public Long getCompletedFiles() {
        return this.completedFiles;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return enumeratedFiles
     */
    public Long getEnumeratedFiles() {
        return this.enumeratedFiles;
    }

    /**
     * @return enumerationDone
     */
    public Boolean getEnumerationDone() {
        return this.enumerationDone;
    }

    /**
     * @return extraOptions
     */
    public java.util.Map<String, String> getExtraOptions() {
        return this.extraOptions;
    }

    /**
     * @return failedFiles
     */
    public Long getFailedFiles() {
        return this.failedFiles;
    }

    /**
     * @return lastError
     */
    public String getLastError() {
        return this.lastError;
    }

    /**
     * @return loadedBytes
     */
    public Long getLoadedBytes() {
        return this.loadedBytes;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return startedAt
     */
    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskUpdatedAt
     */
    public Long getTaskUpdatedAt() {
        return this.taskUpdatedAt;
    }

    /**
     * @return totalBytes
     */
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    /**
     * @return totalFiles
     */
    public Long getTotalFiles() {
        return this.totalFiles;
    }

    public static final class Builder {
        private String catalogId; 
        private Long completedFiles; 
        private String database; 
        private Long enumeratedFiles; 
        private Boolean enumerationDone; 
        private java.util.Map<String, String> extraOptions; 
        private Long failedFiles; 
        private String lastError; 
        private Long loadedBytes; 
        private String path; 
        private Long startedAt; 
        private String status; 
        private String table; 
        private String taskId; 
        private Long taskUpdatedAt; 
        private Long totalBytes; 
        private Long totalFiles; 

        private Builder() {
        } 

        private Builder(CacheLoadTaskInfo model) {
            this.catalogId = model.catalogId;
            this.completedFiles = model.completedFiles;
            this.database = model.database;
            this.enumeratedFiles = model.enumeratedFiles;
            this.enumerationDone = model.enumerationDone;
            this.extraOptions = model.extraOptions;
            this.failedFiles = model.failedFiles;
            this.lastError = model.lastError;
            this.loadedBytes = model.loadedBytes;
            this.path = model.path;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.table = model.table;
            this.taskId = model.taskId;
            this.taskUpdatedAt = model.taskUpdatedAt;
            this.totalBytes = model.totalBytes;
            this.totalFiles = model.totalFiles;
        } 

        /**
         * <p>The data catalog ID.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxxx</p>
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * <p>The number of files with completed cache loading.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder completedFiles(Long completedFiles) {
            this.completedFiles = completedFiles;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>database_name</p>
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * <p>The number of enumerated files.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder enumeratedFiles(Long enumeratedFiles) {
            this.enumeratedFiles = enumeratedFiles;
            return this;
        }

        /**
         * <p>The file enumeration completion status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enumerationDone(Boolean enumerationDone) {
            this.enumerationDone = enumerationDone;
            return this;
        }

        /**
         * <p>The additional parameters.</p>
         */
        public Builder extraOptions(java.util.Map<String, String> extraOptions) {
            this.extraOptions = extraOptions;
            return this;
        }

        /**
         * <p>The number of files with failed cache loading.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedFiles(Long failedFiles) {
            this.failedFiles = failedFiles;
            return this;
        }

        /**
         * <p>The most recent error message, which is empty when the status is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder lastError(String lastError) {
            this.lastError = lastError;
            return this;
        }

        /**
         * <p>The number of bytes loaded into the cache.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder loadedBytes(Long loadedBytes) {
            this.loadedBytes = loadedBytes;
            return this;
        }

        /**
         * <p>The storage location.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://clg-xxxx/db-xxxx/tbl-xxxx</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The start time of the task execution, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790576716926</p>
         */
        public Builder startedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>The task execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder table(String table) {
            this.table = table;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-81afc0f7812ec737-1790576716926</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task update time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790576746926</p>
         */
        public Builder taskUpdatedAt(Long taskUpdatedAt) {
            this.taskUpdatedAt = taskUpdatedAt;
            return this;
        }

        /**
         * <p>The total number of bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder totalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalFiles(Long totalFiles) {
            this.totalFiles = totalFiles;
            return this;
        }

        public CacheLoadTaskInfo build() {
            return new CacheLoadTaskInfo(this);
        } 

    } 

}
