// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoleRequest</p>
 */
public class UpdateRoleRequest extends Request {
    @Query
    @NameInMap("NewAssumeRolePolicyDocument")
    private String newAssumeRolePolicyDocument;

    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("NewMaxSessionDuration")
    private Long newMaxSessionDuration;

    @Query
    @NameInMap("RoleName")
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
         * NewAssumeRolePolicyDocument.
         */
        public Builder newAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
            this.putQueryParameter("NewAssumeRolePolicyDocument", newAssumeRolePolicyDocument);
            this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
            return this;
        }

        /**
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * NewMaxSessionDuration.
         */
        public Builder newMaxSessionDuration(Long newMaxSessionDuration) {
            this.putQueryParameter("NewMaxSessionDuration", newMaxSessionDuration);
            this.newMaxSessionDuration = newMaxSessionDuration;
            return this;
        }

        /**
         * RoleName.
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
