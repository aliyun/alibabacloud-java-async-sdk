// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link UpdateRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoleRequest</p>
 */
public class UpdateRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAssumeRolePolicyDocument")
    private String newAssumeRolePolicyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewMaxSessionDuration")
    private Long newMaxSessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    private UpdateRoleRequest(Builder builder) {
        super(builder);
        this.newAssumeRolePolicyDocument = builder.newAssumeRolePolicyDocument;
        this.newDescription = builder.newDescription;
        this.newMaxSessionDuration = builder.newMaxSessionDuration;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newAssumeRolePolicyDocument
     */
    public String getNewAssumeRolePolicyDocument() {
        return this.newAssumeRolePolicyDocument;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return newMaxSessionDuration
     */
    public Long getNewMaxSessionDuration() {
        return this.newMaxSessionDuration;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<UpdateRoleRequest, Builder> {
        private String newAssumeRolePolicyDocument; 
        private String newDescription; 
        private Long newMaxSessionDuration; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoleRequest request) {
            super(request);
            this.newAssumeRolePolicyDocument = request.newAssumeRolePolicyDocument;
            this.newDescription = request.newDescription;
            this.newMaxSessionDuration = request.newMaxSessionDuration;
            this.roleName = request.roleName;
        } 

        /**
         * <p>The document of the policy that specifies the trusted entity to assume the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Statement&quot;: [ { &quot;Action&quot;: &quot;sts:AssumeRole&quot;, &quot;Effect&quot;: &quot;Allow&quot;, &quot;Principal&quot;: { &quot;RAM&quot;: &quot;acs:ram::12345678901234****:root&quot; } } ], &quot;Version&quot;: &quot;1&quot; }</p>
         */
        public Builder newAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
            this.putQueryParameter("NewAssumeRolePolicyDocument", newAssumeRolePolicyDocument);
            this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
            return this;
        }

        /**
         * <p>The description of the RAM role.</p>
         * <p>The description must be 1 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS administrator</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The maximum session duration of the RAM role.</p>
         * <p>Unit: seconds. Valid values: 3600 to 43200. Default value: 3600.</p>
         * <p>If you do not specify this parameter, the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder newMaxSessionDuration(Long newMaxSessionDuration) {
            this.putQueryParameter("NewMaxSessionDuration", newMaxSessionDuration);
            this.newMaxSessionDuration = newMaxSessionDuration;
            return this;
        }

        /**
         * <p>The name of the RAM role.</p>
         * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.),and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECSAdmin</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public UpdateRoleRequest build() {
            return new UpdateRoleRequest(this);
        } 

    } 

}
