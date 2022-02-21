// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoTriggerRequest</p>
 */
public class UpdateRepoTriggerRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("TriggerId")
    @Validation(required = true)
    private String triggerId;

    @Query
    @NameInMap("TriggerName")
    private String triggerName;

    @Query
    @NameInMap("TriggerTag")
    private String triggerTag;

    @Query
    @NameInMap("TriggerType")
    private String triggerType;

    @Query
    @NameInMap("TriggerUrl")
    private String triggerUrl;

    private UpdateRepoTriggerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
        this.triggerId = builder.triggerId;
        this.triggerName = builder.triggerName;
        this.triggerTag = builder.triggerTag;
        this.triggerType = builder.triggerType;
        this.triggerUrl = builder.triggerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerTag
     */
    public String getTriggerTag() {
        return this.triggerTag;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return triggerUrl
     */
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

    public static final class Builder extends Request.Builder<UpdateRepoTriggerRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String repoId; 
        private String triggerId; 
        private String triggerName; 
        private String triggerTag; 
        private String triggerType; 
        private String triggerUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoTriggerRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
            this.triggerId = response.triggerId;
            this.triggerName = response.triggerName;
            this.triggerTag = response.triggerTag;
            this.triggerType = response.triggerType;
            this.triggerUrl = response.triggerUrl;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * TriggerId.
         */
        public Builder triggerId(String triggerId) {
            this.putQueryParameter("TriggerId", triggerId);
            this.triggerId = triggerId;
            return this;
        }

        /**
         * TriggerName.
         */
        public Builder triggerName(String triggerName) {
            this.putQueryParameter("TriggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * TriggerTag.
         */
        public Builder triggerTag(String triggerTag) {
            this.putQueryParameter("TriggerTag", triggerTag);
            this.triggerTag = triggerTag;
            return this;
        }

        /**
         * TriggerType.
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * TriggerUrl.
         */
        public Builder triggerUrl(String triggerUrl) {
            this.putQueryParameter("TriggerUrl", triggerUrl);
            this.triggerUrl = triggerUrl;
            return this;
        }

        @Override
        public UpdateRepoTriggerRequest build() {
            return new UpdateRepoTriggerRequest(this);
        } 

    } 

}
