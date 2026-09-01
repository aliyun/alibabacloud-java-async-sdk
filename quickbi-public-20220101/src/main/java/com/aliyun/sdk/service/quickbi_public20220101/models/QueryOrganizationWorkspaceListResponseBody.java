// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryOrganizationWorkspaceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrganizationWorkspaceListResponseBody</p>
 */
public class QueryOrganizationWorkspaceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryOrganizationWorkspaceListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrganizationWorkspaceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryOrganizationWorkspaceListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the paginated result of the workspace list, with detailed information about the workspaces stored in the Data parameter.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: Request succeeded</li>
         * <li>false: Request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryOrganizationWorkspaceListResponseBody build() {
            return new QueryOrganizationWorkspaceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrganizationWorkspaceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrganizationWorkspaceListResponseBody</p>
     */
    public static class WorkspaceExportConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowExcelImageFile")
        private Boolean allowExcelImageFile;

        @com.aliyun.core.annotation.NameInMap("DataExport")
        private Boolean dataExport;

        @com.aliyun.core.annotation.NameInMap("DefaultExportType")
        private Boolean defaultExportType;

        @com.aliyun.core.annotation.NameInMap("ExportMainSwitch")
        private Boolean exportMainSwitch;

        @com.aliyun.core.annotation.NameInMap("ExportToLocal")
        private Boolean exportToLocal;

        @com.aliyun.core.annotation.NameInMap("ExportToPublicWork")
        private Boolean exportToPublicWork;

        @com.aliyun.core.annotation.NameInMap("ExportToServer")
        private Boolean exportToServer;

        @com.aliyun.core.annotation.NameInMap("ImageExport")
        private Boolean imageExport;

        @com.aliyun.core.annotation.NameInMap("PdfExport")
        private Boolean pdfExport;

        private WorkspaceExportConfig(Builder builder) {
            this.allowExcelImageFile = builder.allowExcelImageFile;
            this.dataExport = builder.dataExport;
            this.defaultExportType = builder.defaultExportType;
            this.exportMainSwitch = builder.exportMainSwitch;
            this.exportToLocal = builder.exportToLocal;
            this.exportToPublicWork = builder.exportToPublicWork;
            this.exportToServer = builder.exportToServer;
            this.imageExport = builder.imageExport;
            this.pdfExport = builder.pdfExport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkspaceExportConfig create() {
            return builder().build();
        }

        /**
         * @return allowExcelImageFile
         */
        public Boolean getAllowExcelImageFile() {
            return this.allowExcelImageFile;
        }

        /**
         * @return dataExport
         */
        public Boolean getDataExport() {
            return this.dataExport;
        }

        /**
         * @return defaultExportType
         */
        public Boolean getDefaultExportType() {
            return this.defaultExportType;
        }

        /**
         * @return exportMainSwitch
         */
        public Boolean getExportMainSwitch() {
            return this.exportMainSwitch;
        }

        /**
         * @return exportToLocal
         */
        public Boolean getExportToLocal() {
            return this.exportToLocal;
        }

        /**
         * @return exportToPublicWork
         */
        public Boolean getExportToPublicWork() {
            return this.exportToPublicWork;
        }

        /**
         * @return exportToServer
         */
        public Boolean getExportToServer() {
            return this.exportToServer;
        }

        /**
         * @return imageExport
         */
        public Boolean getImageExport() {
            return this.imageExport;
        }

        /**
         * @return pdfExport
         */
        public Boolean getPdfExport() {
            return this.pdfExport;
        }

        public static final class Builder {
            private Boolean allowExcelImageFile; 
            private Boolean dataExport; 
            private Boolean defaultExportType; 
            private Boolean exportMainSwitch; 
            private Boolean exportToLocal; 
            private Boolean exportToPublicWork; 
            private Boolean exportToServer; 
            private Boolean imageExport; 
            private Boolean pdfExport; 

            private Builder() {
            } 

            private Builder(WorkspaceExportConfig model) {
                this.allowExcelImageFile = model.allowExcelImageFile;
                this.dataExport = model.dataExport;
                this.defaultExportType = model.defaultExportType;
                this.exportMainSwitch = model.exportMainSwitch;
                this.exportToLocal = model.exportToLocal;
                this.exportToPublicWork = model.exportToPublicWork;
                this.exportToServer = model.exportToServer;
                this.imageExport = model.imageExport;
                this.pdfExport = model.pdfExport;
            } 

            /**
             * AllowExcelImageFile.
             */
            public Builder allowExcelImageFile(Boolean allowExcelImageFile) {
                this.allowExcelImageFile = allowExcelImageFile;
                return this;
            }

            /**
             * DataExport.
             */
            public Builder dataExport(Boolean dataExport) {
                this.dataExport = dataExport;
                return this;
            }

            /**
             * DefaultExportType.
             */
            public Builder defaultExportType(Boolean defaultExportType) {
                this.defaultExportType = defaultExportType;
                return this;
            }

            /**
             * ExportMainSwitch.
             */
            public Builder exportMainSwitch(Boolean exportMainSwitch) {
                this.exportMainSwitch = exportMainSwitch;
                return this;
            }

            /**
             * ExportToLocal.
             */
            public Builder exportToLocal(Boolean exportToLocal) {
                this.exportToLocal = exportToLocal;
                return this;
            }

            /**
             * ExportToPublicWork.
             */
            public Builder exportToPublicWork(Boolean exportToPublicWork) {
                this.exportToPublicWork = exportToPublicWork;
                return this;
            }

            /**
             * ExportToServer.
             */
            public Builder exportToServer(Boolean exportToServer) {
                this.exportToServer = exportToServer;
                return this;
            }

            /**
             * ImageExport.
             */
            public Builder imageExport(Boolean imageExport) {
                this.imageExport = imageExport;
                return this;
            }

            /**
             * PdfExport.
             */
            public Builder pdfExport(Boolean pdfExport) {
                this.pdfExport = pdfExport;
                return this;
            }

            public WorkspaceExportConfig build() {
                return new WorkspaceExportConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrganizationWorkspaceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrganizationWorkspaceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowPublishOperation")
        private Boolean allowPublishOperation;

        @com.aliyun.core.annotation.NameInMap("AllowShareOperation")
        private Boolean allowShareOperation;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CreateUserAccountName")
        private String createUserAccountName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("ModifyUserAccountName")
        private String modifyUserAccountName;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountName")
        private String ownerAccountName;

        @com.aliyun.core.annotation.NameInMap("RealOwnerAccountName")
        private String realOwnerAccountName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceDescription")
        private String workspaceDescription;

        @com.aliyun.core.annotation.NameInMap("WorkspaceExportConfig")
        private WorkspaceExportConfig workspaceExportConfig;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.allowPublishOperation = builder.allowPublishOperation;
            this.allowShareOperation = builder.allowShareOperation;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.createUserAccountName = builder.createUserAccountName;
            this.modifiedTime = builder.modifiedTime;
            this.modifyUser = builder.modifyUser;
            this.modifyUserAccountName = builder.modifyUserAccountName;
            this.organizationId = builder.organizationId;
            this.owner = builder.owner;
            this.ownerAccountName = builder.ownerAccountName;
            this.realOwnerAccountName = builder.realOwnerAccountName;
            this.workspaceDescription = builder.workspaceDescription;
            this.workspaceExportConfig = builder.workspaceExportConfig;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowPublishOperation
         */
        public Boolean getAllowPublishOperation() {
            return this.allowPublishOperation;
        }

        /**
         * @return allowShareOperation
         */
        public Boolean getAllowShareOperation() {
            return this.allowShareOperation;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return createUserAccountName
         */
        public String getCreateUserAccountName() {
            return this.createUserAccountName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return modifyUserAccountName
         */
        public String getModifyUserAccountName() {
            return this.modifyUserAccountName;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerAccountName
         */
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        /**
         * @return realOwnerAccountName
         */
        public String getRealOwnerAccountName() {
            return this.realOwnerAccountName;
        }

        /**
         * @return workspaceDescription
         */
        public String getWorkspaceDescription() {
            return this.workspaceDescription;
        }

        /**
         * @return workspaceExportConfig
         */
        public WorkspaceExportConfig getWorkspaceExportConfig() {
            return this.workspaceExportConfig;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Boolean allowPublishOperation; 
            private Boolean allowShareOperation; 
            private String createTime; 
            private String createUser; 
            private String createUserAccountName; 
            private String modifiedTime; 
            private String modifyUser; 
            private String modifyUserAccountName; 
            private String organizationId; 
            private String owner; 
            private String ownerAccountName; 
            private String realOwnerAccountName; 
            private String workspaceDescription; 
            private WorkspaceExportConfig workspaceExportConfig; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allowPublishOperation = model.allowPublishOperation;
                this.allowShareOperation = model.allowShareOperation;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.createUserAccountName = model.createUserAccountName;
                this.modifiedTime = model.modifiedTime;
                this.modifyUser = model.modifyUser;
                this.modifyUserAccountName = model.modifyUserAccountName;
                this.organizationId = model.organizationId;
                this.owner = model.owner;
                this.ownerAccountName = model.ownerAccountName;
                this.realOwnerAccountName = model.realOwnerAccountName;
                this.workspaceDescription = model.workspaceDescription;
                this.workspaceExportConfig = model.workspaceExportConfig;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>Whether the work can be made public. Value range:</p>
             * <ul>
             * <li>true: Public</li>
             * <li>false: Not public</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowPublishOperation(Boolean allowPublishOperation) {
                this.allowPublishOperation = allowPublishOperation;
                return this;
            }

            /**
             * <p>Indicates whether the work can be authorized for sharing. Possible values:</p>
             * <ul>
             * <li>true: Authorized</li>
             * <li>false: Not authorized</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowShareOperation(Boolean allowShareOperation) {
                this.allowShareOperation = allowShareOperation;
                return this;
            }

            /**
             * <p>Creation time of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-10 17:51:07</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Quick BI user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>de4bc5f9429141cc8091cdd1c15b****</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Aliyun account name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>pop****@aliyun.com</p>
             */
            public Builder createUserAccountName(String createUserAccountName) {
                this.createUserAccountName = createUserAccountName;
                return this;
            }

            /**
             * <p>Last modified time of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-10 17:51:07</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>ID of the Quick BI user who modified the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>de4bc5f9429141cc8091cdd1c15b****</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>Aliyun account name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>pop****@aliyun.com</p>
             */
            public Builder modifyUserAccountName(String modifyUserAccountName) {
                this.modifyUserAccountName = modifyUserAccountName;
                return this;
            }

            /**
             * <p>ID of the organization to which the workspace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>Quick BI user ID of the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>de4bc5f9429141cc8091cdd1c15b****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Aliyun account name of the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>pop****@aliyun.com</p>
             */
            public Builder ownerAccountName(String ownerAccountName) {
                this.ownerAccountName = ownerAccountName;
                return this;
            }

            /**
             * RealOwnerAccountName.
             */
            public Builder realOwnerAccountName(String realOwnerAccountName) {
                this.realOwnerAccountName = realOwnerAccountName;
                return this;
            }

            /**
             * <p>Workspace description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workspaceDescription(String workspaceDescription) {
                this.workspaceDescription = workspaceDescription;
                return this;
            }

            /**
             * WorkspaceExportConfig.
             */
            public Builder workspaceExportConfig(WorkspaceExportConfig workspaceExportConfig) {
                this.workspaceExportConfig = workspaceExportConfig;
                return this;
            }

            /**
             * <p>Workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>Name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrganizationWorkspaceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrganizationWorkspaceListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>List of workspaces.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Number of rows per page as set in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
