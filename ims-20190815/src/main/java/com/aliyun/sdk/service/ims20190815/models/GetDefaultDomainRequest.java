// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDefaultDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDefaultDomainRequest</p>
 */
public class GetDefaultDomainRequest extends Request {
    private GetDefaultDomainRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetDefaultDomainRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetDefaultDomainRequest response) {
            super(response);
        } 

        @Override
        public GetDefaultDomainRequest build() {
            return new GetDefaultDomainRequest(this);
        } 

    } 

}
