// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link EnableCrossAccountManagementRequest} extends {@link RequestModel}
 *
 * <p>EnableCrossAccountManagementRequest</p>
 */
public class EnableCrossAccountManagementRequest extends Request {
    private EnableCrossAccountManagementRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCrossAccountManagementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableCrossAccountManagementRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableCrossAccountManagementRequest request) {
            super(request);
        } 

        @Override
        public EnableCrossAccountManagementRequest build() {
            return new EnableCrossAccountManagementRequest(this);
        } 

    } 

}
