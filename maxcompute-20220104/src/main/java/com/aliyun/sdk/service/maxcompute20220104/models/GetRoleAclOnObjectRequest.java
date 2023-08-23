// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleAclOnObjectRequest} extends {@link RequestModel}
 *
 * <p>GetRoleAclOnObjectRequest</p>
 */
public class GetRoleAclOnObjectRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Path
    @NameInMap("roleName")
    @Validation(required = true)
    private String roleName;

    @Query
    @NameInMap("objectName")
    @Validation(required = true)
    private String objectName;

    @Query
    @NameInMap("objectType")
    @Validation(required = true)
    private String objectType;

    private GetRoleAclOnObjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.roleName = builder.roleName;
        this.objectName = builder.objectName;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleAclOnObjectRequest create() {
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

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder extends Request.Builder<GetRoleAclOnObjectRequest, Builder> {
        private String projectName; 
        private String roleName; 
        private String objectName; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(GetRoleAclOnObjectRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.roleName = request.roleName;
            this.objectName = request.objectName;
            this.objectType = request.objectType;
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

        /**
         * The name of the object.
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("objectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * The type of the object.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("objectType", objectType);
            this.objectType = objectType;
            return this;
        }

        @Override
        public GetRoleAclOnObjectRequest build() {
            return new GetRoleAclOnObjectRequest(this);
        } 

    } 

}
