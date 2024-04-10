// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTriggerRequest</p>
 */
public class CreateRepoTriggerRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("TriggerName")
    @Validation(required = true)
    private String triggerName;

    @Query
    @NameInMap("TriggerTag")
    private String triggerTag;

    @Query
    @NameInMap("TriggerType")
    @Validation(required = true)
    private String triggerType;

    @Query
    @NameInMap("TriggerUrl")
    @Validation(required = true)
    private String triggerUrl;

    private CreateRepoTriggerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.triggerName = builder.triggerName;
        this.triggerTag = builder.triggerTag;
        this.triggerType = builder.triggerType;
        this.triggerUrl = builder.triggerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTriggerRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRepoTriggerRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String repoId; 
        private String triggerName; 
        private String triggerTag; 
        private String triggerType; 
        private String triggerUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTriggerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.triggerName = request.triggerName;
            this.triggerTag = request.triggerTag;
            this.triggerType = request.triggerType;
            this.triggerUrl = request.triggerUrl;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the image repository.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The name of the trigger.
         */
        public Builder triggerName(String triggerName) {
            this.putQueryParameter("TriggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * The image tag based on which the trigger is set.
         * <p>
         * 
         * > 
         * 
         * *   If `TriggerType` is set to `ALL`, `TriggerTag` can be set to a string or an array, for example, `*`.
         * 
         * *   If `TriggerType` is set to `TAG_LIST`, `TriggerTag` must be set to an array, for example, `[1]`.
         * *   If `TriggerType` is set to `TAG_REG_EXP`, `TriggerTag` must be set to a string, for example, `*`.
         */
        public Builder triggerTag(String triggerTag) {
            this.putQueryParameter("TriggerTag", triggerTag);
            this.triggerTag = triggerTag;
            return this;
        }

        /**
         * The type of the trigger. Valid values:
         * <p>
         * 
         * *   `ALL`: a trigger that supports both tags and regular expressions.
         * *   `TAG_LIST`: a tag-based trigger.
         * *   `TAG_REG_EXP`: a regular expression-based trigger.
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * The URL of the trigger.
         */
        public Builder triggerUrl(String triggerUrl) {
            this.putQueryParameter("TriggerUrl", triggerUrl);
            this.triggerUrl = triggerUrl;
            return this;
        }

        @Override
        public CreateRepoTriggerRequest build() {
            return new CreateRepoTriggerRequest(this);
        } 

    } 

}
