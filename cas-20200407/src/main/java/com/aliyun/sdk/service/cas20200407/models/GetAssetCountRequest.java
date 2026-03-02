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
 * {@link GetAssetCountRequest} extends {@link RequestModel}
 *
 * <p>GetAssetCountRequest</p>
 */
public class GetAssetCountRequest extends Request {
    private GetAssetCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAssetCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAssetCountRequest request) {
            super(request);
        } 

        @Override
        public GetAssetCountRequest build() {
            return new GetAssetCountRequest(this);
        } 

    } 

}
