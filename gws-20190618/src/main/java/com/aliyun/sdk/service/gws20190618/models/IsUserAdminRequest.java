// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsUserAdminRequest} extends {@link RequestModel}
 *
 * <p>IsUserAdminRequest</p>
 */
public class IsUserAdminRequest extends Request {
    private IsUserAdminRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsUserAdminRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<IsUserAdminRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(IsUserAdminRequest response) {
            super(response);
        } 

        @Override
        public IsUserAdminRequest build() {
            return new IsUserAdminRequest(this);
        } 

    } 

}
