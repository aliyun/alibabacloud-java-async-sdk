// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link GetXtraceTokenRequest} extends {@link RequestModel}
 *
 * <p>GetXtraceTokenRequest</p>
 */
public class GetXtraceTokenRequest extends Request {
    private GetXtraceTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetXtraceTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetXtraceTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetXtraceTokenRequest request) {
            super(request);
        } 

        @Override
        public GetXtraceTokenRequest build() {
            return new GetXtraceTokenRequest(this);
        } 

    } 

}
