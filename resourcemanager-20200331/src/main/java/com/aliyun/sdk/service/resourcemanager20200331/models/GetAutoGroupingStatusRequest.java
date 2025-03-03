// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetAutoGroupingStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAutoGroupingStatusRequest</p>
 */
public class GetAutoGroupingStatusRequest extends Request {
    private GetAutoGroupingStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoGroupingStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAutoGroupingStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAutoGroupingStatusRequest request) {
            super(request);
        } 

        @Override
        public GetAutoGroupingStatusRequest build() {
            return new GetAutoGroupingStatusRequest(this);
        } 

    } 

}
