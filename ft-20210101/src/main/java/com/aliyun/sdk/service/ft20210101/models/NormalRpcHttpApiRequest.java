// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NormalRpcHttpApiRequest} extends {@link RequestModel}
 *
 * <p>NormalRpcHttpApiRequest</p>
 */
public class NormalRpcHttpApiRequest extends Request {
    private NormalRpcHttpApiRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalRpcHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<NormalRpcHttpApiRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(NormalRpcHttpApiRequest request) {
            super(request);
        } 

        @Override
        public NormalRpcHttpApiRequest build() {
            return new NormalRpcHttpApiRequest(this);
        } 

    } 

}
