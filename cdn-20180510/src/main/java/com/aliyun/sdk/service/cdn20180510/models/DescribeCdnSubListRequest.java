// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSubListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnSubListRequest</p>
 */
public class DescribeCdnSubListRequest extends Request {
    private DescribeCdnSubListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSubListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCdnSubListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnSubListRequest request) {
            super(request);
        } 

        @Override
        public DescribeCdnSubListRequest build() {
            return new DescribeCdnSubListRequest(this);
        } 

    } 

}
