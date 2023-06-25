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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putPathParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * resourceId.
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
            this.putBodyParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * roleName.
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
