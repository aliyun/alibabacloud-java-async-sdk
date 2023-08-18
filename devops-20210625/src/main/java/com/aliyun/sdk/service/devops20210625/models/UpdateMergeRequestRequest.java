// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMergeRequestRequest} extends {@link RequestModel}
 *
 * <p>UpdateMergeRequestRequest</p>
 */
public class UpdateMergeRequestRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("localId")
    @Validation(required = true)
    private Long localId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("title")
    private String title;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private UpdateMergeRequestRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.localId = builder.localId;
        this.accessToken = builder.accessToken;
        this.description = builder.description;
        this.title = builder.title;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMergeRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpdateMergeRequestRequest, Builder> {
        private Long repositoryId; 
        private Long localId; 
        private String accessToken; 
        private String description; 
        private String title; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMergeRequestRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.localId = request.localId;
            this.accessToken = request.accessToken;
            this.description = request.description;
            this.title = request.title;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * localId.
         */
        public Builder localId(Long localId) {
            this.putPathParameter("localId", localId);
            this.localId = localId;
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
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
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
        public UpdateMergeRequestRequest build() {
            return new UpdateMergeRequestRequest(this);
        } 

    } 

}
