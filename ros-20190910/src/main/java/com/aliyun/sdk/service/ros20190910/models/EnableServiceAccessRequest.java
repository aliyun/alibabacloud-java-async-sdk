// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link EnableServiceAccessRequest} extends {@link RequestModel}
 *
 * <p>EnableServiceAccessRequest</p>
 */
public class EnableServiceAccessRequest extends Request {
    private EnableServiceAccessRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServiceAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<EnableServiceAccessRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(EnableServiceAccessRequest request) {
            super(request);
        } 

        @Override
        public EnableServiceAccessRequest build() {
            return new EnableServiceAccessRequest(this);
        } 

    } 

}
