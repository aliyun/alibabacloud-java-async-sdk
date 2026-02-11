// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeModelingProjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelingProjectDetailResponseBody</p>
 */
public class DescribeModelingProjectDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeModelingProjectDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelingProjectDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeModelingProjectDetailResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Call succeeded.</li>
         * <li><strong>false</strong>: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeModelingProjectDetailResponseBody build() {
            return new DescribeModelingProjectDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelingProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelingProjectDetailResponseBody</p>
     */
    public static class PocTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private PocTasks(Builder builder) {
            this.fileName = builder.fileName;
            this.serviceCode = builder.serviceCode;
            this.status = builder.status;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PocTasks create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String fileName; 
            private String serviceCode; 
            private String status; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(PocTasks model) {
                this.fileName = model.fileName;
                this.serviceCode = model.serviceCode;
                this.status = model.status;
                this.taskName = model.taskName;
            } 

            /**
             * <p>Retrospective file name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>Service code</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>File synchronization status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Retrospective task name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public PocTasks build() {
                return new PocTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelingProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelingProjectDetailResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Downloadable")
        private Boolean downloadable;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        private Files(Builder builder) {
            this.downloadable = builder.downloadable;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return downloadable
         */
        public Boolean getDownloadable() {
            return this.downloadable;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Boolean downloadable; 
            private Long fileId; 
            private String fileName; 
            private Boolean visible; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.downloadable = model.downloadable;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.visible = model.visible;
            } 

            /**
             * <p>Whether it is downloadable.</p>
             */
            public Builder downloadable(Boolean downloadable) {
                this.downloadable = downloadable;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>376920</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>融山-个贷-精催-演示-0625.json</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>Visibility:</p>
             * <p><strong>true</strong>: Visible</p>
             * <p><strong>false</strong>: Not visible</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelingProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelingProjectDetailResponseBody</p>
     */
    public static class SyncedFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Deployable")
        private Boolean deployable;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("SyncedTime")
        private String syncedTime;

        private SyncedFiles(Builder builder) {
            this.deployable = builder.deployable;
            this.files = builder.files;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.syncedTime = builder.syncedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncedFiles create() {
            return builder().build();
        }

        /**
         * @return deployable
         */
        public Boolean getDeployable() {
            return this.deployable;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return syncedTime
         */
        public String getSyncedTime() {
            return this.syncedTime;
        }

        public static final class Builder {
            private Boolean deployable; 
            private java.util.List<Files> files; 
            private Long groupId; 
            private String groupName; 
            private String syncedTime; 

            private Builder() {
            } 

            private Builder(SyncedFiles model) {
                this.deployable = model.deployable;
                this.files = model.files;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.syncedTime = model.syncedTime;
            } 

            /**
             * <p>Whether deployment is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deployable(Boolean deployable) {
                this.deployable = deployable;
                return this;
            }

            /**
             * <p>Files generated by modeling.</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>Application group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>56790766</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>File group name.</p>
             * 
             * <strong>example:</strong>
             * <p>am</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Synchronization time.</p>
             * 
             * <strong>example:</strong>
             * <p>1770607862000</p>
             */
            public Builder syncedTime(String syncedTime) {
                this.syncedTime = syncedTime;
                return this;
            }

            public SyncedFiles build() {
                return new SyncedFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelingProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelingProjectDetailResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EnvStatus")
        private String envStatus;

        @com.aliyun.core.annotation.NameInMap("LoginAccount")
        private String loginAccount;

        @com.aliyun.core.annotation.NameInMap("MachineSpec")
        private String machineSpec;

        @com.aliyun.core.annotation.NameInMap("ManualPhase")
        private String manualPhase;

        @com.aliyun.core.annotation.NameInMap("ModelingStatus")
        private String modelingStatus;

        @com.aliyun.core.annotation.NameInMap("PocTasks")
        private java.util.List<PocTasks> pocTasks;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("SyncedFiles")
        private java.util.List<SyncedFiles> syncedFiles;

        private ResultObject(Builder builder) {
            this.endTime = builder.endTime;
            this.envStatus = builder.envStatus;
            this.loginAccount = builder.loginAccount;
            this.machineSpec = builder.machineSpec;
            this.manualPhase = builder.manualPhase;
            this.modelingStatus = builder.modelingStatus;
            this.pocTasks = builder.pocTasks;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.remark = builder.remark;
            this.startTime = builder.startTime;
            this.syncedFiles = builder.syncedFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return envStatus
         */
        public String getEnvStatus() {
            return this.envStatus;
        }

        /**
         * @return loginAccount
         */
        public String getLoginAccount() {
            return this.loginAccount;
        }

        /**
         * @return machineSpec
         */
        public String getMachineSpec() {
            return this.machineSpec;
        }

        /**
         * @return manualPhase
         */
        public String getManualPhase() {
            return this.manualPhase;
        }

        /**
         * @return modelingStatus
         */
        public String getModelingStatus() {
            return this.modelingStatus;
        }

        /**
         * @return pocTasks
         */
        public java.util.List<PocTasks> getPocTasks() {
            return this.pocTasks;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return syncedFiles
         */
        public java.util.List<SyncedFiles> getSyncedFiles() {
            return this.syncedFiles;
        }

        public static final class Builder {
            private Long endTime; 
            private String envStatus; 
            private String loginAccount; 
            private String machineSpec; 
            private String manualPhase; 
            private String modelingStatus; 
            private java.util.List<PocTasks> pocTasks; 
            private String projectId; 
            private String projectName; 
            private String remark; 
            private Long startTime; 
            private java.util.List<SyncedFiles> syncedFiles; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.endTime = model.endTime;
                this.envStatus = model.envStatus;
                this.loginAccount = model.loginAccount;
                this.machineSpec = model.machineSpec;
                this.manualPhase = model.manualPhase;
                this.modelingStatus = model.modelingStatus;
                this.pocTasks = model.pocTasks;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.remark = model.remark;
                this.startTime = model.startTime;
                this.syncedFiles = model.syncedFiles;
            } 

            /**
             * <p>End time of the security modeling project.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-07T02:22:30Z</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Security environment status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder envStatus(String envStatus) {
                this.envStatus = envStatus;
                return this;
            }

            /**
             * <p>Login account.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder loginAccount(String loginAccount) {
                this.loginAccount = loginAccount;
                return this;
            }

            /**
             * <p>Machine specification.</p>
             * 
             * <strong>example:</strong>
             * <p>SECURE_ENV_LITE</p>
             */
            public Builder machineSpec(String machineSpec) {
                this.machineSpec = machineSpec;
                return this;
            }

            /**
             * <p>Manual operation phase.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder manualPhase(String manualPhase) {
                this.manualPhase = manualPhase;
                return this;
            }

            /**
             * <p>Modeling project status.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPARING</p>
             */
            public Builder modelingStatus(String modelingStatus) {
                this.modelingStatus = modelingStatus;
                return this;
            }

            /**
             * <p>Associated POC tasks.</p>
             */
            public Builder pocTasks(java.util.List<PocTasks> pocTasks) {
                this.pocTasks = pocTasks;
                return this;
            }

            /**
             * <p>Project ID</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Project name.</p>
             * 
             * <strong>example:</strong>
             * <p>project_01</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Remark information.</p>
             * 
             * <strong>example:</strong>
             * <p>remark</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Start time of the security modeling project.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-13T01:09:00Z</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Synchronized files.</p>
             */
            public Builder syncedFiles(java.util.List<SyncedFiles> syncedFiles) {
                this.syncedFiles = syncedFiles;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
