// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectLabelRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectLabelRequest</p>
 */
public class UpdateProjectLabelRequest extends Request {
    @Path
    @NameInMap("labelId")
    @Validation(required = true)
    private String labelId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("color")
    private String color;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("repositoryIdentity")
    @Validation(required = true)
    private String repositoryIdentity;

    private UpdateProjectLabelRequest(Builder builder) {
        super(builder);
        this.labelId = builder.labelId;
        this.accessToken = builder.accessToken;
        this.color = builder.color;
        this.description = builder.description;
        this.name = builder.name;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return color
     */
    public String getColor() {
        return this.color;
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static final class Builder extends Request.Builder<UpdateProjectLabelRequest, Builder> {
        private String labelId; 
        private String accessToken; 
        private String color; 
        private String description; 
        private String name; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectLabelRequest request) {
            super(request);
            this.labelId = request.labelId;
            this.accessToken = request.accessToken;
            this.color = request.color;
            this.description = request.description;
            this.name = request.name;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
        } 

        /**
         * labelId.
         */
        public Builder labelId(String labelId) {
            this.putPathParameter("labelId", labelId);
            this.labelId = labelId;
            return this;
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
         * color.
         */
        public Builder color(String color) {
            this.putBodyParameter("color", color);
            this.color = color;
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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * repositoryIdentity.
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        @Override
        public UpdateProjectLabelRequest build() {
            return new UpdateProjectLabelRequest(this);
        } 

    } 

}
