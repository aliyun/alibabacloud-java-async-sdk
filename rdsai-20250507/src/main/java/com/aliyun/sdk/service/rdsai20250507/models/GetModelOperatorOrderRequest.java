// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetModelOperatorOrderRequest} extends {@link RequestModel}
 *
 * <p>GetModelOperatorOrderRequest</p>
 */
public class GetModelOperatorOrderRequest extends Request {
    private GetModelOperatorOrderRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelOperatorOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetModelOperatorOrderRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetModelOperatorOrderRequest request) {
            super(request);
        } 

        @Override
        public GetModelOperatorOrderRequest build() {
            return new GetModelOperatorOrderRequest(this);
        } 

    } 

}
