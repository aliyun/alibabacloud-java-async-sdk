// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactRequest</p>
 */
public class DeleteAlertContactRequest extends Request {
    private DeleteAlertContactRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DeleteAlertContactRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactRequest request) {
            super(request);
        } 

        @Override
        public DeleteAlertContactRequest build() {
            return new DeleteAlertContactRequest(this);
        } 

    } 

}
