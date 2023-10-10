// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcRequest} extends {@link RequestModel}
 *
 * <p>ListVpcRequest</p>
 */
public class ListVpcRequest extends Request {
    private ListVpcRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListVpcRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListVpcRequest request) {
            super(request);
        } 

        @Override
        public ListVpcRequest build() {
            return new ListVpcRequest(this);
        } 

    } 

}
