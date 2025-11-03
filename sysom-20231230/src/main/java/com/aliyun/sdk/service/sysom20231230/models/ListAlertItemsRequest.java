// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListAlertItemsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertItemsRequest</p>
 */
public class ListAlertItemsRequest extends Request {
    private ListAlertItemsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAlertItemsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAlertItemsRequest request) {
            super(request);
        } 

        @Override
        public ListAlertItemsRequest build() {
            return new ListAlertItemsRequest(this);
        } 

    } 

}
