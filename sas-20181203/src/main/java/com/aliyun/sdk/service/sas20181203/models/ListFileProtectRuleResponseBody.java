// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectRuleResponseBody</p>
 */
public class ListFileProtectRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileProtectList")
    private java.util.List < FileProtectList> fileProtectList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFileProtectRuleResponseBody(Builder builder) {
        this.fileProtectList = builder.fileProtectList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileProtectList
     */
    public java.util.List < FileProtectList> getFileProtectList() {
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
        private java.util.List < FileProtectList> fileProtectList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The details of returned data.
         */
        public Builder fileProtectList(java.util.List < FileProtectList> fileProtectList) {
            this.fileProtectList = fileProtectList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileProtectRuleResponseBody build() {
            return new ListFileProtectRuleResponseBody(this);
        } 

    } 

    public static class FileProtectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("EffectInstanceCount")
        private Long effectInstanceCount;

        @com.aliyun.core.annotation.NameInMap("FileOps")
        private java.util.List < String > fileOps;

        @com.aliyun.core.annotation.NameInMap("FilePaths")
        private java.util.List < String > filePaths;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcPaths")
        private java.util.List < String > procPaths;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private FileProtectList(Builder builder) {
            this.action = builder.action;
            this.alertLevel = builder.alertLevel;
            this.effectInstanceCount = builder.effectInstanceCount;
            this.fileOps = builder.fileOps;
            this.filePaths = builder.filePaths;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.platform = builder.platform;
            this.procPaths = builder.procPaths;
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
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return alertLevel
         */
        public String getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return effectInstanceCount
         */
        public Long getEffectInstanceCount() {
            return this.effectInstanceCount;
        }

        /**
         * @return fileOps
         */
        public java.util.List < String > getFileOps() {
            return this.fileOps;
        }

        /**
         * @return filePaths
         */
        public java.util.List < String > getFilePaths() {
            return this.filePaths;
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
        public java.util.List < String > getProcPaths() {
            return this.procPaths;
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
            private String action; 
            private String alertLevel; 
            private Long effectInstanceCount; 
            private java.util.List < String > fileOps; 
            private java.util.List < String > filePaths; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String platform; 
            private java.util.List < String > procPaths; 
            private String ruleName; 
            private Integer status; 
            private String switchId; 

            /**
             * The handling method of the rule. Valid values:
             * <p>
             * 
             * *   pass: allow
             * *   alert
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The severity of alerts. Valid values:
             * <p>
             * 
             * *   0: does not generate alerts
             * *   1: sends notifications
             * *   2: suspicious
             * *   3: high-risk
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * The total number of affected assets.
             */
            public Builder effectInstanceCount(Long effectInstanceCount) {
                this.effectInstanceCount = effectInstanceCount;
                return this;
            }

            /**
             * The operations performed on the files.
             */
            public Builder fileOps(java.util.List < String > fileOps) {
                this.fileOps = fileOps;
                return this;
            }

            /**
             * The paths to the monitored files. Wildcard characters are supported.
             */
            public Builder filePaths(java.util.List < String > filePaths) {
                this.filePaths = filePaths;
                return this;
            }

            /**
             * The time when the rule was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the rule was last modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the operating system. Valid values:
             * <p>
             * 
             * *   **windows**: Windows
             * *   **linux**: Linux
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The paths to the monitored processes. Wildcard characters are supported.
             */
            public Builder procPaths(java.util.List < String > procPaths) {
                this.procPaths = procPaths;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: enabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The switch ID of the rule.
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

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
