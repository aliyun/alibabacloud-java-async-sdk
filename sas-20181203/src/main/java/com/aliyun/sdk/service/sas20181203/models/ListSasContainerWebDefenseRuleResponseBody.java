// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListSasContainerWebDefenseRuleResponseBody</p>
 */
public class ListSasContainerWebDefenseRuleResponseBody extends TeaModel {
    @NameInMap("ContainerWebDefenseRuleList")
    private java.util.List < ContainerWebDefenseRuleList> containerWebDefenseRuleList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListSasContainerWebDefenseRuleResponseBody(Builder builder) {
        this.containerWebDefenseRuleList = builder.containerWebDefenseRuleList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSasContainerWebDefenseRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerWebDefenseRuleList
     */
    public java.util.List < ContainerWebDefenseRuleList> getContainerWebDefenseRuleList() {
        return this.containerWebDefenseRuleList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ContainerWebDefenseRuleList> containerWebDefenseRuleList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * ContainerWebDefenseRuleList.
         */
        public Builder containerWebDefenseRuleList(java.util.List < ContainerWebDefenseRuleList> containerWebDefenseRuleList) {
            this.containerWebDefenseRuleList = containerWebDefenseRuleList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSasContainerWebDefenseRuleResponseBody build() {
            return new ListSasContainerWebDefenseRuleResponseBody(this);
        } 

    } 

    public static class PathConfDTOList extends TeaModel {
        @NameInMap("BackupPath")
        private String backupPath;

        @NameInMap("DefenseMode")
        private String defenseMode;

        @NameInMap("DefensePath")
        private String defensePath;

        @NameInMap("ExcludeFile")
        private String excludeFile;

        @NameInMap("ExcludeFilePath")
        private String excludeFilePath;

        @NameInMap("ExcludeFileType")
        private String excludeFileType;

        @NameInMap("GuardType")
        private Integer guardType;

        @NameInMap("IncludeFile")
        private String includeFile;

        @NameInMap("IncludeFileType")
        private String includeFileType;

        @NameInMap("ProcessPathList")
        private java.util.List < String > processPathList;

        private PathConfDTOList(Builder builder) {
            this.backupPath = builder.backupPath;
            this.defenseMode = builder.defenseMode;
            this.defensePath = builder.defensePath;
            this.excludeFile = builder.excludeFile;
            this.excludeFilePath = builder.excludeFilePath;
            this.excludeFileType = builder.excludeFileType;
            this.guardType = builder.guardType;
            this.includeFile = builder.includeFile;
            this.includeFileType = builder.includeFileType;
            this.processPathList = builder.processPathList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathConfDTOList create() {
            return builder().build();
        }

        /**
         * @return backupPath
         */
        public String getBackupPath() {
            return this.backupPath;
        }

        /**
         * @return defenseMode
         */
        public String getDefenseMode() {
            return this.defenseMode;
        }

        /**
         * @return defensePath
         */
        public String getDefensePath() {
            return this.defensePath;
        }

        /**
         * @return excludeFile
         */
        public String getExcludeFile() {
            return this.excludeFile;
        }

        /**
         * @return excludeFilePath
         */
        public String getExcludeFilePath() {
            return this.excludeFilePath;
        }

        /**
         * @return excludeFileType
         */
        public String getExcludeFileType() {
            return this.excludeFileType;
        }

        /**
         * @return guardType
         */
        public Integer getGuardType() {
            return this.guardType;
        }

        /**
         * @return includeFile
         */
        public String getIncludeFile() {
            return this.includeFile;
        }

        /**
         * @return includeFileType
         */
        public String getIncludeFileType() {
            return this.includeFileType;
        }

        /**
         * @return processPathList
         */
        public java.util.List < String > getProcessPathList() {
            return this.processPathList;
        }

        public static final class Builder {
            private String backupPath; 
            private String defenseMode; 
            private String defensePath; 
            private String excludeFile; 
            private String excludeFilePath; 
            private String excludeFileType; 
            private Integer guardType; 
            private String includeFile; 
            private String includeFileType; 
            private java.util.List < String > processPathList; 

            /**
             * BackupPath.
             */
            public Builder backupPath(String backupPath) {
                this.backupPath = backupPath;
                return this;
            }

            /**
             * DefenseMode.
             */
            public Builder defenseMode(String defenseMode) {
                this.defenseMode = defenseMode;
                return this;
            }

            /**
             * DefensePath.
             */
            public Builder defensePath(String defensePath) {
                this.defensePath = defensePath;
                return this;
            }

            /**
             * ExcludeFile.
             */
            public Builder excludeFile(String excludeFile) {
                this.excludeFile = excludeFile;
                return this;
            }

            /**
             * ExcludeFilePath.
             */
            public Builder excludeFilePath(String excludeFilePath) {
                this.excludeFilePath = excludeFilePath;
                return this;
            }

            /**
             * ExcludeFileType.
             */
            public Builder excludeFileType(String excludeFileType) {
                this.excludeFileType = excludeFileType;
                return this;
            }

            /**
             * GuardType.
             */
            public Builder guardType(Integer guardType) {
                this.guardType = guardType;
                return this;
            }

            /**
             * IncludeFile.
             */
            public Builder includeFile(String includeFile) {
                this.includeFile = includeFile;
                return this;
            }

            /**
             * IncludeFileType.
             */
            public Builder includeFileType(String includeFileType) {
                this.includeFileType = includeFileType;
                return this;
            }

            /**
             * ProcessPathList.
             */
            public Builder processPathList(java.util.List < String > processPathList) {
                this.processPathList = processPathList;
                return this;
            }

            public PathConfDTOList build() {
                return new PathConfDTOList(this);
            } 

        } 

    }
    public static class ContainerWebDefenseRuleList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("ApptotalCount")
        private Integer apptotalCount;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PathConfDTOList")
        private java.util.List < PathConfDTOList> pathConfDTOList;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleStatus")
        private Integer ruleStatus;

        private ContainerWebDefenseRuleList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.apptotalCount = builder.apptotalCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.pathConfDTOList = builder.pathConfDTOList;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerWebDefenseRuleList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return apptotalCount
         */
        public Integer getApptotalCount() {
            return this.apptotalCount;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return pathConfDTOList
         */
        public java.util.List < PathConfDTOList> getPathConfDTOList() {
            return this.pathConfDTOList;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleStatus
         */
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer apptotalCount; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private java.util.List < PathConfDTOList> pathConfDTOList; 
            private String ruleName; 
            private Integer ruleStatus; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ApptotalCount.
             */
            public Builder apptotalCount(Integer apptotalCount) {
                this.apptotalCount = apptotalCount;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * PathConfDTOList.
             */
            public Builder pathConfDTOList(java.util.List < PathConfDTOList> pathConfDTOList) {
                this.pathConfDTOList = pathConfDTOList;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleStatus.
             */
            public Builder ruleStatus(Integer ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public ContainerWebDefenseRuleList build() {
                return new ContainerWebDefenseRuleList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
