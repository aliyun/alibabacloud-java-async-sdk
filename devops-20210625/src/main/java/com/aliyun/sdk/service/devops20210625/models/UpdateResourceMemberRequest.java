// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceMemberRequest</p>
 */
public class UpdateResourceMemberRequest extends Request {
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
    private String accountId;

    @Body
    @NameInMap("roleName")
    @Validation(required = true)
    private String roleName;

    private UpdateResourceMemberRequest(Builder builder) {
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

    public static UpdateResourceMemberRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateResourceMemberRequest, Builder> {
        private String organizationId; 
        private String resourceType; 
        private Long resourceId; 
        private String accountId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceMemberRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.resourceType = request.resourceType;
            this.resourceId = request.resourceId;
            this.accountId = request.accountId;
            this.roleName = request.roleName;
        } 

        /**
         * ???????????????????????????id???????????????????????????????????????????????????????????? https:// devops.aliyun.com/organization/???OrgId???
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder resourceType(String resourceType) {
            this.putPathParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ???????????? ????????? pipeline ????????? deployGroup
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

        /**
         * ??????????????? deployGroup   user  ?????????????????????   admin ??????????????????????????????   owner ???????????????????????? ????????? pipeline   owner ????????????????????????   admin ??????????????????????????????   member  ????????????   viewer ????????????
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("roleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public UpdateResourceMemberRequest build() {
            return new UpdateResourceMemberRequest(this);
        } 

    } 

}
