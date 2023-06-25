// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepositoryMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteRepositoryMemberRequest</p>
 */
public class DeleteRepositoryMemberRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("aliyunPk")
    @Validation(required = true)
    private String aliyunPk;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("memberType")
    private String memberType;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private DeleteRepositoryMemberRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.aliyunPk = builder.aliyunPk;
        this.accessToken = builder.accessToken;
        this.memberType = builder.memberType;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepositoryMemberRequest create() {
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
     * @return aliyunPk
     */
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DeleteRepositoryMemberRequest, Builder> {
        private Long repositoryId; 
        private String aliyunPk; 
        private String accessToken; 
        private String memberType; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepositoryMemberRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.aliyunPk = request.aliyunPk;
            this.accessToken = request.accessToken;
            this.memberType = request.memberType;
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
         * aliyunPk.
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putPathParameter("aliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
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
         * memberType.
         */
        public Builder memberType(String memberType) {
            this.putBodyParameter("memberType", memberType);
            this.memberType = memberType;
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
        public DeleteRepositoryMemberRequest build() {
            return new DeleteRepositoryMemberRequest(this);
        } 

    } 

}
