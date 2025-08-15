// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link RefreshUserSyncRequest} extends {@link RequestModel}
 *
 * <p>RefreshUserSyncRequest</p>
 */
public class RefreshUserSyncRequest extends Request {
    private RefreshUserSyncRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshUserSyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RefreshUserSyncRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RefreshUserSyncRequest request) {
            super(request);
        } 

        @Override
        public RefreshUserSyncRequest build() {
            return new RefreshUserSyncRequest(this);
        } 

    } 

}
