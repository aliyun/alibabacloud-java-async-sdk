// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link GetReserveDomainUrlRequest} extends {@link RequestModel}
 *
 * <p>GetReserveDomainUrlRequest</p>
 */
public class GetReserveDomainUrlRequest extends Request {
    private GetReserveDomainUrlRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReserveDomainUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetReserveDomainUrlRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetReserveDomainUrlRequest request) {
            super(request);
        } 

        @Override
        public GetReserveDomainUrlRequest build() {
            return new GetReserveDomainUrlRequest(this);
        } 

    } 

}
