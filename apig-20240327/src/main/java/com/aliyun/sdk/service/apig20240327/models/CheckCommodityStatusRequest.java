// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CheckCommodityStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckCommodityStatusRequest</p>
 */
public class CheckCommodityStatusRequest extends Request {
    private CheckCommodityStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCommodityStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckCommodityStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckCommodityStatusRequest request) {
            super(request);
        } 

        @Override
        public CheckCommodityStatusRequest build() {
            return new CheckCommodityStatusRequest(this);
        } 

    } 

}
