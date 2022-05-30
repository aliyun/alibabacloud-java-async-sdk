// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceMemberRequest</p>
 */
public class CreateResourceMemberRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("resourceType")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private String resourceType;

    @Path
    @NameInMap("resourceId")
    @Validation(required = true)
    private Long resourceId;

    @Body
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @Body
    @NameInMap("roleName")
    @Validation(required = true)
    private String roleName;

    private CreateResourceMemberRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.resourceType = builder.resourceType;
        this.resourceId = builder.resourceId;
        this.accountId = builder.accountId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<CreateResourceMemberRequest, Builder> {
        private String organizationId; 
        private String resourceType; 
        private Long resourceId; 
        private String accountId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceMemberRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.resourceType = request.resourceType;
            this.resourceId = request.resourceId;
            this.accountId = request.accountId;
            this.roleName = request.roleName;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如 https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 资源id
         */
        public Builder resourceType(String resourceType) {
            this.putPathParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 资源类型 流水线 pipeline 部署组 deployGroup
         */
        public Builder resourceId(Long resourceId) {
            this.putPathParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 用户id
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * 角色部署组 deployGroup   user  成员，使用权限   admin 管理员，使用编辑权限 流水线 pipeline   admin 查看、运行、编辑权限   member  运行权限   viewer 查看权限
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("roleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public CreateResourceMemberRequest build() {
            return new CreateResourceMemberRequest(this);
        } 

    } 

}
