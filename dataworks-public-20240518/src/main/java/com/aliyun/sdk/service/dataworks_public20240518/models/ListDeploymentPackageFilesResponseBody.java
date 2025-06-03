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
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
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
             * <p>The change type, which is an integer. Valid values:</p>
             * <ul>
             * <li>0: addition</li>
             * <li>1: update</li>
             * <li>2: deletion</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder changeType(Integer changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The comment for committing.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time for committing.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-10 15:55:47</p>
             */
            public Builder commitTime(String commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the user who committed the file.</p>
             * 
             * <strong>example:</strong>
             * <p>446***</p>
             */
            public Builder commitUser(String commitUser) {
                this.commitUser = commitUser;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account used by the user who committed the file.</p>
             * 
             * <strong>example:</strong>
             * <p>user***</p>
             */
            public Builder commitUserName(String commitUserName) {
                this.commitUserName = commitUserName;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>520246913</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>bak_part_basc_person_relation_all_da</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file type. The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The file version.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder fileVersion(Long fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * <p>The unique ID.</p>
             * 
             * <strong>example:</strong>
             * <p>650433503</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the version is a version in the production environment of the scheduling system.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSameAsProductionVersion(Boolean isSameAsProductionVersion) {
                this.isSameAsProductionVersion = isSameAsProductionVersion;
                return this;
            }

            /**
             * <p>The scheduling property configurations of the node that corresponds to the file, which is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;tagList&quot;: [],
             *     &quot;fileId&quot;: -1,
             *     &quot;taskRerunTime&quot;: 0,
             *     &quot;taskRerunInterval&quot;: 0,
             *     &quot;reRunAble&quot;: 1,
             *     &quot;nodeId&quot;: 125803000,
             *     &quot;nodeName&quot;: &quot;new&quot;,
             *     &quot;nodeType&quot;: 0,
             *     &quot;isStop&quot;: 0,
             *     &quot;paraValue&quot;: &quot;&quot;,
             *     &quot;startEffectDate&quot;: &quot;1970-01-01 00:00:00&quot;,
             *     &quot;endEffectDate&quot;: &quot;9999-01-01 00:00:00&quot;,
             *     &quot;cronExpress&quot;: &quot;00 26 00 * * ?&quot;,
             *     &quot;owner&quot;: &quot;1107550004250000&quot;,
             *     &quot;resgroupId&quot;: 6300000,
             *     &quot;cu&quot;: &quot;0.25&quot;,
             *     &quot;appId&quot;: 170000,
             *     &quot;tenantId&quot;: 524257424560000,
             *     &quot;createTime&quot;: &quot;2025-04-10 15:55:01&quot;,
             *     &quot;createUser&quot;: &quot;1107550004250000&quot;,
             *     &quot;lastModifyTime&quot;: &quot;2025-04-10 15:55:41&quot;,
             *     &quot;cycleType&quot;: 0,
             *     &quot;dependentType&quot;: 0,
             *     &quot;dependentTypeList&quot;: [0],
             *     &quot;lastModifyUser&quot;: &quot;1107550004250000&quot;,
             *     &quot;dependentDataNode&quot;: &quot;&quot;,
             *     &quot;input&quot;: &quot;[{&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;str&quot;:&quot;root_input&quot;,&quot;parseType&quot;:1}]&quot;,
             *     &quot;output&quot;: &quot;[{&quot;str&quot;:&quot;project_root.526586287_out&quot;,&quot;parseType&quot;:2},{&quot;str&quot;:&quot;project_root.new&quot;,&quot;parseType&quot;:1}]&quot;,
             *     &quot;inputList&quot;: [{
             *         &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
             *         &quot;str&quot;: &quot;root_input&quot;,
             *         &quot;parseType&quot;: 1
             *     }],
             *     &quot;outputList&quot;: [{
             *         &quot;str&quot;: &quot;project_root.526586287_out&quot;,
             *         &quot;parseType&quot;: 2
             *     }, {
             *         &quot;str&quot;: &quot;project_root.new&quot;,
             *         &quot;parseType&quot;: 1
             *     }],
             *     &quot;isAutoParse&quot;: 1,
             *     &quot;startRightNow&quot;: false,
             *     &quot;extConfig&quot;: &quot;{&quot;openCustomCron&quot;:false,&quot;formCron&quot;:&quot;&quot;}&quot;,
             *     &quot;inputContextList&quot;: [],
             *     &quot;outputContextList&quot;: []
             * }</p>
             */
            public Builder nodeConfiguration(String nodeConfiguration) {
                this.nodeConfiguration = nodeConfiguration;
                return this;
            }

            /**
             * <p>The ID of the auto triggered node that corresponds to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>700005008419</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>27595</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The test status in the development environment.</p>
             */
            public Builder smokeTestStatus(String smokeTestStatus) {
                this.smokeTestStatus = smokeTestStatus;
                return this;
            }

            /**
             * <p>The status of the code for the file of the current version. Valid values:</p>
             * <ul>
             * <li>10: committing</li>
             * <li>11: committed to the development environment of the scheduling system</li>
             * <li>20: review passed</li>
             * <li>21: review failed</li>
             * <li>80: deployment package creation succeeded</li>
             * <li>100: deploying</li>
             * <li>101: deployed to the production environment</li>
             * <li>200: cancelled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The DataWorks tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>639415964191360</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The module to which the file belongs. Valid values:</p>
             * <ul>
             * <li>NORMAL: The file is used for DataStudio.</li>
             * <li>MANUAL: The file is used for a manually triggered node.</li>
             * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
             * <li>SKIP: The file is used for a dry-run node in DataStudio.</li>
             * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
             * <li>COMPONENT: The file is used for a script template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
             * <p>The details of the versions of the files to be deployed.</p>
             */
            public Builder deploymentPackageFiles(java.util.List<DeploymentPackageFiles> deploymentPackageFiles) {
                this.deploymentPackageFiles = deploymentPackageFiles;
                return this;
            }

            /**
             * <p>The page number. Pages start from page 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
