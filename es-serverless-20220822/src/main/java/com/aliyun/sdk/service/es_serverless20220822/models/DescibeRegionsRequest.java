// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescibeRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescibeRegionsRequest</p>
 */
public class DescibeRegionsRequest extends Request {
    private DescibeRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescibeRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescibeRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescibeRegionsRequest request) {
            super(request);
        } 

        @Override
        public DescibeRegionsRequest build() {
            return new DescibeRegionsRequest(this);
        } 

    } 

}
