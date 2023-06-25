// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerRepositoryMirrorSyncRequest} extends {@link RequestModel}
 *
 * <p>TriggerRepositoryMirrorSyncRequest</p>
 */
public class TriggerRepositoryMirrorSyncRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true, minimum = 1)
    private Long repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("account")
    private String account;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("token")
    private String token;

    private TriggerRepositoryMirrorSyncRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.account = builder.account;
        this.organizationId = builder.organizationId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerRepositoryMirrorSyncRequest create() {
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
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<TriggerRepositoryMirrorSyncRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String account; 
        private String organizationId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(TriggerRepositoryMirrorSyncRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.account = request.account;
            this.organizationId = request.organizationId;
            this.token = request.token;
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
         * account.
         */
        public Builder account(String account) {
            this.putQueryParameter("account", account);
            this.account = account;
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
         * token.
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public TriggerRepositoryMirrorSyncRequest build() {
            return new TriggerRepositoryMirrorSyncRequest(this);
        } 

    } 

}
