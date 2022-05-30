// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceMembersRequest} extends {@link RequestModel}
 *
 * <p>ListResourceMembersRequest</p>
 */
public class ListResourceMembersRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("resourceType")
    @Validation(required = true)
    private String resourceType;

    @Path
    @NameInMap("resourceId")
    private Long resourceId;

    private ListResourceMembersRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.resourceType = builder.resourceType;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceMembersRequest create() {
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

    public static final class Builder extends Request.Builder<ListResourceMembersRequest, Builder> {
        private String organizationId; 
        private String resourceType; 
        private Long resourceId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceMembersRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.resourceType = request.resourceType;
            this.resourceId = request.resourceId;
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
         * 资源类型流水线 pipeline 部署组 deployGroup
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

        @Override
        public ListResourceMembersRequest build() {
            return new ListResourceMembersRequest(this);
        } 

    } 

}
