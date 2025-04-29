// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyLensServiceRequest} extends {@link RequestModel}
 *
 * <p>ApplyLensServiceRequest</p>
 */
public class ApplyLensServiceRequest extends Request {
    private ApplyLensServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyLensServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ApplyLensServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ApplyLensServiceRequest request) {
            super(request);
        } 

        @Override
        public ApplyLensServiceRequest build() {
            return new ApplyLensServiceRequest(this);
        } 

    } 

}
