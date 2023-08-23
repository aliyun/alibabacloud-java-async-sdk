// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRolePolicyRequest} extends {@link RequestModel}
 *
 * <p>GetRolePolicyRequest</p>
 */
public class GetRolePolicyRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Path
    @NameInMap("roleName")
    @Validation(required = true)
    private String roleName;

    private GetRolePolicyRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRolePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetRolePolicyRequest, Builder> {
        private String projectName; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(GetRolePolicyRequest request) {
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
        public GetRolePolicyRequest build() {
            return new GetRolePolicyRequest(this);
        } 

    } 

}
