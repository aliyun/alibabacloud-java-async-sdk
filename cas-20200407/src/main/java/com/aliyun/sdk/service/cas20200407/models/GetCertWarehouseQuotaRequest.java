// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetCertWarehouseQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetCertWarehouseQuotaRequest</p>
 */
public class GetCertWarehouseQuotaRequest extends Request {
    private GetCertWarehouseQuotaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertWarehouseQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCertWarehouseQuotaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCertWarehouseQuotaRequest request) {
            super(request);
        } 

        @Override
        public GetCertWarehouseQuotaRequest build() {
            return new GetCertWarehouseQuotaRequest(this);
        } 

    } 

}
