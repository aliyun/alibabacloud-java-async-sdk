// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserPermissionsRequest</p>
 */
public class DescribeUserPermissionsRequest extends Request {
    @Body
    @NameInMap("SubAccountUserId")
    @Validation(required = true)
    private String subAccountUserId;

    private DescribeUserPermissionsRequest(Builder builder) {
        super(builder);
        this.subAccountUserId = builder.subAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subAccountUserId
     */
    public String getSubAccountUserId() {
        return this.subAccountUserId;
    }

    public static final class Builder extends Request.Builder<DescribeUserPermissionsRequest, Builder> {
        private String subAccountUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserPermissionsRequest request) {
            super(request);
            this.subAccountUserId = request.subAccountUserId;
        } 

        /**
         * The ID of the RAM user or RAM role.
         */
        public Builder subAccountUserId(String subAccountUserId) {
            this.putBodyParameter("SubAccountUserId", subAccountUserId);
            this.subAccountUserId = subAccountUserId;
            return this;
        }

        @Override
        public DescribeUserPermissionsRequest build() {
            return new DescribeUserPermissionsRequest(this);
        } 

    } 

}
