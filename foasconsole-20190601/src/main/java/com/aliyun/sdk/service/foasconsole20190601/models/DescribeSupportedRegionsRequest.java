// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportedRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupportedRegionsRequest</p>
 */
public class DescribeSupportedRegionsRequest extends Request {
    private DescribeSupportedRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportedRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSupportedRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSupportedRegionsRequest response) {
            super(response);
        } 

        @Override
        public DescribeSupportedRegionsRequest build() {
            return new DescribeSupportedRegionsRequest(this);
        } 

    } 

}
