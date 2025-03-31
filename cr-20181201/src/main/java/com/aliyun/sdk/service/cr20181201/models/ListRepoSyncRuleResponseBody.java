// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepoSyncRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoSyncRuleResponseBody</p>
 */
public class ListRepoSyncRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncRules")
    private java.util.List<SyncRules> syncRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SyncRules> getSyncRules() {
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
        private java.util.List<SyncRules> syncRules; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRepoSyncRuleResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.syncRules = model.syncRules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>838D1602-6D8F-47FB-B60A-656645D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried synchronization rules.</p>
         */
        public Builder syncRules(java.util.List<SyncRules> syncRules) {
            this.syncRules = syncRules;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoSyncRuleResponseBody build() {
            return new ListRepoSyncRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoSyncRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoSyncRuleResponseBody</p>
     */
    public static class SyncRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossUser")
        private Boolean crossUser;

        @com.aliyun.core.annotation.NameInMap("LocalInstanceId")
        private String localInstanceId;

        @com.aliyun.core.annotation.NameInMap("LocalNamespaceName")
        private String localNamespaceName;

        @com.aliyun.core.annotation.NameInMap("LocalRegionId")
        private String localRegionId;

        @com.aliyun.core.annotation.NameInMap("LocalRepoName")
        private String localRepoName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RepoNameFilter")
        private String repoNameFilter;

        @com.aliyun.core.annotation.NameInMap("SyncDirection")
        private String syncDirection;

        @com.aliyun.core.annotation.NameInMap("SyncRuleId")
        private String syncRuleId;

        @com.aliyun.core.annotation.NameInMap("SyncRuleName")
        private String syncRuleName;

        @com.aliyun.core.annotation.NameInMap("SyncScope")
        private String syncScope;

        @com.aliyun.core.annotation.NameInMap("SyncTrigger")
        private String syncTrigger;

        @com.aliyun.core.annotation.NameInMap("TagFilter")
        private String tagFilter;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("TargetNamespaceName")
        private String targetNamespaceName;

        @com.aliyun.core.annotation.NameInMap("TargetRegionId")
        private String targetRegionId;

        @com.aliyun.core.annotation.NameInMap("TargetRepoName")
        private String targetRepoName;

        private SyncRules(Builder builder) {
            this.createTime = builder.createTime;
            this.crossUser = builder.crossUser;
            this.localInstanceId = builder.localInstanceId;
            this.localNamespaceName = builder.localNamespaceName;
            this.localRegionId = builder.localRegionId;
            this.localRepoName = builder.localRepoName;
            this.modifiedTime = builder.modifiedTime;
            this.repoNameFilter = builder.repoNameFilter;
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
         * @return repoNameFilter
         */
        public String getRepoNameFilter() {
            return this.repoNameFilter;
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
            private String repoNameFilter; 
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

            private Builder() {
            } 

            private Builder(SyncRules model) {
                this.createTime = model.createTime;
                this.crossUser = model.crossUser;
                this.localInstanceId = model.localInstanceId;
                this.localNamespaceName = model.localNamespaceName;
                this.localRegionId = model.localRegionId;
                this.localRepoName = model.localRepoName;
                this.modifiedTime = model.modifiedTime;
                this.repoNameFilter = model.repoNameFilter;
                this.syncDirection = model.syncDirection;
                this.syncRuleId = model.syncRuleId;
                this.syncRuleName = model.syncRuleName;
                this.syncScope = model.syncScope;
                this.syncTrigger = model.syncTrigger;
                this.tagFilter = model.tagFilter;
                this.targetInstanceId = model.targetInstanceId;
                this.targetNamespaceName = model.targetNamespaceName;
                this.targetRegionId = model.targetRegionId;
                this.targetRepoName = model.targetRepoName;
            } 

            /**
             * <p>The time when the synchronization rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1572604642000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the synchronization is performed across Alibaba Cloud accounts. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Images are synchronized across Alibaba Cloud accounts.</li>
             * <li><code>false</code>: Images are synchronized within the same Alibaba Cloud account.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder crossUser(Boolean crossUser) {
                this.crossUser = crossUser;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-kmsiwlxxdcva****</p>
             */
            public Builder localInstanceId(String localInstanceId) {
                this.localInstanceId = localInstanceId;
                return this;
            }

            /**
             * <p>The name of the namespace in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder localNamespaceName(String localNamespaceName) {
                this.localNamespaceName = localNamespaceName;
                return this;
            }

            /**
             * <p>The region ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * <p>The name of the repository in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-repo-local</p>
             */
            public Builder localRepoName(String localRepoName) {
                this.localRepoName = localRepoName;
                return this;
            }

            /**
             * <p>The time when the synchronization rule was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1572604642000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The regular expression that is used to filter repositories.</p>
             * <blockquote>
             * <p> This parameter is valid only when SyncScope is set to <code>NAMESPACE</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>.*</p>
             */
            public Builder repoNameFilter(String repoNameFilter) {
                this.repoNameFilter = repoNameFilter;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><code>FROM</code>: Images are synchronized from the source instance to the destination instance.</li>
             * <li><code>TO</code>: Images are synchronized from the destination instance to the source instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FROM</p>
             */
            public Builder syncDirection(String syncDirection) {
                this.syncDirection = syncDirection;
                return this;
            }

            /**
             * <p>The ID of the synchronization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>crsr-7lph66uloi6h****</p>
             */
            public Builder syncRuleId(String syncRuleId) {
                this.syncRuleId = syncRuleId;
                return this;
            }

            /**
             * <p>The name of the synchronization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>sync-rule-1</p>
             */
            public Builder syncRuleName(String syncRuleName) {
                this.syncRuleName = syncRuleName;
                return this;
            }

            /**
             * <p>The synchronization scope. Valid values:</p>
             * <ul>
             * <li><code>NAMESPACE</code>: synchronizes the image tags in a namespace that meet the synchronization rule.</li>
             * <li><code>REPO</code>: synchronizes the image tags in an image repository that meet the synchronization rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NAMESPACE</p>
             */
            public Builder syncScope(String syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            /**
             * <p>The policy that is applied to trigger the synchronization rule. Valid values:</p>
             * <ul>
             * <li><code>INITIATIVE</code>: The synchronization rule is positively triggered.</li>
             * <li><code>PASSIVE</code>: The synchronization rule is passively triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASSIVE</p>
             */
            public Builder syncTrigger(String syncTrigger) {
                this.syncTrigger = syncTrigger;
                return this;
            }

            /**
             * <p>The regular expression that is used to filter image tags.</p>
             * 
             * <strong>example:</strong>
             * <p>.*</p>
             */
            public Builder tagFilter(String tagFilter) {
                this.tagFilter = tagFilter;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-k77rd2eo9ztt****</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The name of the namespace in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder targetNamespaceName(String targetNamespaceName) {
                this.targetNamespaceName = targetNamespaceName;
                return this;
            }

            /**
             * <p>The region ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder targetRegionId(String targetRegionId) {
                this.targetRegionId = targetRegionId;
                return this;
            }

            /**
             * <p>The name of the repository in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-repo-target</p>
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
