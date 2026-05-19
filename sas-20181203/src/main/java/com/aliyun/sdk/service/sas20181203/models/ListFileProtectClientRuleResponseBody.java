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
 * {@link ListFileProtectClientRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectClientRuleResponseBody</p>
 */
public class ListFileProtectClientRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileProtectList")
    private java.util.List<FileProtectList> fileProtectList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFileProtectClientRuleResponseBody(Builder builder) {
        this.fileProtectList = builder.fileProtectList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectClientRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileProtectList
     */
    public java.util.List<FileProtectList> getFileProtectList() {
        return this.fileProtectList;
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
        private java.util.List<FileProtectList> fileProtectList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFileProtectClientRuleResponseBody model) {
            this.fileProtectList = model.fileProtectList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * FileProtectList.
         */
        public Builder fileProtectList(java.util.List<FileProtectList> fileProtectList) {
            this.fileProtectList = fileProtectList;
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

        public ListFileProtectClientRuleResponseBody build() {
            return new ListFileProtectClientRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileProtectClientRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileProtectClientRuleResponseBody</p>
     */
    public static class FileProtectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private Integer alertLevel;

        @com.aliyun.core.annotation.NameInMap("EffectInstanceCount")
        private Long effectInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ExcludeUsers")
        private java.util.List<String> excludeUsers;

        @com.aliyun.core.annotation.NameInMap("FileOps")
        private java.util.List<String> fileOps;

        @com.aliyun.core.annotation.NameInMap("FilePaths")
        private java.util.List<String> filePaths;

        @com.aliyun.core.annotation.NameInMap("FileTypes")
        private java.util.List<String> fileTypes;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcPaths")
        private java.util.List<String> procPaths;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private FileProtectList(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.effectInstanceCount = builder.effectInstanceCount;
            this.excludeUsers = builder.excludeUsers;
            this.fileOps = builder.fileOps;
            this.filePaths = builder.filePaths;
            this.fileTypes = builder.fileTypes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.platform = builder.platform;
            this.procPaths = builder.procPaths;
            this.ruleAction = builder.ruleAction;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileProtectList create() {
            return builder().build();
        }

        /**
         * @return alertLevel
         */
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return effectInstanceCount
         */
        public Long getEffectInstanceCount() {
            return this.effectInstanceCount;
        }

        /**
         * @return excludeUsers
         */
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        /**
         * @return fileOps
         */
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        /**
         * @return filePaths
         */
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        /**
         * @return fileTypes
         */
        public java.util.List<String> getFileTypes() {
            return this.fileTypes;
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
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return procPaths
         */
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private Integer alertLevel; 
            private Long effectInstanceCount; 
            private java.util.List<String> excludeUsers; 
            private java.util.List<String> fileOps; 
            private java.util.List<String> filePaths; 
            private java.util.List<String> fileTypes; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String platform; 
            private java.util.List<String> procPaths; 
            private String ruleAction; 
            private String ruleName; 
            private Integer status; 
            private String switchId; 

            private Builder() {
            } 

            private Builder(FileProtectList model) {
                this.alertLevel = model.alertLevel;
                this.effectInstanceCount = model.effectInstanceCount;
                this.excludeUsers = model.excludeUsers;
                this.fileOps = model.fileOps;
                this.filePaths = model.filePaths;
                this.fileTypes = model.fileTypes;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.platform = model.platform;
                this.procPaths = model.procPaths;
                this.ruleAction = model.ruleAction;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.switchId = model.switchId;
            } 

            /**
             * AlertLevel.
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * EffectInstanceCount.
             */
            public Builder effectInstanceCount(Long effectInstanceCount) {
                this.effectInstanceCount = effectInstanceCount;
                return this;
            }

            /**
             * ExcludeUsers.
             */
            public Builder excludeUsers(java.util.List<String> excludeUsers) {
                this.excludeUsers = excludeUsers;
                return this;
            }

            /**
             * FileOps.
             */
            public Builder fileOps(java.util.List<String> fileOps) {
                this.fileOps = fileOps;
                return this;
            }

            /**
             * FilePaths.
             */
            public Builder filePaths(java.util.List<String> filePaths) {
                this.filePaths = filePaths;
                return this;
            }

            /**
             * FileTypes.
             */
            public Builder fileTypes(java.util.List<String> fileTypes) {
                this.fileTypes = fileTypes;
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
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProcPaths.
             */
            public Builder procPaths(java.util.List<String> procPaths) {
                this.procPaths = procPaths;
                return this;
            }

            /**
             * RuleAction.
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public FileProtectList build() {
                return new FileProtectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFileProtectClientRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileProtectClientRuleResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
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
