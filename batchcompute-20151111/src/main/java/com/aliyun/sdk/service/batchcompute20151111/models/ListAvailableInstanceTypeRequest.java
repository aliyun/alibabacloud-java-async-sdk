// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableInstanceTypeRequest</p>
 */
public class ListAvailableInstanceTypeRequest extends Request {
    private ListAvailableInstanceTypeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableInstanceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAvailableInstanceTypeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAvailableInstanceTypeRequest response) {
            super(response);
        } 

        @Override
        public ListAvailableInstanceTypeRequest build() {
            return new ListAvailableInstanceTypeRequest(this);
        } 

    } 

}
