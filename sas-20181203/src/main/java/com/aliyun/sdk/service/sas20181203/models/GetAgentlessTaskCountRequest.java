// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentlessTaskCountRequest} extends {@link RequestModel}
 *
 * <p>GetAgentlessTaskCountRequest</p>
 */
public class GetAgentlessTaskCountRequest extends Request {
    private GetAgentlessTaskCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAgentlessTaskCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAgentlessTaskCountRequest request) {
            super(request);
        } 

        @Override
        public GetAgentlessTaskCountRequest build() {
            return new GetAgentlessTaskCountRequest(this);
        } 

    } 

}
