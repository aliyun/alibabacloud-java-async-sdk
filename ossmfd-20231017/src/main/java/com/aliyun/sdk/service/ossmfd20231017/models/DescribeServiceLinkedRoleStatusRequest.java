// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017.models;

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
 * {@link DescribeServiceLinkedRoleStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceLinkedRoleStatusRequest</p>
 */
public class DescribeServiceLinkedRoleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLinkedRole")
    private String serviceLinkedRole;

    private DescribeServiceLinkedRoleStatusRequest(Builder builder) {
        super(builder);
        this.serviceLinkedRole = builder.serviceLinkedRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceLinkedRole
     */
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

    public static final class Builder extends Request.Builder<DescribeServiceLinkedRoleStatusRequest, Builder> {
        private String serviceLinkedRole; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceLinkedRoleStatusRequest request) {
            super(request);
            this.serviceLinkedRole = request.serviceLinkedRole;
        } 

        /**
         * ServiceLinkedRole.
         */
        public Builder serviceLinkedRole(String serviceLinkedRole) {
            this.putQueryParameter("ServiceLinkedRole", serviceLinkedRole);
            this.serviceLinkedRole = serviceLinkedRole;
            return this;
        }

        @Override
        public DescribeServiceLinkedRoleStatusRequest build() {
            return new DescribeServiceLinkedRoleStatusRequest(this);
        } 

    } 

}
