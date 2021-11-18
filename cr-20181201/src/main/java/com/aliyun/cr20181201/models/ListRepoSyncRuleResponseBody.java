// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoSyncRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoSyncRuleResponseBody</p>
 */
public class ListRepoSyncRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("SyncRules")
    private java.util.List < SyncRules> syncRules;


    private ListRepoSyncRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.syncRules = builder.syncRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoSyncRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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

    /**
     * @return syncRules
     */
    public java.util.List < SyncRules> getSyncRules() {
        return this.syncRules;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private Integer totalCount; 
        private java.util.List < SyncRules> syncRules; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Synchronization rule list</p>
         */
        public Builder syncRules(java.util.List < SyncRules> syncRules) {
            this.syncRules = syncRules;
            return this;
        }

        public ListRepoSyncRuleResponseBody build() {
            return new ListRepoSyncRuleResponseBody(this);
        } 

    } 

    public static class SyncRules extends TeaModel {
        @NameInMap("SyncTrigger")
        private String syncTrigger;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("LocalRegionId")
        private String localRegionId;

        @NameInMap("SyncScope")
        private String syncScope;

        @NameInMap("TagFilter")
        private String tagFilter;

        @NameInMap("TargetNamespaceName")
        private String targetNamespaceName;

        @NameInMap("TargetRepoName")
        private String targetRepoName;

        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("SyncRuleId")
        private String syncRuleId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("SyncRuleName")
        private String syncRuleName;

        @NameInMap("TargetRegionId")
        private String targetRegionId;

        @NameInMap("LocalInstanceId")
        private String localInstanceId;

        @NameInMap("CrossUser")
        private Boolean crossUser;

        @NameInMap("LocalNamespaceName")
        private String localNamespaceName;

        @NameInMap("SyncDirection")
        private String syncDirection;

        @NameInMap("LocalRepoName")
        private String localRepoName;


        private SyncRules(Builder builder) {
            this.syncTrigger = builder.syncTrigger;
            this.createTime = builder.createTime;
            this.localRegionId = builder.localRegionId;
            this.syncScope = builder.syncScope;
            this.tagFilter = builder.tagFilter;
            this.targetNamespaceName = builder.targetNamespaceName;
            this.targetRepoName = builder.targetRepoName;
            this.targetInstanceId = builder.targetInstanceId;
            this.syncRuleId = builder.syncRuleId;
            this.modifiedTime = builder.modifiedTime;
            this.syncRuleName = builder.syncRuleName;
            this.targetRegionId = builder.targetRegionId;
            this.localInstanceId = builder.localInstanceId;
            this.crossUser = builder.crossUser;
            this.localNamespaceName = builder.localNamespaceName;
            this.syncDirection = builder.syncDirection;
            this.localRepoName = builder.localRepoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncRules create() {
            return builder().build();
        }

        /**
         * @return syncTrigger
         */
        public String getSyncTrigger() {
            return this.syncTrigger;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return localRegionId
         */
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        /**
         * @return syncScope
         */
        public String getSyncScope() {
            return this.syncScope;
        }

        /**
         * @return tagFilter
         */
        public String getTagFilter() {
            return this.tagFilter;
        }

        /**
         * @return targetNamespaceName
         */
        public String getTargetNamespaceName() {
            return this.targetNamespaceName;
        }

        /**
         * @return targetRepoName
         */
        public String getTargetRepoName() {
            return this.targetRepoName;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return syncRuleId
         */
        public String getSyncRuleId() {
            return this.syncRuleId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return syncRuleName
         */
        public String getSyncRuleName() {
            return this.syncRuleName;
        }

        /**
         * @return targetRegionId
         */
        public String getTargetRegionId() {
            return this.targetRegionId;
        }

        /**
         * @return localInstanceId
         */
        public String getLocalInstanceId() {
            return this.localInstanceId;
        }

        /**
         * @return crossUser
         */
        public Boolean getCrossUser() {
            return this.crossUser;
        }

        /**
         * @return localNamespaceName
         */
        public String getLocalNamespaceName() {
            return this.localNamespaceName;
        }

        /**
         * @return syncDirection
         */
        public String getSyncDirection() {
            return this.syncDirection;
        }

        /**
         * @return localRepoName
         */
        public String getLocalRepoName() {
            return this.localRepoName;
        }

        public static final class Builder {
            private String syncTrigger; 
            private Long createTime; 
            private String localRegionId; 
            private String syncScope; 
            private String tagFilter; 
            private String targetNamespaceName; 
            private String targetRepoName; 
            private String targetInstanceId; 
            private String syncRuleId; 
            private Long modifiedTime; 
            private String syncRuleName; 
            private String targetRegionId; 
            private String localInstanceId; 
            private Boolean crossUser; 
            private String localNamespaceName; 
            private String syncDirection; 
            private String localRepoName; 

            /**
             * <p>The trigger policy. Valid values:

-"INITIATIVE": initiatively triggered

-"PASSIVE": passive trigger</p>
             */
            public Builder syncTrigger(String syncTrigger) {
                this.syncTrigger = syncTrigger;
                return this;
            }

            /**
             * <p>Created</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The region ID of the source instance.</p>
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * <p>The synchronization range. Valid values:

-"NAMESPACE": synchronizes data by namespace

-"REPO": synchronizes data by image repository</p>
             */
            public Builder syncScope(String syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            /**
             * <p>TAG filtering rules</p>
             */
            public Builder tagFilter(String tagFilter) {
                this.tagFilter = tagFilter;
                return this;
            }

            /**
             * <p>The namespace of the target instance.</p>
             */
            public Builder targetNamespaceName(String targetNamespaceName) {
                this.targetNamespaceName = targetNamespaceName;
                return this;
            }

            /**
             * <p>The name of the destination instance repository.</p>
             */
            public Builder targetRepoName(String targetRepoName) {
                this.targetRepoName = targetRepoName;
                return this;
            }

            /**
             * <p>Target instance ID</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>Synchronous rule ID</p>
             */
            public Builder syncRuleId(String syncRuleId) {
                this.syncRuleId = syncRuleId;
                return this;
            }

            /**
             * <p>Modification time</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>Synchronization rule name</p>
             */
            public Builder syncRuleName(String syncRuleName) {
                this.syncRuleName = syncRuleName;
                return this;
            }

            /**
             * <p>The region ID of the target instance.</p>
             */
            public Builder targetRegionId(String targetRegionId) {
                this.targetRegionId = targetRegionId;
                return this;
            }

            /**
             * <p>SOURCE instance ID</p>
             */
            public Builder localInstanceId(String localInstanceId) {
                this.localInstanceId = localInstanceId;
                return this;
            }

            /**
             * <p>Specifies whether to synchronize images across accounts. Valid values:

-"true": synchronizes images across accounts

-"false": synchronizes images with the same account

Default value: "false"</p>
             */
            public Builder crossUser(Boolean crossUser) {
                this.crossUser = crossUser;
                return this;
            }

            /**
             * <p>SOURCE instance namespace</p>
             */
            public Builder localNamespaceName(String localNamespaceName) {
                this.localNamespaceName = localNamespaceName;
                return this;
            }

            /**
             * <p>The direction of synchronization. Valid values:

-"FROM": synchronizes the source instance to the destination instance.

-"TO": the destination instance is synchronized to the source instance.</p>
             */
            public Builder syncDirection(String syncDirection) {
                this.syncDirection = syncDirection;
                return this;
            }

            /**
             * <p>SOURCE instance repository name</p>
             */
            public Builder localRepoName(String localRepoName) {
                this.localRepoName = localRepoName;
                return this;
            }

            public SyncRules build() {
                return new SyncRules(this);
            } 

        } 

    }
}
