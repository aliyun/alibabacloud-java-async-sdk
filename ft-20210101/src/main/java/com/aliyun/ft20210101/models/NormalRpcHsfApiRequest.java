// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NormalRpcHsfApiRequest} extends {@link RequestModel}
 *
 * <p>NormalRpcHsfApiRequest</p>
 */
public class NormalRpcHsfApiRequest extends Request {
    private NormalRpcHsfApiRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalRpcHsfApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<NormalRpcHsfApiRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(NormalRpcHsfApiRequest response) {
            super(response);
        } 

        @Override
        public NormalRpcHsfApiRequest build() {
            return new NormalRpcHsfApiRequest(this);
        } 

    } 

}
