// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizedUidRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizedUidRequest</p>
 */
public class ListAuthorizedUidRequest extends Request {
    private ListAuthorizedUidRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAuthorizedUidRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizedUidRequest request) {
            super(request);
        } 

        @Override
        public ListAuthorizedUidRequest build() {
            return new ListAuthorizedUidRequest(this);
        } 

    } 

}
