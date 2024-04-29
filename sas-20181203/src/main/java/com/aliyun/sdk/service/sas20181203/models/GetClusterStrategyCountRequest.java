// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterStrategyCountRequest} extends {@link RequestModel}
 *
 * <p>GetClusterStrategyCountRequest</p>
 */
public class GetClusterStrategyCountRequest extends Request {
    private GetClusterStrategyCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterStrategyCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetClusterStrategyCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetClusterStrategyCountRequest request) {
            super(request);
        } 

        @Override
        public GetClusterStrategyCountRequest build() {
            return new GetClusterStrategyCountRequest(this);
        } 

    } 

}
