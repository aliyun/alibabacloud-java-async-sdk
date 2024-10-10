// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRdTreeRequest} extends {@link RequestModel}
 *
 * <p>GetRdTreeRequest</p>
 */
public class GetRdTreeRequest extends Request {
    private GetRdTreeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRdTreeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRdTreeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRdTreeRequest request) {
            super(request);
        } 

        @Override
        public GetRdTreeRequest build() {
            return new GetRdTreeRequest(this);
        } 

    } 

}
