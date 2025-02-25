// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassignUserRequest} extends {@link RequestModel}
 *
 * <p>UnassignUserRequest</p>
 */
public class UnassignUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private UnassignUserRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassignUserRequest create() {
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

    public static final class Builder extends Request.Builder<UnassignUserRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UnassignUserRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UnassignUserRequest build() {
            return new UnassignUserRequest(this);
        } 

    } 

}
