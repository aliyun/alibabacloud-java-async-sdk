// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DisableAssociatedTransferRequest} extends {@link RequestModel}
 *
 * <p>DisableAssociatedTransferRequest</p>
 */
public class DisableAssociatedTransferRequest extends Request {
    private DisableAssociatedTransferRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAssociatedTransferRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DisableAssociatedTransferRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DisableAssociatedTransferRequest request) {
            super(request);
        } 

        @Override
        public DisableAssociatedTransferRequest build() {
            return new DisableAssociatedTransferRequest(this);
        } 

    } 

}
