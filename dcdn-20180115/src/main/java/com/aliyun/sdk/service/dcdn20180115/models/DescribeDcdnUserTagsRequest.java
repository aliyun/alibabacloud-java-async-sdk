// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserTagsRequest</p>
 */
public class DescribeDcdnUserTagsRequest extends Request {
    private DescribeDcdnUserTagsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnUserTagsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserTagsRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnUserTagsRequest build() {
            return new DescribeDcdnUserTagsRequest(this);
        } 

    } 

}
