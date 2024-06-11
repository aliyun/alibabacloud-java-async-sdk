// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The policy that specifies the trusted entity to assume the RAM role.
         */
        public Builder newAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
            this.putQueryParameter("NewAssumeRolePolicyDocument", newAssumeRolePolicyDocument);
            this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
            return this;
        }

        /**
         * The new description of the RAM role.
         * <p>
         * 
         * The value must be 1 to 1,024 characters in length.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * The maximum session duration of the RAM role.
         * <p>
         * 
         * Valid values: 3600 to 43200. Unit: seconds.Default value: 3600.
         * 
         * If you do not specify this parameter, the default value is used.
         */
        public Builder newMaxSessionDuration(Long newMaxSessionDuration) {
            this.putQueryParameter("NewMaxSessionDuration", newMaxSessionDuration);
            this.newMaxSessionDuration = newMaxSessionDuration;
            return this;
        }

        /**
         * The name of the RAM role.
         * <p>
         * 
         * The name must be 1 to 64 characters in length and can contain letters, digits, periods (.),and hyphens (-).
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
