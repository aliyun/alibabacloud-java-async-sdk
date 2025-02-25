// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSetStsAKRequest} extends {@link RequestModel}
 *
 * <p>GetDataSetStsAKRequest</p>
 */
public class GetDataSetStsAKRequest extends Request {
    private GetDataSetStsAKRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSetStsAKRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetDataSetStsAKRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetDataSetStsAKRequest request) {
            super(request);
        } 

        @Override
        public GetDataSetStsAKRequest build() {
            return new GetDataSetStsAKRequest(this);
        } 

    } 

}
