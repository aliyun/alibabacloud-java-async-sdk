// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferRepositoryRequest} extends {@link RequestModel}
 *
 * <p>TransferRepositoryRequest</p>
 */
public class TransferRepositoryRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("groupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("repositoryId")
    @Validation(required = true)
    private String repositoryId;

    private TransferRepositoryRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.groupId = builder.groupId;
        this.organizationId = builder.organizationId;
        this.repositoryId = builder.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferRepositoryRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    public static final class Builder extends Request.Builder<TransferRepositoryRequest, Builder> {
        private String accessToken; 
        private String groupId; 
        private String organizationId; 
        private String repositoryId; 

        private Builder() {
            super();
        } 

        private Builder(TransferRepositoryRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.groupId = request.groupId;
            this.organizationId = request.organizationId;
            this.repositoryId = request.repositoryId;
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
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
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
         * repositoryId.
         */
        public Builder repositoryId(String repositoryId) {
            this.putQueryParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        @Override
        public TransferRepositoryRequest build() {
            return new TransferRepositoryRequest(this);
        } 

    } 

}
