// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeUsersWithPermissionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersWithPermissionsRequest</p>
 */
public class DescribeUsersWithPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userType;

    private DescribeUsersWithPermissionsRequest(Builder builder) {
        super(builder);
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersWithPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<DescribeUsersWithPermissionsRequest, Builder> {
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsersWithPermissionsRequest request) {
            super(request);
            this.userType = request.userType;
        } 

        /**
         * <p>Specifies whether to query the IDs of all RAM users or RAM roles to which an RBAC role is assigned. Valid values:</p>
         * <ul>
         * <li><code>SubUser</code>: Query the IDs of all RAM users to which an RBAC role is assigned.</li>
         * <li><code>RamRole</code>: Query the IDs of all RAM roles to which an RBAC role is assigned.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public DescribeUsersWithPermissionsRequest build() {
            return new DescribeUsersWithPermissionsRequest(this);
        } 

    } 

}
