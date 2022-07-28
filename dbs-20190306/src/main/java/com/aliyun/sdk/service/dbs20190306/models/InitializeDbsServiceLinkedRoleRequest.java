// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeDbsServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>InitializeDbsServiceLinkedRoleRequest</p>
 */
public class InitializeDbsServiceLinkedRoleRequest extends Request {
    private InitializeDbsServiceLinkedRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeDbsServiceLinkedRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<InitializeDbsServiceLinkedRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(InitializeDbsServiceLinkedRoleRequest request) {
            super(request);
        } 

        @Override
        public InitializeDbsServiceLinkedRoleRequest build() {
            return new InitializeDbsServiceLinkedRoleRequest(this);
        } 

    } 

}
