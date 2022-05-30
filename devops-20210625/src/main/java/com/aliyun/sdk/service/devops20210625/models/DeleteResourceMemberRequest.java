// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceMemberRequest</p>
 */
public class DeleteResourceMemberRequest extends Request {
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

    @Path
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    private DeleteResourceMemberRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.resourceType = builder.resourceType;
        this.resourceId = builder.resourceId;
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceMemberRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteResourceMemberRequest, Builder> {
        private String organizationId; 
        private String resourceType; 
        private Long resourceId; 
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceMemberRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.resourceType = request.resourceType;
            this.resourceId = request.resourceId;
            this.accountId = request.accountId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
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
         * 资源类型流水线 pipeline 部署组 deployGroup
         */
        public Builder resourceId(Long resourceId) {
            this.putPathParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public DeleteResourceMemberRequest build() {
            return new DeleteResourceMemberRequest(this);
        } 

    } 

}
