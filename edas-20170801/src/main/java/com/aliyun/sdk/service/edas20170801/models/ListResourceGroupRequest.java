// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupRequest</p>
 */
public class ListResourceGroupRequest extends Request {
    private ListResourceGroupRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListResourceGroupRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupRequest request) {
            super(request);
        } 

        @Override
        public ListResourceGroupRequest build() {
            return new ListResourceGroupRequest(this);
        } 

    } 

}
