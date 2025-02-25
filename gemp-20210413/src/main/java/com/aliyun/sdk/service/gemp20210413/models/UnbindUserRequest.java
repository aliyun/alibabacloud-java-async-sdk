// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindUserRequest} extends {@link RequestModel}
 *
 * <p>UnbindUserRequest</p>
 */
public class UnbindUserRequest extends Request {
    private UnbindUserRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<UnbindUserRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(UnbindUserRequest request) {
            super(request);
        } 

        @Override
        public UnbindUserRequest build() {
            return new UnbindUserRequest(this);
        } 

    } 

}
