// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersWithPermissionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersWithPermissionsRequest</p>
 */
public class DescribeUsersWithPermissionsRequest extends Request {
    @Body
    @NameInMap("UserType")
    @Validation(required = true)
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
         * UserType.
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
