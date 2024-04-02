// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditUserConfRequest} extends {@link RequestModel}
 *
 * <p>GetAuditUserConfRequest</p>
 */
public class GetAuditUserConfRequest extends Request {
    private GetAuditUserConfRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditUserConfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAuditUserConfRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAuditUserConfRequest request) {
            super(request);
        } 

        @Override
        public GetAuditUserConfRequest build() {
            return new GetAuditUserConfRequest(this);
        } 

    } 

}
