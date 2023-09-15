// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectRuleResponseBody</p>
 */
public class ListFileProtectRuleResponseBody extends TeaModel {
    @NameInMap("FileProtectList")
    private java.util.List < FileProtectList> fileProtectList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * FileProtectList.
         */
        public Builder fileProtectList(java.util.List < FileProtectList> fileProtectList) {
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

        public ListFileProtectRuleResponseBody build() {
            return new ListFileProtectRuleResponseBody(this);
        } 

    } 

    public static class FileProtectList extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("AlertLevel")
        private String alertLevel;

        @NameInMap("EffectInstanceCount")
        private Long effectInstanceCount;

        @NameInMap("FileOps")
        private java.util.List < String > fileOps;

        @NameInMap("FilePaths")
        private java.util.List < String > filePaths;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ProcPaths")
        private java.util.List < String > procPaths;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SwitchId")
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
            private java.util.List < String > procPaths; 
            private String ruleName; 
            private Integer status; 
            private String switchId; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AlertLevel.
             */
            public Builder alertLevel(String alertLevel) {
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
             * FileOps.
             */
            public Builder fileOps(java.util.List < String > fileOps) {
                this.fileOps = fileOps;
                return this;
            }

            /**
             * FilePaths.
             */
            public Builder filePaths(java.util.List < String > filePaths) {
                this.filePaths = filePaths;
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
             * ProcPaths.
             */
            public Builder procPaths(java.util.List < String > procPaths) {
                this.procPaths = procPaths;
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
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
