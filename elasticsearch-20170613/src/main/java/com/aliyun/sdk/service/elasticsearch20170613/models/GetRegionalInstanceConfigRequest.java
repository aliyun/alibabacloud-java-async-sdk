// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionalInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>GetRegionalInstanceConfigRequest</p>
 */
public class GetRegionalInstanceConfigRequest extends Request {
    private GetRegionalInstanceConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionalInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRegionalInstanceConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRegionalInstanceConfigRequest request) {
            super(request);
        } 

        @Override
        public GetRegionalInstanceConfigRequest build() {
            return new GetRegionalInstanceConfigRequest(this);
        } 

    } 

}
