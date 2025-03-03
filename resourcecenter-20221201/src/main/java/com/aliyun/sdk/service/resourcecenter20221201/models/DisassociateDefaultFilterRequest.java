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
 * {@link DisassociateDefaultFilterRequest} extends {@link RequestModel}
 *
 * <p>DisassociateDefaultFilterRequest</p>
 */
public class DisassociateDefaultFilterRequest extends Request {
    private DisassociateDefaultFilterRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateDefaultFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DisassociateDefaultFilterRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DisassociateDefaultFilterRequest request) {
            super(request);
        } 

        @Override
        public DisassociateDefaultFilterRequest build() {
            return new DisassociateDefaultFilterRequest(this);
        } 

    } 

}
