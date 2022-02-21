// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcGrayRequest} extends {@link RequestModel}
 *
 * <p>UserGcGrayRequest</p>
 */
public class UserGcGrayRequest extends Request {
    private UserGcGrayRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserGcGrayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<UserGcGrayRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(UserGcGrayRequest response) {
            super(response);
        } 

        @Override
        public UserGcGrayRequest build() {
            return new UserGcGrayRequest(this);
        } 

    } 

}
