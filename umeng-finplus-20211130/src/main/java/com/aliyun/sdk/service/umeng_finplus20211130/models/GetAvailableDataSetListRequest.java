// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailableDataSetListRequest} extends {@link RequestModel}
 *
 * <p>GetAvailableDataSetListRequest</p>
 */
public class GetAvailableDataSetListRequest extends Request {
    private GetAvailableDataSetListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailableDataSetListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAvailableDataSetListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAvailableDataSetListRequest request) {
            super(request);
        } 

        @Override
        public GetAvailableDataSetListRequest build() {
            return new GetAvailableDataSetListRequest(this);
        } 

    } 

}
