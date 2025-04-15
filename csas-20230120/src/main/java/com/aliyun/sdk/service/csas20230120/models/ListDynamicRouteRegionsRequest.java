// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDynamicRouteRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListDynamicRouteRegionsRequest</p>
 */
public class ListDynamicRouteRegionsRequest extends Request {
    private ListDynamicRouteRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicRouteRegionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListDynamicRouteRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListDynamicRouteRegionsRequest request) {
            super(request);
        } 

        @Override
        public ListDynamicRouteRegionsRequest build() {
            return new ListDynamicRouteRegionsRequest(this);
        } 

    } 

}
