// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadTestRequest} extends {@link RequestModel}
 *
 * <p>RpcDataUploadTestRequest</p>
 */
public class RpcDataUploadTestRequest extends Request {
    private RpcDataUploadTestRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RpcDataUploadTestRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RpcDataUploadTestRequest request) {
            super(request);
        } 

        @Override
        public RpcDataUploadTestRequest build() {
            return new RpcDataUploadTestRequest(this);
        } 

    } 

}
