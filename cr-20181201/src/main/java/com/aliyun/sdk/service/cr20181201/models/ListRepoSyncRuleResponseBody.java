// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoSyncRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoSyncRuleResponseBody</p>
 */
public class ListRepoSyncRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncRules")
    private java.util.List < SyncRules> syncRules;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListRepoSyncRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.syncRules = builder.syncRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoSyncRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncRules
     */
    public java.util.List < SyncRules> getSyncRules() {
        return this.syncRules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SyncRules> syncRules; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SyncRules.
         */
        public Builder syncRules(java.util.List < SyncRules> syncRules) {
            this.syncRules = syncRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoSyncRuleResponseBody build() {
            return new ListRepoSyncRuleResponseBody(this);
        } 

    } 

    public static class SyncRules extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CrossUser")
        private Boolean crossUser;

        @NameInMap("LocalInstanceId")
        private String localInstanceId;

        @NameInMap("LocalNamespaceName")
        private String localNamespaceName;

        @NameInMap("LocalRegionId")
        private String localRegionId;

        @NameInMap("LocalRepoName")
        private String localRepoName;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("SyncDirection")
        private String syncDirection;

        @NameInMap("SyncRuleId")
        private String syncRuleId;

        @NameInMap("SyncRuleName")
        private String syncRuleName;

        @NameInMap("SyncScope")
        private String syncScope;

        @NameInMap("SyncTrigger")
        private String syncTrigger;

        @NameInMap("TagFilter")
        private String tagFilter;

        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("TargetNamespaceName")
        private String targetNamespaceName;

        @NameInMap("TargetRegionId")
        private String targetRegionId;

        @NameInMap("TargetRepoName")
        private String targetRepoName;

        private SyncRules(Builder builder) {
            this.createTime = builder.createTime;
            this.crossUser = builder.crossUser;
            this.localInstanceId = builder.localInstanceId;
            this.localNamespaceName = builder.localNamespaceName;
            this.localRegionId = builder.localRegionId;
            this.localRepoName = builder.localRepoName;
            this.modifiedTime = builder.modifiedTime;
            this.syncDirection = builder.syncDirection;
            this.syncRuleId = builder.syncRuleId;
            this.syncRuleName = builder.syncRuleName;
            this.syncScope = builder.syncScope;
            this.syncTrigger = builder.syncTrigger;
            this.tagFilter = builder.tagFilter;
            this.targetInstanceId = builder.targetInstanceId;
            this.targetNamespaceName = builder.targetNamespaceName;
            this.targetRegionId = builder.targetRegionId;
            this.targetRepoName = builder.targetRepoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncRules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crossUser
         */
        public Boolean getCrossUser() {
            return this.crossUser;
        }

        /**
         * @return localInstanceId
         */
        public String getLocalInstanceId() {
            return this.localInstanceId;
        }

        /**
         * @return localNamespaceName
         */
        public String getLocalNamespaceName() {
            return this.localNamespaceName;
        }

        /**
         * @return localRegionId
         */
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        /**
         * @return localRepoName
         */
        public String getLocalRepoName() {
            return this.localRepoName;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return syncDirection
         */
        public String getSyncDirection() {
            return this.syncDirection;
        }

        /**
         * @return syncRuleId
         */
        public String getSyncRuleId() {
            return this.syncRuleId;
        }

        /**
         * @return syncRuleName
         */
        public String getSyncRuleName() {
            return this.syncRuleName;
        }

        /**
         * @return syncScope
         */
        public String getSyncScope() {
            return this.syncScope;
        }

        /**
         * @return syncTrigger
         */
        public String getSyncTrigger() {
            return this.syncTrigger;
        }

        /**
         * @return tagFilter
         */
        public String getTagFilter() {
            return this.tagFilter;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return targetNamespaceName
         */
        public String getTargetNamespaceName() {
            return this.targetNamespaceName;
        }

        /**
         * @return targetRegionId
         */
        public String getTargetRegionId() {
            return this.targetRegionId;
        }

        /**
         * @return targetRepoName
         */
        public String getTargetRepoName() {
            return this.targetRepoName;
        }

        public static final class Builder {
            private Long createTime; 
            private Boolean crossUser; 
            private String localInstanceId; 
            private String localNamespaceName; 
            private String localRegionId; 
            private String localRepoName; 
            private Long modifiedTime; 
            private String syncDirection; 
            private String syncRuleId; 
            private String syncRuleName; 
            private String syncScope; 
            private String syncTrigger; 
            private String tagFilter; 
            private String targetInstanceId; 
            private String targetNamespaceName; 
            private String targetRegionId; 
            private String targetRepoName; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CrossUser.
             */
            public Builder crossUser(Boolean crossUser) {
                this.crossUser = crossUser;
                return this;
            }

            /**
             * LocalInstanceId.
             */
            public Builder localInstanceId(String localInstanceId) {
                this.localInstanceId = localInstanceId;
                return this;
            }

            /**
             * LocalNamespaceName.
             */
            public Builder localNamespaceName(String localNamespaceName) {
                this.localNamespaceName = localNamespaceName;
                return this;
            }

            /**
             * LocalRegionId.
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * LocalRepoName.
             */
            public Builder localRepoName(String localRepoName) {
                this.localRepoName = localRepoName;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * SyncDirection.
             */
            public Builder syncDirection(String syncDirection) {
                this.syncDirection = syncDirection;
                return this;
            }

            /**
             * SyncRuleId.
             */
            public Builder syncRuleId(String syncRuleId) {
                this.syncRuleId = syncRuleId;
                return this;
            }

            /**
             * SyncRuleName.
             */
            public Builder syncRuleName(String syncRuleName) {
                this.syncRuleName = syncRuleName;
                return this;
            }

            /**
             * SyncScope.
             */
            public Builder syncScope(String syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            /**
             * SyncTrigger.
             */
            public Builder syncTrigger(String syncTrigger) {
                this.syncTrigger = syncTrigger;
                return this;
            }

            /**
             * TagFilter.
             */
            public Builder tagFilter(String tagFilter) {
                this.tagFilter = tagFilter;
                return this;
            }

            /**
             * TargetInstanceId.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * TargetNamespaceName.
             */
            public Builder targetNamespaceName(String targetNamespaceName) {
                this.targetNamespaceName = targetNamespaceName;
                return this;
            }

            /**
             * TargetRegionId.
             */
            public Builder targetRegionId(String targetRegionId) {
                this.targetRegionId = targetRegionId;
                return this;
            }

            /**
             * TargetRepoName.
             */
            public Builder targetRepoName(String targetRepoName) {
                this.targetRepoName = targetRepoName;
                return this;
            }

            public SyncRules build() {
                return new SyncRules(this);
            } 

        } 

    }
}
