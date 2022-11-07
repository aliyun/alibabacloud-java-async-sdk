// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProtectedBranchRequest} extends {@link RequestModel}
 *
 * <p>DeleteProtectedBranchRequest</p>
 */
public class DeleteProtectedBranchRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("protectedBranchId")
    @Validation(required = true)
    private Long protectedBranchId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private DeleteProtectedBranchRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.protectedBranchId = builder.protectedBranchId;
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProtectedBranchRequest create() {
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
     * @return protectedBranchId
     */
    public Long getProtectedBranchId() {
        return this.protectedBranchId;
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

    public static final class Builder extends Request.Builder<DeleteProtectedBranchRequest, Builder> {
        private Long repositoryId; 
        private Long protectedBranchId; 
        private String accessToken; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProtectedBranchRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.protectedBranchId = request.protectedBranchId;
            this.accessToken = request.accessToken;
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
         * protectedBranchId.
         */
        public Builder protectedBranchId(Long protectedBranchId) {
            this.putPathParameter("protectedBranchId", protectedBranchId);
            this.protectedBranchId = protectedBranchId;
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
         * A short description of struct
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DeleteProtectedBranchRequest build() {
            return new DeleteProtectedBranchRequest(this);
        } 

    } 

}
