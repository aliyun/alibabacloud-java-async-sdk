// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStressesRequest} extends {@link RequestModel}
 *
 * <p>ListStressesRequest</p>
 */
public class ListStressesRequest extends Request {
    private ListStressesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListStressesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListStressesRequest request) {
            super(request);
        } 

        @Override
        public ListStressesRequest build() {
            return new ListStressesRequest(this);
        } 

    } 

}
