// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetDefenceCountRequest} extends {@link RequestModel}
 *
 * <p>GetDefenceCountRequest</p>
 */
public class GetDefenceCountRequest extends Request {
    private GetDefenceCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefenceCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetDefenceCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetDefenceCountRequest request) {
            super(request);
        } 

        @Override
        public GetDefenceCountRequest build() {
            return new GetDefenceCountRequest(this);
        } 

    } 

}
