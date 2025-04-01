// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link DisableMultiAccountResourceCenterRequest} extends {@link RequestModel}
 *
 * <p>DisableMultiAccountResourceCenterRequest</p>
 */
public class DisableMultiAccountResourceCenterRequest extends Request {
    private DisableMultiAccountResourceCenterRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableMultiAccountResourceCenterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DisableMultiAccountResourceCenterRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DisableMultiAccountResourceCenterRequest request) {
            super(request);
        } 

        @Override
        public DisableMultiAccountResourceCenterRequest build() {
            return new DisableMultiAccountResourceCenterRequest(this);
        } 

    } 

}
