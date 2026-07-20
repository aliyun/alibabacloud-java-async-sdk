// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link UpdateSecurityCheckResultRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityCheckResultRequest</p>
 */
public class UpdateSecurityCheckResultRequest extends Request {
    private UpdateSecurityCheckResultRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityCheckResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<UpdateSecurityCheckResultRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityCheckResultRequest request) {
            super(request);
        } 

        @Override
        public UpdateSecurityCheckResultRequest build() {
            return new UpdateSecurityCheckResultRequest(this);
        } 

    } 

}
