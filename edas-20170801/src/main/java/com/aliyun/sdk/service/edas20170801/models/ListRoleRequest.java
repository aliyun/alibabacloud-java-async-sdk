// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoleRequest} extends {@link RequestModel}
 *
 * <p>ListRoleRequest</p>
 */
public class ListRoleRequest extends Request {
    private ListRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRoleRequest request) {
            super(request);
        } 

        @Override
        public ListRoleRequest build() {
            return new ListRoleRequest(this);
        } 

    } 

}
