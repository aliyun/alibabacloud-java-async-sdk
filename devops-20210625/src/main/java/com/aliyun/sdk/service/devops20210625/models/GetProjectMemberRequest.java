// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>GetProjectMemberRequest</p>
 */
public class GetProjectMemberRequest extends Request {
    @Query
    @NameInMap("AccessToken")
    private String accessToken;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("userAliyunPk")
    @Validation(required = true)
    private String userAliyunPk;

    private GetProjectMemberRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
        this.repositoryId = builder.repositoryId;
        this.userAliyunPk = builder.userAliyunPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectMemberRequest create() {
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return userAliyunPk
     */
    public String getUserAliyunPk() {
        return this.userAliyunPk;
    }

    public static final class Builder extends Request.Builder<GetProjectMemberRequest, Builder> {
        private String accessToken; 
        private String organizationId; 
        private Long repositoryId; 
        private String userAliyunPk; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectMemberRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
            this.repositoryId = request.repositoryId;
            this.userAliyunPk = request.userAliyunPk;
        } 

        /**
         * accessToken（选填），使用AK方式调用时无需填accessToken
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 企业ID
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 代码仓库Id
         */
        public Builder repositoryId(Long repositoryId) {
            this.putQueryParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * 用户阿里云PK
         */
        public Builder userAliyunPk(String userAliyunPk) {
            this.putQueryParameter("userAliyunPk", userAliyunPk);
            this.userAliyunPk = userAliyunPk;
            return this;
        }

        @Override
        public GetProjectMemberRequest build() {
            return new GetProjectMemberRequest(this);
        } 

    } 

}
