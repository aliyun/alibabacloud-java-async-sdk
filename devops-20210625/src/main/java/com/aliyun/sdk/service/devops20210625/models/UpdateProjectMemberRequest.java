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
 * {@link UpdateProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectMemberRequest</p>
 */
public class UpdateProjectMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userType;

    private UpdateProjectMemberRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.projectId = builder.projectId;
        this.roleIdentifier = builder.roleIdentifier;
        this.targetIdentifier = builder.targetIdentifier;
        this.targetType = builder.targetType;
        this.userIdentifier = builder.userIdentifier;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectMemberRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return roleIdentifier
     */
    public String getRoleIdentifier() {
        return this.roleIdentifier;
    }

    /**
     * @return targetIdentifier
     */
    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return userIdentifier
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<UpdateProjectMemberRequest, Builder> {
        private String organizationId; 
        private String projectId; 
        private String roleIdentifier; 
        private String targetIdentifier; 
        private String targetType; 
        private String userIdentifier; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectMemberRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.projectId = request.projectId;
            this.roleIdentifier = request.roleIdentifier;
            this.targetIdentifier = request.targetIdentifier;
            this.targetType = request.targetType;
            this.userIdentifier = request.userIdentifier;
            this.userType = request.userType;
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
         * <p>5e70xxxxxxcd000xxxxe96</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project.admin</p>
         */
        public Builder roleIdentifier(String roleIdentifier) {
            this.putBodyParameter("roleIdentifier", roleIdentifier);
            this.roleIdentifier = roleIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5e70xxxxxxcd000xxxxe96</p>
         */
        public Builder targetIdentifier(String targetIdentifier) {
            this.putBodyParameter("targetIdentifier", targetIdentifier);
            this.targetIdentifier = targetIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Space</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        public Builder userIdentifier(String userIdentifier) {
            this.putBodyParameter("userIdentifier", userIdentifier);
            this.userIdentifier = userIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder userType(String userType) {
            this.putBodyParameter("userType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public UpdateProjectMemberRequest build() {
            return new UpdateProjectMemberRequest(this);
        } 

    } 

}
