// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcFetchRequest} extends {@link RequestModel}
 *
 * <p>UserGcFetchRequest</p>
 */
public class UserGcFetchRequest extends Request {
    private UserGcFetchRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserGcFetchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<UserGcFetchRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(UserGcFetchRequest response) {
            super(response);
        } 

        @Override
        public UserGcFetchRequest build() {
            return new UserGcFetchRequest(this);
        } 

    } 

}
