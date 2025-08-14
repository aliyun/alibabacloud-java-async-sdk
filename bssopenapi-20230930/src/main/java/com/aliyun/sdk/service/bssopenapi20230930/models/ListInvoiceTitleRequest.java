// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInvoiceTitleRequest} extends {@link RequestModel}
 *
 * <p>ListInvoiceTitleRequest</p>
 */
public class ListInvoiceTitleRequest extends Request {
    private ListInvoiceTitleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvoiceTitleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListInvoiceTitleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListInvoiceTitleRequest request) {
            super(request);
        } 

        @Override
        public ListInvoiceTitleRequest build() {
            return new ListInvoiceTitleRequest(this);
        } 

    } 

}
