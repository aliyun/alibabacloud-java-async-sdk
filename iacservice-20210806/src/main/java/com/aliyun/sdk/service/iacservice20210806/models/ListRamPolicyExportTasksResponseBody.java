// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListRamPolicyExportTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRamPolicyExportTasksResponseBody</p>
 */
public class ListRamPolicyExportTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTasks")
    private java.util.List<RamPolicyExportTasks> ramPolicyExportTasks;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListRamPolicyExportTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ramPolicyExportTasks = builder.ramPolicyExportTasks;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRamPolicyExportTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ramPolicyExportTasks
     */
    public java.util.List<RamPolicyExportTasks> getRamPolicyExportTasks() {
        return this.ramPolicyExportTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<RamPolicyExportTasks> ramPolicyExportTasks; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRamPolicyExportTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.ramPolicyExportTasks = model.ramPolicyExportTasks;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ramPolicyExportTasks.
         */
        public Builder ramPolicyExportTasks(java.util.List<RamPolicyExportTasks> ramPolicyExportTasks) {
            this.ramPolicyExportTasks = ramPolicyExportTasks;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRamPolicyExportTasksResponseBody build() {
            return new ListRamPolicyExportTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRamPolicyExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListRamPolicyExportTasksResponseBody</p>
     */
    public static class RamPolicyExportTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentPolicyStatus")
        private String currentPolicyStatus;

        @com.aliyun.core.annotation.NameInMap("currentPolicyVersion")
        private String currentPolicyVersion;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("exportTime")
        private String exportTime;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
        private String ramPolicyExportTaskId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskOutputPath")
        private String taskOutputPath;

        private RamPolicyExportTasks(Builder builder) {
            this.createTime = builder.createTime;
            this.currentPolicyStatus = builder.currentPolicyStatus;
            this.currentPolicyVersion = builder.currentPolicyVersion;
            this.elapsedTime = builder.elapsedTime;
            this.exportTime = builder.exportTime;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
            this.status = builder.status;
            this.taskOutputPath = builder.taskOutputPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RamPolicyExportTasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentPolicyStatus
         */
        public String getCurrentPolicyStatus() {
            return this.currentPolicyStatus;
        }

        /**
         * @return currentPolicyVersion
         */
        public String getCurrentPolicyVersion() {
            return this.currentPolicyVersion;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return exportTime
         */
        public String getExportTime() {
            return this.exportTime;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ramPolicyExportTaskId
         */
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskOutputPath
         */
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public static final class Builder {
            private String createTime; 
            private String currentPolicyStatus; 
            private String currentPolicyVersion; 
            private Long elapsedTime; 
            private String exportTime; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private String ramPolicyExportTaskId; 
            private String status; 
            private String taskOutputPath; 

            private Builder() {
            } 

            private Builder(RamPolicyExportTasks model) {
                this.createTime = model.createTime;
                this.currentPolicyStatus = model.currentPolicyStatus;
                this.currentPolicyVersion = model.currentPolicyVersion;
                this.elapsedTime = model.elapsedTime;
                this.exportTime = model.exportTime;
                this.moduleId = model.moduleId;
                this.moduleVersion = model.moduleVersion;
                this.name = model.name;
                this.ramPolicyExportTaskId = model.ramPolicyExportTaskId;
                this.status = model.status;
                this.taskOutputPath = model.taskOutputPath;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * currentPolicyStatus.
             */
            public Builder currentPolicyStatus(String currentPolicyStatus) {
                this.currentPolicyStatus = currentPolicyStatus;
                return this;
            }

            /**
             * currentPolicyVersion.
             */
            public Builder currentPolicyVersion(String currentPolicyVersion) {
                this.currentPolicyVersion = currentPolicyVersion;
                return this;
            }

            /**
             * elapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * exportTime.
             */
            public Builder exportTime(String exportTime) {
                this.exportTime = exportTime;
                return this;
            }

            /**
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ramPolicyExportTaskId.
             */
            public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
                this.ramPolicyExportTaskId = ramPolicyExportTaskId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskOutputPath.
             */
            public Builder taskOutputPath(String taskOutputPath) {
                this.taskOutputPath = taskOutputPath;
                return this;
            }

            public RamPolicyExportTasks build() {
                return new RamPolicyExportTasks(this);
            } 

        } 

    }
}
