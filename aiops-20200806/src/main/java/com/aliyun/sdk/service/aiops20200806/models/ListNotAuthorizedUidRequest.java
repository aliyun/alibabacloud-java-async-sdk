// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotAuthorizedUidRequest} extends {@link RequestModel}
 *
 * <p>ListNotAuthorizedUidRequest</p>
 */
public class ListNotAuthorizedUidRequest extends Request {
    private ListNotAuthorizedUidRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotAuthorizedUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListNotAuthorizedUidRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListNotAuthorizedUidRequest request) {
            super(request);
        } 

        @Override
        public ListNotAuthorizedUidRequest build() {
            return new ListNotAuthorizedUidRequest(this);
        } 

    } 

}
