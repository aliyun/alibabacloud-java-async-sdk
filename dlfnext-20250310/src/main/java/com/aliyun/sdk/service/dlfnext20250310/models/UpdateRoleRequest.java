// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rolePrincipal")
    private String rolePrincipal;

    private UpdateRoleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.rolePrincipal = builder.rolePrincipal;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return rolePrincipal
     */
    public String getRolePrincipal() {
        return this.rolePrincipal;
    }

    public static final class Builder extends Request.Builder<UpdateRoleRequest, Builder> {
        private String description; 
        private String displayName; 
        private String rolePrincipal; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoleRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.rolePrincipal = request.rolePrincipal;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * rolePrincipal.
         */
        public Builder rolePrincipal(String rolePrincipal) {
            this.putBodyParameter("rolePrincipal", rolePrincipal);
            this.rolePrincipal = rolePrincipal;
            return this;
        }

        @Override
        public UpdateRoleRequest build() {
            return new UpdateRoleRequest(this);
        } 

    } 

}
