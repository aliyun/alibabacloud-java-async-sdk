// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLensServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeLensServiceStatusRequest</p>
 */
public class DescribeLensServiceStatusRequest extends Request {
    private DescribeLensServiceStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLensServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeLensServiceStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeLensServiceStatusRequest request) {
            super(request);
        } 

        @Override
        public DescribeLensServiceStatusRequest build() {
            return new DescribeLensServiceStatusRequest(this);
        } 

    } 

}
