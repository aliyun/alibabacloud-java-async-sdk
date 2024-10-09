// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloseBdrcServiceRequest} extends {@link RequestModel}
 *
 * <p>CloseBdrcServiceRequest</p>
 */
public class CloseBdrcServiceRequest extends Request {
    private CloseBdrcServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseBdrcServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CloseBdrcServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CloseBdrcServiceRequest request) {
            super(request);
        } 

        @Override
        public CloseBdrcServiceRequest build() {
            return new CloseBdrcServiceRequest(this);
        } 

    } 

}
