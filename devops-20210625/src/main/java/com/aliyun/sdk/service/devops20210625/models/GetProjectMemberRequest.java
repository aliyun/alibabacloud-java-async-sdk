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

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private GetProjectMemberRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.aliyunPk = builder.aliyunPk;
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<GetProjectMemberRequest, Builder> {
        private Long repositoryId; 
        private String aliyunPk; 
        private String accessToken; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectMemberRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.aliyunPk = request.aliyunPk;
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
        } 

        /**
         * 代码仓库Id
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * 用户阿里云PK
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putPathParameter("aliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
            return this;
        }

        /**
         * accessToken（选填），使用AK方式调用时无需填accessToken
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 企业ID
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetProjectMemberRequest build() {
            return new GetProjectMemberRequest(this);
        } 

    } 

}
