// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorityRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorityRequest</p>
 */
public class ListAuthorityRequest extends Request {
    private ListAuthorityRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAuthorityRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAuthorityRequest request) {
            super(request);
        } 

        @Override
        public ListAuthorityRequest build() {
            return new ListAuthorityRequest(this);
        } 

    } 

}
