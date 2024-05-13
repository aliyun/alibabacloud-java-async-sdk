// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserPermissionsRequest</p>
 */
public class DescribeUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DescribeUserPermissionsRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeUserPermissionsRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserPermissionsRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * The ID of the RAM user that you want to query.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeUserPermissionsRequest build() {
            return new DescribeUserPermissionsRequest(this);
        } 

    } 

}
