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
 * {@link UpdateResourceMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceMemberRequest</p>
 */
public class UpdateResourceMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private String resourceType;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long resourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline</p>
         */
        public Builder resourceType(String resourceType) {
            this.putPathParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
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
