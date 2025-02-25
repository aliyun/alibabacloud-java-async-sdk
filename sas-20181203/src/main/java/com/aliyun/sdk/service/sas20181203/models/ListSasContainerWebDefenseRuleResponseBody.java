// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListSasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListSasContainerWebDefenseRuleResponseBody</p>
 */
public class ListSasContainerWebDefenseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerWebDefenseRuleList")
    private java.util.List<ContainerWebDefenseRuleList> containerWebDefenseRuleList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ContainerWebDefenseRuleList> getContainerWebDefenseRuleList() {
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
        private java.util.List<ContainerWebDefenseRuleList> containerWebDefenseRuleList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The rules for container tamper-proofing.</p>
         */
        public Builder containerWebDefenseRuleList(java.util.List<ContainerWebDefenseRuleList> containerWebDefenseRuleList) {
            this.containerWebDefenseRuleList = containerWebDefenseRuleList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID, which is used to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8C376***AE74FB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSasContainerWebDefenseRuleResponseBody build() {
            return new ListSasContainerWebDefenseRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListSasContainerWebDefenseRuleResponseBody</p>
     */
    public static class PathConfDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPath")
        private String backupPath;

        @com.aliyun.core.annotation.NameInMap("DefenseMode")
        private String defenseMode;

        @com.aliyun.core.annotation.NameInMap("DefensePath")
        private String defensePath;

        @com.aliyun.core.annotation.NameInMap("ExcludeFile")
        private String excludeFile;

        @com.aliyun.core.annotation.NameInMap("ExcludeFilePath")
        private String excludeFilePath;

        @com.aliyun.core.annotation.NameInMap("ExcludeFileType")
        private String excludeFileType;

        @com.aliyun.core.annotation.NameInMap("GuardType")
        private Integer guardType;

        @com.aliyun.core.annotation.NameInMap("IncludeFile")
        private String includeFile;

        @com.aliyun.core.annotation.NameInMap("IncludeFileType")
        private String includeFileType;

        @com.aliyun.core.annotation.NameInMap("ProcessPathList")
        private java.util.List<String> processPathList;

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
        public java.util.List<String> getProcessPathList() {
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
            private java.util.List<String> processPathList; 

            /**
             * <p>The backup paths.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/test</p>
             */
            public Builder backupPath(String backupPath) {
                this.backupPath = backupPath;
                return this;
            }

            /**
             * <p>The prevention mode. Valid values:</p>
             * <ul>
             * <li><strong>block</strong></li>
             * <li><strong>audit</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>audit</p>
             */
            public Builder defenseMode(String defenseMode) {
                this.defenseMode = defenseMode;
                return this;
            }

            /**
             * <p>The protected path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test/</p>
             */
            public Builder defensePath(String defensePath) {
                this.defensePath = defensePath;
                return this;
            }

            /**
             * <p>The file that is excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>php</p>
             */
            public Builder excludeFile(String excludeFile) {
                this.excludeFile = excludeFile;
                return this;
            }

            /**
             * <p>The path to the file that is excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/tt</p>
             */
            public Builder excludeFilePath(String excludeFilePath) {
                this.excludeFilePath = excludeFilePath;
                return this;
            }

            /**
             * <p>The type of the file that is excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>jsp</p>
             */
            public Builder excludeFileType(String excludeFileType) {
                this.excludeFileType = excludeFileType;
                return this;
            }

            /**
             * <p>The protection mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: basic mode (whitelist)</li>
             * <li><strong>1</strong>: complex mode (blacklist)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder guardType(Integer guardType) {
                this.guardType = guardType;
                return this;
            }

            /**
             * <p>The file that is included.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test</p>
             */
            public Builder includeFile(String includeFile) {
                this.includeFile = includeFile;
                return this;
            }

            /**
             * <p>The type of the file that is included.</p>
             * 
             * <strong>example:</strong>
             * <p>php</p>
             */
            public Builder includeFileType(String includeFileType) {
                this.includeFileType = includeFileType;
                return this;
            }

            /**
             * <p>The processes that are added to the whitelist.</p>
             */
            public Builder processPathList(java.util.List<String> processPathList) {
                this.processPathList = processPathList;
                return this;
            }

            public PathConfDTOList build() {
                return new PathConfDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListSasContainerWebDefenseRuleResponseBody</p>
     */
    public static class ContainerWebDefenseRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ApptotalCount")
        private Integer apptotalCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PathConfDTOList")
        private java.util.List<PathConfDTOList> pathConfDTOList;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
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
        public java.util.List<PathConfDTOList> getPathConfDTOList() {
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
            private java.util.List<PathConfDTOList> pathConfDTOList; 
            private String ruleName; 
            private Integer ruleStatus; 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1766185894104675</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The number of the applications.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder apptotalCount(Integer apptotalCount) {
                this.apptotalCount = apptotalCount;
                return this;
            }

            /**
             * <p>The creation time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698978109000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the alert event was last modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1678852686000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>420336648</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The paths that are protected.</p>
             */
            public Builder pathConfDTOList(java.util.List<PathConfDTOList> pathConfDTOList) {
                this.pathConfDTOList = pathConfDTOList;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListSasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListSasContainerWebDefenseRuleResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
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
