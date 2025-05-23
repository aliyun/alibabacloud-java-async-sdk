// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDeploymentPackageFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeploymentPackageFilesResponseBody</p>
 */
public class ListDeploymentPackageFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeploymentPackageFilesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentPackageFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDeploymentPackageFilesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeploymentPackageFilesResponseBody build() {
            return new ListDeploymentPackageFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeploymentPackageFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeploymentPackageFilesResponseBody</p>
     */
    public static class DeploymentPackageFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private Integer changeType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CommitTime")
        private String commitTime;

        @com.aliyun.core.annotation.NameInMap("CommitUser")
        private String commitUser;

        @com.aliyun.core.annotation.NameInMap("CommitUserName")
        private String commitUserName;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("FileVersion")
        private Long fileVersion;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsSameAsProductionVersion")
        private Boolean isSameAsProductionVersion;

        @com.aliyun.core.annotation.NameInMap("NodeConfiguration")
        private String nodeConfiguration;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SmokeTestStatus")
        private String smokeTestStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private DeploymentPackageFiles(Builder builder) {
            this.changeType = builder.changeType;
            this.comment = builder.comment;
            this.commitTime = builder.commitTime;
            this.commitUser = builder.commitUser;
            this.commitUserName = builder.commitUserName;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.fileVersion = builder.fileVersion;
            this.id = builder.id;
            this.isSameAsProductionVersion = builder.isSameAsProductionVersion;
            this.nodeConfiguration = builder.nodeConfiguration;
            this.nodeId = builder.nodeId;
            this.projectId = builder.projectId;
            this.smokeTestStatus = builder.smokeTestStatus;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentPackageFiles create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public Integer getChangeType() {
            return this.changeType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return commitTime
         */
        public String getCommitTime() {
            return this.commitTime;
        }

        /**
         * @return commitUser
         */
        public String getCommitUser() {
            return this.commitUser;
        }

        /**
         * @return commitUserName
         */
        public String getCommitUserName() {
            return this.commitUserName;
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
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return fileVersion
         */
        public Long getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isSameAsProductionVersion
         */
        public Boolean getIsSameAsProductionVersion() {
            return this.isSameAsProductionVersion;
        }

        /**
         * @return nodeConfiguration
         */
        public String getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return smokeTestStatus
         */
        public String getSmokeTestStatus() {
            return this.smokeTestStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private Integer changeType; 
            private String comment; 
            private String commitTime; 
            private String commitUser; 
            private String commitUserName; 
            private Long fileId; 
            private String fileName; 
            private Integer fileType; 
            private Long fileVersion; 
            private Long id; 
            private Boolean isSameAsProductionVersion; 
            private String nodeConfiguration; 
            private Long nodeId; 
            private Long projectId; 
            private String smokeTestStatus; 
            private Integer status; 
            private Long tenantId; 
            private String useType; 

            private Builder() {
            } 

            private Builder(DeploymentPackageFiles model) {
                this.changeType = model.changeType;
                this.comment = model.comment;
                this.commitTime = model.commitTime;
                this.commitUser = model.commitUser;
                this.commitUserName = model.commitUserName;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.fileVersion = model.fileVersion;
                this.id = model.id;
                this.isSameAsProductionVersion = model.isSameAsProductionVersion;
                this.nodeConfiguration = model.nodeConfiguration;
                this.nodeId = model.nodeId;
                this.projectId = model.projectId;
                this.smokeTestStatus = model.smokeTestStatus;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.useType = model.useType;
            } 

            /**
             * ChangeType.
             */
            public Builder changeType(Integer changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CommitTime.
             */
            public Builder commitTime(String commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * CommitUser.
             */
            public Builder commitUser(String commitUser) {
                this.commitUser = commitUser;
                return this;
            }

            /**
             * CommitUserName.
             */
            public Builder commitUserName(String commitUserName) {
                this.commitUserName = commitUserName;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FileVersion.
             */
            public Builder fileVersion(Long fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsSameAsProductionVersion.
             */
            public Builder isSameAsProductionVersion(Boolean isSameAsProductionVersion) {
                this.isSameAsProductionVersion = isSameAsProductionVersion;
                return this;
            }

            /**
             * NodeConfiguration.
             */
            public Builder nodeConfiguration(String nodeConfiguration) {
                this.nodeConfiguration = nodeConfiguration;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SmokeTestStatus.
             */
            public Builder smokeTestStatus(String smokeTestStatus) {
                this.smokeTestStatus = smokeTestStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UseType.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public DeploymentPackageFiles build() {
                return new DeploymentPackageFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDeploymentPackageFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeploymentPackageFilesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentPackageFiles")
        private java.util.List<DeploymentPackageFiles> deploymentPackageFiles;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.deploymentPackageFiles = builder.deploymentPackageFiles;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return deploymentPackageFiles
         */
        public java.util.List<DeploymentPackageFiles> getDeploymentPackageFiles() {
            return this.deploymentPackageFiles;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DeploymentPackageFiles> deploymentPackageFiles; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.deploymentPackageFiles = model.deploymentPackageFiles;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * DeploymentPackageFiles.
             */
            public Builder deploymentPackageFiles(java.util.List<DeploymentPackageFiles> deploymentPackageFiles) {
                this.deploymentPackageFiles = deploymentPackageFiles;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
