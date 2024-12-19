// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetCacheReserveSpecificationRequest} extends {@link RequestModel}
 *
 * <p>GetCacheReserveSpecificationRequest</p>
 */
public class GetCacheReserveSpecificationRequest extends Request {
    private GetCacheReserveSpecificationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCacheReserveSpecificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCacheReserveSpecificationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCacheReserveSpecificationRequest request) {
            super(request);
        } 

        @Override
        public GetCacheReserveSpecificationRequest build() {
            return new GetCacheReserveSpecificationRequest(this);
        } 

    } 

}
