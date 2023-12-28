// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDefaultQuotaRequest} extends {@link RequestModel}
 *
 * <p>ListDefaultQuotaRequest</p>
 */
public class ListDefaultQuotaRequest extends Request {
    private ListDefaultQuotaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDefaultQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDefaultQuotaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDefaultQuotaRequest request) {
            super(request);
        } 

        @Override
        public ListDefaultQuotaRequest build() {
            return new ListDefaultQuotaRequest(this);
        } 

    } 

}
