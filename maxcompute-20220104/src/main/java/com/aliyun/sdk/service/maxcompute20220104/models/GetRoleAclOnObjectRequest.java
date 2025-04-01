// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetRoleAclOnObjectRequest} extends {@link RequestModel}
 *
 * <p>GetRoleAclOnObjectRequest</p>
 */
public class GetRoleAclOnObjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>roleA</p>
         */
        public Builder roleName(String roleName) {
            this.putPathParameter("roleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The name of the object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tableA</p>
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("objectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * <p>The type of the object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
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
