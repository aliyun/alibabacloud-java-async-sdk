// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubAccountRequest} extends {@link RequestModel}
 *
 * <p>ListSubAccountRequest</p>
 */
public class ListSubAccountRequest extends Request {
    private ListSubAccountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSubAccountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSubAccountRequest request) {
            super(request);
        } 

        @Override
        public ListSubAccountRequest build() {
            return new ListSubAccountRequest(this);
        } 

    } 

}
