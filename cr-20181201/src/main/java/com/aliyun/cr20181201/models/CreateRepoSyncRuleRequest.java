// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoSyncRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoSyncRuleRequest</p>
 */
public class CreateRepoSyncRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("TargetRepoName")
    private String targetRepoName;

    @Query
    @NameInMap("TargetNamespaceName")
    private String targetNamespaceName;

    @Query
    @NameInMap("TagFilter")
    private String tagFilter;

    @Query
    @NameInMap("SyncScope")
    private String syncScope;

    @Query
    @NameInMap("SyncRuleName")
    private String syncRuleName;

    @Query
    @NameInMap("TargetInstanceId")
    private String targetInstanceId;

    @Query
    @NameInMap("TargetRegionId")
    private String targetRegionId;

    @Query
    @NameInMap("SyncTrigger")
    private String syncTrigger;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;


    private CreateRepoSyncRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.targetRepoName = builder.targetRepoName;
        this.targetNamespaceName = builder.targetNamespaceName;
        this.tagFilter = builder.tagFilter;
        this.syncScope = builder.syncScope;
        this.syncRuleName = builder.syncRuleName;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetRegionId = builder.targetRegionId;
        this.syncTrigger = builder.syncTrigger;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncRuleRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return targetRepoName
     */
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    /**
     * @return targetNamespaceName
     */
    public String getTargetNamespaceName() {
        return this.targetNamespaceName;
    }

    /**
     * @return tagFilter
     */
    public String getTagFilter() {
        return this.tagFilter;
    }

    /**
     * @return syncScope
     */
    public String getSyncScope() {
        return this.syncScope;
    }

    /**
     * @return syncRuleName
     */
    public String getSyncRuleName() {
        return this.syncRuleName;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetRegionId
     */
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    /**
     * @return syncTrigger
     */
    public String getSyncTrigger() {
        return this.syncTrigger;
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

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String repoName; 
        private String targetRepoName; 
        private String targetNamespaceName; 
        private String tagFilter; 
        private String syncScope; 
        private String syncRuleName; 
        private String targetInstanceId; 
        private String targetRegionId; 
        private String syncTrigger; 
        private String instanceId; 
        private String namespaceName; 

        /**
         * <p>The region ID of the source repository.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>SOURCE vault name</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The name of the destination image repository.</p>
         */
        public Builder targetRepoName(String targetRepoName) {
            this.putQueryParameter("TargetRepoName", targetRepoName);
            this.targetRepoName = targetRepoName;
            return this;
        }

        /**
         * <p>Destination repository namespace</p>
         */
        public Builder targetNamespaceName(String targetNamespaceName) {
            this.putQueryParameter("TargetNamespaceName", targetNamespaceName);
            this.targetNamespaceName = targetNamespaceName;
            return this;
        }

        /**
         * <p>Tag filtering rules</p>
         */
        public Builder tagFilter(String tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        /**
         * <p>Synchronization type: REPO / NAMESPACE</p>
         */
        public Builder syncScope(String syncScope) {
            this.putQueryParameter("SyncScope", syncScope);
            this.syncScope = syncScope;
            return this;
        }

        /**
         * <p>Synchronization rule name</p>
         */
        public Builder syncRuleName(String syncRuleName) {
            this.putQueryParameter("SyncRuleName", syncRuleName);
            this.syncRuleName = syncRuleName;
            return this;
        }

        /**
         * <p>The ID of the destination vault instance.</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the destination repository.</p>
         */
        public Builder targetRegionId(String targetRegionId) {
            this.putQueryParameter("TargetRegionId", targetRegionId);
            this.targetRegionId = targetRegionId;
            return this;
        }

        /**
         * <p>Trigger synchronization, INITIATIVE / PASSIVE</p>
         */
        public Builder syncTrigger(String syncTrigger) {
            this.putQueryParameter("SyncTrigger", syncTrigger);
            this.syncTrigger = syncTrigger;
            return this;
        }

        /**
         * <p>SOURCE warehouse where instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Source repository namespace</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        public CreateRepoSyncRuleRequest build() {
            return new CreateRepoSyncRuleRequest(this);
        } 

    } 

}
