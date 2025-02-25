// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link UpdateGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateGroupRequest</p>
 */
public class UpdateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pathWithNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pathWithNamespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibilityLevel")
    private Integer visibilityLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private UpdateGroupRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.avatarUrl = builder.avatarUrl;
        this.description = builder.description;
        this.name = builder.name;
        this.path = builder.path;
        this.pathWithNamespace = builder.pathWithNamespace;
        this.visibilityLevel = builder.visibilityLevel;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupRequest create() {
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return this.pathWithNamespace;
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

    public static final class Builder extends Request.Builder<UpdateGroupRequest, Builder> {
        private String accessToken; 
        private String avatarUrl; 
        private String description; 
        private String name; 
        private String path; 
        private String pathWithNamespace; 
        private Integer visibilityLevel; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.avatarUrl = request.avatarUrl;
            this.description = request.description;
            this.name = request.name;
            this.path = request.path;
            this.pathWithNamespace = request.pathWithNamespace;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>codeup_group</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>codeup_group</p>
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>org/group/subgroup/here</p>
         */
        public Builder pathWithNamespace(String pathWithNamespace) {
            this.putBodyParameter("pathWithNamespace", pathWithNamespace);
            this.pathWithNamespace = pathWithNamespace;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1e9903d8b3f1xxxxxf9286ef5</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpdateGroupRequest build() {
            return new UpdateGroupRequest(this);
        } 

    } 

}
