// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupportRegionRequest</p>
 */
public class DescribeSupportRegionRequest extends Request {
    private DescribeSupportRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeSupportRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeSupportRegionRequest response) {
            super(response);
        } 

        @Override
        public DescribeSupportRegionRequest build() {
            return new DescribeSupportRegionRequest(this);
        } 

    } 

}
