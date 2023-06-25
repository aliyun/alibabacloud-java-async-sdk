// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryTreeRequest} extends {@link RequestModel}
 *
 * <p>ListRepositoryTreeRequest</p>
 */
public class ListRepositoryTreeRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("path")
    private String path;

    @Query
    @NameInMap("refName")
    private String refName;

    @Query
    @NameInMap("type")
    private String type;

    private ListRepositoryTreeRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
        this.path = builder.path;
        this.refName = builder.refName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryTreeRequest create() {
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
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return refName
     */
    public String getRefName() {
        return this.refName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListRepositoryTreeRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String organizationId; 
        private String path; 
        private String refName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListRepositoryTreeRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
            this.path = request.path;
            this.refName = request.refName;
            this.type = request.type;
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
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
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
         * path.
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * refName.
         */
        public Builder refName(String refName) {
            this.putQueryParameter("refName", refName);
            this.refName = refName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListRepositoryTreeRequest build() {
            return new ListRepositoryTreeRequest(this);
        } 

    } 

}
