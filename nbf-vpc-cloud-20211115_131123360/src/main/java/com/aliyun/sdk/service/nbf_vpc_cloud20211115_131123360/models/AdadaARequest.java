// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdadaARequest} extends {@link RequestModel}
 *
 * <p>AdadaARequest</p>
 */
public class AdadaARequest extends Request {
    private AdadaARequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdadaARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<AdadaARequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(AdadaARequest request) {
            super(request);
        } 

        @Override
        public AdadaARequest build() {
            return new AdadaARequest(this);
        } 

    } 

}
