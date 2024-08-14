// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelLensServiceRequest} extends {@link RequestModel}
 *
 * <p>CancelLensServiceRequest</p>
 */
public class CancelLensServiceRequest extends Request {
    private CancelLensServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelLensServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CancelLensServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CancelLensServiceRequest request) {
            super(request);
        } 

        @Override
        public CancelLensServiceRequest build() {
            return new CancelLensServiceRequest(this);
        } 

    } 

}
