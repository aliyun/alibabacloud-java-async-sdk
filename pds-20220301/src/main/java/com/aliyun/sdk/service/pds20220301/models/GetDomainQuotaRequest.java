// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetDomainQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetDomainQuotaRequest</p>
 */
public class GetDomainQuotaRequest extends Request {
    private GetDomainQuotaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetDomainQuotaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetDomainQuotaRequest request) {
            super(request);
        } 

        @Override
        public GetDomainQuotaRequest build() {
            return new GetDomainQuotaRequest(this);
        } 

    } 

}
