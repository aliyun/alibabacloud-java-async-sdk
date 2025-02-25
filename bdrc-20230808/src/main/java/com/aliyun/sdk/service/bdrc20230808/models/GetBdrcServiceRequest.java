// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBdrcServiceRequest} extends {@link RequestModel}
 *
 * <p>GetBdrcServiceRequest</p>
 */
public class GetBdrcServiceRequest extends Request {
    private GetBdrcServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBdrcServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetBdrcServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetBdrcServiceRequest request) {
            super(request);
        } 

        @Override
        public GetBdrcServiceRequest build() {
            return new GetBdrcServiceRequest(this);
        } 

    } 

}
