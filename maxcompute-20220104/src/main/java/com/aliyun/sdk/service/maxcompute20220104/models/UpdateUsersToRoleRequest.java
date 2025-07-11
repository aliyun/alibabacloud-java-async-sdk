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
 * {@link UpdateUsersToRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateUsersToRoleRequest</p>
 */
public class UpdateUsersToRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("add")
    private java.util.List<String> add;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remove")
    private java.util.List<String> remove;

    private UpdateUsersToRoleRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.roleName = builder.roleName;
        this.add = builder.add;
        this.remove = builder.remove;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUsersToRoleRequest create() {
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
     * @return add
     */
    public java.util.List<String> getAdd() {
        return this.add;
    }

    /**
     * @return remove
     */
    public java.util.List<String> getRemove() {
        return this.remove;
    }

    public static final class Builder extends Request.Builder<UpdateUsersToRoleRequest, Builder> {
        private String projectName; 
        private String roleName; 
        private java.util.List<String> add; 
        private java.util.List<String> remove; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUsersToRoleRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.roleName = request.roleName;
            this.add = request.add;
            this.remove = request.remove;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project_a</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The role name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder roleName(String roleName) {
            this.putPathParameter("roleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The accounts.</p>
         */
        public Builder add(java.util.List<String> add) {
            this.putBodyParameter("add", add);
            this.add = add;
            return this;
        }

        /**
         * <p>The accounts.</p>
         */
        public Builder remove(java.util.List<String> remove) {
            this.putBodyParameter("remove", remove);
            this.remove = remove;
            return this;
        }

        @Override
        public UpdateUsersToRoleRequest build() {
            return new UpdateUsersToRoleRequest(this);
        } 

    } 

}
