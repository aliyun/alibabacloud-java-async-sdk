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
 * {@link DeleteRepositoryMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteRepositoryMemberRequest</p>
 */
public class DeleteRepositoryMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("aliyunPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliyunPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memberType")
    private String memberType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2080398</p>
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1789095186553536</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>632bbfdf419338aaa2b1360a</p>
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
