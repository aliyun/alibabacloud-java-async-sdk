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
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The synchronization rules.
         */
        public Builder syncRules(java.util.List < SyncRules> syncRules) {
            this.syncRules = syncRules;
            return this;
        }

        /**
         * The total number of returned entries.
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
             * The time when the synchronization rule was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether images are synchronized across Alibaba Cloud accounts. Valid values:
             * <p>
             * 
             * *   `true`: Images are synchronized across Alibaba Cloud accounts.
             * *   `false`: Images are synchronized within the same Alibaba Cloud account.
             * 
             * Default value: `false`
             */
            public Builder crossUser(Boolean crossUser) {
                this.crossUser = crossUser;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder localInstanceId(String localInstanceId) {
                this.localInstanceId = localInstanceId;
                return this;
            }

            /**
             * The namespace name of the source instance.
             */
            public Builder localNamespaceName(String localNamespaceName) {
                this.localNamespaceName = localNamespaceName;
                return this;
            }

            /**
             * The region ID of the source instance.
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * The image repository name of the source instance.
             */
            public Builder localRepoName(String localRepoName) {
                this.localRepoName = localRepoName;
                return this;
            }

            /**
             * The time when the synchronization rule was last modified.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   `FROM`: Images are synchronized from the source instance to the destination instance.
             * *   `TO`: Images are synchronized from the destination instance to the source instance.
             */
            public Builder syncDirection(String syncDirection) {
                this.syncDirection = syncDirection;
                return this;
            }

            /**
             * The ID of the synchronization rule.
             */
            public Builder syncRuleId(String syncRuleId) {
                this.syncRuleId = syncRuleId;
                return this;
            }

            /**
             * The name of the synchronization rule.
             */
            public Builder syncRuleName(String syncRuleName) {
                this.syncRuleName = syncRuleName;
                return this;
            }

            /**
             * The synchronization scope. Valid values:
             * <p>
             * 
             * *   `NAMESPACE`: synchronizes the image tags in a namespace that meet the synchronization rule.
             * *   `REPO`: synchronizes the image tags in an image repository that meet the synchronization rule.
             */
            public Builder syncScope(String syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            /**
             * The policy that is applied to trigger the synchronization rule. Valid values:
             * <p>
             * 
             * *   `INITIATIVE`: The synchronization rule is positively triggered.
             * *   `PASSIVE`: The synchronization rule is passively triggered.
             */
            public Builder syncTrigger(String syncTrigger) {
                this.syncTrigger = syncTrigger;
                return this;
            }

            /**
             * The regular expression that is used to filter image tags.
             */
            public Builder tagFilter(String tagFilter) {
                this.tagFilter = tagFilter;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * The namespace name of the destination instance.
             */
            public Builder targetNamespaceName(String targetNamespaceName) {
                this.targetNamespaceName = targetNamespaceName;
                return this;
            }

            /**
             * The region ID of the destination instance.
             */
            public Builder targetRegionId(String targetRegionId) {
                this.targetRegionId = targetRegionId;
                return this;
            }

            /**
             * The image repository name of the destination instance.
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
