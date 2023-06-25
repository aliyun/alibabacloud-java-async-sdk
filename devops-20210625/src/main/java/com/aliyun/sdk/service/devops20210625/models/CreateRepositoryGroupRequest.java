// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateRepositoryGroupRequest</p>
 */
public class CreateRepositoryGroupRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("avatarUrl")
    private String avatarUrl;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("parentId")
    @Validation(required = true)
    private Long parentId;

    @Body
    @NameInMap("path")
    @Validation(required = true)
    private String path;

    @Body
    @NameInMap("visibilityLevel")
    @Validation(required = true)
    private Integer visibilityLevel;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private CreateRepositoryGroupRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.avatarUrl = builder.avatarUrl;
        this.description = builder.description;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.path = builder.path;
        this.visibilityLevel = builder.visibilityLevel;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepositoryGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateRepositoryGroupRequest, Builder> {
        private String accessToken; 
        private String avatarUrl; 
        private String description; 
        private String name; 
        private Long parentId; 
        private String path; 
        private Integer visibilityLevel; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepositoryGroupRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.avatarUrl = request.avatarUrl;
            this.description = request.description;
            this.name = request.name;
            this.parentId = request.parentId;
            this.path = request.path;
            this.visibilityLevel = request.visibilityLevel;
            this.organizationId = request.organizationId;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * avatarUrl.
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putBodyParameter("avatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * visibilityLevel.
         */
        public Builder visibilityLevel(Integer visibilityLevel) {
            this.putBodyParameter("visibilityLevel", visibilityLevel);
            this.visibilityLevel = visibilityLevel;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public CreateRepositoryGroupRequest build() {
            return new CreateRepositoryGroupRequest(this);
        } 

    } 

}
