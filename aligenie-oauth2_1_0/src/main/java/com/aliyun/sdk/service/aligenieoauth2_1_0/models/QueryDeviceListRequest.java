// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link QueryDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceListRequest</p>
 */
public class QueryDeviceListRequest extends Request {
    private QueryDeviceListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryDeviceListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceListRequest request) {
            super(request);
        } 

        @Override
        public QueryDeviceListRequest build() {
            return new QueryDeviceListRequest(this);
        } 

    } 

}
