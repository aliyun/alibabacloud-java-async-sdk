// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMQRoleAssumptionAuthorityRequest} extends {@link RequestModel}
 *
 * <p>CheckMQRoleAssumptionAuthorityRequest</p>
 */
public class CheckMQRoleAssumptionAuthorityRequest extends Request {
    private CheckMQRoleAssumptionAuthorityRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMQRoleAssumptionAuthorityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckMQRoleAssumptionAuthorityRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckMQRoleAssumptionAuthorityRequest request) {
            super(request);
        } 

        @Override
        public CheckMQRoleAssumptionAuthorityRequest build() {
            return new CheckMQRoleAssumptionAuthorityRequest(this);
        } 

    } 

}
