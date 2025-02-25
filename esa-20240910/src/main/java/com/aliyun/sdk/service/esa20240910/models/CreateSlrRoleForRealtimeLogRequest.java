// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateSlrRoleForRealtimeLogRequest} extends {@link RequestModel}
 *
 * <p>CreateSlrRoleForRealtimeLogRequest</p>
 */
public class CreateSlrRoleForRealtimeLogRequest extends Request {
    private CreateSlrRoleForRealtimeLogRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlrRoleForRealtimeLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateSlrRoleForRealtimeLogRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateSlrRoleForRealtimeLogRequest request) {
            super(request);
        } 

        @Override
        public CreateSlrRoleForRealtimeLogRequest build() {
            return new CreateSlrRoleForRealtimeLogRequest(this);
        } 

    } 

}
