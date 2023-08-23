// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelationProductListRequest} extends {@link RequestModel}
 *
 * <p>GetRelationProductListRequest</p>
 */
public class GetRelationProductListRequest extends Request {
    private GetRelationProductListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRelationProductListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRelationProductListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRelationProductListRequest request) {
            super(request);
        } 

        @Override
        public GetRelationProductListRequest build() {
            return new GetRelationProductListRequest(this);
        } 

    } 

}
