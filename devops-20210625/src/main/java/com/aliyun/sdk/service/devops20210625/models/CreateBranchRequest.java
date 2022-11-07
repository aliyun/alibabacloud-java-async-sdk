// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBranchRequest} extends {@link RequestModel}
 *
 * <p>CreateBranchRequest</p>
 */
public class CreateBranchRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private String repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("branchName")
    @Validation(required = true)
    private String branchName;

    @Body
    @NameInMap("ref")
    @Validation(required = true)
    private String ref;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private CreateBranchRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.branchName = builder.branchName;
        this.ref = builder.ref;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBranchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return ref
     */
    public String getRef() {
        return this.ref;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateBranchRequest, Builder> {
        private String repositoryId; 
        private String accessToken; 
        private String branchName; 
        private String ref; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBranchRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.branchName = request.branchName;
            this.ref = request.ref;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(String repositoryId) {
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
         * branchName.
         */
        public Builder branchName(String branchName) {
            this.putBodyParameter("branchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * ref.
         */
        public Builder ref(String ref) {
            this.putBodyParameter("ref", ref);
            this.ref = ref;
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
        public CreateBranchRequest build() {
            return new CreateBranchRequest(this);
        } 

    } 

}
