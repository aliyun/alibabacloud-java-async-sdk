// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillGroupRequest</p>
 */
public class CreateSkillGroupRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MediaType")
    private String mediaType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateSkillGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.mediaType = builder.mediaType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateSkillGroupRequest, Builder> {
        private String description; 
        private String displayName; 
        private String instanceId; 
        private String mediaType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillGroupRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.mediaType = request.mediaType;
            this.name = request.name;
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
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateSkillGroupRequest build() {
            return new CreateSkillGroupRequest(this);
        } 

    } 

}
