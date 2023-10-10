// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListComponentsRequest</p>
 */
public class ListComponentsRequest extends Request {
    private ListComponentsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListComponentsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListComponentsRequest request) {
            super(request);
        } 

        @Override
        public ListComponentsRequest build() {
            return new ListComponentsRequest(this);
        } 

    } 

}
