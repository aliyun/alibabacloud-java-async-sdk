// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleAclRequest} extends {@link RequestModel}
 *
 * <p>GetRoleAclRequest</p>
 */
public class GetRoleAclRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Path
    @NameInMap("roleName")
    @Validation(required = true)
    private String roleName;

    private GetRoleAclRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<GetRoleAclRequest, Builder> {
        private String projectName; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(GetRoleAclRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.roleName = request.roleName;
        } 

        /**
         * The name of the MaxCompute project.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the role.
         */
        public Builder roleName(String roleName) {
            this.putPathParameter("roleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public GetRoleAclRequest build() {
            return new GetRoleAclRequest(this);
        } 

    } 

}
