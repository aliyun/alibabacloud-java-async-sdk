// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectMemberRequest</p>
 */
public class UpdateProjectMemberRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("roleIdentifier")
    @Validation(required = true)
    private String roleIdentifier;

    @Body
    @NameInMap("targetIdentifier")
    @Validation(required = true)
    private String targetIdentifier;

    @Body
    @NameInMap("targetType")
    @Validation(required = true)
    private String targetType;

    @Body
    @NameInMap("userIdentifier")
    @Validation(required = true)
    private String userIdentifier;

    @Body
    @NameInMap("userType")
    @Validation(required = true)
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
         * 企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 项目id
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 角色id
         */
        public Builder roleIdentifier(String roleIdentifier) {
            this.putBodyParameter("roleIdentifier", roleIdentifier);
            this.roleIdentifier = roleIdentifier;
            return this;
        }

        /**
         * 资源id，也就是项目id
         */
        public Builder targetIdentifier(String targetIdentifier) {
            this.putBodyParameter("targetIdentifier", targetIdentifier);
            this.targetIdentifier = targetIdentifier;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * 用户id
         */
        public Builder userIdentifier(String userIdentifier) {
            this.putBodyParameter("userIdentifier", userIdentifier);
            this.userIdentifier = userIdentifier;
            return this;
        }

        /**
         * 用户类型
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
