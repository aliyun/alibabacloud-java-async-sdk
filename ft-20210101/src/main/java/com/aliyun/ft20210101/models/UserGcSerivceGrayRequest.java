// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcSerivceGrayRequest} extends {@link RequestModel}
 *
 * <p>UserGcSerivceGrayRequest</p>
 */
public class UserGcSerivceGrayRequest extends Request {
    private UserGcSerivceGrayRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserGcSerivceGrayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<UserGcSerivceGrayRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(UserGcSerivceGrayRequest response) {
            super(response);
        } 

        @Override
        public UserGcSerivceGrayRequest build() {
            return new UserGcSerivceGrayRequest(this);
        } 

    } 

}
