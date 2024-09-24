// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeAuditLogRequest} extends {@link RequestModel}
 *
 * <p>InitializeAuditLogRequest</p>
 */
public class InitializeAuditLogRequest extends Request {
    private InitializeAuditLogRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeAuditLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<InitializeAuditLogRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(InitializeAuditLogRequest request) {
            super(request);
        } 

        @Override
        public InitializeAuditLogRequest build() {
            return new InitializeAuditLogRequest(this);
        } 

    } 

}
