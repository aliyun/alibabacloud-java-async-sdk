// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillGroupRequest</p>
 */
public class UpdateSkillGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true, minimum = 1)
    private Long skillGroupId;

    @Query
    @NameInMap("SkillGroupName")
    private String skillGroupName;

    private UpdateSkillGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.skillGroupName = builder.skillGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return skillGroupId
     */
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return skillGroupName
     */
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateSkillGroupRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String displayName; 
        private String instanceId; 
        private Long skillGroupId; 
        private String skillGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
            this.skillGroupName = request.skillGroupName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
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
         * SkillGroupId.
         */
        public Builder skillGroupId(Long skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * SkillGroupName.
         */
        public Builder skillGroupName(String skillGroupName) {
            this.putQueryParameter("SkillGroupName", skillGroupName);
            this.skillGroupName = skillGroupName;
            return this;
        }

        @Override
        public UpdateSkillGroupRequest build() {
            return new UpdateSkillGroupRequest(this);
        } 

    } 

}
