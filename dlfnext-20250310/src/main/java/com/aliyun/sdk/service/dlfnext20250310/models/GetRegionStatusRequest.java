// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetRegionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRegionStatusRequest</p>
 */
public class GetRegionStatusRequest extends Request {
    private GetRegionStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRegionStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRegionStatusRequest request) {
            super(request);
        } 

        @Override
        public GetRegionStatusRequest build() {
            return new GetRegionStatusRequest(this);
        } 

    } 

}
