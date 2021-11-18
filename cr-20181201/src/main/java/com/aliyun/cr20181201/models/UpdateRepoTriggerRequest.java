// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoTriggerRequest</p>
 */
public class UpdateRepoTriggerRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TriggerId")
    private String triggerId;

    @Query
    @NameInMap("TriggerUrl")
    private String triggerUrl;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("TriggerType")
    private String triggerType;

    @Query
    @NameInMap("TriggerTag")
    private String triggerTag;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("TriggerName")
    private String triggerName;


    private UpdateRepoTriggerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.triggerId = builder.triggerId;
        this.triggerUrl = builder.triggerUrl;
        this.instanceId = builder.instanceId;
        this.triggerType = builder.triggerType;
        this.triggerTag = builder.triggerTag;
        this.repoId = builder.repoId;
        this.triggerName = builder.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoTriggerRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    /**
     * @return triggerUrl
     */
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return triggerTag
     */
    public String getTriggerTag() {
        return this.triggerTag;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String triggerId; 
        private String triggerUrl; 
        private String instanceId; 
        private String triggerType; 
        private String triggerTag; 
        private String repoId; 
        private String triggerName; 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Trigger ID</p>
         */
        public Builder triggerId(String triggerId) {
            this.putQueryParameter("TriggerId", triggerId);
            this.triggerId = triggerId;
            return this;
        }

        /**
         * <p>Trigger address</p>
         */
        public Builder triggerUrl(String triggerUrl) {
            this.putQueryParameter("TriggerUrl", triggerUrl);
            this.triggerUrl = triggerUrl;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The trigger type. Valid values:

-"ALL": trigger all

-"Tag_listtag": Trigger

-"Tag_reg_exp ": expression trigger</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * <p>The version of the image that triggers the trigger.</p>
         */
        public Builder triggerTag(String triggerTag) {
            this.putQueryParameter("TriggerTag", triggerTag);
            this.triggerTag = triggerTag;
            return this;
        }

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Trigger name</p>
         */
        public Builder triggerName(String triggerName) {
            this.putQueryParameter("TriggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        public UpdateRepoTriggerRequest build() {
            return new UpdateRepoTriggerRequest(this);
        } 

    } 

}
