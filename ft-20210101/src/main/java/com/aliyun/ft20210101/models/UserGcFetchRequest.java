// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder<Builder> {

        public UserGcFetchRequest build() {
            return new UserGcFetchRequest(this);
        } 

    } 

}
