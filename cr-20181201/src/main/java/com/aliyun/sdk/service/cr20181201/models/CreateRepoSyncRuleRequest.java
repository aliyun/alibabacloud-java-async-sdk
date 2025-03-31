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
 * {@link CreateRepoSyncRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSyncRuleRequest</p>
 */
public class CreateRepoSyncRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNameFilter")
    private String repoNameFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String syncRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String syncScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncTrigger")
    private String syncTrigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagFilter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetNamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetNamespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetRepoName")
    private String targetRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private String targetUserId;

    private CreateRepoSyncRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.repoName = builder.repoName;
        this.repoNameFilter = builder.repoNameFilter;
        this.syncRuleName = builder.syncRuleName;
        this.syncScope = builder.syncScope;
        this.syncTrigger = builder.syncTrigger;
        this.tagFilter = builder.tagFilter;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetNamespaceName = builder.targetNamespaceName;
        this.targetRegionId = builder.targetRegionId;
        this.targetRepoName = builder.targetRepoName;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNameFilter
     */
    public String getRepoNameFilter() {
        return this.repoNameFilter;
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

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<CreateRepoSyncRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String namespaceName; 
        private String repoName; 
        private String repoNameFilter; 
        private String syncRuleName; 
        private String syncScope; 
        private String syncTrigger; 
        private String tagFilter; 
        private String targetInstanceId; 
        private String targetNamespaceName; 
        private String targetRegionId; 
        private String targetRepoName; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoSyncRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
            this.repoName = request.repoName;
            this.repoNameFilter = request.repoNameFilter;
            this.syncRuleName = request.syncRuleName;
            this.syncScope = request.syncScope;
            this.syncTrigger = request.syncTrigger;
            this.tagFilter = request.tagFilter;
            this.targetInstanceId = request.targetInstanceId;
            this.targetNamespaceName = request.targetNamespaceName;
            this.targetRegionId = request.targetRegionId;
            this.targetRepoName = request.targetRepoName;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-hpdfkc6utbaq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The rule that is used to filter repositories.</p>
         * <blockquote>
         * <p> This parameter is valid only when SyncScope is set to <code>NAMESPACE</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        public Builder repoNameFilter(String repoNameFilter) {
            this.putQueryParameter("RepoNameFilter", repoNameFilter);
            this.repoNameFilter = repoNameFilter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        public Builder syncRuleName(String syncRuleName) {
            this.putQueryParameter("SyncRuleName", syncRuleName);
            this.syncRuleName = syncRuleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPO</p>
         */
        public Builder syncScope(String syncScope) {
            this.putQueryParameter("SyncScope", syncScope);
            this.syncScope = syncScope;
            return this;
        }

        /**
         * SyncTrigger.
         */
        public Builder syncTrigger(String syncTrigger) {
            this.putQueryParameter("SyncTrigger", syncTrigger);
            this.syncTrigger = syncTrigger;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        public Builder tagFilter(String tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-ibxs3piklys3****</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder targetNamespaceName(String targetNamespaceName) {
            this.putQueryParameter("TargetNamespaceName", targetNamespaceName);
            this.targetNamespaceName = targetNamespaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder targetRegionId(String targetRegionId) {
            this.putQueryParameter("TargetRegionId", targetRegionId);
            this.targetRegionId = targetRegionId;
            return this;
        }

        /**
         * TargetRepoName.
         */
        public Builder targetRepoName(String targetRepoName) {
            this.putQueryParameter("TargetRepoName", targetRepoName);
            this.targetRepoName = targetRepoName;
            return this;
        }

        /**
         * TargetUserId.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public CreateRepoSyncRuleRequest build() {
            return new CreateRepoSyncRuleRequest(this);
        } 

    } 

}
