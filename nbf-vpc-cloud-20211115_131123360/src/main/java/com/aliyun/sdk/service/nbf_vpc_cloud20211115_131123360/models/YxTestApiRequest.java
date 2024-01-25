// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link YxTestApiRequest} extends {@link RequestModel}
 *
 * <p>YxTestApiRequest</p>
 */
public class YxTestApiRequest extends Request {
    private YxTestApiRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static YxTestApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<YxTestApiRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(YxTestApiRequest request) {
            super(request);
        } 

        @Override
        public YxTestApiRequest build() {
            return new YxTestApiRequest(this);
        } 

    } 

}
