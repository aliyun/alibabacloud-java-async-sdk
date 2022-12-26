// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRulesCountRequest} extends {@link RequestModel}
 *
 * <p>GetRulesCountRequest</p>
 */
public class GetRulesCountRequest extends Request {
    private GetRulesCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRulesCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRulesCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRulesCountRequest request) {
            super(request);
        } 

        @Override
        public GetRulesCountRequest build() {
            return new GetRulesCountRequest(this);
        } 

    } 

}
